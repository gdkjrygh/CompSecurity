// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import com.tremorvideo.sdk.android.videoad.ea;

public class m
{

    private String a;
    private String b;
    private int c;
    private int d;
    private ea e[];

    public m(String s, String s1, int i, int j, ea aea[])
    {
        c = i;
        d = j;
        a = s;
        b = s1;
        e = aea;
    }

    public int a()
    {
        return c;
    }

    public void a(String s)
    {
        b = s;
    }

    public int b()
    {
        return d;
    }

    public String c()
    {
        return a;
    }

    public String d()
    {
        return b;
    }

    public ea[] e()
    {
        return e;
    }
}
