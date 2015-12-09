// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


final class A extends Enum
{

    public static final A a;
    public static final A b;
    public static final A c;
    private static final A d[];

    private A(String s, int i)
    {
        super(s, i);
    }

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/yume/android/sdk/A, s);
    }

    public static A[] values()
    {
        A aa[] = d;
        int i = aa.length;
        A aa1[] = new A[i];
        System.arraycopy(aa, 0, aa1, 0, i);
        return aa1;
    }

    static 
    {
        a = new A("NONE", 0);
        b = new A("ASSET", 1);
        c = new A("HEAD", 2);
        d = (new A[] {
            a, b, c
        });
    }
}
