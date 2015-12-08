// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.payment;


public class PayPalClientTokenDTO
{

    public final String clientToken;

    public PayPalClientTokenDTO(String s)
    {
        clientToken = s;
    }

    public String getClientToken()
    {
        return clientToken;
    }
}
