// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.common.task;

import com.google.common.base.Optional;
import ctz;

public class TimeoutOrError
{

    public final What a;
    public final Optional b;
    public final long c;

    private TimeoutOrError(What what, Object obj, long l)
    {
        boolean flag1 = true;
        super();
        a = what;
        b = Optional.c(obj);
        c = l;
        boolean flag2 = b.b();
        boolean flag;
        if (a == What.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag2 == flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ctz.a(flag);
    }

    public TimeoutOrError(What what, Object obj, long l, byte byte0)
    {
        this(what, obj, l);
    }

    private class What extends Enum
    {

        public static final What a;
        public static final What b;
        private static final What c[];

        public static What valueOf(String s)
        {
            return (What)Enum.valueOf(com/spotify/mobile/android/spotlets/common/task/TimeoutOrError$What, s);
        }

        public static What[] values()
        {
            return (What[])c.clone();
        }

        static 
        {
            a = new What("ERROR", 0);
            b = new What("TIMEOUT", 1);
            c = (new What[] {
                a, b
            });
        }

        private What(String s, int i)
        {
            super(s, i);
        }
    }

}
