// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.b;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.internal.view.menu:
//            e, o, p, q

public class MenuItemWrapperICS extends e
    implements MenuItem
{

    public Method e;

    MenuItemWrapperICS(Context context, b b1)
    {
        super(context, b1);
    }

    o a(ActionProvider actionprovider)
    {
        return new o(this, a, actionprovider);
    }

    public boolean collapseActionView()
    {
        return ((b)d).collapseActionView();
    }

    public boolean expandActionView()
    {
        return ((b)d).expandActionView();
    }

    public ActionProvider getActionProvider()
    {
        android.support.v4.view.n n = ((b)d).a();
        if (n instanceof o)
        {
            return ((o)n).c;
        } else
        {
            return null;
        }
    }

    public View getActionView()
    {
        View view1 = ((b)d).getActionView();
        View view = view1;
        if (view1 instanceof CollapsibleActionViewWrapper)
        {
            view = ((CollapsibleActionViewWrapper)view1).getWrappedView();
        }
        return view;
    }

    public char getAlphabeticShortcut()
    {
        return ((b)d).getAlphabeticShortcut();
    }

    public int getGroupId()
    {
        return ((b)d).getGroupId();
    }

    public Drawable getIcon()
    {
        return ((b)d).getIcon();
    }

    public Intent getIntent()
    {
        return ((b)d).getIntent();
    }

    public int getItemId()
    {
        return ((b)d).getItemId();
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return ((b)d).getMenuInfo();
    }

    public char getNumericShortcut()
    {
        return ((b)d).getNumericShortcut();
    }

    public int getOrder()
    {
        return ((b)d).getOrder();
    }

    public SubMenu getSubMenu()
    {
        return a(((b)d).getSubMenu());
    }

    public CharSequence getTitle()
    {
        return ((b)d).getTitle();
    }

    public CharSequence getTitleCondensed()
    {
        return ((b)d).getTitleCondensed();
    }

    public boolean hasSubMenu()
    {
        return ((b)d).hasSubMenu();
    }

    public boolean isActionViewExpanded()
    {
        return ((b)d).isActionViewExpanded();
    }

    public boolean isCheckable()
    {
        return ((b)d).isCheckable();
    }

    public boolean isChecked()
    {
        return ((b)d).isChecked();
    }

    public boolean isEnabled()
    {
        return ((b)d).isEnabled();
    }

    public boolean isVisible()
    {
        return ((b)d).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        b b1 = (b)d;
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

    public MenuItem setActionView(int i)
    {
        ((b)d).setActionView(i);
        View view = ((b)d).getActionView();
        if (view instanceof CollapsibleActionView)
        {
            ((b)d).setActionView(new CollapsibleActionViewWrapper(view));
        }
        return this;
    }

    public MenuItem setActionView(View view)
    {
        Object obj = view;
        if (view instanceof CollapsibleActionView)
        {
            obj = new CollapsibleActionViewWrapper(view);
        }
        ((b)d).setActionView(((View) (obj)));
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c)
    {
        ((b)d).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean flag)
    {
        ((b)d).setCheckable(flag);
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        ((b)d).setChecked(flag);
        return this;
    }

    public MenuItem setEnabled(boolean flag)
    {
        ((b)d).setEnabled(flag);
        return this;
    }

    public MenuItem setIcon(int i)
    {
        ((b)d).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        ((b)d).setIcon(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent)
    {
        ((b)d).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c)
    {
        ((b)d).setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        b b1 = (b)d;
        if (onactionexpandlistener != null)
        {
            onactionexpandlistener = new p(this, onactionexpandlistener);
        } else
        {
            onactionexpandlistener = null;
        }
        b1.a(onactionexpandlistener);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        b b1 = (b)d;
        if (onmenuitemclicklistener != null)
        {
            onmenuitemclicklistener = new q(this, onmenuitemclicklistener);
        } else
        {
            onmenuitemclicklistener = null;
        }
        b1.setOnMenuItemClickListener(onmenuitemclicklistener);
        return this;
    }

    public MenuItem setShortcut(char c, char c1)
    {
        ((b)d).setShortcut(c, c1);
        return this;
    }

    public void setShowAsAction(int i)
    {
        ((b)d).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i)
    {
        ((b)d).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i)
    {
        ((b)d).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        ((b)d).setTitle(charsequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        ((b)d).setTitleCondensed(charsequence);
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        return ((b)d).setVisible(flag);
    }

    private class CollapsibleActionViewWrapper extends FrameLayout
        implements c
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

        View getWrappedView()
        {
            return (View)a;
        }

        CollapsibleActionViewWrapper(View view)
        {
            super(view.getContext());
            a = (CollapsibleActionView)view;
            addView(view);
        }
    }

}
