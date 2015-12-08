// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.storage:
//            LegacyUserStorage, UserDAO

public final class  extends b
    implements Provider
{

    private b userDAO;

    public final void attach(l l1)
    {
        userDAO = l1.a("com.soundcloud.android.storage.UserDAO", com/soundcloud/android/storage/LegacyUserStorage, getClass().getClassLoader());
    }

    public final LegacyUserStorage get()
    {
        return new LegacyUserStorage((UserDAO)userDAO.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(userDAO);
    }

    public ()
    {
        super("com.soundcloud.android.storage.LegacyUserStorage", "members/com.soundcloud.android.storage.LegacyUserStorage", false, com/soundcloud/android/storage/LegacyUserStorage);
    }
}
