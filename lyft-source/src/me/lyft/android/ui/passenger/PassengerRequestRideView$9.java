// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.facades.UserModeSwitchFacade;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView

class this._cls0
    implements Action1
{

    final PassengerRequestRideView this$0;

    public void call(Integer integer)
    {
        switch (integer.intValue())
        {
        default:
            return;

        case 2131558441: 
            dialogFlow.show(me.lyft.android.ui.splitfare.gressDialog.create(getResources(), splitFareStateRepository));
            return;

        case 2131558401: 
            dialogFlow.show(new ConfirmationDialog());
            return;

        case 2131558417: 
            PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(userModeSwitchFacade.switchToDriver(), new AsyncCall());
            return;

        case 2131558424: 
            appFlow.resetToParent(new me.lyft.android.ui.invites.());
            return;

        case 2131558405: 
            PassengerRequestRideView.access$4600(PassengerRequestRideView.this);
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    ConfirmationDialog()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
