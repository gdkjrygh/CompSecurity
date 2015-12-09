// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


public abstract class ap
{

    private String a;
    private String b;

    private ap(String s)
    {
    }

    protected ap(String s, String s1)
    {
        this(s);
        a = s1;
        b = null;
    }

    protected ap(String s, String s1, String s2, String s3)
    {
        this(s);
        a = s1;
        b = s2;
    }

    public final String a()
    {
        return b;
    }

    public final String b()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder("ErrorBase[errorCode=")).append(a).append(" errorMsgShort=").append(b).append("]").toString();
    }
}
