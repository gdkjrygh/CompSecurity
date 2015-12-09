// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;


// Referenced classes of package com.google.android.apps.wallet.pin:
//            PinView, UserPin

final class val.userPin
    implements Runnable
{

    final val.userPin this$1;
    final UserPin val$userPin;

    public final void run()
    {
        PinView.access$600(_fld0, val$userPin);
        val$userPin.shred();
        return;
        Exception exception;
        exception;
        val$userPin.shred();
        throw exception;
    }

    I()
    {
        this$1 = final_i;
        val$userPin = UserPin.this;
        super();
    }
}
