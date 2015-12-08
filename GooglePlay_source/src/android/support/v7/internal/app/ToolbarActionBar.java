// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.internal.view.WindowCallbackWrapper;
import android.support.v7.internal.view.menu.ListMenuPresenter;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.widget.DecorToolbar;
import android.support.v7.internal.widget.ToolbarWidgetWrapper;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListAdapter;
import java.util.ArrayList;

public final class ToolbarActionBar extends ActionBar
{
    private final class ActionMenuPresenterCallback
        implements android.support.v7.internal.view.menu.MenuPresenter.Callback
    {

        private boolean mClosingActionMenu;
        final ToolbarActionBar this$0;

        public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
            if (mClosingActionMenu)
            {
                return;
            }
            mClosingActionMenu = true;
            mDecorToolbar.dismissPopupMenus();
            if (mWindowCallback != null)
            {
                mWindowCallback.onPanelClosed(8, menubuilder);
            }
            mClosingActionMenu = false;
        }

        public final boolean onOpenSubMenu(MenuBuilder menubuilder)
        {
            if (mWindowCallback != null)
            {
                mWindowCallback.onMenuOpened(8, menubuilder);
                return true;
            } else
            {
                return false;
            }
        }

        private ActionMenuPresenterCallback()
        {
            this$0 = ToolbarActionBar.this;
            super();
        }

        ActionMenuPresenterCallback(byte byte0)
        {
            this();
        }
    }

    private final class MenuBuilderCallback
        implements android.support.v7.internal.view.menu.MenuBuilder.Callback
    {

        final ToolbarActionBar this$0;

        public final boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
        {
            return false;
        }

        public final void onMenuModeChange(MenuBuilder menubuilder)
        {
            if (mWindowCallback != null)
            {
                if (mDecorToolbar.isOverflowMenuShowing())
                {
                    mWindowCallback.onPanelClosed(8, menubuilder);
                } else
                if (mWindowCallback.onPreparePanel(0, null, menubuilder))
                {
                    mWindowCallback.onMenuOpened(8, menubuilder);
                    return;
                }
            }
        }

        private MenuBuilderCallback()
        {
            this$0 = ToolbarActionBar.this;
            super();
        }

        MenuBuilderCallback(byte byte0)
        {
            this();
        }
    }

    private final class PanelMenuPresenterCallback
        implements android.support.v7.internal.view.menu.MenuPresenter.Callback
    {

        final ToolbarActionBar this$0;

        public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
            if (mWindowCallback != null)
            {
                mWindowCallback.onPanelClosed(0, menubuilder);
            }
        }

        public final boolean onOpenSubMenu(MenuBuilder menubuilder)
        {
            if (menubuilder == null && mWindowCallback != null)
            {
                mWindowCallback.onMenuOpened(0, menubuilder);
            }
            return true;
        }

        private PanelMenuPresenterCallback()
        {
            this$0 = ToolbarActionBar.this;
            super();
        }

        PanelMenuPresenterCallback(byte byte0)
        {
            this();
        }
    }

    private final class ToolbarCallbackWrapper extends WindowCallbackWrapper
    {

        final ToolbarActionBar this$0;

        public final View onCreatePanelView(int i)
        {
            i;
            JVM INSTR tableswitch 0 0: default 20
        //                       0 26;
               goto _L1 _L2
_L1:
            Menu menu;
            return super.onCreatePanelView(i);
_L2:
            if (onPreparePanel(i, null, menu = mDecorToolbar.getMenu()) && onMenuOpened(i, menu))
            {
                ToolbarActionBar toolbaractionbar = ToolbarActionBar.this;
                if (toolbaractionbar.mListMenuPresenter == null && (menu instanceof MenuBuilder))
                {
                    MenuBuilder menubuilder = (MenuBuilder)menu;
                    Object obj = toolbaractionbar.mDecorToolbar.getContext();
                    TypedValue typedvalue = new TypedValue();
                    android.content.res.Resources.Theme theme = ((Context) (obj)).getResources().newTheme();
                    theme.setTo(((Context) (obj)).getTheme());
                    theme.resolveAttribute(0x7f01013a, typedvalue, true);
                    if (typedvalue.resourceId != 0)
                    {
                        theme.applyStyle(typedvalue.resourceId, true);
                    } else
                    {
                        theme.applyStyle(0x7f1101a1, true);
                    }
                    obj = new ContextThemeWrapper(((Context) (obj)), 0);
                    ((Context) (obj)).getTheme().setTo(theme);
                    toolbaractionbar.mListMenuPresenter = new ListMenuPresenter(((Context) (obj)), 0x7f04000e);
                    toolbaractionbar.mListMenuPresenter.mCallback = toolbaractionbar. new PanelMenuPresenterCallback((byte)0);
                    menubuilder.addMenuPresenter(toolbaractionbar.mListMenuPresenter);
                }
                if (menu == null || toolbaractionbar.mListMenuPresenter == null)
                {
                    return null;
                }
                if (toolbaractionbar.mListMenuPresenter.getAdapter().getCount() > 0)
                {
                    return (View)toolbaractionbar.mListMenuPresenter.getMenuView(toolbaractionbar.mDecorToolbar.getViewGroup());
                } else
                {
                    return null;
                }
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public final boolean onPreparePanel(int i, View view, Menu menu)
        {
            boolean flag = super.onPreparePanel(i, view, menu);
            if (flag && !mToolbarMenuPrepared)
            {
                mDecorToolbar.setMenuPrepared();
                mToolbarMenuPrepared = true;
            }
            return flag;
        }

        public ToolbarCallbackWrapper(android.view.Window.Callback callback)
        {
            this$0 = ToolbarActionBar.this;
            super(callback);
        }
    }


    DecorToolbar mDecorToolbar;
    private boolean mLastMenuVisibility;
    ListMenuPresenter mListMenuPresenter;
    private boolean mMenuCallbackSet;
    private final android.support.v7.widget.Toolbar.OnMenuItemClickListener mMenuClicker = new android.support.v7.widget.Toolbar.OnMenuItemClickListener() {

        final ToolbarActionBar this$0;

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            return mWindowCallback.onMenuItemSelected(0, menuitem);
        }

            
            {
                this$0 = ToolbarActionBar.this;
                super();
            }
    };
    private final Runnable mMenuInvalidator = new Runnable() {

        final ToolbarActionBar this$0;

        public final void run()
        {
            MenuBuilder menubuilder;
            ToolbarActionBar toolbaractionbar = ToolbarActionBar.this;
            Menu menu = toolbaractionbar.getMenu();
            if (menu instanceof MenuBuilder)
            {
                menubuilder = (MenuBuilder)menu;
            } else
            {
                menubuilder = null;
            }
            if (menubuilder != null)
            {
                menubuilder.stopDispatchingItemsChanged();
            }
            menu.clear();
            if (!toolbaractionbar.mWindowCallback.onCreatePanelMenu(0, menu) || !toolbaractionbar.mWindowCallback.onPreparePanel(0, null, menu))
            {
                menu.clear();
            }
            if (menubuilder != null)
            {
                menubuilder.startDispatchingItemsChanged();
            }
            return;
            Exception exception;
            exception;
            if (menubuilder != null)
            {
                menubuilder.startDispatchingItemsChanged();
            }
            throw exception;
        }

            
            {
                this$0 = ToolbarActionBar.this;
                super();
            }
    };
    private ArrayList mMenuVisibilityListeners;
    boolean mToolbarMenuPrepared;
    private Window mWindow;
    public android.view.Window.Callback mWindowCallback;

    public ToolbarActionBar(Toolbar toolbar, CharSequence charsequence, Window window)
    {
        mMenuVisibilityListeners = new ArrayList();
        mDecorToolbar = new ToolbarWidgetWrapper(toolbar, false);
        mWindowCallback = new ToolbarCallbackWrapper(window.getCallback());
        mDecorToolbar.setWindowCallback(mWindowCallback);
        toolbar.mOnMenuItemClickListener = mMenuClicker;
        mDecorToolbar.setWindowTitle(charsequence);
        mWindow = window;
    }

    public final boolean collapseActionView()
    {
        if (mDecorToolbar.hasExpandedActionView())
        {
            mDecorToolbar.collapseActionView();
            return true;
        } else
        {
            return false;
        }
    }

    public final void dispatchMenuVisibilityChanged(boolean flag)
    {
        if (flag != mLastMenuVisibility)
        {
            mLastMenuVisibility = flag;
            int j = mMenuVisibilityListeners.size();
            int i = 0;
            while (i < j) 
            {
                mMenuVisibilityListeners.get(i);
                i++;
            }
        }
    }

    public final View getCustomView()
    {
        return mDecorToolbar.getCustomView();
    }

    public final int getDisplayOptions()
    {
        return mDecorToolbar.getDisplayOptions();
    }

    final Menu getMenu()
    {
        if (!mMenuCallbackSet)
        {
            mDecorToolbar.setMenuCallbacks(new ActionMenuPresenterCallback((byte)0), new MenuBuilderCallback((byte)0));
            mMenuCallbackSet = true;
        }
        return mDecorToolbar.getMenu();
    }

    public final Context getThemedContext()
    {
        return mDecorToolbar.getContext();
    }

    public final void hide()
    {
        mDecorToolbar.setVisibility$13462e();
    }

    public final boolean invalidateOptionsMenu()
    {
        mDecorToolbar.getViewGroup().removeCallbacks(mMenuInvalidator);
        ViewCompat.postOnAnimation(mDecorToolbar.getViewGroup(), mMenuInvalidator);
        return true;
    }

    public final void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public final boolean onKeyShortcut(int i, KeyEvent keyevent)
    {
        boolean flag = false;
        Menu menu = getMenu();
        if (menu != null)
        {
            flag = menu.performShortcut(i, keyevent, 0);
        }
        return flag;
    }

    public final void setBackgroundDrawable(Drawable drawable)
    {
        mDecorToolbar.setBackgroundDrawable(drawable);
    }

    public final void setCustomView(int i)
    {
        setCustomView(LayoutInflater.from(mDecorToolbar.getContext()).inflate(0x7f04002f, mDecorToolbar.getViewGroup(), false));
    }

    public final void setCustomView(View view)
    {
        view.setLayoutParams(new android.support.v7.app.ActionBar.LayoutParams(-2, -2));
        mDecorToolbar.setCustomView(view);
    }

    public final void setDefaultDisplayHomeAsUpEnabled(boolean flag)
    {
    }

    public final void setDisplayHomeAsUpEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        setDisplayOptions(byte0, 4);
    }

    public final void setDisplayOptions(int i, int j)
    {
        int k = mDecorToolbar.getDisplayOptions();
        mDecorToolbar.setDisplayOptions(i & j | ~j & k);
    }

    public final void setDisplayShowTitleEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        setDisplayOptions(byte0, 8);
    }

    public final void setHomeActionContentDescription(int i)
    {
        mDecorToolbar.setNavigationContentDescription(i);
    }

    public final void setHomeAsUpIndicator(Drawable drawable)
    {
        mDecorToolbar.setNavigationIcon(drawable);
    }

    public final void setShowHideAnimationEnabled(boolean flag)
    {
    }

    public final void setSubtitle(CharSequence charsequence)
    {
        mDecorToolbar.setSubtitle(charsequence);
    }

    public final void setTitle(CharSequence charsequence)
    {
        mDecorToolbar.setTitle(charsequence);
    }

    public final void setTitle$13462e()
    {
        mDecorToolbar.setTitle(mDecorToolbar.getContext().getText(0x7f100286));
    }

    public final void setWindowTitle(CharSequence charsequence)
    {
        mDecorToolbar.setWindowTitle(charsequence);
    }
}
