// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.propeller.PropellerDatabase;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.policies:
//            StorePoliciesCommand

public final class I extends b
    implements a, Provider
{

    private b database;
    private b dateProvider;
    private b supertype;

    public final void attach(l l1)
    {
        database = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/policies/StorePoliciesCommand, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/policies/StorePoliciesCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.DefaultWriteStorageCommand", com/soundcloud/android/policies/StorePoliciesCommand, getClass().getClassLoader(), false);
    }

    public final StorePoliciesCommand get()
    {
        StorePoliciesCommand storepoliciescommand = new StorePoliciesCommand((PropellerDatabase)database.get(), (CurrentDateProvider)dateProvider.get());
        injectMembers(storepoliciescommand);
        return storepoliciescommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(database);
        set.add(dateProvider);
        set1.add(supertype);
    }

    public final void injectMembers(StorePoliciesCommand storepoliciescommand)
    {
        supertype.injectMembers(storepoliciescommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((StorePoliciesCommand)obj);
    }

    public I()
    {
        super("com.soundcloud.android.policies.StorePoliciesCommand", "members/com.soundcloud.android.policies.StorePoliciesCommand", false, com/soundcloud/android/policies/StorePoliciesCommand);
    }
}
