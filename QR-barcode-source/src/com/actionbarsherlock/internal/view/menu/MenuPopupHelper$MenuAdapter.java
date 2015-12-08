// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuPopupHelper, MenuBuilder, MenuItemImpl, ListMenuItemView

private class findExpandedIndex extends BaseAdapter
{

    private MenuBuilder mAdapterMenu;
    private int mExpandedIndex;
    final MenuPopupHelper this$0;

    void findExpandedIndex()
    {
        MenuItemImpl menuitemimpl = MenuPopupHelper.access$2(MenuPopupHelper.this).getExpandedItem();
        if (menuitemimpl == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        int i;
        int j;
        arraylist = MenuPopupHelper.access$2(MenuPopupHelper.this).getNonActionItems();
        j = arraylist.size();
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        mExpandedIndex = -1;
        return;
_L3:
        if ((MenuItemImpl)arraylist.get(i) == menuitemimpl)
        {
            mExpandedIndex = i;
            return;
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public int getCount()
    {
        ArrayList arraylist;
        if (MenuPopupHelper.access$0(MenuPopupHelper.this))
        {
            arraylist = mAdapterMenu.getNonActionItems();
        } else
        {
            arraylist = mAdapterMenu.getVisibleItems();
        }
        if (mExpandedIndex < 0)
        {
            return arraylist.size();
        } else
        {
            return arraylist.size() - 1;
        }
    }

    public MenuItemImpl getItem(int i)
    {
        ArrayList arraylist;
        int j;
        if (MenuPopupHelper.access$0(MenuPopupHelper.this))
        {
            arraylist = mAdapterMenu.getNonActionItems();
        } else
        {
            arraylist = mAdapterMenu.getVisibleItems();
        }
        j = i;
        if (mExpandedIndex >= 0)
        {
            j = i;
            if (i >= mExpandedIndex)
            {
                j = i + 1;
            }
        }
        return (MenuItemImpl)arraylist.get(j);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = MenuPopupHelper.access$1(MenuPopupHelper.this).inflate(MenuPopupHelper.ITEM_LAYOUT, viewgroup, false);
        }
        view = (this._cls0)view1;
        if (mForceShowIcon)
        {
            ((ListMenuItemView)view1).setForceShowIcon(true);
        }
        view.(getItem(i), 0);
        return view1;
    }


    public xObserver(MenuBuilder menubuilder)
    {
        this$0 = MenuPopupHelper.this;
        super();
        mExpandedIndex = -1;
        mAdapterMenu = menubuilder;
        registerDataSetObserver(new xObserver(MenuPopupHelper.this, null));
        findExpandedIndex();
    }
}
