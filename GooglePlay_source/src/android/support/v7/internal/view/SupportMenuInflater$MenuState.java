// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.support.v7.internal.view.menu.MenuItemWrapperICS;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.internal.view:
//            SupportMenuInflater

private final class resetGroup
{

    int groupCategory;
    int groupCheckable;
    boolean groupEnabled;
    int groupId;
    int groupOrder;
    boolean groupVisible;
    ActionProvider itemActionProvider;
    String itemActionProviderClassName;
    String itemActionViewClassName;
    int itemActionViewLayout;
    boolean itemAdded;
    char itemAlphabeticShortcut;
    int itemCategoryOrder;
    int itemCheckable;
    boolean itemChecked;
    boolean itemEnabled;
    int itemIconResId;
    int itemId;
    String itemListenerMethodName;
    char itemNumericShortcut;
    int itemShowAsAction;
    CharSequence itemTitle;
    CharSequence itemTitleCondensed;
    boolean itemVisible;
    Menu menu;
    final SupportMenuInflater this$0;

    static char getShortcut(String s)
    {
        if (s == null)
        {
            return '\0';
        } else
        {
            return s.charAt(0);
        }
    }

    public final SubMenu addSubMenuItem()
    {
        itemAdded = true;
        SubMenu submenu = menu.addSubMenu(groupId, itemId, itemCategoryOrder, itemTitle);
        setItem(submenu.getItem());
        return submenu;
    }

    final Object newInstance(String s, Class aclass[], Object aobj[])
    {
        try
        {
            aclass = ((Class []) (SupportMenuInflater.access$100(SupportMenuInflater.this).getClassLoader().loadClass(s).getConstructor(aclass).newInstance(aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Class aclass[])
        {
            Log.w("SupportMenuInflater", (new StringBuilder("Cannot instantiate class: ")).append(s).toString(), aclass);
            return null;
        }
        return aclass;
    }

    public final void resetGroup()
    {
        groupId = 0;
        groupCategory = 0;
        groupOrder = 0;
        groupCheckable = 0;
        groupVisible = true;
        groupEnabled = true;
    }

    final void setItem(MenuItem menuitem)
    {
        boolean flag1 = false;
        MenuItem menuitem1 = menuitem.setChecked(itemChecked).setVisible(itemVisible).setEnabled(itemEnabled);
        if (itemCheckable > 0)
        {
            flag1 = true;
        }
        menuitem1.setCheckable(flag1).setTitleCondensed(itemTitleCondensed).setIcon(itemIconResId).setAlphabeticShortcut(itemAlphabeticShortcut).setNumericShortcut(itemNumericShortcut);
        if (itemShowAsAction >= 0)
        {
            MenuItemCompat.setShowAsAction(menuitem, itemShowAsAction);
        }
        if (itemListenerMethodName != null)
        {
            if (SupportMenuInflater.access$100(SupportMenuInflater.this).isRestricted())
            {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuitem.setOnMenuItemClickListener(new MenuItemClickListener(SupportMenuInflater.access$400(SupportMenuInflater.this), itemListenerMethodName));
        }
        boolean flag;
        if (itemCheckable >= 2)
        {
            if (menuitem instanceof MenuItemImpl)
            {
                ((MenuItemImpl)menuitem).setExclusiveCheckable(true);
            } else
            if (menuitem instanceof MenuItemWrapperICS)
            {
                MenuItemWrapperICS menuitemwrapperics = (MenuItemWrapperICS)menuitem;
                try
                {
                    if (menuitemwrapperics.mSetExclusiveCheckableMethod == null)
                    {
                        menuitemwrapperics.mSetExclusiveCheckableMethod = ((SupportMenuItem)menuitemwrapperics.mWrappedObject).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] {
                            Boolean.TYPE
                        });
                    }
                    menuitemwrapperics.mSetExclusiveCheckableMethod.invoke(menuitemwrapperics.mWrappedObject, new Object[] {
                        Boolean.valueOf(true)
                    });
                }
                catch (Exception exception)
                {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", exception);
                }
            }
        }
        flag = false;
        if (itemActionViewClassName != null)
        {
            MenuItemCompat.setActionView(menuitem, (View)newInstance(itemActionViewClassName, SupportMenuInflater.access$500(), SupportMenuInflater.access$600(SupportMenuInflater.this)));
            flag = true;
        }
        if (itemActionViewLayout > 0)
        {
            if (!flag)
            {
                MenuItemCompat.setActionView(menuitem, itemActionViewLayout);
            } else
            {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        if (itemActionProvider != null)
        {
            MenuItemCompat.setActionProvider(menuitem, itemActionProvider);
        }
    }

    public MenuItemClickListener(Menu menu1)
    {
        this$0 = SupportMenuInflater.this;
        super();
        menu = menu1;
        resetGroup();
    }
}
