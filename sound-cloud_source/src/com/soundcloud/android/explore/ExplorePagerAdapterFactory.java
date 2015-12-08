// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import android.content.res.Resources;
import android.support.v4.app.FragmentManager;

// Referenced classes of package com.soundcloud.android.explore:
//            ExplorePagerAdapter

public class ExplorePagerAdapterFactory
{

    private final Resources resources;

    public ExplorePagerAdapterFactory(Resources resources1)
    {
        resources = resources1;
    }

    public ExplorePagerAdapter create(FragmentManager fragmentmanager)
    {
        return new ExplorePagerAdapter(resources, fragmentmanager);
    }
}
