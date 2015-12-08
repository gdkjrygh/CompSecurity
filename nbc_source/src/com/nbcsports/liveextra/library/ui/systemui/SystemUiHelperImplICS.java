// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.ui.systemui;

import android.app.Activity;

// Referenced classes of package com.nbcsports.liveextra.library.ui.systemui:
//            SystemUiHelperImplHC

class SystemUiHelperImplICS extends SystemUiHelperImplHC
{

    SystemUiHelperImplICS(Activity activity, int i, int j, SystemUiHelper.OnVisibilityChangeListener onvisibilitychangelistener)
    {
        super(activity, i, j, onvisibilitychangelistener);
    }

    protected int createHideFlags()
    {
        int i = 1;
        if (mLevel >= 2)
        {
            i = 1 | 2;
        }
        return i;
    }

    protected int createShowFlags()
    {
        return 0;
    }

    protected int createTestFlags()
    {
        return mLevel < 2 ? 1 : 2;
    }
}
