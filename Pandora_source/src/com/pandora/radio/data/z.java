// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.os.SystemClock;

public class z
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        private static final a i[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/radio/data/z$a, s);
        }

        public static a[] values()
        {
            return (a[])i.clone();
        }

        static 
        {
            a = new a("app_launched", 0);
            b = new a("playback_resumed", 1);
            c = new a("smarturl_station_created", 2);
            d = new a("smarturl_station_played", 3);
            e = new a("station_changed", 4);
            f = new a("station_created", 5);
            g = new a("track_skipped", 6);
            h = new a("track_thumbs_down", 7);
            i = (new a[] {
                a, b, c, d, e, f, g, h
            });
        }

        private a(String s, int j)
        {
            super(s, j);
        }
    }


    public final a a;
    private final long b;

    public z(a a1, long l)
    {
        b = l;
        a = a1;
    }

    public static a a(boolean flag, p.cx.x.e e)
    {
        boolean flag1;
        if (e == p.cx.x.e.g)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag)
        {
            if (flag1)
            {
                return a.c;
            } else
            {
                return a.f;
            }
        }
        if (flag1)
        {
            return a.d;
        } else
        {
            return a.e;
        }
    }

    public long a()
    {
        return SystemClock.elapsedRealtime() - b;
    }
}
