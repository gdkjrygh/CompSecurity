// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.apps.photos.stories.StoryLayout;

public final class irj
{

    public int a;
    boolean b;
    public boolean c;
    public long d;
    final ObjectAnimator e;
    final StoryLayout f;
    private final SharedPreferences g;

    public irj(StoryLayout storylayout, iot iot, int i)
    {
        f = storylayout;
        super();
        b = false;
        c = false;
        d = -1L;
        e = ObjectAnimator.ofInt(iot, "xOffset", new int[] {
            0, i
        });
        e.setInterpolator(new irl(this));
        e.setDuration(800L);
        g = storylayout.getContext().getSharedPreferences("bouncer", 0);
        a = g.getInt("abort_count", 0);
    }

    public final void a()
    {
        if (b)
        {
            android.content.SharedPreferences.Editor editor = g.edit();
            int i = a + 1;
            a = i;
            editor.putInt("abort_count", i);
            editor.commit();
        }
        b = false;
        c = false;
        e.cancel();
        d = -1L;
    }

    public final void a(long l)
    {
        if (b)
        {
            return;
        } else
        {
            b = true;
            e.setStartDelay(l);
            e.start();
            b();
            e.addListener(new irk(this));
            return;
        }
    }

    void b()
    {
        d = SystemClock.elapsedRealtime() + e.getStartDelay();
    }
}
