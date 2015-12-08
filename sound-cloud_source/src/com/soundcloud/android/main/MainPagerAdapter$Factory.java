// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.support.v4.app.FragmentManager;

// Referenced classes of package com.soundcloud.android.main:
//            MainPagerAdapter, NavigationModel

public static class navigationModel
{

    private final NavigationModel navigationModel;

    public MainPagerAdapter create(FragmentManager fragmentmanager)
    {
        return new MainPagerAdapter(fragmentmanager, navigationModel);
    }

    public (NavigationModel navigationmodel)
    {
        navigationModel = navigationmodel;
    }
}
