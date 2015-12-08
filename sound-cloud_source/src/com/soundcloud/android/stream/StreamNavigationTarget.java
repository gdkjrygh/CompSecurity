// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.support.v4.app.Fragment;
import com.soundcloud.android.main.BaseNavigationTarget;
import com.soundcloud.android.main.Screen;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamFragment

public class StreamNavigationTarget extends BaseNavigationTarget
{

    public StreamNavigationTarget()
    {
        super(0x7f0701f5, 0x7f02024a);
    }

    public Fragment createFragment()
    {
        return new SoundStreamFragment();
    }

    public Screen getScreen()
    {
        return Screen.STREAM;
    }
}
