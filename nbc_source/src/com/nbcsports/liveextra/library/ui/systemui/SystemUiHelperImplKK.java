// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.ui.systemui;

import android.app.Activity;

// Referenced classes of package com.nbcsports.liveextra.library.ui.systemui:
//            SystemUiHelperImplJB

class SystemUiHelperImplKK extends SystemUiHelperImplJB
{

    SystemUiHelperImplKK(Activity activity, int i, int j, SystemUiHelper.OnVisibilityChangeListener onvisibilitychangelistener)
    {
        super(activity, i, j, onvisibilitychangelistener);
    }

    protected int createHideFlags()
    {
        int j = super.createHideFlags();
        int i = j;
        if (mLevel == 3)
        {
            if ((mFlags & 2) != 0)
            {
                i = 4096;
            } else
            {
                i = 2048;
            }
            i = j | i;
        }
        return i;
    }
}
