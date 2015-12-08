// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.ViewConfigurationCompat;
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
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuView, ListPopupWindow

public final class ActionMenuPresenter extends BaseMenuPresenter
    implements android.support.v4.view.ActionProvider.SubUiVisibilityListener
{
    private final class ActionButtonSubmenu extends MenuPopupHelper
    {

        private SubMenuBuilder mSubMenu;
        final ActionMenuPresenter this$0;

        public final void onDismiss()
        {
            super.onDismiss();
            mActionButtonPopup = null;
            mOpenSubMenuId = 0;
        }

        public ActionButtonSubmenu(Context context, SubMenuBuilder submenubuilder)
        {
            this$0 = ActionMenuPresenter.this;
            super(context, submenubuilder, null, false, 0x7f0100fb);
            mSubMenu = submenubuilder;
            int i;
            if (!((MenuItemImpl)submenubuilder.getItem()).isActionButton())
            {
                int j;
                boolean flag;
                boolean flag1;
                if (mOverflowButton == null)
                {
                    context = (View)mMenuView;
                } else
                {
                    context = mOverflowButton;
                }
                super.mAnchorView = context;
            }
            super.mPresenterCallback = mPopupPresenterCallback;
            flag1 = false;
            j = submenubuilder.size();
            i = 0;
            do
            {
label0:
                {
                    flag = flag1;
                    if (i < j)
                    {
                        actionmenupresenter = submenubuilder.getItem(i);
                        if (!isVisible() || getIcon() == null)
                        {
                            break label0;
                        }
                        flag = true;
                    }
                    super.mForceShowIcon = flag;
                    return;
                }
                i++;
            } while (true);
        }
    }

    private final class ActionMenuPopupCallback extends android.support.v7.internal.view.menu.ActionMenuItemView.PopupCallback
    {

        final ActionMenuPresenter this$0;

        public final ListPopupWindow getPopup()
        {
            if (mActionButtonPopup != null)
            {
                return ((MenuPopupHelper) (mActionButtonPopup)).mPopup;
            } else
            {
                return null;
            }
        }

        private ActionMenuPopupCallback()
        {
            this$0 = ActionMenuPresenter.this;
            super();
        }

        ActionMenuPopupCallback(byte byte0)
        {
            this();
        }
    }

    private final class OpenOverflowRunnable
        implements Runnable
    {

        private OverflowPopup mPopup;
        final ActionMenuPresenter this$0;

        public final void run()
        {
            Object obj = mMenu;
            if (((MenuBuilder) (obj)).mCallback != null)
            {
                ((MenuBuilder) (obj)).mCallback.onMenuModeChange(((MenuBuilder) (obj)));
            }
            obj = (View)mMenuView;
            if (obj != null && ((View) (obj)).getWindowToken() != null && mPopup.tryShow())
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

    private final class OverflowMenuButton extends TintImageView
        implements ActionMenuView.ActionMenuChildView
    {

        private final float mTempPts[] = new float[2];
        final ActionMenuPresenter this$0;

        public final boolean needsDividerAfter()
        {
            return false;
        }

        public final boolean needsDividerBefore()
        {
            return false;
        }

        public final boolean performClick()
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

        protected final boolean setFrame(int i, int j, int k, int l)
        {
            boolean flag = super.setFrame(i, j, k, l);
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
            super(context, null, 0x7f0100fa);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setOnTouchListener(new _cls1(ActionMenuPresenter.this));
        }
    }

    private final class OverflowPopup extends MenuPopupHelper
    {

        final ActionMenuPresenter this$0;

        public final void onDismiss()
        {
            super.onDismiss();
            mMenu.close();
            mOverflowPopup = null;
        }

        public OverflowPopup(Context context, MenuBuilder menubuilder, View view)
        {
            this$0 = ActionMenuPresenter.this;
            super(context, menubuilder, view, true, 0x7f0100fb);
            super.mDropDownGravity = 0x800005;
            super.mPresenterCallback = mPopupPresenterCallback;
        }
    }

    private final class PopupPresenterCallback
        implements android.support.v7.internal.view.menu.MenuPresenter.Callback
    {

        final ActionMenuPresenter this$0;

        public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
            if (menubuilder instanceof SubMenuBuilder)
            {
                ((SubMenuBuilder)menubuilder).mParentMenu.close(false);
            }
            android.support.v7.internal.view.menu.MenuPresenter.Callback callback = mCallback;
            if (callback != null)
            {
                callback.onCloseMenu(menubuilder, flag);
            }
        }

        public final boolean onOpenSubMenu(MenuBuilder menubuilder)
        {
            if (menubuilder == null)
            {
                return false;
            }
            mOpenSubMenuId = ((SubMenuBuilder)menubuilder).getItem().getItemId();
            android.support.v7.internal.view.menu.MenuPresenter.Callback callback = mCallback;
            if (callback != null)
            {
                return callback.onOpenSubMenu(menubuilder);
            } else
            {
                return false;
            }
        }

        private PopupPresenterCallback()
        {
            this$0 = ActionMenuPresenter.this;
            super();
        }

        PopupPresenterCallback(byte byte0)
        {
            this();
        }
    }

    private static class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new SavedState[i];
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
    ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    public boolean mExpandedActionViewsExclusive;
    public int mMaxItems;
    private int mMinCellSize;
    int mOpenSubMenuId;
    View mOverflowButton;
    OverflowPopup mOverflowPopup;
    private ActionMenuPopupCallback mPopupCallback;
    final PopupPresenterCallback mPopupPresenterCallback = new PopupPresenterCallback((byte)0);
    public OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private View mScrapActionButtonView;
    private int mWidthLimit;

    public ActionMenuPresenter(Context context)
    {
        super(context, 0x7f040004, 0x7f040003);
    }

    public final void bindItemView(MenuItemImpl menuitemimpl, android.support.v7.internal.view.menu.MenuView.ItemView itemview)
    {
        itemview.initialize$6b732f7b(menuitemimpl);
        menuitemimpl = (ActionMenuView)mMenuView;
        itemview = (ActionMenuItemView)itemview;
        itemview.mItemInvoker = menuitemimpl;
        if (mPopupCallback == null)
        {
            mPopupCallback = new ActionMenuPopupCallback((byte)0);
        }
        itemview.mPopupCallback = mPopupCallback;
    }

    public final boolean dismissPopupMenus()
    {
        return hideOverflowMenu() | hideSubMenus();
    }

    public final boolean filterLeftoverView(ViewGroup viewgroup, int i)
    {
        if (viewgroup.getChildAt(i) == mOverflowButton)
        {
            return false;
        } else
        {
            return super.filterLeftoverView(viewgroup, i);
        }
    }

    public final boolean flagActionItems()
    {
        ArrayList arraylist;
        ViewGroup viewgroup;
        SparseBooleanArray sparsebooleanarray;
        int j;
        int l;
        int k2;
        int i3;
        int i4;
        int j4;
        int i1;
        boolean flag1;
        int k3;
label0:
        {
            arraylist = mMenu.getVisibleItems();
            i4 = arraylist.size();
            int i = mMaxItems;
            k3 = mActionItemWidthLimit;
            j4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            viewgroup = (ViewGroup)mMenuView;
            l = 0;
            int l1 = 0;
            flag1 = false;
            boolean flag = false;
            i1 = 0;
            while (i1 < i4) 
            {
                MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(i1);
                int l2;
                if (menuitemimpl.requiresActionButton())
                {
                    l++;
                } else
                if (menuitemimpl.requestsActionButton())
                {
                    l1++;
                } else
                {
                    flag = true;
                }
                l2 = i;
                if (mExpandedActionViewsExclusive)
                {
                    l2 = i;
                    if (menuitemimpl.isActionViewExpanded())
                    {
                        l2 = 0;
                    }
                }
                i1++;
                i = l2;
            }
            i1 = i;
            if (!mReserveOverflow)
            {
                break label0;
            }
            if (!flag)
            {
                i1 = i;
                if (l + l1 <= i)
                {
                    break label0;
                }
            }
            i1 = i - 1;
        }
        l = i1 - l;
        sparsebooleanarray = mActionButtonGroups;
        sparsebooleanarray.clear();
        i3 = 0;
        k2 = k3;
        j = ((flag1) ? 1 : 0);
_L2:
        MenuItemImpl menuitemimpl1;
        if (i3 >= i4)
        {
            break MISSING_BLOCK_LABEL_640;
        }
        menuitemimpl1 = (MenuItemImpl)arraylist.get(i3);
        if (!menuitemimpl1.requiresActionButton())
        {
            break; /* Loop/switch isn't completed */
        }
        View view = getItemView(menuitemimpl1, mScrapActionButtonView, viewgroup);
        if (mScrapActionButtonView == null)
        {
            mScrapActionButtonView = view;
        }
        view.measure(j4, j4);
        int i2 = view.getMeasuredWidth();
        k2 -= i2;
        int j1 = j;
        if (j == 0)
        {
            j1 = i2;
        }
        j = menuitemimpl1.getGroupId();
        if (j != 0)
        {
            sparsebooleanarray.put(j, true);
        }
        menuitemimpl1.setIsActionButton(true);
        j = j1;
_L5:
        i3++;
        if (true) goto _L2; else goto _L1
_L1:
        int l3;
        boolean flag4;
        if (!menuitemimpl1.requestsActionButton())
        {
            break MISSING_BLOCK_LABEL_631;
        }
        l3 = menuitemimpl1.getGroupId();
        flag4 = sparsebooleanarray.get(l3);
        int k1;
        int j2;
        boolean flag2;
        boolean flag3;
        if ((l > 0 || flag4) && k2 > 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        j2 = j;
        flag3 = flag2;
        k1 = k2;
        if (flag2)
        {
            View view1 = getItemView(menuitemimpl1, mScrapActionButtonView, viewgroup);
            if (mScrapActionButtonView == null)
            {
                mScrapActionButtonView = view1;
            }
            view1.measure(j4, j4);
            int j3 = view1.getMeasuredWidth();
            k1 = k2 - j3;
            j2 = j;
            if (j == 0)
            {
                j2 = j3;
            }
            if (k1 + j2 > 0)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            flag3 = flag2 & j;
        }
        if (!flag3 || l3 == 0) goto _L4; else goto _L3
_L3:
        sparsebooleanarray.put(l3, true);
        j = l;
_L7:
        l = j;
        if (flag3)
        {
            l = j - 1;
        }
        menuitemimpl1.setIsActionButton(flag3);
        j = j2;
        k2 = k1;
          goto _L5
_L4:
        j = l;
        if (!flag4) goto _L7; else goto _L6
_L6:
        sparsebooleanarray.put(l3, false);
        k2 = 0;
_L9:
        j = l;
        if (k2 >= i3) goto _L7; else goto _L8
_L8:
        MenuItemImpl menuitemimpl2 = (MenuItemImpl)arraylist.get(k2);
        int k = l;
        if (menuitemimpl2.getGroupId() == l3)
        {
            k = l;
            if (menuitemimpl2.isActionButton())
            {
                k = l + 1;
            }
            menuitemimpl2.setIsActionButton(false);
        }
        k2++;
        l = k;
          goto _L9
          goto _L7
        menuitemimpl1.setIsActionButton(false);
          goto _L5
        return true;
    }

    public final View getItemView(MenuItemImpl menuitemimpl, View view, ViewGroup viewgroup)
    {
        View view1 = menuitemimpl.getActionView();
        if (view1 == null || menuitemimpl.hasCollapsibleActionView())
        {
            view1 = super.getItemView(menuitemimpl, view, viewgroup);
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
            view1.setLayoutParams(ActionMenuView.generateLayoutParams(view));
        }
        return view1;
    }

    public final MenuView getMenuView(ViewGroup viewgroup)
    {
        viewgroup = super.getMenuView(viewgroup);
        ((ActionMenuView)viewgroup).setPresenter(this);
        return viewgroup;
    }

    public final boolean hideOverflowMenu()
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

    public final boolean hideSubMenus()
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

    public final void initForMenu(Context context, MenuBuilder menubuilder)
    {
        boolean flag = true;
        super.initForMenu(context, menubuilder);
        menubuilder = context.getResources();
        context = ActionBarPolicy.get(context);
        if (!mReserveOverflowSet)
        {
            int i;
            int j;
            if (android.os.Build.VERSION.SDK_INT < 19 && ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get(((ActionBarPolicy) (context)).mContext)))
            {
                flag = false;
            }
            mReserveOverflow = flag;
        }
        mWidthLimit = ((ActionBarPolicy) (context)).mContext.getResources().getDisplayMetrics().widthPixels / 2;
        mMaxItems = ((ActionBarPolicy) (context)).mContext.getResources().getInteger(0x7f0e0002);
        i = mWidthLimit;
        if (mReserveOverflow)
        {
            if (mOverflowButton == null)
            {
                mOverflowButton = new OverflowMenuButton(mSystemContext);
                j = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
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

    public final boolean isOverflowMenuShowing()
    {
        return mOverflowPopup != null && mOverflowPopup.isShowing();
    }

    public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        dismissPopupMenus();
        super.onCloseMenu(menubuilder, flag);
    }

    public final boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
        MenuItem menuitem;
        ViewGroup viewgroup;
        if (!submenubuilder.hasVisibleItems())
        {
            return false;
        }
        SubMenuBuilder submenubuilder1;
        for (submenubuilder1 = submenubuilder; submenubuilder1.mParentMenu != mMenu; submenubuilder1 = (SubMenuBuilder)submenubuilder1.mParentMenu) { }
        menuitem = submenubuilder1.getItem();
        viewgroup = (ViewGroup)mMenuView;
        if (viewgroup == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = viewgroup.getChildCount();
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L3
_L3:
        View view = viewgroup.getChildAt(i);
        if (!(view instanceof android.support.v7.internal.view.menu.MenuView.ItemView) || ((android.support.v7.internal.view.menu.MenuView.ItemView)view).getItemData() != menuitem) goto _L5; else goto _L4
_L5:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        view = null;
_L4:
        View view1 = view;
        if (view == null)
        {
            if (mOverflowButton == null)
            {
                return false;
            }
            view1 = mOverflowButton;
        }
        mOpenSubMenuId = submenubuilder.getItem().getItemId();
        mActionButtonPopup = new ActionButtonSubmenu(mContext, submenubuilder);
        mActionButtonPopup.mAnchorView = view1;
        mActionButtonPopup.show();
        super.onSubMenuSelected(submenubuilder);
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void setMenuView(ActionMenuView actionmenuview)
    {
        mMenuView = actionmenuview;
        actionmenuview.mMenu = mMenu;
    }

    public final void setReserveOverflow$1385ff()
    {
        mReserveOverflow = true;
        mReserveOverflowSet = true;
    }

    public final boolean shouldIncludeItem$361c3b3b(MenuItemImpl menuitemimpl)
    {
        return menuitemimpl.isActionButton();
    }

    public final boolean showOverflowMenu()
    {
        if (mReserveOverflow && !isOverflowMenuShowing() && mMenu != null && mMenuView != null && mPostedOpenRunnable == null && !mMenu.getNonActionItems().isEmpty())
        {
            mPostedOpenRunnable = new OpenOverflowRunnable(new OverflowPopup(mContext, mMenu, mOverflowButton));
            ((View)mMenuView).post(mPostedOpenRunnable);
            super.onSubMenuSelected(null);
            return true;
        } else
        {
            return false;
        }
    }

    public final void updateMenuView(boolean flag)
    {
        ((View)mMenuView).getParent();
        super.updateMenuView(flag);
        ((View)mMenuView).requestLayout();
        if (mMenu != null)
        {
            Object obj = mMenu;
            ((MenuBuilder) (obj)).flagActionItems();
            obj = ((MenuBuilder) (obj)).mActionItems;
            int k = ((ArrayList) (obj)).size();
            for (int i = 0; i < k; i++)
            {
                ActionProvider actionprovider = ((MenuItemImpl)((ArrayList) (obj)).get(i)).mActionProvider;
                if (actionprovider != null)
                {
                    actionprovider.mSubUiVisibilityListener = this;
                }
            }

        }
        Object obj1;
        int j;
        boolean flag1;
        if (mMenu != null)
        {
            obj1 = mMenu.getNonActionItems();
        } else
        {
            obj1 = null;
        }
        flag1 = false;
        j = ((flag1) ? 1 : 0);
        if (mReserveOverflow)
        {
            j = ((flag1) ? 1 : 0);
            if (obj1 != null)
            {
                j = ((ArrayList) (obj1)).size();
                if (j == 1)
                {
                    if (!((MenuItemImpl)((ArrayList) (obj1)).get(0)).isActionViewExpanded())
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
        obj1 = (ViewGroup)mOverflowButton.getParent();
        if (obj1 != mMenuView)
        {
            if (obj1 != null)
            {
                ((ViewGroup) (obj1)).removeView(mOverflowButton);
            }
            ((ActionMenuView)mMenuView).addView(mOverflowButton, ActionMenuView.generateOverflowButtonLayoutParams());
        }
_L4:
        ((ActionMenuView)mMenuView).mReserveOverflow = mReserveOverflow;
        return;
_L2:
        if (mOverflowButton != null && mOverflowButton.getParent() == mMenuView)
        {
            ((ViewGroup)mMenuView).removeView(mOverflowButton);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    // Unreferenced inner class android/support/v7/widget/ActionMenuPresenter$OverflowMenuButton$1

/* anonymous class */
    final class OverflowMenuButton._cls1 extends ListPopupWindow.ForwardingListener
    {

        final OverflowMenuButton this$1;
        final ActionMenuPresenter val$this$0;

        public final ListPopupWindow getPopup()
        {
            if (mOverflowPopup == null)
            {
                return null;
            } else
            {
                return ((MenuPopupHelper) (mOverflowPopup)).mPopup;
            }
        }

        public final boolean onForwardingStarted()
        {
            showOverflowMenu();
            return true;
        }

        public final boolean onForwardingStopped()
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
                super(View.this);
            }
    }

}
