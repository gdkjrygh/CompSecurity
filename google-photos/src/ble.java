// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.moviemaker.app.ApplicationEnabler;

public final class ble
    implements Runnable
{

    private ApplicationEnabler a;

    public ble(ApplicationEnabler applicationenabler)
    {
        a = applicationenabler;
        super();
    }

    public final void run()
    {
        boolean flag;
        if (ApplicationEnabler.a(a).a() && ApplicationEnabler.b(a).A_() || ApplicationEnabler.a(a).c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            ApplicationEnabler.a(a, 0);
            return;
        } else
        {
            ApplicationEnabler.a(a, 2);
            return;
        }
    }
}
