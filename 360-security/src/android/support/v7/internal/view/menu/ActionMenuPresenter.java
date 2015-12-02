// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.d;
import android.support.v7.internal.view.ActionBarPolicy;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            BaseMenuPresenter, ActionMenuView, ActionMenuItemView, MenuBuilder, 
//            MenuItemImpl, MenuPopupHelper, SubMenuBuilder, MenuView, 
//            MenuDialogHelper

public class ActionMenuPresenter extends BaseMenuPresenter
    implements android.support.v4.view.d.a
{
    private class ActionButtonSubmenu extends MenuDialogHelper
    {

        final ActionMenuPresenter this$0;

        public void onDismiss(DialogInterface dialoginterface)
        {
            super.onDismiss(dialoginterface);
            mActionButtonPopup = null;
            mOpenSubMenuId = 0;
        }

        public ActionButtonSubmenu(SubMenuBuilder submenubuilder)
        {
            this$0 = ActionMenuPresenter.this;
            super(submenubuilder);
            setCallback(mPopupPresenterCallback);
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
        implements ActionMenuView.ActionMenuChildView
    {

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

        public OverflowMenuButton(Context context)
        {
            this$0 = ActionMenuPresenter.this;
            super(context, null, android.support.v7.a.a.b.actionOverflowButtonStyle);
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


    private static final String TAG = "ActionMenuPresenter";
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
        super(context, android.support.v7.a.a.g.abc_action_menu_layout, android.support.v7.a.a.g.abc_action_menu_item_layout);
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
        if (!(view1 instanceof MenuView.ItemView))
        {
            continue; /* Loop/switch isn't completed */
        }
        view = view1;
        if (((MenuView.ItemView)view1).getItemData() == menuitem) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L4:
        return null;
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
        int k;
        int l;
        int k2;
        int k3;
        int l3;
label0:
        {
            arraylist = mMenu.getVisibleItems();
            k3 = arraylist.size();
            int i = mMaxItems;
            k2 = mActionItemWidthLimit;
            l3 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            viewgroup = (ViewGroup)mMenuView;
            l = 0;
            int i1 = 0;
            boolean flag = false;
            k = 0;
            while (k < k3) 
            {
                MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(k);
                if (menuitemimpl.requiresActionButton())
                {
                    l++;
                } else
                if (menuitemimpl.requestsActionButton())
                {
                    i1++;
                } else
                {
                    flag = true;
                }
                if (mExpandedActionViewsExclusive && menuitemimpl.isActionViewExpanded())
                {
                    i = 0;
                }
                k++;
            }
            k = i;
            if (!mReserveOverflow)
            {
                break label0;
            }
            if (!flag)
            {
                k = i;
                if (l + i1 <= i)
                {
                    break label0;
                }
            }
            k = i - 1;
        }
        k -= l;
        SparseBooleanArray sparsebooleanarray = mActionButtonGroups;
        sparsebooleanarray.clear();
        int j = 0;
        int k1;
        boolean flag1;
        int i2;
        int j2;
        if (mStrictWidthLimit)
        {
            j = k2 / mMinCellSize;
            l = mMinCellSize;
            int j1 = mMinCellSize;
            i2 = (k2 % l) / j + j1;
        } else
        {
            i2 = 0;
        }
        j2 = 0;
        flag1 = false;
        l = j;
        j = k;
        k1 = k2;
        k = ((flag1) ? 1 : 0);
        while (j2 < k3) 
        {
            MenuItemImpl menuitemimpl1 = (MenuItemImpl)arraylist.get(j2);
            int l1;
            if (menuitemimpl1.requiresActionButton())
            {
                View view = getItemView(menuitemimpl1, mScrapActionButtonView, viewgroup);
                if (mScrapActionButtonView == null)
                {
                    mScrapActionButtonView = view;
                }
                int l2;
                if (mStrictWidthLimit)
                {
                    l1 = l - ActionMenuView.measureChildForCells(view, i2, l, l3, 0);
                } else
                {
                    view.measure(l3, l3);
                    l1 = l;
                }
                l = view.getMeasuredWidth();
                if (k == 0)
                {
                    k = l;
                }
                l2 = menuitemimpl1.getGroupId();
                if (l2 != 0)
                {
                    sparsebooleanarray.put(l2, true);
                }
                menuitemimpl1.setIsActionButton(true);
                k1 -= l;
                l = j;
                j = k1;
            } else
            if (menuitemimpl1.requestsActionButton())
            {
                int i4 = menuitemimpl1.getGroupId();
                boolean flag3 = sparsebooleanarray.get(i4);
                boolean flag2;
                if ((j > 0 || flag3) && k1 > 0 && (!mStrictWidthLimit || l > 0))
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (flag2)
                {
                    View view1 = getItemView(menuitemimpl1, mScrapActionButtonView, viewgroup);
                    if (mScrapActionButtonView == null)
                    {
                        mScrapActionButtonView = view1;
                    }
                    int i3;
                    if (mStrictWidthLimit)
                    {
                        l1 = ActionMenuView.measureChildForCells(view1, i2, l, l3, 0);
                        if (l1 == 0)
                        {
                            flag2 = false;
                        }
                        l -= l1;
                    } else
                    {
                        view1.measure(l3, l3);
                    }
                    l1 = view1.getMeasuredWidth();
                    i3 = k1 - l1;
                    k1 = k;
                    if (k == 0)
                    {
                        k1 = l1;
                    }
                    if (mStrictWidthLimit)
                    {
                        if (i3 >= 0)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        flag2 &= k;
                        k = k1;
                        l1 = l;
                        k1 = i3;
                        l = k;
                        k = l1;
                    } else
                    {
                        if (i3 + k1 > 0)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        flag2 &= k;
                        k = l;
                        l = k1;
                        k1 = i3;
                    }
                } else
                {
                    l1 = k;
                    k = l;
                    l = l1;
                }
                if (flag2 && i4 != 0)
                {
                    sparsebooleanarray.put(i4, true);
                } else
                if (flag3)
                {
                    sparsebooleanarray.put(i4, false);
                    int j3 = 0;
                    while (j3 < j2) 
                    {
                        MenuItemImpl menuitemimpl2 = (MenuItemImpl)arraylist.get(j3);
                        l1 = j;
                        if (menuitemimpl2.getGroupId() == i4)
                        {
                            l1 = j;
                            if (menuitemimpl2.isActionButton())
                            {
                                l1 = j + 1;
                            }
                            menuitemimpl2.setIsActionButton(false);
                        }
                        j3++;
                        j = l1;
                    }
                }
                l1 = j;
                if (flag2)
                {
                    l1 = j - 1;
                }
                menuitemimpl1.setIsActionButton(flag2);
                j = k1;
                k1 = l1;
                l1 = k;
                k = l;
                l = k1;
            } else
            {
                l1 = k1;
                k1 = j;
                j = l1;
                l1 = l;
                l = k1;
            }
            l2 = j2 + 1;
            j2 = l;
            l = l1;
            k1 = j;
            j = j2;
            j2 = l2;
        }
        return true;
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
            mMaxItems = mContext.getResources().getInteger(android.support.v7.a.a.f.abc_max_action_buttons);
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
        if (!submenubuilder.hasVisibleItems())
        {
            return false;
        }
        SubMenuBuilder submenubuilder1;
        for (submenubuilder1 = submenubuilder; submenubuilder1.getParentMenu() != mMenu; submenubuilder1 = (SubMenuBuilder)submenubuilder1.getParentMenu()) { }
        if (findViewForItem(submenubuilder1.getItem()) == null)
        {
            if (mOverflowButton == null)
            {
                return false;
            }
            View view = mOverflowButton;
        }
        mOpenSubMenuId = submenubuilder.getItem().getItemId();
        mActionButtonPopup = new ActionButtonSubmenu(submenubuilder);
        mActionButtonPopup.show(null);
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
        if (mReserveOverflow && !isOverflowMenuShowing() && mMenu != null && mMenuView != null && mPostedOpenRunnable == null)
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
        boolean flag1 = true;
        boolean flag2 = false;
        super.updateMenuView(flag);
        if (mMenuView == null)
        {
            return;
        }
        if (mMenu != null)
        {
            ArrayList arraylist = mMenu.getActionItems();
            int k = arraylist.size();
            for (int i = 0; i < k; i++)
            {
                d d1 = ((MenuItemImpl)arraylist.get(i)).getSupportActionProvider();
                if (d1 != null)
                {
                    d1.setSubUiVisibilityListener(this);
                }
            }

        }
        Object obj;
        int j;
        if (mMenu != null)
        {
            obj = mMenu.getNonActionItems();
        } else
        {
            obj = null;
        }
        j = ((flag2) ? 1 : 0);
        if (mReserveOverflow)
        {
            j = ((flag2) ? 1 : 0);
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
                    j = ((flag1) ? 1 : 0);
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
    static OverflowPopup access$102(ActionMenuPresenter actionmenupresenter, OverflowPopup overflowpopup)
    {
        actionmenupresenter.mOverflowPopup = overflowpopup;
        return overflowpopup;
    }

*/


/*
    static ActionButtonSubmenu access$202(ActionMenuPresenter actionmenupresenter, ActionButtonSubmenu actionbuttonsubmenu)
    {
        actionmenupresenter.mActionButtonPopup = actionbuttonsubmenu;
        return actionbuttonsubmenu;
    }

*/


/*
    static OpenOverflowRunnable access$302(ActionMenuPresenter actionmenupresenter, OpenOverflowRunnable openoverflowrunnable)
    {
        actionmenupresenter.mPostedOpenRunnable = openoverflowrunnable;
        return openoverflowrunnable;
    }

*/
}
