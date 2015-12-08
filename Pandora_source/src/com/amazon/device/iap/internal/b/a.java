// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b;


public class a extends RuntimeException
{

    private final String a;
    private final String b;

    public a(String s, String s1, Throwable throwable)
    {
        super(throwable);
        a = s;
        b = s1;
    }

    public String a()
    {
        return a;
    }
}
