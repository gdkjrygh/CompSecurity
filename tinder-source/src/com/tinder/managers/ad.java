// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.SharedPreferences;
import com.tinder.events.EventLoggedIn;
import com.tinder.events.EventUnregisterManagers;
import de.greenrobot.event.c;
import java.util.Locale;

// Referenced classes of package com.tinder.managers:
//            ae

public final class ad
{

    boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    float e;
    public int f;
    public int g;
    boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    private final ae m;
    private final c n;

    public ad(ae ae1, c c1)
    {
        boolean flag1 = true;
        super();
        m = ae1;
        n = c1;
        n.a(this, false);
        a = ae.a.getBoolean("SETTINGS_IS_PUSH_ON", true);
        h = ae.a.getBoolean("ARE_FEMALES_LIKED", false);
        i = ae.a.getBoolean("ARE_MALES_LIKED", false);
        ae1 = ae.a;
        boolean flag = flag1;
        if (!Locale.US.equals(Locale.getDefault()))
        {
            if (Locale.UK.equals(Locale.getDefault()))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        j = ae1.getBoolean("PREFERS MILES", flag);
        k = ae.i();
        c = ae.g();
        d = ae.h();
        e = ae.n();
        g = ae.a.getInt("AGE_MAX", 55);
        f = ae.a.getInt("AGE_MIN", 18);
        b = ae.a.getBoolean("SETTINGS_CHANGED", false);
        l = ae.a.getBoolean("PASSPORT_PREFS_CHANGED", false);
    }

    public final float a()
    {
        (new StringBuilder("distance=")).append(e);
        return e;
    }

    public final void a(boolean flag)
    {
        j = flag;
        ae.b.putBoolean("PREFERS MILES", flag);
        ae.b.commit();
    }

    public final void b(boolean flag)
    {
        a = flag;
        ae.b.putBoolean("SETTINGS_IS_PUSH_ON", flag);
        ae.b.commit();
    }

    public final boolean b()
    {
        (new StringBuilder("areFemalesLiked=")).append(h);
        return h;
    }

    public final void c(boolean flag)
    {
        k = flag;
        flag = k;
        ae.b.putBoolean("DISCOVER ENABLED", flag);
        ae.b.commit();
    }

    public final void d(boolean flag)
    {
        b = flag;
        ae.b.putBoolean("SETTINGS_CHANGED", flag);
        ae.b.commit();
    }

    public final void e(boolean flag)
    {
        l = flag;
        ae.b.putBoolean("PASSPORT_PREFS_CHANGED", flag);
        ae.b.commit();
    }

    public final void onEvent(EventLoggedIn eventloggedin)
    {
        b(true);
    }

    public final void onEvent(EventUnregisterManagers eventunregistermanagers)
    {
        n.b(this);
    }
}
