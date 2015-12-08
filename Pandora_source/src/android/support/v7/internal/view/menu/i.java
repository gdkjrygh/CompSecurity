// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.view.d;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p.c.b;

// Referenced classes of package android.support.v7.internal.view.menu:
//            c, d

public class i extends android.support.v7.internal.view.menu.c
    implements p.c.b
{
    class a extends ActionProvider
    {

        final d a;
        final i b;

        public boolean hasSubMenu()
        {
            return a.g();
        }

        public View onCreateActionView()
        {
            if (i.a(b))
            {
                b.c();
            }
            return a.b();
        }

        public boolean onPerformDefaultAction()
        {
            return a.f();
        }

        public void onPrepareSubMenu(SubMenu submenu)
        {
            a.a(b.a(submenu));
        }

        public a(d d1)
        {
            b = i.this;
            super(d1.a());
            a = d1;
            if (i.a(i.this))
            {
                a.a(new _cls1(this, i.this));
            }
        }
    }

    static class b extends FrameLayout
        implements CollapsibleActionView
    {

        final p.h.b a;

        View a()
        {
            return (View)a;
        }

        public void onActionViewCollapsed()
        {
            a.b();
        }

        public void onActionViewExpanded()
        {
            a.a();
        }

        b(View view)
        {
            super(view.getContext());
            a = (p.h.b)view;
            addView(view);
        }
    }

    private class c extends android.support.v7.internal.view.menu.d
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        final i b;

        public boolean onMenuItemClick(MenuItem menuitem)
        {
            return ((android.view.MenuItem.OnMenuItemClickListener)a).onMenuItemClick(b.a(menuitem));
        }

        c(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
        {
            b = i.this;
            super(onmenuitemclicklistener);
        }
    }


    private final boolean b;
    private boolean c;
    private Method d;

    i(MenuItem menuitem)
    {
        this(menuitem, true);
    }

    i(MenuItem menuitem, boolean flag)
    {
        super(menuitem);
        c = menuitem.isVisible();
        b = flag;
    }

    static boolean a(i j)
    {
        return j.b;
    }

    static boolean b(i j)
    {
        return j.c;
    }

    public p.c.b a(d d1)
    {
        MenuItem menuitem = (MenuItem)a;
        if (d1 != null)
        {
            d1 = b(d1);
        } else
        {
            d1 = null;
        }
        menuitem.setActionProvider(d1);
        return this;
    }

    public void a(boolean flag)
    {
        try
        {
            if (d == null)
            {
                d = ((MenuItem)a).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] {
                    Boolean.TYPE
                });
            }
            d.invoke(a, new Object[] {
                Boolean.valueOf(flag)
            });
            return;
        }
        catch (Exception exception)
        {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", exception);
        }
    }

    public d b()
    {
        a a1 = (a)((MenuItem)a).getActionProvider();
        if (a1 != null)
        {
            return a1.a;
        } else
        {
            return null;
        }
    }

    a b(d d1)
    {
        return new a(d1);
    }

    final MenuItem b(boolean flag)
    {
        return ((MenuItem)a).setVisible(flag);
    }

    final boolean c()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (c)
        {
            d d1 = b();
            flag = flag1;
            if (d1 != null)
            {
                flag = flag1;
                if (d1.c())
                {
                    flag = flag1;
                    if (!d1.d())
                    {
                        b(false);
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public boolean collapseActionView()
    {
        return ((MenuItem)a).collapseActionView();
    }

    public boolean expandActionView()
    {
        return ((MenuItem)a).expandActionView();
    }

    public ActionProvider getActionProvider()
    {
        return ((MenuItem)a).getActionProvider();
    }

    public View getActionView()
    {
        View view1 = ((MenuItem)a).getActionView();
        View view = view1;
        if (view1 instanceof b)
        {
            view = ((b)view1).a();
        }
        return view;
    }

    public char getAlphabeticShortcut()
    {
        return ((MenuItem)a).getAlphabeticShortcut();
    }

    public int getGroupId()
    {
        return ((MenuItem)a).getGroupId();
    }

    public Drawable getIcon()
    {
        return ((MenuItem)a).getIcon();
    }

    public Intent getIntent()
    {
        return ((MenuItem)a).getIntent();
    }

    public int getItemId()
    {
        return ((MenuItem)a).getItemId();
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return ((MenuItem)a).getMenuInfo();
    }

    public char getNumericShortcut()
    {
        return ((MenuItem)a).getNumericShortcut();
    }

    public int getOrder()
    {
        return ((MenuItem)a).getOrder();
    }

    public SubMenu getSubMenu()
    {
        return a(((MenuItem)a).getSubMenu());
    }

    public CharSequence getTitle()
    {
        return ((MenuItem)a).getTitle();
    }

    public CharSequence getTitleCondensed()
    {
        return ((MenuItem)a).getTitleCondensed();
    }

    public boolean hasSubMenu()
    {
        return ((MenuItem)a).hasSubMenu();
    }

    public boolean isActionViewExpanded()
    {
        return ((MenuItem)a).isActionViewExpanded();
    }

    public boolean isCheckable()
    {
        return ((MenuItem)a).isCheckable();
    }

    public boolean isChecked()
    {
        return ((MenuItem)a).isChecked();
    }

    public boolean isEnabled()
    {
        return ((MenuItem)a).isEnabled();
    }

    public boolean isVisible()
    {
        return ((MenuItem)a).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        ((MenuItem)a).setActionProvider(actionprovider);
        if (actionprovider != null && b)
        {
            c();
        }
        return this;
    }

    public MenuItem setActionView(int j)
    {
        ((MenuItem)a).setActionView(j);
        View view = ((MenuItem)a).getActionView();
        if (view instanceof p.h.b)
        {
            ((MenuItem)a).setActionView(new b(view));
        }
        return this;
    }

    public MenuItem setActionView(View view)
    {
        Object obj = view;
        if (view instanceof p.h.b)
        {
            obj = new b(view);
        }
        ((MenuItem)a).setActionView(((View) (obj)));
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c1)
    {
        ((MenuItem)a).setAlphabeticShortcut(c1);
        return this;
    }

    public MenuItem setCheckable(boolean flag)
    {
        ((MenuItem)a).setCheckable(flag);
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        ((MenuItem)a).setChecked(flag);
        return this;
    }

    public MenuItem setEnabled(boolean flag)
    {
        ((MenuItem)a).setEnabled(flag);
        return this;
    }

    public MenuItem setIcon(int j)
    {
        ((MenuItem)a).setIcon(j);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        ((MenuItem)a).setIcon(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent)
    {
        ((MenuItem)a).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c1)
    {
        ((MenuItem)a).setNumericShortcut(c1);
        return this;
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        ((MenuItem)a).setOnActionExpandListener(onactionexpandlistener);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        MenuItem menuitem = (MenuItem)a;
        if (onmenuitemclicklistener != null)
        {
            onmenuitemclicklistener = new c(onmenuitemclicklistener);
        } else
        {
            onmenuitemclicklistener = null;
        }
        menuitem.setOnMenuItemClickListener(onmenuitemclicklistener);
        return this;
    }

    public MenuItem setShortcut(char c1, char c2)
    {
        ((MenuItem)a).setShortcut(c1, c2);
        return this;
    }

    public void setShowAsAction(int j)
    {
        ((MenuItem)a).setShowAsAction(j);
    }

    public MenuItem setShowAsActionFlags(int j)
    {
        ((MenuItem)a).setShowAsActionFlags(j);
        return this;
    }

    public MenuItem setTitle(int j)
    {
        ((MenuItem)a).setTitle(j);
        return this;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        ((MenuItem)a).setTitle(charsequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        ((MenuItem)a).setTitleCondensed(charsequence);
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        if (b)
        {
            c = flag;
            if (c())
            {
                return this;
            }
        }
        return b(flag);
    }

    // Unreferenced inner class android/support/v7/internal/view/menu/i$a$1

/* anonymous class */
    class a._cls1
        implements android.support.v4.view.d.b
    {

        final i a;
        final a b;

        public void a(boolean flag)
        {
            if (b.a.c() && android.support.v7.internal.view.menu.i.b(b.b))
            {
                b.b.b(flag);
            }
        }

            
            {
                b = a1;
                a = j;
                super();
            }
    }

}
