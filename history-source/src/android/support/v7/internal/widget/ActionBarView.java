// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v7.internal.view.menu.ActionMenuItem;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.support.v7.internal.view.menu.MenuPresenter;
import android.support.v7.internal.view.menu.MenuView;
import android.support.v7.internal.view.menu.SubMenuBuilder;
import android.support.v7.view.CollapsibleActionView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsActionBarView, SpinnerICS, ProgressBarICS, ScrollingTabContainerView, 
//            ActionBarContextView, ActionBarContainer, AdapterViewICS

public class ActionBarView extends AbsActionBarView
{
    private class ExpandedActionViewMenuPresenter
        implements MenuPresenter
    {

        MenuItemImpl mCurrentExpandedItem;
        MenuBuilder mMenu;
        final ActionBarView this$0;

        public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
        {
            if (mExpandedActionView instanceof CollapsibleActionView)
            {
                ((CollapsibleActionView)mExpandedActionView).onActionViewCollapsed();
            }
            removeView(mExpandedActionView);
            removeView(mExpandedHomeLayout);
            mExpandedActionView = null;
            if ((mDisplayOptions & 2) != 0)
            {
                mHomeLayout.setVisibility(0);
            }
            if ((mDisplayOptions & 8) != 0)
            {
                if (mTitleLayout == null)
                {
                    initTitle();
                } else
                {
                    mTitleLayout.setVisibility(0);
                }
            }
            if (mTabScrollView != null && mNavigationMode == 2)
            {
                mTabScrollView.setVisibility(0);
            }
            if (mSpinner != null && mNavigationMode == 1)
            {
                mSpinner.setVisibility(0);
            }
            if (mCustomNavView != null && (mDisplayOptions & 0x10) != 0)
            {
                mCustomNavView.setVisibility(0);
            }
            mExpandedHomeLayout.setIcon(null);
            mCurrentExpandedItem = null;
            requestLayout();
            menuitemimpl.setActionViewExpanded(false);
            return true;
        }

        public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
        {
            mExpandedActionView = menuitemimpl.getActionView();
            mExpandedHomeLayout.setIcon(mIcon.getConstantState().newDrawable(getResources()));
            mCurrentExpandedItem = menuitemimpl;
            if (mExpandedActionView.getParent() != ActionBarView.this)
            {
                addView(mExpandedActionView);
            }
            if (mExpandedHomeLayout.getParent() != ActionBarView.this)
            {
                addView(mExpandedHomeLayout);
            }
            mHomeLayout.setVisibility(8);
            if (mTitleLayout != null)
            {
                mTitleLayout.setVisibility(8);
            }
            if (mTabScrollView != null)
            {
                mTabScrollView.setVisibility(8);
            }
            if (mSpinner != null)
            {
                mSpinner.setVisibility(8);
            }
            if (mCustomNavView != null)
            {
                mCustomNavView.setVisibility(8);
            }
            requestLayout();
            menuitemimpl.setActionViewExpanded(true);
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

        public MenuView getMenuView(ViewGroup viewgroup)
        {
            return null;
        }

        public void initForMenu(Context context, MenuBuilder menubuilder)
        {
            if (mMenu != null && mCurrentExpandedItem != null)
            {
                mMenu.collapseItemActionView(mCurrentExpandedItem);
            }
            mMenu = menubuilder;
        }

        public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
        }

        public void onRestoreInstanceState(Parcelable parcelable)
        {
        }

        public Parcelable onSaveInstanceState()
        {
            return null;
        }

        public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
        {
            return false;
        }

        public void setCallback(android.support.v7.internal.view.menu.MenuPresenter.Callback callback)
        {
        }

        public void updateMenuView(boolean flag)
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
            if ((SupportMenuItem)mMenu.getItem(i) != mCurrentExpandedItem) goto _L7; else goto _L6
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
            this$0 = ActionBarView.this;
            super();
        }

    }

    private static class HomeView extends FrameLayout
    {

        private Drawable mDefaultUpIndicator;
        private ImageView mIconView;
        private int mUpIndicatorRes;
        private ImageView mUpView;
        private int mUpWidth;

        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            CharSequence charsequence = getContentDescription();
            if (!TextUtils.isEmpty(charsequence))
            {
                accessibilityevent.getText().add(charsequence);
            }
            return true;
        }

        public int getLeftOffset()
        {
            if (mUpView.getVisibility() == 8)
            {
                return mUpWidth;
            } else
            {
                return 0;
            }
        }

        protected void onConfigurationChanged(Configuration configuration)
        {
            super.onConfigurationChanged(configuration);
            if (mUpIndicatorRes != 0)
            {
                setUpIndicator(mUpIndicatorRes);
            }
        }

        protected void onFinishInflate()
        {
            mUpView = (ImageView)findViewById(android.support.v7.appcompat.R.id.up);
            mIconView = (ImageView)findViewById(android.support.v7.appcompat.R.id.home);
            mDefaultUpIndicator = mUpView.getDrawable();
        }

        protected void onLayout(boolean flag, int i, int j, int k, int l)
        {
            int i1 = (l - j) / 2;
            j = 0;
            l = i;
            if (mUpView.getVisibility() != 8)
            {
                android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)mUpView.getLayoutParams();
                j = mUpView.getMeasuredHeight();
                l = mUpView.getMeasuredWidth();
                int j1 = i1 - j / 2;
                mUpView.layout(0, j1, l, j1 + j);
                j = layoutparams.leftMargin + l + layoutparams.rightMargin;
                l = i + j;
            }
            android.widget.FrameLayout.LayoutParams layoutparams1 = (android.widget.FrameLayout.LayoutParams)mIconView.getLayoutParams();
            i = mIconView.getMeasuredHeight();
            int k1 = mIconView.getMeasuredWidth();
            k = (k - l) / 2;
            j += Math.max(layoutparams1.leftMargin, k - k1 / 2);
            k = Math.max(layoutparams1.topMargin, i1 - i / 2);
            mIconView.layout(j, k, j + k1, k + i);
        }

        protected void onMeasure(int i, int j)
        {
            int k;
            int l;
            measureChildWithMargins(mUpView, i, 0, j, 0);
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)mUpView.getLayoutParams();
            mUpWidth = layoutparams.leftMargin + mUpView.getMeasuredWidth() + layoutparams.rightMargin;
            int i1;
            int j1;
            if (mUpView.getVisibility() == 8)
            {
                k = 0;
            } else
            {
                k = mUpWidth;
            }
            l = layoutparams.topMargin;
            i1 = mUpView.getMeasuredHeight();
            j1 = layoutparams.bottomMargin;
            measureChildWithMargins(mIconView, i, k, j, 0);
            layoutparams = (android.widget.FrameLayout.LayoutParams)mIconView.getLayoutParams();
            k += layoutparams.leftMargin + mIconView.getMeasuredWidth() + layoutparams.rightMargin;
            l = Math.max(l + i1 + j1, layoutparams.topMargin + mIconView.getMeasuredHeight() + layoutparams.bottomMargin);
            j1 = android.view.View.MeasureSpec.getMode(i);
            i1 = android.view.View.MeasureSpec.getMode(j);
            i = android.view.View.MeasureSpec.getSize(i);
            j = android.view.View.MeasureSpec.getSize(j);
            j1;
            JVM INSTR lookupswitch 2: default 208
        //                       -2147483648: 259
        //                       1073741824: 269;
               goto _L1 _L2 _L3
_L1:
            i = k;
_L3:
            i1;
            JVM INSTR lookupswitch 2: default 240
        //                       -2147483648: 272
        //                       1073741824: 282;
               goto _L4 _L5 _L6
_L6:
            break; /* Loop/switch isn't completed */
_L4:
            j = l;
_L7:
            setMeasuredDimension(i, j);
            return;
_L2:
            i = Math.min(k, i);
              goto _L3
_L5:
            j = Math.min(l, j);
              goto _L7
        }

        public void setIcon(Drawable drawable)
        {
            mIconView.setImageDrawable(drawable);
        }

        public void setUp(boolean flag)
        {
            ImageView imageview = mUpView;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            imageview.setVisibility(i);
        }

        public void setUpIndicator(int i)
        {
            mUpIndicatorRes = i;
            ImageView imageview = mUpView;
            Drawable drawable;
            if (i != 0)
            {
                drawable = getResources().getDrawable(i);
            } else
            {
                drawable = mDefaultUpIndicator;
            }
            imageview.setImageDrawable(drawable);
        }

        public void setUpIndicator(Drawable drawable)
        {
            ImageView imageview = mUpView;
            if (drawable == null)
            {
                drawable = mDefaultUpIndicator;
            }
            imageview.setImageDrawable(drawable);
            mUpIndicatorRes = 0;
        }

        public HomeView(Context context)
        {
            this(context, null);
        }

        public HomeView(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }
    }

    static class SavedState extends android.view.View.BaseSavedState
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


        private SavedState(Parcel parcel)
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


        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    private static final int DEFAULT_CUSTOM_GRAVITY = 19;
    public static final int DISPLAY_DEFAULT = 0;
    private static final int DISPLAY_RELAYOUT_MASK = 31;
    private static final String TAG = "ActionBarView";
    private android.support.v7.app.ActionBar.OnNavigationListener mCallback;
    private Context mContext;
    private ActionBarContextView mContextView;
    private View mCustomNavView;
    private int mDisplayOptions;
    View mExpandedActionView;
    private final android.view.View.OnClickListener mExpandedActionViewUpListener = new android.view.View.OnClickListener() {

        final ActionBarView this$0;

        public void onClick(View view)
        {
            view = mExpandedMenuPresenter.mCurrentExpandedItem;
            if (view != null)
            {
                view.collapseActionView();
            }
        }

            
            {
                this$0 = ActionBarView.this;
                super();
            }
    };
    private HomeView mExpandedHomeLayout;
    private ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private HomeView mHomeLayout;
    private Drawable mIcon;
    private boolean mIncludeTabs;
    private int mIndeterminateProgressStyle;
    private ProgressBarICS mIndeterminateProgressView;
    private boolean mIsCollapsable;
    private boolean mIsCollapsed;
    private int mItemPadding;
    private LinearLayout mListNavLayout;
    private Drawable mLogo;
    private ActionMenuItem mLogoNavItem;
    private final AdapterViewICS.OnItemSelectedListener mNavItemSelectedListener = new AdapterViewICS.OnItemSelectedListener() {

        final ActionBarView this$0;

        public void onItemSelected(AdapterViewICS adapterviewics, View view, int j, long l)
        {
            if (mCallback != null)
            {
                mCallback.onNavigationItemSelected(j, l);
            }
        }

        public void onNothingSelected(AdapterViewICS adapterviewics)
        {
        }

            
            {
                this$0 = ActionBarView.this;
                super();
            }
    };
    private int mNavigationMode;
    private MenuBuilder mOptionsMenu;
    private int mProgressBarPadding;
    private int mProgressStyle;
    private ProgressBarICS mProgressView;
    private SpinnerICS mSpinner;
    private SpinnerAdapter mSpinnerAdapter;
    private CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private TextView mSubtitleView;
    private ScrollingTabContainerView mTabScrollView;
    private Runnable mTabSelector;
    private CharSequence mTitle;
    private LinearLayout mTitleLayout;
    private int mTitleStyleRes;
    private View mTitleUpView;
    private TextView mTitleView;
    private final android.view.View.OnClickListener mUpClickListener = new android.view.View.OnClickListener() {

        final ActionBarView this$0;

        public void onClick(View view)
        {
            mWindowCallback.onMenuItemSelected(0, mLogoNavItem);
        }

            
            {
                this$0 = ActionBarView.this;
                super();
            }
    };
    private boolean mUserTitle;
    android.view.Window.Callback mWindowCallback;

    public ActionBarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mDisplayOptions = -1;
        mContext = context;
        setBackgroundResource(0);
        attributeset = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0);
        Object obj = context.getApplicationInfo();
        PackageManager packagemanager = context.getPackageManager();
        mNavigationMode = attributeset.getInt(2, 0);
        mTitle = attributeset.getText(1);
        mSubtitle = attributeset.getText(4);
        mLogo = attributeset.getDrawable(8);
        if (mLogo == null && android.os.Build.VERSION.SDK_INT >= 9)
        {
            int i;
            if (context instanceof Activity)
            {
                try
                {
                    mLogo = packagemanager.getActivityLogo(((Activity)context).getComponentName());
                }
                catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
                {
                    Log.e("ActionBarView", "Activity component name not found!", namenotfoundexception);
                }
            }
            if (mLogo == null)
            {
                mLogo = ((ApplicationInfo) (obj)).loadLogo(packagemanager);
            }
        }
        mIcon = attributeset.getDrawable(7);
        if (mIcon == null)
        {
            if (context instanceof Activity)
            {
                try
                {
                    mIcon = packagemanager.getActivityIcon(((Activity)context).getComponentName());
                }
                catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception1)
                {
                    Log.e("ActionBarView", "Activity component name not found!", namenotfoundexception1);
                }
            }
            if (mIcon == null)
            {
                mIcon = ((ApplicationInfo) (obj)).loadIcon(packagemanager);
            }
        }
        obj = LayoutInflater.from(context);
        i = attributeset.getResourceId(14, android.support.v7.appcompat.R.layout.abc_action_bar_home);
        mHomeLayout = (HomeView)((LayoutInflater) (obj)).inflate(i, this, false);
        mExpandedHomeLayout = (HomeView)((LayoutInflater) (obj)).inflate(i, this, false);
        mExpandedHomeLayout.setUp(true);
        mExpandedHomeLayout.setOnClickListener(mExpandedActionViewUpListener);
        mExpandedHomeLayout.setContentDescription(getResources().getText(android.support.v7.appcompat.R.string.abc_action_bar_up_description));
        mTitleStyleRes = attributeset.getResourceId(5, 0);
        mSubtitleStyleRes = attributeset.getResourceId(6, 0);
        mProgressStyle = attributeset.getResourceId(15, 0);
        mIndeterminateProgressStyle = attributeset.getResourceId(16, 0);
        mProgressBarPadding = attributeset.getDimensionPixelOffset(17, 0);
        mItemPadding = attributeset.getDimensionPixelOffset(18, 0);
        setDisplayOptions(attributeset.getInt(3, 0));
        i = attributeset.getResourceId(13, 0);
        if (i != 0)
        {
            mCustomNavView = ((LayoutInflater) (obj)).inflate(i, this, false);
            mNavigationMode = 0;
            setDisplayOptions(mDisplayOptions | 0x10);
        }
        mContentHeight = attributeset.getLayoutDimension(0, 0);
        attributeset.recycle();
        mLogoNavItem = new ActionMenuItem(context, 0, 0x102002c, 0, 0, mTitle);
        mHomeLayout.setOnClickListener(mUpClickListener);
        mHomeLayout.setClickable(true);
        mHomeLayout.setFocusable(true);
    }

    private void configPresenters(MenuBuilder menubuilder)
    {
        if (menubuilder != null)
        {
            menubuilder.addMenuPresenter(mActionMenuPresenter);
            menubuilder.addMenuPresenter(mExpandedMenuPresenter);
        } else
        {
            mActionMenuPresenter.initForMenu(mContext, null);
            mExpandedMenuPresenter.initForMenu(mContext, null);
        }
        mActionMenuPresenter.updateMenuView(true);
        mExpandedMenuPresenter.updateMenuView(true);
    }

    private void initTitle()
    {
        boolean flag2 = true;
        if (mTitleLayout == null)
        {
            mTitleLayout = (LinearLayout)LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_action_bar_title_item, this, false);
            mTitleView = (TextView)mTitleLayout.findViewById(android.support.v7.appcompat.R.id.action_bar_title);
            mSubtitleView = (TextView)mTitleLayout.findViewById(android.support.v7.appcompat.R.id.action_bar_subtitle);
            mTitleUpView = mTitleLayout.findViewById(android.support.v7.appcompat.R.id.up);
            mTitleLayout.setOnClickListener(mUpClickListener);
            if (mTitleStyleRes != 0)
            {
                mTitleView.setTextAppearance(mContext, mTitleStyleRes);
            }
            if (mTitle != null)
            {
                mTitleView.setText(mTitle);
            }
            if (mSubtitleStyleRes != 0)
            {
                mSubtitleView.setTextAppearance(mContext, mSubtitleStyleRes);
            }
            if (mSubtitle != null)
            {
                mSubtitleView.setText(mSubtitle);
                mSubtitleView.setVisibility(0);
            }
            Object obj;
            int i;
            boolean flag;
            boolean flag1;
            if ((mDisplayOptions & 4) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if ((mDisplayOptions & 2) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj = mTitleUpView;
            if (!flag1)
            {
                if (flag)
                {
                    i = 0;
                } else
                {
                    i = 4;
                }
            } else
            {
                i = 8;
            }
            ((View) (obj)).setVisibility(i);
            obj = mTitleLayout;
            if (!flag || flag1)
            {
                flag2 = false;
            }
            ((LinearLayout) (obj)).setEnabled(flag2);
        }
        addView(mTitleLayout);
        if (mExpandedActionView != null || TextUtils.isEmpty(mTitle) && TextUtils.isEmpty(mSubtitle))
        {
            mTitleLayout.setVisibility(8);
        }
    }

    private void setTitleImpl(CharSequence charsequence)
    {
        boolean flag = false;
        mTitle = charsequence;
        if (mTitleView != null)
        {
            mTitleView.setText(charsequence);
            LinearLayout linearlayout;
            int i;
            if (mExpandedActionView == null && (mDisplayOptions & 8) != 0 && (!TextUtils.isEmpty(mTitle) || !TextUtils.isEmpty(mSubtitle)))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            linearlayout = mTitleLayout;
            if (i != 0)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            linearlayout.setVisibility(i);
        }
        if (mLogoNavItem != null)
        {
            mLogoNavItem.setTitle(charsequence);
        }
    }

    public volatile void animateToVisibility(int i)
    {
        super.animateToVisibility(i);
    }

    public void collapseActionView()
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

    public volatile void dismissPopupMenus()
    {
        super.dismissPopupMenus();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.support.v7.app.ActionBar.LayoutParams(19);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new android.support.v7.app.ActionBar.LayoutParams(getContext(), attributeset);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        android.view.ViewGroup.LayoutParams layoutparams1 = layoutparams;
        if (layoutparams == null)
        {
            layoutparams1 = generateDefaultLayoutParams();
        }
        return layoutparams1;
    }

    public volatile int getAnimatedVisibility()
    {
        return super.getAnimatedVisibility();
    }

    public volatile int getContentHeight()
    {
        return super.getContentHeight();
    }

    public View getCustomNavigationView()
    {
        return mCustomNavView;
    }

    public int getDisplayOptions()
    {
        return mDisplayOptions;
    }

    public SpinnerAdapter getDropdownAdapter()
    {
        return mSpinnerAdapter;
    }

    public int getDropdownSelectedPosition()
    {
        return mSpinner.getSelectedItemPosition();
    }

    public int getNavigationMode()
    {
        return mNavigationMode;
    }

    public CharSequence getSubtitle()
    {
        return mSubtitle;
    }

    public CharSequence getTitle()
    {
        return mTitle;
    }

    public boolean hasEmbeddedTabs()
    {
        return mIncludeTabs;
    }

    public boolean hasExpandedActionView()
    {
        return mExpandedMenuPresenter != null && mExpandedMenuPresenter.mCurrentExpandedItem != null;
    }

    public volatile boolean hideOverflowMenu()
    {
        return super.hideOverflowMenu();
    }

    public void initIndeterminateProgress()
    {
        mIndeterminateProgressView = new ProgressBarICS(mContext, null, 0, mIndeterminateProgressStyle);
        mIndeterminateProgressView.setId(android.support.v7.appcompat.R.id.progress_circular);
        mIndeterminateProgressView.setVisibility(8);
        addView(mIndeterminateProgressView);
    }

    public void initProgress()
    {
        mProgressView = new ProgressBarICS(mContext, null, 0, mProgressStyle);
        mProgressView.setId(android.support.v7.appcompat.R.id.progress_horizontal);
        mProgressView.setMax(10000);
        mProgressView.setVisibility(8);
        addView(mProgressView);
    }

    public boolean isCollapsed()
    {
        return mIsCollapsed;
    }

    public volatile boolean isOverflowMenuShowing()
    {
        return super.isOverflowMenuShowing();
    }

    public volatile boolean isOverflowReserved()
    {
        return super.isOverflowReserved();
    }

    public boolean isSplitActionBar()
    {
        return mSplitActionBar;
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        mTitleView = null;
        mSubtitleView = null;
        mTitleUpView = null;
        if (mTitleLayout != null && mTitleLayout.getParent() == this)
        {
            removeView(mTitleLayout);
        }
        mTitleLayout = null;
        if ((mDisplayOptions & 8) != 0)
        {
            initTitle();
        }
        if (mTabScrollView != null && mIncludeTabs)
        {
            configuration = mTabScrollView.getLayoutParams();
            if (configuration != null)
            {
                configuration.width = -2;
                configuration.height = -1;
            }
            mTabScrollView.setAllowCollapse(true);
        }
        if (mProgressView != null)
        {
            removeView(mProgressView);
            initProgress();
        }
        if (mIndeterminateProgressView != null)
        {
            removeView(mIndeterminateProgressView);
            initIndeterminateProgress();
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(mTabSelector);
        if (mActionMenuPresenter != null)
        {
            mActionMenuPresenter.hideOverflowMenu();
            mActionMenuPresenter.hideSubMenus();
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        addView(mHomeLayout);
        if (mCustomNavView != null && (mDisplayOptions & 0x10) != 0)
        {
            android.view.ViewParent viewparent = mCustomNavView.getParent();
            if (viewparent != this)
            {
                if (viewparent instanceof ViewGroup)
                {
                    ((ViewGroup)viewparent).removeView(mCustomNavView);
                }
                addView(mCustomNavView);
            }
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int j1;
        int k1;
        int l1;
        j1 = getPaddingLeft();
        k1 = getPaddingTop();
        l1 = l - j - getPaddingTop() - getPaddingBottom();
        if (l1 > 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        int i1;
        int i2;
        if (mExpandedActionView != null)
        {
            obj = mExpandedHomeLayout;
        } else
        {
            obj = mHomeLayout;
        }
        i1 = j1;
        if (((HomeView) (obj)).getVisibility() != 8)
        {
            j = ((HomeView) (obj)).getLeftOffset();
            i1 = j1 + (positionChild(((View) (obj)), j1 + j, k1, l1) + j);
        }
        j = i1;
        if (mExpandedActionView != null) goto _L4; else goto _L3
_L3:
        if (mTitleLayout != null && mTitleLayout.getVisibility() != 8 && (mDisplayOptions & 8) != 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        l = i1;
        if (j1 != 0)
        {
            l = i1 + positionChild(mTitleLayout, i1, k1, l1);
        }
        j = l;
        mNavigationMode;
        JVM INSTR tableswitch 0 2: default 192
    //                   0 195
    //                   1 638
    //                   2 688;
           goto _L5 _L6 _L7 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L5:
        j = l;
_L4:
        i = k - i - getPaddingRight();
        k = i;
        if (mMenuView != null)
        {
            k = i;
            if (mMenuView.getParent() == this)
            {
                positionChildInverse(mMenuView, i, k1, l1);
                k = i - mMenuView.getMeasuredWidth();
            }
        }
        i = k;
        if (mIndeterminateProgressView != null)
        {
            i = k;
            if (mIndeterminateProgressView.getVisibility() != 8)
            {
                positionChildInverse(mIndeterminateProgressView, k, k1, l1);
                i = k - mIndeterminateProgressView.getMeasuredWidth();
            }
        }
        Object obj1 = null;
        if (mExpandedActionView != null)
        {
            obj = mExpandedActionView;
        } else
        {
            obj = obj1;
            if ((mDisplayOptions & 0x10) != 0)
            {
                obj = obj1;
                if (mCustomNavView != null)
                {
                    obj = mCustomNavView;
                }
            }
        }
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((View) (obj)).getLayoutParams();
        if (obj1 instanceof android.support.v7.app.ActionBar.LayoutParams)
        {
            obj1 = (android.support.v7.app.ActionBar.LayoutParams)obj1;
        } else
        {
            obj1 = null;
        }
        if (obj1 != null)
        {
            l = ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).gravity;
        } else
        {
            l = 19;
        }
        i2 = ((View) (obj)).getMeasuredWidth();
        i1 = 0;
        j1 = 0;
        k1 = i;
        k = j;
        if (obj1 != null)
        {
            k = j + ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).leftMargin;
            k1 = i - ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).rightMargin;
            i1 = ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).topMargin;
            j1 = ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).bottomMargin;
        }
        j = l & 7;
        if (j == 1)
        {
            i = (getWidth() - i2) / 2;
            if (i < k)
            {
                j = 3;
            } else
            if (i + i2 > k1)
            {
                j = 5;
            }
        } else
        if (l == -1)
        {
            j = 3;
        }
        l1 = 0;
        i = l1;
        j;
        JVM INSTR tableswitch 1 5: default 488
    //                   1 810
    //                   2 491
    //                   3 823
    //                   4 491
    //                   5 829;
           goto _L9 _L10 _L11 _L12 _L11 _L13
_L11:
        break; /* Loop/switch isn't completed */
_L9:
        i = l1;
_L19:
        j = l & 0x70;
        if (l == -1)
        {
            j = 16;
        }
        k = 0;
        j;
        JVM INSTR lookupswitch 3: default 544
    //                   16: 838
    //                   48: 866
    //                   80: 877;
           goto _L14 _L15 _L16 _L17
_L17:
        break MISSING_BLOCK_LABEL_877;
_L14:
        j = k;
_L20:
        k = ((View) (obj)).getMeasuredWidth();
        ((View) (obj)).layout(i, j, i + k, ((View) (obj)).getMeasuredHeight() + j);
        if (mProgressView == null) goto _L1; else goto _L18
_L18:
        mProgressView.bringToFront();
        i = mProgressView.getMeasuredHeight() / 2;
        mProgressView.layout(mProgressBarPadding, -i, mProgressBarPadding + mProgressView.getMeasuredWidth(), i);
        return;
_L7:
        j = l;
        if (mListNavLayout != null)
        {
            j = l;
            if (j1 != 0)
            {
                j = l + mItemPadding;
            }
            j += positionChild(mListNavLayout, j, k1, l1) + mItemPadding;
        }
          goto _L4
_L8:
        j = l;
        if (mTabScrollView != null)
        {
            j = l;
            if (j1 != 0)
            {
                j = l + mItemPadding;
            }
            j += positionChild(mTabScrollView, j, k1, l1) + mItemPadding;
        }
          goto _L4
_L10:
        i = (getWidth() - i2) / 2;
          goto _L19
_L12:
        i = k;
          goto _L19
_L13:
        i = k1 - i2;
          goto _L19
_L15:
        j = getPaddingTop();
        j = (getHeight() - getPaddingBottom() - j - ((View) (obj)).getMeasuredHeight()) / 2;
          goto _L20
_L16:
        j = getPaddingTop() + i1;
          goto _L20
        j = getHeight() - getPaddingBottom() - ((View) (obj)).getMeasuredHeight() - j1;
          goto _L20
    }

    protected void onMeasure(int i, int j)
    {
        int l3 = getChildCount();
        if (!mIsCollapsable) goto _L2; else goto _L1
_L1:
        int i1;
        i1 = 0;
        for (int k = 0; k < l3;)
        {
            int j1;
label0:
            {
                View view = getChildAt(k);
                j1 = i1;
                if (view.getVisibility() == 8)
                {
                    break label0;
                }
                if (view == mMenuView)
                {
                    j1 = i1;
                    if (mMenuView.getChildCount() == 0)
                    {
                        break label0;
                    }
                }
                j1 = i1 + 1;
            }
            k++;
            i1 = j1;
        }

        if (i1 != 0) goto _L2; else goto _L3
_L3:
        setMeasuredDimension(0, 0);
        mIsCollapsed = true;
_L10:
        return;
_L2:
        Object obj;
        Object obj1;
        int l;
        boolean flag;
        int l1;
        int j3;
        int i4;
        mIsCollapsed = false;
        if (android.view.View.MeasureSpec.getMode(i) != 0x40000000)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with android:layout_width=\"MATCH_PARENT\" (or fill_parent)").toString());
        }
        if (android.view.View.MeasureSpec.getMode(j) != 0x80000000)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with android:layout_height=\"wrap_content\"").toString());
        }
        i4 = android.view.View.MeasureSpec.getSize(i);
        int k1;
        int j2;
        int j4;
        if (mContentHeight > 0)
        {
            l1 = mContentHeight;
        } else
        {
            l1 = android.view.View.MeasureSpec.getSize(j);
        }
        j4 = getPaddingTop() + getPaddingBottom();
        i = getPaddingLeft();
        j = getPaddingRight();
        j3 = l1 - j4;
        j2 = android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x80000000);
        k1 = i4 - i - j;
        l = k1 / 2;
        i1 = l;
        if (mExpandedActionView != null)
        {
            obj = mExpandedHomeLayout;
        } else
        {
            obj = mHomeLayout;
        }
        j = k1;
        if (((HomeView) (obj)).getVisibility() != 8)
        {
            obj1 = ((HomeView) (obj)).getLayoutParams();
            int i2;
            int l2;
            int k3;
            int k4;
            if (((android.view.ViewGroup.LayoutParams) (obj1)).width < 0)
            {
                i = android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x80000000);
            } else
            {
                i = android.view.View.MeasureSpec.makeMeasureSpec(((android.view.ViewGroup.LayoutParams) (obj1)).width, 0x40000000);
            }
            ((HomeView) (obj)).measure(i, android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x40000000));
            i = ((HomeView) (obj)).getMeasuredWidth() + ((HomeView) (obj)).getLeftOffset();
            j = Math.max(0, k1 - i);
            l = Math.max(0, j - i);
        }
        k1 = j;
        i = i1;
        if (mMenuView != null)
        {
            k1 = j;
            i = i1;
            if (mMenuView.getParent() == this)
            {
                k1 = measureChildView(mMenuView, j, j2, 0);
                i = Math.max(0, i1 - mMenuView.getMeasuredWidth());
            }
        }
        i1 = k1;
        i2 = i;
        if (mIndeterminateProgressView != null)
        {
            i1 = k1;
            i2 = i;
            if (mIndeterminateProgressView.getVisibility() != 8)
            {
                i1 = measureChildView(mIndeterminateProgressView, k1, j2, 0);
                i2 = Math.max(0, i - mIndeterminateProgressView.getMeasuredWidth());
            }
        }
        if (mTitleLayout != null && mTitleLayout.getVisibility() != 8 && (mDisplayOptions & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = i1;
        j = l;
        if (mExpandedActionView != null) goto _L5; else goto _L4
_L4:
        mNavigationMode;
        JVM INSTR tableswitch 1 2: default 564
    //                   1 962
    //                   2 1067;
           goto _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_1067;
_L6:
        j = l;
        i = i1;
_L5:
        obj1 = null;
        if (mExpandedActionView != null)
        {
            obj = mExpandedActionView;
        } else
        {
            obj = obj1;
            if ((mDisplayOptions & 0x10) != 0)
            {
                obj = obj1;
                if (mCustomNavView != null)
                {
                    obj = mCustomNavView;
                }
            }
        }
        l = i;
        if (obj != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = generateLayoutParams(((View) (obj)).getLayoutParams());
            int k2;
            int i3;
            if (layoutparams instanceof android.support.v7.app.ActionBar.LayoutParams)
            {
                obj1 = (android.support.v7.app.ActionBar.LayoutParams)layoutparams;
            } else
            {
                obj1 = null;
            }
            i1 = 0;
            j2 = 0;
            if (obj1 != null)
            {
                i1 = ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).leftMargin + ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).rightMargin;
                j2 = ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).topMargin + ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).bottomMargin;
            }
            if (mContentHeight <= 0)
            {
                l = 0x80000000;
            } else
            if (layoutparams.height != -2)
            {
                l = 0x40000000;
            } else
            {
                l = 0x80000000;
            }
            l2 = j3;
            if (layoutparams.height >= 0)
            {
                l2 = Math.min(layoutparams.height, j3);
            }
            k4 = Math.max(0, l2 - j2);
            if (layoutparams.width != -2)
            {
                k2 = 0x40000000;
            } else
            {
                k2 = 0x80000000;
            }
            if (layoutparams.width >= 0)
            {
                i3 = Math.min(layoutparams.width, i);
            } else
            {
                i3 = i;
            }
            k3 = Math.max(0, i3 - i1);
            if (obj1 != null)
            {
                i3 = ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).gravity;
            } else
            {
                i3 = 19;
            }
            j3 = k3;
            if ((i3 & 7) == 1)
            {
                j3 = k3;
                if (layoutparams.width == -1)
                {
                    j3 = Math.min(j, i2) * 2;
                }
            }
            ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(j3, k2), android.view.View.MeasureSpec.makeMeasureSpec(k4, l));
            l = i - (((View) (obj)).getMeasuredWidth() + i1);
        }
        if (mExpandedActionView == null && flag)
        {
            measureChildView(mTitleLayout, l, android.view.View.MeasureSpec.makeMeasureSpec(mContentHeight, 0x40000000), 0);
            Math.max(0, j - mTitleLayout.getMeasuredWidth());
        }
        if (mContentHeight > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j = 0;
        for (i = 0; i < l3;)
        {
            i1 = getChildAt(i).getMeasuredHeight() + j4;
            l = j;
            if (i1 > j)
            {
                l = i1;
            }
            i++;
            j = l;
        }

        break MISSING_BLOCK_LABEL_1256;
_L7:
        i = i1;
        j = l;
        if (mListNavLayout != null)
        {
            if (flag)
            {
                i = mItemPadding * 2;
            } else
            {
                i = mItemPadding;
            }
            j = Math.max(0, i1 - i);
            l = Math.max(0, l - i);
            mListNavLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x40000000));
            i1 = mListNavLayout.getMeasuredWidth();
            i = Math.max(0, j - i1);
            j = Math.max(0, l - i1);
        }
          goto _L5
        i = i1;
        j = l;
        if (mTabScrollView != null)
        {
            if (flag)
            {
                i = mItemPadding * 2;
            } else
            {
                i = mItemPadding;
            }
            j = Math.max(0, i1 - i);
            l = Math.max(0, l - i);
            mTabScrollView.measure(android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x40000000));
            i1 = mTabScrollView.getMeasuredWidth();
            i = Math.max(0, j - i1);
            j = Math.max(0, l - i1);
        }
          goto _L5
        setMeasuredDimension(i4, j);
_L11:
        if (mContextView != null)
        {
            mContextView.setContentHeight(getMeasuredHeight());
        }
        if (mProgressView != null && mProgressView.getVisibility() != 8)
        {
            mProgressView.measure(android.view.View.MeasureSpec.makeMeasureSpec(i4 - mProgressBarPadding * 2, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x80000000));
            return;
        }
        if (true) goto _L10; else goto _L9
_L9:
        setMeasuredDimension(i4, l1);
          goto _L11
        if (true) goto _L10; else goto _L12
_L12:
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).expandedMenuItemId != 0 && mExpandedMenuPresenter != null && mOptionsMenu != null)
        {
            SupportMenuItem supportmenuitem = (SupportMenuItem)mOptionsMenu.findItem(((SavedState) (parcelable)).expandedMenuItemId);
            if (supportmenuitem != null)
            {
                supportmenuitem.expandActionView();
            }
        }
        if (((SavedState) (parcelable)).isOverflowOpen)
        {
            postShowOverflowMenu();
        }
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

    public volatile void postShowOverflowMenu()
    {
        super.postShowOverflowMenu();
    }

    public void setCallback(android.support.v7.app.ActionBar.OnNavigationListener onnavigationlistener)
    {
        mCallback = onnavigationlistener;
    }

    public void setCollapsable(boolean flag)
    {
        mIsCollapsable = flag;
    }

    public volatile void setContentHeight(int i)
    {
        super.setContentHeight(i);
    }

    public void setContextView(ActionBarContextView actionbarcontextview)
    {
        mContextView = actionbarcontextview;
    }

    public void setCustomNavigationView(View view)
    {
        boolean flag;
        if ((mDisplayOptions & 0x10) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (mCustomNavView != null && flag)
        {
            removeView(mCustomNavView);
        }
        mCustomNavView = view;
        if (mCustomNavView != null && flag)
        {
            addView(mCustomNavView);
        }
    }

    public void setDisplayOptions(int i)
    {
        byte byte0 = 8;
        int k = -1;
        boolean flag3 = true;
        if (mDisplayOptions != -1)
        {
            k = i ^ mDisplayOptions;
        }
        mDisplayOptions = i;
        if ((k & 0x1f) != 0)
        {
            int j;
            boolean flag;
            boolean flag2;
            if ((i & 2) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && mExpandedActionView == null)
            {
                j = 0;
            } else
            {
                j = 8;
            }
            mHomeLayout.setVisibility(j);
            if ((k & 4) != 0)
            {
                HomeView homeview;
                if ((i & 4) != 0)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                mHomeLayout.setUp(flag2);
                if (flag2)
                {
                    setHomeButtonEnabled(true);
                }
            }
            if ((k & 1) != 0)
            {
                Object obj;
                if (mLogo != null && (i & 1) != 0)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                homeview = mHomeLayout;
                if (j != 0)
                {
                    obj = mLogo;
                } else
                {
                    obj = mIcon;
                }
                homeview.setIcon(((Drawable) (obj)));
            }
            if ((k & 8) != 0)
            {
                if ((i & 8) != 0)
                {
                    initTitle();
                } else
                {
                    removeView(mTitleLayout);
                }
            }
            if (mTitleLayout != null && (k & 6) != 0)
            {
                boolean flag1;
                if ((mDisplayOptions & 4) != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                obj = mTitleUpView;
                j = byte0;
                if (!flag)
                {
                    if (flag1)
                    {
                        j = 0;
                    } else
                    {
                        j = 4;
                    }
                }
                ((View) (obj)).setVisibility(j);
                obj = mTitleLayout;
                if (!flag && flag1)
                {
                    flag2 = flag3;
                } else
                {
                    flag2 = false;
                }
                ((LinearLayout) (obj)).setEnabled(flag2);
            }
            if ((k & 0x10) != 0 && mCustomNavView != null)
            {
                if ((i & 0x10) != 0)
                {
                    addView(mCustomNavView);
                } else
                {
                    removeView(mCustomNavView);
                }
            }
            requestLayout();
        } else
        {
            invalidate();
        }
        if (!mHomeLayout.isEnabled())
        {
            mHomeLayout.setContentDescription(null);
            return;
        }
        if ((i & 4) != 0)
        {
            mHomeLayout.setContentDescription(mContext.getResources().getText(android.support.v7.appcompat.R.string.abc_action_bar_up_description));
            return;
        } else
        {
            mHomeLayout.setContentDescription(mContext.getResources().getText(android.support.v7.appcompat.R.string.abc_action_bar_home_description));
            return;
        }
    }

    public void setDropdownAdapter(SpinnerAdapter spinneradapter)
    {
        mSpinnerAdapter = spinneradapter;
        if (mSpinner != null)
        {
            mSpinner.setAdapter(spinneradapter);
        }
    }

    public void setDropdownSelectedPosition(int i)
    {
        mSpinner.setSelection(i);
    }

    public void setEmbeddedTabView(ScrollingTabContainerView scrollingtabcontainerview)
    {
        if (mTabScrollView != null)
        {
            removeView(mTabScrollView);
        }
        mTabScrollView = scrollingtabcontainerview;
        boolean flag;
        if (scrollingtabcontainerview != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIncludeTabs = flag;
        if (mIncludeTabs && mNavigationMode == 2)
        {
            addView(mTabScrollView);
            android.view.ViewGroup.LayoutParams layoutparams = mTabScrollView.getLayoutParams();
            layoutparams.width = -2;
            layoutparams.height = -1;
            scrollingtabcontainerview.setAllowCollapse(true);
        }
    }

    public void setHomeAsUpIndicator(int i)
    {
        mHomeLayout.setUpIndicator(i);
    }

    public void setHomeAsUpIndicator(Drawable drawable)
    {
        mHomeLayout.setUpIndicator(drawable);
    }

    public void setHomeButtonEnabled(boolean flag)
    {
        mHomeLayout.setEnabled(flag);
        mHomeLayout.setFocusable(flag);
        if (!flag)
        {
            mHomeLayout.setContentDescription(null);
            return;
        }
        if ((mDisplayOptions & 4) != 0)
        {
            mHomeLayout.setContentDescription(mContext.getResources().getText(android.support.v7.appcompat.R.string.abc_action_bar_up_description));
            return;
        } else
        {
            mHomeLayout.setContentDescription(mContext.getResources().getText(android.support.v7.appcompat.R.string.abc_action_bar_home_description));
            return;
        }
    }

    public void setIcon(int i)
    {
        setIcon(mContext.getResources().getDrawable(i));
    }

    public void setIcon(Drawable drawable)
    {
        mIcon = drawable;
        if (drawable != null && ((mDisplayOptions & 1) == 0 || mLogo == null))
        {
            mHomeLayout.setIcon(drawable);
        }
        if (mExpandedActionView != null)
        {
            mExpandedHomeLayout.setIcon(mIcon.getConstantState().newDrawable(getResources()));
        }
    }

    public void setLogo(int i)
    {
        setLogo(mContext.getResources().getDrawable(i));
    }

    public void setLogo(Drawable drawable)
    {
        mLogo = drawable;
        if (drawable != null && (mDisplayOptions & 1) != 0)
        {
            mHomeLayout.setIcon(drawable);
        }
    }

    public void setMenu(SupportMenu supportmenu, android.support.v7.internal.view.menu.MenuPresenter.Callback callback)
    {
        if (supportmenu == mOptionsMenu)
        {
            return;
        }
        if (mOptionsMenu != null)
        {
            mOptionsMenu.removeMenuPresenter(mActionMenuPresenter);
            mOptionsMenu.removeMenuPresenter(mExpandedMenuPresenter);
        }
        Object obj = (MenuBuilder)supportmenu;
        mOptionsMenu = ((MenuBuilder) (obj));
        if (mMenuView != null)
        {
            supportmenu = (ViewGroup)mMenuView.getParent();
            if (supportmenu != null)
            {
                supportmenu.removeView(mMenuView);
            }
        }
        if (mActionMenuPresenter == null)
        {
            mActionMenuPresenter = new ActionMenuPresenter(mContext);
            mActionMenuPresenter.setCallback(callback);
            mActionMenuPresenter.setId(android.support.v7.appcompat.R.id.action_menu_presenter);
            mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
        }
        callback = new android.view.ViewGroup.LayoutParams(-2, -1);
        if (!mSplitActionBar)
        {
            mActionMenuPresenter.setExpandedActionViewsExclusive(getResources().getBoolean(android.support.v7.appcompat.R.bool.abc_action_bar_expanded_action_views_exclusive));
            configPresenters(((MenuBuilder) (obj)));
            supportmenu = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
            supportmenu.initialize(((MenuBuilder) (obj)));
            obj = (ViewGroup)supportmenu.getParent();
            if (obj != null && obj != this)
            {
                ((ViewGroup) (obj)).removeView(supportmenu);
            }
            addView(supportmenu, callback);
        } else
        {
            mActionMenuPresenter.setExpandedActionViewsExclusive(false);
            mActionMenuPresenter.setWidthLimit(getContext().getResources().getDisplayMetrics().widthPixels, true);
            mActionMenuPresenter.setItemLimit(0x7fffffff);
            callback.width = -1;
            configPresenters(((MenuBuilder) (obj)));
            supportmenu = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
            if (mSplitView != null)
            {
                ViewGroup viewgroup = (ViewGroup)supportmenu.getParent();
                if (viewgroup != null && viewgroup != mSplitView)
                {
                    viewgroup.removeView(supportmenu);
                }
                supportmenu.setVisibility(getAnimatedVisibility());
                mSplitView.addView(supportmenu, callback);
            } else
            {
                supportmenu.setLayoutParams(callback);
            }
        }
        mMenuView = supportmenu;
    }

    public void setNavigationMode(int i)
    {
        int j = mNavigationMode;
        if (i == j) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 66
    //                   2 84;
           goto _L3 _L4 _L5
_L3:
        i;
        JVM INSTR tableswitch 1 2: default 56
    //                   1 109
    //                   2 232;
           goto _L6 _L7 _L8
_L6:
        mNavigationMode = i;
        requestLayout();
_L2:
        return;
_L4:
        if (mListNavLayout != null)
        {
            removeView(mListNavLayout);
        }
          goto _L3
_L5:
        if (mTabScrollView != null && mIncludeTabs)
        {
            removeView(mTabScrollView);
        }
          goto _L3
_L7:
        if (mSpinner == null)
        {
            mSpinner = new SpinnerICS(mContext, null, android.support.v7.appcompat.R.attr.actionDropDownStyle);
            mListNavLayout = (LinearLayout)LayoutInflater.from(mContext).inflate(android.support.v7.appcompat.R.layout.abc_action_bar_view_list_nav_layout, null);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -1);
            layoutparams.gravity = 17;
            mListNavLayout.addView(mSpinner, layoutparams);
        }
        if (mSpinner.getAdapter() != mSpinnerAdapter)
        {
            mSpinner.setAdapter(mSpinnerAdapter);
        }
        mSpinner.setOnItemSelectedListener(mNavItemSelectedListener);
        addView(mListNavLayout);
          goto _L6
_L8:
        if (mTabScrollView != null && mIncludeTabs)
        {
            addView(mTabScrollView);
        }
          goto _L6
    }

    public void setSplitActionBar(boolean flag)
    {
        if (mSplitActionBar != flag)
        {
            if (mMenuView != null)
            {
                Object obj = (ViewGroup)mMenuView.getParent();
                if (obj != null)
                {
                    ((ViewGroup) (obj)).removeView(mMenuView);
                }
                if (flag)
                {
                    if (mSplitView != null)
                    {
                        mSplitView.addView(mMenuView);
                    }
                    mMenuView.getLayoutParams().width = -1;
                } else
                {
                    addView(mMenuView);
                    mMenuView.getLayoutParams().width = -2;
                }
                mMenuView.requestLayout();
            }
            if (mSplitView != null)
            {
                obj = mSplitView;
                int i;
                if (flag)
                {
                    i = 0;
                } else
                {
                    i = 8;
                }
                ((ActionBarContainer) (obj)).setVisibility(i);
            }
            if (mActionMenuPresenter != null)
            {
                if (!flag)
                {
                    mActionMenuPresenter.setExpandedActionViewsExclusive(getResources().getBoolean(android.support.v7.appcompat.R.bool.abc_action_bar_expanded_action_views_exclusive));
                } else
                {
                    mActionMenuPresenter.setExpandedActionViewsExclusive(false);
                    mActionMenuPresenter.setWidthLimit(getContext().getResources().getDisplayMetrics().widthPixels, true);
                    mActionMenuPresenter.setItemLimit(0x7fffffff);
                }
            }
            super.setSplitActionBar(flag);
        }
    }

    public volatile void setSplitView(ActionBarContainer actionbarcontainer)
    {
        super.setSplitView(actionbarcontainer);
    }

    public volatile void setSplitWhenNarrow(boolean flag)
    {
        super.setSplitWhenNarrow(flag);
    }

    public void setSubtitle(CharSequence charsequence)
    {
        boolean flag = false;
        mSubtitle = charsequence;
        if (mSubtitleView != null)
        {
            mSubtitleView.setText(charsequence);
            TextView textview = mSubtitleView;
            int i;
            if (charsequence != null)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            textview.setVisibility(i);
            if (mExpandedActionView == null && (mDisplayOptions & 8) != 0 && (!TextUtils.isEmpty(mTitle) || !TextUtils.isEmpty(mSubtitle)))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            charsequence = mTitleLayout;
            if (i != 0)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            charsequence.setVisibility(i);
        }
    }

    public void setTitle(CharSequence charsequence)
    {
        mUserTitle = true;
        setTitleImpl(charsequence);
    }

    public volatile void setVisibility(int i)
    {
        super.setVisibility(i);
    }

    public void setWindowCallback(android.view.Window.Callback callback)
    {
        mWindowCallback = callback;
    }

    public void setWindowTitle(CharSequence charsequence)
    {
        if (!mUserTitle)
        {
            setTitleImpl(charsequence);
        }
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }

    public volatile boolean showOverflowMenu()
    {
        return super.showOverflowMenu();
    }













}
