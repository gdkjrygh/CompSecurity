// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.view.e;
import android.support.v7.internal.view.g;
import android.support.v7.internal.widget.p;
import android.support.v7.view.a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            e, ActionBar, d

abstract class f extends android.support.v7.app.e
{
    private final class a
        implements a.a
    {

        final f a;

        public final Drawable a()
        {
            p p1 = p.a(a.l(), null, new int[] {
                android.support.v7.appcompat.a.a.homeAsUpIndicator
            });
            Drawable drawable = p1.a(0);
            p1.b();
            return drawable;
        }

        public final void a(int i1)
        {
            ActionBar actionbar = a.a();
            if (actionbar != null)
            {
                actionbar.b(i1);
            }
        }

        public final void a(Drawable drawable, int i1)
        {
            ActionBar actionbar = a.a();
            if (actionbar != null)
            {
                actionbar.b(drawable);
                actionbar.b(i1);
            }
        }

        public final Context b()
        {
            return a.l();
        }

        public final boolean c()
        {
            ActionBar actionbar = a.a();
            return actionbar != null && (actionbar.e() & 4) != 0;
        }

        private a()
        {
            a = f.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    class b extends g
    {

        final f a;

        public boolean dispatchKeyEvent(KeyEvent keyevent)
        {
            return a.a(keyevent) || super.dispatchKeyEvent(keyevent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
        {
            return super.dispatchKeyShortcutEvent(keyevent) || a.a(keyevent.getKeyCode(), keyevent);
        }

        public void onContentChanged()
        {
        }

        public boolean onCreatePanelMenu(int i1, Menu menu)
        {
            if (i1 == 0 && !(menu instanceof android.support.v7.internal.view.menu.f))
            {
                return false;
            } else
            {
                return super.onCreatePanelMenu(i1, menu);
            }
        }

        public boolean onMenuOpened(int i1, Menu menu)
        {
            return super.onMenuOpened(i1, menu) || a.d(i1);
        }

        public void onPanelClosed(int i1, Menu menu)
        {
            super.onPanelClosed(i1, menu);
            a.c(i1);
        }

        public boolean onPreparePanel(int i1, View view, Menu menu)
        {
            android.support.v7.internal.view.menu.f f1;
            boolean flag;
            if (menu instanceof android.support.v7.internal.view.menu.f)
            {
                f1 = (android.support.v7.internal.view.menu.f)menu;
            } else
            {
                f1 = null;
            }
            if (i1 == 0 && f1 == null)
            {
                flag = false;
            } else
            {
                if (f1 != null)
                {
                    f1.c(true);
                }
                boolean flag1 = super.onPreparePanel(i1, view, menu);
                flag = flag1;
                if (f1 != null)
                {
                    f1.c(false);
                    return flag1;
                }
            }
            return flag;
        }

        b(android.view.Window.Callback callback)
        {
            a = f.this;
            super(callback);
        }
    }


    final Context a;
    final Window b;
    final android.view.Window.Callback c;
    final android.view.Window.Callback d;
    final d e;
    ActionBar f;
    MenuInflater g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    private CharSequence m;
    private boolean n;

    f(Context context, Window window, d d1)
    {
        a = context;
        b = window;
        e = d1;
        c = b.getCallback();
        if (c instanceof b)
        {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        } else
        {
            d = a(c);
            b.setCallback(d);
            return;
        }
    }

    public final ActionBar a()
    {
        k();
        return f;
    }

    android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new b(callback);
    }

    public final void a(CharSequence charsequence)
    {
        m = charsequence;
        b(charsequence);
    }

    abstract boolean a(int i1, KeyEvent keyevent);

    abstract boolean a(KeyEvent keyevent);

    abstract android.support.v7.view.a b(android.support.v7.view.a.a a1);

    public final MenuInflater b()
    {
        if (g == null)
        {
            k();
            Context context;
            if (f != null)
            {
                context = f.j();
            } else
            {
                context = a;
            }
            g = new e(context);
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

    public final a.a i()
    {
        return new a((byte)0);
    }

    abstract void k();

    final Context l()
    {
        Context context = null;
        Object obj = a();
        if (obj != null)
        {
            context = ((ActionBar) (obj)).j();
        }
        obj = context;
        if (context == null)
        {
            obj = a;
        }
        return ((Context) (obj));
    }

    public boolean m()
    {
        return false;
    }

    final boolean n()
    {
        return n;
    }

    final CharSequence o()
    {
        if (c instanceof Activity)
        {
            return ((Activity)c).getTitle();
        } else
        {
            return m;
        }
    }
}
