// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.support.v7.internal.view.menu.MenuItemWrapperICS;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

// Referenced classes of package android.support.v7.internal.view:
//            SupportMenuInflater

private class resetGroup
{

    private static final int defaultGroupId = 0;
    private static final int defaultItemCategory = 0;
    private static final int defaultItemCheckable = 0;
    private static final boolean defaultItemChecked = false;
    private static final boolean defaultItemEnabled = true;
    private static final int defaultItemId = 0;
    private static final int defaultItemOrder = 0;
    private static final boolean defaultItemVisible = true;
    private int groupCategory;
    private int groupCheckable;
    private boolean groupEnabled;
    private int groupId;
    private int groupOrder;
    private boolean groupVisible;
    private ActionProvider itemActionProvider;
    private String itemActionProviderClassName;
    private String itemActionViewClassName;
    private int itemActionViewLayout;
    private boolean itemAdded;
    private char itemAlphabeticShortcut;
    private int itemCategoryOrder;
    private int itemCheckable;
    private boolean itemChecked;
    private boolean itemEnabled;
    private int itemIconResId;
    private int itemId;
    private String itemListenerMethodName;
    private char itemNumericShortcut;
    private int itemShowAsAction;
    private CharSequence itemTitle;
    private CharSequence itemTitleCondensed;
    private boolean itemVisible;
    private Menu menu;
    final SupportMenuInflater this$0;

    private char getShortcut(String s)
    {
        if (s == null)
        {
            return '\0';
        } else
        {
            return s.charAt(0);
        }
    }

    private Object newInstance(String s, Class aclass[], Object aobj[])
    {
        try
        {
            aclass = ((Class []) (SupportMenuInflater.access$100(SupportMenuInflater.this).getClassLoader().loadClass(s).getConstructor(aclass).newInstance(aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Class aclass[])
        {
            Log.w("SupportMenuInflater", (new StringBuilder()).append("Cannot instantiate class: ").append(s).toString(), aclass);
            return null;
        }
        return aclass;
    }

    private void setItem(MenuItem menuitem)
    {
        Object obj = menuitem.setChecked(itemChecked).setVisible(itemVisible).setEnabled(itemEnabled);
        boolean flag1;
        if (itemCheckable >= 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((MenuItem) (obj)).setCheckable(flag1).setTitleCondensed(itemTitleCondensed).setIcon(itemIconResId).setAlphabeticShortcut(itemAlphabeticShortcut).setNumericShortcut(itemNumericShortcut);
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
        if (menuitem instanceof MenuItemImpl)
        {
            obj = (MenuItemImpl)menuitem;
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
                ((MenuItemWrapperICS)menuitem).setExclusiveCheckable(true);
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

    public void addItem()
    {
        itemAdded = true;
        setItem(menu.add(groupId, itemId, itemCategoryOrder, itemTitle));
    }

    public SubMenu addSubMenuItem()
    {
        itemAdded = true;
        SubMenu submenu = menu.addSubMenu(groupId, itemId, itemCategoryOrder, itemTitle);
        setItem(submenu.getItem());
        return submenu;
    }

    public boolean hasAddedItem()
    {
        return itemAdded;
    }

    public void readGroup(AttributeSet attributeset)
    {
        attributeset = SupportMenuInflater.access$100(SupportMenuInflater.this).obtainStyledAttributes(attributeset, android.support.v7.appcompat.ate.this._fld0);
        groupId = attributeset.getResourceId(1, 0);
        groupCategory = attributeset.getInt(3, 0);
        groupOrder = attributeset.getInt(4, 0);
        groupCheckable = attributeset.getInt(5, 0);
        groupVisible = attributeset.getBoolean(2, true);
        groupEnabled = attributeset.getBoolean(0, true);
        attributeset.recycle();
    }

    public void readItem(AttributeSet attributeset)
    {
        attributeset = SupportMenuInflater.access$100(SupportMenuInflater.this).obtainStyledAttributes(attributeset, android.support.v7.appcompat.ate.this._fld0);
        itemId = attributeset.getResourceId(2, 0);
        itemCategoryOrder = 0xffff0000 & attributeset.getInt(5, groupCategory) | 0xffff & attributeset.getInt(6, groupOrder);
        itemTitle = attributeset.getText(7);
        itemTitleCondensed = attributeset.getText(8);
        itemIconResId = attributeset.getResourceId(0, 0);
        itemAlphabeticShortcut = getShortcut(attributeset.getString(9));
        itemNumericShortcut = getShortcut(attributeset.getString(10));
        int i;
        if (attributeset.hasValue(11))
        {
            if (attributeset.getBoolean(11, false))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            itemCheckable = i;
        } else
        {
            itemCheckable = groupCheckable;
        }
        itemChecked = attributeset.getBoolean(3, false);
        itemVisible = attributeset.getBoolean(4, groupVisible);
        itemEnabled = attributeset.getBoolean(1, groupEnabled);
        itemShowAsAction = attributeset.getInt(13, -1);
        itemListenerMethodName = attributeset.getString(12);
        itemActionViewLayout = attributeset.getResourceId(14, 0);
        itemActionViewClassName = attributeset.getString(15);
        itemActionProviderClassName = attributeset.getString(16);
        if (itemActionProviderClassName != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0 && itemActionViewLayout == 0 && itemActionViewClassName == null)
        {
            itemActionProvider = (ActionProvider)newInstance(itemActionProviderClassName, SupportMenuInflater.access$200(), SupportMenuInflater.access$300(SupportMenuInflater.this));
        } else
        {
            if (i != 0)
            {
                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
            }
            itemActionProvider = null;
        }
        attributeset.recycle();
        itemAdded = false;
    }

    public void resetGroup()
    {
        groupId = 0;
        groupCategory = 0;
        groupOrder = 0;
        groupCheckable = 0;
        groupVisible = true;
        groupEnabled = true;
    }


    public MenuItemClickListener(Menu menu1)
    {
        this$0 = SupportMenuInflater.this;
        super();
        menu = menu1;
        resetGroup();
    }
}
