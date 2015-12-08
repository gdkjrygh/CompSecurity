// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.SupportMenuItem;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.internal.view.menu:
//            c, d

public class j extends android.support.v7.internal.view.menu.c
    implements MenuItem
{
    class a extends android.support.v4.view.ActionProvider
    {

        final ActionProvider a;
        final j b;

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
            b = j.this;
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
        implements android.support.v4.view.MenuItemCompat.OnActionExpandListener
    {

        final j a;

        public final boolean onMenuItemActionCollapse(MenuItem menuitem)
        {
            return ((android.view.MenuItem.OnActionExpandListener)d).onMenuItemActionCollapse(a.a(menuitem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuitem)
        {
            return ((android.view.MenuItem.OnActionExpandListener)d).onMenuItemActionExpand(a.a(menuitem));
        }

        c(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
        {
            a = j.this;
            super(onactionexpandlistener);
        }
    }

    private final class d extends android.support.v7.internal.view.menu.d
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        final j a;

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            return ((android.view.MenuItem.OnMenuItemClickListener)d).onMenuItemClick(a.a(menuitem));
        }

        d(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
        {
            a = j.this;
            super(onmenuitemclicklistener);
        }
    }


    public Method e;

    j(Context context, SupportMenuItem supportmenuitem)
    {
        super(context, supportmenuitem);
    }

    a a(ActionProvider actionprovider)
    {
        return new a(a, actionprovider);
    }

    public boolean collapseActionView()
    {
        return ((SupportMenuItem)d).collapseActionView();
    }

    public boolean expandActionView()
    {
        return ((SupportMenuItem)d).expandActionView();
    }

    public ActionProvider getActionProvider()
    {
        android.support.v4.view.ActionProvider actionprovider = ((SupportMenuItem)d).getSupportActionProvider();
        if (actionprovider instanceof a)
        {
            return ((a)actionprovider).a;
        } else
        {
            return null;
        }
    }

    public View getActionView()
    {
        View view1 = ((SupportMenuItem)d).getActionView();
        View view = view1;
        if (view1 instanceof b)
        {
            view = (View)((b)view1).a;
        }
        return view;
    }

    public char getAlphabeticShortcut()
    {
        return ((SupportMenuItem)d).getAlphabeticShortcut();
    }

    public int getGroupId()
    {
        return ((SupportMenuItem)d).getGroupId();
    }

    public Drawable getIcon()
    {
        return ((SupportMenuItem)d).getIcon();
    }

    public Intent getIntent()
    {
        return ((SupportMenuItem)d).getIntent();
    }

    public int getItemId()
    {
        return ((SupportMenuItem)d).getItemId();
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return ((SupportMenuItem)d).getMenuInfo();
    }

    public char getNumericShortcut()
    {
        return ((SupportMenuItem)d).getNumericShortcut();
    }

    public int getOrder()
    {
        return ((SupportMenuItem)d).getOrder();
    }

    public SubMenu getSubMenu()
    {
        return a(((SupportMenuItem)d).getSubMenu());
    }

    public CharSequence getTitle()
    {
        return ((SupportMenuItem)d).getTitle();
    }

    public CharSequence getTitleCondensed()
    {
        return ((SupportMenuItem)d).getTitleCondensed();
    }

    public boolean hasSubMenu()
    {
        return ((SupportMenuItem)d).hasSubMenu();
    }

    public boolean isActionViewExpanded()
    {
        return ((SupportMenuItem)d).isActionViewExpanded();
    }

    public boolean isCheckable()
    {
        return ((SupportMenuItem)d).isCheckable();
    }

    public boolean isChecked()
    {
        return ((SupportMenuItem)d).isChecked();
    }

    public boolean isEnabled()
    {
        return ((SupportMenuItem)d).isEnabled();
    }

    public boolean isVisible()
    {
        return ((SupportMenuItem)d).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        SupportMenuItem supportmenuitem = (SupportMenuItem)d;
        if (actionprovider != null)
        {
            actionprovider = a(actionprovider);
        } else
        {
            actionprovider = null;
        }
        supportmenuitem.setSupportActionProvider(actionprovider);
        return this;
    }

    public MenuItem setActionView(int i)
    {
        ((SupportMenuItem)d).setActionView(i);
        View view = ((SupportMenuItem)d).getActionView();
        if (view instanceof CollapsibleActionView)
        {
            ((SupportMenuItem)d).setActionView(new b(view));
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
        ((SupportMenuItem)d).setActionView(((View) (obj)));
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c1)
    {
        ((SupportMenuItem)d).setAlphabeticShortcut(c1);
        return this;
    }

    public MenuItem setCheckable(boolean flag)
    {
        ((SupportMenuItem)d).setCheckable(flag);
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        ((SupportMenuItem)d).setChecked(flag);
        return this;
    }

    public MenuItem setEnabled(boolean flag)
    {
        ((SupportMenuItem)d).setEnabled(flag);
        return this;
    }

    public MenuItem setIcon(int i)
    {
        ((SupportMenuItem)d).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        ((SupportMenuItem)d).setIcon(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent)
    {
        ((SupportMenuItem)d).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c1)
    {
        ((SupportMenuItem)d).setNumericShortcut(c1);
        return this;
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        SupportMenuItem supportmenuitem = (SupportMenuItem)d;
        if (onactionexpandlistener != null)
        {
            onactionexpandlistener = new c(onactionexpandlistener);
        } else
        {
            onactionexpandlistener = null;
        }
        supportmenuitem.setSupportOnActionExpandListener(onactionexpandlistener);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        SupportMenuItem supportmenuitem = (SupportMenuItem)d;
        if (onmenuitemclicklistener != null)
        {
            onmenuitemclicklistener = new d(onmenuitemclicklistener);
        } else
        {
            onmenuitemclicklistener = null;
        }
        supportmenuitem.setOnMenuItemClickListener(onmenuitemclicklistener);
        return this;
    }

    public MenuItem setShortcut(char c1, char c2)
    {
        ((SupportMenuItem)d).setShortcut(c1, c2);
        return this;
    }

    public void setShowAsAction(int i)
    {
        ((SupportMenuItem)d).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i)
    {
        ((SupportMenuItem)d).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i)
    {
        ((SupportMenuItem)d).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        ((SupportMenuItem)d).setTitle(charsequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        ((SupportMenuItem)d).setTitleCondensed(charsequence);
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        return ((SupportMenuItem)d).setVisible(flag);
    }
}
