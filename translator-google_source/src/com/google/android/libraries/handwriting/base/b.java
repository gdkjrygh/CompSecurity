// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.base;


public class b
{

    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public int i;

    public b()
    {
        a = "en";
        b = "unset";
    }

    public String toString()
    {
        return String.format("lang:%s client:%s:%d device:%s:%d v:%d space:%b maxParallel:%d timeout:%d", new Object[] {
            a, b, Integer.valueOf(d), c, Integer.valueOf(e), Integer.valueOf(f), Boolean.valueOf(g), Integer.valueOf(h), Integer.valueOf(i)
        });
    }
}
