// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.d.a.b;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.internal.view.menu:
//            c, d

public class i extends android.support.v7.internal.view.menu.c
    implements MenuItem
{
    class a extends android.support.v4.view.d
    {

        final ActionProvider a;
        final i b;

        public boolean hasSubMenu()
        {
            return a.hasSubMenu();
        }

        public View onCreateActionView()
        {
            return a.onCreateActionView();
        }

        public boolean onPerformDefaultAction()
        {
            return a.onPerformDefaultAction();
        }

        public void onPrepareSubMenu(SubMenu submenu)
        {
            a.onPrepareSubMenu(b.a(submenu));
        }

        public a(Context context, ActionProvider actionprovider)
        {
            b = i.this;
            super(context);
            a = actionprovider;
        }
    }

    static final class b extends FrameLayout
        implements android.support.v7.view.CollapsibleActionView
    {

        final CollapsibleActionView a;

        public final void onActionViewCollapsed()
        {
            a.onActionViewCollapsed();
        }

        public final void onActionViewExpanded()
        {
            a.onActionViewExpanded();
        }

        b(View view)
        {
            super(view.getContext());
            a = (CollapsibleActionView)view;
            addView(view);
        }
    }

    private final class c extends android.support.v7.internal.view.menu.d
        implements android.support.v4.view.m.e
    {

        final i a;

        public final boolean a(MenuItem menuitem)
        {
            return ((android.view.MenuItem.OnActionExpandListener)d).onMenuItemActionExpand(a.a(menuitem));
        }

        public final boolean b(MenuItem menuitem)
        {
            return ((android.view.MenuItem.OnActionExpandListener)d).onMenuItemActionCollapse(a.a(menuitem));
        }

        c(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
        {
            a = i.this;
            super(onactionexpandlistener);
        }
    }

    private final class d extends android.support.v7.internal.view.menu.d
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        final i a;

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            return ((android.view.MenuItem.OnMenuItemClickListener)d).onMenuItemClick(a.a(menuitem));
        }

        d(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
        {
            a = i.this;
            super(onmenuitemclicklistener);
        }
    }


    public Method e;

    i(Context context, android.support.v4.d.a.b b1)
    {
        super(context, b1);
    }

    a a(ActionProvider actionprovider)
    {
        return new a(a, actionprovider);
    }

    public boolean collapseActionView()
    {
        return ((android.support.v4.d.a.b)d).collapseActionView();
    }

    public boolean expandActionView()
    {
        return ((android.support.v4.d.a.b)d).expandActionView();
    }

    public ActionProvider getActionProvider()
    {
        android.support.v4.view.d d1 = ((android.support.v4.d.a.b)d).a();
        if (d1 instanceof a)
        {
            return ((a)d1).a;
        } else
        {
            return null;
        }
    }

    public View getActionView()
    {
        View view1 = ((android.support.v4.d.a.b)d).getActionView();
        View view = view1;
        if (view1 instanceof b)
        {
            view = (View)((b)view1).a;
        }
        return view;
    }

    public char getAlphabeticShortcut()
    {
        return ((android.support.v4.d.a.b)d).getAlphabeticShortcut();
    }

    public int getGroupId()
    {
        return ((android.support.v4.d.a.b)d).getGroupId();
    }

    public Drawable getIcon()
    {
        return ((android.support.v4.d.a.b)d).getIcon();
    }

    public Intent getIntent()
    {
        return ((android.support.v4.d.a.b)d).getIntent();
    }

    public int getItemId()
    {
        return ((android.support.v4.d.a.b)d).getItemId();
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return ((android.support.v4.d.a.b)d).getMenuInfo();
    }

    public char getNumericShortcut()
    {
        return ((android.support.v4.d.a.b)d).getNumericShortcut();
    }

    public int getOrder()
    {
        return ((android.support.v4.d.a.b)d).getOrder();
    }

    public SubMenu getSubMenu()
    {
        return a(((android.support.v4.d.a.b)d).getSubMenu());
    }

    public CharSequence getTitle()
    {
        return ((android.support.v4.d.a.b)d).getTitle();
    }

    public CharSequence getTitleCondensed()
    {
        return ((android.support.v4.d.a.b)d).getTitleCondensed();
    }

    public boolean hasSubMenu()
    {
        return ((android.support.v4.d.a.b)d).hasSubMenu();
    }

    public boolean isActionViewExpanded()
    {
        return ((android.support.v4.d.a.b)d).isActionViewExpanded();
    }

    public boolean isCheckable()
    {
        return ((android.support.v4.d.a.b)d).isCheckable();
    }

    public boolean isChecked()
    {
        return ((android.support.v4.d.a.b)d).isChecked();
    }

    public boolean isEnabled()
    {
        return ((android.support.v4.d.a.b)d).isEnabled();
    }

    public boolean isVisible()
    {
        return ((android.support.v4.d.a.b)d).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        android.support.v4.d.a.b b1 = (android.support.v4.d.a.b)d;
        if (actionprovider != null)
        {
            actionprovider = a(actionprovider);
        } else
        {
            actionprovider = null;
        }
        b1.a(actionprovider);
        return this;
    }

    public MenuItem setActionView(int j)
    {
        ((android.support.v4.d.a.b)d).setActionView(j);
        View view = ((android.support.v4.d.a.b)d).getActionView();
        if (view instanceof CollapsibleActionView)
        {
            ((android.support.v4.d.a.b)d).setActionView(new b(view));
        }
        return this;
    }

    public MenuItem setActionView(View view)
    {
        Object obj = view;
        if (view instanceof CollapsibleActionView)
        {
            obj = new b(view);
        }
        ((android.support.v4.d.a.b)d).setActionView(((View) (obj)));
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c1)
    {
        ((android.support.v4.d.a.b)d).setAlphabeticShortcut(c1);
        return this;
    }

    public MenuItem setCheckable(boolean flag)
    {
        ((android.support.v4.d.a.b)d).setCheckable(flag);
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        ((android.support.v4.d.a.b)d).setChecked(flag);
        return this;
    }

    public MenuItem setEnabled(boolean flag)
    {
        ((android.support.v4.d.a.b)d).setEnabled(flag);
        return this;
    }

    public MenuItem setIcon(int j)
    {
        ((android.support.v4.d.a.b)d).setIcon(j);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        ((android.support.v4.d.a.b)d).setIcon(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent)
    {
        ((android.support.v4.d.a.b)d).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c1)
    {
        ((android.support.v4.d.a.b)d).setNumericShortcut(c1);
        return this;
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        android.support.v4.d.a.b b1 = (android.support.v4.d.a.b)d;
        if (onactionexpandlistener != null)
        {
            onactionexpandlistener = new c(onactionexpandlistener);
        } else
        {
            onactionexpandlistener = null;
        }
        b1.a(onactionexpandlistener);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        android.support.v4.d.a.b b1 = (android.support.v4.d.a.b)d;
        if (onmenuitemclicklistener != null)
        {
            onmenuitemclicklistener = new d(onmenuitemclicklistener);
        } else
        {
            onmenuitemclicklistener = null;
        }
        b1.setOnMenuItemClickListener(onmenuitemclicklistener);
        return this;
    }

    public MenuItem setShortcut(char c1, char c2)
    {
        ((android.support.v4.d.a.b)d).setShortcut(c1, c2);
        return this;
    }

    public void setShowAsAction(int j)
    {
        ((android.support.v4.d.a.b)d).setShowAsAction(j);
    }

    public MenuItem setShowAsActionFlags(int j)
    {
        ((android.support.v4.d.a.b)d).setShowAsActionFlags(j);
        return this;
    }

    public MenuItem setTitle(int j)
    {
        ((android.support.v4.d.a.b)d).setTitle(j);
        return this;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        ((android.support.v4.d.a.b)d).setTitle(charsequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        ((android.support.v4.d.a.b)d).setTitleCondensed(charsequence);
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        return ((android.support.v4.d.a.b)d).setVisible(flag);
    }
}
