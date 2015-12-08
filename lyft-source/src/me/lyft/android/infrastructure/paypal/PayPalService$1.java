// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.paypal;

import me.lyft.android.infrastructure.activity.ActivityResult;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.infrastructure.paypal:
//            PayPalService

class val.clientToken
    implements Func1
{

    final PayPalService this$0;
    final String val$clientToken;

    public volatile Object call(Object obj)
    {
        return call((ActivityResult)obj);
    }

    public Observable call(ActivityResult activityresult)
    {
        return PayPalService.access$000(PayPalService.this, val$clientToken, activityresult);
    }

    ()
    {
        this$0 = final_paypalservice;
        val$clientToken = String.this;
        super();
    }
}
