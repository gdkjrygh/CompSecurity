// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package eu.janmuller.android.simplecropimage;

import android.app.ProgressDialog;
import android.os.Handler;
import java.util.ArrayList;

// Referenced classes of package eu.janmuller.android.simplecropimage:
//            e, b

private static final class d extends d
    implements Runnable
{

    final b a;
    final ProgressDialog b;
    private final Runnable c;
    private final Handler d;
    private final Runnable e = new Runnable() {

        final e.a a;

        public final void run()
        {
            b b2 = a.a;
            e.a a1 = a;
            b2.f.remove(a1);
            if (a.b.getWindow() != null)
            {
                a.b.dismiss();
            }
        }

            
            {
                a = e.a.this;
                super();
            }
    };

    public final void a()
    {
        e.run();
        d.removeCallbacks(e);
    }

    public final void b()
    {
        b.show();
    }

    public final void c()
    {
        b.hide();
    }

    public final void run()
    {
        c.run();
        d.post(e);
        return;
        Exception exception;
        exception;
        d.post(e);
        throw exception;
    }

    public _cls1.a(b b1, Runnable runnable, ProgressDialog progressdialog, Handler handler)
    {
        a = b1;
        b = progressdialog;
        c = runnable;
        b1 = a;
        if (!b1.f.contains(this))
        {
            b1.f.add(this);
        }
        d = handler;
    }
}
