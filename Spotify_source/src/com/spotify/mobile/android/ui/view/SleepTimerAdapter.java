// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import dgo;
import dhu;
import dhv;
import dhw;

public final class SleepTimerAdapter extends BaseAdapter
{

    public TimerPresets a;
    private final TimerPresets b[];

    public final int getCount()
    {
        return b.length;
    }

    public final Object getItem(int i)
    {
        return b[i];
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = dhu.b(view);
        if (view == null)
        {
            view = dhv.b(null, viewgroup);
            dgo.b(null, ((dhw)view.u()).a(), 0x7f0101e2);
        }
        viewgroup = b[i];
        ((dhw)view.u()).a().setText(TimerPresets.a(viewgroup));
        if (viewgroup != a) goto _L2; else goto _L1
_L1:
        if (viewgroup != TimerPresets.a) goto _L4; else goto _L3
_L3:
        view.b(false);
_L6:
        return view.v();
_L4:
        view = SpotifyIcon.h;
        throw new NullPointerException();
_L2:
        view.a(null);
        view.b(true);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private class TimerPresets extends Enum
    {

        public static final TimerPresets a;
        private static TimerPresets b;
        private static TimerPresets c;
        private static TimerPresets d;
        private static TimerPresets e;
        private static TimerPresets f;
        private static TimerPresets g;
        private static final TimerPresets h[];
        public long mDuration;
        private int mTitle;

        static int a(TimerPresets timerpresets)
        {
            return timerpresets.mTitle;
        }

        public static TimerPresets valueOf(String s)
        {
            return (TimerPresets)Enum.valueOf(com/spotify/mobile/android/ui/view/SleepTimerAdapter$TimerPresets, s);
        }

        public static TimerPresets[] values()
        {
            return (TimerPresets[])h.clone();
        }

        static 
        {
            a = new TimerPresets("TURN_TIMER_OFF", 0, 0L, 0x7f080513);
            b = new TimerPresets("FIVE_MINUTES", 1, TimeUnit.MINUTES.toMillis(5L), 0x7f08050d);
            c = new TimerPresets("TEN_MINUTES", 2, TimeUnit.MINUTES.toMillis(10L), 0x7f080510);
            d = new TimerPresets("FIFTEEN_MINUTES", 3, TimeUnit.MINUTES.toMillis(15L), 0x7f08050c);
            e = new TimerPresets("THIRTY_MINUTES", 4, TimeUnit.MINUTES.toMillis(30L), 0x7f080511);
            f = new TimerPresets("FORTYFIVE_MINUTES", 5, TimeUnit.MINUTES.toMillis(45L), 0x7f08050e);
            g = new TimerPresets("SIXTY_MINUTES", 6, TimeUnit.HOURS.toMillis(1L), 0x7f08050f);
            h = (new TimerPresets[] {
                a, b, c, d, e, f, g
            });
        }

        private TimerPresets(String s, int i, long l, int j)
        {
            super(s, i);
            mDuration = l;
            mTitle = j;
        }
    }

}
