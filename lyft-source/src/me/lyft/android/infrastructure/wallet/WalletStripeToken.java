// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.wallet;


public class WalletStripeToken
{

    private String originalLastFour;
    private String originalType;
    private String token;

    public WalletStripeToken(String s, String s1, String s2)
    {
        token = s;
        originalType = s1;
        originalLastFour = s2;
    }

    public String getOriginalLastFour()
    {
        return originalLastFour;
    }

    public String getOriginalType()
    {
        return originalType;
    }

    public String getToken()
    {
        return token;
    }
}
