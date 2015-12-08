// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.widget.TextView;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.api.model.BoostablePinMetadata;
import com.pinterest.api.model.BuyableProduct;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Colors;
import com.pinterest.base.Events;
import com.pinterest.events.VariantUpdatedEvent;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupSourceModule extends PinCloseupBaseModule
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private CharSequence _sourceName;
    private TextView _sourceNameTv;

    public PinCloseupSourceModule(Context context)
    {
        super(context);
        _eventsSubscriber = new _cls1();
    }

    private void updateSourceNameColor()
    {
        if (BuyableProductHelper.isPinAvailable(_pin))
        {
            _sourceNameTv.setTextColor(Resources.color(0x7f0e0026));
        }
    }

    private boolean updateSourceNameText()
    {
        updateSourceNameColor();
        String s;
        boolean flag;
        if ((_pinMetadata instanceof BoostablePinMetadata) && ((BoostablePinMetadata)_pinMetadata).isFromAggregatedData().booleanValue())
        {
            s = "";
        } else
        if (BuyableProductHelper.isPinBuyable(_pin))
        {
            s = _pin.getBuyableProduct().getMerchantName();
            _sourceNameTv.setOnClickListener(BuyableProductHelper.getOnClickMerchantFeed(_pin.getCanonicalMerchantDomain()));
        } else
        if (StringUtils.isNotBlank(_pin.getRichSiteName()))
        {
            s = _pin.getRichSiteName();
        } else
        {
            s = null;
        }
        if (!TextUtils.equals(_sourceName, s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _sourceName = s;
        return flag;
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_SOURCE;
    }

    protected boolean hasContent()
    {
        return ModelHelper.isValid(_sourceName);
    }

    protected void init()
    {
        int i = (int)Resources.dimension(0x7f0a0184);
        _padding.left = i;
        _padding.top = i;
    }

    protected void initView()
    {
        setBackgroundColor(Colors.WHITE);
        removeAllViews();
        _sourceNameTv = new TextView(getContext(), null, 0x7f0100d9);
        setVisibility(8);
        addView(_sourceNameTv, -1, -1);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Events.register(_eventsSubscriber, com/pinterest/events/VariantUpdatedEvent, new Class[0]);
    }

    protected void onDetachedFromWindow()
    {
        Events.unregister(_eventsSubscriber);
        super.onDetachedFromWindow();
    }

    protected boolean shouldUpdateView()
    {
        return updateSourceNameText();
    }

    protected void updateView()
    {
        if (ModelHelper.isValid(_sourceName))
        {
            _sourceNameTv.setText(_sourceName);
            setVisibility(0);
            return;
        } else
        {
            setVisibility(8);
            return;
        }
    }


    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PinCloseupSourceModule this$0;

        public void onEventMainThread(VariantUpdatedEvent variantupdatedevent)
        {
            com.pinterest.api.model.BuyableProduct.Variant variant = variantupdatedevent.a();
            if (variant == null || !variantupdatedevent.a(_pin))
            {
                return;
            }
            variantupdatedevent = BuyableProductHelper.getPriceTitleType(variant);
            switch (_cls2..SwitchMap.com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType[variantupdatedevent.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
            case 2: // '\002'
                _sourceNameTv.setTextColor(Resources.color(0x7f0e0026));
                return;

            case 3: // '\003'
            case 4: // '\004'
                _sourceNameTv.setTextColor(Resources.color(0x7f0e008f));
                break;
            }
        }

        _cls1()
        {
            this$0 = PinCloseupSourceModule.this;
            super();
        }

        private class _cls2
        {

            static final int $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[];

            static 
            {
                $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType = new int[com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType.values().length];
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType.NORMAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType.ON_SALE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType.OUT_OF_STOCK.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType.UNAVAILABLE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }

}
