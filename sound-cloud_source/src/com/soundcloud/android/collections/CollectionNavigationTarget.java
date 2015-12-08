// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.support.v4.app.Fragment;
import com.soundcloud.android.main.BaseNavigationTarget;
import com.soundcloud.android.main.Screen;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionsFragment

public class CollectionNavigationTarget extends BaseNavigationTarget
{

    public CollectionNavigationTarget()
    {
        super(0x7f0701f3, 0x7f020246);
    }

    public Fragment createFragment()
    {
        return new CollectionsFragment();
    }

    public Screen getScreen()
    {
        return Screen.COLLECTIONS;
    }
}
