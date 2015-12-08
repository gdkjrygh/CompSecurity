// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.graphics.Rect;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.AggregatedPinData;
import com.pinterest.api.model.BoostablePinMetadata;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Place;
import com.pinterest.api.model.metadata.product.OfferSummary;
import com.pinterest.api.model.metadata.product.Product;
import com.pinterest.api.model.metadata.recipe.Recipe;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.NumberUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.text.PTextView;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupTitleModule extends PinCloseupBaseModule
    implements android.view.View.OnClickListener
{

    private static final String AGGREGATED_PIN_DATA_ID = "aggregatedPinDataUid";
    private Integer _likeCount;
    private PTextView _likeCountTv;
    private Integer _repinCount;
    private PTextView _repinCountTv;
    private LinearLayout _statsWrapper;
    private String _titleText;
    private TextView _titleTv;

    public PinCloseupTitleModule(Context context)
    {
        super(context);
    }

    private String getPrice()
    {
        if (_pinMetadata != null && (_pinMetadata instanceof Product))
        {
            OfferSummary offersummary = ((Product)_pinMetadata).getOfferSummary();
            if (offersummary != null)
            {
                return offersummary.getPrice();
            }
        }
        return null;
    }

    private Spanned getRichText()
    {
        if (_pinMetadata != null && (_pinMetadata instanceof Recipe) && (!((Recipe)_pinMetadata).isFromAggregatedData().booleanValue() || Experiments.R()))
        {
            return ((Recipe)_pinMetadata).getMetadataDisplay();
        }
        if (BooleanUtils.isTrue(_pin.getHasPlace()) && _pin.getPlace() != null)
        {
            return new SpannedString(_pin.getPlace().getCityState());
        } else
        {
            return null;
        }
    }

    private boolean updatePinStats()
    {
        boolean flag2 = false;
        Integer integer;
        Object obj;
        if (_pin.getAggregatedPinData() != null)
        {
            obj = _pin.getAggregatedPinData();
            boolean flag;
            boolean flag1;
            if (((AggregatedPinData) (obj)).getSaves() != null)
            {
                integer = ((AggregatedPinData) (obj)).getLikes();
            } else
            {
                integer = null;
            }
            if (((AggregatedPinData) (obj)).getSaves() != null)
            {
                obj = ((AggregatedPinData) (obj)).getSaves();
            } else
            {
                obj = null;
            }
        } else
        {
            integer = null;
            obj = null;
        }
        if (integer != null && !integer.equals(_likeCount))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj != null && !((Integer) (obj)).equals(_repinCount))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        _likeCount = integer;
        _repinCount = ((Integer) (obj));
        if (flag || flag1)
        {
            flag2 = true;
        }
        return flag2;
    }

    private boolean updateTitleText()
    {
        String s2 = System.getProperty("line.separator");
        String s1;
        boolean flag;
        if ((_pinMetadata instanceof BoostablePinMetadata) && ((BoostablePinMetadata)_pinMetadata).isFromAggregatedData().booleanValue())
        {
            s1 = "";
        } else
        {
            String s;
            Spanned spanned;
            if (StringUtils.isNotBlank(_pin.getRichTitle()))
            {
                s1 = _pin.getRichTitle();
            } else
            {
                s1 = "";
            }
            s = s1;
            if (!BuyableProductHelper.isPinBuyable(_pin))
            {
                s = getPrice();
                if (ModelHelper.isValid(s))
                {
                    if (!StringUtils.isEmpty(s1))
                    {
                        s = (new StringBuilder()).append(s).append(s2).append(s1).toString();
                    }
                } else
                {
                    s = s1;
                    if ("product".equals(_pin.getRichTypeName()))
                    {
                        s = (new StringBuilder(" ")).append(s2).append(s1).toString();
                    }
                }
            }
            spanned = getRichText();
            s1 = s;
            if (ModelHelper.isValid(spanned))
            {
                if (StringUtils.isEmpty(s))
                {
                    s1 = spanned.toString();
                } else
                {
                    s1 = (new StringBuilder()).append(s).append(s2).append(spanned).toString();
                }
            }
        }
        if (!TextUtils.equals(_titleText, s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _titleText = s1;
        return flag;
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_TITLE;
    }

    protected boolean hasContent()
    {
        return ModelHelper.isValid(_titleText);
    }

    protected void init()
    {
        _padding.right = (int)Resources.dimension(0x7f0a0186);
        _padding.left = (int)Resources.dimension(0x7f0a0184);
    }

    protected void initView()
    {
        setBackgroundColor(-1);
        removeAllViews();
        setOrientation(1);
        _titleTv = new TextView(getContext(), null, 0x7f0100d6);
        _titleTv.setVisibility(8);
        if (Experiments.P())
        {
            RelativeLayout relativelayout = new RelativeLayout(getContext());
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams.addRule(11);
            layoutparams.addRule(12);
            _statsWrapper = new LinearLayout(getContext());
            _statsWrapper.setOrientation(0);
            _statsWrapper.setId(0x7f0f000e);
            relativelayout.addView(_statsWrapper, layoutparams);
            _repinCountTv = new PTextView(getContext(), null, 0x7f0100da);
            _repinCountTv.setCompoundDrawablesWithIntrinsicBounds(Resources.drawable(0x7f0201e9), null, null, null);
            _repinCountTv.setCompoundDrawablePadding(Constants.MARGIN_HALF);
            _repinCountTv.setPadding(Constants.MARGIN_HALF, 0, Constants.MARGIN_HALF, 0);
            _repinCountTv.setGravity(16);
            _repinCountTv.setBackgroundResource(0x7f020283);
            _repinCountTv.setTypeface(null, 1);
            _statsWrapper.addView(_repinCountTv, -2, -2);
            _likeCountTv = new PTextView(getContext(), null, 0x7f0100da);
            _likeCountTv.setCompoundDrawablesWithIntrinsicBounds(Resources.drawable(0x7f0201c2), null, null, null);
            _likeCountTv.setCompoundDrawablePadding(Constants.MARGIN_HALF);
            _likeCountTv.setPadding(Constants.MARGIN_HALF, 0, 0, 0);
            _likeCountTv.setGravity(16);
            _likeCountTv.setBackgroundResource(0x7f020283);
            _likeCountTv.setTypeface(null, 1);
            _statsWrapper.addView(_likeCountTv, -2, -2);
            _statsWrapper.setPadding(0, (int)Resources.dimension(0x7f0a0186), 0, 0);
            _statsWrapper.setOnClickListener(this);
            layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutparams.addRule(0, 0x7f0f000e);
            layoutparams.addRule(12);
            _titleTv.setLayoutParams(layoutparams);
            relativelayout.addView(_titleTv);
            addView(relativelayout, -1, -2);
            return;
        } else
        {
            addView(_titleTv, -1, -2);
            return;
        }
    }

    public void onClick(View view)
    {
        if (view == _statsWrapper)
        {
            Pinalytics.a(ElementType.REPINS_BUTTON, getComponentType());
            view = new Navigation(Location.PIN_ACTIVITY_FEED);
            view.putExtra("aggregatedPinDataUid", _pin.getAggregatedPinDataUid());
            Events.post(view);
        }
    }

    protected boolean shouldUpdateView()
    {
        return updateTitleText() || Experiments.P() && updatePinStats();
    }

    protected void updateView()
    {
        if (_pin.isCSR())
        {
            _statsWrapper.setVisibility(8);
        }
        if (ModelHelper.isValid(_titleText))
        {
            _titleTv.setText(_titleText);
            int i;
            int j;
            if (Experiments.P())
            {
                i = 0;
            } else
            {
                i = (int)Resources.dimension(0x7f0a0185);
            }
            j = (int)Resources.dimension(0x7f0a0186);
            if (StringUtils.isBlank(_pin.getRichSiteName()))
            {
                _titleTv.setPadding(0, j, i, 0);
            } else
            {
                _titleTv.setPadding(0, 0, i, 0);
            }
            _titleTv.setVisibility(0);
        } else
        {
            _titleTv.setVisibility(8);
        }
        if (Experiments.P())
        {
            if (_repinCount != null)
            {
                _repinCountTv.setText(NumberUtils.getFormattedNumber(_repinCount.intValue()));
            }
            if (_likeCount != null)
            {
                _likeCountTv.setText(NumberUtils.getFormattedNumber(_likeCount.intValue()));
            }
        }
    }
}
