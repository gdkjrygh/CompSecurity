// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.internal.app.WindowCallback;
import android.support.v7.internal.view.menu.ActionMenuItem;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            DecorToolbar, TintTypedArray, TintManager, ScrollingTabContainerView

public final class ToolbarWidgetWrapper
    implements DecorToolbar
{

    private ActionMenuPresenter mActionMenuPresenter;
    private View mCustomView;
    private int mDefaultNavigationContentDescription;
    private Drawable mDefaultNavigationIcon;
    private int mDisplayOpts;
    private CharSequence mHomeDescription;
    private Drawable mIcon;
    private Drawable mLogo;
    private boolean mMenuPrepared;
    private Drawable mNavIcon;
    private int mNavigationMode;
    private CharSequence mSubtitle;
    private View mTabView;
    private final TintManager mTintManager;
    private CharSequence mTitle;
    private boolean mTitleSet;
    private Toolbar mToolbar;
    private WindowCallback mWindowCallback;

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean flag)
    {
        this(toolbar, flag, android.support.v7.appcompat.R.string.abc_action_bar_up_description, android.support.v7.appcompat.R.drawable.abc_ic_ab_back_mtrl_am_alpha);
    }

    private ToolbarWidgetWrapper(Toolbar toolbar, boolean flag, int i, int j)
    {
        mNavigationMode = 0;
        mDefaultNavigationContentDescription = 0;
        mToolbar = toolbar;
        mTitle = toolbar.getTitle();
        mSubtitle = toolbar.getSubtitle();
        boolean flag1;
        if (mTitle != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mTitleSet = flag1;
        if (flag)
        {
            toolbar = TintTypedArray.obtainStyledAttributes(toolbar.getContext(), null, android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0);
            Object obj = toolbar.getText(android.support.v7.appcompat.R.styleable.ActionBar_title);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                setTitle(((CharSequence) (obj)));
            }
            obj = toolbar.getText(android.support.v7.appcompat.R.styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                setSubtitle(((CharSequence) (obj)));
            }
            obj = toolbar.getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_logo);
            if (obj != null)
            {
                setLogo(((Drawable) (obj)));
            }
            obj = toolbar.getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_icon);
            if (obj != null)
            {
                setIcon(((Drawable) (obj)));
            }
            obj = toolbar.getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_homeAsUpIndicator);
            if (obj != null)
            {
                setNavigationIcon(((Drawable) (obj)));
            }
            setDisplayOptions(toolbar.getInt(android.support.v7.appcompat.R.styleable.ActionBar_displayOptions, 0));
            int k = toolbar.getResourceId(android.support.v7.appcompat.R.styleable.ActionBar_customNavigationLayout, 0);
            if (k != 0)
            {
                setCustomView(LayoutInflater.from(mToolbar.getContext()).inflate(k, mToolbar, false));
                setDisplayOptions(mDisplayOpts | 0x10);
            }
            k = toolbar.getLayoutDimension(android.support.v7.appcompat.R.styleable.ActionBar_height, 0);
            if (k > 0)
            {
                android.view.ViewGroup.LayoutParams layoutparams = mToolbar.getLayoutParams();
                layoutparams.height = k;
                mToolbar.setLayoutParams(layoutparams);
            }
            k = toolbar.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.ActionBar_contentInsetStart, -1);
            int l = toolbar.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.ActionBar_contentInsetEnd, -1);
            if (k >= 0 || l >= 0)
            {
                mToolbar.setContentInsetsRelative(Math.max(k, 0), Math.max(l, 0));
            }
            k = toolbar.getResourceId(android.support.v7.appcompat.R.styleable.ActionBar_titleTextStyle, 0);
            if (k != 0)
            {
                mToolbar.setTitleTextAppearance(mToolbar.getContext(), k);
            }
            k = toolbar.getResourceId(android.support.v7.appcompat.R.styleable.ActionBar_subtitleTextStyle, 0);
            if (k != 0)
            {
                mToolbar.setSubtitleTextAppearance(mToolbar.getContext(), k);
            }
            k = toolbar.getResourceId(android.support.v7.appcompat.R.styleable.ActionBar_popupTheme, 0);
            if (k != 0)
            {
                mToolbar.setPopupTheme(k);
            }
            toolbar.recycle();
            mTintManager = toolbar.getTintManager();
        } else
        {
            mDisplayOpts = detectDisplayOptions();
            mTintManager = new TintManager(toolbar.getContext());
        }
        setDefaultNavigationContentDescription(i);
        mHomeDescription = mToolbar.getNavigationContentDescription();
        setDefaultNavigationIcon(mTintManager.getDrawable(j));
        mToolbar.setNavigationOnClickListener(new android.view.View.OnClickListener() {

            final ActionMenuItem mNavItem;
            final ToolbarWidgetWrapper this$0;

            public final void onClick(View view)
            {
                if (mWindowCallback != null && mMenuPrepared)
                {
                    mWindowCallback.onMenuItemSelected(0, mNavItem);
                }
            }

            
            {
                this$0 = ToolbarWidgetWrapper.this;
                super();
                mNavItem = new ActionMenuItem(mToolbar.getContext(), 0, 0x102002c, 0, 0, mTitle);
            }
        });
    }

    private int detectDisplayOptions()
    {
        byte byte0 = 11;
        if (mToolbar.getNavigationIcon() != null)
        {
            byte0 = 15;
        }
        return byte0;
    }

    private void setCustomView(View view)
    {
        if (mCustomView != null && (mDisplayOpts & 0x10) != 0)
        {
            mToolbar.removeView(mCustomView);
        }
        mCustomView = view;
        if (view != null && (mDisplayOpts & 0x10) != 0)
        {
            mToolbar.addView(mCustomView);
        }
    }

    private void setDefaultNavigationContentDescription(int i)
    {
        if (i != mDefaultNavigationContentDescription)
        {
            mDefaultNavigationContentDescription = i;
            if (TextUtils.isEmpty(mToolbar.getNavigationContentDescription()))
            {
                setNavigationContentDescription(mDefaultNavigationContentDescription);
                return;
            }
        }
    }

    private void setDefaultNavigationIcon(Drawable drawable)
    {
        if (mDefaultNavigationIcon != drawable)
        {
            mDefaultNavigationIcon = drawable;
            updateNavigationIcon();
        }
    }

    private void setNavigationContentDescription(CharSequence charsequence)
    {
        mHomeDescription = charsequence;
        updateHomeAccessibility();
    }

    private void setTitleInt(CharSequence charsequence)
    {
        mTitle = charsequence;
        if ((mDisplayOpts & 8) != 0)
        {
            mToolbar.setTitle(charsequence);
        }
    }

    private void updateHomeAccessibility()
    {
label0:
        {
            if ((mDisplayOpts & 4) != 0)
            {
                if (!TextUtils.isEmpty(mHomeDescription))
                {
                    break label0;
                }
                mToolbar.setNavigationContentDescription(mDefaultNavigationContentDescription);
            }
            return;
        }
        mToolbar.setNavigationContentDescription(mHomeDescription);
    }

    private void updateNavigationIcon()
    {
        if ((mDisplayOpts & 4) != 0)
        {
            Toolbar toolbar = mToolbar;
            Drawable drawable;
            if (mNavIcon != null)
            {
                drawable = mNavIcon;
            } else
            {
                drawable = mDefaultNavigationIcon;
            }
            toolbar.setNavigationIcon(drawable);
        }
    }

    private void updateToolbarLogo()
    {
        Drawable drawable = null;
        if ((mDisplayOpts & 2) != 0)
        {
            if ((mDisplayOpts & 1) != 0)
            {
                if (mLogo != null)
                {
                    drawable = mLogo;
                } else
                {
                    drawable = mIcon;
                }
            } else
            {
                drawable = mIcon;
            }
        }
        mToolbar.setLogo(drawable);
    }

    public final void animateToVisibility(int i)
    {
        if (i == 8)
        {
            ViewCompat.animate(mToolbar).alpha(0.0F).setListener(new ViewPropertyAnimatorListenerAdapter() {

                private boolean mCanceled;
                final ToolbarWidgetWrapper this$0;

                public final void onAnimationCancel(View view)
                {
                    mCanceled = true;
                }

                public final void onAnimationEnd(View view)
                {
                    if (!mCanceled)
                    {
                        mToolbar.setVisibility(8);
                    }
                }

            
            {
                this$0 = ToolbarWidgetWrapper.this;
                super();
                mCanceled = false;
            }
            });
        } else
        if (i == 0)
        {
            ViewCompat.animate(mToolbar).alpha(1.0F).setListener(new ViewPropertyAnimatorListenerAdapter() {

                final ToolbarWidgetWrapper this$0;

                public final void onAnimationStart(View view)
                {
                    mToolbar.setVisibility(0);
                }

            
            {
                this$0 = ToolbarWidgetWrapper.this;
                super();
            }
            });
            return;
        }
    }

    public final boolean canShowOverflowMenu()
    {
        return mToolbar.canShowOverflowMenu();
    }

    public final void collapseActionView()
    {
        mToolbar.collapseActionView();
    }

    public final void dismissPopupMenus()
    {
        mToolbar.dismissPopupMenus();
    }

    public final Context getContext()
    {
        return mToolbar.getContext();
    }

    public final int getDisplayOptions()
    {
        return mDisplayOpts;
    }

    public final int getNavigationMode()
    {
        return mNavigationMode;
    }

    public final ViewGroup getViewGroup()
    {
        return mToolbar;
    }

    public final boolean hasExpandedActionView()
    {
        return mToolbar.hasExpandedActionView();
    }

    public final boolean hideOverflowMenu()
    {
        return mToolbar.hideOverflowMenu();
    }

    public final void initIndeterminateProgress()
    {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void initProgress()
    {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final boolean isOverflowMenuShowPending()
    {
        return mToolbar.isOverflowMenuShowPending();
    }

    public final boolean isOverflowMenuShowing()
    {
        return mToolbar.isOverflowMenuShowing();
    }

    public final boolean isSplit()
    {
        return false;
    }

    public final void setCollapsible(boolean flag)
    {
        mToolbar.setCollapsible(flag);
    }

    public final void setDisplayOptions(int i)
    {
label0:
        {
            int j = mDisplayOpts ^ i;
            mDisplayOpts = i;
            if (j != 0)
            {
                if ((j & 4) != 0)
                {
                    if ((i & 4) != 0)
                    {
                        updateNavigationIcon();
                        updateHomeAccessibility();
                    } else
                    {
                        mToolbar.setNavigationIcon(null);
                    }
                }
                if ((j & 3) != 0)
                {
                    updateToolbarLogo();
                }
                if ((j & 8) != 0)
                {
                    if ((i & 8) != 0)
                    {
                        mToolbar.setTitle(mTitle);
                        mToolbar.setSubtitle(mSubtitle);
                    } else
                    {
                        mToolbar.setTitle(null);
                        mToolbar.setSubtitle(null);
                    }
                }
                if ((j & 0x10) != 0 && mCustomView != null)
                {
                    if ((i & 0x10) == 0)
                    {
                        break label0;
                    }
                    mToolbar.addView(mCustomView);
                }
            }
            return;
        }
        mToolbar.removeView(mCustomView);
    }

    public final void setEmbeddedTabView(ScrollingTabContainerView scrollingtabcontainerview)
    {
        if (mTabView != null && mTabView.getParent() == mToolbar)
        {
            mToolbar.removeView(mTabView);
        }
        mTabView = scrollingtabcontainerview;
        if (scrollingtabcontainerview != null && mNavigationMode == 2)
        {
            mToolbar.addView(mTabView, 0);
            android.support.v7.widget.Toolbar.LayoutParams layoutparams = (android.support.v7.widget.Toolbar.LayoutParams)mTabView.getLayoutParams();
            layoutparams.width = -2;
            layoutparams.height = -2;
            layoutparams.gravity = 0x800053;
            scrollingtabcontainerview.setAllowCollapse(true);
        }
    }

    public final void setIcon(int i)
    {
        Drawable drawable;
        if (i != 0)
        {
            drawable = mTintManager.getDrawable(i);
        } else
        {
            drawable = null;
        }
        setIcon(drawable);
    }

    public final void setIcon(Drawable drawable)
    {
        mIcon = drawable;
        updateToolbarLogo();
    }

    public final void setLogo(int i)
    {
        Drawable drawable;
        if (i != 0)
        {
            drawable = mTintManager.getDrawable(i);
        } else
        {
            drawable = null;
        }
        setLogo(drawable);
    }

    public final void setLogo(Drawable drawable)
    {
        mLogo = drawable;
        updateToolbarLogo();
    }

    public final void setMenu(Menu menu, android.support.v7.internal.view.menu.MenuPresenter.Callback callback)
    {
        if (mActionMenuPresenter == null)
        {
            mActionMenuPresenter = new ActionMenuPresenter(mToolbar.getContext());
            mActionMenuPresenter.setId(android.support.v7.appcompat.R.id.action_menu_presenter);
        }
        mActionMenuPresenter.setCallback(callback);
        mToolbar.setMenu((MenuBuilder)menu, mActionMenuPresenter);
    }

    public final void setMenuPrepared()
    {
        mMenuPrepared = true;
    }

    public final void setNavigationContentDescription(int i)
    {
        Object obj;
        if (i == 0)
        {
            obj = null;
        } else
        {
            obj = getContext().getString(i);
        }
        setNavigationContentDescription(((CharSequence) (obj)));
    }

    public final void setNavigationIcon(Drawable drawable)
    {
        mNavIcon = drawable;
        updateNavigationIcon();
    }

    public final void setSubtitle(CharSequence charsequence)
    {
        mSubtitle = charsequence;
        if ((mDisplayOpts & 8) != 0)
        {
            mToolbar.setSubtitle(charsequence);
        }
    }

    public final void setTitle(CharSequence charsequence)
    {
        mTitleSet = true;
        setTitleInt(charsequence);
    }

    public final void setWindowCallback(WindowCallback windowcallback)
    {
        mWindowCallback = windowcallback;
    }

    public final void setWindowTitle(CharSequence charsequence)
    {
        if (!mTitleSet)
        {
            setTitleInt(charsequence);
        }
    }

    public final boolean showOverflowMenu()
    {
        return mToolbar.showOverflowMenu();
    }




}
