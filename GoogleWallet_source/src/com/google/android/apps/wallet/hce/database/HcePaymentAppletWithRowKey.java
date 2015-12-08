// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.database;

import com.google.android.apps.wallet.hce.emv.HcePaymentApplet;

public final class HcePaymentAppletWithRowKey
{

    private final long mKey;
    private final HcePaymentApplet paymentApplet;

    HcePaymentAppletWithRowKey(HcePaymentApplet hcepaymentapplet, long l)
    {
        paymentApplet = hcepaymentapplet;
        mKey = l;
    }

    public final long getKey()
    {
        return mKey;
    }

    public final HcePaymentApplet getPaymentApplet()
    {
        return paymentApplet;
    }
}
