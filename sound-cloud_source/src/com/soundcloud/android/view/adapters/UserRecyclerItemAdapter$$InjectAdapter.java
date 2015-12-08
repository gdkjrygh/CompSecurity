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
//            UserRecyclerItemAdapter, UserItemRenderer

public final class Q extends b
    implements a, Provider
{

    private b supertype;
    private b userItemRenderer;

    public final void attach(l l1)
    {
        userItemRenderer = l1.a("com.soundcloud.android.view.adapters.UserItemRenderer", com/soundcloud/android/view/adapters/UserRecyclerItemAdapter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.PagingRecyclerItemAdapter", com/soundcloud/android/view/adapters/UserRecyclerItemAdapter, getClass().getClassLoader(), false);
    }

    public final UserRecyclerItemAdapter get()
    {
        UserRecyclerItemAdapter userrecycleritemadapter = new UserRecyclerItemAdapter((UserItemRenderer)userItemRenderer.get());
        injectMembers(userrecycleritemadapter);
        return userrecycleritemadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(userItemRenderer);
        set1.add(supertype);
    }

    public final void injectMembers(UserRecyclerItemAdapter userrecycleritemadapter)
    {
        supertype.injectMembers(userrecycleritemadapter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UserRecyclerItemAdapter)obj);
    }

    public Q()
    {
        super("com.soundcloud.android.view.adapters.UserRecyclerItemAdapter", "members/com.soundcloud.android.view.adapters.UserRecyclerItemAdapter", false, com/soundcloud/android/view/adapters/UserRecyclerItemAdapter);
    }
}
