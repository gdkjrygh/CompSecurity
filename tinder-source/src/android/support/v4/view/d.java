// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class d
{
    public static interface a
    {

        public abstract void onSubUiVisibilityChanged(boolean flag);
    }

    public static interface b
    {

        public abstract void a();
    }


    private static final String TAG = "ActionProvider(support)";
    private final Context mContext;
    private a mSubUiVisibilityListener;
    private b mVisibilityListener;

    public d(Context context)
    {
        mContext = context;
    }

    public Context getContext()
    {
        return mContext;
    }

    public boolean hasSubMenu()
    {
        return false;
    }

    public boolean isVisible()
    {
        return true;
    }

    public abstract View onCreateActionView();

    public View onCreateActionView(MenuItem menuitem)
    {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction()
    {
        return false;
    }

    public void onPrepareSubMenu(SubMenu submenu)
    {
    }

    public boolean overridesItemVisibility()
    {
        return false;
    }

    public void refreshVisibility()
    {
        if (mVisibilityListener != null && overridesItemVisibility())
        {
            b b1 = mVisibilityListener;
            isVisible();
            b1.a();
        }
    }

    public void reset()
    {
        mVisibilityListener = null;
        mSubUiVisibilityListener = null;
    }

    public void setSubUiVisibilityListener(a a1)
    {
        mSubUiVisibilityListener = a1;
    }

    public void setVisibilityListener(b b1)
    {
        if (mVisibilityListener != null && b1 != null)
        {
            Log.w("ActionProvider(support)", (new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ")).append(getClass().getSimpleName()).append(" instance while it is still in use somewhere else?").toString());
        }
        mVisibilityListener = b1;
    }

    public void subUiVisibilityChanged(boolean flag)
    {
        if (mSubUiVisibilityListener != null)
        {
            mSubUiVisibilityListener.onSubUiVisibilityChanged(flag);
        }
    }
}
