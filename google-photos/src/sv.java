// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.Window;

abstract class sv extends su
{

    final Context a;
    final Window b;
    final android.view.Window.Callback c;
    final android.view.Window.Callback d;
    final st e;
    rv f;
    MenuInflater g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    CharSequence m;
    boolean n;

    sv(Context context, Window window, st st)
    {
        a = context;
        b = window;
        e = st;
        c = b.getCallback();
        if (c instanceof sx)
        {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        } else
        {
            d = a(c);
            b.setCallback(d);
            return;
        }
    }

    android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new sx(this, callback);
    }

    public final rv a()
    {
        j();
        return f;
    }

    public void a(Bundle bundle)
    {
        bundle = a.obtainStyledAttributes(uh.bs);
        if (!bundle.hasValue(uh.bw))
        {
            bundle.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (!bundle.getBoolean(uh.bF, false)) goto _L2; else goto _L1
_L1:
        b(1);
_L4:
        if (bundle.getBoolean(uh.bx, false))
        {
            b(109);
        }
        if (bundle.getBoolean(uh.by, false))
        {
            b(10);
        }
        k = bundle.getBoolean(uh.bu, false);
        bundle.recycle();
        return;
_L2:
        if (bundle.getBoolean(uh.bw, false))
        {
            b(108);
        }
        if (true) goto _L4; else goto _L3
_L3:
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
                context = f.g();
            } else
            {
                context = a;
            }
            g = new vg(context);
        }
        return g;
    }

    abstract void b(CharSequence charsequence);

    abstract void c(int i1);

    abstract boolean d(int i1);

    public final void g()
    {
        n = true;
    }

    public final sb h()
    {
        return new sw(this);
    }

    abstract void j();

    final Context k()
    {
        Context context = null;
        Object obj = a();
        if (obj != null)
        {
            context = ((rv) (obj)).g();
        }
        obj = context;
        if (context == null)
        {
            obj = a;
        }
        return ((Context) (obj));
    }
}
