// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.activities:
//            ActivitiesAdapter, ActivityItemRenderer

public final class  extends b
    implements a, Provider
{

    private b itemRenderer;
    private b supertype;

    public final void attach(l l1)
    {
        itemRenderer = l1.a("com.soundcloud.android.activities.ActivityItemRenderer", com/soundcloud/android/activities/ActivitiesAdapter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.PagingRecyclerItemAdapter", com/soundcloud/android/activities/ActivitiesAdapter, getClass().getClassLoader(), false);
    }

    public final ActivitiesAdapter get()
    {
        ActivitiesAdapter activitiesadapter = new ActivitiesAdapter((ActivityItemRenderer)itemRenderer.get());
        injectMembers(activitiesadapter);
        return activitiesadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(itemRenderer);
        set1.add(supertype);
    }

    public final void injectMembers(ActivitiesAdapter activitiesadapter)
    {
        supertype.injectMembers(activitiesadapter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ActivitiesAdapter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.activities.ActivitiesAdapter", "members/com.soundcloud.android.activities.ActivitiesAdapter", false, com/soundcloud/android/activities/ActivitiesAdapter);
    }
}
