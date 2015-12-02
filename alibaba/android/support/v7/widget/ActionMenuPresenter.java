// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.internal.transition.ActionBarTransition;
import android.support.v7.internal.view.ActionBarPolicy;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.widget.TintImageView;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import bd;
import cp;
import fy;
import gc;
import ge;
import gh;
import gj;
import gm;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuView, ListPopupWindow

public class ActionMenuPresenter extends fy
    implements cp.a
{
    /* member class not found */
    class ActionButtonSubmenu {}

    class ActionMenuPopupCallback extends android.support.v7.internal.view.menu.ActionMenuItemView.b
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

    class OverflowMenuButton extends TintImageView
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
            Drawable drawable = getDrawable();
            Drawable drawable1 = getBackground();
            if (drawable != null && drawable1 != null)
            {
                float af[] = mTempPts;
                af[0] = drawable.getBounds().centerX();
                getImageMatrix().mapPoints(af);
                i = (int)af[0] - getWidth() / 2;
                bd.a(drawable1, i, 0, getWidth() + i, getHeight());
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

    class PopupPresenterCallback
        implements gi.a
    {

        final ActionMenuPresenter this$0;

        public void onCloseMenu(gc gc1, boolean flag)
        {
            if (gc1 instanceof gm)
            {
                ((gm)gc1).p().a(false);
            }
            gi.a a = getCallback();
            if (a != null)
            {
                a.onCloseMenu(gc1, flag);
            }
        }

        public boolean onOpenSubMenu(gc gc1)
        {
            if (gc1 == null)
            {
                return false;
            }
            mOpenSubMenuId = ((gm)gc1).getItem().getItemId();
            gi.a a = getCallback();
            boolean flag;
            if (a != null)
            {
                flag = a.onOpenSubMenu(gc1);
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

    static class SavedState
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
        fy(context, android.support.v7.appcompat.R.layout.abc_action_menu_layout, android.support.v7.appcompat.R.layout.abc_action_menu_item_layout);
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
        if (!(view1 instanceof gj.a))
        {
            continue; /* Loop/switch isn't completed */
        }
        view = view1;
        if (((gj.a)view1).getItemData() == menuitem) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L4:
        return null;
    }

    public void bindItemView(ge ge1, gj.a a)
    {
        a.a(ge1, 0);
        ge1 = (ActionMenuView)mMenuView;
        a = (ActionMenuItemView)a;
        a.setItemInvoker(ge1);
        if (mPopupCallback == null)
        {
            mPopupCallback = new ActionMenuPopupCallback();
        }
        a.setPopupCallback(mPopupCallback);
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
        int l;
        int l2;
        int l3;
        int i4;
label0:
        {
            arraylist = mMenu.i();
            l3 = arraylist.size();
            int i = mMaxItems;
            l2 = mActionItemWidthLimit;
            i4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            viewgroup = (ViewGroup)mMenuView;
            l = 0;
            int i1 = 0;
            boolean flag = false;
            k = 0;
            while (k < l3) 
            {
                ge ge1 = (ge)arraylist.get(k);
                if (ge1.l())
                {
                    l++;
                } else
                if (ge1.k())
                {
                    i1++;
                } else
                {
                    flag = true;
                }
                if (mExpandedActionViewsExclusive && ge1.isActionViewExpanded())
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
        int j2;
        int k2;
        if (mStrictWidthLimit)
        {
            j = l2 / mMinCellSize;
            l = mMinCellSize;
            int j1 = mMinCellSize;
            j2 = (l2 % l) / j + j1;
        } else
        {
            j2 = 0;
        }
        k2 = 0;
        flag1 = false;
        l = j;
        j = k;
        k1 = l2;
        k = ((flag1) ? 1 : 0);
        while (k2 < l3) 
        {
            ge ge2 = (ge)arraylist.get(k2);
            int l1;
            if (ge2.l())
            {
                View view = getItemView(ge2, mScrapActionButtonView, viewgroup);
                if (mScrapActionButtonView == null)
                {
                    mScrapActionButtonView = view;
                }
                int i3;
                if (mStrictWidthLimit)
                {
                    l1 = l - ActionMenuView.measureChildForCells(view, j2, l, i4, 0);
                } else
                {
                    view.measure(i4, i4);
                    l1 = l;
                }
                l = view.getMeasuredWidth();
                if (k == 0)
                {
                    k = l;
                }
                i3 = ge2.getGroupId();
                if (i3 != 0)
                {
                    sparsebooleanarray.put(i3, true);
                }
                ge2.d(true);
                k1 -= l;
                l = j;
                j = k1;
            } else
            if (ge2.k())
            {
                int j4 = ge2.getGroupId();
                boolean flag3 = sparsebooleanarray.get(j4);
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
                    View view1 = getItemView(ge2, mScrapActionButtonView, viewgroup);
                    if (mScrapActionButtonView == null)
                    {
                        mScrapActionButtonView = view1;
                    }
                    int j3;
                    if (mStrictWidthLimit)
                    {
                        l1 = ActionMenuView.measureChildForCells(view1, j2, l, i4, 0);
                        if (l1 == 0)
                        {
                            flag2 = false;
                        }
                        l -= l1;
                    } else
                    {
                        view1.measure(i4, i4);
                    }
                    l1 = view1.getMeasuredWidth();
                    j3 = k1 - l1;
                    k1 = k;
                    if (k == 0)
                    {
                        k1 = l1;
                    }
                    if (mStrictWidthLimit)
                    {
                        if (j3 >= 0)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        flag2 &= k;
                        k = k1;
                        l1 = l;
                        k1 = j3;
                        l = k;
                        k = l1;
                    } else
                    {
                        if (j3 + k1 > 0)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        flag2 &= k;
                        k = l;
                        l = k1;
                        k1 = j3;
                    }
                } else
                {
                    int i2 = k;
                    k = l;
                    l = i2;
                }
                if (flag2 && j4 != 0)
                {
                    sparsebooleanarray.put(j4, true);
                } else
                if (flag3)
                {
                    sparsebooleanarray.put(j4, false);
                    int k3 = 0;
                    while (k3 < k2) 
                    {
                        ge ge3 = (ge)arraylist.get(k3);
                        l1 = j;
                        if (ge3.getGroupId() == j4)
                        {
                            l1 = j;
                            if (ge3.j())
                            {
                                l1 = j + 1;
                            }
                            ge3.d(false);
                        }
                        k3++;
                        j = l1;
                    }
                }
                l1 = j;
                if (flag2)
                {
                    l1 = j - 1;
                }
                ge2.d(flag2);
                j = k1;
                k1 = l1;
                l1 = k;
                k = l;
                l = k1;
            } else
            {
                ge2.d(false);
                l1 = k1;
                k1 = j;
                j = l1;
                l1 = l;
                l = k1;
            }
            i3 = k2 + 1;
            k2 = l;
            l = l1;
            k1 = j;
            j = k2;
            k2 = i3;
        }
        return true;
    }

    public View getItemView(ge ge1, View view, ViewGroup viewgroup)
    {
        View view1 = ge1.getActionView();
        if (view1 == null || ge1.n())
        {
            view1 = getItemView(ge1, view, viewgroup);
        }
        byte byte0;
        if (ge1.isActionViewExpanded())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view1.setVisibility(byte0);
        ge1 = (ActionMenuView)viewgroup;
        view = view1.getLayoutParams();
        if (!ge1.checkLayoutParams(view))
        {
            view1.setLayoutParams(ge1.generateLayoutParams(view));
        }
        return view1;
    }

    public gj getMenuView(ViewGroup viewgroup)
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

    public void initForMenu(Context context, gc gc1)
    {
        initForMenu(context, gc1);
        gc1 = context.getResources();
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
        mMinCellSize = (int)(56F * gc1.getDisplayMetrics().density);
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

    public void onCloseMenu(gc gc1, boolean flag)
    {
        dismissPopupMenus();
        onCloseMenu(gc1, flag);
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
                onSubMenuSelected((gm)parcelable.getSubMenu());
            }
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState();
        savedstate.openSubMenuId = mOpenSubMenuId;
        return savedstate;
    }

    public boolean onSubMenuSelected(gm gm1)
    {
        if (!gm1.hasVisibleItems())
        {
            return false;
        }
        Object obj;
        for (obj = gm1; ((gm) (obj)).s() != mMenu; obj = (gm)((gm) (obj)).s()) { }
        View view = findViewForItem(((gm) (obj)).getItem());
        obj = view;
        if (view == null)
        {
            if (mOverflowButton == null)
            {
                return false;
            }
            obj = mOverflowButton;
        }
        mOpenSubMenuId = gm1.getItem().getItemId();
        mActionButtonPopup = new ActionButtonSubmenu(mContext, gm1);
        mActionButtonPopup.setAnchorView(((View) (obj)));
        mActionButtonPopup.show();
        onSubMenuSelected(gm1);
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

    public boolean shouldIncludeItem(int i, ge ge1)
    {
        return ge1.j();
    }

    public boolean showOverflowMenu()
    {
        if (mReserveOverflow && !isOverflowMenuShowing() && mMenu != null && mMenuView != null && mPostedOpenRunnable == null && !mMenu.l().isEmpty())
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
            obj = mMenu.k();
            int k = ((ArrayList) (obj)).size();
            for (int i = 0; i < k; i++)
            {
                cp cp1 = ((ge)((ArrayList) (obj)).get(i)).a();
                if (cp1 != null)
                {
                    cp1.setSubUiVisibilityListener(this);
                }
            }

        }
        int j;
        if (mMenu != null)
        {
            obj = mMenu.l();
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
                    if (!((ge)((ArrayList) (obj)).get(0)).isActionViewExpanded())
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
