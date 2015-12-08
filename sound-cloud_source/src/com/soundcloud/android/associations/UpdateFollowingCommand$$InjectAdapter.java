// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.propeller.PropellerDatabase;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.associations:
//            UpdateFollowingCommand

public final class  extends b
    implements a, Provider
{

    private b accountOperations;
    private b propeller;
    private b supertype;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/associations/UpdateFollowingCommand, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/associations/UpdateFollowingCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.WriteStorageCommand", com/soundcloud/android/associations/UpdateFollowingCommand, getClass().getClassLoader(), false);
    }

    public final UpdateFollowingCommand get()
    {
        UpdateFollowingCommand updatefollowingcommand = new UpdateFollowingCommand((PropellerDatabase)propeller.get(), (AccountOperations)accountOperations.get());
        injectMembers(updatefollowingcommand);
        return updatefollowingcommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
        set.add(accountOperations);
        set1.add(supertype);
    }

    public final void injectMembers(UpdateFollowingCommand updatefollowingcommand)
    {
        supertype.injectMembers(updatefollowingcommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UpdateFollowingCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.associations.UpdateFollowingCommand", "members/com.soundcloud.android.associations.UpdateFollowingCommand", false, com/soundcloud/android/associations/UpdateFollowingCommand);
    }
}
