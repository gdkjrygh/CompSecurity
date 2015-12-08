// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.pin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextPaint;
import android.view.View;
import android.webkit.URLUtil;
import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Colors;
import com.pinterest.base.Device;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.ui.grid.CachableRoundedBitmap;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.ui.grid.pin:
//            PinCellDrawable

public class PinImageDrawable extends PinCellDrawable
{

    protected static final int MAX_PIN_HEIGHT_CROP = Math.round(Device.dpToPixel(420F));
    protected static final int MAX_PIN_HEIGHT_SYSTEM = 2048;
    protected int MAX_PIN_HEIGHT;
    private boolean _isAutoCrop;
    private boolean _isPromoted;
    private boolean _renderLargePin;
    private int alpha;
    private int background;
    private final Paint cropPaint = new Paint(1);
    private final TextPaint cropTextPaint = new TextPaint(1);
    private final Paint dividerPaint = new Paint(1);
    private String expand;
    private boolean gif;
    private final NinePatchDrawable gifBg = (NinePatchDrawable)Resources.drawable(0x7f02003e);
    private final Paint gifPaint = new Paint(1);
    private String gifString;
    private Rect gifTextBounds;
    private CachableRoundedBitmap image;
    private View parent;
    private int pinImageHeight;
    private int pinImageWidth;
    private float scale;
    private boolean video;
    private final Bitmap videoIcon = ((BitmapDrawable)Resources.drawable(0x7f020203)).getBitmap();

    public PinImageDrawable(View view)
    {
        MAX_PIN_HEIGHT = MAX_PIN_HEIGHT_CROP;
        alpha = 0;
        scale = 1.0F;
        background = -1;
        expand = "";
        gifString = "";
        pinImageWidth = 0;
        pinImageHeight = 0;
        parent = view;
        image = new CachableRoundedBitmap(view);
        expand = Resources.string(0x7f0703ff);
        gifString = Resources.string(0x7f070407);
        gifTextBounds = new Rect();
        cropPaint.setColor(-1);
        cropPaint.setAlpha(210);
        cropPaint.setAntiAlias(true);
        cropPaint.setStyle(android.graphics.Paint.Style.FILL);
        cropTextPaint.setColor(Resources.color(0x7f0e0073));
        cropTextPaint.setTextSize(nameSize);
        cropTextPaint.setStyle(android.graphics.Paint.Style.FILL);
        cropTextPaint.setAlpha(230);
        dividerPaint.setColor(Colors.LIGHT_GRAY);
        dividerPaint.setAntiAlias(true);
        dividerPaint.setStyle(android.graphics.Paint.Style.FILL);
        gifPaint.setColor(-1);
        gifPaint.setTextSize(nameSize);
        gifPaint.setTypeface(Typeface.DEFAULT_BOLD);
        gifPaint.setStyle(android.graphics.Paint.Style.FILL);
        gifPaint.setAlpha(255);
    }

    private void updateHeight()
    {
        int i = pinImageWidth;
        float f = (float)pinImageHeight / (float)i;
        int j = (int)Math.ceil((float)(width - padding.left - padding.right) * f) + 1;
        int k = (int)((float)j / f);
        if (j > MAX_PIN_HEIGHT)
        {
            i = MAX_PIN_HEIGHT;
        } else
        {
            i = j;
        }
        if (_renderLargePin)
        {
            i = Math.min(k, j);
        }
        setHeight(i + padding.top);
    }

    private void updateMaxHeight()
    {
        if (_isAutoCrop)
        {
            if (PinGridAdapter.isPinHeightExp())
            {
                if (Experiments.r() && !_isPromoted)
                {
                    MAX_PIN_HEIGHT = MAX_PIN_HEIGHT_CROP;
                    return;
                } else
                {
                    MAX_PIN_HEIGHT = (int)((1.0F - Experiments.q()) * (float)MAX_PIN_HEIGHT_CROP);
                    return;
                }
            } else
            {
                MAX_PIN_HEIGHT = MAX_PIN_HEIGHT_CROP;
                return;
            }
        } else
        {
            MAX_PIN_HEIGHT = 2048;
            return;
        }
    }

    public void draw(Canvas canvas)
    {
        int i;
        boolean flag;
        if (image.bitmap == null)
        {
            break MISSING_BLOCK_LABEL_977;
        }
        scale = (float)(width - padding.left - padding.right) / (float)image.bitmap.getWidth();
        if (alpha < 255 && background != -1)
        {
            backgroundPaint.setColor(background);
            canvas.drawRect(getBounds(), backgroundPaint);
            backgroundPaint.setColor(Colors.GRAY_SOLID);
        }
        if (alpha < 255)
        {
            blankPaint.setAlpha(alpha);
            alpha = alpha + 67;
            parent.postInvalidateDelayed(56L);
        }
        float f;
        float f1;
        int l;
        if (height >= MAX_PIN_HEIGHT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = image.bitmap.getWidth();
        i = image.bitmap.getHeight();
        if (!_renderLargePin) goto _L2; else goto _L1
_L1:
        if (l > i) goto _L4; else goto _L3
_L3:
        i = l;
_L6:
        sharedRect.left = 0;
        sharedRect.top = 0;
        if (_renderLargePin || flag)
        {
            sharedRect.right = l;
            sharedRect.bottom = i;
        } else
        {
            sharedRect.right = image.bitmap.getWidth();
            sharedRect.bottom = image.bitmap.getHeight();
        }
        sharedRectF.set(sharedRect);
        sharedMatrix.reset();
        sharedMatrix.postScale(scale, scale);
        sharedMatrix.postTranslate(padding.left, padding.top);
        sharedMatrix.mapRect(sharedRectF);
        if (getY() != 0)
        {
            sharedRectF.offset(0.0F, getY());
        }
        canvas.drawBitmap(image.bitmap, sharedRect, sharedRectF, blankPaint);
        blankPaint.setAlpha(255);
        if (!_renderLargePin && flag)
        {
            canvas.drawRect(getBounds().left, getBounds().bottom - DP4 * 7, getBounds().right, getBounds().bottom, cropPaint);
            canvas.drawRect(getBounds().left + 1, getBounds().bottom - DP4 * 7 - 1, getBounds().right - 1, getBounds().bottom - DP4 * 7, dividerPaint);
            i = (int)(paintBold.measureText(expand) / 2.0F);
            canvas.drawText(expand, getBounds().width() / 2 - i, getBounds().bottom - (DP4 * 2 + DP2), cropTextPaint);
        } else
        if (gif)
        {
            gifPaint.getTextBounds(gifString, 0, gifString.length(), gifTextBounds);
            int j = DP8 + DP4;
            int k = getBounds().bottom - (DP8 + DP4);
            gifBg.setBounds(new Rect(j - DP8, k - gifTextBounds.height() - DP8, gifTextBounds.width() + j + DP8, getBounds().bottom - DP4));
            gifBg.draw(canvas);
            canvas.drawText(gifString, j, k - (gifTextBounds.height() - DP8) / 2, gifPaint);
        }
        if (video)
        {
            f = ((float)image.bitmap.getWidth() * scale - (float)videoIcon.getWidth()) / 2.0F;
            f1 = (height - videoIcon.getHeight()) / 2;
            canvas.drawBitmap(videoIcon, f, f1, blankPaint);
        }
        if (pressed)
        {
            touchPaint.setColor(Colors.BG_TOUCH_IMAGE);
            canvas.drawRect(getBounds(), touchPaint);
            touchPaint.setColor(Colors.BG_TOUCH);
        }
_L7:
        canvas.drawRect(getBounds().left + 1, getBounds().bottom - 1, getBounds().right - 1, getBounds().bottom, dividerPaint);
        return;
_L2:
        if (!flag) goto _L4; else goto _L5
_L5:
        scale = (float)(width - padding.left - padding.right) / (float)image.bitmap.getWidth();
        i = (int)((float)MAX_PIN_HEIGHT / scale);
          goto _L6
_L4:
        scale = (float)height / (float)image.bitmap.getHeight();
          goto _L6
        if (background != -1)
        {
            backgroundPaint.setColor(background);
            canvas.drawRect(getBounds(), backgroundPaint);
            backgroundPaint.setColor(Colors.GRAY_SOLID);
        } else
        {
            canvas.drawRect(getBounds(), backgroundPaint);
        }
          goto _L7
    }

    public void loadImage(String s)
    {
        int i = 0;
        if (image.bitmap == null || !image.getUrl().equals(s))
        {
            if (URLUtil.isValidUrl(s))
            {
                if (ImageCache.getDefault().inMemory(s))
                {
                    i = 255;
                }
                alpha = i;
                ImageCache.loadImage(image, s);
            } else
            if (StringUtils.isNumeric(s))
            {
                alpha = 0;
                image.bitmap = BitmapFactory.decodeResource(parent.getResources(), Integer.parseInt(s));
                return;
            }
        }
    }

    public void measure()
    {
        updateHeight();
    }

    public void prepareForReuse()
    {
        super.prepareForReuse();
        image.bitmap = null;
        image.setTransformation(null);
        gif = false;
    }

    public void setAutoCrop(boolean flag)
    {
        _isAutoCrop = flag;
    }

    public void setColor(String s)
    {
        int i;
        if (StringUtils.isNotEmpty(s))
        {
            i = Color.parseColor(s);
        } else
        {
            i = -1;
        }
        background = i;
    }

    public void setGifPin(boolean flag)
    {
        gif = flag;
    }

    public void setImageHeight(int i)
    {
        pinImageHeight = i;
    }

    public void setImageListener(com.pinterest.ui.grid.CachableRoundedBitmap.ImageListener imagelistener)
    {
        image.setImageListener(imagelistener);
    }

    public void setImageWidth(int i)
    {
        pinImageWidth = i;
    }

    public void setPin(Pin pin)
    {
        boolean flag1 = true;
        if (pin == null || pin.getImageMediumHeight() == null)
        {
            return;
        }
        setImageWidth(pin.getImageMediumWidth().intValue());
        setImageHeight(pin.getImageMediumHeight().intValue());
        boolean flag;
        if (pin.getVideo() == Boolean.TRUE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setVideo(flag);
        setColor(pin.getDominantColor());
        if (pin.getPromoterUid() != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        _isPromoted = flag;
        updateMaxHeight();
    }

    public void setRenderLargePin(boolean flag)
    {
        _renderLargePin = flag;
    }

    public void setVideo(boolean flag)
    {
        video = flag;
    }

}
