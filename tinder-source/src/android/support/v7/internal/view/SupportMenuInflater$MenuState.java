// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.d.a.b;
import android.support.v4.view.d;
import android.support.v4.view.m;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.i;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

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
    private d itemActionProvider;
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
            aclass = SupportMenuInflater.access$100(SupportMenuInflater.this).getClassLoader().loadClass(s).getConstructor(aclass);
            aclass.setAccessible(true);
            aclass = ((Class []) (aclass.newInstance(aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Class aclass[])
        {
            Log.w("SupportMenuInflater", (new StringBuilder("Cannot instantiate class: ")).append(s).toString(), aclass);
            return null;
        }
        return aclass;
    }

    private void setItem(MenuItem menuitem)
    {
        boolean flag = true;
        MenuItem menuitem1 = menuitem.setChecked(itemChecked).setVisible(itemVisible).setEnabled(itemEnabled);
        boolean flag1;
        if (itemCheckable > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        menuitem1.setCheckable(flag1).setTitleCondensed(itemTitleCondensed).setIcon(itemIconResId).setAlphabeticShortcut(itemAlphabeticShortcut).setNumericShortcut(itemNumericShortcut);
        if (itemShowAsAction >= 0)
        {
            m.a(menuitem, itemShowAsAction);
        }
        if (itemListenerMethodName != null)
        {
            if (SupportMenuInflater.access$100(SupportMenuInflater.this).isRestricted())
            {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuitem.setOnMenuItemClickListener(new MenuItemClickListener(SupportMenuInflater.access$400(SupportMenuInflater.this), itemListenerMethodName));
        }
        if (itemCheckable >= 2)
        {
            if (menuitem instanceof h)
            {
                ((h)menuitem).a(true);
            } else
            if (menuitem instanceof i)
            {
                i j = (i)menuitem;
                try
                {
                    if (j.e == null)
                    {
                        j.e = ((b)j.d).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] {
                            Boolean.TYPE
                        });
                    }
                    j.e.invoke(j.d, new Object[] {
                        Boolean.valueOf(true)
                    });
                }
                catch (Exception exception)
                {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", exception);
                }
            }
        }
        if (itemActionViewClassName != null)
        {
            m.a(menuitem, (View)newInstance(itemActionViewClassName, SupportMenuInflater.access$500(), SupportMenuInflater.access$600(SupportMenuInflater.this)));
        } else
        {
            flag = false;
        }
        if (itemActionViewLayout > 0)
        {
            if (!flag)
            {
                m.b(menuitem, itemActionViewLayout);
            } else
            {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        if (itemActionProvider != null)
        {
            m.a(menuitem, itemActionProvider);
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
        groupId = attributeset.getResourceId(android.support.v7.appcompat.id, 0);
        groupCategory = attributeset.getInt(android.support.v7.appcompat.menuCategory, 0);
        groupOrder = attributeset.getInt(android.support.v7.appcompat.orderInCategory, 0);
        groupCheckable = attributeset.getInt(android.support.v7.appcompat.checkableBehavior, 0);
        groupVisible = attributeset.getBoolean(android.support.v7.appcompat.visible, true);
        groupEnabled = attributeset.getBoolean(android.support.v7.appcompat.enabled, true);
        attributeset.recycle();
    }

    public void readItem(AttributeSet attributeset)
    {
        boolean flag = true;
        attributeset = SupportMenuInflater.access$100(SupportMenuInflater.this).obtainStyledAttributes(attributeset, android.support.v7.appcompat.ate.this._fld0);
        itemId = attributeset.getResourceId(android.support.v7.appcompat.d, 0);
        itemCategoryOrder = attributeset.getInt(android.support.v7.appcompat.enuCategory, groupCategory) & 0xffff0000 | attributeset.getInt(android.support.v7.appcompat.rderInCategory, groupOrder) & 0xffff;
        itemTitle = attributeset.getText(android.support.v7.appcompat.itle);
        itemTitleCondensed = attributeset.getText(android.support.v7.appcompat.itleCondensed);
        itemIconResId = attributeset.getResourceId(android.support.v7.appcompat.con, 0);
        itemAlphabeticShortcut = getShortcut(attributeset.getString(android.support.v7.appcompat.lphabeticShortcut));
        itemNumericShortcut = getShortcut(attributeset.getString(android.support.v7.appcompat.umericShortcut));
        int j;
        if (attributeset.hasValue(android.support.v7.appcompat.heckable))
        {
            if (attributeset.getBoolean(android.support.v7.appcompat.heckable, false))
            {
                j = 1;
            } else
            {
                j = 0;
            }
            itemCheckable = j;
        } else
        {
            itemCheckable = groupCheckable;
        }
        itemChecked = attributeset.getBoolean(android.support.v7.appcompat.hecked, false);
        itemVisible = attributeset.getBoolean(android.support.v7.appcompat.isible, groupVisible);
        itemEnabled = attributeset.getBoolean(android.support.v7.appcompat.nabled, groupEnabled);
        itemShowAsAction = attributeset.getInt(android.support.v7.appcompat.ion, -1);
        itemListenerMethodName = attributeset.getString(android.support.v7.appcompat.nClick);
        itemActionViewLayout = attributeset.getResourceId(android.support.v7.appcompat.out, 0);
        itemActionViewClassName = attributeset.getString(android.support.v7.appcompat.wClass);
        itemActionProviderClassName = attributeset.getString(android.support.v7.appcompat.viderClass);
        if (itemActionProviderClassName != null)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 0;
        }
        if (j != 0 && itemActionViewLayout == 0 && itemActionViewClassName == null)
        {
            itemActionProvider = (d)newInstance(itemActionProviderClassName, SupportMenuInflater.access$200(), SupportMenuInflater.access$300(SupportMenuInflater.this));
        } else
        {
            if (j != 0)
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
