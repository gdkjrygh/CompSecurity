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
//            ActivityDAO

public final class  extends b
    implements a, Provider
{

    private b resolver;
    private b supertype;

    public final void attach(l l1)
    {
        resolver = l1.a("android.content.ContentResolver", com/soundcloud/android/storage/ActivityDAO, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.storage.BaseDAO", com/soundcloud/android/storage/ActivityDAO, getClass().getClassLoader(), false);
    }

    public final ActivityDAO get()
    {
        ActivityDAO activitydao = new ActivityDAO((ContentResolver)resolver.get());
        injectMembers(activitydao);
        return activitydao;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resolver);
        set1.add(supertype);
    }

    public final void injectMembers(ActivityDAO activitydao)
    {
        supertype.injectMembers(activitydao);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ActivityDAO)obj);
    }

    public ()
    {
        super("com.soundcloud.android.storage.ActivityDAO", "members/com.soundcloud.android.storage.ActivityDAO", false, com/soundcloud/android/storage/ActivityDAO);
    }
}
