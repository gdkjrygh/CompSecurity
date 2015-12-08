// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.ui.systemui;

import android.app.ActionBar;
import android.app.Activity;

// Referenced classes of package com.nbcsports.liveextra.library.ui.systemui:
//            SystemUiHelperImplICS

class SystemUiHelperImplJB extends SystemUiHelperImplICS
{

    SystemUiHelperImplJB(Activity activity, int i, int j, SystemUiHelper.OnVisibilityChangeListener onvisibilitychangelistener)
    {
        super(activity, i, j, onvisibilitychangelistener);
    }

    protected int createHideFlags()
    {
        int j = super.createHideFlags();
        int i = j;
        if (mLevel >= 1)
        {
            j |= 0x504;
            i = j;
            if (mLevel >= 2)
            {
                i = j | 0x200;
            }
        }
        return i;
    }

    protected int createShowFlags()
    {
        int j = super.createShowFlags();
        int i = j;
        if (mLevel >= 1)
        {
            j |= 0x500;
            i = j;
            if (mLevel >= 2)
            {
                i = j | 0x200;
            }
        }
        return i;
    }

    protected void onSystemUiHidden()
    {
        if (mLevel == 0)
        {
            ActionBar actionbar = mActivity.getActionBar();
            if (actionbar != null)
            {
                actionbar.hide();
            }
        }
        setIsShowing(false);
    }

    protected void onSystemUiShown()
    {
        if (mLevel == 0)
        {
            ActionBar actionbar = mActivity.getActionBar();
            if (actionbar != null)
            {
                actionbar.show();
            }
        }
        setIsShowing(true);
    }
}
