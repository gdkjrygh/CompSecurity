// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.internal;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HMACSHA1
{

    private static final String HMAC_SHA1 = "HmacSHA1";

    public HMACSHA1()
    {
    }

    public static byte[] getSignature(byte abyte0[], byte abyte1[])
    {
        abyte1 = new SecretKeySpec(abyte1, "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(abyte1);
        return mac.doFinal(abyte0);
    }
}
