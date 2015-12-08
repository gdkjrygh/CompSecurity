// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.pin.view.modules.util.PriceTextLayout;
import com.pinterest.api.model.BuyableProduct;
import com.pinterest.api.model.Pin;
import com.pinterest.events.VariantUpdatedEvent;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupPriceModule

class this._cls0
    implements com.pinterest.base.CloseupPriceModule._cls1
{

    final PinCloseupPriceModule this$0;

    public void onEventMainThread(VariantUpdatedEvent variantupdatedevent)
    {
        com.pinterest.api.model.upPriceModule uppricemodule = variantupdatedevent.a();
        if (uppricemodule == null || !variantupdatedevent.a(_pin))
        {
            return;
        }
        PinCloseupPriceModule.access$002(PinCloseupPriceModule.this, uppricemodule.etDisplayActivePrice());
        variantupdatedevent = BuyableProductHelper.getPriceTitleType(uppricemodule);
        switch (.SwitchMap.com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType[variantupdatedevent.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            PinCloseupPriceModule.access$100(PinCloseupPriceModule.this).setPriceSubtitle(Resources.string(0x7f070467));
            PinCloseupPriceModule.access$100(PinCloseupPriceModule.this).setNonCommercePriceColor();
            return;

        case 2: // '\002'
            PinCloseupPriceModule.access$100(PinCloseupPriceModule.this).setPriceSubtitle(Resources.string(0x7f07046b));
            PinCloseupPriceModule.access$100(PinCloseupPriceModule.this).setNonCommercePriceColor();
            return;

        case 3: // '\003'
            PinCloseupPriceModule.access$100(PinCloseupPriceModule.this).setOriginalPriceStrikeThru(_pin.getBuyableProduct().getDisplayPrice());
            PinCloseupPriceModule.access$100(PinCloseupPriceModule.this).setCommercePriceColor();
            return;

        case 4: // '\004'
            PinCloseupPriceModule.access$100(PinCloseupPriceModule.this).setCommercePriceColor();
            break;
        }
        PinCloseupPriceModule.access$100(PinCloseupPriceModule.this).hidePriceSubtitle();
    }

    itleType()
    {
        this$0 = PinCloseupPriceModule.this;
        super();
    }
}
