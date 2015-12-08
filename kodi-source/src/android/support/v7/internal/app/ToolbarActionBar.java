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
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListAdapter;
import java.util.ArrayList;

public class ToolbarActionBar extends ActionBar
{
    private final class ActionMenuPresenterCallback
        implements android.support.v7.internal.view.menu.MenuPresenter.Callback
    {

        private boolean mClosingActionMenu;
        final ToolbarActionBar this$0;

        public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
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

        public boolean onOpenSubMenu(MenuBuilder menubuilder)
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

    }

    private final class MenuBuilderCallback
        implements android.support.v7.internal.view.menu.MenuBuilder.Callback
    {

        final ToolbarActionBar this$0;

        public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
        {
            return false;
        }

        public void onMenuModeChange(MenuBuilder menubuilder)
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

    }

    private final class PanelMenuPresenterCallback
        implements android.support.v7.internal.view.menu.MenuPresenter.Callback
    {

        final ToolbarActionBar this$0;

        public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
            if (mWindowCallback != null)
            {
                mWindowCallback.onPanelClosed(0, menubuilder);
            }
        }

        public boolean onOpenSubMenu(MenuBuilder menubuilder)
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

    }

    private class ToolbarCallbackWrapper extends WindowCallbackWrapper
    {

        final ToolbarActionBar this$0;

        public View onCreatePanelView(int i)
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
                return getListMenuView(menu);
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public boolean onPreparePanel(int i, View view, Menu menu)
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


    private DecorToolbar mDecorToolbar;
    private boolean mLastMenuVisibility;
    private ListMenuPresenter mListMenuPresenter;
    private boolean mMenuCallbackSet;
    private final android.support.v7.widget.Toolbar.OnMenuItemClickListener mMenuClicker = new android.support.v7.widget.Toolbar.OnMenuItemClickListener() {

        final ToolbarActionBar this$0;

        public boolean onMenuItemClick(MenuItem menuitem)
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

        public void run()
        {
            populateOptionsMenu();
        }

            
            {
                this$0 = ToolbarActionBar.this;
                super();
            }
    };
    private ArrayList mMenuVisibilityListeners;
    private boolean mToolbarMenuPrepared;
    private Window mWindow;
    private android.view.Window.Callback mWindowCallback;

    public ToolbarActionBar(Toolbar toolbar, CharSequence charsequence, Window window)
    {
        mMenuVisibilityListeners = new ArrayList();
        mDecorToolbar = new ToolbarWidgetWrapper(toolbar, false);
        mWindowCallback = new ToolbarCallbackWrapper(window.getCallback());
        mDecorToolbar.setWindowCallback(mWindowCallback);
        toolbar.setOnMenuItemClickListener(mMenuClicker);
        mDecorToolbar.setWindowTitle(charsequence);
        mWindow = window;
    }

    private void ensureListMenuPresenter(Menu menu)
    {
        if (mListMenuPresenter == null && (menu instanceof MenuBuilder))
        {
            menu = (MenuBuilder)menu;
            Object obj = mDecorToolbar.getContext();
            TypedValue typedvalue = new TypedValue();
            android.content.res.Resources.Theme theme = ((Context) (obj)).getResources().newTheme();
            theme.setTo(((Context) (obj)).getTheme());
            theme.resolveAttribute(android.support.v7.appcompat.R.attr.panelMenuListTheme, typedvalue, true);
            if (typedvalue.resourceId != 0)
            {
                theme.applyStyle(typedvalue.resourceId, true);
            } else
            {
                theme.applyStyle(android.support.v7.appcompat.R.style.Theme_AppCompat_CompactMenu, true);
            }
            obj = new ContextThemeWrapper(((Context) (obj)), 0);
            ((Context) (obj)).getTheme().setTo(theme);
            mListMenuPresenter = new ListMenuPresenter(((Context) (obj)), android.support.v7.appcompat.R.layout.abc_list_menu_item_layout);
            mListMenuPresenter.setCallback(new PanelMenuPresenterCallback());
            menu.addMenuPresenter(mListMenuPresenter);
        }
    }

    private View getListMenuView(Menu menu)
    {
        ensureListMenuPresenter(menu);
        while (menu == null || mListMenuPresenter == null || mListMenuPresenter.getAdapter().getCount() <= 0) 
        {
            return null;
        }
        return (View)mListMenuPresenter.getMenuView(mDecorToolbar.getViewGroup());
    }

    private Menu getMenu()
    {
        if (!mMenuCallbackSet)
        {
            mDecorToolbar.setMenuCallbacks(new ActionMenuPresenterCallback(), new MenuBuilderCallback());
            mMenuCallbackSet = true;
        }
        return mDecorToolbar.getMenu();
    }

    public boolean collapseActionView()
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

    public void dispatchMenuVisibilityChanged(boolean flag)
    {
        if (flag != mLastMenuVisibility)
        {
            mLastMenuVisibility = flag;
            int j = mMenuVisibilityListeners.size();
            int i = 0;
            while (i < j) 
            {
                ((android.support.v7.app.ActionBar.OnMenuVisibilityListener)mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(flag);
                i++;
            }
        }
    }

    public int getDisplayOptions()
    {
        return mDecorToolbar.getDisplayOptions();
    }

    public Context getThemedContext()
    {
        return mDecorToolbar.getContext();
    }

    public android.view.Window.Callback getWrappedWindowCallback()
    {
        return mWindowCallback;
    }

    public boolean invalidateOptionsMenu()
    {
        mDecorToolbar.getViewGroup().removeCallbacks(mMenuInvalidator);
        ViewCompat.postOnAnimation(mDecorToolbar.getViewGroup(), mMenuInvalidator);
        return true;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public boolean onKeyShortcut(int i, KeyEvent keyevent)
    {
        boolean flag = false;
        Menu menu = getMenu();
        if (menu != null)
        {
            flag = menu.performShortcut(i, keyevent, 0);
        }
        return flag;
    }

    void populateOptionsMenu()
    {
        MenuBuilder menubuilder;
        Menu menu;
        menubuilder = null;
        menu = getMenu();
        if (menu instanceof MenuBuilder)
        {
            menubuilder = (MenuBuilder)menu;
        }
        if (menubuilder != null)
        {
            menubuilder.stopDispatchingItemsChanged();
        }
        menu.clear();
        if (!mWindowCallback.onCreatePanelMenu(0, menu) || !mWindowCallback.onPreparePanel(0, null, menu))
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

    public void setDefaultDisplayHomeAsUpEnabled(boolean flag)
    {
    }

    public void setDisplayHomeAsUpEnabled(boolean flag)
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

    public void setDisplayOptions(int i, int j)
    {
        int k = mDecorToolbar.getDisplayOptions();
        mDecorToolbar.setDisplayOptions(i & j | ~j & k);
    }

    public void setElevation(float f)
    {
        ViewCompat.setElevation(mDecorToolbar.getViewGroup(), f);
    }

    public void setHomeActionContentDescription(int i)
    {
        mDecorToolbar.setNavigationContentDescription(i);
    }

    public void setHomeAsUpIndicator(Drawable drawable)
    {
        mDecorToolbar.setNavigationIcon(drawable);
    }

    public void setHomeButtonEnabled(boolean flag)
    {
    }

    public void setIcon(int i)
    {
        mDecorToolbar.setIcon(i);
    }

    public void setShowHideAnimationEnabled(boolean flag)
    {
    }

    public void setTitle(int i)
    {
        DecorToolbar decortoolbar = mDecorToolbar;
        CharSequence charsequence;
        if (i != 0)
        {
            charsequence = mDecorToolbar.getContext().getText(i);
        } else
        {
            charsequence = null;
        }
        decortoolbar.setTitle(charsequence);
    }

    public void setTitle(CharSequence charsequence)
    {
        mDecorToolbar.setTitle(charsequence);
    }

    public void setWindowTitle(CharSequence charsequence)
    {
        mDecorToolbar.setWindowTitle(charsequence);
    }




/*
    static boolean access$202(ToolbarActionBar toolbaractionbar, boolean flag)
    {
        toolbaractionbar.mToolbarMenuPrepared = flag;
        return flag;
    }

*/


}
