// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.paypal;


public class PayPalChargeData
{

    private final String deviceData;
    private final String nonce;

    public PayPalChargeData(String s, String s1)
    {
        nonce = s;
        deviceData = s1;
    }

    public String getDeviceData()
    {
        return deviceData;
    }

    public String getNonce()
    {
        return nonce;
    }
}
