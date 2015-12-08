// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import com.soundcloud.propeller.PropellerDatabase;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.policies:
//            LoadTracksForPolicyUpdateCommand

public final class  extends b
    implements a, Provider
{

    private b database;
    private b supertype;

    public final void attach(l l1)
    {
        database = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/policies/LoadTracksForPolicyUpdateCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.Command", com/soundcloud/android/policies/LoadTracksForPolicyUpdateCommand, getClass().getClassLoader(), false);
    }

    public final LoadTracksForPolicyUpdateCommand get()
    {
        LoadTracksForPolicyUpdateCommand loadtracksforpolicyupdatecommand = new LoadTracksForPolicyUpdateCommand((PropellerDatabase)database.get());
        injectMembers(loadtracksforpolicyupdatecommand);
        return loadtracksforpolicyupdatecommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(database);
        set1.add(supertype);
    }

    public final void injectMembers(LoadTracksForPolicyUpdateCommand loadtracksforpolicyupdatecommand)
    {
        supertype.injectMembers(loadtracksforpolicyupdatecommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LoadTracksForPolicyUpdateCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.policies.LoadTracksForPolicyUpdateCommand", "members/com.soundcloud.android.policies.LoadTracksForPolicyUpdateCommand", false, com/soundcloud/android/policies/LoadTracksForPolicyUpdateCommand);
    }
}
