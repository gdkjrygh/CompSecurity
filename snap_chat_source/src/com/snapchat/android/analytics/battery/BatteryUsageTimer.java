// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.battery;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;

public final class BatteryUsageTimer
{
    public static final class TimerType extends Enum
    {

        private static final TimerType $VALUES[];
        public static final TimerType CAMERA_PAGE;
        public static final TimerType CAMERA_RUNNING;
        public static final TimerType CHAT_PAGE;
        public static final TimerType DISCOVER_PAGE;
        public static final TimerType FEED_PAGE;
        public static final TimerType FRIENDS_PAGE;
        public static final TimerType ON_WIFI;
        public static final TimerType ON_WWAN;
        public static final TimerType STORIES_PAGE;
        public static final TimerType UNKNOWN;
        private final String a;
        private final boolean b;

        public static TimerType fromPagerId(int i)
        {
            switch (i)
            {
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            default:
                return UNKNOWN;

            case 2: // '\002'
                return CAMERA_PAGE;

            case 0: // '\0'
                return CHAT_PAGE;

            case 4: // '\004'
                return DISCOVER_PAGE;

            case 1: // '\001'
                return FEED_PAGE;

            case 11: // '\013'
                return FRIENDS_PAGE;

            case 3: // '\003'
                return STORIES_PAGE;
            }
        }

        public static TimerType valueOf(String s)
        {
            return (TimerType)Enum.valueOf(com/snapchat/android/analytics/battery/BatteryUsageTimer$TimerType, s);
        }

        public static TimerType[] values()
        {
            return (TimerType[])$VALUES.clone();
        }

        public final boolean isPage()
        {
            return b;
        }

        public final String toString()
        {
            if (a == null)
            {
                return "null";
            } else
            {
                return a;
            }
        }

        static 
        {
            UNKNOWN = new TimerType("UNKNOWN", 0, "UNKNOWN", true);
            CAMERA_RUNNING = new TimerType("CAMERA_RUNNING", 1, "CAMERA_RUNNING", false);
            CAMERA_PAGE = new TimerType("CAMERA_PAGE", 2, "CAMERA_PAGE", true);
            STORIES_PAGE = new TimerType("STORIES_PAGE", 3, "STORIES_PAGE", true);
            DISCOVER_PAGE = new TimerType("DISCOVER_PAGE", 4, "DISCOVER_PAGE", true);
            CHAT_PAGE = new TimerType("CHAT_PAGE", 5, "CHAT_PAGE", true);
            FRIENDS_PAGE = new TimerType("FRIENDS_PAGE", 6, "FRIENDS_PAGE", true);
            FEED_PAGE = new TimerType("FEED_PAGE", 7, "FEED_PAGE", true);
            ON_WIFI = new TimerType("ON_WIFI", 8, "ON_WIFI", false);
            ON_WWAN = new TimerType("ON_WWAN", 9, "ON_WWAN", false);
            $VALUES = (new TimerType[] {
                UNKNOWN, CAMERA_RUNNING, CAMERA_PAGE, STORIES_PAGE, DISCOVER_PAGE, CHAT_PAGE, FRIENDS_PAGE, FEED_PAGE, ON_WIFI, ON_WWAN
            });
        }

        private TimerType(String s, int i, String s1, boolean flag)
        {
            super(s, i);
            a = s1;
            b = flag;
        }
    }


    public final AtomicLong a = new AtomicLong(0L);
    public final TimerType b;
    private long c;

    public BatteryUsageTimer(TimerType timertype)
    {
        c = -1L;
        b = timertype;
    }

    public final long a()
    {
        if (c == -1L)
        {
            return -1L;
        } else
        {
            long l = SystemClock.elapsedRealtime();
            long l1 = c;
            a.getAndAdd(l - l1);
            c = l;
            return l;
        }
    }

    public final void b()
    {
        if (c == -1L)
        {
            c = SystemClock.elapsedRealtime();
            return;
        } else
        {
            c = a();
            return;
        }
    }

    public final void c()
    {
        a();
        c = -1L;
    }

    public final void d()
    {
        boolean flag;
        if (c != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.set(0L);
        c = -1L;
        if (flag)
        {
            b();
        }
    }
}
