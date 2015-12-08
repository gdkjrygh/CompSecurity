// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.view.View;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.events.VariantUpdatedEvent;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinCloseupAccessoryActionBar

class this._cls0
    implements com.pinterest.base.yActionBar._cls5
{

    final PinCloseupAccessoryActionBar this$0;

    public void onEventMainThread(com.pinterest.activity.pin.view.modules.ClickedEvent clickedevent)
    {
        if (!clickedevent.isEventForPin(PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this)))
        {
            return;
        } else
        {
            PinCloseupAccessoryActionBar.access$600(PinCloseupAccessoryActionBar.this, clickedevent.getVariant());
            return;
        }
    }

    public void onEventMainThread(com.pinterest.activity.pin.view.modules.UpdatedEvent updatedevent)
    {
        updatedevent = updatedevent.getGallerySelectedItem();
        if (PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this) == null || !updatedevent.onBar().getUid().equals(PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this).getUid()))
        {
            return;
        } else
        {
            PinCloseupAccessoryActionBar.access$702(PinCloseupAccessoryActionBar.this, updatedevent.re());
            return;
        }
    }

    public void onEventMainThread(com.pinterest.activity.task.education.view.ipEvent ipevent)
    {
        Events.unregister(PinCloseupAccessoryActionBar.access$900(PinCloseupAccessoryActionBar.this), new Class[] {
            com/pinterest/activity/task/education/view/EducationToolTipView$BuyItToolTipEvent
        });
        if (!StopWatch.get().isActive("buy_it_clicked"))
        {
            PinCloseupAccessoryActionBar.access$1100(PinCloseupAccessoryActionBar.this);
        }
    }

    public void onEventMainThread(com.pinterest.activity.task.education.view.ipEvent ipevent)
    {
        Events.unregister(PinCloseupAccessoryActionBar.access$900(PinCloseupAccessoryActionBar.this), new Class[] {
            com/pinterest/activity/task/education/view/EducationToolTipView$PinItToolTipEvent
        });
        if (!StopWatch.get().isActive("repin_dialog"))
        {
            PinCloseupAccessoryActionBar.access$1000(PinCloseupAccessoryActionBar.this);
        }
    }

    public void onEventMainThread(VariantUpdatedEvent variantupdatedevent)
    {
        final com.pinterest.api.model.onBar variant = variantupdatedevent.a();
        if (variant == null || !variantupdatedevent.a(PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this)))
        {
            return;
        }
        variantupdatedevent = BuyableProductHelper.getPriceTitleType(variant);
        switch (.SwitchMap.com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType[variantupdatedevent.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            PinCloseupAccessoryActionBar.access$800(PinCloseupAccessoryActionBar.this).setVisibility(0);
            class _cls1
                implements android.view.View.OnClickListener
            {

                final PinCloseupAccessoryActionBar._cls5 this$1;
                final com.pinterest.api.model.BuyableProduct.Variant val$variant;

                public void onClick(View view)
                {
                    PinCloseupAccessoryActionBar.access$600(this$0, variant);
                }

            _cls1()
            {
                this$1 = PinCloseupAccessoryActionBar._cls5.this;
                variant = variant1;
                super();
            }
            }

            PinCloseupAccessoryActionBar.access$800(PinCloseupAccessoryActionBar.this).setOnClickListener(new _cls1());
            return;

        case 3: // '\003'
        case 4: // '\004'
            PinCloseupAccessoryActionBar.access$800(PinCloseupAccessoryActionBar.this).setVisibility(8);
            break;
        }
    }

    .PinItToolTipEvent()
    {
        this$0 = PinCloseupAccessoryActionBar.this;
        super();
    }
}
