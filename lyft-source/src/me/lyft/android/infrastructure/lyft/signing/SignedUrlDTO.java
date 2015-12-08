// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.signing;


public class SignedUrlDTO
{

    public final String expires;
    public final String signedUrl;

    public SignedUrlDTO(String s, String s1)
    {
        signedUrl = s;
        expires = s1;
    }

    public String getExpires()
    {
        return expires;
    }

    public String getSignedUrl()
    {
        return signedUrl;
    }
}
