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
//            UserDAO

public final class  extends b
    implements a, Provider
{

    private b contentResolver;
    private b supertype;

    public final void attach(l l1)
    {
        contentResolver = l1.a("android.content.ContentResolver", com/soundcloud/android/storage/UserDAO, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.storage.BaseDAO", com/soundcloud/android/storage/UserDAO, getClass().getClassLoader(), false);
    }

    public final UserDAO get()
    {
        UserDAO userdao = new UserDAO((ContentResolver)contentResolver.get());
        injectMembers(userdao);
        return userdao;
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

    public final void injectMembers(UserDAO userdao)
    {
        supertype.injectMembers(userdao);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UserDAO)obj);
    }

    public ()
    {
        super("com.soundcloud.android.storage.UserDAO", "members/com.soundcloud.android.storage.UserDAO", false, com/soundcloud/android/storage/UserDAO);
    }
}
