// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

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
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.actionbarsherlock.internal.ResourcesCompat;
import com.actionbarsherlock.internal.view.menu.ActionMenuItem;
import com.actionbarsherlock.internal.view.menu.ActionMenuPresenter;
import com.actionbarsherlock.internal.view.menu.ActionMenuView;
import com.actionbarsherlock.internal.view.menu.MenuBuilder;
import com.actionbarsherlock.internal.view.menu.MenuItemImpl;
import com.actionbarsherlock.internal.view.menu.MenuPresenter;
import com.actionbarsherlock.internal.view.menu.MenuView;
import com.actionbarsherlock.internal.view.menu.SubMenuBuilder;
import com.actionbarsherlock.view.CollapsibleActionView;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import java.util.List;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            AbsActionBarView, IcsSpinner, IcsProgressBar, ScrollingTabContainerView, 
//            ActionBarContextView, IcsLinearLayout, ActionBarContainer, IcsAdapterView

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
            mExpandedHomeLayout.setIcon(mIcon.getConstantState().newDrawable());
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

        public void setCallback(com.actionbarsherlock.internal.view.menu.MenuPresenter.Callback callback)
        {
        }

        public void updateMenuView(boolean flag)
        {
            if (mCurrentExpandedItem == null) goto _L2; else goto _L1
_L1:
            int i;
            boolean flag1;
            flag1 = false;
            i = ((flag1) ? 1 : 0);
            if (mMenu == null) goto _L4; else goto _L3
_L3:
            int j;
            j = mMenu.size();
            i = 0;
_L9:
            if (i < j) goto _L6; else goto _L5
_L5:
            i = ((flag1) ? 1 : 0);
_L4:
            if (i == 0)
            {
                collapseItemActionView(mMenu, mCurrentExpandedItem);
            }
_L2:
            return;
_L6:
            if (mMenu.getItem(i) != mCurrentExpandedItem)
            {
                break; /* Loop/switch isn't completed */
            }
            i = 1;
            if (true) goto _L4; else goto _L7
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

        ExpandedActionViewMenuPresenter(ExpandedActionViewMenuPresenter expandedactionviewmenupresenter)
        {
            this();
        }
    }

    public static class HomeView extends FrameLayout
    {

        private ImageView mIconView;
        private View mUpView;
        private int mUpWidth;

        public boolean dispatchHoverEvent(MotionEvent motionevent)
        {
            return onHoverEvent(motionevent);
        }

        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            onPopulateAccessibilityEvent(accessibilityevent);
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

        protected void onFinishInflate()
        {
            mUpView = findViewById(com.actionbarsherlock.R.id.abs__up);
            mIconView = (ImageView)findViewById(com.actionbarsherlock.R.id.abs__home);
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

        public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                super.onPopulateAccessibilityEvent(accessibilityevent);
            }
            CharSequence charsequence = getContentDescription();
            if (!TextUtils.isEmpty(charsequence))
            {
                accessibilityevent.getText().add(charsequence);
            }
        }

        public void setIcon(Drawable drawable)
        {
            mIconView.setImageDrawable(drawable);
        }

        public void setUp(boolean flag)
        {
            View view = mUpView;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
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
                return new SavedState(parcel, null);
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

        SavedState(Parcel parcel, SavedState savedstate)
        {
            this(parcel);
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
    private com.actionbarsherlock.app.ActionBar.OnNavigationListener mCallback;
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
    private IcsProgressBar mIndeterminateProgressView;
    private boolean mIsCollapsable;
    private boolean mIsCollapsed;
    private int mItemPadding;
    private IcsLinearLayout mListNavLayout;
    private Drawable mLogo;
    private ActionMenuItem mLogoNavItem;
    private final IcsAdapterView.OnItemSelectedListener mNavItemSelectedListener = new IcsAdapterView.OnItemSelectedListener() {

        final ActionBarView this$0;

        public void onItemSelected(IcsAdapterView icsadapterview, View view, int k, long l)
        {
            if (mCallback != null)
            {
                mCallback.onNavigationItemSelected(k, l);
            }
        }

        public void onNothingSelected(IcsAdapterView icsadapterview)
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
    private IcsProgressBar mProgressView;
    private IcsSpinner mSpinner;
    private SpinnerAdapter mSpinnerAdapter;
    private CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private TextView mSubtitleView;
    private ScrollingTabContainerView mTabScrollView;
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
    com.actionbarsherlock.view.Window.Callback mWindowCallback;

    public ActionBarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mDisplayOptions = -1;
        setBackgroundResource(0);
        attributeset = context.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockActionBar, com.actionbarsherlock.R.attr.actionBarStyle, 0);
        Object obj = context.getApplicationInfo();
        PackageManager packagemanager = context.getPackageManager();
        mNavigationMode = attributeset.getInt(com.actionbarsherlock.R.styleable.SherlockActionBar_navigationMode, 0);
        mTitle = attributeset.getText(com.actionbarsherlock.R.styleable.SherlockActionBar_title);
        mSubtitle = attributeset.getText(com.actionbarsherlock.R.styleable.SherlockActionBar_subtitle);
        mLogo = attributeset.getDrawable(com.actionbarsherlock.R.styleable.SherlockActionBar_logo);
        if (mLogo == null)
        {
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                if (context instanceof Activity)
                {
                    int i = ResourcesCompat.loadLogoFromManifest((Activity)context);
                    if (i != 0)
                    {
                        mLogo = context.getResources().getDrawable(i);
                    }
                }
            } else
            {
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
        }
        mIcon = attributeset.getDrawable(com.actionbarsherlock.R.styleable.SherlockActionBar_icon);
        if (mIcon == null)
        {
            int j;
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
        j = attributeset.getResourceId(com.actionbarsherlock.R.styleable.SherlockActionBar_homeLayout, com.actionbarsherlock.R.layout.abs__action_bar_home);
        mHomeLayout = (HomeView)((LayoutInflater) (obj)).inflate(j, this, false);
        mExpandedHomeLayout = (HomeView)((LayoutInflater) (obj)).inflate(j, this, false);
        mExpandedHomeLayout.setUp(true);
        mExpandedHomeLayout.setOnClickListener(mExpandedActionViewUpListener);
        mExpandedHomeLayout.setContentDescription(getResources().getText(com.actionbarsherlock.R.string.abs__action_bar_up_description));
        mTitleStyleRes = attributeset.getResourceId(com.actionbarsherlock.R.styleable.SherlockActionBar_titleTextStyle, 0);
        mSubtitleStyleRes = attributeset.getResourceId(com.actionbarsherlock.R.styleable.SherlockActionBar_subtitleTextStyle, 0);
        mProgressStyle = attributeset.getResourceId(com.actionbarsherlock.R.styleable.SherlockActionBar_progressBarStyle, 0);
        mIndeterminateProgressStyle = attributeset.getResourceId(com.actionbarsherlock.R.styleable.SherlockActionBar_indeterminateProgressStyle, 0);
        mProgressBarPadding = attributeset.getDimensionPixelOffset(com.actionbarsherlock.R.styleable.SherlockActionBar_progressBarPadding, 0);
        mItemPadding = attributeset.getDimensionPixelOffset(com.actionbarsherlock.R.styleable.SherlockActionBar_itemPadding, 0);
        setDisplayOptions(attributeset.getInt(com.actionbarsherlock.R.styleable.SherlockActionBar_displayOptions, 0));
        j = attributeset.getResourceId(com.actionbarsherlock.R.styleable.SherlockActionBar_customNavigationLayout, 0);
        if (j != 0)
        {
            mCustomNavView = ((LayoutInflater) (obj)).inflate(j, this, false);
            mNavigationMode = 0;
            setDisplayOptions(mDisplayOptions | 0x10);
        }
        mContentHeight = attributeset.getLayoutDimension(com.actionbarsherlock.R.styleable.SherlockActionBar_height, 0);
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
            return;
        } else
        {
            mActionMenuPresenter.initForMenu(mContext, null);
            mExpandedMenuPresenter.initForMenu(mContext, null);
            mActionMenuPresenter.updateMenuView(true);
            mExpandedMenuPresenter.updateMenuView(true);
            return;
        }
    }

    private void initTitle()
    {
        boolean flag2 = true;
        if (mTitleLayout == null)
        {
            mTitleLayout = (LinearLayout)LayoutInflater.from(getContext()).inflate(com.actionbarsherlock.R.layout.abs__action_bar_title_item, this, false);
            mTitleView = (TextView)mTitleLayout.findViewById(com.actionbarsherlock.R.id.abs__action_bar_title);
            mSubtitleView = (TextView)mTitleLayout.findViewById(com.actionbarsherlock.R.id.abs__action_bar_subtitle);
            mTitleUpView = mTitleLayout.findViewById(com.actionbarsherlock.R.id.abs__up);
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

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new com.actionbarsherlock.app.ActionBar.LayoutParams(19);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new com.actionbarsherlock.app.ActionBar.LayoutParams(getContext(), attributeset);
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

    public void initIndeterminateProgress()
    {
        mIndeterminateProgressView = new IcsProgressBar(mContext, null, 0, mIndeterminateProgressStyle);
        mIndeterminateProgressView.setId(com.actionbarsherlock.R.id.abs__progress_circular);
        addView(mIndeterminateProgressView);
    }

    public void initProgress()
    {
        mProgressView = new IcsProgressBar(mContext, null, 0, mProgressStyle);
        mProgressView.setId(com.actionbarsherlock.R.id.abs__progress_horizontal);
        mProgressView.setMax(10000);
        addView(mProgressView);
    }

    public boolean isCollapsed()
    {
        return mIsCollapsed;
    }

    public boolean isSplitActionBar()
    {
        return mSplitActionBar;
    }

    public void onConfigurationChanged(Configuration configuration)
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
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
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
    //                   1 642
    //                   2 692;
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
        if (obj1 instanceof com.actionbarsherlock.app.ActionBar.LayoutParams)
        {
            obj1 = (com.actionbarsherlock.app.ActionBar.LayoutParams)obj1;
        } else
        {
            obj1 = null;
        }
        if (obj1 != null)
        {
            l = ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).gravity;
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
            k = j + ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).leftMargin;
            k1 = i - ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).rightMargin;
            i1 = ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).topMargin;
            j1 = ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).bottomMargin;
        }
        j = l & 7;
        if (j == 1)
        {
            i = (getRight() - getLeft() - i2) / 2;
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
        JVM INSTR tableswitch 1 5: default 492
    //                   1 814
    //                   2 495
    //                   3 832
    //                   4 495
    //                   5 838;
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
        JVM INSTR lookupswitch 3: default 548
    //                   16: 847
    //                   48: 880
    //                   80: 891;
           goto _L14 _L15 _L16 _L17
_L17:
        break MISSING_BLOCK_LABEL_891;
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
        i = (getRight() - getLeft() - i2) / 2;
          goto _L19
_L12:
        i = k;
          goto _L19
_L13:
        i = k1 - i2;
          goto _L19
_L15:
        j = getPaddingTop();
        j = (getBottom() - getTop() - getPaddingBottom() - j - ((View) (obj)).getMeasuredHeight()) / 2;
          goto _L20
_L16:
        j = getPaddingTop() + i1;
          goto _L20
        j = getHeight() - getPaddingBottom() - ((View) (obj)).getMeasuredHeight() - j1;
          goto _L20
    }

    protected void onMeasure(int i, int j)
    {
        int i4 = getChildCount();
        if (!mIsCollapsable) goto _L2; else goto _L1
_L1:
        int k;
        int i1;
        i1 = 0;
        k = 0;
_L6:
        if (k < i4) goto _L4; else goto _L3
_L3:
        if (i1 != 0) goto _L2; else goto _L5
_L5:
        setMeasuredDimension(0, 0);
        mIsCollapsed = true;
_L14:
        return;
_L4:
        int k1;
label0:
        {
            View view = getChildAt(k);
            k1 = i1;
            if (view.getVisibility() == 8)
            {
                break label0;
            }
            if (view == mMenuView)
            {
                k1 = i1;
                if (mMenuView.getChildCount() == 0)
                {
                    break label0;
                }
            }
            k1 = i1 + 1;
        }
        k++;
        i1 = k1;
          goto _L6
_L2:
        Object obj;
        Object obj1;
        boolean flag;
        int i2;
        int k3;
        int j4;
        int k4;
        mIsCollapsed = false;
        if (android.view.View.MeasureSpec.getMode(i) != 0x40000000)
        {
            throw new IllegalStateException((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(" can only be used ").append("with android:layout_width=\"match_parent\" (or fill_parent)").toString());
        }
        if (android.view.View.MeasureSpec.getMode(j) != 0x80000000)
        {
            throw new IllegalStateException((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(" can only be used ").append("with android:layout_height=\"wrap_content\"").toString());
        }
        j4 = android.view.View.MeasureSpec.getSize(i);
        int l1;
        int k2;
        if (mContentHeight > 0)
        {
            i2 = mContentHeight;
        } else
        {
            i2 = android.view.View.MeasureSpec.getSize(j);
        }
        k4 = getPaddingTop() + getPaddingBottom();
        i = getPaddingLeft();
        j = getPaddingRight();
        k3 = i2 - k4;
        k2 = android.view.View.MeasureSpec.makeMeasureSpec(k3, 0x80000000);
        l1 = j4 - i - j;
        k = l1 / 2;
        i1 = k;
        if (mExpandedActionView != null)
        {
            obj = mExpandedHomeLayout;
        } else
        {
            obj = mHomeLayout;
        }
        j = l1;
        if (((HomeView) (obj)).getVisibility() != 8)
        {
            obj1 = ((HomeView) (obj)).getLayoutParams();
            int j2;
            int i3;
            int l3;
            int l4;
            if (((android.view.ViewGroup.LayoutParams) (obj1)).width < 0)
            {
                i = android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x80000000);
            } else
            {
                i = android.view.View.MeasureSpec.makeMeasureSpec(((android.view.ViewGroup.LayoutParams) (obj1)).width, 0x40000000);
            }
            ((HomeView) (obj)).measure(i, android.view.View.MeasureSpec.makeMeasureSpec(k3, 0x40000000));
            i = ((HomeView) (obj)).getMeasuredWidth() + ((HomeView) (obj)).getLeftOffset();
            j = Math.max(0, l1 - i);
            k = Math.max(0, j - i);
        }
        l1 = j;
        i = i1;
        if (mMenuView != null)
        {
            l1 = j;
            i = i1;
            if (mMenuView.getParent() == this)
            {
                l1 = measureChildView(mMenuView, j, k2, 0);
                i = Math.max(0, i1 - mMenuView.getMeasuredWidth());
            }
        }
        i1 = l1;
        j2 = i;
        if (mIndeterminateProgressView != null)
        {
            i1 = l1;
            j2 = i;
            if (mIndeterminateProgressView.getVisibility() != 8)
            {
                i1 = measureChildView(mIndeterminateProgressView, l1, k2, 0);
                j2 = Math.max(0, i - mIndeterminateProgressView.getMeasuredWidth());
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
        j = k;
        if (mExpandedActionView != null) goto _L8; else goto _L7
_L7:
        mNavigationMode;
        JVM INSTR tableswitch 1 2: default 564
    //                   1 1003
    //                   2 1108;
           goto _L9 _L10 _L11
_L9:
        j = k;
        i = i1;
_L8:
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
        k = i;
        if (obj != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = generateLayoutParams(((View) (obj)).getLayoutParams());
            int l2;
            int j3;
            if (layoutparams instanceof com.actionbarsherlock.app.ActionBar.LayoutParams)
            {
                obj1 = (com.actionbarsherlock.app.ActionBar.LayoutParams)layoutparams;
            } else
            {
                obj1 = null;
            }
            i1 = 0;
            k2 = 0;
            if (obj1 != null)
            {
                i1 = ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).leftMargin + ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).rightMargin;
                k2 = ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).topMargin + ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).bottomMargin;
            }
            if (mContentHeight <= 0)
            {
                k = 0x80000000;
            } else
            if (layoutparams.height != -2)
            {
                k = 0x40000000;
            } else
            {
                k = 0x80000000;
            }
            i3 = k3;
            if (layoutparams.height >= 0)
            {
                i3 = Math.min(layoutparams.height, k3);
            }
            l4 = Math.max(0, i3 - k2);
            if (layoutparams.width != -2)
            {
                l2 = 0x40000000;
            } else
            {
                l2 = 0x80000000;
            }
            if (layoutparams.width >= 0)
            {
                j3 = Math.min(layoutparams.width, i);
            } else
            {
                j3 = i;
            }
            l3 = Math.max(0, j3 - i1);
            if (obj1 != null)
            {
                j3 = ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).gravity;
            } else
            {
                j3 = 19;
            }
            k3 = l3;
            if ((j3 & 7) == 1)
            {
                k3 = l3;
                if (layoutparams.width == -1)
                {
                    k3 = Math.min(j, j2) * 2;
                }
            }
            ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(k3, l2), android.view.View.MeasureSpec.makeMeasureSpec(l4, k));
            k = i - (((View) (obj)).getMeasuredWidth() + i1);
        }
        if (mExpandedActionView == null && flag)
        {
            measureChildView(mTitleLayout, k, android.view.View.MeasureSpec.makeMeasureSpec(mContentHeight, 0x40000000), 0);
            Math.max(0, j - mTitleLayout.getMeasuredWidth());
        }
        if (mContentHeight > 0)
        {
            break MISSING_BLOCK_LABEL_1333;
        }
        j = 0;
        i = 0;
_L15:
        if (i < i4) goto _L13; else goto _L12
_L12:
        setMeasuredDimension(j4, j);
_L16:
        if (mContextView != null)
        {
            mContextView.setContentHeight(getMeasuredHeight());
        }
        if (mProgressView != null && mProgressView.getVisibility() != 8)
        {
            mProgressView.measure(android.view.View.MeasureSpec.makeMeasureSpec(j4 - mProgressBarPadding * 2, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x80000000));
            return;
        }
          goto _L14
_L10:
        i = i1;
        j = k;
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
            k = Math.max(0, k - i);
            mListNavLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(k3, 0x40000000));
            i1 = mListNavLayout.getMeasuredWidth();
            i = Math.max(0, j - i1);
            j = Math.max(0, k - i1);
        }
          goto _L8
_L11:
        i = i1;
        j = k;
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
            k = Math.max(0, k - i);
            mTabScrollView.measure(android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(k3, 0x40000000));
            i1 = mTabScrollView.getMeasuredWidth();
            i = Math.max(0, j - i1);
            j = Math.max(0, k - i1);
        }
          goto _L8
_L13:
        int j1 = getChildAt(i).getMeasuredHeight() + k4;
        int l = j;
        if (j1 > j)
        {
            l = j1;
        }
        i++;
        j = l;
          goto _L15
        setMeasuredDimension(j4, i2);
          goto _L16
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).expandedMenuItemId != 0 && mExpandedMenuPresenter != null && mOptionsMenu != null)
        {
            MenuItem menuitem = mOptionsMenu.findItem(((SavedState) (parcelable)).expandedMenuItemId);
            if (menuitem != null)
            {
                menuitem.expandActionView();
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

    public void setCallback(com.actionbarsherlock.app.ActionBar.OnNavigationListener onnavigationlistener)
    {
        mCallback = onnavigationlistener;
    }

    public void setCollapsable(boolean flag)
    {
        mIsCollapsable = flag;
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
            mHomeLayout.setContentDescription(mContext.getResources().getText(com.actionbarsherlock.R.string.abs__action_bar_up_description));
            return;
        } else
        {
            mHomeLayout.setContentDescription(mContext.getResources().getText(com.actionbarsherlock.R.string.abs__action_bar_home_description));
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
            mHomeLayout.setContentDescription(mContext.getResources().getText(com.actionbarsherlock.R.string.abs__action_bar_up_description));
            return;
        } else
        {
            mHomeLayout.setContentDescription(mContext.getResources().getText(com.actionbarsherlock.R.string.abs__action_bar_home_description));
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

    public void setMenu(Menu menu, com.actionbarsherlock.internal.view.menu.MenuPresenter.Callback callback)
    {
        if (menu == mOptionsMenu)
        {
            return;
        }
        if (mOptionsMenu != null)
        {
            mOptionsMenu.removeMenuPresenter(mActionMenuPresenter);
            mOptionsMenu.removeMenuPresenter(mExpandedMenuPresenter);
        }
        menu = (MenuBuilder)menu;
        mOptionsMenu = menu;
        if (mMenuView != null)
        {
            ViewGroup viewgroup = (ViewGroup)mMenuView.getParent();
            if (viewgroup != null)
            {
                viewgroup.removeView(mMenuView);
            }
        }
        if (mActionMenuPresenter == null)
        {
            mActionMenuPresenter = new ActionMenuPresenter(mContext);
            mActionMenuPresenter.setCallback(callback);
            mActionMenuPresenter.setId(com.actionbarsherlock.R.id.abs__action_menu_presenter);
            mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter(null);
        }
        callback = new android.view.ViewGroup.LayoutParams(-2, -1);
        if (!mSplitActionBar)
        {
            mActionMenuPresenter.setExpandedActionViewsExclusive(ResourcesCompat.getResources_getBoolean(getContext(), com.actionbarsherlock.R.bool.abs__action_bar_expanded_action_views_exclusive));
            configPresenters(menu);
            menu = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
            ViewGroup viewgroup1 = (ViewGroup)menu.getParent();
            if (viewgroup1 != null && viewgroup1 != this)
            {
                viewgroup1.removeView(menu);
            }
            addView(menu, callback);
        } else
        {
            mActionMenuPresenter.setExpandedActionViewsExclusive(false);
            mActionMenuPresenter.setWidthLimit(getContext().getResources().getDisplayMetrics().widthPixels, true);
            mActionMenuPresenter.setItemLimit(0x7fffffff);
            callback.width = -1;
            configPresenters(menu);
            menu = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
            if (mSplitView != null)
            {
                ViewGroup viewgroup2 = (ViewGroup)menu.getParent();
                if (viewgroup2 != null && viewgroup2 != mSplitView)
                {
                    viewgroup2.removeView(menu);
                }
                menu.setVisibility(getAnimatedVisibility());
                mSplitView.addView(menu, callback);
            } else
            {
                menu.setLayoutParams(callback);
            }
        }
        mMenuView = menu;
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
            mSpinner = new IcsSpinner(mContext, null, com.actionbarsherlock.R.attr.actionDropDownStyle);
            mListNavLayout = (IcsLinearLayout)LayoutInflater.from(mContext).inflate(com.actionbarsherlock.R.layout.abs__action_bar_tab_bar_view, null);
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
                } else
                {
                    addView(mMenuView);
                }
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
            super.setSplitActionBar(flag);
        }
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

    public void setWindowCallback(com.actionbarsherlock.view.Window.Callback callback)
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













}
