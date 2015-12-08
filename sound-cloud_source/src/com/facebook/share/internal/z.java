// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.internal.n;

public final class z extends Enum
    implements n
{

    public static final z a;
    private static final z c[];
    private int b;

    private z(String s)
    {
        super(s, 0);
        b = 0x1332b3a;
    }

    public static z valueOf(String s)
    {
        return (z)Enum.valueOf(com/facebook/share/internal/z, s);
    }

    public static z[] values()
    {
        return (z[])c.clone();
    }

    public final String a()
    {
        return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    }

    public final int b()
    {
        return b;
    }

    static 
    {
        a = new z("OG_ACTION_DIALOG");
        c = (new z[] {
            a
        });
    }
}
