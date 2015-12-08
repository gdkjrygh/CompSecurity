// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.support.v7.internal.view.menu.MenuPresenter;
import android.support.v7.internal.view.menu.MenuView;
import android.support.v7.internal.view.menu.SubMenuBuilder;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.design.internal:
//            NavigationMenuView, NavigationMenuItemView

public class NavigationMenuPresenter
    implements MenuPresenter, android.widget.AdapterView.OnItemClickListener
{
    private class NavigationMenuAdapter extends BaseAdapter
    {

        private static final String STATE_CHECKED_ITEMS = "android:menu:checked";
        private static final int VIEW_TYPE_NORMAL = 0;
        private static final int VIEW_TYPE_SEPARATOR = 2;
        private static final int VIEW_TYPE_SUBHEADER = 1;
        private final ArrayList mItems = new ArrayList();
        private ColorDrawable mTransparentIcon;
        private boolean mUpdateSuspended;
        final NavigationMenuPresenter this$0;

        private void appendTransparentIconIfMissing(int i, int j)
        {
            for (; i < j; i++)
            {
                MenuItemImpl menuitemimpl = ((NavigationMenuItem)mItems.get(i)).getMenuItem();
                if (menuitemimpl.getIcon() != null)
                {
                    continue;
                }
                if (mTransparentIcon == null)
                {
                    mTransparentIcon = new ColorDrawable(0x106000d);
                }
                menuitemimpl.setIcon(mTransparentIcon);
            }

        }

        private void prepareMenuItems()
        {
            if (!mUpdateSuspended)
            {
                mItems.clear();
                int j1 = -1;
                int k = 0;
                int l = 0;
                int i1 = 0;
                int i2 = mMenu.getVisibleItems().size();
                while (i1 < i2) 
                {
                    Object obj = (MenuItemImpl)mMenu.getVisibleItems().get(i1);
                    int j;
                    int k1;
                    int l1;
                    if (((MenuItemImpl) (obj)).hasSubMenu())
                    {
                        SubMenu submenu = ((MenuItemImpl) (obj)).getSubMenu();
                        j = l;
                        k1 = j1;
                        l1 = k;
                        if (submenu.hasVisibleItems())
                        {
                            if (i1 != 0)
                            {
                                mItems.add(NavigationMenuItem.separator(mPaddingSeparator, 0));
                            }
                            mItems.add(NavigationMenuItem.of(((MenuItemImpl) (obj))));
                            boolean flag = false;
                            int j2 = mItems.size();
                            k1 = 0;
                            for (l1 = submenu.size(); k1 < l1;)
                            {
                                obj = submenu.getItem(k1);
                                j = ((flag) ? 1 : 0);
                                if (((MenuItem) (obj)).isVisible())
                                {
                                    j = ((flag) ? 1 : 0);
                                    if (!flag)
                                    {
                                        j = ((flag) ? 1 : 0);
                                        if (((MenuItem) (obj)).getIcon() != null)
                                        {
                                            j = 1;
                                        }
                                    }
                                    mItems.add(NavigationMenuItem.of((MenuItemImpl)obj));
                                }
                                k1++;
                                flag = j;
                            }

                            j = l;
                            k1 = j1;
                            l1 = k;
                            if (flag)
                            {
                                appendTransparentIconIfMissing(j2, mItems.size());
                                l1 = k;
                                k1 = j1;
                                j = l;
                            }
                        }
                    } else
                    {
                        k1 = ((MenuItemImpl) (obj)).getGroupId();
                        int i;
                        if (k1 != j1)
                        {
                            l = mItems.size();
                            if (((MenuItemImpl) (obj)).getIcon() != null)
                            {
                                k = 1;
                            } else
                            {
                                k = 0;
                            }
                            j = k;
                            i = l;
                            if (i1 != 0)
                            {
                                i = l + 1;
                                mItems.add(NavigationMenuItem.separator(mPaddingSeparator, mPaddingSeparator));
                                j = k;
                            }
                        } else
                        {
                            j = l;
                            i = k;
                            if (l == 0)
                            {
                                j = l;
                                i = k;
                                if (((MenuItemImpl) (obj)).getIcon() != null)
                                {
                                    j = 1;
                                    appendTransparentIconIfMissing(k, mItems.size());
                                    i = k;
                                }
                            }
                        }
                        if (j != 0 && ((MenuItemImpl) (obj)).getIcon() == null)
                        {
                            ((MenuItemImpl) (obj)).setIcon(0x106000d);
                        }
                        mItems.add(NavigationMenuItem.of(((MenuItemImpl) (obj))));
                        l1 = i;
                    }
                    i1++;
                    l = j;
                    j1 = k1;
                    k = l1;
                }
            }
        }

        public boolean areAllItemsEnabled()
        {
            return false;
        }

        public Bundle createInstanceState()
        {
            Bundle bundle = new Bundle();
            ArrayList arraylist = new ArrayList();
            Iterator iterator = mItems.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                MenuItemImpl menuitemimpl = ((NavigationMenuItem)iterator.next()).getMenuItem();
                if (menuitemimpl != null && menuitemimpl.isChecked())
                {
                    arraylist.add(Integer.valueOf(menuitemimpl.getItemId()));
                }
            } while (true);
            bundle.putIntegerArrayList("android:menu:checked", arraylist);
            return bundle;
        }

        public int getCount()
        {
            return mItems.size();
        }

        public NavigationMenuItem getItem(int i)
        {
            return (NavigationMenuItem)mItems.get(i);
        }

        public volatile Object getItem(int i)
        {
            return getItem(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public int getItemViewType(int i)
        {
            NavigationMenuItem navigationmenuitem = getItem(i);
            if (navigationmenuitem.isSeparator())
            {
                return 2;
            }
            return !navigationmenuitem.getMenuItem().hasSubMenu() ? 0 : 1;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            NavigationMenuItem navigationmenuitem = getItem(i);
            View view3;
            switch (getItemViewType(i))
            {
            default:
                return view;

            case 0: // '\0'
                View view1 = view;
                if (view == null)
                {
                    view1 = mLayoutInflater.inflate(android.support.design.R.layout.design_navigation_item, viewgroup, false);
                }
                viewgroup = (NavigationMenuItemView)view1;
                viewgroup.setIconTintList(mIconTintList);
                viewgroup.setTextColor(mTextColor);
                if (mItemBackground != null)
                {
                    view = mItemBackground.getConstantState().newDrawable();
                } else
                {
                    view = null;
                }
                viewgroup.setBackgroundDrawable(view);
                viewgroup.initialize(navigationmenuitem.getMenuItem(), 0);
                return view1;

            case 1: // '\001'
                View view2 = view;
                if (view == null)
                {
                    view2 = mLayoutInflater.inflate(android.support.design.R.layout.design_navigation_item_subheader, viewgroup, false);
                }
                ((TextView)view2).setText(navigationmenuitem.getMenuItem().getTitle());
                return view2;

            case 2: // '\002'
                view3 = view;
                break;
            }
            if (view == null)
            {
                view3 = mLayoutInflater.inflate(android.support.design.R.layout.design_navigation_item_separator, viewgroup, false);
            }
            view3.setPadding(0, navigationmenuitem.getPaddingTop(), 0, navigationmenuitem.getPaddingBottom());
            return view3;
        }

        public int getViewTypeCount()
        {
            return 3;
        }

        public boolean isEnabled(int i)
        {
            return getItem(i).isEnabled();
        }

        public void notifyDataSetChanged()
        {
            prepareMenuItems();
            super.notifyDataSetChanged();
        }

        public void restoreInstanceState(Bundle bundle)
        {
            bundle = bundle.getIntegerArrayList("android:menu:checked");
            if (bundle != null)
            {
                mUpdateSuspended = true;
                Iterator iterator = mItems.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    MenuItemImpl menuitemimpl = ((NavigationMenuItem)iterator.next()).getMenuItem();
                    if (menuitemimpl != null && bundle.contains(Integer.valueOf(menuitemimpl.getItemId())))
                    {
                        menuitemimpl.setChecked(true);
                    }
                } while (true);
                mUpdateSuspended = false;
                prepareMenuItems();
            }
        }

        public void setUpdateSuspended(boolean flag)
        {
            mUpdateSuspended = flag;
        }

        NavigationMenuAdapter()
        {
            this$0 = NavigationMenuPresenter.this;
            super();
            prepareMenuItems();
        }
    }

    private static class NavigationMenuItem
    {

        private final MenuItemImpl mMenuItem;
        private final int mPaddingBottom;
        private final int mPaddingTop;

        public static NavigationMenuItem of(MenuItemImpl menuitemimpl)
        {
            return new NavigationMenuItem(menuitemimpl, 0, 0);
        }

        public static NavigationMenuItem separator(int i, int j)
        {
            return new NavigationMenuItem(null, i, j);
        }

        public MenuItemImpl getMenuItem()
        {
            return mMenuItem;
        }

        public int getPaddingBottom()
        {
            return mPaddingBottom;
        }

        public int getPaddingTop()
        {
            return mPaddingTop;
        }

        public boolean isEnabled()
        {
            return mMenuItem != null && !mMenuItem.hasSubMenu() && mMenuItem.isEnabled();
        }

        public boolean isSeparator()
        {
            return mMenuItem == null;
        }

        private NavigationMenuItem(MenuItemImpl menuitemimpl, int i, int j)
        {
            mMenuItem = menuitemimpl;
            mPaddingTop = i;
            mPaddingBottom = j;
        }
    }


    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HIERARCHY = "android:menu:list";
    private NavigationMenuAdapter mAdapter;
    private android.support.v7.internal.view.menu.MenuPresenter.Callback mCallback;
    private LinearLayout mHeader;
    private ColorStateList mIconTintList;
    private int mId;
    private Drawable mItemBackground;
    private LayoutInflater mLayoutInflater;
    private MenuBuilder mMenu;
    private NavigationMenuView mMenuView;
    private int mPaddingSeparator;
    private int mPaddingTopDefault;
    private ColorStateList mTextColor;

    public NavigationMenuPresenter()
    {
    }

    public void addHeaderView(View view)
    {
        mHeader.addView(view);
        mMenuView.setPadding(0, 0, 0, mMenuView.getPaddingBottom());
    }

    public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
        return false;
    }

    public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
        return false;
    }

    public boolean flagActionItems()
    {
        return false;
    }

    public int getId()
    {
        return mId;
    }

    public Drawable getItemBackground()
    {
        return mItemBackground;
    }

    public ColorStateList getItemTextColor()
    {
        return mTextColor;
    }

    public ColorStateList getItemTintList()
    {
        return mIconTintList;
    }

    public MenuView getMenuView(ViewGroup viewgroup)
    {
        if (mMenuView == null)
        {
            mMenuView = (NavigationMenuView)mLayoutInflater.inflate(android.support.design.R.layout.design_navigation_menu, viewgroup, false);
            if (mAdapter == null)
            {
                mAdapter = new NavigationMenuAdapter();
            }
            mHeader = (LinearLayout)mLayoutInflater.inflate(android.support.design.R.layout.design_navigation_item_header, mMenuView, false);
            mMenuView.addHeaderView(mHeader);
            mMenuView.setAdapter(mAdapter);
            mMenuView.setOnItemClickListener(this);
        }
        return mMenuView;
    }

    public View inflateHeaderView(int i)
    {
        View view = mLayoutInflater.inflate(i, mHeader, false);
        addHeaderView(view);
        return view;
    }

    public void initForMenu(Context context, MenuBuilder menubuilder)
    {
        mLayoutInflater = LayoutInflater.from(context);
        mMenu = menubuilder;
        context = context.getResources();
        mPaddingTopDefault = context.getDimensionPixelOffset(android.support.design.R.dimen.navigation_padding_top_default);
        mPaddingSeparator = context.getDimensionPixelOffset(android.support.design.R.dimen.navigation_separator_vertical_padding);
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        if (mCallback != null)
        {
            mCallback.onCloseMenu(menubuilder, flag);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        i -= mMenuView.getHeaderViewsCount();
        if (i >= 0)
        {
            mMenu.performItemAction(mAdapter.getItem(i).getMenuItem(), this, 0);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (Bundle)parcelable;
        SparseArray sparsearray = parcelable.getSparseParcelableArray("android:menu:list");
        if (sparsearray != null)
        {
            mMenuView.restoreHierarchyState(sparsearray);
        }
        parcelable = parcelable.getBundle("android:menu:adapter");
        if (parcelable != null)
        {
            mAdapter.restoreInstanceState(parcelable);
        }
    }

    public Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        if (mMenuView != null)
        {
            SparseArray sparsearray = new SparseArray();
            mMenuView.saveHierarchyState(sparsearray);
            bundle.putSparseParcelableArray("android:menu:list", sparsearray);
        }
        if (mAdapter != null)
        {
            bundle.putBundle("android:menu:adapter", mAdapter.createInstanceState());
        }
        return bundle;
    }

    public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
        return false;
    }

    public void removeHeaderView(View view)
    {
        mHeader.removeView(view);
        if (mHeader.getChildCount() == 0)
        {
            mMenuView.setPadding(0, mPaddingTopDefault, 0, mMenuView.getPaddingBottom());
        }
    }

    public void setCallback(android.support.v7.internal.view.menu.MenuPresenter.Callback callback)
    {
        mCallback = callback;
    }

    public void setId(int i)
    {
        mId = i;
    }

    public void setItemBackground(Drawable drawable)
    {
        mItemBackground = drawable;
    }

    public void setItemIconTintList(ColorStateList colorstatelist)
    {
        mIconTintList = colorstatelist;
    }

    public void setItemTextColor(ColorStateList colorstatelist)
    {
        mTextColor = colorstatelist;
    }

    public void setUpdateSuspended(boolean flag)
    {
        if (mAdapter != null)
        {
            mAdapter.setUpdateSuspended(flag);
        }
    }

    public void updateMenuView(boolean flag)
    {
        if (mAdapter != null)
        {
            mAdapter.notifyDataSetChanged();
        }
    }






}
