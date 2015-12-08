// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.widget.TextView;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.events.VariantUpdatedEvent;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupSourceModule

class this._cls0
    implements com.pinterest.base.loseupSourceModule._cls1
{

    final PinCloseupSourceModule this$0;

    public void onEventMainThread(VariantUpdatedEvent variantupdatedevent)
    {
        com.pinterest.api.model.pSourceModule psourcemodule = variantupdatedevent.a();
        if (psourcemodule == null || !variantupdatedevent.a(_pin))
        {
            return;
        }
        variantupdatedevent = BuyableProductHelper.getPriceTitleType(psourcemodule);
        switch (.SwitchMap.com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType[variantupdatedevent.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            PinCloseupSourceModule.access$000(PinCloseupSourceModule.this).setTextColor(Resources.color(0x7f0e0026));
            return;

        case 3: // '\003'
        case 4: // '\004'
            PinCloseupSourceModule.access$000(PinCloseupSourceModule.this).setTextColor(Resources.color(0x7f0e008f));
            break;
        }
    }

    tleType()
    {
        this$0 = PinCloseupSourceModule.this;
        super();
    }
}
