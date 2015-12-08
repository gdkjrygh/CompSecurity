// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.internal.view.menu.ListMenuPresenter;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.widget.DecorToolbar;
import android.support.v7.internal.widget.ToolbarWidgetWrapper;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.WindowCallbackWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.app:
//            WindowCallback

public final class ToolbarActionBar extends ActionBar
{
    final class ActionMenuPresenterCallback
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
            mToolbar.dismissPopupMenus();
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

    }

    final class MenuBuilderCallback
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
                if (mToolbar.isOverflowMenuShowing())
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

    final class PanelMenuPresenterCallback
        implements android.support.v7.internal.view.menu.MenuPresenter.Callback
    {

        final ToolbarActionBar this$0;

        public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
            if (mWindowCallback != null)
            {
                mWindowCallback.onPanelClosed(0, menubuilder);
            }
            mWindow.closePanel(0);
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

    }

    final class ToolbarCallbackWrapper extends WindowCallbackWrapper
    {

        final ToolbarActionBar this$0;

        public final View onCreatePanelView(int i)
        {
            i;
            JVM INSTR tableswitch 0 0: default 20
        //                       0 26;
               goto _L1 _L2
_L1:
            return super.onCreatePanelView(i);
_L2:
            if (!mToolbarMenuPrepared)
            {
                populateOptionsMenu();
                mToolbar.removeCallbacks(mMenuInvalidator);
            }
            if (mToolbarMenuPrepared && mWindowCallback != null)
            {
                Menu menu = getMenu();
                if (mWindowCallback.onPreparePanel(i, null, menu) && mWindowCallback.onMenuOpened(i, menu))
                {
                    return getListMenuView(menu);
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

        public ToolbarCallbackWrapper(WindowCallback windowcallback)
        {
            this$0 = ToolbarActionBar.this;
            super(windowcallback);
        }
    }


    private DecorToolbar mDecorToolbar;
    private boolean mLastMenuVisibility;
    private ListMenuPresenter mListMenuPresenter;
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
            populateOptionsMenu();
        }

            
            {
                this$0 = ToolbarActionBar.this;
                super();
            }
    };
    private ArrayList mMenuVisibilityListeners;
    private Toolbar mToolbar;
    private boolean mToolbarMenuPrepared;
    private Window mWindow;
    private WindowCallback mWindowCallback;

    public ToolbarActionBar(Toolbar toolbar, CharSequence charsequence, Window window, WindowCallback windowcallback)
    {
        mMenuVisibilityListeners = new ArrayList();
        mToolbar = toolbar;
        mDecorToolbar = new ToolbarWidgetWrapper(toolbar, false);
        mWindowCallback = new ToolbarCallbackWrapper(windowcallback);
        mDecorToolbar.setWindowCallback(mWindowCallback);
        toolbar.setOnMenuItemClickListener(mMenuClicker);
        mDecorToolbar.setWindowTitle(charsequence);
        mWindow = window;
    }

    private View getListMenuView(Menu menu)
    {
        while (menu == null || mListMenuPresenter == null || mListMenuPresenter.getAdapter().getCount() <= 0) 
        {
            return null;
        }
        return (View)mListMenuPresenter.getMenuView(mToolbar);
    }

    private Menu getMenu()
    {
        if (!mMenuCallbackSet)
        {
            mToolbar.setMenuCallbacks(new ActionMenuPresenterCallback(), new MenuBuilderCallback());
            mMenuCallbackSet = true;
        }
        return mToolbar.getMenu();
    }

    public final void addOnMenuVisibilityListener(android.support.v7.app.ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        mMenuVisibilityListeners.add(onmenuvisibilitylistener);
    }

    public final boolean collapseActionView()
    {
        if (mToolbar.hasExpandedActionView())
        {
            mToolbar.collapseActionView();
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
                ((android.support.v7.app.ActionBar.OnMenuVisibilityListener)mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(flag);
                i++;
            }
        }
    }

    public final int getDisplayOptions()
    {
        return mDecorToolbar.getDisplayOptions();
    }

    public final Context getThemedContext()
    {
        return mToolbar.getContext();
    }

    public final WindowCallback getWrappedWindowCallback()
    {
        return mWindowCallback;
    }

    public final void hide()
    {
        mToolbar.setVisibility(8);
    }

    public final boolean invalidateOptionsMenu()
    {
        mToolbar.removeCallbacks(mMenuInvalidator);
        ViewCompat.postOnAnimation(mToolbar, mMenuInvalidator);
        return true;
    }

    public final void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    final void populateOptionsMenu()
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

    public final void setBackgroundDrawable(Drawable drawable)
    {
        mToolbar.setBackgroundDrawable(drawable);
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

    public final void setElevation(float f)
    {
        ViewCompat.setElevation(mToolbar, f);
    }

    public final void setHomeActionContentDescription(int i)
    {
        mDecorToolbar.setNavigationContentDescription(i);
    }

    public final void setHomeAsUpIndicator(Drawable drawable)
    {
        mToolbar.setNavigationIcon(drawable);
    }

    public final void setHomeButtonEnabled(boolean flag)
    {
    }

    public final void setListMenuPresenter(ListMenuPresenter listmenupresenter)
    {
        Object obj = getMenu();
        if (obj instanceof MenuBuilder)
        {
            obj = (MenuBuilder)obj;
            if (mListMenuPresenter != null)
            {
                mListMenuPresenter.setCallback(null);
                ((MenuBuilder) (obj)).removeMenuPresenter(mListMenuPresenter);
            }
            mListMenuPresenter = listmenupresenter;
            if (listmenupresenter != null)
            {
                listmenupresenter.setCallback(new PanelMenuPresenterCallback());
                ((MenuBuilder) (obj)).addMenuPresenter(listmenupresenter);
            }
        }
    }

    public final void setLogo(Drawable drawable)
    {
        mDecorToolbar.setLogo(drawable);
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

    public final void setWindowTitle(CharSequence charsequence)
    {
        mDecorToolbar.setWindowTitle(charsequence);
    }

    public final void show()
    {
        mToolbar.setVisibility(0);
    }

    public final ActionMode startActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        return mWindowCallback.startActionMode(callback);
    }





/*
    static boolean access$102(ToolbarActionBar toolbaractionbar, boolean flag)
    {
        toolbaractionbar.mToolbarMenuPrepared = flag;
        return flag;
    }

*/





}
