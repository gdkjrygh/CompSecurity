// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.you;

import android.support.v4.app.Fragment;
import com.soundcloud.android.main.BaseNavigationTarget;
import com.soundcloud.android.main.Screen;

// Referenced classes of package com.soundcloud.android.you:
//            YouFragment

public class YouNavigationTarget extends BaseNavigationTarget
{

    public YouNavigationTarget()
    {
        super(0x7f0701fc, 0x7f02024f);
    }

    public Fragment createFragment()
    {
        return new YouFragment();
    }

    public Screen getScreen()
    {
        return Screen.YOU;
    }
}
