// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.explore:
//            ExploreGenresAdapter, GenreCellRenderer

public final class  extends b
    implements a, Provider
{

    private b cellRenderer;
    private b supertype;

    public final void attach(l l1)
    {
        cellRenderer = l1.a("com.soundcloud.android.explore.GenreCellRenderer", com/soundcloud/android/explore/ExploreGenresAdapter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.ListItemAdapter", com/soundcloud/android/explore/ExploreGenresAdapter, getClass().getClassLoader(), false);
    }

    public final ExploreGenresAdapter get()
    {
        ExploreGenresAdapter exploregenresadapter = new ExploreGenresAdapter((GenreCellRenderer)cellRenderer.get());
        injectMembers(exploregenresadapter);
        return exploregenresadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(cellRenderer);
        set1.add(supertype);
    }

    public final void injectMembers(ExploreGenresAdapter exploregenresadapter)
    {
        supertype.injectMembers(exploregenresadapter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ExploreGenresAdapter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.explore.ExploreGenresAdapter", "members/com.soundcloud.android.explore.ExploreGenresAdapter", false, com/soundcloud/android/explore/ExploreGenresAdapter);
    }
}
