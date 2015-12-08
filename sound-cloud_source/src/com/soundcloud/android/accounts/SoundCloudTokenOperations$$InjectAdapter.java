// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import android.accounts.AccountManager;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.accounts:
//            SoundCloudTokenOperations

public final class  extends b
    implements Provider
{

    private b accountManager;

    public final void attach(l l1)
    {
        accountManager = l1.a("android.accounts.AccountManager", com/soundcloud/android/accounts/SoundCloudTokenOperations, getClass().getClassLoader());
    }

    public final SoundCloudTokenOperations get()
    {
        return new SoundCloudTokenOperations((AccountManager)accountManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(accountManager);
    }

    public ()
    {
        super("com.soundcloud.android.accounts.SoundCloudTokenOperations", "members/com.soundcloud.android.accounts.SoundCloudTokenOperations", false, com/soundcloud/android/accounts/SoundCloudTokenOperations);
    }
}
