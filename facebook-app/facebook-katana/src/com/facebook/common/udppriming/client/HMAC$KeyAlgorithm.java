// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.udppriming.client;


public final class mAlgorithm extends Enum
{

    private static final HMAC_SHA256 $VALUES[];
    public static final HMAC_SHA256 HMAC_MD5;
    public static final HMAC_SHA256 HMAC_SHA1;
    public static final HMAC_SHA256 HMAC_SHA256;
    private final String mAlgorithm;

    public static mAlgorithm valueOf(String s)
    {
        return (mAlgorithm)Enum.valueOf(com/facebook/common/udppriming/client/HMAC$KeyAlgorithm, s);
    }

    public static mAlgorithm[] values()
    {
        return (mAlgorithm[])$VALUES.clone();
    }

    public final String getAlgorithmName()
    {
        return mAlgorithm;
    }

    static 
    {
        HMAC_MD5 = new <init>("HMAC_MD5", 0, "HmacMD5");
        HMAC_SHA1 = new <init>("HMAC_SHA1", 1, "HmacSHA1");
        HMAC_SHA256 = new <init>("HMAC_SHA256", 2, "HmacSHA256");
        $VALUES = (new .VALUES[] {
            HMAC_MD5, HMAC_SHA1, HMAC_SHA256
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mAlgorithm = s1;
    }
}
