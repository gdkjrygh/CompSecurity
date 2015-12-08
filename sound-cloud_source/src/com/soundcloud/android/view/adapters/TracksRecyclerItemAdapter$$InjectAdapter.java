// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.view.adapters:
//            TracksRecyclerItemAdapter

public final class  extends b
    implements a, Provider
{

    private b supertype;

    public final void attach(l l1)
    {
        supertype = l1.a("members/com.soundcloud.android.presentation.RecyclerItemAdapter", com/soundcloud/android/view/adapters/TracksRecyclerItemAdapter, getClass().getClassLoader(), false);
    }

    public final TracksRecyclerItemAdapter get()
    {
        TracksRecyclerItemAdapter tracksrecycleritemadapter = new TracksRecyclerItemAdapter();
        injectMembers(tracksrecycleritemadapter);
        return tracksrecycleritemadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(supertype);
    }

    public final void injectMembers(TracksRecyclerItemAdapter tracksrecycleritemadapter)
    {
        supertype.injectMembers(tracksrecycleritemadapter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((TracksRecyclerItemAdapter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.view.adapters.TracksRecyclerItemAdapter", "members/com.soundcloud.android.view.adapters.TracksRecyclerItemAdapter", false, com/soundcloud/android/view/adapters/TracksRecyclerItemAdapter);
    }
}
