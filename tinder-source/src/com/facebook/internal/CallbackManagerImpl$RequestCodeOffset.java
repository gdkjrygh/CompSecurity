// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.g;

// Referenced classes of package com.facebook.internal:
//            CallbackManagerImpl

public static final class i extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h j[];
    private final int i;

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/facebook/internal/CallbackManagerImpl$RequestCodeOffset, s);
    }

    public static i[] values()
    {
        return (i[])j.clone();
    }

    public final int a()
    {
        return com.facebook.g.m() + i;
    }

    static 
    {
        a = new <init>("Login", 0, 0);
        b = new <init>("Share", 1, 1);
        c = new <init>("Message", 2, 2);
        d = new <init>("Like", 3, 3);
        e = new <init>("GameRequest", 4, 4);
        f = new <init>("AppGroupCreate", 5, 5);
        g = new <init>("AppGroupJoin", 6, 6);
        h = new <init>("AppInvite", 7, 7);
        j = (new j[] {
            a, b, c, d, e, f, g, h
        });
    }

    private A(String s, int k, int l)
    {
        super(s, k);
        i = l;
    }
}
