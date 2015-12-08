// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;

import android.app.ProgressDialog;
import android.os.Handler;

// Referenced classes of package com.android.slyce.crop:
//            v, aa, u

class z extends v
    implements Runnable
{

    private final u a;
    private final ProgressDialog b;
    private final Runnable c;
    private final Handler d;
    private final Runnable e = new aa(this);

    public z(u u1, Runnable runnable, ProgressDialog progressdialog, Handler handler)
    {
        a = u1;
        b = progressdialog;
        c = runnable;
        a.a(this);
        d = handler;
    }

    static u a(z z1)
    {
        return z1.a;
    }

    static ProgressDialog b(z z1)
    {
        return z1.b;
    }

    public void b(u u1)
    {
        e.run();
        d.removeCallbacks(e);
    }

    public void c(u u1)
    {
        b.show();
    }

    public void d(u u1)
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
