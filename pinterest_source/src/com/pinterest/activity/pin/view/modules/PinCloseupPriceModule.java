// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.pin.view.modules.util.PriceTextLayout;
import com.pinterest.api.model.BuyableProduct;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.events.VariantUpdatedEvent;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupPriceModule extends PinCloseupBaseModule
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private String _priceText;
    private PriceTextLayout _priceTextLayout;
    private com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType _priceTitleType;

    public PinCloseupPriceModule(Context context)
    {
        super(context);
        _eventsSubscriber = new _cls1();
    }

    private boolean shouldUpdatePriceText()
    {
label0:
        {
            boolean flag3 = false;
            boolean flag2 = flag3;
            if (!BuyableProductHelper.isPinBuyable(_pin))
            {
                break label0;
            }
            Object obj = _pin.getBuyableProduct();
            String s = BuyableProductHelper.getPriceDisplay(((BuyableProduct) (obj)));
            obj = BuyableProductHelper.getPriceTitleType(((BuyableProduct) (obj)));
            boolean flag;
            boolean flag1;
            if (!TextUtils.equals(_priceText, s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (_priceTitleType != obj)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            _priceText = s;
            _priceTitleType = ((com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType) (obj));
            if (!flag)
            {
                flag2 = flag3;
                if (!flag1)
                {
                    break label0;
                }
            }
            flag2 = true;
        }
        return flag2;
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_PRICE;
    }

    protected boolean hasContent()
    {
        return BuyableProductHelper.isPinBuyable(_pin);
    }

    protected void init()
    {
        _padding.left = (int)Resources.dimension(0x7f0a0184);
        _padding.right = (int)Resources.dimension(0x7f0a0185);
    }

    protected void initView()
    {
        setBackgroundColor(-1);
        removeAllViews();
        setOrientation(1);
        _priceTextLayout = new PriceTextLayout(getContext());
        _priceTextLayout.setVisibility(8);
        addView(_priceTextLayout, -2, -2);
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
        return shouldUpdatePriceText();
    }

    protected void updateView()
    {
        _priceTextLayout.setOnClickListener(BuyableProductHelper.getOnClickMerchantFeed(_pin.getCanonicalMerchantDomain()));
        _priceTextLayout.setVisibility(0);
        _priceTextLayout.setPriceTitle(_priceText);
        switch (_cls2..SwitchMap.com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType[_priceTitleType.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            _priceTextLayout.setPriceSubtitle(Resources.string(0x7f070467));
            _priceTextLayout.setNonCommercePriceColor();
            return;

        case 2: // '\002'
            _priceTextLayout.setPriceSubtitle(Resources.string(0x7f07046b));
            _priceTextLayout.setNonCommercePriceColor();
            return;

        case 3: // '\003'
            _priceTextLayout.setOriginalPriceStrikeThru(_pin.getBuyableProduct().getDisplayPrice());
            break;
        }
    }


/*
    static String access$002(PinCloseupPriceModule pincloseuppricemodule, String s)
    {
        pincloseuppricemodule._priceText = s;
        return s;
    }

*/


    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PinCloseupPriceModule this$0;

        public void onEventMainThread(VariantUpdatedEvent variantupdatedevent)
        {
            com.pinterest.api.model.BuyableProduct.Variant variant = variantupdatedevent.a();
            if (variant == null || !variantupdatedevent.a(_pin))
            {
                return;
            }
            _priceText = variant.getDisplayActivePrice();
            variantupdatedevent = BuyableProductHelper.getPriceTitleType(variant);
            switch (_cls2..SwitchMap.com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType[variantupdatedevent.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                _priceTextLayout.setPriceSubtitle(Resources.string(0x7f070467));
                _priceTextLayout.setNonCommercePriceColor();
                return;

            case 2: // '\002'
                _priceTextLayout.setPriceSubtitle(Resources.string(0x7f07046b));
                _priceTextLayout.setNonCommercePriceColor();
                return;

            case 3: // '\003'
                _priceTextLayout.setOriginalPriceStrikeThru(_pin.getBuyableProduct().getDisplayPrice());
                _priceTextLayout.setCommercePriceColor();
                return;

            case 4: // '\004'
                _priceTextLayout.setCommercePriceColor();
                break;
            }
            _priceTextLayout.hidePriceSubtitle();
        }

        _cls1()
        {
            this$0 = PinCloseupPriceModule.this;
            super();
        }
    }


    private class _cls2
    {

        static final int $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[];

        static 
        {
            $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType = new int[com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType.OUT_OF_STOCK.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType.UNAVAILABLE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType.ON_SALE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType.NORMAL.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
