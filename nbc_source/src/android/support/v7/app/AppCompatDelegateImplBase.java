// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.internal.app.WindowDecorActionBar;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v7.internal.view.WindowCallbackWrapper;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.widget.TintTypedArray;
import android.support.v7.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegate, ActionBar, AppCompatCallback

abstract class AppCompatDelegateImplBase extends AppCompatDelegate
{
    private class ActionBarDrawableToggleImpl
        implements ActionBarDrawerToggle.Delegate
    {

        final AppCompatDelegateImplBase this$0;

        public Context getActionBarThemedContext()
        {
            return AppCompatDelegateImplBase.this.getActionBarThemedContext();
        }

        public Drawable getThemeUpIndicator()
        {
            TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(getActionBarThemedContext(), null, new int[] {
                android.support.v7.appcompat.R.attr.homeAsUpIndicator
            });
            Drawable drawable = tinttypedarray.getDrawable(0);
            tinttypedarray.recycle();
            return drawable;
        }

        public boolean isNavigationVisible()
        {
            ActionBar actionbar = getSupportActionBar();
            return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
        }

        public void setActionBarDescription(int i)
        {
            ActionBar actionbar = getSupportActionBar();
            if (actionbar != null)
            {
                actionbar.setHomeActionContentDescription(i);
            }
        }

        public void setActionBarUpIndicator(Drawable drawable, int i)
        {
            ActionBar actionbar = getSupportActionBar();
            if (actionbar != null)
            {
                actionbar.setHomeAsUpIndicator(drawable);
                actionbar.setHomeActionContentDescription(i);
            }
        }

        private ActionBarDrawableToggleImpl()
        {
            this$0 = AppCompatDelegateImplBase.this;
            super();
        }

    }

    class AppCompatWindowCallbackBase extends WindowCallbackWrapper
    {

        final AppCompatDelegateImplBase this$0;

        public boolean dispatchKeyEvent(KeyEvent keyevent)
        {
            if (AppCompatDelegateImplBase.this.dispatchKeyEvent(keyevent))
            {
                return true;
            } else
            {
                return super.dispatchKeyEvent(keyevent);
            }
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
        {
            if (onKeyShortcut(keyevent.getKeyCode(), keyevent))
            {
                return true;
            } else
            {
                return super.dispatchKeyShortcutEvent(keyevent);
            }
        }

        public void onContentChanged()
        {
        }

        public boolean onCreatePanelMenu(int i, Menu menu)
        {
            if (i == 0 && !(menu instanceof MenuBuilder))
            {
                return false;
            } else
            {
                return super.onCreatePanelMenu(i, menu);
            }
        }

        public boolean onMenuOpened(int i, Menu menu)
        {
            if (AppCompatDelegateImplBase.this.onMenuOpened(i, menu))
            {
                return true;
            } else
            {
                return super.onMenuOpened(i, menu);
            }
        }

        public void onPanelClosed(int i, Menu menu)
        {
            if (AppCompatDelegateImplBase.this.onPanelClosed(i, menu))
            {
                return;
            } else
            {
                super.onPanelClosed(i, menu);
                return;
            }
        }

        public boolean onPreparePanel(int i, View view, Menu menu)
        {
            MenuBuilder menubuilder;
            boolean flag;
            if (menu instanceof MenuBuilder)
            {
                menubuilder = (MenuBuilder)menu;
            } else
            {
                menubuilder = null;
            }
            if (i == 0 && menubuilder == null)
            {
                flag = false;
            } else
            {
                if (menubuilder != null)
                {
                    menubuilder.setOverrideVisibleItems(true);
                }
                boolean flag1 = super.onPreparePanel(i, view, menu);
                flag = flag1;
                if (menubuilder != null)
                {
                    menubuilder.setOverrideVisibleItems(false);
                    return flag1;
                }
            }
            return flag;
        }

        AppCompatWindowCallbackBase(android.view.Window.Callback callback)
        {
            this$0 = AppCompatDelegateImplBase.this;
            super(callback);
        }
    }


    private ActionBar mActionBar;
    final AppCompatCallback mAppCompatCallback;
    final android.view.Window.Callback mAppCompatWindowCallback;
    final Context mContext;
    boolean mHasActionBar;
    private boolean mIsDestroyed;
    boolean mIsFloating;
    private MenuInflater mMenuInflater;
    final android.view.Window.Callback mOriginalWindowCallback;
    boolean mOverlayActionBar;
    boolean mOverlayActionMode;
    private CharSequence mTitle;
    final Window mWindow;
    boolean mWindowNoTitle;

    AppCompatDelegateImplBase(Context context, Window window, AppCompatCallback appcompatcallback)
    {
        mContext = context;
        mWindow = window;
        mAppCompatCallback = appcompatcallback;
        mOriginalWindowCallback = mWindow.getCallback();
        if (mOriginalWindowCallback instanceof AppCompatWindowCallbackBase)
        {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        } else
        {
            mAppCompatWindowCallback = wrapWindowCallback(mOriginalWindowCallback);
            mWindow.setCallback(mAppCompatWindowCallback);
            return;
        }
    }

    abstract ActionBar createSupportActionBar();

    abstract boolean dispatchKeyEvent(KeyEvent keyevent);

    final Context getActionBarThemedContext()
    {
        Context context = null;
        Object obj = getSupportActionBar();
        if (obj != null)
        {
            context = ((ActionBar) (obj)).getThemedContext();
        }
        obj = context;
        if (context == null)
        {
            obj = mContext;
        }
        return ((Context) (obj));
    }

    public final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
    {
        return new ActionBarDrawableToggleImpl();
    }

    public MenuInflater getMenuInflater()
    {
        if (mMenuInflater == null)
        {
            mMenuInflater = new SupportMenuInflater(getActionBarThemedContext());
        }
        return mMenuInflater;
    }

    public ActionBar getSupportActionBar()
    {
        if (!mHasActionBar) goto _L2; else goto _L1
_L1:
        if (mActionBar == null)
        {
            mActionBar = createSupportActionBar();
        }
_L4:
        return mActionBar;
_L2:
        if (mActionBar instanceof WindowDecorActionBar)
        {
            mActionBar = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final CharSequence getTitle()
    {
        if (mOriginalWindowCallback instanceof Activity)
        {
            return ((Activity)mOriginalWindowCallback).getTitle();
        } else
        {
            return mTitle;
        }
    }

    final android.view.Window.Callback getWindowCallback()
    {
        return mWindow.getCallback();
    }

    final boolean isDestroyed()
    {
        return mIsDestroyed;
    }

    public void onCreate(Bundle bundle)
    {
        bundle = mContext.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.Theme);
        if (!bundle.hasValue(android.support.v7.appcompat.R.styleable.Theme_windowActionBar))
        {
            bundle.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (bundle.getBoolean(android.support.v7.appcompat.R.styleable.Theme_windowActionBar, false))
        {
            mHasActionBar = true;
        }
        if (bundle.getBoolean(android.support.v7.appcompat.R.styleable.Theme_windowActionBarOverlay, false))
        {
            mOverlayActionBar = true;
        }
        if (bundle.getBoolean(android.support.v7.appcompat.R.styleable.Theme_windowActionModeOverlay, false))
        {
            mOverlayActionMode = true;
        }
        mIsFloating = bundle.getBoolean(android.support.v7.appcompat.R.styleable.Theme_android_windowIsFloating, false);
        mWindowNoTitle = bundle.getBoolean(android.support.v7.appcompat.R.styleable.Theme_windowNoTitle, false);
        bundle.recycle();
    }

    public final void onDestroy()
    {
        mIsDestroyed = true;
    }

    abstract boolean onKeyShortcut(int i, KeyEvent keyevent);

    abstract boolean onMenuOpened(int i, Menu menu);

    abstract boolean onPanelClosed(int i, Menu menu);

    abstract void onTitleChanged(CharSequence charsequence);

    final ActionBar peekSupportActionBar()
    {
        return mActionBar;
    }

    final void setSupportActionBar(ActionBar actionbar)
    {
        mActionBar = actionbar;
    }

    public final void setTitle(CharSequence charsequence)
    {
        mTitle = charsequence;
        onTitleChanged(charsequence);
    }

    abstract ActionMode startSupportActionModeFromWindow(android.support.v7.view.ActionMode.Callback callback);

    android.view.Window.Callback wrapWindowCallback(android.view.Window.Callback callback)
    {
        return new AppCompatWindowCallbackBase(callback);
    }
}
