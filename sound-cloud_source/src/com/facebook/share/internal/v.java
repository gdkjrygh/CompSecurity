// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.internal.n;

public final class v extends Enum
    implements n
{

    public static final v a;
    private static final v c[];
    private int b;

    private v(String s)
    {
        super(s, 0);
        b = 0x133529d;
    }

    public static v valueOf(String s)
    {
        return (v)Enum.valueOf(com/facebook/share/internal/v, s);
    }

    public static v[] values()
    {
        return (v[])c.clone();
    }

    public final String a()
    {
        return "com.facebook.platform.action.request.LIKE_DIALOG";
    }

    public final int b()
    {
        return b;
    }

    static 
    {
        a = new v("LIKE_DIALOG");
        c = (new v[] {
            a
        });
    }
}
