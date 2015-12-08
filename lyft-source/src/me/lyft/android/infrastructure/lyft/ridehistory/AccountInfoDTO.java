// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ridehistory;


public class AccountInfoDTO
{

    public final String clientPaymentMethod;
    public final String type;

    public AccountInfoDTO(String s, String s1)
    {
        type = s;
        clientPaymentMethod = s1;
    }
}
