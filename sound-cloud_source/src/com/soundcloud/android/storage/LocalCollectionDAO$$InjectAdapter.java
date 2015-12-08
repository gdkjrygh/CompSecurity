// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.content.ContentResolver;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.storage:
//            LocalCollectionDAO

public final class  extends b
    implements a, Provider
{

    private b contentResolver;
    private b supertype;

    public final void attach(l l1)
    {
        contentResolver = l1.a("android.content.ContentResolver", com/soundcloud/android/storage/LocalCollectionDAO, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.storage.BaseDAO", com/soundcloud/android/storage/LocalCollectionDAO, getClass().getClassLoader(), false);
    }

    public final LocalCollectionDAO get()
    {
        LocalCollectionDAO localcollectiondao = new LocalCollectionDAO((ContentResolver)contentResolver.get());
        injectMembers(localcollectiondao);
        return localcollectiondao;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(contentResolver);
        set1.add(supertype);
    }

    public final void injectMembers(LocalCollectionDAO localcollectiondao)
    {
        supertype.injectMembers(localcollectiondao);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LocalCollectionDAO)obj);
    }

    public ()
    {
        super("com.soundcloud.android.storage.LocalCollectionDAO", "members/com.soundcloud.android.storage.LocalCollectionDAO", false, com/soundcloud/android/storage/LocalCollectionDAO);
    }
}
