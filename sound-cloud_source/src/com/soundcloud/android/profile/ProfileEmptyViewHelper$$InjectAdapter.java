// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.accounts.AccountOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileEmptyViewHelper

public final class  extends b
    implements Provider
{

    private b accountOperations;

    public final void attach(l l1)
    {
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/profile/ProfileEmptyViewHelper, getClass().getClassLoader());
    }

    public final ProfileEmptyViewHelper get()
    {
        return new ProfileEmptyViewHelper((AccountOperations)accountOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(accountOperations);
    }

    public ()
    {
        super("com.soundcloud.android.profile.ProfileEmptyViewHelper", "members/com.soundcloud.android.profile.ProfileEmptyViewHelper", false, com/soundcloud/android/profile/ProfileEmptyViewHelper);
    }
}
