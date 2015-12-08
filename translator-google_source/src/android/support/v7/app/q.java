// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.support.v7.internal.view.f;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            p, r, a, o

abstract class q extends p
{

    final Context a;
    final Window b;
    final android.view.Window.Callback c;
    final android.view.Window.Callback d;
    final o e;
    a f;
    MenuInflater g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    CharSequence m;
    boolean n;

    q(Context context, Window window, o o)
    {
        a = context;
        b = window;
        e = o;
        c = b.getCallback();
        if (c instanceof r)
        {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        } else
        {
            d = a(c);
            b.setCallback(d);
            return;
        }
    }

    public final a a()
    {
        j();
        return f;
    }

    android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new r(this, callback);
    }

    public final void a(CharSequence charsequence)
    {
        m = charsequence;
        b(charsequence);
    }

    abstract boolean a(int i1, KeyEvent keyevent);

    abstract boolean a(KeyEvent keyevent);

    public final MenuInflater b()
    {
        if (g == null)
        {
            j();
            Context context;
            if (f != null)
            {
                context = f.b();
            } else
            {
                context = a;
            }
            g = new f(context);
        }
        return g;
    }

    abstract void b(CharSequence charsequence);

    abstract void c(int i1);

    abstract boolean d(int i1);

    public final void h()
    {
        n = true;
    }

    abstract void j();

    final Context k()
    {
        Context context = null;
        Object obj = a();
        if (obj != null)
        {
            context = ((a) (obj)).b();
        }
        obj = context;
        if (context == null)
        {
            obj = a;
        }
        return ((Context) (obj));
    }
}
