// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import com.paypal.android.sdk.payments.PayPalService;

public final class bzu extends Binder
{

    final PayPalService a;

    public bzu(PayPalService paypalservice)
    {
        a = paypalservice;
        super();
    }
}
