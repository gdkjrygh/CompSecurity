// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.a.l;
import android.support.v7.c.a;
import android.support.v7.internal.a.b;
import android.support.v7.internal.view.f;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            n, p, ActionBar, m

abstract class o extends n
{

    final Context a;
    final Window b;
    final android.view.Window.Callback c;
    final m d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    private ActionBar j;
    private MenuInflater k;
    private CharSequence l;
    private boolean m;

    o(Context context, Window window, m m1)
    {
        a = context;
        b = window;
        d = m1;
        c = b.getCallback();
        if (c instanceof p)
        {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        } else
        {
            b.setCallback(a(c));
            return;
        }
    }

    public final ActionBar a()
    {
        if (!e) goto _L2; else goto _L1
_L1:
        if (j == null)
        {
            j = k();
        }
_L4:
        return j;
_L2:
        if (j instanceof b)
        {
            j = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    abstract a a(android.support.v7.c.b b1);

    android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new p(this, callback);
    }

    public void a(Bundle bundle)
    {
        bundle = a.obtainStyledAttributes(l.bb);
        if (!bundle.hasValue(l.bf))
        {
            bundle.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (bundle.getBoolean(l.bf, false))
        {
            e = true;
        }
        if (bundle.getBoolean(l.bg, false))
        {
            f = true;
        }
        if (bundle.getBoolean(l.bh, false))
        {
            g = true;
        }
        h = bundle.getBoolean(l.bd, false);
        i = bundle.getBoolean(l.bo, false);
        bundle.recycle();
    }

    public final void a(CharSequence charsequence)
    {
        l = charsequence;
        b(charsequence);
    }

    abstract boolean a(KeyEvent keyevent);

    public final MenuInflater b()
    {
        if (k == null)
        {
            k = new f(m());
        }
        return k;
    }

    abstract void b(CharSequence charsequence);

    abstract boolean b(int i1);

    abstract boolean b(KeyEvent keyevent);

    abstract boolean c(int i1);

    public final void h()
    {
        m = true;
    }

    abstract ActionBar k();

    final ActionBar l()
    {
        return j;
    }

    final Context m()
    {
        Context context = null;
        Object obj = a();
        if (obj != null)
        {
            context = ((ActionBar) (obj)).b();
        }
        obj = context;
        if (context == null)
        {
            obj = a;
        }
        return ((Context) (obj));
    }

    final boolean n()
    {
        return m;
    }

    final CharSequence o()
    {
        if (c instanceof Activity)
        {
            return ((Activity)c).getTitle();
        } else
        {
            return l;
        }
    }
}
