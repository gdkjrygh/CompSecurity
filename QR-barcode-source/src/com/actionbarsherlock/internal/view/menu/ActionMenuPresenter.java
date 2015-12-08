// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.actionbarsherlock.internal.ResourcesCompat;
import com.actionbarsherlock.internal.view.View_HasStateListenerSupport;
import com.actionbarsherlock.internal.view.View_OnAttachStateChangeListener;
import com.actionbarsherlock.view.ActionProvider;
import com.actionbarsherlock.view.MenuItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            BaseMenuPresenter, ActionMenuView, ActionMenuItemView, MenuBuilder, 
//            MenuItemImpl, MenuPopupHelper, SubMenuBuilder, MenuView

public class ActionMenuPresenter extends BaseMenuPresenter
    implements com.actionbarsherlock.view.ActionProvider.SubUiVisibilityListener
{
    private class ActionButtonSubmenu extends MenuPopupHelper
    {

        final ActionMenuPresenter this$0;

        public void onDismiss()
        {
            super.onDismiss();
            mActionButtonPopup = null;
            mOpenSubMenuId = 0;
        }

        public ActionButtonSubmenu(Context context, SubMenuBuilder submenubuilder)
        {
            int i;
            boolean flag;
            this$0 = ActionMenuPresenter.this;
            super(context, submenubuilder);
            if (!((MenuItemImpl)submenubuilder.getItem()).isActionButton())
            {
                int j;
                if (mOverflowButton == null)
                {
                    context = (View)mMenuView;
                } else
                {
                    context = mOverflowButton;
                }
                setAnchorView(context);
            }
            setCallback(mPopupPresenterCallback);
            flag = false;
            j = submenubuilder.size();
            i = 0;
_L5:
            if (i < j) goto _L2; else goto _L1
_L1:
            setForceShowIcon(flag);
            return;
_L2:
            actionmenupresenter = submenubuilder.getItem(i);
            if (!isVisible() || getIcon() == null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = true;
            if (true) goto _L1; else goto _L3
_L3:
            i++;
            if (true) goto _L5; else goto _L4
_L4:
        }
    }

    private static class HasPermanentMenuKey
    {

        public static boolean get(Context context)
        {
            return ViewConfiguration.get(context).hasPermanentMenuKey();
        }

        private HasPermanentMenuKey()
        {
        }
    }

    private class OpenOverflowRunnable
        implements Runnable
    {

        private OverflowPopup mPopup;
        final ActionMenuPresenter this$0;

        public void run()
        {
            mMenu.changeMenuMode();
            View view = (View)mMenuView;
            if (view != null && view.getWindowToken() != null && mPopup.tryShow())
            {
                mOverflowPopup = mPopup;
            }
            mPostedOpenRunnable = null;
        }

        public OpenOverflowRunnable(OverflowPopup overflowpopup)
        {
            this$0 = ActionMenuPresenter.this;
            super();
            mPopup = overflowpopup;
        }
    }

    private class OverflowMenuButton extends ImageButton
        implements ActionMenuView.ActionMenuChildView, View_HasStateListenerSupport
    {

        private final Set mListeners = new HashSet();
        final ActionMenuPresenter this$0;

        public void addOnAttachStateChangeListener(View_OnAttachStateChangeListener view_onattachstatechangelistener)
        {
            mListeners.add(view_onattachstatechangelistener);
        }

        public boolean needsDividerAfter()
        {
            return false;
        }

        public boolean needsDividerBefore()
        {
            return false;
        }

        protected void onAttachedToWindow()
        {
            super.onAttachedToWindow();
            Iterator iterator = mListeners.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                ((View_OnAttachStateChangeListener)iterator.next()).onViewAttachedToWindow(this);
            } while (true);
        }

        protected void onDetachedFromWindow()
        {
            super.onDetachedFromWindow();
            Iterator iterator = mListeners.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    if (mOverflowPopup != null)
                    {
                        mOverflowPopup.dismiss();
                    }
                    return;
                }
                ((View_OnAttachStateChangeListener)iterator.next()).onViewDetachedFromWindow(this);
            } while (true);
        }

        public boolean performClick()
        {
            if (super.performClick())
            {
                return true;
            } else
            {
                playSoundEffect(0);
                showOverflowMenu();
                return true;
            }
        }

        public void removeOnAttachStateChangeListener(View_OnAttachStateChangeListener view_onattachstatechangelistener)
        {
            mListeners.remove(view_onattachstatechangelistener);
        }

        public OverflowMenuButton(Context context)
        {
            this$0 = ActionMenuPresenter.this;
            super(context, null, com.actionbarsherlock.R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
        }
    }

    private class OverflowPopup extends MenuPopupHelper
    {

        final ActionMenuPresenter this$0;

        public void onDismiss()
        {
            super.onDismiss();
            mMenu.close();
            mOverflowPopup = null;
        }

        public OverflowPopup(Context context, MenuBuilder menubuilder, View view, boolean flag)
        {
            this$0 = ActionMenuPresenter.this;
            super(context, menubuilder, view, flag);
            setCallback(mPopupPresenterCallback);
        }
    }

    private class PopupPresenterCallback
        implements MenuPresenter.Callback
    {

        final ActionMenuPresenter this$0;

        public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
            if (menubuilder instanceof SubMenuBuilder)
            {
                ((SubMenuBuilder)menubuilder).getRootMenu().close(false);
            }
        }

        public boolean onOpenSubMenu(MenuBuilder menubuilder)
        {
            if (menubuilder == null)
            {
                return false;
            } else
            {
                mOpenSubMenuId = ((SubMenuBuilder)menubuilder).getItem().getItemId();
                return false;
            }
        }

        private PopupPresenterCallback()
        {
            this$0 = ActionMenuPresenter.this;
            super();
        }

        PopupPresenterCallback(PopupPresenterCallback popuppresentercallback)
        {
            this();
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
    final PopupPresenterCallback mPopupPresenterCallback = new PopupPresenterCallback(null);
    private OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private View mScrapActionButtonView;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;

    public ActionMenuPresenter(Context context)
    {
        super(context, com.actionbarsherlock.R.layout.abs__action_menu_layout, com.actionbarsherlock.R.layout.abs__action_menu_item_layout);
    }

    private View findViewForItem(MenuItem menuitem)
    {
        ViewGroup viewgroup = (ViewGroup)mMenuView;
        if (viewgroup != null) goto _L2; else goto _L1
_L1:
        View view = null;
_L4:
        return view;
_L2:
        int i;
        int j;
        j = viewgroup.getChildCount();
        i = 0;
_L5:
        View view1;
        if (i >= j)
        {
            return null;
        }
        view1 = viewgroup.getChildAt(i);
        if (!(view1 instanceof MenuView.ItemView))
        {
            break; /* Loop/switch isn't completed */
        }
        view = view1;
        if (((MenuView.ItemView)view1).getItemData() == menuitem) goto _L4; else goto _L3
_L3:
        i++;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public static boolean reserveOverflow(Context context)
    {
        boolean flag = false;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                flag = true;
            }
        } else
        if (!HasPermanentMenuKey.get(context))
        {
            return true;
        }
        return flag;
    }

    public void bindItemView(MenuItemImpl menuitemimpl, MenuView.ItemView itemview)
    {
        itemview.initialize(menuitemimpl, 0);
        menuitemimpl = (ActionMenuView)mMenuView;
        ((ActionMenuItemView)itemview).setItemInvoker(menuitemimpl);
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
            return super.filterLeftoverView(viewgroup, i);
        }
    }

    public boolean flagActionItems()
    {
        ArrayList arraylist;
        ViewGroup viewgroup;
        int i;
        int k;
        int l;
        int i1;
        boolean flag;
        int i2;
        int k2;
        int i3;
        int j3;
        arraylist = mMenu.getVisibleItems();
        i3 = arraylist.size();
        i = mMaxItems;
        k2 = mActionItemWidthLimit;
        j3 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        viewgroup = (ViewGroup)mMenuView;
        k = 0;
        i1 = 0;
        i2 = 0;
        flag = false;
        l = 0;
_L4:
        if (l < i3) goto _L2; else goto _L1
_L1:
        Object obj;
        int j2;
label0:
        {
            l = i;
            if (!mReserveOverflow)
            {
                break label0;
            }
            if (!flag)
            {
                l = i;
                if (k + i1 <= i)
                {
                    break label0;
                }
            }
            l = i - 1;
        }
        l -= k;
        obj = mActionButtonGroups;
        ((SparseBooleanArray) (obj)).clear();
        j2 = 0;
        k = 0;
        if (mStrictWidthLimit)
        {
            k = k2 / mMinCellSize;
            i = mMinCellSize;
            j2 = mMinCellSize + (k2 % i) / k;
        }
        i = 0;
        i1 = k2;
        k2 = i;
        i = i2;
_L7:
        MenuItemImpl menuitemimpl;
        int k1;
        if (k2 >= i3)
        {
            return true;
        }
        menuitemimpl = (MenuItemImpl)arraylist.get(k2);
          goto _L3
_L2:
        obj = (MenuItemImpl)arraylist.get(l);
        if (((MenuItemImpl) (obj)).requiresActionButton())
        {
            k++;
        } else
        if (((MenuItemImpl) (obj)).requestsActionButton())
        {
            i1++;
        } else
        {
            flag = true;
        }
        k1 = i;
        if (mExpandedActionViewsExclusive)
        {
            k1 = i;
            if (((MenuItemImpl) (obj)).isActionViewExpanded())
            {
                k1 = 0;
            }
        }
        l++;
        i = k1;
          goto _L4
_L3:
        if (!menuitemimpl.requiresActionButton()) goto _L6; else goto _L5
_L5:
        int j1;
        int l1;
        int l2;
        View view = getItemView(menuitemimpl, mScrapActionButtonView, viewgroup);
        if (mScrapActionButtonView == null)
        {
            mScrapActionButtonView = view;
        }
        if (mStrictWidthLimit)
        {
            k -= ActionMenuView.measureChildForCells(view, j2, k, j3, 0);
        } else
        {
            view.measure(j3, j3);
        }
        i2 = view.getMeasuredWidth();
        j1 = i1 - i2;
        l1 = i;
        if (i == 0)
        {
            l1 = i2;
        }
        i = menuitemimpl.getGroupId();
        if (i != 0)
        {
            ((SparseBooleanArray) (obj)).put(i, true);
        }
        menuitemimpl.setIsActionButton(true);
        l2 = l;
        i2 = k;
_L9:
        k2++;
        k = i2;
        i = l1;
        l = l2;
        i1 = j1;
          goto _L7
_L6:
        i2 = k;
        l1 = i;
        l2 = l;
        j1 = i1;
        if (!menuitemimpl.requestsActionButton()) goto _L9; else goto _L8
_L8:
        boolean flag3;
        l2 = menuitemimpl.getGroupId();
        flag3 = ((SparseBooleanArray) (obj)).get(l2);
        boolean flag1;
        boolean flag2;
        if ((l > 0 || flag3) && i1 > 0 && (!mStrictWidthLimit || k > 0))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i2 = k;
        l1 = i;
        flag2 = flag1;
        j1 = i1;
        if (flag1)
        {
            View view1 = getItemView(menuitemimpl, mScrapActionButtonView, viewgroup);
            if (mScrapActionButtonView == null)
            {
                mScrapActionButtonView = view1;
            }
            if (mStrictWidthLimit)
            {
                l1 = ActionMenuView.measureChildForCells(view1, j2, k, j3, 0);
                j1 = k - l1;
                k = j1;
                if (l1 == 0)
                {
                    flag1 = false;
                    k = j1;
                }
            } else
            {
                view1.measure(j3, j3);
            }
            i2 = view1.getMeasuredWidth();
            j1 = i1 - i2;
            l1 = i;
            if (i == 0)
            {
                l1 = i2;
            }
            if (mStrictWidthLimit)
            {
                if (j1 >= 0)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                flag2 = flag1 & i;
                i2 = k;
            } else
            {
                if (j1 + l1 > 0)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                flag2 = flag1 & i;
                i2 = k;
            }
        }
        if (!flag2 || l2 == 0) goto _L11; else goto _L10
_L10:
        ((SparseBooleanArray) (obj)).put(l2, true);
        i = l;
_L13:
        k = i;
        if (flag2)
        {
            k = i - 1;
        }
        menuitemimpl.setIsActionButton(flag2);
        l2 = k;
          goto _L9
_L11:
        i = l;
        if (!flag3) goto _L13; else goto _L12
_L12:
        ((SparseBooleanArray) (obj)).put(l2, false);
        k = 0;
_L15:
        i = l;
        if (k >= k2) goto _L13; else goto _L14
_L14:
        MenuItemImpl menuitemimpl1 = (MenuItemImpl)arraylist.get(k);
        int j = l;
        if (menuitemimpl1.getGroupId() == l2)
        {
            j = l;
            if (menuitemimpl1.isActionButton())
            {
                j = l + 1;
            }
            menuitemimpl1.setIsActionButton(false);
        }
        k++;
        l = j;
          goto _L15
    }

    public View getItemView(MenuItemImpl menuitemimpl, View view, ViewGroup viewgroup)
    {
        View view1 = menuitemimpl.getActionView();
        if (view1 == null || menuitemimpl.hasCollapsibleActionView())
        {
            view1 = view;
            if (!(view instanceof ActionMenuItemView))
            {
                view1 = null;
            }
            view1 = super.getItemView(menuitemimpl, view1, viewgroup);
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
        viewgroup = super.getMenuView(viewgroup);
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
        super.initForMenu(context, menubuilder);
        menubuilder = context.getResources();
        if (!mReserveOverflowSet)
        {
            mReserveOverflow = reserveOverflow(mContext);
        }
        if (!mWidthLimitSet)
        {
            mWidthLimit = menubuilder.getDisplayMetrics().widthPixels / 2;
        }
        if (!mMaxItemsSet)
        {
            mMaxItems = ResourcesCompat.getResources_getInteger(context, com.actionbarsherlock.R.integer.abs__max_action_buttons);
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

    public boolean isOverflowMenuShowing()
    {
        return mOverflowPopup != null && mOverflowPopup.isShowing();
    }

    public boolean isOverflowReserved()
    {
        return mReserveOverflow;
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        dismissPopupMenus();
        super.onCloseMenu(menubuilder, flag);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (!mMaxItemsSet)
        {
            mMaxItems = ResourcesCompat.getResources_getInteger(mContext, com.actionbarsherlock.R.integer.abs__max_action_buttons);
            if (mMenu != null)
            {
                mMenu.onItemsChanged(true);
            }
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
        View view;
        for (Object obj = submenubuilder; ((SubMenuBuilder) (obj)).getParentMenu() != mMenu; obj = (SubMenuBuilder)((SubMenuBuilder) (obj)).getParentMenu())
        {
            break MISSING_BLOCK_LABEL_102;
        }

        view = findViewForItem(((SubMenuBuilder) (obj)).getItem());
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
        super.onSubMenuSelected(submenubuilder);
        return true;
    }

    public void onSubUiVisibilityChanged(boolean flag)
    {
        if (flag)
        {
            super.onSubMenuSelected(null);
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
            super.onSubMenuSelected(null);
            return true;
        } else
        {
            return false;
        }
    }

    public void updateMenuView(boolean flag)
    {
        super.updateMenuView(flag);
        if (mMenu == null) goto _L2; else goto _L1
_L1:
        Object obj;
        int i;
        int j;
        obj = mMenu.getActionItems();
        j = ((ArrayList) (obj)).size();
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        boolean flag1;
        if (mMenu != null)
        {
            obj = mMenu.getNonActionItems();
        } else
        {
            obj = null;
        }
        flag1 = false;
        i = ((flag1) ? 1 : 0);
        if (mReserveOverflow)
        {
            i = ((flag1) ? 1 : 0);
            if (obj != null)
            {
                i = ((ArrayList) (obj)).size();
                ActionProvider actionprovider;
                if (i == 1)
                {
                    if (((MenuItemImpl)((ArrayList) (obj)).get(0)).isActionViewExpanded())
                    {
                        i = 0;
                    } else
                    {
                        i = 1;
                    }
                } else
                if (i > 0)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
            }
        }
        if (i != 0)
        {
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
        } else
        if (mOverflowButton != null && mOverflowButton.getParent() == mMenuView)
        {
            ((ViewGroup)mMenuView).removeView(mOverflowButton);
        }
        ((ActionMenuView)mMenuView).setOverflowReserved(mReserveOverflow);
        return;
_L3:
        actionprovider = ((MenuItemImpl)((ArrayList) (obj)).get(i)).getActionProvider();
        if (actionprovider != null)
        {
            actionprovider.setSubUiVisibilityListener(this);
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }





}
