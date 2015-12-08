// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


public abstract class aJ
{

    private String a;
    private String b;

    private aJ()
    {
    }

    protected aJ(String s)
    {
        this();
        a = s;
        b = null;
    }

    protected aJ(String s, String s1)
    {
        this();
        a = s;
        b = s1;
    }

    public final String a()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder("ErrorBase[errorCode=")).append(a).append(" errorMsgShort=").append(b).append("]").toString();
    }
}
