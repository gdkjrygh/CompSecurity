// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.fps;

import android.app.Activity;
import android.view.Window;
import com.google.common.a.fi;
import com.google.common.a.hy;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.debug.fps:
//            b, k, i, c

public class a
{

    private final javax.inject.a a;
    private final com.facebook.common.executors.a b;
    private final b c = new b(this);
    private final ConcurrentMap d = (new hy()).f().h().n();
    private fi e;
    private boolean f;
    private volatile Activity g;
    private Activity h;
    private c i;

    public a(javax.inject.a a1, com.facebook.common.executors.a a2)
    {
        a = a1;
        b = a2;
    }

    static Activity a(a a1, Activity activity)
    {
        a1.g = activity;
        return activity;
    }

    static fi a(a a1, fi fi1)
    {
        a1.e = fi1;
        return fi1;
    }

    static javax.inject.a a(a a1)
    {
        return a1.a;
    }

    static Activity b(a a1)
    {
        return a1.g;
    }

    static Activity b(a a1, Activity activity)
    {
        a1.h = activity;
        return activity;
    }

    static fi c(a a1)
    {
        return a1.e;
    }

    private void c()
    {
        b.a();
        fi fi1 = h();
        boolean flag;
        if (fi1.contains(k.ENABLE) && g != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            d();
            f();
            i j = b();
            if (j != null)
            {
                j.setEnableRecordingData(fi1.contains(k.ENABLE_RECORD_DATA));
                j.setEnableFrameCounter(fi1.contains(k.ENABLE_FRAME_COUNTER));
                j.setEnableOutputToLogcat(fi1.contains(k.ENABLE_OUTPUT_TO_LOGCAT));
            }
            return;
        } else
        {
            g();
            e();
            return;
        }
    }

    private void d()
    {
        b.a();
        if (g == null)
        {
            return;
        }
        i l = b();
        i j = l;
        if (l == null)
        {
            j = new i(g);
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(700, 100, 48);
            g.getWindow().addContentView(j, layoutparams);
            d.put(g, j);
        }
        j.setVisibility(0);
        j.bringToFront();
    }

    static void d(a a1)
    {
        a1.c();
    }

    static fi e(a a1)
    {
        return a1.h();
    }

    private void e()
    {
        i j = b();
        if (j != null)
        {
            j.setVisibility(4);
        }
    }

    static ConcurrentMap f(a a1)
    {
        return a1.d;
    }

    private void f()
    {
        b.a();
        if (i == null)
        {
            i = new c(this);
            i.start();
        }
    }

    private void g()
    {
        b.a();
        if (i != null)
        {
            i.a = true;
            i = null;
        }
    }

    private fi h()
    {
        if (f)
        {
            return fi.a(k.ENABLE, k.ENABLE_RECORD_DATA);
        } else
        {
            return e;
        }
    }

    public b a()
    {
        return c;
    }

    public void a(String s)
    {
        i j = b();
        if (j != null)
        {
            j.a(s);
        }
    }

    i b()
    {
        if (h == null)
        {
            return null;
        } else
        {
            return (i)d.get(h);
        }
    }
}
