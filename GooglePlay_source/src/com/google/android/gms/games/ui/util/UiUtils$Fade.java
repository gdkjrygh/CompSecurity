// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.gms.common.util.PlatformVersion;

// Referenced classes of package com.google.android.gms.games.ui.util:
//            UiUtils

public static final class 
{

    public static void show(View view)
    {
        if (PlatformVersion.checkVersion(14)) goto _L2; else goto _L1
_L1:
        view.setVisibility(0);
_L4:
        return;
_L2:
        if (view.getVisibility() != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag;
        if (view.getTag(0x7f0d0020) == "fading_out")
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        view.animate().cancel();
        view.setTag(0x7f0d0020, null);
        view.setAlpha(0.0F);
        view.setVisibility(0);
        view.animate().setDuration(250L);
        view.animate().alpha(1.0F);
        return;
    }
}
