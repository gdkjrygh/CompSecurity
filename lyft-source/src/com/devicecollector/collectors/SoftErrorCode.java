// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;


public final class SoftErrorCode extends Enum
{

    public static final SoftErrorCode a;
    public static final SoftErrorCode b;
    public static final SoftErrorCode c;
    public static final SoftErrorCode d;
    public static final SoftErrorCode e;
    public static final SoftErrorCode f;
    private static final SoftErrorCode g[];
    private String postValue;

    private SoftErrorCode(String s, int i, String s1)
    {
        super(s, i);
        postValue = s1;
    }

    public static SoftErrorCode valueOf(String s)
    {
        return (SoftErrorCode)Enum.valueOf(com/devicecollector/collectors/SoftErrorCode, s);
    }

    public static SoftErrorCode[] values()
    {
        return (SoftErrorCode[])g.clone();
    }

    public String a()
    {
        return postValue;
    }

    static 
    {
        a = new SoftErrorCode("MERCHANT_CANCELLED", 0, "merchant_cancelled");
        b = new SoftErrorCode("MERCHANT_SKIPPED", 1, "skipped");
        c = new SoftErrorCode("PERMISSION_DENIED", 2, "permission_denied");
        d = new SoftErrorCode("SERVICE_UNAVAILABLE", 3, "not_available");
        e = new SoftErrorCode("TIMEOUT", 4, "timeout");
        f = new SoftErrorCode("UNEXPECTED", 5, "unexpected");
        g = (new SoftErrorCode[] {
            a, b, c, d, e, f
        });
    }
}
