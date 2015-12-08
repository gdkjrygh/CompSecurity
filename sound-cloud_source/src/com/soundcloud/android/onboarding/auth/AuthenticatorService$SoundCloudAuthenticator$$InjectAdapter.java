// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.content.Context;
import com.soundcloud.android.accounts.AccountOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b context;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/onboarding/auth/AuthenticatorService$SoundCloudAuthenticator, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/onboarding/auth/AuthenticatorService$SoundCloudAuthenticator, getClass().getClassLoader());
    }

    public final accountOperations get()
    {
        return new accountOperations((Context)context.get(), (AccountOperations)accountOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(accountOperations);
    }

    public ()
    {
        super("com.soundcloud.android.onboarding.auth.AuthenticatorService$SoundCloudAuthenticator", "members/com.soundcloud.android.onboarding.auth.AuthenticatorService$SoundCloudAuthenticator", false, com/soundcloud/android/onboarding/auth/AuthenticatorService$SoundCloudAuthenticator);
    }
}
