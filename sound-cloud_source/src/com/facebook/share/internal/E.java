// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.internal.n;

public final class E extends Enum
    implements n
{

    public static final E a;
    public static final E b;
    public static final E c;
    private static final E e[];
    private int d;

    private E(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }

    public static E valueOf(String s)
    {
        return (E)Enum.valueOf(com/facebook/share/internal/E, s);
    }

    public static E[] values()
    {
        return (E[])e.clone();
    }

    public final String a()
    {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }

    public final int b()
    {
        return d;
    }

    static 
    {
        a = new E("SHARE_DIALOG", 0, 0x1332b3a);
        b = new E("PHOTOS", 1, 0x13350ac);
        c = new E("VIDEO", 2, 0x13353e4);
        e = (new E[] {
            a, b, c
        });
    }
}
