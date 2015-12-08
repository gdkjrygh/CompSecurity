// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import a.a.a.a.a.b.t;
import a.a.a.a.a.d.i;
import a.a.a.a.a.e.m;
import a.a.a.a.f;
import a.a.a.a.p;
import a.a.a.a.s;
import android.content.Context;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.b.a.a:
//            l, d, c, g, 
//            e, f, w, h, 
//            ac, y

final class b
    implements i
{

    final ScheduledExecutorService a;
    w b;
    private final p c;
    private final Context d;
    private final h e;
    private final ac f;
    private final m g;

    public b(p p, Context context, h h, ac ac, m m)
    {
        this(p, context, h, ac, m, t.b("Answers Events Handler"));
    }

    private b(p p, Context context, h h, ac ac, m m, ScheduledExecutorService scheduledexecutorservice)
    {
        b = new l();
        c = p;
        d = context;
        e = h;
        f = ac;
        g = m;
        a = scheduledexecutorservice;
    }

    static ac a(b b1)
    {
        return b1.f;
    }

    private void a(Runnable runnable)
    {
        try
        {
            a.submit(runnable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            a.a.a.a.f.d().b("Answers", "Failed to submit events task", runnable);
        }
    }

    static h b(b b1)
    {
        return b1.e;
    }

    static p c(b b1)
    {
        return b1.c;
    }

    static Context d(b b1)
    {
        return b1.d;
    }

    static m e(b b1)
    {
        return b1.g;
    }

    public final void a()
    {
        a(((Runnable) (new d(this))));
    }

    public final void a(a.a.a.a.a.g.b b1, String s1)
    {
        a(((Runnable) (new c(this, b1, s1))));
    }

    public final void a(y y)
    {
        a(y, false, false);
    }

    final void a(y y, boolean flag, boolean flag1)
    {
        y = new g(this, y, flag1);
        if (flag)
        {
            try
            {
                a.submit(y).get();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (y y)
            {
                a.a.a.a.f.d().b("Answers", "Failed to run events task", y);
            }
            return;
        } else
        {
            a(((Runnable) (y)));
            return;
        }
    }

    public final void b()
    {
        a(new e(this));
    }

    public final void c()
    {
        a(new com.b.a.a.f(this));
    }
}
