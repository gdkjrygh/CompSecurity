// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher

private static final class <init>
{

    int data[];

    boolean get(char c)
    {
        return (data[c >> 5] & 1 << c) != 0;
    }

    void set(char c)
    {
        int ai[] = data;
        int i = c >> 5;
        ai[i] = ai[i] | 1 << c;
    }

    private ()
    {
        data = new int[2048];
    }

    data(data data1)
    {
        this();
    }
}
