// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.main:
//            NavigationModel

public final class I extends b
    implements Provider
{

    private b navigationModel;

    public final void attach(l l1)
    {
        navigationModel = l1.a("com.soundcloud.android.main.NavigationModel", com/soundcloud/android/main/MainPagerAdapter$Factory, getClass().getClassLoader());
    }

    public final navigationModel get()
    {
        return new navigationModel((NavigationModel)navigationModel.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(navigationModel);
    }

    public I()
    {
        super("com.soundcloud.android.main.MainPagerAdapter$Factory", "members/com.soundcloud.android.main.MainPagerAdapter$Factory", false, com/soundcloud/android/main/MainPagerAdapter$Factory);
    }
}
