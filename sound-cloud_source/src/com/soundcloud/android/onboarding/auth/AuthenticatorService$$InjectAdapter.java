// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            AuthenticatorService

public final class nticator extends b
    implements a, Provider
{

    private b authenticator;

    public final void attach(l l1)
    {
        authenticator = l1.a("com.soundcloud.android.onboarding.auth.AuthenticatorService$SoundCloudAuthenticator", com/soundcloud/android/onboarding/auth/AuthenticatorService, getClass().getClassLoader());
    }

    public final AuthenticatorService get()
    {
        AuthenticatorService authenticatorservice = new AuthenticatorService();
        injectMembers(authenticatorservice);
        return authenticatorservice;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(authenticator);
    }

    public final void injectMembers(AuthenticatorService authenticatorservice)
    {
        authenticatorservice.authenticator = (nticator)authenticator.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AuthenticatorService)obj);
    }

    public nticator()
    {
        super("com.soundcloud.android.onboarding.auth.AuthenticatorService", "members/com.soundcloud.android.onboarding.auth.AuthenticatorService", false, com/soundcloud/android/onboarding/auth/AuthenticatorService);
    }
}
