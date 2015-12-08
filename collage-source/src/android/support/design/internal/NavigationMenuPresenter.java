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
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuView;
import android.support.v7.view.menu.SubMenuBuilder;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.design.internal:
//            NavigationMenuView, ParcelableSparseArray, NavigationMenuItemView

public class NavigationMenuPresenter
    implements MenuPresenter
{
    private static class HeaderViewHolder extends ViewHolder
    {

        public HeaderViewHolder(View view)
        {
            super(view);
        }
    }

    private class NavigationMenuAdapter extends android.support.v7.widget.RecyclerView.Adapter
    {

        private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
        private static final String STATE_CHECKED_ITEM = "android:menu:checked";
        private static final int VIEW_TYPE_HEADER = 3;
        private static final int VIEW_TYPE_NORMAL = 0;
        private static final int VIEW_TYPE_SEPARATOR = 2;
        private static final int VIEW_TYPE_SUBHEADER = 1;
        private MenuItemImpl mCheckedItem;
        private final ArrayList mItems = new ArrayList();
        private ColorDrawable mTransparentIcon;
        private boolean mUpdateSuspended;
        final NavigationMenuPresenter this$0;

        private void appendTransparentIconIfMissing(int i, int j)
        {
            for (; i < j; i++)
            {
                MenuItemImpl menuitemimpl = ((NavigationMenuTextItem)mItems.get(i)).getMenuItem();
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
            int i;
            int j;
            int k;
            int l1;
            int k2;
            if (mUpdateSuspended)
            {
                return;
            }
            mUpdateSuspended = true;
            mItems.clear();
            mItems.add(new NavigationMenuHeaderItem());
            k = -1;
            i = 0;
            j = 0;
            k2 = mMenu.getVisibleItems().size();
            l1 = 0;
_L2:
            MenuItemImpl menuitemimpl;
            if (l1 >= k2)
            {
                break MISSING_BLOCK_LABEL_572;
            }
            menuitemimpl = (MenuItemImpl)mMenu.getVisibleItems().get(l1);
            if (menuitemimpl.isChecked())
            {
                setCheckedItem(menuitemimpl);
            }
            if (menuitemimpl.isCheckable())
            {
                menuitemimpl.setExclusiveCheckable(false);
            }
            if (!menuitemimpl.hasSubMenu())
            {
                break; /* Loop/switch isn't completed */
            }
            SubMenu submenu = menuitemimpl.getSubMenu();
            if (submenu.hasVisibleItems())
            {
                if (l1 != 0)
                {
                    mItems.add(new NavigationMenuSeparatorItem(mPaddingSeparator, 0));
                }
                mItems.add(new NavigationMenuTextItem(menuitemimpl));
                boolean flag = false;
                int l2 = mItems.size();
                int i3 = submenu.size();
                for (int i2 = 0; i2 < i3;)
                {
                    MenuItemImpl menuitemimpl1 = (MenuItemImpl)submenu.getItem(i2);
                    boolean flag1 = flag;
                    if (menuitemimpl1.isVisible())
                    {
                        flag1 = flag;
                        if (!flag)
                        {
                            flag1 = flag;
                            if (menuitemimpl1.getIcon() != null)
                            {
                                flag1 = true;
                            }
                        }
                        if (menuitemimpl1.isCheckable())
                        {
                            menuitemimpl1.setExclusiveCheckable(false);
                        }
                        if (menuitemimpl.isChecked())
                        {
                            setCheckedItem(menuitemimpl);
                        }
                        mItems.add(new NavigationMenuTextItem(menuitemimpl1));
                    }
                    i2++;
                    flag = flag1;
                }

                if (flag)
                {
                    appendTransparentIconIfMissing(l2, mItems.size());
                }
            }
            int l = j;
            j = k;
            k = i;
            i = l;
_L5:
            l1++;
            int i1 = j;
            j = i;
            i = k;
            k = i1;
            if (true) goto _L2; else goto _L1
_L1:
            int k1 = menuitemimpl.getGroupId();
            if (k1 == k) goto _L4; else goto _L3
_L3:
            int j1;
            int j2 = mItems.size();
            if (menuitemimpl.getIcon() != null)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            k = i;
            j1 = j2;
            if (l1 == 0)
            {
                break MISSING_BLOCK_LABEL_561;
            }
            mItems.add(new NavigationMenuSeparatorItem(mPaddingSeparator, mPaddingSeparator));
            j = i;
            i = j2 + 1;
_L6:
            if (j != 0 && menuitemimpl.getIcon() == null)
            {
                menuitemimpl.setIcon(0x106000d);
            }
            mItems.add(new NavigationMenuTextItem(menuitemimpl));
            k = i;
            j1 = k1;
            i = j;
            j = j1;
              goto _L5
_L4:
            k = j;
            j1 = i;
            if (j == 0)
            {
                k = j;
                j1 = i;
                if (menuitemimpl.getIcon() != null)
                {
                    k = 1;
                    appendTransparentIconIfMissing(i, mItems.size());
                    j1 = i;
                }
            }
            j = k;
            i = j1;
              goto _L6
            mUpdateSuspended = false;
            return;
        }

        public Bundle createInstanceState()
        {
            Bundle bundle = new Bundle();
            if (mCheckedItem != null)
            {
                bundle.putInt("android:menu:checked", mCheckedItem.getItemId());
            }
            SparseArray sparsearray = new SparseArray();
            Iterator iterator = mItems.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (NavigationMenuItem)iterator.next();
                if (obj instanceof NavigationMenuTextItem)
                {
                    MenuItemImpl menuitemimpl = ((NavigationMenuTextItem)obj).getMenuItem();
                    if (menuitemimpl != null)
                    {
                        obj = menuitemimpl.getActionView();
                    } else
                    {
                        obj = null;
                    }
                    if (obj != null)
                    {
                        ParcelableSparseArray parcelablesparsearray = new ParcelableSparseArray();
                        ((View) (obj)).saveHierarchyState(parcelablesparsearray);
                        sparsearray.put(menuitemimpl.getItemId(), parcelablesparsearray);
                    }
                }
            } while (true);
            bundle.putSparseParcelableArray("android:menu:action_views", sparsearray);
            return bundle;
        }

        public int getItemCount()
        {
            return mItems.size();
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public int getItemViewType(int i)
        {
            NavigationMenuItem navigationmenuitem = (NavigationMenuItem)mItems.get(i);
            if (navigationmenuitem instanceof NavigationMenuSeparatorItem)
            {
                return 2;
            }
            if (navigationmenuitem instanceof NavigationMenuHeaderItem)
            {
                return 3;
            }
            if (navigationmenuitem instanceof NavigationMenuTextItem)
            {
                return !((NavigationMenuTextItem)navigationmenuitem).getMenuItem().hasSubMenu() ? 0 : 1;
            } else
            {
                throw new RuntimeException("Unknown item type.");
            }
        }

        public void onBindViewHolder(ViewHolder viewholder, int i)
        {
            switch (getItemViewType(i))
            {
            default:
                return;

            case 0: // '\0'
                NavigationMenuItemView navigationmenuitemview = (NavigationMenuItemView)viewholder.itemView;
                navigationmenuitemview.setIconTintList(mIconTintList);
                if (mTextAppearanceSet)
                {
                    navigationmenuitemview.setTextAppearance(navigationmenuitemview.getContext(), mTextAppearance);
                }
                if (mTextColor != null)
                {
                    navigationmenuitemview.setTextColor(mTextColor);
                }
                if (mItemBackground != null)
                {
                    viewholder = mItemBackground.getConstantState().newDrawable();
                } else
                {
                    viewholder = null;
                }
                navigationmenuitemview.setBackgroundDrawable(viewholder);
                navigationmenuitemview.initialize(((NavigationMenuTextItem)mItems.get(i)).getMenuItem(), 0);
                return;

            case 1: // '\001'
                ((TextView)viewholder.itemView).setText(((NavigationMenuTextItem)mItems.get(i)).getMenuItem().getTitle());
                return;

            case 2: // '\002'
                NavigationMenuSeparatorItem navigationmenuseparatoritem = (NavigationMenuSeparatorItem)mItems.get(i);
                viewholder.itemView.setPadding(0, navigationmenuseparatoritem.getPaddingTop(), 0, navigationmenuseparatoritem.getPaddingBottom());
                return;
            }
        }

        public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
        {
            onBindViewHolder((ViewHolder)viewholder, i);
        }

        public ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            switch (i)
            {
            default:
                return null;

            case 0: // '\0'
                return new NormalViewHolder(mLayoutInflater, viewgroup, mOnClickListener);

            case 1: // '\001'
                return new SubheaderViewHolder(mLayoutInflater, viewgroup);

            case 2: // '\002'
                return new SeparatorViewHolder(mLayoutInflater, viewgroup);

            case 3: // '\003'
                return new HeaderViewHolder(mHeaderLayout);
            }
        }

        public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            return onCreateViewHolder(viewgroup, i);
        }

        public void onViewRecycled(ViewHolder viewholder)
        {
            if (viewholder instanceof NormalViewHolder)
            {
                ((NavigationMenuItemView)viewholder.itemView).recycle();
            }
        }

        public volatile void onViewRecycled(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
        {
            onViewRecycled((ViewHolder)viewholder);
        }

        public void restoreInstanceState(Bundle bundle)
        {
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0)
            {
                mUpdateSuspended = true;
                Iterator iterator = mItems.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Object obj = (NavigationMenuItem)iterator.next();
                    if (!(obj instanceof NavigationMenuTextItem))
                    {
                        continue;
                    }
                    obj = ((NavigationMenuTextItem)obj).getMenuItem();
                    if (obj == null || ((MenuItemImpl) (obj)).getItemId() != i)
                    {
                        continue;
                    }
                    setCheckedItem(((MenuItemImpl) (obj)));
                    break;
                } while (true);
                mUpdateSuspended = false;
                prepareMenuItems();
            }
            SparseArray sparsearray = bundle.getSparseParcelableArray("android:menu:action_views");
            Iterator iterator1 = mItems.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                bundle = (NavigationMenuItem)iterator1.next();
                if (bundle instanceof NavigationMenuTextItem)
                {
                    MenuItemImpl menuitemimpl = ((NavigationMenuTextItem)bundle).getMenuItem();
                    if (menuitemimpl != null)
                    {
                        bundle = menuitemimpl.getActionView();
                    } else
                    {
                        bundle = null;
                    }
                    if (bundle != null)
                    {
                        bundle.restoreHierarchyState((SparseArray)sparsearray.get(menuitemimpl.getItemId()));
                    }
                }
            } while (true);
        }

        public void setCheckedItem(MenuItemImpl menuitemimpl)
        {
            if (mCheckedItem == menuitemimpl || !menuitemimpl.isCheckable())
            {
                return;
            }
            if (mCheckedItem != null)
            {
                mCheckedItem.setChecked(false);
            }
            mCheckedItem = menuitemimpl;
            menuitemimpl.setChecked(true);
        }

        public void setUpdateSuspended(boolean flag)
        {
            mUpdateSuspended = flag;
        }

        public void update()
        {
            prepareMenuItems();
            notifyDataSetChanged();
        }

        NavigationMenuAdapter()
        {
            this$0 = NavigationMenuPresenter.this;
            super();
            prepareMenuItems();
        }
    }

    private static class NavigationMenuHeaderItem
        implements NavigationMenuItem
    {

        private NavigationMenuHeaderItem()
        {
        }

    }

    private static interface NavigationMenuItem
    {
    }

    private static class NavigationMenuSeparatorItem
        implements NavigationMenuItem
    {

        private final int mPaddingBottom;
        private final int mPaddingTop;

        public int getPaddingBottom()
        {
            return mPaddingBottom;
        }

        public int getPaddingTop()
        {
            return mPaddingTop;
        }

        public NavigationMenuSeparatorItem(int i, int j)
        {
            mPaddingTop = i;
            mPaddingBottom = j;
        }
    }

    private static class NavigationMenuTextItem
        implements NavigationMenuItem
    {

        private final MenuItemImpl mMenuItem;

        public MenuItemImpl getMenuItem()
        {
            return mMenuItem;
        }

        private NavigationMenuTextItem(MenuItemImpl menuitemimpl)
        {
            mMenuItem = menuitemimpl;
        }

    }

    private static class NormalViewHolder extends ViewHolder
    {

        public NormalViewHolder(LayoutInflater layoutinflater, ViewGroup viewgroup, android.view.View.OnClickListener onclicklistener)
        {
            super(layoutinflater.inflate(android.support.design.R.layout.design_navigation_item, viewgroup, false));
            itemView.setOnClickListener(onclicklistener);
        }
    }

    private static class SeparatorViewHolder extends ViewHolder
    {

        public SeparatorViewHolder(LayoutInflater layoutinflater, ViewGroup viewgroup)
        {
            super(layoutinflater.inflate(android.support.design.R.layout.design_navigation_item_separator, viewgroup, false));
        }
    }

    private static class SubheaderViewHolder extends ViewHolder
    {

        public SubheaderViewHolder(LayoutInflater layoutinflater, ViewGroup viewgroup)
        {
            super(layoutinflater.inflate(android.support.design.R.layout.design_navigation_item_subheader, viewgroup, false));
        }
    }

    private static abstract class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public ViewHolder(View view)
        {
            super(view);
        }
    }


    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HIERARCHY = "android:menu:list";
    private NavigationMenuAdapter mAdapter;
    private android.support.v7.view.menu.MenuPresenter.Callback mCallback;
    private LinearLayout mHeaderLayout;
    private ColorStateList mIconTintList;
    private int mId;
    private Drawable mItemBackground;
    private LayoutInflater mLayoutInflater;
    private MenuBuilder mMenu;
    private NavigationMenuView mMenuView;
    private final android.view.View.OnClickListener mOnClickListener = new android.view.View.OnClickListener() {

        final NavigationMenuPresenter this$0;

        public void onClick(View view)
        {
            view = (NavigationMenuItemView)view;
            setUpdateSuspended(true);
            view = view.getItemData();
            boolean flag = mMenu.performItemAction(view, NavigationMenuPresenter.this, 0);
            if (view != null && view.isCheckable() && flag)
            {
                mAdapter.setCheckedItem(view);
            }
            setUpdateSuspended(false);
            updateMenuView(false);
        }

            
            {
                this$0 = NavigationMenuPresenter.this;
                super();
            }
    };
    private int mPaddingSeparator;
    private int mPaddingTopDefault;
    private int mTextAppearance;
    private boolean mTextAppearanceSet;
    private ColorStateList mTextColor;

    public NavigationMenuPresenter()
    {
    }

    public void addHeaderView(View view)
    {
        mHeaderLayout.addView(view);
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

    public int getHeaderCount()
    {
        return mHeaderLayout.getChildCount();
    }

    public View getHeaderView(int i)
    {
        return mHeaderLayout.getChildAt(i);
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
            mHeaderLayout = (LinearLayout)mLayoutInflater.inflate(android.support.design.R.layout.design_navigation_item_header, mMenuView, false);
            mMenuView.setAdapter(mAdapter);
        }
        return mMenuView;
    }

    public View inflateHeaderView(int i)
    {
        View view = mLayoutInflater.inflate(i, mHeaderLayout, false);
        addHeaderView(view);
        return view;
    }

    public void initForMenu(Context context, MenuBuilder menubuilder)
    {
        mLayoutInflater = LayoutInflater.from(context);
        mMenu = menubuilder;
        context = context.getResources();
        mPaddingTopDefault = context.getDimensionPixelOffset(android.support.design.R.dimen.design_navigation_padding_top_default);
        mPaddingSeparator = context.getDimensionPixelOffset(android.support.design.R.dimen.design_navigation_separator_vertical_padding);
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        if (mCallback != null)
        {
            mCallback.onCloseMenu(menubuilder, flag);
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
        mHeaderLayout.removeView(view);
        if (mHeaderLayout.getChildCount() == 0)
        {
            mMenuView.setPadding(0, mPaddingTopDefault, 0, mMenuView.getPaddingBottom());
        }
    }

    public void setCallback(android.support.v7.view.menu.MenuPresenter.Callback callback)
    {
        mCallback = callback;
    }

    public void setCheckedItem(MenuItemImpl menuitemimpl)
    {
        mAdapter.setCheckedItem(menuitemimpl);
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
        updateMenuView(false);
    }

    public void setItemTextAppearance(int i)
    {
        mTextAppearance = i;
        mTextAppearanceSet = true;
        updateMenuView(false);
    }

    public void setItemTextColor(ColorStateList colorstatelist)
    {
        mTextColor = colorstatelist;
        updateMenuView(false);
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
            mAdapter.update();
        }
    }











}
