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
import android.support.v7.internal.view.menu.b;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.l;
import android.support.v7.internal.view.menu.n;
import android.support.v7.internal.view.menu.q;
import android.support.v7.internal.widget.TintImageView;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuView, ListPopupWindow

public class ActionMenuPresenter extends b
    implements android.support.v4.view.ActionProvider.SubUiVisibilityListener
{
    /* member class not found */
    class ActionButtonSubmenu {}

    private class ActionMenuPopupCallback extends android.support.v7.internal.view.menu.ActionMenuItemView.b
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
            b();
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

        protected boolean setFrame(int i, int j, int k, int i1)
        {
            boolean flag = setFrame(i, j, k, i1);
            android.graphics.drawable.Drawable drawable = getDrawable();
            android.graphics.drawable.Drawable drawable1 = getBackground();
            if (drawable != null && drawable1 != null)
            {
                int j1 = getWidth();
                j = getHeight();
                i = Math.max(j1, j) / 2;
                int k1 = getPaddingLeft();
                int l1 = getPaddingRight();
                k = getPaddingTop();
                i1 = getPaddingBottom();
                j1 = (j1 + (k1 - l1)) / 2;
                j = (j + (k - i1)) / 2;
                DrawableCompat.setHotspotBounds(drawable1, j1 - i, j - i, j1 + i, j + i);
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
            class _cls1 extends ListPopupWindow.ForwardingListener
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

                _cls1(ActionMenuPresenter actionmenupresenter)
                {
                    this$1 = OverflowMenuButton.this;
                    this$0 = actionmenupresenter;
                    ForwardingListener(final_view);
                }
            }

            setOnTouchListener(new _cls1(ActionMenuPresenter.this));
        }
    }

    private class PopupPresenterCallback
        implements android.support.v7.internal.view.menu.m.a
    {

        final ActionMenuPresenter this$0;

        public void onCloseMenu(f f1, boolean flag)
        {
            if (f1 instanceof q)
            {
                ((q)f1).l.a(false);
            }
            android.support.v7.internal.view.menu.m.a a = getCallback();
            if (a != null)
            {
                a.onCloseMenu(f1, flag);
            }
        }

        public boolean onOpenSubMenu(f f1)
        {
            if (f1 == null)
            {
                return false;
            }
            mOpenSubMenuId = ((q)f1).getItem().getItemId();
            android.support.v7.internal.view.menu.m.a a = getCallback();
            if (a != null)
            {
                return a.onOpenSubMenu(f1);
            } else
            {
                return false;
            }
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

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
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

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public final SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

                _cls1()
                {
                }
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
        b(context, android.support.v7.appcompat.R.layout.abc_action_menu_layout, android.support.v7.appcompat.R.layout.abc_action_menu_item_layout);
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
        if (!(view1 instanceof android.support.v7.internal.view.menu.n.a))
        {
            continue; /* Loop/switch isn't completed */
        }
        view = view1;
        if (((android.support.v7.internal.view.menu.n.a)view1).getItemData() == menuitem) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L4:
        return null;
    }

    public void bindItemView(h h1, android.support.v7.internal.view.menu.n.a a)
    {
        a.initialize(h1, 0);
        h1 = (ActionMenuView)mMenuView;
        a = (ActionMenuItemView)a;
        a.a = h1;
        if (mPopupCallback == null)
        {
            mPopupCallback = new ActionMenuPopupCallback();
        }
        a.b = mPopupCallback;
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
        int k;
        int i1;
        int i4;
        int k5;
        int l5;
label0:
        {
            arraylist = mMenu.h();
            k5 = arraylist.size();
            int i = mMaxItems;
            i4 = mActionItemWidthLimit;
            l5 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            viewgroup = (ViewGroup)mMenuView;
            i1 = 0;
            int j1 = 0;
            boolean flag = false;
            k = 0;
            while (k < k5) 
            {
                h h1 = (h)arraylist.get(k);
                if (h1.g())
                {
                    i1++;
                } else
                if (h1.f())
                {
                    j1++;
                } else
                {
                    flag = true;
                }
                if (mExpandedActionViewsExclusive && h1.isActionViewExpanded())
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
                if (i1 + j1 <= i)
                {
                    break label0;
                }
            }
            k = i - 1;
        }
        k -= i1;
        SparseBooleanArray sparsebooleanarray = mActionButtonGroups;
        sparsebooleanarray.clear();
        int j;
        int l1;
        boolean flag1;
        int k3;
        int l3;
        if (mStrictWidthLimit)
        {
            j = i4 / mMinCellSize;
            i1 = mMinCellSize;
            int k1 = mMinCellSize;
            k3 = (i4 % i1) / j + k1;
        } else
        {
            k3 = 0;
            j = 0;
        }
        flag1 = false;
        l3 = 0;
        i1 = j;
        j = k;
        l1 = i4;
        k = ((flag1) ? 1 : 0);
        while (l3 < k5) 
        {
            h h2 = (h)arraylist.get(l3);
            if (h2.g())
            {
                View view = getItemView(h2, mScrapActionButtonView, viewgroup);
                if (mScrapActionButtonView == null)
                {
                    mScrapActionButtonView = view;
                }
                int i2;
                int j4;
                if (mStrictWidthLimit)
                {
                    i2 = i1 - ActionMenuView.measureChildForCells(view, k3, i1, l5, 0);
                } else
                {
                    view.measure(l5, l5);
                    i2 = i1;
                }
                i1 = view.getMeasuredWidth();
                if (k == 0)
                {
                    k = i1;
                }
                j4 = h2.getGroupId();
                if (j4 != 0)
                {
                    sparsebooleanarray.put(j4, true);
                }
                h2.c(true);
                i1 = l1 - i1;
                l1 = j;
                j = i2;
            } else
            if (h2.f())
            {
                int i6 = h2.getGroupId();
                boolean flag3 = sparsebooleanarray.get(i6);
                boolean flag2;
                if ((j > 0 || flag3) && l1 > 0 && (!mStrictWidthLimit || i1 > 0))
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                int i3;
                if (flag2)
                {
                    View view1 = getItemView(h2, mScrapActionButtonView, viewgroup);
                    if (mScrapActionButtonView == null)
                    {
                        mScrapActionButtonView = view1;
                    }
                    int k2;
                    int l4;
                    if (mStrictWidthLimit)
                    {
                        int k4 = ActionMenuView.measureChildForCells(view1, k3, i1, l5, 0);
                        int j2 = i1 - k4;
                        i1 = j2;
                        if (k4 == 0)
                        {
                            flag2 = false;
                            i1 = j2;
                        }
                    } else
                    {
                        view1.measure(l5, l5);
                    }
                    l4 = view1.getMeasuredWidth();
                    l1 -= l4;
                    k2 = k;
                    if (k == 0)
                    {
                        k2 = l4;
                    }
                    if (mStrictWidthLimit)
                    {
                        int i5;
                        if (l1 >= 0)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        flag2 &= k;
                        k = i1;
                        i1 = k2;
                    } else
                    {
                        if (l1 + k2 > 0)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        flag2 &= k;
                        k = i1;
                        i1 = k2;
                    }
                } else
                {
                    int j3 = i1;
                    i1 = k;
                    k = j3;
                }
                if (flag2 && i6 != 0)
                {
                    sparsebooleanarray.put(i6, true);
                } else
                if (flag3)
                {
                    sparsebooleanarray.put(i6, false);
                    int j5 = 0;
                    while (j5 < l3) 
                    {
                        h h3 = (h)arraylist.get(j5);
                        int l2 = j;
                        if (h3.getGroupId() == i6)
                        {
                            l2 = j;
                            if (h3.e())
                            {
                                l2 = j + 1;
                            }
                            h3.c(false);
                        }
                        j5++;
                        j = l2;
                    }
                }
                k2 = j;
                if (flag2)
                {
                    k2 = j - 1;
                }
                h2.c(flag2);
                i5 = i1;
                i1 = l1;
                l1 = k2;
                j = k;
                k = i5;
            } else
            {
                h2.c(false);
                i3 = j;
                j = i1;
                i1 = l1;
                l1 = i3;
            }
            j4 = l3 + 1;
            i2 = i1;
            l3 = l1;
            i1 = j;
            l1 = i2;
            j = l3;
            l3 = j4;
        }
        return true;
    }

    public View getItemView(h h1, View view, ViewGroup viewgroup)
    {
        View view1 = h1.getActionView();
        if (view1 == null || h1.h())
        {
            view1 = getItemView(h1, view, viewgroup);
        }
        byte byte0;
        if (h1.isActionViewExpanded())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view1.setVisibility(byte0);
        h1 = (ActionMenuView)viewgroup;
        view = view1.getLayoutParams();
        if (!h1.checkLayoutParams(view))
        {
            view1.setLayoutParams(h1.generateLayoutParams(view));
        }
        return view1;
    }

    public n getMenuView(ViewGroup viewgroup)
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

    public void initForMenu(Context context, f f1)
    {
        initForMenu(context, f1);
        f1 = context.getResources();
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
        mMinCellSize = (int)(56F * f1.getDisplayMetrics().density);
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

    public boolean isOverflowReserved()
    {
        return mReserveOverflow;
    }

    public void onCloseMenu(f f1, boolean flag)
    {
        dismissPopupMenus();
        onCloseMenu(f1, flag);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (!mMaxItemsSet)
        {
            mMaxItems = mContext.getResources().getInteger(android.support.v7.appcompat.R.integer.abc_max_action_buttons);
        }
        if (mMenu != null)
        {
            mMenu.b(true);
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
                onSubMenuSelected((q)parcelable.getSubMenu());
            }
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState();
        savedstate.openSubMenuId = mOpenSubMenuId;
        return savedstate;
    }

    public boolean onSubMenuSelected(q q1)
    {
        if (!q1.hasVisibleItems())
        {
            return false;
        }
        Object obj;
        for (obj = q1; ((q) (obj)).l != mMenu; obj = (q)((q) (obj)).l) { }
        View view = findViewForItem(((q) (obj)).getItem());
        obj = view;
        if (view == null)
        {
            if (mOverflowButton == null)
            {
                return false;
            }
            obj = mOverflowButton;
        }
        mOpenSubMenuId = q1.getItem().getItemId();
        mActionButtonPopup = new ActionButtonSubmenu(mContext, q1);
        mActionButtonPopup.setAnchorView(((View) (obj)));
        mActionButtonPopup.show();
        onSubMenuSelected(q1);
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
            mMenu.a(false);
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

    public boolean shouldIncludeItem(int i, h h1)
    {
        return h1.e();
    }

    public boolean showOverflowMenu()
    {
        if (mReserveOverflow && !isOverflowMenuShowing() && mMenu != null && mMenuView != null && mPostedOpenRunnable == null && !mMenu.j().isEmpty())
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
        boolean flag1 = true;
        boolean flag2 = false;
        Object obj = (ViewGroup)((View)mMenuView).getParent();
        if (obj != null)
        {
            ActionBarTransition.beginDelayedTransition(((ViewGroup) (obj)));
        }
        updateMenuView(flag);
        ((View)mMenuView).requestLayout();
        if (mMenu != null)
        {
            obj = mMenu;
            ((f) (obj)).i();
            obj = ((f) (obj)).d;
            int k = ((ArrayList) (obj)).size();
            for (int i = 0; i < k; i++)
            {
                ActionProvider actionprovider = ((h)((ArrayList) (obj)).get(i)).getSupportActionProvider();
                if (actionprovider != null)
                {
                    actionprovider.setSubUiVisibilityListener(this);
                }
            }

        }
        int j;
        if (mMenu != null)
        {
            obj = mMenu.j();
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
                    if (!((h)((ArrayList) (obj)).get(0)).isActionViewExpanded())
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


}
