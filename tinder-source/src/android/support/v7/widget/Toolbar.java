// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.f;
import android.support.v4.view.l;
import android.support.v4.view.m;
import android.support.v4.view.n;
import android.support.v4.view.x;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.p;
import android.support.v7.internal.widget.DecorToolbar;
import android.support.v7.internal.widget.RtlSpacingHelper;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.support.v7.internal.widget.ToolbarWidgetWrapper;
import android.support.v7.internal.widget.ViewUtils;
import android.support.v7.view.CollapsibleActionView;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
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
    private class ExpandedActionViewMenuPresenter
        implements android.support.v7.internal.view.menu.l
    {

        h mCurrentExpandedItem;
        android.support.v7.internal.view.menu.f mMenu;
        final Toolbar this$0;

        public boolean collapseItemActionView(android.support.v7.internal.view.menu.f f1, h h1)
        {
            if (mExpandedActionView instanceof CollapsibleActionView)
            {
                ((CollapsibleActionView)mExpandedActionView).onActionViewCollapsed();
            }
            removeView(mExpandedActionView);
            removeView(mCollapseButtonView);
            mExpandedActionView = null;
            addChildrenForExpandedActionView();
            mCurrentExpandedItem = null;
            requestLayout();
            h1.d(false);
            return true;
        }

        public boolean expandItemActionView(android.support.v7.internal.view.menu.f f1, h h1)
        {
            ensureCollapseButtonView();
            if (mCollapseButtonView.getParent() != Toolbar.this)
            {
                addView(mCollapseButtonView);
            }
            mExpandedActionView = h1.getActionView();
            mCurrentExpandedItem = h1;
            if (mExpandedActionView.getParent() != Toolbar.this)
            {
                f1 = generateDefaultLayoutParams();
                f1.gravity = 0x800003 | mButtonGravity & 0x70;
                f1.mViewType = 2;
                mExpandedActionView.setLayoutParams(f1);
                addView(mExpandedActionView);
            }
            removeChildrenForExpandedActionView();
            requestLayout();
            h1.d(true);
            if (mExpandedActionView instanceof CollapsibleActionView)
            {
                ((CollapsibleActionView)mExpandedActionView).onActionViewExpanded();
            }
            return true;
        }

        public boolean flagActionItems()
        {
            return false;
        }

        public int getId()
        {
            return 0;
        }

        public android.support.v7.internal.view.menu.m getMenuView(ViewGroup viewgroup)
        {
            return null;
        }

        public void initForMenu(Context context, android.support.v7.internal.view.menu.f f1)
        {
            if (mMenu != null && mCurrentExpandedItem != null)
            {
                mMenu.b(mCurrentExpandedItem);
            }
            mMenu = f1;
        }

        public void onCloseMenu(android.support.v7.internal.view.menu.f f1, boolean flag)
        {
        }

        public void onRestoreInstanceState(Parcelable parcelable)
        {
        }

        public Parcelable onSaveInstanceState()
        {
            return null;
        }

        public boolean onSubMenuSelected(p p)
        {
            return false;
        }

        public void setCallback(android.support.v7.internal.view.menu.l.a a)
        {
        }

        public void updateMenuView(boolean flag)
        {
            boolean flag2 = false;
            if (mCurrentExpandedItem == null) goto _L2; else goto _L1
_L1:
            boolean flag1 = flag2;
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
                collapseItemActionView(mMenu, mCurrentExpandedItem);
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

    }

    public static class LayoutParams extends android.support.v7.app.ActionBar.LayoutParams
    {

        static final int CUSTOM = 0;
        static final int EXPANDED = 2;
        static final int SYSTEM = 1;
        int mViewType;

        void copyMarginsFromCompat(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            leftMargin = marginlayoutparams.leftMargin;
            topMargin = marginlayoutparams.topMargin;
            rightMargin = marginlayoutparams.rightMargin;
            bottomMargin = marginlayoutparams.bottomMargin;
        }

        public LayoutParams(int i)
        {
            this(-2, -1, i);
        }

        public LayoutParams(int i, int j)
        {
            super(i, j);
            mViewType = 0;
            gravity = 0x800013;
        }

        public LayoutParams(int i, int j, int k)
        {
            super(i, j);
            mViewType = 0;
            gravity = k;
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
            copyMarginsFromCompat(marginlayoutparams);
        }
    }

    public static interface OnMenuItemClickListener
    {

        public abstract boolean onMenuItemClick(MenuItem menuitem);
    }

    public static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

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

        };
        int expandedMenuItemId;
        boolean isOverflowOpen;

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


    private static final String TAG = "Toolbar";
    private android.support.v7.internal.view.menu.l.a mActionMenuPresenterCallback;
    private int mButtonGravity;
    private ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private final RtlSpacingHelper mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    private android.support.v7.internal.view.menu.f.a mMenuBuilderCallback;
    private ActionMenuView mMenuView;
    private final ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    private OnMenuItemClickListener mOnMenuItemClickListener;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private int mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int mTempMargins[];
    private final ArrayList mTempViews;
    private final TintManager mTintManager;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private int mTitleTextColor;
    private TextView mTitleTextView;
    private ToolbarWidgetWrapper mWrapper;

    public Toolbar(Context context)
    {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mContentInsets = new RtlSpacingHelper();
        mGravity = 0x800013;
        mTempViews = new ArrayList();
        mHiddenViews = new ArrayList();
        mTempMargins = new int[2];
        mMenuViewItemClickListener = new ActionMenuView.OnMenuItemClickListener() {

            final Toolbar this$0;

            public boolean onMenuItemClick(MenuItem menuitem)
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

            public void run()
            {
                showOverflowMenu();
            }

            
            {
                this$0 = Toolbar.this;
                super();
            }
        };
        context = TintTypedArray.obtainStyledAttributes(getContext(), attributeset, android.support.v7.appcompat.R.styleable.Toolbar, i, 0);
        mTitleTextAppearance = context.getResourceId(android.support.v7.appcompat.R.styleable.Toolbar_titleTextAppearance, 0);
        mSubtitleTextAppearance = context.getResourceId(android.support.v7.appcompat.R.styleable.Toolbar_subtitleTextAppearance, 0);
        mGravity = context.getInteger(android.support.v7.appcompat.R.styleable.Toolbar_android_gravity, mGravity);
        mButtonGravity = 48;
        i = context.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMargins, 0);
        mTitleMarginBottom = i;
        mTitleMarginTop = i;
        mTitleMarginEnd = i;
        mTitleMarginStart = i;
        i = context.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMarginStart, -1);
        if (i >= 0)
        {
            mTitleMarginStart = i;
        }
        i = context.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMarginEnd, -1);
        if (i >= 0)
        {
            mTitleMarginEnd = i;
        }
        i = context.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMarginTop, -1);
        if (i >= 0)
        {
            mTitleMarginTop = i;
        }
        i = context.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMarginBottom, -1);
        if (i >= 0)
        {
            mTitleMarginBottom = i;
        }
        mMaxButtonHeight = context.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.Toolbar_maxButtonHeight, -1);
        i = context.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetStart, 0x80000000);
        int j = context.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetEnd, 0x80000000);
        int k = context.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetLeft, 0);
        int i1 = context.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetRight, 0);
        mContentInsets.setAbsolute(k, i1);
        if (i != 0x80000000 || j != 0x80000000)
        {
            mContentInsets.setRelative(i, j);
        }
        mCollapseIcon = context.getDrawable(android.support.v7.appcompat.R.styleable.Toolbar_collapseIcon);
        mCollapseDescription = context.getText(android.support.v7.appcompat.R.styleable.Toolbar_collapseContentDescription);
        attributeset = context.getText(android.support.v7.appcompat.R.styleable.Toolbar_title);
        if (!TextUtils.isEmpty(attributeset))
        {
            setTitle(attributeset);
        }
        attributeset = context.getText(android.support.v7.appcompat.R.styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(attributeset))
        {
            setSubtitle(attributeset);
        }
        mPopupContext = getContext();
        setPopupTheme(context.getResourceId(android.support.v7.appcompat.R.styleable.Toolbar_popupTheme, 0));
        attributeset = context.getDrawable(android.support.v7.appcompat.R.styleable.Toolbar_navigationIcon);
        if (attributeset != null)
        {
            setNavigationIcon(attributeset);
        }
        attributeset = context.getText(android.support.v7.appcompat.R.styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(attributeset))
        {
            setNavigationContentDescription(attributeset);
        }
        attributeset = context.getDrawable(android.support.v7.appcompat.R.styleable.Toolbar_logo);
        if (attributeset != null)
        {
            setLogo(attributeset);
        }
        attributeset = context.getText(android.support.v7.appcompat.R.styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(attributeset))
        {
            setLogoDescription(attributeset);
        }
        if (context.hasValue(android.support.v7.appcompat.R.styleable.Toolbar_titleTextColor))
        {
            setTitleTextColor(context.getColor(android.support.v7.appcompat.R.styleable.Toolbar_titleTextColor, -1));
        }
        if (context.hasValue(android.support.v7.appcompat.R.styleable.Toolbar_subtitleTextColor))
        {
            setSubtitleTextColor(context.getColor(android.support.v7.appcompat.R.styleable.Toolbar_subtitleTextColor, -1));
        }
        context.recycle();
        mTintManager = context.getTintManager();
    }

    private void addCustomViewsWithGravity(List list, int i)
    {
        boolean flag = true;
        boolean flag1 = false;
        int j;
        int k;
        if (x.h(this) != 1)
        {
            flag = false;
        }
        k = getChildCount();
        j = f.a(i, x.h(this));
        list.clear();
        i = ((flag1) ? 1 : 0);
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
            for (; i < k; i++)
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

    private void addSystemView(View view, boolean flag)
    {
        Object obj = view.getLayoutParams();
        if (obj == null)
        {
            obj = generateDefaultLayoutParams();
        } else
        if (!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
        {
            obj = generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            obj = (LayoutParams)obj;
        }
        obj.mViewType = 1;
        if (flag && mExpandedActionView != null)
        {
            view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            mHiddenViews.add(view);
            return;
        } else
        {
            addView(view, ((android.view.ViewGroup.LayoutParams) (obj)));
            return;
        }
    }

    private void ensureCollapseButtonView()
    {
        if (mCollapseButtonView == null)
        {
            mCollapseButtonView = new ImageButton(getContext(), null, android.support.v7.appcompat.R.attr.toolbarNavigationButtonStyle);
            mCollapseButtonView.setImageDrawable(mCollapseIcon);
            mCollapseButtonView.setContentDescription(mCollapseDescription);
            LayoutParams layoutparams = generateDefaultLayoutParams();
            layoutparams.gravity = 0x800003 | mButtonGravity & 0x70;
            layoutparams.mViewType = 2;
            mCollapseButtonView.setLayoutParams(layoutparams);
            mCollapseButtonView.setOnClickListener(new android.view.View.OnClickListener() {

                final Toolbar this$0;

                public void onClick(View view)
                {
                    collapseActionView();
                }

            
            {
                this$0 = Toolbar.this;
                super();
            }
            });
        }
    }

    private void ensureLogoView()
    {
        if (mLogoView == null)
        {
            mLogoView = new ImageView(getContext());
        }
    }

    private void ensureMenu()
    {
        ensureMenuView();
        if (mMenuView.peekMenu() == null)
        {
            android.support.v7.internal.view.menu.f f1 = (android.support.v7.internal.view.menu.f)mMenuView.getMenu();
            if (mExpandedMenuPresenter == null)
            {
                mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
            }
            mMenuView.setExpandedActionViewsExclusive(true);
            f1.a(mExpandedMenuPresenter, mPopupContext);
        }
    }

    private void ensureMenuView()
    {
        if (mMenuView == null)
        {
            mMenuView = new ActionMenuView(getContext());
            mMenuView.setPopupTheme(mPopupTheme);
            mMenuView.setOnMenuItemClickListener(mMenuViewItemClickListener);
            mMenuView.setMenuCallbacks(mActionMenuPresenterCallback, mMenuBuilderCallback);
            LayoutParams layoutparams = generateDefaultLayoutParams();
            layoutparams.gravity = 0x800005 | mButtonGravity & 0x70;
            mMenuView.setLayoutParams(layoutparams);
            addSystemView(mMenuView, false);
        }
    }

    private void ensureNavButtonView()
    {
        if (mNavButtonView == null)
        {
            mNavButtonView = new ImageButton(getContext(), null, android.support.v7.appcompat.R.attr.toolbarNavigationButtonStyle);
            LayoutParams layoutparams = generateDefaultLayoutParams();
            layoutparams.gravity = 0x800003 | mButtonGravity & 0x70;
            mNavButtonView.setLayoutParams(layoutparams);
        }
    }

    private int getChildHorizontalGravity(int i)
    {
label0:
        {
            int k = x.h(this);
            int j = f.a(i, k) & 7;
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
        int i1;
        int j1;
        layoutparams = (LayoutParams)view.getLayoutParams();
        k = view.getMeasuredHeight();
        if (i > 0)
        {
            i = (k - i) / 2;
        } else
        {
            i = 0;
        }
        getChildVerticalGravity(layoutparams.gravity);
        JVM INSTR lookupswitch 2: default 60
    //                   48: 115
    //                   80: 122;
           goto _L1 _L2 _L3
_L1:
        j = getPaddingTop();
        i1 = getPaddingBottom();
        j1 = getHeight();
        i = (j1 - j - i1 - k) / 2;
        if (i >= layoutparams.topMargin) goto _L5; else goto _L4
_L4:
        i = layoutparams.topMargin;
_L7:
        return i + j;
_L2:
        return getPaddingTop() - i;
_L3:
        return getHeight() - getPaddingBottom() - k - layoutparams.bottomMargin - i;
_L5:
        k = j1 - i1 - k - i - j;
        if (k < layoutparams.bottomMargin)
        {
            i = Math.max(0, i - (layoutparams.bottomMargin - k));
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private int getChildVerticalGravity(int i)
    {
        int j = i & 0x70;
        i = j;
        switch (j)
        {
        default:
            i = mGravity & 0x70;
            // fall through

        case 16: // '\020'
        case 48: // '0'
        case 80: // 'P'
            return i;
        }
    }

    private int getHorizontalMargins(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i = l.a(view);
        return l.b(view) + i;
    }

    private MenuInflater getMenuInflater()
    {
        return new SupportMenuInflater(getContext());
    }

    private int getVerticalMargins(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i = ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin;
        return ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin + i;
    }

    private int getViewListMeasuredWidth(List list, int ai[])
    {
        int i1 = ai[0];
        int k = ai[1];
        int j1 = list.size();
        int j = 0;
        int i;
        int k1;
        int l1;
        int i2;
        for (i = 0; j < j1; i += i2 + k1 + l1)
        {
            ai = (View)list.get(j);
            LayoutParams layoutparams = (LayoutParams)ai.getLayoutParams();
            i1 = layoutparams.leftMargin - i1;
            k = layoutparams.rightMargin - k;
            k1 = Math.max(0, i1);
            l1 = Math.max(0, k);
            i1 = Math.max(0, -i1);
            k = Math.max(0, -k);
            i2 = ai.getMeasuredWidth();
            j++;
        }

        return i;
    }

    private boolean isChildOrHidden(View view)
    {
        return view.getParent() == this || mHiddenViews.contains(view);
    }

    private static boolean isCustomView(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).mViewType == 0;
    }

    private int layoutChildLeft(View view, int i, int ai[], int j)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int k = layoutparams.leftMargin - ai[0];
        i = Math.max(0, k) + i;
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

    private int measureChildCollapseMargins(View view, int i, int j, int k, int i1, int ai[])
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int j1 = marginlayoutparams.leftMargin - ai[0];
        int k1 = marginlayoutparams.rightMargin - ai[1];
        int l1 = Math.max(0, j1) + Math.max(0, k1);
        ai[0] = Math.max(0, -j1);
        ai[1] = Math.max(0, -k1);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + l1 + j, marginlayoutparams.width), getChildMeasureSpec(k, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + i1, marginlayoutparams.height));
        return view.getMeasuredWidth() + l1;
    }

    private void measureChildConstrained(View view, int i, int j, int k, int i1, int j1)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int k1 = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j, marginlayoutparams.width);
        j = getChildMeasureSpec(k, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + i1, marginlayoutparams.height);
        k = android.view.View.MeasureSpec.getMode(j);
        i = j;
        if (k != 0x40000000)
        {
            i = j;
            if (j1 >= 0)
            {
                i = j1;
                if (k != 0)
                {
                    i = Math.min(android.view.View.MeasureSpec.getSize(j), j1);
                }
                i = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
            }
        }
        view.measure(k1, i);
    }

    private void postShowOverflowMenu()
    {
        removeCallbacks(mShowOverflowMenuRunnable);
        post(mShowOverflowMenuRunnable);
    }

    private boolean shouldCollapse()
    {
        if (mCollapsible) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = getChildCount();
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                View view = getChildAt(i);
                if (shouldLayout(view) && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0)
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private boolean shouldLayout(View view)
    {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }

    void addChildrenForExpandedActionView()
    {
        for (int i = mHiddenViews.size() - 1; i >= 0; i--)
        {
            addView((View)mHiddenViews.get(i));
        }

        mHiddenViews.clear();
    }

    public boolean canShowOverflowMenu()
    {
        return getVisibility() == 0 && mMenuView != null && mMenuView.isOverflowReserved();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return super.checkLayoutParams(layoutparams) && (layoutparams instanceof LayoutParams);
    }

    public void collapseActionView()
    {
        h h1;
        if (mExpandedMenuPresenter == null)
        {
            h1 = null;
        } else
        {
            h1 = mExpandedMenuPresenter.mCurrentExpandedItem;
        }
        if (h1 != null)
        {
            h1.collapseActionView();
        }
    }

    public void dismissPopupMenus()
    {
        if (mMenuView != null)
        {
            mMenuView.dismissPopupMenus();
        }
    }

    protected LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(-2, -2);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
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

    public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
    }

    public int getContentInsetEnd()
    {
        return mContentInsets.getEnd();
    }

    public int getContentInsetLeft()
    {
        return mContentInsets.getLeft();
    }

    public int getContentInsetRight()
    {
        return mContentInsets.getRight();
    }

    public int getContentInsetStart()
    {
        return mContentInsets.getStart();
    }

    public Drawable getLogo()
    {
        if (mLogoView != null)
        {
            return mLogoView.getDrawable();
        } else
        {
            return null;
        }
    }

    public CharSequence getLogoDescription()
    {
        if (mLogoView != null)
        {
            return mLogoView.getContentDescription();
        } else
        {
            return null;
        }
    }

    public Menu getMenu()
    {
        ensureMenu();
        return mMenuView.getMenu();
    }

    public CharSequence getNavigationContentDescription()
    {
        if (mNavButtonView != null)
        {
            return mNavButtonView.getContentDescription();
        } else
        {
            return null;
        }
    }

    public Drawable getNavigationIcon()
    {
        if (mNavButtonView != null)
        {
            return mNavButtonView.getDrawable();
        } else
        {
            return null;
        }
    }

    public Drawable getOverflowIcon()
    {
        ensureMenu();
        return mMenuView.getOverflowIcon();
    }

    public int getPopupTheme()
    {
        return mPopupTheme;
    }

    public CharSequence getSubtitle()
    {
        return mSubtitleText;
    }

    public CharSequence getTitle()
    {
        return mTitleText;
    }

    public DecorToolbar getWrapper()
    {
        if (mWrapper == null)
        {
            mWrapper = new ToolbarWidgetWrapper(this, true);
        }
        return mWrapper;
    }

    public boolean hasExpandedActionView()
    {
        return mExpandedMenuPresenter != null && mExpandedMenuPresenter.mCurrentExpandedItem != null;
    }

    public boolean hideOverflowMenu()
    {
        return mMenuView != null && mMenuView.hideOverflowMenu();
    }

    public void inflateMenu(int i)
    {
        getMenuInflater().inflate(i, getMenu());
    }

    public boolean isOverflowMenuShowPending()
    {
        return mMenuView != null && mMenuView.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing()
    {
        return mMenuView != null && mMenuView.isOverflowMenuShowing();
    }

    public boolean isTitleTruncated()
    {
        if (mTitleTextView != null) goto _L2; else goto _L1
_L1:
        Layout layout;
        return false;
_L2:
        if ((layout = mTitleTextView.getLayout()) != null)
        {
            int j = layout.getLineCount();
            int i = 0;
            while (i < j) 
            {
                if (layout.getEllipsisCount(i) > 0)
                {
                    return true;
                }
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(mShowOverflowMenuRunnable);
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        int i = n.a(motionevent);
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

    protected void onLayout(boolean flag, int i, int j, int k, int i1)
    {
        Object obj;
        Object obj1;
        int ai[];
        int j1;
        boolean flag1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        boolean flag2;
        if (x.h(this) == 1)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        k2 = getWidth();
        j3 = getHeight();
        j1 = getPaddingLeft();
        l2 = getPaddingRight();
        i3 = getPaddingTop();
        k3 = getPaddingBottom();
        i1 = k2 - l2;
        ai = mTempMargins;
        ai[1] = 0;
        ai[0] = 0;
        j2 = x.r(this);
        if (shouldLayout(mNavButtonView))
        {
            if (l1 != 0)
            {
                i1 = layoutChildRight(mNavButtonView, i1, ai, j2);
                i = j1;
            } else
            {
                i = layoutChildLeft(mNavButtonView, j1, ai, j2);
            }
        } else
        {
            i = j1;
        }
        j = i1;
        k = i;
        if (shouldLayout(mCollapseButtonView))
        {
            if (l1 != 0)
            {
                j = layoutChildRight(mCollapseButtonView, i1, ai, j2);
                k = i;
            } else
            {
                k = layoutChildLeft(mCollapseButtonView, i, ai, j2);
                j = i1;
            }
        }
        i = j;
        i1 = k;
        if (shouldLayout(mMenuView))
        {
            if (l1 != 0)
            {
                i1 = layoutChildLeft(mMenuView, k, ai, j2);
                i = j;
            } else
            {
                i = layoutChildRight(mMenuView, j, ai, j2);
                i1 = k;
            }
        }
        ai[0] = Math.max(0, getContentInsetLeft() - i1);
        ai[1] = Math.max(0, getContentInsetRight() - (k2 - l2 - i));
        k = Math.max(i1, getContentInsetLeft());
        i1 = Math.min(i, k2 - l2 - getContentInsetRight());
        j = i1;
        i = k;
        if (shouldLayout(mExpandedActionView))
        {
            if (l1 != 0)
            {
                j = layoutChildRight(mExpandedActionView, i1, ai, j2);
                i = k;
            } else
            {
                i = layoutChildLeft(mExpandedActionView, k, ai, j2);
                j = i1;
            }
        }
        if (shouldLayout(mLogoView))
        {
            if (l1 != 0)
            {
                j = layoutChildRight(mLogoView, j, ai, j2);
                k = i;
            } else
            {
                k = layoutChildLeft(mLogoView, i, ai, j2);
            }
        } else
        {
            k = i;
        }
        flag = shouldLayout(mTitleTextView);
        flag2 = shouldLayout(mSubtitleTextView);
        i = 0;
        if (flag)
        {
            LayoutParams layoutparams = (LayoutParams)mTitleTextView.getLayoutParams();
            i = layoutparams.topMargin;
            i1 = mTitleTextView.getMeasuredHeight();
            i = layoutparams.bottomMargin + (i + i1) + 0;
        }
        if (flag2)
        {
            LayoutParams layoutparams1 = (LayoutParams)mSubtitleTextView.getLayoutParams();
            i1 = layoutparams1.topMargin;
            int k1 = mSubtitleTextView.getMeasuredHeight();
            i2 = layoutparams1.bottomMargin + (i1 + k1) + i;
        } else
        {
            i2 = i;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        i1 = j;
        i = k;
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
        JVM INSTR lookupswitch 2: default 560
    //                   48: 999
    //                   80: 1073;
           goto _L4 _L5 _L6
_L4:
        i = (j3 - i3 - k3 - i2) / 2;
        if (i < ((LayoutParams) (obj)).topMargin + mTitleMarginTop)
        {
            i = ((LayoutParams) (obj)).topMargin + mTitleMarginTop;
        } else
        {
            i1 = j3 - k3 - i2 - i - i3;
            if (i1 < ((LayoutParams) (obj)).bottomMargin + mTitleMarginBottom)
            {
                i = Math.max(0, i - ((((LayoutParams) (obj1)).bottomMargin + mTitleMarginBottom) - i1));
            }
        }
        i = i3 + i;
_L8:
        if (l1 != 0)
        {
            if (flag1)
            {
                i1 = mTitleMarginStart;
            } else
            {
                i1 = 0;
            }
            i1 -= ai[1];
            j -= Math.max(0, i1);
            ai[1] = Math.max(0, -i1);
            if (flag)
            {
                obj = (LayoutParams)mTitleTextView.getLayoutParams();
                i1 = j - mTitleTextView.getMeasuredWidth();
                l1 = mTitleTextView.getMeasuredHeight() + i;
                mTitleTextView.layout(i1, i, j, l1);
                i2 = mTitleMarginEnd;
                i = l1 + ((LayoutParams) (obj)).bottomMargin;
                i1 -= i2;
            } else
            {
                i1 = j;
            }
            if (flag2)
            {
                obj = (LayoutParams)mSubtitleTextView.getLayoutParams();
                i = ((LayoutParams) (obj)).topMargin + i;
                l1 = mSubtitleTextView.getMeasuredWidth();
                i2 = mSubtitleTextView.getMeasuredHeight();
                mSubtitleTextView.layout(j - l1, i, j, i2 + i);
                i = mTitleMarginEnd;
                l1 = ((LayoutParams) (obj)).bottomMargin;
                i = j - i;
            } else
            {
                i = j;
            }
            if (flag1)
            {
                i = Math.min(i1, i);
            } else
            {
                i = j;
            }
            i1 = i;
            i = k;
        } else
        {
            if (flag1)
            {
                i1 = mTitleMarginStart;
            } else
            {
                i1 = 0;
            }
            i1 -= ai[0];
            k += Math.max(0, i1);
            ai[0] = Math.max(0, -i1);
            if (flag)
            {
                obj = (LayoutParams)mTitleTextView.getLayoutParams();
                l1 = mTitleTextView.getMeasuredWidth() + k;
                i1 = mTitleTextView.getMeasuredHeight() + i;
                mTitleTextView.layout(k, i, l1, i1);
                i2 = mTitleMarginEnd;
                i = ((LayoutParams) (obj)).bottomMargin;
                l1 += i2;
                i += i1;
            } else
            {
                l1 = k;
            }
            if (flag2)
            {
                obj = (LayoutParams)mSubtitleTextView.getLayoutParams();
                i1 = i + ((LayoutParams) (obj)).topMargin;
                i = mSubtitleTextView.getMeasuredWidth() + k;
                i2 = mSubtitleTextView.getMeasuredHeight();
                mSubtitleTextView.layout(k, i1, i, i2 + i1);
                i1 = mTitleMarginEnd;
                i2 = ((LayoutParams) (obj)).bottomMargin;
                i2 = i1 + i;
            } else
            {
                i2 = k;
            }
            i1 = j;
            i = k;
            if (flag1)
            {
                i = Math.max(l1, i2);
                i1 = j;
            }
        }
_L3:
        addCustomViewsWithGravity(mTempViews, 3);
        k = mTempViews.size();
        for (j = 0; j < k; j++)
        {
            i = layoutChildLeft((View)mTempViews.get(j), i, ai, j2);
        }

        addCustomViewsWithGravity(mTempViews, 5);
        k = mTempViews.size();
        for (j = 0; j < k; j++)
        {
            i1 = layoutChildRight((View)mTempViews.get(j), i1, ai, j2);
        }

        addCustomViewsWithGravity(mTempViews, 1);
        k = getViewListMeasuredWidth(mTempViews, ai);
        j = ((k2 - j1 - l2) / 2 + j1) - k / 2;
        k += j;
          goto _L7
_L5:
        i = getPaddingTop();
        i = ((LayoutParams) (obj)).topMargin + i + mTitleMarginTop;
        break MISSING_BLOCK_LABEL_604;
_L6:
        i = j3 - k3 - ((LayoutParams) (obj1)).bottomMargin - mTitleMarginBottom - i2;
          goto _L8
_L7:
        if (j >= i) goto _L10; else goto _L9
_L9:
        i1 = mTempViews.size();
        k = 0;
        j = i;
        for (i = k; i < i1; i++)
        {
            j = layoutChildLeft((View)mTempViews.get(i), j, ai, j2);
        }

        break; /* Loop/switch isn't completed */
_L10:
        i = j;
        if (k > i1)
        {
            i = j - (k - i1);
        }
        if (true) goto _L9; else goto _L11
_L11:
        mTempViews.clear();
        return;
          goto _L8
    }

    protected void onMeasure(int i, int j)
    {
        int ai[] = mTempMargins;
        int k;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int l2;
        if (ViewUtils.isLayoutRtl(this))
        {
            l1 = 0;
            i2 = 1;
        } else
        {
            l1 = 1;
            i2 = 0;
        }
        k = 0;
        if (shouldLayout(mNavButtonView))
        {
            measureChildConstrained(mNavButtonView, i, 0, j, 0, mMaxButtonHeight);
            k = mNavButtonView.getMeasuredWidth() + getHorizontalMargins(mNavButtonView);
            k1 = Math.max(0, mNavButtonView.getMeasuredHeight() + getVerticalMargins(mNavButtonView));
            j1 = ViewUtils.combineMeasuredStates(0, x.l(mNavButtonView));
        } else
        {
            j1 = 0;
            k1 = 0;
        }
        j2 = k;
        k = j1;
        i1 = k1;
        if (shouldLayout(mCollapseButtonView))
        {
            measureChildConstrained(mCollapseButtonView, i, 0, j, 0, mMaxButtonHeight);
            j2 = mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(mCollapseButtonView);
            i1 = Math.max(k1, mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(mCollapseButtonView));
            k = ViewUtils.combineMeasuredStates(j1, x.l(mCollapseButtonView));
        }
        j1 = getContentInsetStart();
        l2 = Math.max(j1, j2) + 0;
        ai[i2] = Math.max(0, j1 - j2);
        i2 = 0;
        j1 = k;
        k1 = i1;
        if (shouldLayout(mMenuView))
        {
            measureChildConstrained(mMenuView, i, l2, j, 0, mMaxButtonHeight);
            i2 = mMenuView.getMeasuredWidth() + getHorizontalMargins(mMenuView);
            k1 = Math.max(i1, mMenuView.getMeasuredHeight() + getVerticalMargins(mMenuView));
            j1 = ViewUtils.combineMeasuredStates(k, x.l(mMenuView));
        }
        k = getContentInsetEnd();
        j2 = l2 + Math.max(k, i2);
        ai[l1] = Math.max(0, k - i2);
        i2 = j2;
        k = j1;
        i1 = k1;
        if (shouldLayout(mExpandedActionView))
        {
            i2 = j2 + measureChildCollapseMargins(mExpandedActionView, i, j2, j, 0, ai);
            i1 = Math.max(k1, mExpandedActionView.getMeasuredHeight() + getVerticalMargins(mExpandedActionView));
            k = ViewUtils.combineMeasuredStates(j1, x.l(mExpandedActionView));
        }
        j1 = i2;
        k1 = k;
        l1 = i1;
        if (shouldLayout(mLogoView))
        {
            j1 = i2 + measureChildCollapseMargins(mLogoView, i, i2, j, 0, ai);
            l1 = Math.max(i1, mLogoView.getMeasuredHeight() + getVerticalMargins(mLogoView));
            k1 = ViewUtils.combineMeasuredStates(k, x.l(mLogoView));
        }
        j2 = getChildCount();
        i2 = 0;
        i1 = l1;
        k = k1;
        k1 = i2;
        i2 = j1;
        while (k1 < j2) 
        {
            View view = getChildAt(k1);
            int k2;
            int i3;
            int j3;
            int k3;
            if (((LayoutParams)view.getLayoutParams()).mViewType == 0 && shouldLayout(view))
            {
                i2 += measureChildCollapseMargins(view, i, i2, j, 0, ai);
                j1 = Math.max(i1, view.getMeasuredHeight() + getVerticalMargins(view));
                i1 = ViewUtils.combineMeasuredStates(k, x.l(view));
                k = j1;
            } else
            {
                j1 = i1;
                i1 = k;
                k = j1;
            }
            k1++;
            j1 = k;
            k = i1;
            i1 = j1;
        }
        l1 = 0;
        k1 = 0;
        j3 = mTitleMarginTop + mTitleMarginBottom;
        k3 = mTitleMarginStart + mTitleMarginEnd;
        j1 = k;
        if (shouldLayout(mTitleTextView))
        {
            measureChildCollapseMargins(mTitleTextView, i, i2 + k3, j, j3, ai);
            j1 = mTitleTextView.getMeasuredWidth();
            l1 = getHorizontalMargins(mTitleTextView) + j1;
            k1 = mTitleTextView.getMeasuredHeight() + getVerticalMargins(mTitleTextView);
            j1 = ViewUtils.combineMeasuredStates(k, x.l(mTitleTextView));
        }
        i3 = k1;
        k2 = l1;
        k = j1;
        if (shouldLayout(mSubtitleTextView))
        {
            k2 = Math.max(l1, measureChildCollapseMargins(mSubtitleTextView, i, i2 + k3, j, j3 + k1, ai));
            i3 = k1 + (mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(mSubtitleTextView));
            k = ViewUtils.combineMeasuredStates(j1, x.l(mSubtitleTextView));
        }
        i1 = Math.max(i1, i3);
        l1 = getPaddingLeft();
        i3 = getPaddingRight();
        j1 = getPaddingTop();
        k1 = getPaddingBottom();
        l1 = x.a(Math.max(k2 + i2 + (l1 + i3), getSuggestedMinimumWidth()), i, 0xff000000 & k);
        i = x.a(Math.max(i1 + (j1 + k1), getSuggestedMinimumHeight()), j, k << 16);
        if (shouldCollapse())
        {
            i = 0;
        }
        setMeasuredDimension(l1, i);
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        SavedState savedstate = (SavedState)parcelable;
        super.onRestoreInstanceState(savedstate.getSuperState());
        if (mMenuView != null)
        {
            parcelable = mMenuView.peekMenu();
        } else
        {
            parcelable = null;
        }
        if (savedstate.expandedMenuItemId != 0 && mExpandedMenuPresenter != null && parcelable != null)
        {
            parcelable = parcelable.findItem(savedstate.expandedMenuItemId);
            if (parcelable != null)
            {
                m.b(parcelable);
            }
        }
        if (savedstate.isOverflowOpen)
        {
            postShowOverflowMenu();
        }
    }

    public void onRtlPropertiesChanged(int i)
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            super.onRtlPropertiesChanged(i);
        }
        RtlSpacingHelper rtlspacinghelper = mContentInsets;
        if (i != 1)
        {
            flag = false;
        }
        rtlspacinghelper.setDirection(flag);
    }

    protected Parcelable onSaveInstanceState()
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
        int i = n.a(motionevent);
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

    void removeChildrenForExpandedActionView()
    {
        for (int i = getChildCount() - 1; i >= 0; i--)
        {
            View view = getChildAt(i);
            if (((LayoutParams)view.getLayoutParams()).mViewType != 2 && view != mMenuView)
            {
                removeViewAt(i);
                mHiddenViews.add(view);
            }
        }

    }

    public void setCollapsible(boolean flag)
    {
        mCollapsible = flag;
        requestLayout();
    }

    public void setContentInsetsAbsolute(int i, int j)
    {
        mContentInsets.setAbsolute(i, j);
    }

    public void setContentInsetsRelative(int i, int j)
    {
        mContentInsets.setRelative(i, j);
    }

    public void setLogo(int i)
    {
        setLogo(mTintManager.getDrawable(i));
    }

    public void setLogo(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        ensureLogoView();
        if (!isChildOrHidden(mLogoView))
        {
            addSystemView(mLogoView, true);
        }
_L4:
        if (mLogoView != null)
        {
            mLogoView.setImageDrawable(drawable);
        }
        return;
_L2:
        if (mLogoView != null && isChildOrHidden(mLogoView))
        {
            removeView(mLogoView);
            mHiddenViews.remove(mLogoView);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setLogoDescription(int i)
    {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            ensureLogoView();
        }
        if (mLogoView != null)
        {
            mLogoView.setContentDescription(charsequence);
        }
    }

    public void setMenu(android.support.v7.internal.view.menu.f f1, ActionMenuPresenter actionmenupresenter)
    {
        if (f1 != null || mMenuView != null)
        {
            ensureMenuView();
            android.support.v7.internal.view.menu.f f2 = mMenuView.peekMenu();
            if (f2 != f1)
            {
                if (f2 != null)
                {
                    f2.b(mOuterActionMenuPresenter);
                    f2.b(mExpandedMenuPresenter);
                }
                if (mExpandedMenuPresenter == null)
                {
                    mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
                }
                actionmenupresenter.setExpandedActionViewsExclusive(true);
                if (f1 != null)
                {
                    f1.a(actionmenupresenter, mPopupContext);
                    f1.a(mExpandedMenuPresenter, mPopupContext);
                } else
                {
                    actionmenupresenter.initForMenu(mPopupContext, null);
                    mExpandedMenuPresenter.initForMenu(mPopupContext, null);
                    actionmenupresenter.updateMenuView(true);
                    mExpandedMenuPresenter.updateMenuView(true);
                }
                mMenuView.setPopupTheme(mPopupTheme);
                mMenuView.setPresenter(actionmenupresenter);
                mOuterActionMenuPresenter = actionmenupresenter;
                return;
            }
        }
    }

    public void setMenuCallbacks(android.support.v7.internal.view.menu.l.a a, android.support.v7.internal.view.menu.f.a a1)
    {
        mActionMenuPresenterCallback = a;
        mMenuBuilderCallback = a1;
    }

    public void setNavigationContentDescription(int i)
    {
        CharSequence charsequence;
        if (i != 0)
        {
            charsequence = getContext().getText(i);
        } else
        {
            charsequence = null;
        }
        setNavigationContentDescription(charsequence);
    }

    public void setNavigationContentDescription(CharSequence charsequence)
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

    public void setNavigationIcon(int i)
    {
        setNavigationIcon(mTintManager.getDrawable(i));
    }

    public void setNavigationIcon(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        ensureNavButtonView();
        if (!isChildOrHidden(mNavButtonView))
        {
            addSystemView(mNavButtonView, true);
        }
_L4:
        if (mNavButtonView != null)
        {
            mNavButtonView.setImageDrawable(drawable);
        }
        return;
_L2:
        if (mNavButtonView != null && isChildOrHidden(mNavButtonView))
        {
            removeView(mNavButtonView);
            mHiddenViews.remove(mNavButtonView);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        ensureNavButtonView();
        mNavButtonView.setOnClickListener(onclicklistener);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onmenuitemclicklistener)
    {
        mOnMenuItemClickListener = onmenuitemclicklistener;
    }

    public void setOverflowIcon(Drawable drawable)
    {
        ensureMenu();
        mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i)
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

    public void setSubtitle(int i)
    {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charsequence)
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
        if (!isChildOrHidden(mSubtitleTextView))
        {
            addSystemView(mSubtitleTextView, true);
        }
_L4:
        if (mSubtitleTextView != null)
        {
            mSubtitleTextView.setText(charsequence);
        }
        mSubtitleText = charsequence;
        return;
_L2:
        if (mSubtitleTextView != null && isChildOrHidden(mSubtitleTextView))
        {
            removeView(mSubtitleTextView);
            mHiddenViews.remove(mSubtitleTextView);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setSubtitleTextAppearance(Context context, int i)
    {
        mSubtitleTextAppearance = i;
        if (mSubtitleTextView != null)
        {
            mSubtitleTextView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(int i)
    {
        mSubtitleTextColor = i;
        if (mSubtitleTextView != null)
        {
            mSubtitleTextView.setTextColor(i);
        }
    }

    public void setTitle(int i)
    {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charsequence)
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
        if (!isChildOrHidden(mTitleTextView))
        {
            addSystemView(mTitleTextView, true);
        }
_L4:
        if (mTitleTextView != null)
        {
            mTitleTextView.setText(charsequence);
        }
        mTitleText = charsequence;
        return;
_L2:
        if (mTitleTextView != null && isChildOrHidden(mTitleTextView))
        {
            removeView(mTitleTextView);
            mHiddenViews.remove(mTitleTextView);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setTitleTextAppearance(Context context, int i)
    {
        mTitleTextAppearance = i;
        if (mTitleTextView != null)
        {
            mTitleTextView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i)
    {
        mTitleTextColor = i;
        if (mTitleTextView != null)
        {
            mTitleTextView.setTextColor(i);
        }
    }

    public boolean showOverflowMenu()
    {
        return mMenuView != null && mMenuView.showOverflowMenu();
    }




}
