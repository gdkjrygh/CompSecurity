// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.internal.ActionBarSherlockCompat;
import com.actionbarsherlock.internal.ActionBarSherlockNative;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public abstract class ActionBarSherlock
{
    public static interface Implementation
        extends Annotation
    {

        public static final int DEFAULT_API = -1;
        public static final int DEFAULT_DPI = -1;

        public abstract int api();

        public abstract int dpi();
    }

    public static interface OnActionModeFinishedListener
    {

        public abstract void onActionModeFinished(ActionMode actionmode);
    }

    public static interface OnActionModeStartedListener
    {

        public abstract void onActionModeStarted(ActionMode actionmode);
    }

    public static interface OnCreateOptionsMenuListener
    {

        public abstract boolean onCreateOptionsMenu(Menu menu);
    }

    public static interface OnCreatePanelMenuListener
    {

        public abstract boolean onCreatePanelMenu(int i, Menu menu);
    }

    public static interface OnMenuItemSelectedListener
    {

        public abstract boolean onMenuItemSelected(int i, MenuItem menuitem);
    }

    public static interface OnOptionsItemSelectedListener
    {

        public abstract boolean onOptionsItemSelected(MenuItem menuitem);
    }

    public static interface OnPrepareOptionsMenuListener
    {

        public abstract boolean onPrepareOptionsMenu(Menu menu);
    }

    public static interface OnPreparePanelListener
    {

        public abstract boolean onPreparePanel(int i, View view, Menu menu);
    }


    private static final Class CONSTRUCTOR_ARGS[];
    public static final boolean DEBUG = false;
    public static final int FLAG_DELEGATE = 1;
    private static final HashMap IMPLEMENTATIONS = new HashMap();
    protected static final String TAG = "ActionBarSherlock";
    protected final Activity mActivity;
    protected final boolean mIsDelegate;
    protected MenuInflater mMenuInflater;

    protected ActionBarSherlock(Activity activity, int i)
    {
        mActivity = activity;
        boolean flag;
        if ((i & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsDelegate = flag;
    }

    public static void registerImplementation(Class class1)
    {
        if (!class1.isAnnotationPresent(com/actionbarsherlock/ActionBarSherlock$Implementation))
        {
            throw new IllegalArgumentException((new StringBuilder("Class ")).append(class1.getSimpleName()).append(" is not annotated with @Implementation").toString());
        }
        if (IMPLEMENTATIONS.containsValue(class1))
        {
            return;
        } else
        {
            Implementation implementation = (Implementation)class1.getAnnotation(com/actionbarsherlock/ActionBarSherlock$Implementation);
            IMPLEMENTATIONS.put(implementation, class1);
            return;
        }
    }

    public static boolean unregisterImplementation(Class class1)
    {
        return IMPLEMENTATIONS.values().remove(class1);
    }

    public static ActionBarSherlock wrap(Activity activity)
    {
        return wrap(activity, 0);
    }

    public static ActionBarSherlock wrap(Activity activity, int i)
    {
        Object obj;
        Iterator iterator;
        int j;
        obj = new HashMap(IMPLEMENTATIONS);
        j = 0;
        iterator = ((HashMap) (obj)).keySet().iterator();
_L9:
        if (iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
_L10:
        if (j == 0) goto _L2; else goto _L1
_L1:
        int i1;
        if (activity.getResources().getDisplayMetrics().densityDpi == 213)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        iterator = ((HashMap) (obj)).keySet().iterator();
_L11:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        j = 0;
        iterator = ((HashMap) (obj)).keySet().iterator();
_L13:
        if (iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
_L14:
        if (j == 0) goto _L5; else goto _L4
_L4:
        i1 = android.os.Build.VERSION.SDK_INT;
        j = 0;
        iterator = ((HashMap) (obj)).keySet().iterator();
_L15:
        if (iterator.hasNext()) goto _L7; else goto _L6
_L6:
        iterator = ((HashMap) (obj)).keySet().iterator();
_L16:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_320;
        }
          goto _L5
        if (((Implementation)iterator.next()).dpi() != 213) goto _L9; else goto _L8
_L8:
        j = 1;
          goto _L10
_L3:
        int k = ((Implementation)iterator.next()).dpi();
        if (j != 0 && k != 213 || j == 0 && k == 213)
        {
            iterator.remove();
        }
          goto _L11
        if (((Implementation)iterator.next()).api() == -1) goto _L13; else goto _L12
_L12:
        j = 1;
          goto _L14
_L7:
        int l = ((Implementation)iterator.next()).api();
        if (l > i1)
        {
            iterator.remove();
        } else
        if (l > j)
        {
            j = l;
        }
          goto _L15
        if (((Implementation)iterator.next()).api() != j)
        {
            iterator.remove();
        }
          goto _L16
_L5:
        if (((HashMap) (obj)).size() > 1)
        {
            throw new IllegalStateException("More than one implementation matches configuration.");
        }
        if (((HashMap) (obj)).isEmpty())
        {
            throw new IllegalStateException("No implementations match configuration.");
        }
        obj = (Class)((HashMap) (obj)).values().iterator().next();
        activity = (ActionBarSherlock)((Class) (obj)).getConstructor(CONSTRUCTOR_ARGS).newInstance(new Object[] {
            activity, Integer.valueOf(i)
        });
        return activity;
        activity;
        throw new RuntimeException(activity);
        activity;
        throw new RuntimeException(activity);
        activity;
        throw new RuntimeException(activity);
        activity;
        throw new RuntimeException(activity);
        activity;
        throw new RuntimeException(activity);
          goto _L10
    }

    public abstract void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams);

    protected final boolean callbackCreateOptionsMenu(Menu menu)
    {
        boolean flag = true;
        if (mActivity instanceof OnCreatePanelMenuListener)
        {
            flag = ((OnCreatePanelMenuListener)mActivity).onCreatePanelMenu(0, menu);
        } else
        if (mActivity instanceof OnCreateOptionsMenuListener)
        {
            return ((OnCreateOptionsMenuListener)mActivity).onCreateOptionsMenu(menu);
        }
        return flag;
    }

    protected final boolean callbackOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = false;
        if (mActivity instanceof OnMenuItemSelectedListener)
        {
            flag = ((OnMenuItemSelectedListener)mActivity).onMenuItemSelected(0, menuitem);
        } else
        if (mActivity instanceof OnOptionsItemSelectedListener)
        {
            return ((OnOptionsItemSelectedListener)mActivity).onOptionsItemSelected(menuitem);
        }
        return flag;
    }

    protected final boolean callbackPrepareOptionsMenu(Menu menu)
    {
        boolean flag = true;
        if (mActivity instanceof OnPreparePanelListener)
        {
            flag = ((OnPreparePanelListener)mActivity).onPreparePanel(0, null, menu);
        } else
        if (mActivity instanceof OnPrepareOptionsMenuListener)
        {
            return ((OnPrepareOptionsMenuListener)mActivity).onPrepareOptionsMenu(menu);
        }
        return flag;
    }

    public boolean dispatchCloseOptionsMenu()
    {
        return false;
    }

    public void dispatchConfigurationChanged(Configuration configuration)
    {
    }

    public abstract boolean dispatchCreateOptionsMenu(android.view.Menu menu);

    public void dispatchDestroy()
    {
    }

    public abstract void dispatchInvalidateOptionsMenu();

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return false;
    }

    public boolean dispatchMenuOpened(int i, android.view.Menu menu)
    {
        return false;
    }

    public boolean dispatchOpenOptionsMenu()
    {
        return false;
    }

    public abstract boolean dispatchOptionsItemSelected(android.view.MenuItem menuitem);

    public void dispatchPanelClosed(int i, android.view.Menu menu)
    {
    }

    public void dispatchPause()
    {
    }

    public void dispatchPostCreate(Bundle bundle)
    {
    }

    public void dispatchPostResume()
    {
    }

    public abstract boolean dispatchPrepareOptionsMenu(android.view.Menu menu);

    public void dispatchRestoreInstanceState(Bundle bundle)
    {
    }

    public void dispatchSaveInstanceState(Bundle bundle)
    {
    }

    public void dispatchStop()
    {
    }

    public void dispatchTitleChanged(CharSequence charsequence, int i)
    {
    }

    public void ensureActionBar()
    {
    }

    public abstract ActionBar getActionBar();

    public MenuInflater getMenuInflater()
    {
        if (mMenuInflater == null)
        {
            if (getActionBar() != null)
            {
                mMenuInflater = new MenuInflater(getThemedContext(), mActivity);
            } else
            {
                mMenuInflater = new MenuInflater(mActivity);
            }
        }
        return mMenuInflater;
    }

    protected abstract Context getThemedContext();

    public abstract boolean hasFeature(int i);

    public abstract boolean requestFeature(int i);

    public abstract void setContentView(int i);

    public void setContentView(View view)
    {
        setContentView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    public abstract void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams);

    public abstract void setProgress(int i);

    public abstract void setProgressBarIndeterminate(boolean flag);

    public abstract void setProgressBarIndeterminateVisibility(boolean flag);

    public abstract void setProgressBarVisibility(boolean flag);

    public abstract void setSecondaryProgress(int i);

    public void setTitle(int i)
    {
        setTitle(((CharSequence) (mActivity.getString(i))));
    }

    public abstract void setTitle(CharSequence charsequence);

    public abstract void setUiOptions(int i);

    public abstract void setUiOptions(int i, int j);

    public abstract ActionMode startActionMode(com.actionbarsherlock.view.ActionMode.Callback callback);

    static 
    {
        CONSTRUCTOR_ARGS = (new Class[] {
            android/app/Activity, Integer.TYPE
        });
        registerImplementation(com/actionbarsherlock/internal/ActionBarSherlockCompat);
        registerImplementation(com/actionbarsherlock/internal/ActionBarSherlockNative);
    }
}
