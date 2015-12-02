// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.app.ProgressDialog;
import android.os.Handler;

// Referenced classes of package com.facebook.orca.camera:
//            y, ac, x

class ab extends y
    implements Runnable
{

    private final x a;
    private final ProgressDialog b;
    private final Runnable c;
    private final Handler d;
    private final Runnable e = new ac(this);

    public ab(x x1, Runnable runnable, ProgressDialog progressdialog, Handler handler)
    {
        a = x1;
        b = progressdialog;
        c = runnable;
        a.a(this);
        d = handler;
    }

    static x a(ab ab1)
    {
        return ab1.a;
    }

    static ProgressDialog b(ab ab1)
    {
        return ab1.b;
    }

    public void b(x x1)
    {
        e.run();
        d.removeCallbacks(e);
    }

    public void c(x x1)
    {
        b.show();
    }

    public void d(x x1)
    {
        b.hide();
    }

    public void run()
    {
        c.run();
        d.post(e);
        return;
        Exception exception;
        exception;
        d.post(e);
        throw exception;
    }
}
