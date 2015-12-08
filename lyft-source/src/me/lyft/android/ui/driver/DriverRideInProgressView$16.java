// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.ui.dialogs.DialogResult;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideInProgressView

class this._cls0
    implements Action1
{

    final DriverRideInProgressView this$0;

    public volatile void call(Object obj)
    {
        call((DialogResult)obj);
    }

    public void call(DialogResult dialogresult)
    {
        if (dialogresult.getButtonId() == 0x7f0d0009 || dialogresult.isCancelled()) goto _L2; else goto _L1
_L1:
        Object obj = null;
        dialogresult.getButtonId();
        JVM INSTR tableswitch 2131558426 2131558428: default 48
    //                   2131558426 65
    //                   2131558427 71
    //                   2131558428 59;
           goto _L3 _L4 _L5 _L6
_L3:
        dialogresult = obj;
_L8:
        DriverRideInProgressView.access$4200(DriverRideInProgressView.this, dialogresult);
_L2:
        return;
_L6:
        dialogresult = "wrongAddressShown";
        continue; /* Loop/switch isn't completed */
_L4:
        dialogresult = "passengerInCar";
        continue; /* Loop/switch isn't completed */
_L5:
        dialogresult = "other";
        if (true) goto _L8; else goto _L7
_L7:
    }

    ()
    {
        this$0 = DriverRideInProgressView.this;
        super();
    }
}
