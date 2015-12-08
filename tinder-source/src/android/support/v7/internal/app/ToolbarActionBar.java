// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.x;
import android.support.v7.app.ActionBar;
import android.support.v7.internal.view.WindowCallbackWrapper;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.widget.DecorToolbar;
import android.support.v7.internal.widget.ToolbarWidgetWrapper;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.app:
//            NavItemSelectedListener

public class ToolbarActionBar extends ActionBar
{
    private final class ActionMenuPresenterCallback
        implements android.support.v7.internal.view.menu.l.a
    {

        private boolean mClosingActionMenu;
        final ToolbarActionBar this$0;

        public final void onCloseMenu(f f1, boolean flag)
        {
            if (mClosingActionMenu)
            {
                return;
            }
            mClosingActionMenu = true;
            mDecorToolbar.dismissPopupMenus();
            if (mWindowCallback != null)
            {
                mWindowCallback.onPanelClosed(108, f1);
            }
            mClosingActionMenu = false;
        }

        public final boolean onOpenSubMenu(f f1)
        {
            if (mWindowCallback != null)
            {
                mWindowCallback.onMenuOpened(108, f1);
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
        implements android.support.v7.internal.view.menu.f.a
    {

        final ToolbarActionBar this$0;

        public final boolean onMenuItemSelected(f f1, MenuItem menuitem)
        {
            return false;
        }

        public final void onMenuModeChange(f f1)
        {
            if (mWindowCallback != null)
            {
                if (mDecorToolbar.isOverflowMenuShowing())
                {
                    mWindowCallback.onPanelClosed(108, f1);
                } else
                if (mWindowCallback.onPreparePanel(0, null, f1))
                {
                    mWindowCallback.onMenuOpened(108, f1);
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
        implements android.support.v7.internal.view.menu.l.a
    {

        final ToolbarActionBar this$0;

        public final void onCloseMenu(f f1, boolean flag)
        {
            if (mWindowCallback != null)
            {
                mWindowCallback.onPanelClosed(0, f1);
            }
        }

        public final boolean onOpenSubMenu(f f1)
        {
            if (f1 == null && mWindowCallback != null)
            {
                mWindowCallback.onMenuOpened(0, f1);
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
    private e mListMenuPresenter;
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
    private android.view.Window.Callback mWindowCallback;

    public ToolbarActionBar(Toolbar toolbar, CharSequence charsequence, android.view.Window.Callback callback)
    {
        mMenuVisibilityListeners = new ArrayList();
        mDecorToolbar = new ToolbarWidgetWrapper(toolbar, false);
        mWindowCallback = new ToolbarCallbackWrapper(callback);
        mDecorToolbar.setWindowCallback(mWindowCallback);
        toolbar.setOnMenuItemClickListener(mMenuClicker);
        mDecorToolbar.setWindowTitle(charsequence);
    }

    private void ensureListMenuPresenter(Menu menu)
    {
        if (mListMenuPresenter == null && (menu instanceof f))
        {
            menu = (f)menu;
            Object obj = mDecorToolbar.getContext();
            TypedValue typedvalue = new TypedValue();
            android.content.res.Resources.Theme theme = ((Context) (obj)).getResources().newTheme();
            theme.setTo(((Context) (obj)).getTheme());
            theme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarPopupTheme, typedvalue, true);
            if (typedvalue.resourceId != 0)
            {
                theme.applyStyle(typedvalue.resourceId, true);
            }
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
            mListMenuPresenter = new e(((Context) (obj)), android.support.v7.appcompat.R.layout.abc_list_menu_item_layout);
            mListMenuPresenter.g = new PanelMenuPresenterCallback();
            menu.a(mListMenuPresenter);
        }
    }

    private View getListMenuView(Menu menu)
    {
        ensureListMenuPresenter(menu);
        while (menu == null || mListMenuPresenter == null || mListMenuPresenter.a().getCount() <= 0) 
        {
            return null;
        }
        return (View)mListMenuPresenter.a(mDecorToolbar.getViewGroup());
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

    public void addOnMenuVisibilityListener(android.support.v7.app.ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        mMenuVisibilityListeners.add(onmenuvisibilitylistener);
    }

    public void addTab(android.support.v7.app.ActionBar.Tab tab)
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void addTab(android.support.v7.app.ActionBar.Tab tab, int i)
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void addTab(android.support.v7.app.ActionBar.Tab tab, int i, boolean flag)
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void addTab(android.support.v7.app.ActionBar.Tab tab, boolean flag)
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
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

    public View getCustomView()
    {
        return mDecorToolbar.getCustomView();
    }

    public int getDisplayOptions()
    {
        return mDecorToolbar.getDisplayOptions();
    }

    public float getElevation()
    {
        return x.u(mDecorToolbar.getViewGroup());
    }

    public int getHeight()
    {
        return mDecorToolbar.getHeight();
    }

    public int getNavigationItemCount()
    {
        return 0;
    }

    public int getNavigationMode()
    {
        return 0;
    }

    public int getSelectedNavigationIndex()
    {
        return -1;
    }

    public android.support.v7.app.ActionBar.Tab getSelectedTab()
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public CharSequence getSubtitle()
    {
        return mDecorToolbar.getSubtitle();
    }

    public android.support.v7.app.ActionBar.Tab getTabAt(int i)
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public int getTabCount()
    {
        return 0;
    }

    public Context getThemedContext()
    {
        return mDecorToolbar.getContext();
    }

    public CharSequence getTitle()
    {
        return mDecorToolbar.getTitle();
    }

    public android.view.Window.Callback getWrappedWindowCallback()
    {
        return mWindowCallback;
    }

    public void hide()
    {
        mDecorToolbar.setVisibility(8);
    }

    public boolean invalidateOptionsMenu()
    {
        mDecorToolbar.getViewGroup().removeCallbacks(mMenuInvalidator);
        x.a(mDecorToolbar.getViewGroup(), mMenuInvalidator);
        return true;
    }

    public boolean isShowing()
    {
        return mDecorToolbar.getVisibility() == 0;
    }

    public boolean isTitleTruncated()
    {
        return super.isTitleTruncated();
    }

    public android.support.v7.app.ActionBar.Tab newTab()
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public boolean onKeyShortcut(int i, KeyEvent keyevent)
    {
        Menu menu = getMenu();
        if (menu != null)
        {
            int j;
            boolean flag;
            if (keyevent != null)
            {
                j = keyevent.getDeviceId();
            } else
            {
                j = -1;
            }
            if (KeyCharacterMap.load(j).getKeyboardType() != 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            menu.setQwertyMode(flag);
            menu.performShortcut(i, keyevent, 0);
        }
        return true;
    }

    public boolean onMenuKeyEvent(KeyEvent keyevent)
    {
        if (keyevent.getAction() == 1)
        {
            openOptionsMenu();
        }
        return true;
    }

    public boolean openOptionsMenu()
    {
        return mDecorToolbar.showOverflowMenu();
    }

    void populateOptionsMenu()
    {
        f f1;
        Menu menu = getMenu();
        if (menu instanceof f)
        {
            f1 = (f)menu;
        } else
        {
            f1 = null;
        }
        if (f1 != null)
        {
            f1.d();
        }
        menu.clear();
        if (!mWindowCallback.onCreatePanelMenu(0, menu) || !mWindowCallback.onPreparePanel(0, null, menu))
        {
            menu.clear();
        }
        if (f1 != null)
        {
            f1.e();
        }
        return;
        Exception exception;
        exception;
        if (f1 != null)
        {
            f1.e();
        }
        throw exception;
    }

    public void removeAllTabs()
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void removeOnMenuVisibilityListener(android.support.v7.app.ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        mMenuVisibilityListeners.remove(onmenuvisibilitylistener);
    }

    public void removeTab(android.support.v7.app.ActionBar.Tab tab)
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void removeTabAt(int i)
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void selectTab(android.support.v7.app.ActionBar.Tab tab)
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        mDecorToolbar.setBackgroundDrawable(drawable);
    }

    public void setCustomView(int i)
    {
        setCustomView(LayoutInflater.from(mDecorToolbar.getContext()).inflate(i, mDecorToolbar.getViewGroup(), false));
    }

    public void setCustomView(View view)
    {
        setCustomView(view, new android.support.v7.app.ActionBar.LayoutParams(-2, -2));
    }

    public void setCustomView(View view, android.support.v7.app.ActionBar.LayoutParams layoutparams)
    {
        if (view != null)
        {
            view.setLayoutParams(layoutparams);
        }
        mDecorToolbar.setCustomView(view);
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

    public void setDisplayOptions(int i)
    {
        setDisplayOptions(i, -1);
    }

    public void setDisplayOptions(int i, int j)
    {
        int k = mDecorToolbar.getDisplayOptions();
        mDecorToolbar.setDisplayOptions(k & ~j | i & j);
    }

    public void setDisplayShowCustomEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 16;
        } else
        {
            byte0 = 0;
        }
        setDisplayOptions(byte0, 16);
    }

    public void setDisplayShowHomeEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        setDisplayOptions(byte0, 2);
    }

    public void setDisplayShowTitleEnabled(boolean flag)
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

    public void setDisplayUseLogoEnabled(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        setDisplayOptions(i, 1);
    }

    public void setElevation(float f1)
    {
        x.f(mDecorToolbar.getViewGroup(), f1);
    }

    public void setHomeActionContentDescription(int i)
    {
        mDecorToolbar.setNavigationContentDescription(i);
    }

    public void setHomeActionContentDescription(CharSequence charsequence)
    {
        mDecorToolbar.setNavigationContentDescription(charsequence);
    }

    public void setHomeAsUpIndicator(int i)
    {
        mDecorToolbar.setNavigationIcon(i);
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

    public void setIcon(Drawable drawable)
    {
        mDecorToolbar.setIcon(drawable);
    }

    public void setListNavigationCallbacks(SpinnerAdapter spinneradapter, android.support.v7.app.ActionBar.OnNavigationListener onnavigationlistener)
    {
        mDecorToolbar.setDropdownParams(spinneradapter, new NavItemSelectedListener(onnavigationlistener));
    }

    public void setLogo(int i)
    {
        mDecorToolbar.setLogo(i);
    }

    public void setLogo(Drawable drawable)
    {
        mDecorToolbar.setLogo(drawable);
    }

    public void setNavigationMode(int i)
    {
        if (i == 2)
        {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        } else
        {
            mDecorToolbar.setNavigationMode(i);
            return;
        }
    }

    public void setSelectedNavigationItem(int i)
    {
        switch (mDecorToolbar.getNavigationMode())
        {
        default:
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");

        case 1: // '\001'
            mDecorToolbar.setDropdownSelectedPosition(i);
            break;
        }
    }

    public void setShowHideAnimationEnabled(boolean flag)
    {
    }

    public void setSplitBackgroundDrawable(Drawable drawable)
    {
    }

    public void setStackedBackgroundDrawable(Drawable drawable)
    {
    }

    public void setSubtitle(int i)
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
        decortoolbar.setSubtitle(charsequence);
    }

    public void setSubtitle(CharSequence charsequence)
    {
        mDecorToolbar.setSubtitle(charsequence);
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

    public void show()
    {
        mDecorToolbar.setVisibility(0);
    }




/*
    static boolean access$202(ToolbarActionBar toolbaractionbar, boolean flag)
    {
        toolbaractionbar.mToolbarMenuPrepared = flag;
        return flag;
    }

*/


}
