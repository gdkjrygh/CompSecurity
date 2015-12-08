// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ActionProvider;
import android.support.v7.internal.transition.ActionBarTransition;
import android.support.v7.internal.view.ActionBarPolicy;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.BaseMenuPresenter;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.support.v7.internal.view.menu.MenuPopupHelper;
import android.support.v7.internal.view.menu.MenuView;
import android.support.v7.internal.view.menu.SubMenuBuilder;
import android.support.v7.internal.widget.TintImageView;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuView, ListPopupWindow

public class ActionMenuPresenter extends BaseMenuPresenter
    implements android.support.v4.view.ActionProvider.SubUiVisibilityListener
{
    /* member class not found */
    class ActionButtonSubmenu {}

    private class ActionMenuPopupCallback extends android.support.v7.internal.view.menu.ActionMenuItemView.PopupCallback
    {

        final ActionMenuPresenter this$0;

        public ListPopupWindow getPopup()
        {
            if (mActionButtonPopup != null)
            {
                return mActionButtonPopup.getPopup();
            } else
            {
                return null;
            }
        }

        private ActionMenuPopupCallback()
        {
            this$0 = ActionMenuPresenter.this;
            PopupCallback();
        }

    }

    private class OverflowMenuButton extends TintImageView
        implements ActionMenuView.ActionMenuChildView
    {

        private final float mTempPts[] = new float[2];
        final ActionMenuPresenter this$0;

        public boolean needsDividerAfter()
        {
            return false;
        }

        public boolean needsDividerBefore()
        {
            return false;
        }

        public boolean performClick()
        {
            if (performClick())
            {
                return true;
            } else
            {
                playSoundEffect(0);
                showOverflowMenu();
                return true;
            }
        }

        protected boolean setFrame(int i, int j, int k, int l)
        {
            boolean flag = setFrame(i, j, k, l);
            android.graphics.drawable.Drawable drawable = getDrawable();
            android.graphics.drawable.Drawable drawable1 = getBackground();
            if (drawable != null && drawable1 != null)
            {
                int i1 = getWidth();
                j = getHeight();
                i = Math.max(i1, j) / 2;
                int j1 = getPaddingLeft();
                int k1 = getPaddingRight();
                k = getPaddingTop();
                l = getPaddingBottom();
                i1 = (i1 + (j1 - k1)) / 2;
                j = (j + (k - l)) / 2;
                DrawableCompat.setHotspotBounds(drawable1, i1 - i, j - i, i1 + i, j + i);
            }
            return flag;
        }

        public OverflowMenuButton(Context context)
        {
            this$0 = ActionMenuPresenter.this;
            TintImageView(context, null, android.support.v7.appcompat.R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setOnTouchListener(new _cls1(ActionMenuPresenter.this));
        }
    }

    private class PopupPresenterCallback
        implements android.support.v7.internal.view.menu.MenuPresenter.Callback
    {

        final ActionMenuPresenter this$0;

        public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
            if (menubuilder instanceof SubMenuBuilder)
            {
                ((SubMenuBuilder)menubuilder).getRootMenu().close(false);
            }
            android.support.v7.internal.view.menu.MenuPresenter.Callback callback = getCallback();
            if (callback != null)
            {
                callback.onCloseMenu(menubuilder, flag);
            }
        }

        public boolean onOpenSubMenu(MenuBuilder menubuilder)
        {
            if (menubuilder == null)
            {
                return false;
            }
            mOpenSubMenuId = ((SubMenuBuilder)menubuilder).getItem().getItemId();
            android.support.v7.internal.view.menu.MenuPresenter.Callback callback = getCallback();
            boolean flag;
            if (callback != null)
            {
                flag = callback.onOpenSubMenu(menubuilder);
            } else
            {
                flag = false;
            }
            return flag;
        }

        private PopupPresenterCallback()
        {
            this$0 = ActionMenuPresenter.this;
            Object();
        }

    }

    private static class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public int openSubMenuId;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(openSubMenuId);
        }


        SavedState()
        {
        }

        SavedState(Parcel parcel)
        {
            openSubMenuId = parcel.readInt();
        }
    }


    private final SparseBooleanArray mActionButtonGroups = new SparseBooleanArray();
    private ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    private boolean mExpandedActionViewsExclusive;
    private int mMaxItems;
    private boolean mMaxItemsSet;
    private int mMinCellSize;
    int mOpenSubMenuId;
    private View mOverflowButton;
    private OverflowPopup mOverflowPopup;
    private ActionMenuPopupCallback mPopupCallback;
    final PopupPresenterCallback mPopupPresenterCallback = new PopupPresenterCallback();
    private OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private View mScrapActionButtonView;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;

    public ActionMenuPresenter(Context context)
    {
        BaseMenuPresenter(context, android.support.v7.appcompat.R.layout.abc_action_menu_layout, android.support.v7.appcompat.R.layout.abc_action_menu_item_layout);
    }

    private View findViewForItem(MenuItem menuitem)
    {
        ViewGroup viewgroup = (ViewGroup)mMenuView;
        if (viewgroup != null) goto _L2; else goto _L1
_L1:
        View view = null;
_L6:
        return view;
_L2:
        int i;
        int j;
        j = viewgroup.getChildCount();
        i = 0;
_L7:
        if (i >= j) goto _L4; else goto _L3
_L3:
        View view1;
        view1 = viewgroup.getChildAt(i);
        if (!(view1 instanceof android.support.v7.internal.view.menu.MenuView.ItemView))
        {
            continue; /* Loop/switch isn't completed */
        }
        view = view1;
        if (((android.support.v7.internal.view.menu.MenuView.ItemView)view1).getItemData() == menuitem) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L4:
        return null;
    }

    public void bindItemView(MenuItemImpl menuitemimpl, android.support.v7.internal.view.menu.MenuView.ItemView itemview)
    {
        itemview.initialize(menuitemimpl, 0);
        menuitemimpl = (ActionMenuView)mMenuView;
        itemview = (ActionMenuItemView)itemview;
        itemview.setItemInvoker(menuitemimpl);
        if (mPopupCallback == null)
        {
            mPopupCallback = new ActionMenuPopupCallback();
        }
        itemview.setPopupCallback(mPopupCallback);
    }

    public boolean dismissPopupMenus()
    {
        return hideOverflowMenu() | hideSubMenus();
    }

    public boolean filterLeftoverView(ViewGroup viewgroup, int i)
    {
        if (viewgroup.getChildAt(i) == mOverflowButton)
        {
            return false;
        } else
        {
            return filterLeftoverView(viewgroup, i);
        }
    }

    public boolean flagActionItems()
    {
        ArrayList arraylist;
        ViewGroup viewgroup;
        SparseBooleanArray sparsebooleanarray;
        int k;
        int i1;
        int j1;
        int i2;
        int j3;
        int k3;
        int l3;
        int i4;
        boolean flag1;
label0:
        {
            arraylist = mMenu.getVisibleItems();
            l3 = arraylist.size();
            int i = mMaxItems;
            k3 = mActionItemWidthLimit;
            i4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            viewgroup = (ViewGroup)mMenuView;
            i1 = 0;
            int k1 = 0;
            flag1 = false;
            boolean flag = false;
            j1 = 0;
            while (j1 < l3) 
            {
                MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(j1);
                int j2;
                if (menuitemimpl.requiresActionButton())
                {
                    i1++;
                } else
                if (menuitemimpl.requestsActionButton())
                {
                    k1++;
                } else
                {
                    flag = true;
                }
                j2 = i;
                if (mExpandedActionViewsExclusive)
                {
                    j2 = i;
                    if (menuitemimpl.isActionViewExpanded())
                    {
                        j2 = 0;
                    }
                }
                j1++;
                i = j2;
            }
            j1 = i;
            if (!mReserveOverflow)
            {
                break label0;
            }
            if (!flag)
            {
                j1 = i;
                if (i1 + k1 <= i)
                {
                    break label0;
                }
            }
            j1 = i - 1;
        }
        j1 -= i1;
        sparsebooleanarray = mActionButtonGroups;
        sparsebooleanarray.clear();
        j3 = 0;
        i1 = 0;
        if (mStrictWidthLimit)
        {
            i1 = k3 / mMinCellSize;
            int j = mMinCellSize;
            j3 = mMinCellSize + (k3 % j) / i1;
        }
        k = 0;
        i2 = k3;
        k3 = k;
        k = ((flag1) ? 1 : 0);
_L2:
        MenuItemImpl menuitemimpl1;
        int l1;
        if (k3 >= l3)
        {
            break MISSING_BLOCK_LABEL_824;
        }
        menuitemimpl1 = (MenuItemImpl)arraylist.get(k3);
        if (!menuitemimpl1.requiresActionButton())
        {
            break; /* Loop/switch isn't completed */
        }
        View view = getItemView(menuitemimpl1, mScrapActionButtonView, viewgroup);
        if (mScrapActionButtonView == null)
        {
            mScrapActionButtonView = view;
        }
        int k2;
        if (mStrictWidthLimit)
        {
            i1 -= ActionMenuView.measureChildForCells(view, j3, i1, i4, 0);
        } else
        {
            view.measure(i4, i4);
        }
        k2 = view.getMeasuredWidth();
        l1 = i2 - k2;
        i2 = k;
        if (k == 0)
        {
            i2 = k2;
        }
        k = menuitemimpl1.getGroupId();
        if (k != 0)
        {
            sparsebooleanarray.put(k, true);
        }
        menuitemimpl1.setIsActionButton(true);
        k = i2;
_L5:
        k3++;
        i2 = l1;
        if (true) goto _L2; else goto _L1
_L1:
        int j4;
        boolean flag4;
        if (!menuitemimpl1.requestsActionButton())
        {
            break MISSING_BLOCK_LABEL_811;
        }
        j4 = menuitemimpl1.getGroupId();
        flag4 = sparsebooleanarray.get(j4);
        int l2;
        int i3;
        boolean flag2;
        boolean flag3;
        if ((j1 > 0 || flag4) && i2 > 0 && (!mStrictWidthLimit || i1 > 0))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        i3 = i1;
        l2 = k;
        flag3 = flag2;
        l1 = i2;
        if (flag2)
        {
            View view1 = getItemView(menuitemimpl1, mScrapActionButtonView, viewgroup);
            if (mScrapActionButtonView == null)
            {
                mScrapActionButtonView = view1;
            }
            if (mStrictWidthLimit)
            {
                l2 = ActionMenuView.measureChildForCells(view1, j3, i1, i4, 0);
                l1 = i1 - l2;
                i1 = l1;
                if (l2 == 0)
                {
                    flag2 = false;
                    i1 = l1;
                }
            } else
            {
                view1.measure(i4, i4);
            }
            i3 = view1.getMeasuredWidth();
            l1 = i2 - i3;
            l2 = k;
            if (k == 0)
            {
                l2 = i3;
            }
            if (mStrictWidthLimit)
            {
                if (l1 >= 0)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                flag3 = flag2 & k;
                i3 = i1;
            } else
            {
                if (l1 + l2 > 0)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                flag3 = flag2 & k;
                i3 = i1;
            }
        }
        if (!flag3 || j4 == 0) goto _L4; else goto _L3
_L3:
        sparsebooleanarray.put(j4, true);
        k = j1;
_L7:
        j1 = k;
        if (flag3)
        {
            j1 = k - 1;
        }
        menuitemimpl1.setIsActionButton(flag3);
        i1 = i3;
        k = l2;
          goto _L5
_L4:
        k = j1;
        if (!flag4) goto _L7; else goto _L6
_L6:
        sparsebooleanarray.put(j4, false);
        i1 = 0;
_L9:
        k = j1;
        if (i1 >= k3) goto _L7; else goto _L8
_L8:
        MenuItemImpl menuitemimpl2 = (MenuItemImpl)arraylist.get(i1);
        int l = j1;
        if (menuitemimpl2.getGroupId() == j4)
        {
            l = j1;
            if (menuitemimpl2.isActionButton())
            {
                l = j1 + 1;
            }
            menuitemimpl2.setIsActionButton(false);
        }
        i1++;
        j1 = l;
          goto _L9
          goto _L7
        menuitemimpl1.setIsActionButton(false);
        l1 = i2;
          goto _L5
        return true;
    }

    public View getItemView(MenuItemImpl menuitemimpl, View view, ViewGroup viewgroup)
    {
        View view1 = menuitemimpl.getActionView();
        if (view1 == null || menuitemimpl.hasCollapsibleActionView())
        {
            view1 = getItemView(menuitemimpl, view, viewgroup);
        }
        byte byte0;
        if (menuitemimpl.isActionViewExpanded())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view1.setVisibility(byte0);
        menuitemimpl = (ActionMenuView)viewgroup;
        view = view1.getLayoutParams();
        if (!menuitemimpl.checkLayoutParams(view))
        {
            view1.setLayoutParams(menuitemimpl.generateLayoutParams(view));
        }
        return view1;
    }

    public MenuView getMenuView(ViewGroup viewgroup)
    {
        viewgroup = getMenuView(viewgroup);
        ((ActionMenuView)viewgroup).setPresenter(this);
        return viewgroup;
    }

    public boolean hideOverflowMenu()
    {
        if (mPostedOpenRunnable != null && mMenuView != null)
        {
            ((View)mMenuView).removeCallbacks(mPostedOpenRunnable);
            mPostedOpenRunnable = null;
            return true;
        }
        OverflowPopup overflowpopup = mOverflowPopup;
        if (overflowpopup != null)
        {
            overflowpopup.dismiss();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean hideSubMenus()
    {
        if (mActionButtonPopup != null)
        {
            mActionButtonPopup.dismiss();
            return true;
        } else
        {
            return false;
        }
    }

    public void initForMenu(Context context, MenuBuilder menubuilder)
    {
        initForMenu(context, menubuilder);
        menubuilder = context.getResources();
        context = ActionBarPolicy.get(context);
        if (!mReserveOverflowSet)
        {
            mReserveOverflow = context.showsOverflowMenuButton();
        }
        if (!mWidthLimitSet)
        {
            mWidthLimit = context.getEmbeddedMenuWidthLimit();
        }
        if (!mMaxItemsSet)
        {
            mMaxItems = context.getMaxActionButtons();
        }
        int i = mWidthLimit;
        if (mReserveOverflow)
        {
            if (mOverflowButton == null)
            {
                mOverflowButton = new OverflowMenuButton(mSystemContext);
                int j = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                mOverflowButton.measure(j, j);
            }
            i -= mOverflowButton.getMeasuredWidth();
        } else
        {
            mOverflowButton = null;
        }
        mActionItemWidthLimit = i;
        mMinCellSize = (int)(56F * menubuilder.getDisplayMetrics().density);
        mScrapActionButtonView = null;
    }

    public boolean isOverflowMenuShowPending()
    {
        return mPostedOpenRunnable != null || isOverflowMenuShowing();
    }

    public boolean isOverflowMenuShowing()
    {
        return mOverflowPopup != null && mOverflowPopup.isShowing();
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        dismissPopupMenus();
        onCloseMenu(menubuilder, flag);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (!mMaxItemsSet)
        {
            mMaxItems = mContext.getResources().getInteger(android.support.v7.appcompat.R.integer.abc_max_action_buttons);
        }
        if (mMenu != null)
        {
            mMenu.onItemsChanged(true);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        if (((SavedState) (parcelable)).openSubMenuId > 0)
        {
            parcelable = mMenu.findItem(((SavedState) (parcelable)).openSubMenuId);
            if (parcelable != null)
            {
                onSubMenuSelected((SubMenuBuilder)parcelable.getSubMenu());
            }
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState();
        savedstate.openSubMenuId = mOpenSubMenuId;
        return savedstate;
    }

    public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
        if (submenubuilder.hasVisibleItems()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj;
        for (obj = submenubuilder; ((SubMenuBuilder) (obj)).getParentMenu() != mMenu; obj = (SubMenuBuilder)((SubMenuBuilder) (obj)).getParentMenu()) { }
        View view = findViewForItem(((SubMenuBuilder) (obj)).getItem());
        obj = view;
        if (view != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mOverflowButton == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = mOverflowButton;
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        mOpenSubMenuId = submenubuilder.getItem().getItemId();
        mActionButtonPopup = new ActionButtonSubmenu(mContext, submenubuilder);
        mActionButtonPopup.setAnchorView(((View) (obj)));
        mActionButtonPopup.show();
        onSubMenuSelected(submenubuilder);
        return true;
    }

    public void onSubUiVisibilityChanged(boolean flag)
    {
        if (flag)
        {
            onSubMenuSelected(null);
            return;
        } else
        {
            mMenu.close(false);
            return;
        }
    }

    public void setExpandedActionViewsExclusive(boolean flag)
    {
        mExpandedActionViewsExclusive = flag;
    }

    public void setItemLimit(int i)
    {
        mMaxItems = i;
        mMaxItemsSet = true;
    }

    public void setMenuView(ActionMenuView actionmenuview)
    {
        mMenuView = actionmenuview;
        actionmenuview.initialize(mMenu);
    }

    public void setReserveOverflow(boolean flag)
    {
        mReserveOverflow = flag;
        mReserveOverflowSet = true;
    }

    public void setWidthLimit(int i, boolean flag)
    {
        mWidthLimit = i;
        mStrictWidthLimit = flag;
        mWidthLimitSet = true;
    }

    public boolean shouldIncludeItem(int i, MenuItemImpl menuitemimpl)
    {
        return menuitemimpl.isActionButton();
    }

    public boolean showOverflowMenu()
    {
        if (mReserveOverflow && !isOverflowMenuShowing() && mMenu != null && mMenuView != null && mPostedOpenRunnable == null && !mMenu.getNonActionItems().isEmpty())
        {
            mPostedOpenRunnable = new OpenOverflowRunnable(new OverflowPopup(mContext, mMenu, mOverflowButton, true));
            ((View)mMenuView).post(mPostedOpenRunnable);
            onSubMenuSelected(null);
            return true;
        } else
        {
            return false;
        }
    }

    public void updateMenuView(boolean flag)
    {
        Object obj = (ViewGroup)((View)mMenuView).getParent();
        if (obj != null)
        {
            ActionBarTransition.beginDelayedTransition(((ViewGroup) (obj)));
        }
        updateMenuView(flag);
        ((View)mMenuView).requestLayout();
        if (mMenu != null)
        {
            obj = mMenu.getActionItems();
            int k = ((ArrayList) (obj)).size();
            for (int i = 0; i < k; i++)
            {
                ActionProvider actionprovider = ((MenuItemImpl)((ArrayList) (obj)).get(i)).getSupportActionProvider();
                if (actionprovider != null)
                {
                    actionprovider.setSubUiVisibilityListener(this);
                }
            }

        }
        int j;
        boolean flag1;
        if (mMenu != null)
        {
            obj = mMenu.getNonActionItems();
        } else
        {
            obj = null;
        }
        flag1 = false;
        j = ((flag1) ? 1 : 0);
        if (mReserveOverflow)
        {
            j = ((flag1) ? 1 : 0);
            if (obj != null)
            {
                j = ((ArrayList) (obj)).size();
                if (j == 1)
                {
                    if (!((MenuItemImpl)((ArrayList) (obj)).get(0)).isActionViewExpanded())
                    {
                        j = 1;
                    } else
                    {
                        j = 0;
                    }
                } else
                if (j > 0)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
            }
        }
        if (j == 0) goto _L2; else goto _L1
_L1:
        if (mOverflowButton == null)
        {
            mOverflowButton = new OverflowMenuButton(mSystemContext);
        }
        obj = (ViewGroup)mOverflowButton.getParent();
        if (obj != mMenuView)
        {
            if (obj != null)
            {
                ((ViewGroup) (obj)).removeView(mOverflowButton);
            }
            obj = (ActionMenuView)mMenuView;
            ((ActionMenuView) (obj)).addView(mOverflowButton, ((ActionMenuView) (obj)).generateOverflowButtonLayoutParams());
        }
_L4:
        ((ActionMenuView)mMenuView).setOverflowReserved(mReserveOverflow);
        return;
_L2:
        if (mOverflowButton != null && mOverflowButton.getParent() == mMenuView)
        {
            ((ViewGroup)mMenuView).removeView(mOverflowButton);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }



/*
    static OverflowPopup access$202(ActionMenuPresenter actionmenupresenter, OverflowPopup overflowpopup)
    {
        actionmenupresenter.mOverflowPopup = overflowpopup;
        return overflowpopup;
    }

*/



/*
    static OpenOverflowRunnable access$302(ActionMenuPresenter actionmenupresenter, OpenOverflowRunnable openoverflowrunnable)
    {
        actionmenupresenter.mPostedOpenRunnable = openoverflowrunnable;
        return openoverflowrunnable;
    }

*/






/*
    static ActionButtonSubmenu access$702(ActionMenuPresenter actionmenupresenter, ActionButtonSubmenu actionbuttonsubmenu)
    {
        actionmenupresenter.mActionButtonPopup = actionbuttonsubmenu;
        return actionbuttonsubmenu;
    }

*/



    // Unreferenced inner class android/support/v7/widget/ActionMenuPresenter$OverflowMenuButton$1

/* anonymous class */
    class OverflowMenuButton._cls1 extends ListPopupWindow.ForwardingListener
    {

        final OverflowMenuButton this$1;
        final ActionMenuPresenter val$this$0;

        public ListPopupWindow getPopup()
        {
            if (mOverflowPopup == null)
            {
                return null;
            } else
            {
                return mOverflowPopup.getPopup();
            }
        }

        public boolean onForwardingStarted()
        {
            showOverflowMenu();
            return true;
        }

        public boolean onForwardingStopped()
        {
            if (mPostedOpenRunnable != null)
            {
                return false;
            } else
            {
                hideOverflowMenu();
                return true;
            }
        }

            
            {
                this$1 = final_overflowmenubutton;
                this$0 = actionmenupresenter;
                ForwardingListener(View.this);
            }
    }

}
