// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.support.v7.internal.view.menu.MenuPresenter;
import android.support.v7.internal.view.menu.SubMenuBuilder;
import android.support.v7.internal.widget.DecorToolbar;
import android.support.v7.internal.widget.RtlSpacingHelper;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.support.v7.internal.widget.ToolbarWidgetWrapper;
import android.support.v7.internal.widget.ViewUtils;
import android.support.v7.view.CollapsibleActionView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuView, ActionMenuPresenter

public class Toolbar extends ViewGroup
{
    private class LayoutParams extends android.support.v7.app.ActionBar.LayoutParams
    {

        int mViewType;

        public LayoutParams()
        {
            super(-2, -2);
            mViewType = 0;
            gravity = 0x800013;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            mViewType = 0;
        }

        public LayoutParams(android.support.v7.app.ActionBar.LayoutParams layoutparams)
        {
            super(layoutparams);
            mViewType = 0;
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            mViewType = 0;
            mViewType = layoutparams.mViewType;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            mViewType = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            mViewType = 0;
            leftMargin = marginlayoutparams.leftMargin;
            topMargin = marginlayoutparams.topMargin;
            rightMargin = marginlayoutparams.rightMargin;
            bottomMargin = marginlayoutparams.bottomMargin;
        }
    }

    private class _cls3
        implements android.view.View.OnClickListener
    {

        final Toolbar this$0;

        public final void onClick(View view)
        {
            collapseActionView();
        }

        _cls3()
        {
            this$0 = Toolbar.this;
            super();
        }
    }

    private final class ExpandedActionViewMenuPresenter
        implements MenuPresenter
    {

        MenuItemImpl mCurrentExpandedItem;
        MenuBuilder mMenu;
        final Toolbar this$0;

        public final boolean collapseItemActionView$29f2911(MenuItemImpl menuitemimpl)
        {
            if (mExpandedActionView instanceof CollapsibleActionView)
            {
                ((CollapsibleActionView)mExpandedActionView).onActionViewCollapsed();
            }
            removeView(mExpandedActionView);
            removeView(mCollapseButtonView);
            mExpandedActionView = null;
            int j = this.getChildCount();
            mCurrentExpandedItem = null;
            requestLayout();
            menuitemimpl.setActionViewExpanded(false);
            return true;
        }

        public final boolean expandItemActionView$29f2911(MenuItemImpl menuitemimpl)
        {
            Toolbar.access$200(Toolbar.this);
            if (mCollapseButtonView.getParent() != Toolbar.this)
            {
                addView(mCollapseButtonView);
            }
            mExpandedActionView = menuitemimpl.getActionView();
            mCurrentExpandedItem = menuitemimpl;
            if (mExpandedActionView.getParent() != Toolbar.this)
            {
                LayoutParams layoutparams = Toolbar.generateDefaultLayoutParams();
                layoutparams.gravity = 0x800003 | mButtonGravity & 0x70;
                layoutparams.mViewType = 2;
                mExpandedActionView.setLayoutParams(layoutparams);
                addView(mExpandedActionView);
            }
            int j = this.getChildCount();
            requestLayout();
            menuitemimpl.setActionViewExpanded(true);
            if (mExpandedActionView instanceof CollapsibleActionView)
            {
                ((CollapsibleActionView)mExpandedActionView).onActionViewExpanded();
            }
            return true;
        }

        public final boolean flagActionItems()
        {
            return false;
        }

        public final void initForMenu(Context context, MenuBuilder menubuilder)
        {
            if (mMenu != null && mCurrentExpandedItem != null)
            {
                mMenu.collapseItemActionView(mCurrentExpandedItem);
            }
            mMenu = menubuilder;
        }

        public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
        }

        public final boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
        {
            return false;
        }

        public final void updateMenuView(boolean flag)
        {
            if (mCurrentExpandedItem == null) goto _L2; else goto _L1
_L1:
            boolean flag1;
            boolean flag2;
            flag2 = false;
            flag1 = flag2;
            if (mMenu == null) goto _L4; else goto _L3
_L3:
            int i;
            int j;
            j = mMenu.size();
            i = 0;
_L9:
            flag1 = flag2;
            if (i >= j) goto _L4; else goto _L5
_L5:
            if (mMenu.getItem(i) != mCurrentExpandedItem) goto _L7; else goto _L6
_L6:
            flag1 = true;
_L4:
            if (!flag1)
            {
                collapseItemActionView$29f2911(mCurrentExpandedItem);
            }
_L2:
            return;
_L7:
            i++;
            if (true) goto _L9; else goto _L8
_L8:
        }

        private ExpandedActionViewMenuPresenter()
        {
            this$0 = Toolbar.this;
            super();
        }

        public ExpandedActionViewMenuPresenter(byte byte0)
        {
            this();
        }
    }

    public static interface OnMenuItemClickListener
    {

        public abstract boolean onMenuItemClick(MenuItem menuitem);
    }

    static class SavedState extends android.view.View.BaseSavedState
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
        public int expandedMenuItemId;
        public boolean isOverflowOpen;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(expandedMenuItemId);
            if (isOverflowOpen)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            expandedMenuItemId = parcel.readInt();
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            isOverflowOpen = flag;
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    public android.support.v7.internal.view.menu.MenuPresenter.Callback mActionMenuPresenterCallback;
    private int mButtonGravity;
    private ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    public boolean mCollapsible;
    public final RtlSpacingHelper mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    public ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private int mGravity;
    public ImageView mLogoView;
    private int mMaxButtonHeight;
    public android.support.v7.internal.view.menu.MenuBuilder.Callback mMenuBuilderCallback;
    public ActionMenuView mMenuView;
    private final ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    public OnMenuItemClickListener mOnMenuItemClickListener;
    public ActionMenuPresenter mOuterActionMenuPresenter;
    public Context mPopupContext;
    public int mPopupTheme;
    private final Runnable mShowOverflowMenuRunnable;
    public CharSequence mSubtitleText;
    public int mSubtitleTextAppearance;
    public int mSubtitleTextColor;
    public TextView mSubtitleTextView;
    private final int mTempMargins[];
    private final ArrayList mTempViews;
    private final TintManager mTintManager;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    public CharSequence mTitleText;
    public int mTitleTextAppearance;
    public int mTitleTextColor;
    public TextView mTitleTextView;
    private ToolbarWidgetWrapper mWrapper;

    public Toolbar(Context context)
    {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010125);
    }

    public Toolbar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mContentInsets = new RtlSpacingHelper();
        mGravity = 0x800013;
        mTempViews = new ArrayList();
        mTempMargins = new int[2];
        mMenuViewItemClickListener = new ActionMenuView.OnMenuItemClickListener() {

            final Toolbar this$0;

            public final boolean onMenuItemClick(MenuItem menuitem)
            {
                if (mOnMenuItemClickListener != null)
                {
                    return mOnMenuItemClickListener.onMenuItemClick(menuitem);
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = Toolbar.this;
                super();
            }
        };
        mShowOverflowMenuRunnable = new Runnable() {

            final Toolbar this$0;

            public final void run()
            {
                showOverflowMenu();
            }

            
            {
                this$0 = Toolbar.this;
                super();
            }
        };
        context = TintTypedArray.obtainStyledAttributes$1a6c1917(getContext(), attributeset, android.support.v7.appcompat.R.styleable.Toolbar, i);
        mTitleTextAppearance = context.getResourceId(9, 0);
        mSubtitleTextAppearance = context.getResourceId(10, 0);
        i = mGravity;
        mGravity = ((TintTypedArray) (context)).mWrapped.getInteger(0, i);
        mButtonGravity = 48;
        i = context.getDimensionPixelOffset(11, 0);
        mTitleMarginBottom = i;
        mTitleMarginTop = i;
        mTitleMarginEnd = i;
        mTitleMarginStart = i;
        i = context.getDimensionPixelOffset(12, -1);
        if (i >= 0)
        {
            mTitleMarginStart = i;
        }
        i = context.getDimensionPixelOffset(13, -1);
        if (i >= 0)
        {
            mTitleMarginEnd = i;
        }
        i = context.getDimensionPixelOffset(14, -1);
        if (i >= 0)
        {
            mTitleMarginTop = i;
        }
        i = context.getDimensionPixelOffset(15, -1);
        if (i >= 0)
        {
            mTitleMarginBottom = i;
        }
        mMaxButtonHeight = context.getDimensionPixelSize(16, -1);
        i = context.getDimensionPixelOffset(4, 0x80000000);
        int j = context.getDimensionPixelOffset(5, 0x80000000);
        int k = context.getDimensionPixelSize(6, 0);
        int l = context.getDimensionPixelSize(7, 0);
        attributeset = mContentInsets;
        attributeset.mIsRelative = false;
        if (k != 0x80000000)
        {
            attributeset.mExplicitLeft = k;
            attributeset.mLeft = k;
        }
        if (l != 0x80000000)
        {
            attributeset.mExplicitRight = l;
            attributeset.mRight = l;
        }
        if (i != 0x80000000 || j != 0x80000000)
        {
            mContentInsets.setRelative(i, j);
        }
        mCollapseIcon = context.getDrawable(17);
        mCollapseDescription = context.getText(18);
        attributeset = context.getText(2);
        if (!TextUtils.isEmpty(attributeset))
        {
            setTitle(attributeset);
        }
        attributeset = context.getText(3);
        if (!TextUtils.isEmpty(attributeset))
        {
            setSubtitle(attributeset);
        }
        mPopupContext = getContext();
        setPopupTheme(context.getResourceId(8, 0));
        attributeset = context.getDrawable(19);
        if (attributeset != null)
        {
            setNavigationIcon(attributeset);
        }
        attributeset = context.getText(20);
        if (!TextUtils.isEmpty(attributeset))
        {
            setNavigationContentDescription(attributeset);
        }
        ((TintTypedArray) (context)).mWrapped.recycle();
        mTintManager = context.getTintManager();
    }

    private void addCustomViewsWithGravity(List list, int i)
    {
        boolean flag = true;
        int j;
        int k;
        if (ViewCompat.getLayoutDirection(this) != 1)
        {
            flag = false;
        }
        k = getChildCount();
        j = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        list.clear();
        if (flag)
        {
            for (i = k - 1; i >= 0; i--)
            {
                View view = getChildAt(i);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (layoutparams.mViewType == 0 && shouldLayout(view) && getChildHorizontalGravity(layoutparams.gravity) == j)
                {
                    list.add(view);
                }
            }

        } else
        {
            for (i = 0; i < k; i++)
            {
                View view1 = getChildAt(i);
                LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
                if (layoutparams1.mViewType == 0 && shouldLayout(view1) && getChildHorizontalGravity(layoutparams1.gravity) == j)
                {
                    list.add(view1);
                }
            }

        }
    }

    private void ensureNavButtonView()
    {
        if (mNavButtonView == null)
        {
            mNavButtonView = new ImageButton(getContext(), null, 0x7f010126);
            LayoutParams layoutparams = new LayoutParams();
            layoutparams.gravity = 0x800003 | mButtonGravity & 0x70;
            mNavButtonView.setLayoutParams(layoutparams);
        }
    }

    protected static LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    private static LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof LayoutParams)
        {
            return new LayoutParams((LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.support.v7.app.ActionBar.LayoutParams)
        {
            return new LayoutParams((android.support.v7.app.ActionBar.LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    private int getChildHorizontalGravity(int i)
    {
label0:
        {
            int k = ViewCompat.getLayoutDirection(this);
            int j = GravityCompat.getAbsoluteGravity(i, k) & 7;
            i = j;
            switch (j)
            {
            case 2: // '\002'
            case 4: // '\004'
            default:
                if (k != 1)
                {
                    break label0;
                }
                i = 5;
                break;

            case 1: // '\001'
            case 3: // '\003'
            case 5: // '\005'
                break;
            }
            return i;
        }
        return 3;
    }

    private int getChildTop(View view, int i)
    {
        LayoutParams layoutparams;
        int j;
        int k;
        int l;
        int i1;
        layoutparams = (LayoutParams)view.getLayoutParams();
        l = view.getMeasuredHeight();
        if (i > 0)
        {
            i = (l - i) / 2;
        } else
        {
            i = 0;
        }
        k = layoutparams.gravity & 0x70;
        j = k;
        k;
        JVM INSTR lookupswitch 3: default 76
    //                   16: 85
    //                   48: 85
    //                   80: 85;
           goto _L1 _L2 _L2 _L2
_L1:
        j = mGravity & 0x70;
_L2:
        j;
        JVM INSTR lookupswitch 2: default 112
    //                   48: 167
    //                   80: 174;
           goto _L3 _L4 _L5
_L3:
        k = getPaddingTop();
        i = getPaddingBottom();
        i1 = getHeight();
        j = (i1 - k - i - l) / 2;
        if (j >= layoutparams.topMargin) goto _L7; else goto _L6
_L6:
        i = layoutparams.topMargin;
_L9:
        return k + i;
_L4:
        return getPaddingTop() - i;
_L5:
        return getHeight() - getPaddingBottom() - l - layoutparams.bottomMargin - i;
_L7:
        l = i1 - i - l - j - k;
        i = j;
        if (l < layoutparams.bottomMargin)
        {
            i = Math.max(0, j - (layoutparams.bottomMargin - l));
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static int getHorizontalMargins(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        return MarginLayoutParamsCompat.getMarginStart(view) + MarginLayoutParamsCompat.getMarginEnd(view);
    }

    private static int getVerticalMargins(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        return ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin + ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin;
    }

    private int layoutChildLeft(View view, int i, int ai[], int j)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int k = layoutparams.leftMargin - ai[0];
        i += Math.max(0, k);
        ai[0] = Math.max(0, -k);
        j = getChildTop(view, j);
        k = view.getMeasuredWidth();
        view.layout(i, j, i + k, view.getMeasuredHeight() + j);
        return layoutparams.rightMargin + k + i;
    }

    private int layoutChildRight(View view, int i, int ai[], int j)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int k = layoutparams.rightMargin - ai[1];
        i -= Math.max(0, k);
        ai[1] = Math.max(0, -k);
        j = getChildTop(view, j);
        k = view.getMeasuredWidth();
        view.layout(i - k, j, i, view.getMeasuredHeight() + j);
        return i - (layoutparams.leftMargin + k);
    }

    private int measureChildCollapseMargins(View view, int i, int j, int k, int l, int ai[])
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = marginlayoutparams.leftMargin - ai[0];
        int j1 = marginlayoutparams.rightMargin - ai[1];
        int k1 = Math.max(0, i1) + Math.max(0, j1);
        ai[0] = Math.max(0, -i1);
        ai[1] = Math.max(0, -j1);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + k1 + j, marginlayoutparams.width), getChildMeasureSpec(k, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + l, marginlayoutparams.height));
        return view.getMeasuredWidth() + k1;
    }

    private void measureChildConstrained$12802926(View view, int i, int j, int k, int l)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j, marginlayoutparams.width);
        j = getChildMeasureSpec(k, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + 0, marginlayoutparams.height);
        k = android.view.View.MeasureSpec.getMode(j);
        i = j;
        if (k != 0x40000000)
        {
            i = j;
            if (l >= 0)
            {
                i = l;
                if (k != 0)
                {
                    i = Math.min(android.view.View.MeasureSpec.getSize(j), l);
                }
                i = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
            }
        }
        view.measure(i1, i);
    }

    private boolean shouldLayout(View view)
    {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }

    public final void addSystemView(View view)
    {
        Object obj = view.getLayoutParams();
        if (obj == null)
        {
            obj = new LayoutParams();
        } else
        if (!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
        {
            obj = generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            obj = (LayoutParams)obj;
        }
        obj.mViewType = 1;
        addView(view, ((android.view.ViewGroup.LayoutParams) (obj)));
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return super.checkLayoutParams(layoutparams) && (layoutparams instanceof LayoutParams);
    }

    public final void collapseActionView()
    {
        MenuItemImpl menuitemimpl;
        if (mExpandedMenuPresenter == null)
        {
            menuitemimpl = null;
        } else
        {
            menuitemimpl = mExpandedMenuPresenter.mCurrentExpandedItem;
        }
        if (menuitemimpl != null)
        {
            menuitemimpl.collapseActionView();
        }
    }

    public final void ensureMenuView()
    {
        if (mMenuView == null)
        {
            mMenuView = new ActionMenuView(getContext());
            mMenuView.setPopupTheme(mPopupTheme);
            mMenuView.mOnMenuItemClickListener = mMenuViewItemClickListener;
            Object obj = mMenuView;
            android.support.v7.internal.view.menu.MenuPresenter.Callback callback = mActionMenuPresenterCallback;
            android.support.v7.internal.view.menu.MenuBuilder.Callback callback1 = mMenuBuilderCallback;
            obj.mActionMenuPresenterCallback = callback;
            obj.mMenuBuilderCallback = callback1;
            obj = new LayoutParams();
            obj.gravity = 0x800005 | mButtonGravity & 0x70;
            mMenuView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            addSystemView(mMenuView);
        }
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
    }

    public final CharSequence getNavigationContentDescription()
    {
        if (mNavButtonView != null)
        {
            return mNavButtonView.getContentDescription();
        } else
        {
            return null;
        }
    }

    public final Drawable getNavigationIcon()
    {
        if (mNavButtonView != null)
        {
            return mNavButtonView.getDrawable();
        } else
        {
            return null;
        }
    }

    public final DecorToolbar getWrapper()
    {
        if (mWrapper == null)
        {
            mWrapper = new ToolbarWidgetWrapper(this, true);
        }
        return mWrapper;
    }

    public final boolean hasExpandedActionView()
    {
        return mExpandedMenuPresenter != null && mExpandedMenuPresenter.mCurrentExpandedItem != null;
    }

    public final boolean isOverflowMenuShowing()
    {
        if (mMenuView != null)
        {
            ActionMenuView actionmenuview = mMenuView;
            boolean flag;
            if (actionmenuview.mPresenter != null && actionmenuview.mPresenter.isOverflowMenuShowing())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(mShowOverflowMenuRunnable);
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        int i = MotionEventCompat.getActionMasked(motionevent);
        if (i == 9)
        {
            mEatingHover = false;
        }
        if (!mEatingHover)
        {
            boolean flag = super.onHoverEvent(motionevent);
            if (i == 9 && !flag)
            {
                mEatingHover = true;
            }
        }
        if (i == 10 || i == 3)
        {
            mEatingHover = false;
        }
        return true;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        Object obj;
        Object obj1;
        int ai[];
        boolean flag1;
        int i2;
        int j2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int k4;
        boolean flag2;
        int j1;
        if (ViewCompat.getLayoutDirection(this) == 1)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        k3 = getWidth();
        i4 = getHeight();
        i3 = getPaddingLeft();
        l3 = getPaddingRight();
        j2 = getPaddingTop();
        k4 = getPaddingBottom();
        k = i3;
        l = k3 - l3;
        ai = mTempMargins;
        ai[1] = 0;
        ai[0] = 0;
        j3 = ViewCompat.getMinimumHeight(this);
        i = k;
        j = l;
        if (shouldLayout(mNavButtonView))
        {
            if (j1 != 0)
            {
                j = layoutChildRight(mNavButtonView, l, ai, j3);
                i = k;
            } else
            {
                i = layoutChildLeft(mNavButtonView, i3, ai, j3);
                j = l;
            }
        }
        k = i;
        l = j;
        if (shouldLayout(mCollapseButtonView))
        {
            if (j1 != 0)
            {
                l = layoutChildRight(mCollapseButtonView, j, ai, j3);
                k = i;
            } else
            {
                k = layoutChildLeft(mCollapseButtonView, i, ai, j3);
                l = j;
            }
        }
        j = k;
        i = l;
        if (shouldLayout(mMenuView))
        {
            if (j1 != 0)
            {
                j = layoutChildLeft(mMenuView, k, ai, j3);
                i = l;
            } else
            {
                i = layoutChildRight(mMenuView, l, ai, j3);
                j = k;
            }
        }
        ai[0] = Math.max(0, mContentInsets.mLeft - j);
        ai[1] = Math.max(0, mContentInsets.mRight - (k3 - l3 - i));
        k = Math.max(j, mContentInsets.mLeft);
        l = Math.min(i, k3 - l3 - mContentInsets.mRight);
        i = k;
        j = l;
        if (shouldLayout(mExpandedActionView))
        {
            if (j1 != 0)
            {
                j = layoutChildRight(mExpandedActionView, l, ai, j3);
                i = k;
            } else
            {
                i = layoutChildLeft(mExpandedActionView, k, ai, j3);
                j = l;
            }
        }
        k = i;
        l = j;
        if (shouldLayout(mLogoView))
        {
            if (j1 != 0)
            {
                l = layoutChildRight(mLogoView, j, ai, j3);
                k = i;
            } else
            {
                k = layoutChildLeft(mLogoView, i, ai, j3);
                l = j;
            }
        }
        flag = shouldLayout(mTitleTextView);
        flag2 = shouldLayout(mSubtitleTextView);
        i = 0;
        if (flag)
        {
            LayoutParams layoutparams = (LayoutParams)mTitleTextView.getLayoutParams();
            i = layoutparams.topMargin + mTitleTextView.getMeasuredHeight() + layoutparams.bottomMargin + 0;
        }
        i2 = i;
        if (flag2)
        {
            LayoutParams layoutparams1 = (LayoutParams)mSubtitleTextView.getLayoutParams();
            i2 = i + (layoutparams1.topMargin + mSubtitleTextView.getMeasuredHeight() + layoutparams1.bottomMargin);
        }
        if (flag) goto _L2; else goto _L1
_L1:
        j = k;
        i = l;
        if (!flag2) goto _L3; else goto _L2
_L2:
        if (flag)
        {
            obj = mTitleTextView;
        } else
        {
            obj = mSubtitleTextView;
        }
        if (flag2)
        {
            obj1 = mSubtitleTextView;
        } else
        {
            obj1 = mTitleTextView;
        }
        obj = (LayoutParams)((View) (obj)).getLayoutParams();
        obj1 = (LayoutParams)((View) (obj1)).getLayoutParams();
        if (flag && mTitleTextView.getMeasuredWidth() > 0 || flag2 && mSubtitleTextView.getMeasuredWidth() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mGravity & 0x70;
        JVM INSTR lookupswitch 2: default 576
    //                   48: 1042
    //                   80: 1116;
           goto _L4 _L5 _L6
_L4:
        j = (i4 - j2 - k4 - i2) / 2;
        if (j < ((LayoutParams) (obj)).topMargin + mTitleMarginTop)
        {
            i = ((LayoutParams) (obj)).topMargin + mTitleMarginTop;
        } else
        {
            i2 = i4 - k4 - i2 - j - j2;
            i = j;
            if (i2 < ((LayoutParams) (obj)).bottomMargin + mTitleMarginBottom)
            {
                i = Math.max(0, j - ((((LayoutParams) (obj1)).bottomMargin + mTitleMarginBottom) - i2));
            }
        }
        i = j2 + i;
_L13:
        if (j1 != 0)
        {
            if (flag1)
            {
                j = mTitleMarginStart;
            } else
            {
                j = 0;
            }
            j -= ai[1];
            l -= Math.max(0, j);
            ai[1] = Math.max(0, -j);
            i2 = l;
            j = l;
            j1 = i2;
            j2 = i;
            if (flag)
            {
                obj = (LayoutParams)mTitleTextView.getLayoutParams();
                j1 = i2 - mTitleTextView.getMeasuredWidth();
                j2 = i + mTitleTextView.getMeasuredHeight();
                mTitleTextView.layout(j1, i, i2, j2);
                j1 -= mTitleMarginEnd;
                j2 += ((LayoutParams) (obj)).bottomMargin;
            }
            i2 = j;
            if (flag2)
            {
                obj = (LayoutParams)mSubtitleTextView.getLayoutParams();
                i = j2 + ((LayoutParams) (obj)).topMargin;
                i2 = mSubtitleTextView.getMeasuredWidth();
                j2 = mSubtitleTextView.getMeasuredHeight();
                mSubtitleTextView.layout(j - i2, i, j, i + j2);
                i2 = j - mTitleMarginEnd;
                i = ((LayoutParams) (obj)).bottomMargin;
            }
            j = k;
            i = l;
            if (flag1)
            {
                i = Math.min(j1, i2);
                j = k;
            }
        } else
        {
            int k1;
            int k2;
            if (flag1)
            {
                j = mTitleMarginStart;
            } else
            {
                j = 0;
            }
            k1 = j - ai[0];
            j = k + Math.max(0, k1);
            ai[0] = Math.max(0, -k1);
            i2 = j;
            k = j;
            k1 = i2;
            k2 = i;
            if (flag)
            {
                obj = (LayoutParams)mTitleTextView.getLayoutParams();
                k1 = i2 + mTitleTextView.getMeasuredWidth();
                k2 = i + mTitleTextView.getMeasuredHeight();
                mTitleTextView.layout(i2, i, k1, k2);
                k1 += mTitleMarginEnd;
                k2 += ((LayoutParams) (obj)).bottomMargin;
            }
            i2 = k;
            if (flag2)
            {
                obj = (LayoutParams)mSubtitleTextView.getLayoutParams();
                i = k2 + ((LayoutParams) (obj)).topMargin;
                i2 = k + mSubtitleTextView.getMeasuredWidth();
                k2 = mSubtitleTextView.getMeasuredHeight();
                mSubtitleTextView.layout(k, i, i2, i + k2);
                i2 += mTitleMarginEnd;
                i = ((LayoutParams) (obj)).bottomMargin;
            }
            i = l;
            if (flag1)
            {
                j = Math.max(k1, i2);
                i = l;
            }
        }
_L3:
        int i1;
        addCustomViewsWithGravity(mTempViews, 3);
        l = mTempViews.size();
        for (k = 0; k < l; k++)
        {
            j = layoutChildLeft((View)mTempViews.get(k), j, ai, j3);
        }

        addCustomViewsWithGravity(mTempViews, 5);
        i1 = mTempViews.size();
        l = 0;
        k = i;
        for (i = l; i < i1; i++)
        {
            k = layoutChildRight((View)mTempViews.get(i), k, ai, j3);
        }

        addCustomViewsWithGravity(mTempViews, 1);
        obj = mTempViews;
        int l1 = ai[0];
        i1 = ai[1];
        i = 0;
        i2 = ((List) (obj)).size();
        for (l = 0; l < i2; l++)
        {
            View view = (View)((List) (obj)).get(l);
            LayoutParams layoutparams2 = (LayoutParams)view.getLayoutParams();
            l1 = layoutparams2.leftMargin - l1;
            i1 = layoutparams2.rightMargin - i1;
            int l2 = Math.max(0, l1);
            int j4 = Math.max(0, i1);
            l1 = Math.max(0, -l1);
            i1 = Math.max(0, -i1);
            i += view.getMeasuredWidth() + l2 + j4;
        }

        l = (i3 + (k3 - i3 - l3) / 2) - i / 2;
        i1 = l + i;
          goto _L7
_L5:
        i = getPaddingTop() + ((LayoutParams) (obj)).topMargin + mTitleMarginTop;
        continue; /* Loop/switch isn't completed */
_L6:
        i = i4 - k4 - ((LayoutParams) (obj1)).bottomMargin - mTitleMarginBottom - i2;
        continue; /* Loop/switch isn't completed */
_L7:
        if (l >= j) goto _L9; else goto _L8
_L8:
        i = j;
_L11:
        k = mTempViews.size();
        for (j = 0; j < k; j++)
        {
            i = layoutChildLeft((View)mTempViews.get(j), i, ai, j3);
        }

        break; /* Loop/switch isn't completed */
_L9:
        i = l;
        if (i1 > k)
        {
            i = l - (i1 - k);
        }
        if (true) goto _L11; else goto _L10
_L10:
        mTempViews.clear();
        return;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public void onMeasure(int i, int j)
    {
        int k;
        int k1 = 0;
        int j1 = 0;
        int ai[] = mTempMargins;
        Object obj;
        int l;
        int l1;
        int i2;
        int j2;
        int k2;
        if (ViewUtils.isLayoutRtl(this))
        {
            j2 = 1;
            i2 = 0;
        } else
        {
            j2 = 0;
            i2 = 1;
        }
        l1 = 0;
        if (shouldLayout(mNavButtonView))
        {
            measureChildConstrained$12802926(mNavButtonView, i, 0, j, mMaxButtonHeight);
            l1 = mNavButtonView.getMeasuredWidth() + getHorizontalMargins(mNavButtonView);
            k1 = Math.max(0, mNavButtonView.getMeasuredHeight() + getVerticalMargins(mNavButtonView));
            j1 = ViewUtils.combineMeasuredStates(0, ViewCompat.getMeasuredState(mNavButtonView));
        }
        k = j1;
        l = k1;
        if (shouldLayout(mCollapseButtonView))
        {
            measureChildConstrained$12802926(mCollapseButtonView, i, 0, j, mMaxButtonHeight);
            l1 = mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(mCollapseButtonView);
            l = Math.max(k1, mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(mCollapseButtonView));
            k = ViewUtils.combineMeasuredStates(j1, ViewCompat.getMeasuredState(mCollapseButtonView));
        }
        obj = mContentInsets;
        if (((RtlSpacingHelper) (obj)).mIsRtl)
        {
            j1 = ((RtlSpacingHelper) (obj)).mRight;
        } else
        {
            j1 = ((RtlSpacingHelper) (obj)).mLeft;
        }
        k2 = Math.max(j1, l1) + 0;
        ai[j2] = Math.max(0, j1 - l1);
        l1 = 0;
        j1 = k;
        k1 = l;
        if (shouldLayout(mMenuView))
        {
            measureChildConstrained$12802926(mMenuView, i, k2, j, mMaxButtonHeight);
            l1 = mMenuView.getMeasuredWidth() + getHorizontalMargins(mMenuView);
            k1 = Math.max(l, mMenuView.getMeasuredHeight() + getVerticalMargins(mMenuView));
            j1 = ViewUtils.combineMeasuredStates(k, ViewCompat.getMeasuredState(mMenuView));
        }
        obj = mContentInsets;
        if (((RtlSpacingHelper) (obj)).mIsRtl)
        {
            k = ((RtlSpacingHelper) (obj)).mLeft;
        } else
        {
            k = ((RtlSpacingHelper) (obj)).mRight;
        }
        j2 = k2 + Math.max(k, l1);
        ai[i2] = Math.max(0, k - l1);
        i2 = j2;
        k = j1;
        l = k1;
        if (shouldLayout(mExpandedActionView))
        {
            i2 = j2 + measureChildCollapseMargins(mExpandedActionView, i, j2, j, 0, ai);
            l = Math.max(k1, mExpandedActionView.getMeasuredHeight() + getVerticalMargins(mExpandedActionView));
            k = ViewUtils.combineMeasuredStates(j1, ViewCompat.getMeasuredState(mExpandedActionView));
        }
        j1 = i2;
        k1 = k;
        l1 = l;
        if (shouldLayout(mLogoView))
        {
            j1 = i2 + measureChildCollapseMargins(mLogoView, i, i2, j, 0, ai);
            l1 = Math.max(l, mLogoView.getMeasuredHeight() + getVerticalMargins(mLogoView));
            k1 = ViewUtils.combineMeasuredStates(k, ViewCompat.getMeasuredState(mLogoView));
        }
        k2 = getChildCount();
        l = 0;
        i2 = l1;
        k = k1;
        l1 = j1;
        while (l < k2) 
        {
            obj = getChildAt(l);
            j2 = l1;
            k1 = k;
            j1 = i2;
            if (((LayoutParams)((View) (obj)).getLayoutParams()).mViewType == 0)
            {
                j2 = l1;
                k1 = k;
                j1 = i2;
                if (shouldLayout(((View) (obj))))
                {
                    j2 = l1 + measureChildCollapseMargins(((View) (obj)), i, l1, j, 0, ai);
                    j1 = Math.max(i2, ((View) (obj)).getMeasuredHeight() + getVerticalMargins(((View) (obj))));
                    k1 = ViewUtils.combineMeasuredStates(k, ViewCompat.getMeasuredState(((View) (obj))));
                }
            }
            l++;
            l1 = j2;
            k = k1;
            i2 = j1;
        }
        k1 = 0;
        j1 = 0;
        int l2 = mTitleMarginTop + mTitleMarginBottom;
        int i3 = mTitleMarginStart + mTitleMarginEnd;
        l = k;
        if (shouldLayout(mTitleTextView))
        {
            measureChildCollapseMargins(mTitleTextView, i, l1 + i3, j, l2, ai);
            k1 = mTitleTextView.getMeasuredWidth() + getHorizontalMargins(mTitleTextView);
            j1 = mTitleTextView.getMeasuredHeight() + getVerticalMargins(mTitleTextView);
            l = ViewUtils.combineMeasuredStates(k, ViewCompat.getMeasuredState(mTitleTextView));
        }
        j2 = l;
        k2 = j1;
        k = k1;
        if (shouldLayout(mSubtitleTextView))
        {
            k = Math.max(k1, measureChildCollapseMargins(mSubtitleTextView, i, l1 + i3, j, j1 + l2, ai));
            k2 = j1 + (mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(mSubtitleTextView));
            j2 = ViewUtils.combineMeasuredStates(l, ViewCompat.getMeasuredState(mSubtitleTextView));
        }
        l = Math.max(i2, k2);
        i2 = getPaddingLeft();
        k2 = getPaddingRight();
        j1 = getPaddingTop();
        k1 = getPaddingBottom();
        k = ViewCompat.resolveSizeAndState(Math.max(l1 + k + (i2 + k2), getSuggestedMinimumWidth()), i, 0xff000000 & j2);
        j = ViewCompat.resolveSizeAndState(Math.max(l + (j1 + k1), getSuggestedMinimumHeight()), j, j2 << 16);
        if (mCollapsible) goto _L2; else goto _L1
_L1:
        i = 0;
_L4:
        if (i != 0)
        {
            j = 0;
        }
        setMeasuredDimension(k, j);
        return;
_L2:
        int i1 = getChildCount();
        i = 0;
        do
        {
            if (i >= i1)
            {
                break;
            }
            View view = getChildAt(i);
            if (shouldLayout(view) && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0)
            {
                i = 0;
                continue; /* Loop/switch isn't completed */
            }
            i++;
        } while (true);
        i = 1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        SavedState savedstate = (SavedState)parcelable;
        super.onRestoreInstanceState(savedstate.getSuperState());
        if (mMenuView != null)
        {
            parcelable = mMenuView.mMenu;
        } else
        {
            parcelable = null;
        }
        if (savedstate.expandedMenuItemId != 0 && mExpandedMenuPresenter != null && parcelable != null)
        {
            parcelable = parcelable.findItem(savedstate.expandedMenuItemId);
            if (parcelable != null)
            {
                MenuItemCompat.expandActionView(parcelable);
            }
        }
        if (savedstate.isOverflowOpen)
        {
            removeCallbacks(mShowOverflowMenuRunnable);
            post(mShowOverflowMenuRunnable);
        }
    }

    public void onRtlPropertiesChanged(int i)
    {
        RtlSpacingHelper rtlspacinghelper;
label0:
        {
label1:
            {
                boolean flag = true;
                if (android.os.Build.VERSION.SDK_INT >= 17)
                {
                    super.onRtlPropertiesChanged(i);
                }
                rtlspacinghelper = mContentInsets;
                if (i != 1)
                {
                    flag = false;
                }
                if (flag != rtlspacinghelper.mIsRtl)
                {
                    rtlspacinghelper.mIsRtl = flag;
                    if (!rtlspacinghelper.mIsRelative)
                    {
                        break label0;
                    }
                    if (!flag)
                    {
                        break label1;
                    }
                    if (rtlspacinghelper.mEnd != 0x80000000)
                    {
                        i = rtlspacinghelper.mEnd;
                    } else
                    {
                        i = rtlspacinghelper.mExplicitLeft;
                    }
                    rtlspacinghelper.mLeft = i;
                    if (rtlspacinghelper.mStart != 0x80000000)
                    {
                        i = rtlspacinghelper.mStart;
                    } else
                    {
                        i = rtlspacinghelper.mExplicitRight;
                    }
                    rtlspacinghelper.mRight = i;
                }
                return;
            }
            if (rtlspacinghelper.mStart != 0x80000000)
            {
                i = rtlspacinghelper.mStart;
            } else
            {
                i = rtlspacinghelper.mExplicitLeft;
            }
            rtlspacinghelper.mLeft = i;
            if (rtlspacinghelper.mEnd != 0x80000000)
            {
                i = rtlspacinghelper.mEnd;
            } else
            {
                i = rtlspacinghelper.mExplicitRight;
            }
            rtlspacinghelper.mRight = i;
            return;
        }
        rtlspacinghelper.mLeft = rtlspacinghelper.mExplicitLeft;
        rtlspacinghelper.mRight = rtlspacinghelper.mExplicitRight;
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (mExpandedMenuPresenter != null && mExpandedMenuPresenter.mCurrentExpandedItem != null)
        {
            savedstate.expandedMenuItemId = mExpandedMenuPresenter.mCurrentExpandedItem.getItemId();
        }
        savedstate.isOverflowOpen = isOverflowMenuShowing();
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i = MotionEventCompat.getActionMasked(motionevent);
        if (i == 0)
        {
            mEatingTouch = false;
        }
        if (!mEatingTouch)
        {
            boolean flag = super.onTouchEvent(motionevent);
            if (i == 0 && !flag)
            {
                mEatingTouch = true;
            }
        }
        if (i == 1 || i == 3)
        {
            mEatingTouch = false;
        }
        return true;
    }

    public final void setNavigationContentDescription(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            ensureNavButtonView();
        }
        if (mNavButtonView != null)
        {
            mNavButtonView.setContentDescription(charsequence);
        }
    }

    public final void setNavigationIcon(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        ensureNavButtonView();
        if (mNavButtonView.getParent() == null)
        {
            addSystemView(mNavButtonView);
            updateChildVisibilityForExpandedActionView(mNavButtonView);
        }
_L4:
        if (mNavButtonView != null)
        {
            mNavButtonView.setImageDrawable(drawable);
        }
        return;
_L2:
        if (mNavButtonView != null && mNavButtonView.getParent() != null)
        {
            removeView(mNavButtonView);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        ensureNavButtonView();
        mNavButtonView.setOnClickListener(onclicklistener);
    }

    public final void setPopupTheme(int i)
    {
label0:
        {
            if (mPopupTheme != i)
            {
                mPopupTheme = i;
                if (i != 0)
                {
                    break label0;
                }
                mPopupContext = getContext();
            }
            return;
        }
        mPopupContext = new ContextThemeWrapper(getContext(), i);
    }

    public final void setSubtitle(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        if (mSubtitleTextView == null)
        {
            Context context = getContext();
            mSubtitleTextView = new TextView(context);
            mSubtitleTextView.setSingleLine();
            mSubtitleTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (mSubtitleTextAppearance != 0)
            {
                mSubtitleTextView.setTextAppearance(context, mSubtitleTextAppearance);
            }
            if (mSubtitleTextColor != 0)
            {
                mSubtitleTextView.setTextColor(mSubtitleTextColor);
            }
        }
        if (mSubtitleTextView.getParent() == null)
        {
            addSystemView(mSubtitleTextView);
            updateChildVisibilityForExpandedActionView(mSubtitleTextView);
        }
_L4:
        if (mSubtitleTextView != null)
        {
            mSubtitleTextView.setText(charsequence);
        }
        mSubtitleText = charsequence;
        return;
_L2:
        if (mSubtitleTextView != null && mSubtitleTextView.getParent() != null)
        {
            removeView(mSubtitleTextView);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void setTitle(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        if (mTitleTextView == null)
        {
            Context context = getContext();
            mTitleTextView = new TextView(context);
            mTitleTextView.setSingleLine();
            mTitleTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (mTitleTextAppearance != 0)
            {
                mTitleTextView.setTextAppearance(context, mTitleTextAppearance);
            }
            if (mTitleTextColor != 0)
            {
                mTitleTextView.setTextColor(mTitleTextColor);
            }
        }
        if (mTitleTextView.getParent() == null)
        {
            addSystemView(mTitleTextView);
            updateChildVisibilityForExpandedActionView(mTitleTextView);
        }
_L4:
        if (mTitleTextView != null)
        {
            mTitleTextView.setText(charsequence);
        }
        mTitleText = charsequence;
        return;
_L2:
        if (mTitleTextView != null && mTitleTextView.getParent() != null)
        {
            removeView(mTitleTextView);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean showOverflowMenu()
    {
        if (mMenuView != null)
        {
            ActionMenuView actionmenuview = mMenuView;
            boolean flag;
            if (actionmenuview.mPresenter != null && actionmenuview.mPresenter.showOverflowMenu())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public final void updateChildVisibilityForExpandedActionView(View view)
    {
        if (((LayoutParams)view.getLayoutParams()).mViewType != 2 && view != mMenuView)
        {
            byte byte0;
            if (mExpandedActionView != null)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            view.setVisibility(byte0);
        }
    }



/*
    static void access$200(Toolbar toolbar)
    {
        if (toolbar.mCollapseButtonView == null)
        {
            toolbar.mCollapseButtonView = new ImageButton(toolbar.getContext(), null, 0x7f010126);
            toolbar.mCollapseButtonView.setImageDrawable(toolbar.mCollapseIcon);
            toolbar.mCollapseButtonView.setContentDescription(toolbar.mCollapseDescription);
            LayoutParams layoutparams = new LayoutParams();
            layoutparams.gravity = 0x800003 | toolbar.mButtonGravity & 0x70;
            layoutparams.mViewType = 2;
            toolbar.mCollapseButtonView.setLayoutParams(layoutparams);
            toolbar.mCollapseButtonView.setOnClickListener(toolbar. new _cls3());
        }
        return;
    }

*/




/*
    static void access$500(Toolbar toolbar, boolean flag)
    {
        int j = toolbar.getChildCount();
        int i = 0;
        while (i < j) 
        {
            View view = toolbar.getChildAt(i);
            if (((LayoutParams)view.getLayoutParams()).mViewType != 2 && view != toolbar.mMenuView)
            {
                byte byte0;
                if (flag)
                {
                    byte0 = 8;
                } else
                {
                    byte0 = 0;
                }
                view.setVisibility(byte0);
            }
            i++;
        }
        return;
    }

*/
}
