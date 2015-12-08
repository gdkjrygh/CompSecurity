// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.internal.n;

public final class B extends Enum
    implements n
{

    public static final B a;
    private static final B c[];
    private int b;

    private B(String s)
    {
        super(s, 0);
        b = 0x13350ac;
    }

    public static B valueOf(String s)
    {
        return (B)Enum.valueOf(com/facebook/share/internal/B, s);
    }

    public static B[] values()
    {
        return (B[])c.clone();
    }

    public final String a()
    {
        return "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
    }

    public final int b()
    {
        return b;
    }

    static 
    {
        a = new B("OG_MESSAGE_DIALOG");
        c = (new B[] {
            a
        });
    }
}
