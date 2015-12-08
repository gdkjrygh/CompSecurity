// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.oauth.OAuth;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            TokenInformationGenerator

public final class  extends b
    implements Provider
{

    private b apiClient;
    private b oAuth;

    public final void attach(l l1)
    {
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/onboarding/auth/TokenInformationGenerator, getClass().getClassLoader());
        oAuth = l1.a("com.soundcloud.android.api.oauth.OAuth", com/soundcloud/android/onboarding/auth/TokenInformationGenerator, getClass().getClassLoader());
    }

    public final TokenInformationGenerator get()
    {
        return new TokenInformationGenerator((ApiClient)apiClient.get(), (OAuth)oAuth.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(apiClient);
        set.add(oAuth);
    }

    public ()
    {
        super("com.soundcloud.android.onboarding.auth.TokenInformationGenerator", "members/com.soundcloud.android.onboarding.auth.TokenInformationGenerator", false, com/soundcloud/android/onboarding/auth/TokenInformationGenerator);
    }
}
