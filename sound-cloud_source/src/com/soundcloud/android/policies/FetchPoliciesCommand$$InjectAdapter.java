// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import com.soundcloud.android.api.ApiClient;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.policies:
//            FetchPoliciesCommand

public final class I extends b
    implements a, Provider
{

    private b apiClient;
    private b supertype;

    public final void attach(l l1)
    {
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/policies/FetchPoliciesCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.LegacyCommand", com/soundcloud/android/policies/FetchPoliciesCommand, getClass().getClassLoader(), false);
    }

    public final FetchPoliciesCommand get()
    {
        FetchPoliciesCommand fetchpoliciescommand = new FetchPoliciesCommand((ApiClient)apiClient.get());
        injectMembers(fetchpoliciescommand);
        return fetchpoliciescommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(apiClient);
        set1.add(supertype);
    }

    public final void injectMembers(FetchPoliciesCommand fetchpoliciescommand)
    {
        supertype.injectMembers(fetchpoliciescommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((FetchPoliciesCommand)obj);
    }

    public I()
    {
        super("com.soundcloud.android.policies.FetchPoliciesCommand", "members/com.soundcloud.android.policies.FetchPoliciesCommand", false, com/soundcloud/android/policies/FetchPoliciesCommand);
    }
}
