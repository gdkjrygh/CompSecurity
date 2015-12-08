// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util.notifications;

import android.widget.RemoteViews;
import com.spotify.mobile.android.util.Assertion;

public final class NotificationButtonHelper
{

    private int a;
    private int b;
    private int c;

    public NotificationButtonHelper(int i, int j)
    {
        a = i;
        b = j;
        c = 0;
    }

    public NotificationButtonHelper(int i, int j, int k)
    {
        a = i;
        b = j;
        c = k;
    }

    public final void a(RemoteViews remoteviews, Visibility visibility)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Visibility.values().length];
                try
                {
                    a[Visibility.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Visibility.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Visibility.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Visibility.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[visibility.ordinal()];
        JVM INSTR tableswitch 1 4: default 40
    //                   1 46
    //                   2 83
    //                   3 120
    //                   4 157;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        Assertion.a("Invalid NotificationButtonHelper visibility");
_L7:
        return;
_L2:
        remoteviews.setViewVisibility(a, 0);
        remoteviews.setViewVisibility(b, 8);
        if (c > 0)
        {
            remoteviews.setViewVisibility(c, 8);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        remoteviews.setViewVisibility(a, 8);
        remoteviews.setViewVisibility(b, 0);
        if (c > 0)
        {
            remoteviews.setViewVisibility(c, 8);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (c > 0)
        {
            remoteviews.setViewVisibility(a, 8);
            remoteviews.setViewVisibility(b, 8);
            remoteviews.setViewVisibility(c, 0);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        remoteviews.setViewVisibility(a, 8);
        remoteviews.setViewVisibility(b, 8);
        if (c > 0)
        {
            remoteviews.setViewVisibility(c, 8);
            return;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(RemoteViews remoteviews, boolean flag)
    {
        Visibility visibility;
        if (flag)
        {
            visibility = Visibility.a;
        } else
        {
            visibility = Visibility.b;
        }
        a(remoteviews, visibility);
    }

    private class Visibility extends Enum
    {

        public static final Visibility a;
        public static final Visibility b;
        public static final Visibility c;
        public static final Visibility d;
        private static final Visibility e[];

        public static Visibility valueOf(String s)
        {
            return (Visibility)Enum.valueOf(com/spotify/mobile/android/util/notifications/NotificationButtonHelper$Visibility, s);
        }

        public static Visibility[] values()
        {
            return (Visibility[])e.clone();
        }

        static 
        {
            a = new Visibility("NORMAL", 0);
            b = new Visibility("DISABLED", 1);
            c = new Visibility("SELECTED", 2);
            d = new Visibility("GONE", 3);
            e = (new Visibility[] {
                a, b, c, d
            });
        }

        private Visibility(String s, int i)
        {
            super(s, i);
        }
    }

}
