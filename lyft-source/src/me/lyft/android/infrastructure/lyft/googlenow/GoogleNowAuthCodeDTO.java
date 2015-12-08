// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.googlenow;


public class GoogleNowAuthCodeDTO
{

    public final String authCode;
    public final Long expirationTimestamp;

    public GoogleNowAuthCodeDTO(String s, long l)
    {
        expirationTimestamp = Long.valueOf(l);
        authCode = s;
    }
}
