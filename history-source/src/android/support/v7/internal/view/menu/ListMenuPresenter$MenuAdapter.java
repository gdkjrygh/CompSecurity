// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ListMenuPresenter, MenuBuilder, MenuItemImpl

private class findExpandedIndex extends BaseAdapter
{

    private int mExpandedIndex;
    final ListMenuPresenter this$0;

    void findExpandedIndex()
    {
        MenuItemImpl menuitemimpl = mMenu.getExpandedItem();
        if (menuitemimpl != null)
        {
            ArrayList arraylist = mMenu.getNonActionItems();
            int j = arraylist.size();
            for (int i = 0; i < j; i++)
            {
                if ((MenuItemImpl)arraylist.get(i) == menuitemimpl)
                {
                    mExpandedIndex = i;
                    return;
                }
            }

        }
        mExpandedIndex = -1;
    }

    public int getCount()
    {
        int i = mMenu.getNonActionItems().size() - ListMenuPresenter.access$000(ListMenuPresenter.this);
        if (mExpandedIndex < 0)
        {
            return i;
        } else
        {
            return i - 1;
        }
    }

    public MenuItemImpl getItem(int i)
    {
        ArrayList arraylist = mMenu.getNonActionItems();
        int j = i + ListMenuPresenter.access$000(ListMenuPresenter.this);
        i = j;
        if (mExpandedIndex >= 0)
        {
            i = j;
            if (j >= mExpandedIndex)
            {
                i = j + 1;
            }
        }
        return (MenuItemImpl)arraylist.get(i);
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
            view1 = mInflater.inflate(mItemLayoutRes, viewgroup, false);
        }
        ((es)view1).es(getItem(i), 0);
        return view1;
    }

    public void notifyDataSetChanged()
    {
        findExpandedIndex();
        super.notifyDataSetChanged();
    }

    public I()
    {
        this$0 = ListMenuPresenter.this;
        super();
        mExpandedIndex = -1;
        findExpandedIndex();
    }
}
