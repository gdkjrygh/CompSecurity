// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.policies:
//            PolicyOperations, FetchPoliciesCommand, StorePoliciesCommand, LoadTracksForPolicyUpdateCommand

public final class  extends b
    implements Provider
{

    private b fetchPoliciesCommand;
    private b loadTracksForPolicyUpdateCommand;
    private b scheduler;
    private b storePoliciesCommand;

    public final void attach(l l1)
    {
        fetchPoliciesCommand = l1.a("com.soundcloud.android.policies.FetchPoliciesCommand", com/soundcloud/android/policies/PolicyOperations, getClass().getClassLoader());
        storePoliciesCommand = l1.a("com.soundcloud.android.policies.StorePoliciesCommand", com/soundcloud/android/policies/PolicyOperations, getClass().getClassLoader());
        loadTracksForPolicyUpdateCommand = l1.a("com.soundcloud.android.policies.LoadTracksForPolicyUpdateCommand", com/soundcloud/android/policies/PolicyOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/policies/PolicyOperations, getClass().getClassLoader());
    }

    public final PolicyOperations get()
    {
        return new PolicyOperations((FetchPoliciesCommand)fetchPoliciesCommand.get(), (StorePoliciesCommand)storePoliciesCommand.get(), (LoadTracksForPolicyUpdateCommand)loadTracksForPolicyUpdateCommand.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(fetchPoliciesCommand);
        set.add(storePoliciesCommand);
        set.add(loadTracksForPolicyUpdateCommand);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.policies.PolicyOperations", "members/com.soundcloud.android.policies.PolicyOperations", false, com/soundcloud/android/policies/PolicyOperations);
    }
}
