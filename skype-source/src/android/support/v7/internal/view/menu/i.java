// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.b;
import android.util.Log;
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

        public final View a()
        {
            return a.onCreateActionView();
        }

        public final void a(SubMenu submenu)
        {
            a.onPrepareSubMenu(b.a(submenu));
        }

        public final boolean d()
        {
            return a.onPerformDefaultAction();
        }

        public final boolean e()
        {
            return a.hasSubMenu();
        }

        public a(Context context, ActionProvider actionprovider)
        {
            b = i.this;
            super(context);
            a = actionprovider;
        }
    }

    static final class b extends FrameLayout
        implements android.support.v7.view.b
    {

        final CollapsibleActionView a;

        public final void a()
        {
            a.onActionViewExpanded();
        }

        public final void b()
        {
            a.onActionViewCollapsed();
        }

        b(View view)
        {
            super(view.getContext());
            a = (CollapsibleActionView)view;
            addView(view);
        }
    }

    private final class c extends android.support.v7.internal.view.menu.d
        implements android.support.v4.view.k.e
    {

        final i a;

        public final boolean onMenuItemActionCollapse(MenuItem menuitem)
        {
            return ((android.view.MenuItem.OnActionExpandListener)b).onMenuItemActionCollapse(a.a(menuitem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuitem)
        {
            return ((android.view.MenuItem.OnActionExpandListener)b).onMenuItemActionExpand(a.a(menuitem));
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
            return ((android.view.MenuItem.OnMenuItemClickListener)b).onMenuItemClick(a.a(menuitem));
        }

        d(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
        {
            a = i.this;
            super(onmenuitemclicklistener);
        }
    }


    private Method c;

    i(Context context, android.support.v4.internal.view.b b1)
    {
        super(context, b1);
    }

    a a(ActionProvider actionprovider)
    {
        return new a(a, actionprovider);
    }

    public final void b()
    {
        try
        {
            if (c == null)
            {
                c = ((android.support.v4.internal.view.b)b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] {
                    Boolean.TYPE
                });
            }
            c.invoke(b, new Object[] {
                Boolean.valueOf(true)
            });
            return;
        }
        catch (Exception exception)
        {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", exception);
        }
    }

    public boolean collapseActionView()
    {
        return ((android.support.v4.internal.view.b)b).collapseActionView();
    }

    public boolean expandActionView()
    {
        return ((android.support.v4.internal.view.b)b).expandActionView();
    }

    public ActionProvider getActionProvider()
    {
        android.support.v4.view.d d1 = ((android.support.v4.internal.view.b)b).a();
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
        View view = ((android.support.v4.internal.view.b)b).getActionView();
        if (view instanceof b)
        {
            return (View)((b)view).a;
        } else
        {
            return view;
        }
    }

    public char getAlphabeticShortcut()
    {
        return ((android.support.v4.internal.view.b)b).getAlphabeticShortcut();
    }

    public int getGroupId()
    {
        return ((android.support.v4.internal.view.b)b).getGroupId();
    }

    public Drawable getIcon()
    {
        return ((android.support.v4.internal.view.b)b).getIcon();
    }

    public Intent getIntent()
    {
        return ((android.support.v4.internal.view.b)b).getIntent();
    }

    public int getItemId()
    {
        return ((android.support.v4.internal.view.b)b).getItemId();
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return ((android.support.v4.internal.view.b)b).getMenuInfo();
    }

    public char getNumericShortcut()
    {
        return ((android.support.v4.internal.view.b)b).getNumericShortcut();
    }

    public int getOrder()
    {
        return ((android.support.v4.internal.view.b)b).getOrder();
    }

    public SubMenu getSubMenu()
    {
        return a(((android.support.v4.internal.view.b)b).getSubMenu());
    }

    public CharSequence getTitle()
    {
        return ((android.support.v4.internal.view.b)b).getTitle();
    }

    public CharSequence getTitleCondensed()
    {
        return ((android.support.v4.internal.view.b)b).getTitleCondensed();
    }

    public boolean hasSubMenu()
    {
        return ((android.support.v4.internal.view.b)b).hasSubMenu();
    }

    public boolean isActionViewExpanded()
    {
        return ((android.support.v4.internal.view.b)b).isActionViewExpanded();
    }

    public boolean isCheckable()
    {
        return ((android.support.v4.internal.view.b)b).isCheckable();
    }

    public boolean isChecked()
    {
        return ((android.support.v4.internal.view.b)b).isChecked();
    }

    public boolean isEnabled()
    {
        return ((android.support.v4.internal.view.b)b).isEnabled();
    }

    public boolean isVisible()
    {
        return ((android.support.v4.internal.view.b)b).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        android.support.v4.internal.view.b b1 = (android.support.v4.internal.view.b)b;
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
        ((android.support.v4.internal.view.b)b).setActionView(j);
        View view = ((android.support.v4.internal.view.b)b).getActionView();
        if (view instanceof CollapsibleActionView)
        {
            ((android.support.v4.internal.view.b)b).setActionView(new b(view));
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
        ((android.support.v4.internal.view.b)b).setActionView(((View) (obj)));
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c1)
    {
        ((android.support.v4.internal.view.b)b).setAlphabeticShortcut(c1);
        return this;
    }

    public MenuItem setCheckable(boolean flag)
    {
        ((android.support.v4.internal.view.b)b).setCheckable(flag);
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        ((android.support.v4.internal.view.b)b).setChecked(flag);
        return this;
    }

    public MenuItem setEnabled(boolean flag)
    {
        ((android.support.v4.internal.view.b)b).setEnabled(flag);
        return this;
    }

    public MenuItem setIcon(int j)
    {
        ((android.support.v4.internal.view.b)b).setIcon(j);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        ((android.support.v4.internal.view.b)b).setIcon(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent)
    {
        ((android.support.v4.internal.view.b)b).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c1)
    {
        ((android.support.v4.internal.view.b)b).setNumericShortcut(c1);
        return this;
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        android.support.v4.internal.view.b b1 = (android.support.v4.internal.view.b)b;
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
        android.support.v4.internal.view.b b1 = (android.support.v4.internal.view.b)b;
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
        ((android.support.v4.internal.view.b)b).setShortcut(c1, c2);
        return this;
    }

    public void setShowAsAction(int j)
    {
        ((android.support.v4.internal.view.b)b).setShowAsAction(j);
    }

    public MenuItem setShowAsActionFlags(int j)
    {
        ((android.support.v4.internal.view.b)b).setShowAsActionFlags(j);
        return this;
    }

    public MenuItem setTitle(int j)
    {
        ((android.support.v4.internal.view.b)b).setTitle(j);
        return this;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        ((android.support.v4.internal.view.b)b).setTitle(charsequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        ((android.support.v4.internal.view.b)b).setTitleCondensed(charsequence);
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        return ((android.support.v4.internal.view.b)b).setVisible(flag);
    }
}
