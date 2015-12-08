// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package eu.janmuller.android.simplecropimage;

import android.app.ProgressDialog;
import android.os.Handler;
import java.util.ArrayList;

// Referenced classes of package eu.janmuller.android.simplecropimage:
//            b

public final class e
{
    private static final class a extends b.a
        implements Runnable
    {

        final b a;
        final ProgressDialog b;
        private final Runnable c;
        private final Handler d;
        private final Runnable e = new _cls1(this);

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

        public a(b b1, Runnable runnable, ProgressDialog progressdialog, Handler handler)
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


    // Unreferenced inner class eu/janmuller/android/simplecropimage/e$a$1

/* anonymous class */
    final class a._cls1
        implements Runnable
    {

        final a a;

        public final void run()
        {
            b b1 = a.a;
            a a1 = a;
            b1.f.remove(a1);
            if (a.b.getWindow() != null)
            {
                a.b.dismiss();
            }
        }

            
            {
                a = a1;
                super();
            }
    }

}
