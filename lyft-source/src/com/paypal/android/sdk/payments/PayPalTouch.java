// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.Context;
import com.paypal.android.sdk.S;

public class PayPalTouch
{

    public PayPalTouch()
    {
    }

    public static boolean available(Context context, boolean flag)
    {
        return (new S()).a(context, flag);
    }
}
