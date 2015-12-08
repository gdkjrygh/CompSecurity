// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.pin;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.api.model.AggregatedPinData;
import com.pinterest.api.model.BuyableProduct;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Place;
import com.pinterest.base.Colors;
import com.pinterest.base.Constants;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.kit.utils.AggregatedPinUtils;
import com.pinterest.kit.utils.NumberUtils;
import com.pinterest.ui.grid.CachableRoundedBitmap;
import com.pinterest.ui.text.AtMentionSpan;
import com.pinterest.ui.text.HashTag;
import com.pinterest.ui.text.HashTagUtils;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.ui.grid.pin:
//            PinCellDrawable

public class PinInfoDrawable extends PinCellDrawable
{

    public static final int ICON_PADDING;
    public static final int MAX_DESCRIPTION_LINES = Resources.integer(0x7f0d0022).intValue();
    public static final int SOURCE_PADDING;
    private boolean _clickable;
    private Pin _pin;
    private boolean _renderHashtag;
    private boolean _renderLargePin;
    private boolean _renderSocial;
    private ArrayList _spanWords;
    private StaticLayout buyablePinPriceLayout;
    private TextPaint buyablePinPricePaint;
    private float buyablePinPriceSize;
    private String commentCount;
    private Bitmap commentIcon;
    private LimitedLayout descLayout;
    private TextPaint descPaint;
    private float descSize;
    private String description;
    private boolean hasBuyableProduct;
    private boolean hasChangedDescription;
    private boolean hasCounts;
    private boolean hasDescription;
    private boolean hasPlaceData;
    private boolean hasRichData;
    private boolean hasSeoDescription;
    private int iconRowOffset;
    private String likeCount;
    private Bitmap likeIcon;
    private TextPaint metaPaint;
    private float metaSize;
    private String repinCount;
    private Bitmap repinIcon;
    private StaticLayout richPinTitleLayout;
    private TextPaint richPinTitlePaint;
    private float richPinTitleSize;
    private String seoDescription;
    private CachableRoundedBitmap siteIcon;
    private String siteName;

    public PinInfoDrawable(View view)
    {
        description = "";
        seoDescription = "";
        _renderSocial = true;
        _renderLargePin = false;
        _clickable = false;
        _renderHashtag = false;
        repinIcon = ((BitmapDrawable)Resources.drawable(0x7f0201ea)).getBitmap();
        likeIcon = ((BitmapDrawable)Resources.drawable(0x7f0201c3)).getBitmap();
        commentIcon = ((BitmapDrawable)Resources.drawable(0x7f020172)).getBitmap();
        iconRowOffset = likeIcon.getHeight() + DP4;
        descSize = Resources.dimension(0x7f0a01e0);
        descPaint = new TextPaint(1);
        descPaint.setColor(Colors.TEXT_DARK);
        descPaint.setTextSize(descSize);
        descPaint.setStyle(android.graphics.Paint.Style.FILL);
        descPaint.setTypeface(Typeface.DEFAULT);
        metaSize = Resources.dimension(0x7f0a01e0);
        metaPaint = new TextPaint(1);
        metaPaint.setColor(Colors.TEXT_LIGHT);
        metaPaint.setTextSize(metaSize);
        metaPaint.setStyle(android.graphics.Paint.Style.FILL);
        metaPaint.setTypeface(Typeface.DEFAULT);
        buyablePinPriceSize = Resources.dimension(0x7f0a01d9);
        buyablePinPricePaint = new TextPaint(1);
        buyablePinPricePaint.setColor(Resources.color(0x7f0e0026));
        buyablePinPricePaint.setStyle(android.graphics.Paint.Style.FILL);
        buyablePinPricePaint.setTypeface(Typeface.DEFAULT_BOLD);
        richPinTitleSize = Resources.dimension(0x7f0a01d9);
        richPinTitlePaint = new TextPaint(1);
        richPinTitlePaint.setColor(Colors.TEXT_DARK);
        richPinTitlePaint.setStyle(android.graphics.Paint.Style.FILL);
        richPinTitlePaint.setTypeface(Typeface.DEFAULT_BOLD);
        siteIcon = new CachableRoundedBitmap(view);
    }

    private CharSequence getSpannable(String s, boolean flag)
    {
        if (!_renderHashtag || !_pin.hasHashtag())
        {
            _clickable = false;
            return s;
        }
        _clickable = true;
        if (!flag)
        {
            return _pin.getSpannable();
        }
        if (_pin.getSpannableShort() != null)
        {
            return _pin.getSpannableShort();
        }
        SpannableString spannablestring = new SpannableString(s);
        ArrayList arraylist = HashTagUtils.getSpans(s, '#');
        s = HashTagUtils.getSpans(s, '@');
        if (arraylist.size() > 0 || s.size() > 0)
        {
            HashTagUtils.setSpans(spannablestring, arraylist, com/pinterest/ui/text/HashTag);
            HashTagUtils.setSpans(spannablestring, s, com/pinterest/ui/text/AtMentionSpan);
        }
        _pin.setSpannableShort(spannablestring);
        return spannablestring;
    }

    private void updateDescriptionLayout(String s, boolean flag)
    {
        do
        {
            float f;
            if (_renderLargePin)
            {
                f = Constants.TEXT_BODY;
            } else
            {
                f = Constants.TEXT_GRID_CAPTION;
            }
            descSize = f;
            descPaint.setTextSize(descSize);
            descLayout = new LimitedLayout(getSpannable(s, flag), descPaint, Math.max(50, width - padding.left - padding.right), android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, Math.round((double)descSize * 0.33000000000000002D), false);
            if (!flag && descLayout.getActualLineCount() > descLayout.getLineCount())
            {
                int i = Math.min(description.length(), descLayout.getLineStart(descLayout.getLineCount()) - 3);
                description = description.substring(0, i);
                description = StringUtils.removeEnd(description, ".");
                description = StringUtils.removeEnd(description, ",");
                description = StringUtils.removeEnd(description, " ");
                description = (new StringBuilder()).append(description).append("\u2026").toString();
                s = description;
                flag = true;
            } else
            {
                return;
            }
        } while (true);
    }

    public void draw(Canvas canvas)
    {
        int i;
label0:
        {
            if (pressed)
            {
                canvas.drawRect(getBounds(), touchPaint);
            }
            int j = y;
            i = j;
            if (hasBuyableProduct)
            {
                i = j + padding.top;
                canvas.save();
                canvas.translate(padding.left, i);
                buyablePinPriceLayout.draw(canvas);
                canvas.restore();
                i += buyablePinPriceLayout.getHeight();
            }
            if (!hasBuyableProduct && !hasRichData)
            {
                j = i;
                if (!hasPlaceData)
                {
                    break label0;
                }
            }
            j = i;
            if (!hasBuyableProduct)
            {
                j = i + padding.top;
            }
            canvas.save();
            canvas.translate(padding.left, j);
            richPinTitleLayout.draw(canvas);
            canvas.restore();
            i = richPinTitleLayout.getHeight();
            j = SOURCE_PADDING + (j + i);
            int i1;
            if (siteIcon.bitmap != null)
            {
                i = padding.left + iconRowOffset + ICON_PADDING;
                sharedMatrix.reset();
                float f = (float)DP11 / (float)siteIcon.bitmap.getWidth();
                sharedMatrix.postScale(f, f, 0.0F, 0.0F);
                sharedMatrix.postTranslate(padding.left, j);
                canvas.drawBitmap(siteIcon.bitmap, sharedMatrix, blankPaint);
            } else
            {
                i = padding.left;
            }
            canvas.drawText(ellipsize(siteName, metaPaint, width - ((padding.left + i) - DP1)), i, ((float)j + metaSize) - (float)DP1, metaPaint);
            j = iconRowOffset + j;
        }
        i = j;
        if (hasDescription)
        {
            if (hasBuyableProduct || hasRichData || hasPlaceData)
            {
                i = SOURCE_PADDING;
            } else
            {
                i = padding.top;
            }
            i = j + i;
            canvas.save();
            canvas.translate(padding.left, i);
            descLayout.draw(canvas);
            canvas.restore();
            i += descLayout.getHeight();
        }
        if (hasCounts && _renderSocial)
        {
            int l = padding.left;
            int k;
            if (hasBuyableProduct || hasDescription || hasRichData || hasPlaceData)
            {
                k = ICON_PADDING;
            } else
            {
                k = padding.top;
            }
            i1 = (i + k) - DP1;
            if (repinCount != null)
            {
                canvas.drawBitmap(repinIcon, l, DP2 + i1, iconPaint);
                i = repinIcon.getWidth() + ICON_PADDING + l;
                canvas.drawText(repinCount, i, (float)i1 + metaSize, metaPaint);
                i = (int)((float)i + (metaPaint.measureText(repinCount) + (float)PADDING_IMAGE));
            } else
            {
                i = l;
            }
            k = i;
            if (likeCount != null)
            {
                canvas.drawBitmap(likeIcon, i, DP2 + i1, iconPaint);
                i += likeIcon.getWidth() + ICON_PADDING;
                canvas.drawText(likeCount, i, (float)i1 + metaSize, metaPaint);
                k = (int)((float)i + (metaPaint.measureText(likeCount) + (float)PADDING_IMAGE));
            }
            if (commentCount != null)
            {
                canvas.drawBitmap(commentIcon, k, DP2 + i1, iconPaint);
                i = commentIcon.getWidth();
                l = ICON_PADDING;
                canvas.drawText(commentCount, k + (i + l), (float)i1 + metaSize, metaPaint);
                metaPaint.measureText(commentCount);
            }
        }
    }

    public String getDescription()
    {
        return description;
    }

    public int getPriceHeight()
    {
        return buyablePinPriceLayout.getHeight();
    }

    public boolean isClickable()
    {
        return _clickable;
    }

    public void loadSiteIcon(String s)
    {
        if (siteIcon.bitmap == null || !siteIcon.getUrl().equals(s))
        {
            ImageCache.loadImage(siteIcon, s);
        }
    }

    public void measure()
    {
        int i;
label0:
        {
            int j = 0;
            updateDescriptionLayout(description, false);
            if (hasBuyableProduct)
            {
                updateBuyablePinLayout();
                j = buyablePinPriceLayout.getHeight() + 0;
            }
            if (!hasBuyableProduct && !hasRichData)
            {
                i = j;
                if (!hasPlaceData)
                {
                    break label0;
                }
            }
            updateRichPinTitleLayout();
            i = j + richPinTitleLayout.getHeight() + (iconRowOffset + SOURCE_PADDING);
        }
        int k;
label1:
        {
label2:
            {
                k = i;
                if (!hasDescription)
                {
                    break label1;
                }
                if (!hasBuyableProduct && !hasRichData)
                {
                    k = i;
                    if (!hasPlaceData)
                    {
                        break label2;
                    }
                }
                k = i + SOURCE_PADDING;
            }
            k += descLayout.getHeight();
        }
label3:
        {
label4:
            {
                i = k;
                if (!hasCounts)
                {
                    break label3;
                }
                i = k;
                if (!_renderSocial)
                {
                    break label3;
                }
                if (!hasDescription && !hasRichData)
                {
                    i = k;
                    if (!hasPlaceData)
                    {
                        break label4;
                    }
                }
                i = k + ICON_PADDING;
            }
            i += iconRowOffset;
        }
        k = i;
        if (i != 0)
        {
            k = i + (padding.top + padding.bottom);
        }
        setHeight(k);
    }

    public void prepareForReuse()
    {
        super.prepareForReuse();
        siteIcon.bitmap = null;
    }

    public void setPin(Pin pin)
    {
        boolean flag;
        flag = true;
        if (pin == null)
        {
            return;
        }
        _pin = pin;
        Object obj;
        boolean flag1;
        if (pin.getLikeCountDisplay() != 0)
        {
            obj = String.valueOf(pin.getLikeCountDisplay());
        } else
        {
            obj = null;
        }
        likeCount = ((String) (obj));
        obj = pin.getAggregatedPinData();
        if (obj != null)
        {
            repinCount = NumberUtils.getFormattedNumber(((AggregatedPinData) (obj)).getSaveCountDisplay());
            if (((AggregatedPinData) (obj)).getLikeCountDisplay() != 0)
            {
                obj = NumberUtils.getFormattedNumber(((AggregatedPinData) (obj)).getLikeCountDisplay());
            } else
            {
                obj = null;
            }
            likeCount = ((String) (obj));
        } else
        {
            if (pin.getRepinCountDisplay() != 0)
            {
                obj = String.valueOf(pin.getRepinCountDisplay());
            } else
            {
                obj = null;
            }
            repinCount = ((String) (obj));
        }
        if (pin.getCommentCountDisplay() != 0)
        {
            obj = String.valueOf(pin.getCommentCountDisplay());
        } else
        {
            obj = null;
        }
        commentCount = ((String) (obj));
        if (Experiments.P())
        {
            commentCount = null;
        }
        if (likeCount != null || repinCount != null || commentCount != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        hasCounts = flag1;
        hasPlaceData = pin.hasPlaceGridData();
        if (hasPlaceData)
        {
            siteName = pin.getPlace().getSourceName();
        }
        hasRichData = pin.hasRichPinGridData();
        if (hasRichData)
        {
            siteName = pin.getRichSiteName();
        }
        if (StringUtils.isNotBlank(pin.getSeoDescription()) && Experiments.P())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        hasSeoDescription = flag1;
        hasChangedDescription = AggregatedPinUtils.hasUserChangedDescription(pin);
        if (hasSeoDescription)
        {
            seoDescription = pin.getSeoDescription();
        }
        hasBuyableProduct = BuyableProductHelper.isPinBuyable(pin);
        if (hasBuyableProduct)
        {
            siteName = pin.getBuyableProduct().getMerchantName();
        }
        if (!hasBuyableProduct || Experiments.P()) goto _L2; else goto _L1
_L1:
        description = StringUtils.defaultString(pin.getBuyableProduct().getShortDescription());
        hasDescription = StringUtils.isNotEmpty(pin.getBuyableProduct().getShortDescription());
_L4:
        updateDescriptionLayout(description, false);
        return;
_L2:
        if (!hasChangedDescription)
        {
            boolean flag2 = hasSeoDescription;
            if (hasRichData)
            {
                flag = false;
            }
            if (flag2 & flag)
            {
                description = seoDescription;
                hasDescription = StringUtils.isNotEmpty(pin.getSeoDescription());
                continue; /* Loop/switch isn't completed */
            }
            if (Experiments.P())
            {
                hasDescription = false;
                continue; /* Loop/switch isn't completed */
            }
        }
        description = StringUtils.defaultString(pin.getDescription());
        hasDescription = StringUtils.isNotEmpty(pin.getCleanDescription());
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setRenderHashtag(boolean flag)
    {
        _renderHashtag = flag;
    }

    public void setRenderLargePin(boolean flag)
    {
        _renderLargePin = flag;
    }

    public void setRenderSocial(boolean flag)
    {
        _renderSocial = flag;
    }

    public void updateBuyablePinLayout()
    {
        buyablePinPricePaint.setTextSize(buyablePinPriceSize);
        String s = BuyableProductHelper.getPriceDisplay(_pin.getBuyableProduct());
        if (!BuyableProductHelper.isPinAvailable(_pin))
        {
            buyablePinPricePaint.setColor(Colors.TEXT_DARK);
        }
        buyablePinPriceLayout = new StaticLayout(new SpannableString(s), buyablePinPricePaint, Math.max(50, width - padding.left - padding.right), android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 1.0F, false);
    }

    public void updateRichPinTitleLayout()
    {
        String s;
        richPinTitlePaint.setTextSize(richPinTitleSize);
        s = "";
        if (!hasBuyableProduct) goto _L2; else goto _L1
_L1:
        s = _pin.getBuyableProduct().getTitle();
_L4:
        richPinTitleLayout = new StaticLayout(new SpannableString(s), richPinTitlePaint, Math.max(50, width - padding.left - padding.right), android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 1.0F, false);
        return;
_L2:
        if (hasRichData)
        {
            s = _pin.getRichTitle();
        } else
        if (hasPlaceData)
        {
            s = _pin.getPlace().getName();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        int i = (int)Resources.dimension(0x7f0a0193);
        ICON_PADDING = i;
        SOURCE_PADDING = i + DP2;
    }

    private class LimitedLayout extends StaticLayout
    {

        public int getActualLineCount()
        {
            return super.getLineCount();
        }

        public int getLineCount()
        {
            int j = super.getLineCount();
            int i = j;
            if (j >= PinInfoDrawable.MAX_DESCRIPTION_LINES)
            {
                i = PinInfoDrawable.MAX_DESCRIPTION_LINES;
            }
            return i;
        }

        public LimitedLayout(CharSequence charsequence, TextPaint textpaint, int i, android.text.Layout.Alignment alignment, float f, float f1, boolean flag)
        {
            super(charsequence, textpaint, i, alignment, f, f1, flag);
        }
    }

}
