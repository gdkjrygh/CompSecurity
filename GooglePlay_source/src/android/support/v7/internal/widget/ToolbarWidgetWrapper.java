// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.internal.view.menu.ActionMenuItem;
import android.support.v7.internal.view.menu.BaseMenuPresenter;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.widget:
//            DecorToolbar, TintTypedArray, RtlSpacingHelper, TintManager, 
//            ScrollingTabContainerView

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
    boolean mMenuPrepared;
    private Drawable mNavIcon;
    private int mNavigationMode;
    private CharSequence mSubtitle;
    private View mTabView;
    private final TintManager mTintManager;
    CharSequence mTitle;
    private boolean mTitleSet;
    Toolbar mToolbar;
    android.view.Window.Callback mWindowCallback;

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean flag)
    {
        this(toolbar, flag, 0x7f100003, 0x7f020014);
    }

    private ToolbarWidgetWrapper(Toolbar toolbar, boolean flag, int i, int j)
    {
        mNavigationMode = 0;
        mDefaultNavigationContentDescription = 0;
        mToolbar = toolbar;
        mTitle = toolbar.mTitleText;
        mSubtitle = toolbar.mSubtitleText;
        boolean flag1;
        if (mTitle != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mTitleSet = flag1;
        mNavIcon = toolbar.getNavigationIcon();
        if (flag)
        {
            toolbar = TintTypedArray.obtainStyledAttributes$1a6c1917(toolbar.getContext(), null, android.support.v7.appcompat.R.styleable.ActionBar, 0x7f0100fd);
            Object obj = toolbar.getText(1);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                setTitle(((CharSequence) (obj)));
            }
            obj = toolbar.getText(4);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                setSubtitle(((CharSequence) (obj)));
            }
            obj = toolbar.getDrawable(8);
            if (obj != null)
            {
                mLogo = ((Drawable) (obj));
                updateToolbarLogo();
            }
            obj = toolbar.getDrawable(7);
            if (mNavIcon == null && obj != null)
            {
                mIcon = ((Drawable) (obj));
                updateToolbarLogo();
            }
            obj = toolbar.getDrawable(26);
            if (obj != null)
            {
                setNavigationIcon(((Drawable) (obj)));
            }
            setDisplayOptions(toolbar.getInt(3, 0));
            i = toolbar.getResourceId(13, 0);
            if (i != 0)
            {
                setCustomView(LayoutInflater.from(mToolbar.getContext()).inflate(i, mToolbar, false));
                setDisplayOptions(mDisplayOpts | 0x10);
            }
            i = toolbar.getLayoutDimension(0, 0);
            if (i > 0)
            {
                android.view.ViewGroup.LayoutParams layoutparams = mToolbar.getLayoutParams();
                layoutparams.height = i;
                mToolbar.setLayoutParams(layoutparams);
            }
            j = toolbar.getDimensionPixelOffset(20, -1);
            i = toolbar.getDimensionPixelOffset(21, -1);
            if (j >= 0 || i >= 0)
            {
                Toolbar toolbar1 = mToolbar;
                j = Math.max(j, 0);
                i = Math.max(i, 0);
                toolbar1.mContentInsets.setRelative(j, i);
            }
            i = toolbar.getResourceId(5, 0);
            if (i != 0)
            {
                Toolbar toolbar2 = mToolbar;
                Context context = mToolbar.getContext();
                toolbar2.mTitleTextAppearance = i;
                if (toolbar2.mTitleTextView != null)
                {
                    toolbar2.mTitleTextView.setTextAppearance(context, i);
                }
            }
            i = toolbar.getResourceId(6, 0);
            if (i != 0)
            {
                Toolbar toolbar3 = mToolbar;
                Context context1 = mToolbar.getContext();
                toolbar3.mSubtitleTextAppearance = i;
                if (toolbar3.mSubtitleTextView != null)
                {
                    toolbar3.mSubtitleTextView.setTextAppearance(context1, i);
                }
            }
            i = toolbar.getResourceId(25, 0);
            if (i != 0)
            {
                mToolbar.setPopupTheme(i);
            }
            ((TintTypedArray) (toolbar)).mWrapped.recycle();
            mTintManager = toolbar.getTintManager();
        } else
        {
            i = 11;
            if (mToolbar.getNavigationIcon() != null)
            {
                i = 15;
            }
            mDisplayOpts = i;
            mTintManager = TintManager.get(toolbar.getContext());
        }
        if (0x7f100003 != mDefaultNavigationContentDescription)
        {
            mDefaultNavigationContentDescription = 0x7f100003;
            if (TextUtils.isEmpty(mToolbar.getNavigationContentDescription()))
            {
                setNavigationContentDescription(mDefaultNavigationContentDescription);
            }
        }
        mHomeDescription = mToolbar.getNavigationContentDescription();
        toolbar = mTintManager.getDrawable(0x7f020014, false);
        if (mDefaultNavigationIcon != toolbar)
        {
            mDefaultNavigationIcon = toolbar;
            updateNavigationIcon();
        }
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
                mNavItem = new ActionMenuItem(mToolbar.getContext(), mTitle);
            }
        });
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
                Toolbar toolbar = mToolbar;
                int i = mDefaultNavigationContentDescription;
                CharSequence charsequence;
                if (i != 0)
                {
                    charsequence = toolbar.getContext().getText(i);
                } else
                {
                    charsequence = null;
                }
                toolbar.setNavigationContentDescription(charsequence);
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
        Toolbar toolbar;
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
        toolbar = mToolbar;
        if (drawable == null) goto _L2; else goto _L1
_L1:
        if (toolbar.mLogoView == null)
        {
            toolbar.mLogoView = new ImageView(toolbar.getContext());
        }
        if (toolbar.mLogoView.getParent() == null)
        {
            toolbar.addSystemView(toolbar.mLogoView);
            toolbar.updateChildVisibilityForExpandedActionView(toolbar.mLogoView);
        }
_L4:
        if (toolbar.mLogoView != null)
        {
            toolbar.mLogoView.setImageDrawable(drawable);
        }
        return;
_L2:
        if (toolbar.mLogoView != null && toolbar.mLogoView.getParent() != null)
        {
            toolbar.removeView(toolbar.mLogoView);
        }
        if (true) goto _L4; else goto _L3
_L3:
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
        Toolbar toolbar = mToolbar;
        return toolbar.getVisibility() == 0 && toolbar.mMenuView != null && toolbar.mMenuView.mReserveOverflow;
    }

    public final void collapseActionView()
    {
        mToolbar.collapseActionView();
    }

    public final void dismissPopupMenus()
    {
        Toolbar toolbar = mToolbar;
        if (toolbar.mMenuView != null)
        {
            toolbar.mMenuView.dismissPopupMenus();
        }
    }

    public final Context getContext()
    {
        return mToolbar.getContext();
    }

    public final View getCustomView()
    {
        return mCustomView;
    }

    public final int getDisplayOptions()
    {
        return mDisplayOpts;
    }

    public final Menu getMenu()
    {
        Toolbar toolbar = mToolbar;
        toolbar.ensureMenuView();
        if (toolbar.mMenuView.mMenu == null)
        {
            MenuBuilder menubuilder = (MenuBuilder)toolbar.mMenuView.getMenu();
            if (toolbar.mExpandedMenuPresenter == null)
            {
                toolbar.mExpandedMenuPresenter = new android.support.v7.widget.Toolbar.ExpandedActionViewMenuPresenter(toolbar, (byte)0);
            }
            toolbar.mMenuView.mPresenter.mExpandedActionViewsExclusive = true;
            menubuilder.addMenuPresenter(toolbar.mExpandedMenuPresenter, toolbar.mPopupContext);
        }
        return toolbar.mMenuView.getMenu();
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
        Object obj = mToolbar;
        if (((Toolbar) (obj)).mMenuView != null)
        {
            obj = ((Toolbar) (obj)).mMenuView;
            boolean flag;
            if (((ActionMenuView) (obj)).mPresenter != null && ((ActionMenuView) (obj)).mPresenter.hideOverflowMenu())
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
        Object obj = mToolbar;
        if (((Toolbar) (obj)).mMenuView == null) goto _L2; else goto _L1
_L1:
        obj = ((Toolbar) (obj)).mMenuView;
        if (((ActionMenuView) (obj)).mPresenter == null) goto _L4; else goto _L3
_L3:
        boolean flag;
        obj = ((ActionMenuView) (obj)).mPresenter;
        if (((ActionMenuPresenter) (obj)).mPostedOpenRunnable != null || ((ActionMenuPresenter) (obj)).isOverflowMenuShowing())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L5
_L5:
        flag = true;
_L6:
        if (flag)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        flag = false;
        if (true) goto _L6; else goto _L2
_L2:
        return false;
    }

    public final boolean isOverflowMenuShowing()
    {
        return mToolbar.isOverflowMenuShowing();
    }

    public final void setBackgroundDrawable(Drawable drawable)
    {
        mToolbar.setBackgroundDrawable(drawable);
    }

    public final void setCollapsible(boolean flag)
    {
        Toolbar toolbar = mToolbar;
        toolbar.mCollapsible = flag;
        toolbar.requestLayout();
    }

    public final void setCustomView(View view)
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
        mTabView = null;
    }

    public final void setMenu(Menu menu, android.support.v7.internal.view.menu.MenuPresenter.Callback callback)
    {
        if (mActionMenuPresenter == null)
        {
            mActionMenuPresenter = new ActionMenuPresenter(mToolbar.getContext());
            mActionMenuPresenter.mId = 0x7f0d000f;
        }
        mActionMenuPresenter.mCallback = callback;
        callback = mToolbar;
        menu = (MenuBuilder)menu;
        ActionMenuPresenter actionmenupresenter = mActionMenuPresenter;
        if (menu != null || ((Toolbar) (callback)).mMenuView != null)
        {
            callback.ensureMenuView();
            MenuBuilder menubuilder = ((Toolbar) (callback)).mMenuView.mMenu;
            if (menubuilder != menu)
            {
                if (menubuilder != null)
                {
                    menubuilder.removeMenuPresenter(((Toolbar) (callback)).mOuterActionMenuPresenter);
                    menubuilder.removeMenuPresenter(((Toolbar) (callback)).mExpandedMenuPresenter);
                }
                if (((Toolbar) (callback)).mExpandedMenuPresenter == null)
                {
                    callback.mExpandedMenuPresenter = new android.support.v7.widget.Toolbar.ExpandedActionViewMenuPresenter(callback, (byte)0);
                }
                actionmenupresenter.mExpandedActionViewsExclusive = true;
                if (menu != null)
                {
                    menu.addMenuPresenter(actionmenupresenter, ((Toolbar) (callback)).mPopupContext);
                    menu.addMenuPresenter(((Toolbar) (callback)).mExpandedMenuPresenter, ((Toolbar) (callback)).mPopupContext);
                } else
                {
                    actionmenupresenter.initForMenu(((Toolbar) (callback)).mPopupContext, null);
                    ((Toolbar) (callback)).mExpandedMenuPresenter.initForMenu(((Toolbar) (callback)).mPopupContext, null);
                    actionmenupresenter.updateMenuView(true);
                    ((Toolbar) (callback)).mExpandedMenuPresenter.updateMenuView(true);
                }
                ((Toolbar) (callback)).mMenuView.setPopupTheme(((Toolbar) (callback)).mPopupTheme);
                ((Toolbar) (callback)).mMenuView.setPresenter(actionmenupresenter);
                callback.mOuterActionMenuPresenter = actionmenupresenter;
            }
        }
    }

    public final void setMenuCallbacks(android.support.v7.internal.view.menu.MenuPresenter.Callback callback, android.support.v7.internal.view.menu.MenuBuilder.Callback callback1)
    {
        Toolbar toolbar = mToolbar;
        toolbar.mActionMenuPresenterCallback = callback;
        toolbar.mMenuBuilderCallback = callback1;
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
            obj = mToolbar.getContext().getString(i);
        }
        mHomeDescription = ((CharSequence) (obj));
        updateHomeAccessibility();
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

    public final void setVisibility$13462e()
    {
        mToolbar.setVisibility(8);
    }

    public final void setWindowCallback(android.view.Window.Callback callback)
    {
        mWindowCallback = callback;
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
