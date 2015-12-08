// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.b;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.internal.view.menu:
//            e, m, n, o, 
//            p

public class l extends e
    implements MenuItem
{

    private Method c;

    l(Context context, b b1)
    {
        super(context, b1);
    }

    m a(ActionProvider actionprovider)
    {
        return new m(this, a, actionprovider);
    }

    public void a(boolean flag)
    {
        try
        {
            if (c == null)
            {
                c = ((b)b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] {
                    Boolean.TYPE
                });
            }
            c.invoke(b, new Object[] {
                Boolean.valueOf(flag)
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
        return ((b)b).collapseActionView();
    }

    public boolean expandActionView()
    {
        return ((b)b).expandActionView();
    }

    public ActionProvider getActionProvider()
    {
        android.support.v4.view.n n1 = ((b)b).a();
        if (n1 instanceof m)
        {
            return ((m)n1).a;
        } else
        {
            return null;
        }
    }

    public View getActionView()
    {
        View view1 = ((b)b).getActionView();
        View view = view1;
        if (view1 instanceof n)
        {
            view = ((n)view1).c();
        }
        return view;
    }

    public char getAlphabeticShortcut()
    {
        return ((b)b).getAlphabeticShortcut();
    }

    public int getGroupId()
    {
        return ((b)b).getGroupId();
    }

    public Drawable getIcon()
    {
        return ((b)b).getIcon();
    }

    public Intent getIntent()
    {
        return ((b)b).getIntent();
    }

    public int getItemId()
    {
        return ((b)b).getItemId();
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return ((b)b).getMenuInfo();
    }

    public char getNumericShortcut()
    {
        return ((b)b).getNumericShortcut();
    }

    public int getOrder()
    {
        return ((b)b).getOrder();
    }

    public SubMenu getSubMenu()
    {
        return a(((b)b).getSubMenu());
    }

    public CharSequence getTitle()
    {
        return ((b)b).getTitle();
    }

    public CharSequence getTitleCondensed()
    {
        return ((b)b).getTitleCondensed();
    }

    public boolean hasSubMenu()
    {
        return ((b)b).hasSubMenu();
    }

    public boolean isActionViewExpanded()
    {
        return ((b)b).isActionViewExpanded();
    }

    public boolean isCheckable()
    {
        return ((b)b).isCheckable();
    }

    public boolean isChecked()
    {
        return ((b)b).isChecked();
    }

    public boolean isEnabled()
    {
        return ((b)b).isEnabled();
    }

    public boolean isVisible()
    {
        return ((b)b).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        b b1 = (b)b;
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
        ((b)b).setActionView(i);
        View view = ((b)b).getActionView();
        if (view instanceof CollapsibleActionView)
        {
            ((b)b).setActionView(new n(view));
        }
        return this;
    }

    public MenuItem setActionView(View view)
    {
        Object obj = view;
        if (view instanceof CollapsibleActionView)
        {
            obj = new n(view);
        }
        ((b)b).setActionView(((View) (obj)));
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c1)
    {
        ((b)b).setAlphabeticShortcut(c1);
        return this;
    }

    public MenuItem setCheckable(boolean flag)
    {
        ((b)b).setCheckable(flag);
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        ((b)b).setChecked(flag);
        return this;
    }

    public MenuItem setEnabled(boolean flag)
    {
        ((b)b).setEnabled(flag);
        return this;
    }

    public MenuItem setIcon(int i)
    {
        ((b)b).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        ((b)b).setIcon(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent)
    {
        ((b)b).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c1)
    {
        ((b)b).setNumericShortcut(c1);
        return this;
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        b b1 = (b)b;
        if (onactionexpandlistener != null)
        {
            onactionexpandlistener = new o(this, onactionexpandlistener);
        } else
        {
            onactionexpandlistener = null;
        }
        b1.a(onactionexpandlistener);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        b b1 = (b)b;
        if (onmenuitemclicklistener != null)
        {
            onmenuitemclicklistener = new p(this, onmenuitemclicklistener);
        } else
        {
            onmenuitemclicklistener = null;
        }
        b1.setOnMenuItemClickListener(onmenuitemclicklistener);
        return this;
    }

    public MenuItem setShortcut(char c1, char c2)
    {
        ((b)b).setShortcut(c1, c2);
        return this;
    }

    public void setShowAsAction(int i)
    {
        ((b)b).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i)
    {
        ((b)b).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i)
    {
        ((b)b).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        ((b)b).setTitle(charsequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        ((b)b).setTitleCondensed(charsequence);
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        return ((b)b).setVisible(flag);
    }
}
