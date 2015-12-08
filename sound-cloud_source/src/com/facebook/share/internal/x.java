// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.internal.n;

public final class x extends Enum
    implements n
{

    public static final x a;
    public static final x b;
    public static final x c;
    private static final x e[];
    private int d;

    private x(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }

    public static x valueOf(String s)
    {
        return (x)Enum.valueOf(com/facebook/share/internal/x, s);
    }

    public static x[] values()
    {
        return (x[])e.clone();
    }

    public final String a()
    {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }

    public final int b()
    {
        return d;
    }

    static 
    {
        a = new x("MESSAGE_DIALOG", 0, 0x13350ac);
        b = new x("PHOTOS", 1, 0x1335124);
        c = new x("VIDEO", 2, 0x13354a2);
        e = (new x[] {
            a, b, c
        });
    }
}
