// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuPresenter, ExpandedMenuView, MenuBuilder, SubMenuBuilder, 
//            MenuDialogHelper, MenuItemImpl, MenuView

public final class ListMenuPresenter
    implements MenuPresenter, android.widget.AdapterView.OnItemClickListener
{
    private final class MenuAdapter extends BaseAdapter
    {

        private int mExpandedIndex;
        final ListMenuPresenter this$0;

        private void findExpandedIndex()
        {
            MenuItemImpl menuitemimpl = mMenu.mExpandedItem;
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

        public final int getCount()
        {
            int i = mMenu.getNonActionItems().size() + 0;
            if (mExpandedIndex < 0)
            {
                return i;
            } else
            {
                return i - 1;
            }
        }

        public final MenuItemImpl getItem(int i)
        {
            ArrayList arraylist = mMenu.getNonActionItems();
            int j = i + 0;
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

        public final volatile Object getItem(int i)
        {
            return getItem(i);
        }

        public final long getItemId(int i)
        {
            return (long)i;
        }

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = mInflater.inflate(mItemLayoutRes, viewgroup, false);
            }
            ((MenuView.ItemView)view1).initialize$6b732f7b(getItem(i));
            return view1;
        }

        public final void notifyDataSetChanged()
        {
            findExpandedIndex();
            super.notifyDataSetChanged();
        }

        public MenuAdapter()
        {
            this$0 = ListMenuPresenter.this;
            super();
            mExpandedIndex = -1;
            findExpandedIndex();
        }
    }


    MenuAdapter mAdapter;
    public MenuPresenter.Callback mCallback;
    Context mContext;
    LayoutInflater mInflater;
    int mItemLayoutRes;
    MenuBuilder mMenu;
    ExpandedMenuView mMenuView;
    int mThemeRes;

    private ListMenuPresenter(int i)
    {
        mItemLayoutRes = i;
        mThemeRes = 0;
    }

    public ListMenuPresenter(Context context, int i)
    {
        this(0x7f04000e);
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
    }

    public final boolean collapseItemActionView$29f2911(MenuItemImpl menuitemimpl)
    {
        return false;
    }

    public final boolean expandItemActionView$29f2911(MenuItemImpl menuitemimpl)
    {
        return false;
    }

    public final boolean flagActionItems()
    {
        return false;
    }

    public final ListAdapter getAdapter()
    {
        if (mAdapter == null)
        {
            mAdapter = new MenuAdapter();
        }
        return mAdapter;
    }

    public final MenuView getMenuView(ViewGroup viewgroup)
    {
        if (mMenuView == null)
        {
            mMenuView = (ExpandedMenuView)mInflater.inflate(0x7f04000b, viewgroup, false);
            if (mAdapter == null)
            {
                mAdapter = new MenuAdapter();
            }
            mMenuView.setAdapter(mAdapter);
            mMenuView.setOnItemClickListener(this);
        }
        return mMenuView;
    }

    public final void initForMenu(Context context, MenuBuilder menubuilder)
    {
        if (mContext != null)
        {
            mContext = context;
            if (mInflater == null)
            {
                mInflater = LayoutInflater.from(mContext);
            }
        }
        mMenu = menubuilder;
        if (mAdapter != null)
        {
            mAdapter.notifyDataSetChanged();
        }
    }

    public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        if (mCallback != null)
        {
            mCallback.onCloseMenu(menubuilder, flag);
        }
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        mMenu.performItemAction(mAdapter.getItem(i), this, 0);
    }

    public final boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
        if (!submenubuilder.hasVisibleItems())
        {
            return false;
        }
        MenuDialogHelper menudialoghelper = new MenuDialogHelper(submenubuilder);
        Object obj = menudialoghelper.mMenu;
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(((MenuBuilder) (obj)).mContext);
        menudialoghelper.mPresenter = new ListMenuPresenter(builder.P.mContext, 0x7f04000e);
        menudialoghelper.mPresenter.mCallback = menudialoghelper;
        menudialoghelper.mMenu.addMenuPresenter(menudialoghelper.mPresenter);
        builder.setAdapter(menudialoghelper.mPresenter.getAdapter(), menudialoghelper);
        View view = ((MenuBuilder) (obj)).mHeaderView;
        if (view != null)
        {
            builder.setCustomTitle(view);
        } else
        {
            builder.setIcon(((MenuBuilder) (obj)).mHeaderIcon).setTitle(((MenuBuilder) (obj)).mHeaderTitle);
        }
        builder.P.mOnKeyListener = menudialoghelper;
        menudialoghelper.mDialog = builder.create();
        menudialoghelper.mDialog.setOnDismissListener(menudialoghelper);
        obj = menudialoghelper.mDialog.getWindow().getAttributes();
        obj.type = 1003;
        obj.flags = ((android.view.WindowManager.LayoutParams) (obj)).flags | 0x20000;
        menudialoghelper.mDialog.show();
        if (mCallback != null)
        {
            mCallback.onOpenSubMenu(submenubuilder);
        }
        return true;
    }

    public final void updateMenuView(boolean flag)
    {
        if (mAdapter != null)
        {
            mAdapter.notifyDataSetChanged();
        }
    }
}
