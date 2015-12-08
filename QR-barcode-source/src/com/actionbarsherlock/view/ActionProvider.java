// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.view;

import android.content.Context;
import android.view.View;

// Referenced classes of package com.actionbarsherlock.view:
//            SubMenu

public abstract class ActionProvider
{
    public static interface SubUiVisibilityListener
    {

        public abstract void onSubUiVisibilityChanged(boolean flag);
    }


    private SubUiVisibilityListener mSubUiVisibilityListener;

    public ActionProvider(Context context)
    {
    }

    public boolean hasSubMenu()
    {
        return false;
    }

    public abstract View onCreateActionView();

    public boolean onPerformDefaultAction()
    {
        return false;
    }

    public void onPrepareSubMenu(SubMenu submenu)
    {
    }

    public void setSubUiVisibilityListener(SubUiVisibilityListener subuivisibilitylistener)
    {
        mSubUiVisibilityListener = subuivisibilitylistener;
    }

    public void subUiVisibilityChanged(boolean flag)
    {
        if (mSubUiVisibilityListener != null)
        {
            mSubUiVisibilityListener.onSubUiVisibilityChanged(flag);
        }
    }
}
