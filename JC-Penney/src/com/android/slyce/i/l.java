// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.i;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;

// Referenced classes of package com.android.slyce.i:
//            f, i, r, g, 
//            q, p, n, e, 
//            s

public class l extends Handler
    implements f, i, r
{

    private Activity a;
    private p b;
    private g c;
    private q d;
    private n e;
    private boolean f;
    private int g;

    public l(Activity activity, p p1, SurfaceView surfaceview)
    {
        c = null;
        d = null;
        e = null;
        f = false;
        g = 0;
        a = activity;
        b = p1;
        c = new g(this);
        d = new q(surfaceview, this);
    }

    private boolean c()
    {
        return a.getResources().getConfiguration().orientation == 1;
    }

    private int d()
    {
        return a.getWindowManager().getDefaultDisplay().getRotation();
    }

    public void a()
    {
        f = false;
    }

    public void a(SurfaceHolder surfaceholder, s s)
    {
        c.b();
        c.a(s, c(), d());
        g = 4;
        c.a(surfaceholder);
    }

    public void a(Exception exception)
    {
        b.a(exception);
    }

    public void a(boolean flag)
    {
        g = 3;
        d.a();
        b.a(flag);
    }

    public void a(boolean flag, Rect rect)
    {
        c.a(flag, rect);
    }

    public void a(boolean flag, boolean flag1)
    {
        g = 1;
        e = new n(b, null);
        e.start();
        g = 2;
        c.a(flag, flag1);
    }

    public void a(byte abyte0[], s s, int j)
    {
        if (!b.h() || f)
        {
            return;
        } else
        {
            f = true;
            abyte0 = new e(this, abyte0, s, j);
            n.a(e, abyte0);
            return;
        }
    }

    public void b()
    {
        if (g == 4)
        {
            c.b();
        }
        if (g >= 3)
        {
            d.b();
        }
        if (g >= 2)
        {
            c.a();
        }
        if (g >= 1)
        {
            n.a(e);
            e = null;
        }
        g = 0;
    }
}
