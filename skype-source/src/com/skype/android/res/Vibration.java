// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import android.media.AudioManager;
import android.os.Vibrator;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.wakeup.ForegroundState;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import javax.inject.Provider;

public class Vibration
{

    Vibrator a;
    AudioManager b;
    ForegroundState c;
    Provider d;
    private HashMap e;

    public Vibration()
    {
        e = new HashMap();
    }

    private boolean a(boolean flag)
    {
        if (!((UserPreferences)d.get()).isVibrateEnabled())
        {
            return false;
        }
        if (b.getRingerMode() != 1)
        {
            return false;
        }
        if (c.c() && !flag)
        {
            return false;
        } else
        {
            return a.hasVibrator();
        }
    }

    public final void a()
    {
        for (Iterator iterator = e.values().iterator(); iterator.hasNext(); ((Timer)iterator.next()).cancel()) { }
        e.clear();
    }

    public final void a(int i)
    {
        if (e.containsKey(Integer.valueOf(i)))
        {
            ((Timer)e.get(Integer.valueOf(i))).cancel();
            e.remove(Integer.valueOf(i));
        }
    }

    public final void a(int i, boolean flag)
    {
        while (!a(flag) || e.containsKey(Integer.valueOf(i))) 
        {
            return;
        }
        Timer timer = new Timer(true);
        timer.schedule(new TimerTask() {

            final Vibration a;

            public final void run()
            {
                a.a.vibrate(750L);
            }

            
            {
                a = Vibration.this;
                super();
            }
        }, 0L, 2000L);
        e.put(Integer.valueOf(i), timer);
    }

    public final void b()
    {
        if (!a(true))
        {
            return;
        } else
        {
            a.vibrate(750L);
            return;
        }
    }

    public final boolean b(int i)
    {
        return e.containsKey(Integer.valueOf(i));
    }
}
