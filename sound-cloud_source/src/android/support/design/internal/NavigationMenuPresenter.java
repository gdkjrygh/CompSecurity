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
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.n;
import android.support.v7.internal.view.menu.q;
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
    implements m, android.widget.AdapterView.OnItemClickListener
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
                h h1 = ((NavigationMenuItem)mItems.get(i)).getMenuItem();
                if (h1.getIcon() != null)
                {
                    continue;
                }
                if (mTransparentIcon == null)
                {
                    mTransparentIcon = new ColorDrawable(0x106000d);
                }
                h1.setIcon(mTransparentIcon);
            }

        }

        private void prepareMenuItems()
        {
            if (!mUpdateSuspended) goto _L2; else goto _L1
_L1:
            return;
_L2:
            int i;
            int j;
            int k;
            int l1;
            int j2;
            mItems.clear();
            k = -1;
            j2 = mMenu.h().size();
            l1 = 0;
            j = 0;
            i = 0;
_L6:
            if (l1 >= j2) goto _L1; else goto _L3
_L3:
            Object obj = (h)mMenu.h().get(l1);
            if (!((h) (obj)).hasSubMenu()) goto _L5; else goto _L4
_L4:
            SubMenu submenu = ((h) (obj)).getSubMenu();
            if (submenu.hasVisibleItems())
            {
                if (l1 != 0)
                {
                    mItems.add(NavigationMenuItem.separator(mPaddingSeparator, 0));
                }
                mItems.add(NavigationMenuItem.of(((h) (obj))));
                int k2 = mItems.size();
                int l2 = submenu.size();
                int i2 = 0;
                boolean flag;
                boolean flag1;
                for (flag = false; i2 < l2; flag = flag1)
                {
                    obj = submenu.getItem(i2);
                    flag1 = flag;
                    if (((MenuItem) (obj)).isVisible())
                    {
                        flag1 = flag;
                        if (!flag)
                        {
                            flag1 = flag;
                            if (((MenuItem) (obj)).getIcon() != null)
                            {
                                flag1 = true;
                            }
                        }
                        mItems.add(NavigationMenuItem.of((h)obj));
                    }
                    i2++;
                }

                if (flag)
                {
                    appendTransparentIconIfMissing(k2, mItems.size());
                }
            }
            int l = j;
            j = i;
            i = l;
_L7:
            l1++;
            int i1 = j;
            j = i;
            i = i1;
              goto _L6
_L5:
            int j1;
label0:
            {
                int k1 = ((h) (obj)).getGroupId();
                if (k1 != k)
                {
                    j = mItems.size();
                    if (((h) (obj)).getIcon() != null)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    j1 = i;
                    k = j;
                    if (l1 == 0)
                    {
                        break label0;
                    }
                    mItems.add(NavigationMenuItem.separator(mPaddingSeparator, mPaddingSeparator));
                    j++;
                } else
                {
                    j1 = j;
                    k = i;
                    if (j != 0)
                    {
                        break label0;
                    }
                    j1 = j;
                    k = i;
                    if (((h) (obj)).getIcon() == null)
                    {
                        break label0;
                    }
                    appendTransparentIconIfMissing(i, mItems.size());
                    k = 1;
                    j = i;
                    i = k;
                }
            }
_L8:
            if (i != 0 && ((h) (obj)).getIcon() == null)
            {
                ((h) (obj)).setIcon(0x106000d);
            }
            mItems.add(NavigationMenuItem.of(((h) (obj))));
            k = k1;
              goto _L7
            i = j1;
            j = k;
              goto _L8
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
                h h1 = ((NavigationMenuItem)iterator.next()).getMenuItem();
                if (h1 != null && h1.isChecked())
                {
                    arraylist.add(Integer.valueOf(h1.getItemId()));
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
            getItemViewType(i);
            JVM INSTR tableswitch 0 2: default 40
        //                       0 42
        //                       1 140
        //                       2 177;
               goto _L1 _L2 _L3 _L4
_L1:
            return view;
_L2:
            if (view == null)
            {
                view = mLayoutInflater.inflate(android.support.design.R.layout.design_navigation_item, viewgroup, false);
            }
            NavigationMenuItemView navigationmenuitemview = (NavigationMenuItemView)view;
            navigationmenuitemview.setIconTintList(mIconTintList);
            navigationmenuitemview.setTextColor(mTextColor);
            if (mItemBackground != null)
            {
                viewgroup = mItemBackground.getConstantState().newDrawable();
            } else
            {
                viewgroup = null;
            }
            navigationmenuitemview.setBackgroundDrawable(viewgroup);
            navigationmenuitemview.initialize(navigationmenuitem.getMenuItem(), 0);
            return view;
_L3:
            if (view == null)
            {
                view = mLayoutInflater.inflate(android.support.design.R.layout.design_navigation_item_subheader, viewgroup, false);
            }
            ((TextView)view).setText(navigationmenuitem.getMenuItem().getTitle());
            return view;
_L4:
            View view1 = view;
            if (view == null)
            {
                view1 = mLayoutInflater.inflate(android.support.design.R.layout.design_navigation_item_separator, viewgroup, false);
            }
            view1.setPadding(0, navigationmenuitem.getPaddingTop(), 0, navigationmenuitem.getPaddingBottom());
            view = view1;
            if (true) goto _L1; else goto _L5
_L5:
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
                    h h1 = ((NavigationMenuItem)iterator.next()).getMenuItem();
                    if (h1 != null && bundle.contains(Integer.valueOf(h1.getItemId())))
                    {
                        h1.setChecked(true);
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

        private final h mMenuItem;
        private final int mPaddingBottom;
        private final int mPaddingTop;

        public static NavigationMenuItem of(h h1)
        {
            return new NavigationMenuItem(h1, 0, 0);
        }

        public static NavigationMenuItem separator(int i, int j)
        {
            return new NavigationMenuItem(null, i, j);
        }

        public h getMenuItem()
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

        private NavigationMenuItem(h h1, int i, int j)
        {
            mMenuItem = h1;
            mPaddingTop = i;
            mPaddingBottom = j;
        }
    }


    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HIERARCHY = "android:menu:list";
    private NavigationMenuAdapter mAdapter;
    private android.support.v7.internal.view.menu.m.a mCallback;
    private LinearLayout mHeader;
    private ColorStateList mIconTintList;
    private int mId;
    private Drawable mItemBackground;
    private LayoutInflater mLayoutInflater;
    private f mMenu;
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

    public boolean collapseItemActionView(f f1, h h)
    {
        return false;
    }

    public boolean expandItemActionView(f f1, h h)
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

    public n getMenuView(ViewGroup viewgroup)
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

    public void initForMenu(Context context, f f1)
    {
        mLayoutInflater = LayoutInflater.from(context);
        mMenu = f1;
        context = context.getResources();
        mPaddingTopDefault = context.getDimensionPixelOffset(android.support.design.R.dimen.navigation_padding_top_default);
        mPaddingSeparator = context.getDimensionPixelOffset(android.support.design.R.dimen.navigation_separator_vertical_padding);
    }

    public void onCloseMenu(f f1, boolean flag)
    {
        if (mCallback != null)
        {
            mCallback.onCloseMenu(f1, flag);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        i -= mMenuView.getHeaderViewsCount();
        if (i >= 0)
        {
            mMenu.a(mAdapter.getItem(i).getMenuItem(), this, 0);
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

    public boolean onSubMenuSelected(q q)
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

    public void setCallback(android.support.v7.internal.view.menu.m.a a)
    {
        mCallback = a;
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
