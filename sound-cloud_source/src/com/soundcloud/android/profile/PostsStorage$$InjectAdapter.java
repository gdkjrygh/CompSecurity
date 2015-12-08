// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.propeller.rx.PropellerRx;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            PostsStorage

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b propellerRx;

    public final void attach(l l1)
    {
        propellerRx = l1.a("com.soundcloud.propeller.rx.PropellerRx", com/soundcloud/android/profile/PostsStorage, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/profile/PostsStorage, getClass().getClassLoader());
    }

    public final PostsStorage get()
    {
        return new PostsStorage((PropellerRx)propellerRx.get(), (AccountOperations)accountOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propellerRx);
        set.add(accountOperations);
    }

    public ()
    {
        super("com.soundcloud.android.profile.PostsStorage", "members/com.soundcloud.android.profile.PostsStorage", false, com/soundcloud/android/profile/PostsStorage);
    }
}
