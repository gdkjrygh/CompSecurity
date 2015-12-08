// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.app.Activity;
import android.os.Looper;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.crashlytics.android.internal:
//            bj, bg, i, j, 
//            p, u, ba, s, 
//            v, R, o, q, 
//            t, bu, aj

class n
    implements bj
{

    t a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final ScheduledExecutorService j;

    public n(String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
            j j1, bu bu)
    {
        this(s1, s2, s3, s4, s5, s6, s7, j1, bg.b("Crashlytics SAM"), bu);
    }

    n(String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
            j j1, ScheduledExecutorService scheduledexecutorservice, bu bu)
    {
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        f = s5;
        g = s6;
        h = s7;
        i = UUID.randomUUID().toString();
        j = scheduledexecutorservice;
        a = new i(scheduledexecutorservice, j1, bu);
        j1.a(this);
    }

    static String a(n n1)
    {
        return n1.b;
    }

    private void a(u u1, boolean flag)
    {
        a(((Runnable) (new p(this, u1, flag))));
    }

    private void a(v v1, Activity activity, boolean flag)
    {
        a(u.a(b, i, c, d, e, f, g, h, v1, Collections.singletonMap("activity", activity.getClass().getName())), false);
    }

    private void a(Runnable runnable)
    {
        try
        {
            j.submit(runnable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            ba.d("Crashlytics failed to submit analytics task");
        }
    }

    static String b(n n1)
    {
        return n1.i;
    }

    static String c(n n1)
    {
        return n1.c;
    }

    static String d(n n1)
    {
        return n1.d;
    }

    static String e(n n1)
    {
        return n1.e;
    }

    static String f(n n1)
    {
        return n1.f;
    }

    static String g(n n1)
    {
        return n1.g;
    }

    static String h(n n1)
    {
        return n1.h;
    }

    void a()
    {
        a(((Runnable) (new s(this))));
    }

    public final void a(Activity activity)
    {
        a(v.a, activity, false);
    }

    final void a(aj aj, String s1)
    {
        a(((Runnable) (new R(this, aj, s1))));
    }

    public final void a(String s1)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("onCrash called from main thread!!!");
        }
        s1 = new o(this, s1);
        try
        {
            j.submit(s1).get();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            ba.d("Crashlytics failed to run analytics task");
        }
    }

    public final void b()
    {
        a(u.a(b, i, c, d, e, f, g, h, v.j, new HashMap()), true);
    }

    public final void b(Activity activity)
    {
        a(v.g, activity, false);
    }

    public final void b(String s1)
    {
        String s2 = b;
        String s3 = i;
        String s4 = c;
        String s5 = d;
        String s6 = e;
        String s7 = f;
        String s8 = g;
        String s9 = h;
        s1 = Collections.singletonMap("sessionId", s1);
        a(u.a(s2, s3, s4, s5, s6, s7, s8, s9, v.h, s1), false);
    }

    public final void c()
    {
        a(new q(this));
    }

    public final void c(Activity activity)
    {
        a(v.e, activity, false);
    }

    public final void d(Activity activity)
    {
        a(v.c, activity, false);
    }

    public final void e(Activity activity)
    {
        a(v.d, activity, false);
    }

    public final void f(Activity activity)
    {
        a(v.b, activity, false);
    }

    public final void g(Activity activity)
    {
        a(v.f, activity, false);
    }
}
