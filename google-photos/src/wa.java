// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

public class wa extends vq
    implements MenuItem
{

    public Method e;

    public wa(Context context, fr fr1)
    {
        super(context, fr1);
    }

    wb a(ActionProvider actionprovider)
    {
        return new wb(this, a, actionprovider);
    }

    public boolean collapseActionView()
    {
        return ((fr)d).collapseActionView();
    }

    public boolean expandActionView()
    {
        return ((fr)d).expandActionView();
    }

    public ActionProvider getActionProvider()
    {
        km km = ((fr)d).a();
        if (km instanceof wb)
        {
            return ((wb)km).d;
        } else
        {
            return null;
        }
    }

    public View getActionView()
    {
        View view1 = ((fr)d).getActionView();
        View view = view1;
        if (view1 instanceof wc)
        {
            view = (View)((wc)view1).a;
        }
        return view;
    }

    public char getAlphabeticShortcut()
    {
        return ((fr)d).getAlphabeticShortcut();
    }

    public int getGroupId()
    {
        return ((fr)d).getGroupId();
    }

    public Drawable getIcon()
    {
        return ((fr)d).getIcon();
    }

    public Intent getIntent()
    {
        return ((fr)d).getIntent();
    }

    public int getItemId()
    {
        return ((fr)d).getItemId();
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return ((fr)d).getMenuInfo();
    }

    public char getNumericShortcut()
    {
        return ((fr)d).getNumericShortcut();
    }

    public int getOrder()
    {
        return ((fr)d).getOrder();
    }

    public SubMenu getSubMenu()
    {
        return a(((fr)d).getSubMenu());
    }

    public CharSequence getTitle()
    {
        return ((fr)d).getTitle();
    }

    public CharSequence getTitleCondensed()
    {
        return ((fr)d).getTitleCondensed();
    }

    public boolean hasSubMenu()
    {
        return ((fr)d).hasSubMenu();
    }

    public boolean isActionViewExpanded()
    {
        return ((fr)d).isActionViewExpanded();
    }

    public boolean isCheckable()
    {
        return ((fr)d).isCheckable();
    }

    public boolean isChecked()
    {
        return ((fr)d).isChecked();
    }

    public boolean isEnabled()
    {
        return ((fr)d).isEnabled();
    }

    public boolean isVisible()
    {
        return ((fr)d).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        fr fr1 = (fr)d;
        if (actionprovider != null)
        {
            actionprovider = a(actionprovider);
        } else
        {
            actionprovider = null;
        }
        fr1.a(actionprovider);
        return this;
    }

    public MenuItem setActionView(int i)
    {
        ((fr)d).setActionView(i);
        View view = ((fr)d).getActionView();
        if (view instanceof CollapsibleActionView)
        {
            ((fr)d).setActionView(new wc(view));
        }
        return this;
    }

    public MenuItem setActionView(View view)
    {
        Object obj = view;
        if (view instanceof CollapsibleActionView)
        {
            obj = new wc(view);
        }
        ((fr)d).setActionView(((View) (obj)));
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c)
    {
        ((fr)d).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean flag)
    {
        ((fr)d).setCheckable(flag);
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        ((fr)d).setChecked(flag);
        return this;
    }

    public MenuItem setEnabled(boolean flag)
    {
        ((fr)d).setEnabled(flag);
        return this;
    }

    public MenuItem setIcon(int i)
    {
        ((fr)d).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        ((fr)d).setIcon(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent)
    {
        ((fr)d).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c)
    {
        ((fr)d).setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        fr fr1 = (fr)d;
        if (onactionexpandlistener != null)
        {
            onactionexpandlistener = new wd(this, onactionexpandlistener);
        } else
        {
            onactionexpandlistener = null;
        }
        fr1.a(onactionexpandlistener);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        fr fr1 = (fr)d;
        if (onmenuitemclicklistener != null)
        {
            onmenuitemclicklistener = new we(this, onmenuitemclicklistener);
        } else
        {
            onmenuitemclicklistener = null;
        }
        fr1.setOnMenuItemClickListener(onmenuitemclicklistener);
        return this;
    }

    public MenuItem setShortcut(char c, char c1)
    {
        ((fr)d).setShortcut(c, c1);
        return this;
    }

    public void setShowAsAction(int i)
    {
        ((fr)d).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i)
    {
        ((fr)d).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i)
    {
        ((fr)d).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        ((fr)d).setTitle(charsequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        ((fr)d).setTitleCondensed(charsequence);
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        return ((fr)d).setVisible(flag);
    }
}
