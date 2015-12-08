// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


public class ks
{

    private String a;

    private ks()
    {
    }

    ks(_cls1 _pcls1)
    {
        this();
    }

    public ks(String s)
    {
        a = s;
    }

    static String a(ks ks1)
    {
        return ks1.a;
    }

    static String a(ks ks1, String s)
    {
        ks1.a = s;
        return s;
    }

    public String a()
    {
        return a;
    }
}
