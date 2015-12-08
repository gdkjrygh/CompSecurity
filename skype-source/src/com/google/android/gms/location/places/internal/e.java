// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class e
{

    private static final String a = com/google/android/gms/location/places/internal/e.getSimpleName();
    private static final long b;
    private final Handler c;
    private final Runnable d;
    private final Object e;
    private ArrayList f;
    private ArrayList g;

    public final void a(String s, String s1)
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new ArrayList();
            g = new ArrayList();
            c.postDelayed(d, b);
        }
        f.add(s);
        g.add(s1);
        if (f.size() >= 10000)
        {
            if (Log.isLoggable(a, 5))
            {
                Log.w(a, "Event buffer full, flushing");
            }
            d.run();
            c.removeCallbacks(d);
            return;
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    static 
    {
        b = TimeUnit.SECONDS.toMillis(1L);
    }
}
