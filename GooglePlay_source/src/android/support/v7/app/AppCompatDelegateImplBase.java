// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.internal.app.WindowDecorActionBar;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v7.internal.view.WindowCallbackWrapper;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.widget.TintTypedArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegate, ActionBar, AppCompatCallback

abstract class AppCompatDelegateImplBase extends AppCompatDelegate
{
    private final class ActionBarDrawableToggleImpl
        implements ActionBarDrawerToggle.Delegate
    {

        final AppCompatDelegateImplBase this$0;

        public final Context getActionBarThemedContext()
        {
            return AppCompatDelegateImplBase.this.getActionBarThemedContext();
        }

        public final Drawable getThemeUpIndicator()
        {
            TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(AppCompatDelegateImplBase.this.getActionBarThemedContext(), null, new int[] {
                0x7f01011b
            });
            Drawable drawable = tinttypedarray.getDrawable(0);
            tinttypedarray.mWrapped.recycle();
            return drawable;
        }

        public final boolean isNavigationVisible()
        {
            ActionBar actionbar = getSupportActionBar();
            return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
        }

        public final void setActionBarDescription(int i)
        {
            ActionBar actionbar = getSupportActionBar();
            if (actionbar != null)
            {
                actionbar.setHomeActionContentDescription(i);
            }
        }

        public final void setActionBarUpIndicator(Drawable drawable, int i)
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

        ActionBarDrawableToggleImpl(byte byte0)
        {
            this();
        }
    }

    class AppCompatWindowCallbackBase extends WindowCallbackWrapper
    {

        final AppCompatDelegateImplBase this$0;

        public boolean dispatchKeyEvent(KeyEvent keyevent)
        {
            if (super.dispatchKeyEvent(keyevent))
            {
                return true;
            } else
            {
                return AppCompatDelegateImplBase.this.dispatchKeyEvent(keyevent);
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
            if (onMenuOpened$2fef5512(i))
            {
                return true;
            } else
            {
                return super.onMenuOpened(i, menu);
            }
        }

        public void onPanelClosed(int i, Menu menu)
        {
            if (onPanelClosed$2fef5512(i))
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
                    menubuilder.mOverrideVisibleItems = true;
                }
                boolean flag1 = super.onPreparePanel(i, view, menu);
                flag = flag1;
                if (menubuilder != null)
                {
                    menubuilder.mOverrideVisibleItems = false;
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


    ActionBar mActionBar;
    final AppCompatCallback mAppCompatCallback;
    final Context mContext;
    boolean mHasActionBar;
    boolean mIsDestroyed;
    boolean mIsFloating;
    private MenuInflater mMenuInflater;
    final android.view.Window.Callback mOriginalWindowCallback;
    boolean mOverlayActionBar;
    boolean mOverlayActionMode;
    CharSequence mTitle;
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
            mWindow.setCallback(wrapWindowCallback(mOriginalWindowCallback));
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
        return new ActionBarDrawableToggleImpl((byte)0);
    }

    public final MenuInflater getMenuInflater()
    {
        if (mMenuInflater == null)
        {
            mMenuInflater = new SupportMenuInflater(getActionBarThemedContext());
        }
        return mMenuInflater;
    }

    public final ActionBar getSupportActionBar()
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

    public void onCreate(Bundle bundle)
    {
        bundle = mContext.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.Theme);
        if (!bundle.hasValue(2))
        {
            bundle.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (bundle.getBoolean(2, false))
        {
            mHasActionBar = true;
        }
        if (bundle.getBoolean(4, false))
        {
            mOverlayActionBar = true;
        }
        if (bundle.getBoolean(5, false))
        {
            mOverlayActionMode = true;
        }
        mIsFloating = bundle.getBoolean(0, false);
        mWindowNoTitle = bundle.getBoolean(3, false);
        bundle.recycle();
    }

    public final void onDestroy()
    {
        mIsDestroyed = true;
    }

    abstract boolean onKeyShortcut(int i, KeyEvent keyevent);

    abstract boolean onMenuOpened$2fef5512(int i);

    abstract boolean onPanelClosed$2fef5512(int i);

    abstract void onTitleChanged(CharSequence charsequence);

    public final void setTitle(CharSequence charsequence)
    {
        mTitle = charsequence;
        onTitleChanged(charsequence);
    }

    android.view.Window.Callback wrapWindowCallback(android.view.Window.Callback callback)
    {
        return new AppCompatWindowCallbackBase(callback);
    }
}
