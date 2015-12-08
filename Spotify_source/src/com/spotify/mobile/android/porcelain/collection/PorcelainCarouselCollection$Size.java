// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.collection;

import ctv;

public final class small extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final ctv e = new ctv() {

        public final Object a(Object obj)
        {
            return Integer.valueOf(((PorcelainCarouselCollection.Size)obj).viewType);
        }

    };
    private static final viewType f[];
    public final boolean compact;
    public final boolean small;
    public final int viewType;

    static ctv a()
    {
        return e;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/spotify/mobile/android/porcelain/collection/PorcelainCarouselCollection$Size, s);
    }

    public static e[] values()
    {
        return (e[])f.clone();
    }

    static 
    {
        a = new <init>("NORMAL", 0, 0x7f1100ef, false, false);
        b = new <init>("COMPACT", 1, 0x7f1100f0, true, false);
        c = new <init>("SMALL", 2, 0x7f1100f2, false, true);
        d = new <init>("SMALL_COMPACT", 3, 0x7f1100f1, true, true);
        f = (new f[] {
            a, b, c, d
        });
    }

    private _cls1(String s, int i, int j, boolean flag, boolean flag1)
    {
        super(s, i);
        viewType = j;
        compact = flag;
        small = flag1;
    }
}
