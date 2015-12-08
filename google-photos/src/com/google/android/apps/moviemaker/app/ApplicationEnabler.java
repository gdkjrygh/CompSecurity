// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import b;
import ble;
import bnl;
import com.google.android.apps.moviemaker.MovieMakerActivity;
import java.util.concurrent.Executor;
import noj;

public class ApplicationEnabler
{

    private static final Class a[] = {
        com/google/android/apps/moviemaker/MovieMakerActivity
    };
    private static final Class b[] = new Class[0];
    private final Context c;
    private final PackageManager d;
    private final noj e;
    private final bnl f;
    private final Executor g;
    private final Runnable h = new ble(this);

    public ApplicationEnabler(Context context, PackageManager packagemanager, bnl bnl1, noj noj1, Executor executor)
    {
        c = (Context)b.a(context, "context", null);
        d = (PackageManager)b.a(packagemanager, "packageManager", null);
        f = (bnl)b.a(bnl1, "gservicesSettings", null);
        e = (noj)b.a(noj1, "movieMakerProvider", null);
        g = (Executor)b.a(executor, "executor", null);
    }

    public static noj a(ApplicationEnabler applicationenabler)
    {
        return applicationenabler.e;
    }

    public static void a(ApplicationEnabler applicationenabler, int i)
    {
        boolean flag = false;
        Class aclass[] = a;
        int l = aclass.length;
        for (int j = 0; j < l; j++)
        {
            Object obj = aclass[j];
            obj = new ComponentName(applicationenabler.c, ((Class) (obj)));
            applicationenabler.d.setComponentEnabledSetting(((ComponentName) (obj)), 0, 1);
        }

        aclass = b;
        l = aclass.length;
        for (int k = ((flag) ? 1 : 0); k < l; k++)
        {
            Object obj1 = aclass[k];
            obj1 = new ComponentName(applicationenabler.c, ((Class) (obj1)));
            applicationenabler.d.setComponentEnabledSetting(((ComponentName) (obj1)), i, 1);
        }

    }

    public static bnl b(ApplicationEnabler applicationenabler)
    {
        return applicationenabler.f;
    }

    public final void a()
    {
        g.execute(h);
    }

    static 
    {
        com/google/android/apps/moviemaker/app/ApplicationEnabler.getSimpleName();
    }
}
