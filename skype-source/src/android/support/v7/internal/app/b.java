// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.x;
import android.support.v7.app.ActionBar;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.widget.g;
import android.support.v7.internal.widget.q;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import java.util.ArrayList;

public final class android.support.v7.internal.app.b extends ActionBar
{
    private final class a
        implements android.support.v7.internal.view.menu.l.a
    {

        final android.support.v7.internal.app.b a;
        private boolean b;

        public final void onCloseMenu(f f1, boolean flag)
        {
            if (b)
            {
                return;
            }
            b = true;
            android.support.v7.internal.app.b.c(a).m();
            if (android.support.v7.internal.app.b.a(a) != null)
            {
                android.support.v7.internal.app.b.a(a).onPanelClosed(108, f1);
            }
            b = false;
        }

        public final boolean onOpenSubMenu(f f1)
        {
            if (android.support.v7.internal.app.b.a(a) != null)
            {
                android.support.v7.internal.app.b.a(a).onMenuOpened(108, f1);
                return true;
            } else
            {
                return false;
            }
        }

        private a()
        {
            a = android.support.v7.internal.app.b.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private final class b
        implements android.support.v7.internal.view.menu.f.a
    {

        final android.support.v7.internal.app.b a;

        public final boolean onMenuItemSelected(f f1, MenuItem menuitem)
        {
            return false;
        }

        public final void onMenuModeChange(f f1)
        {
            if (android.support.v7.internal.app.b.a(a) != null)
            {
                if (android.support.v7.internal.app.b.c(a).h())
                {
                    android.support.v7.internal.app.b.a(a).onPanelClosed(108, f1);
                } else
                if (android.support.v7.internal.app.b.a(a).onPreparePanel(0, null, f1))
                {
                    android.support.v7.internal.app.b.a(a).onMenuOpened(108, f1);
                    return;
                }
            }
        }

        private b()
        {
            a = android.support.v7.internal.app.b.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    private final class c
        implements android.support.v7.internal.view.menu.l.a
    {

        final android.support.v7.internal.app.b a;

        public final void onCloseMenu(f f1, boolean flag)
        {
            if (android.support.v7.internal.app.b.a(a) != null)
            {
                android.support.v7.internal.app.b.a(a).onPanelClosed(0, f1);
            }
        }

        public final boolean onOpenSubMenu(f f1)
        {
            if (f1 == null && android.support.v7.internal.app.b.a(a) != null)
            {
                android.support.v7.internal.app.b.a(a).onMenuOpened(0, f1);
            }
            return true;
        }

        private c()
        {
            a = android.support.v7.internal.app.b.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }

    private final class d extends android.support.v7.internal.view.g
    {

        final android.support.v7.internal.app.b a;

        public final View onCreatePanelView(int i1)
        {
            i1;
            JVM INSTR tableswitch 0 0: default 20
        //                       0 26;
               goto _L1 _L2
_L1:
            Menu menu;
            return super.onCreatePanelView(i1);
_L2:
            if (onPreparePanel(i1, null, menu = android.support.v7.internal.app.b.c(a).s()) && onMenuOpened(i1, menu))
            {
                return android.support.v7.internal.app.b.a(a, menu);
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public final boolean onPreparePanel(int i1, View view, Menu menu)
        {
            boolean flag = super.onPreparePanel(i1, view, menu);
            if (flag && !android.support.v7.internal.app.b.b(a))
            {
                android.support.v7.internal.app.b.c(a).l();
                android.support.v7.internal.app.b.d(a);
            }
            return flag;
        }

        public d(android.view.Window.Callback callback)
        {
            a = android.support.v7.internal.app.b.this;
            super(callback);
        }
    }


    private g a;
    private boolean b;
    private android.view.Window.Callback c;
    private boolean d;
    private boolean e;
    private ArrayList f;
    private e g;
    private final Runnable h = new Runnable() {

        final android.support.v7.internal.app.b a;

        public final void run()
        {
            a.n();
        }

            
            {
                a = android.support.v7.internal.app.b.this;
                super();
            }
    };
    private final android.support.v7.widget.Toolbar.c i = new android.support.v7.widget.Toolbar.c() {

        final android.support.v7.internal.app.b a;

        public final boolean a(MenuItem menuitem)
        {
            return android.support.v7.internal.app.b.a(a).onMenuItemSelected(0, menuitem);
        }

            
            {
                a = android.support.v7.internal.app.b.this;
                super();
            }
    };

    public android.support.v7.internal.app.b(Toolbar toolbar, CharSequence charsequence, android.view.Window.Callback callback)
    {
        f = new ArrayList();
        a = new q(toolbar, false);
        c = new d(callback);
        a.a(c);
        toolbar.setOnMenuItemClickListener(i);
        a.a(charsequence);
    }

    static View a(android.support.v7.internal.app.b b1, Menu menu)
    {
        if (b1.g == null && (menu instanceof f))
        {
            f f1 = (f)menu;
            Object obj = b1.a.b();
            TypedValue typedvalue = new TypedValue();
            android.content.res.Resources.Theme theme = ((Context) (obj)).getResources().newTheme();
            theme.setTo(((Context) (obj)).getTheme());
            theme.resolveAttribute(android.support.v7.appcompat.a.a.actionBarPopupTheme, typedvalue, true);
            if (typedvalue.resourceId != 0)
            {
                theme.applyStyle(typedvalue.resourceId, true);
            }
            theme.resolveAttribute(android.support.v7.appcompat.a.a.panelMenuListTheme, typedvalue, true);
            if (typedvalue.resourceId != 0)
            {
                theme.applyStyle(typedvalue.resourceId, true);
            } else
            {
                theme.applyStyle(android.support.v7.appcompat.a.j.Theme_AppCompat_CompactMenu, true);
            }
            obj = new ContextThemeWrapper(((Context) (obj)), 0);
            ((Context) (obj)).getTheme().setTo(theme);
            b1.g = new e(((Context) (obj)), android.support.v7.appcompat.a.h.abc_list_menu_item_layout);
            b1.g.a(b1. new c((byte)0));
            f1.a(b1.g);
        }
        if (menu == null || b1.g == null)
        {
            return null;
        }
        if (b1.g.c().getCount() > 0)
        {
            return (View)b1.g.a(b1.a.a());
        } else
        {
            return null;
        }
    }

    static android.view.Window.Callback a(android.support.v7.internal.app.b b1)
    {
        return b1.c;
    }

    private void a(int i1, int j1)
    {
        int k1 = a.n();
        a.c(i1 & j1 | ~j1 & k1);
    }

    static boolean b(android.support.v7.internal.app.b b1)
    {
        return b1.b;
    }

    static g c(android.support.v7.internal.app.b b1)
    {
        return b1.a;
    }

    static boolean d(android.support.v7.internal.app.b b1)
    {
        b1.b = true;
        return true;
    }

    private Menu o()
    {
        if (!d)
        {
            a.a(new a((byte)0), new b((byte)0));
            d = true;
        }
        return a.s();
    }

    public final void a()
    {
        a.a(0x7f020207);
    }

    public final void a(int i1)
    {
        a.d(i1);
    }

    public final void a(Configuration configuration)
    {
        super.a(configuration);
    }

    public final void a(Drawable drawable)
    {
        a.c(drawable);
    }

    public final void a(View view)
    {
        android.support.v7.app.ActionBar.a a1 = new android.support.v7.app.ActionBar.a();
        if (view != null)
        {
            view.setLayoutParams(a1);
        }
        a.a(view);
    }

    public final void a(CharSequence charsequence)
    {
        a.b(charsequence);
    }

    public final void a(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 2);
    }

    public final boolean a(int i1, KeyEvent keyevent)
    {
        Menu menu = o();
        if (menu != null)
        {
            int j1;
            boolean flag;
            if (keyevent != null)
            {
                j1 = keyevent.getDeviceId();
            } else
            {
                j1 = -1;
            }
            if (KeyCharacterMap.load(j1).getKeyboardType() != 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            menu.setQwertyMode(flag);
            menu.performShortcut(i1, keyevent, 0);
        }
        return true;
    }

    public final void b()
    {
        a(0, 8);
    }

    public final void b(int i1)
    {
        a.e(i1);
    }

    public final void b(Drawable drawable)
    {
        a.b(drawable);
    }

    public final void b(CharSequence charsequence)
    {
        a.a(charsequence);
    }

    public final void b(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 4);
    }

    public final void c()
    {
        a(16, 16);
    }

    public final void c(boolean flag)
    {
    }

    public final View d()
    {
        return a.p();
    }

    public final void d(boolean flag)
    {
    }

    public final int e()
    {
        return a.n();
    }

    public final void e(boolean flag)
    {
        if (flag != e)
        {
            e = flag;
            int j1 = f.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                f.get(i1);
                i1++;
            }
        }
    }

    public final int f()
    {
        return a.q();
    }

    public final void g()
    {
        a.f(0);
    }

    public final void h()
    {
        a.f(8);
    }

    public final boolean i()
    {
        return a.r() == 0;
    }

    public final Context j()
    {
        return a.b();
    }

    public final boolean k()
    {
        a.a().removeCallbacks(h);
        x.a(a.a(), h);
        return true;
    }

    public final boolean l()
    {
        if (a.c())
        {
            a.d();
            return true;
        } else
        {
            return false;
        }
    }

    public final android.view.Window.Callback m()
    {
        return c;
    }

    final void n()
    {
        f f1;
        Menu menu;
        f1 = null;
        menu = o();
        if (menu instanceof f)
        {
            f1 = (f)menu;
        }
        if (f1 != null)
        {
            f1.g();
        }
        menu.clear();
        if (!c.onCreatePanelMenu(0, menu) || !c.onPreparePanel(0, null, menu))
        {
            menu.clear();
        }
        if (f1 != null)
        {
            f1.h();
        }
        return;
        Exception exception;
        exception;
        if (f1 != null)
        {
            f1.h();
        }
        throw exception;
    }
}
