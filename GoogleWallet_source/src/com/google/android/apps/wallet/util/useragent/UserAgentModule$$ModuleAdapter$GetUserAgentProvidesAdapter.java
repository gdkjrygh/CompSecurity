// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.useragent;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.util.useragent:
//            UserAgentModule, UserAgentFormatter

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final UserAgentModule module;
    private Binding userAgentFormatter;

    public final void attach(Linker linker)
    {
        userAgentFormatter = linker.requestBinding("com.google.android.apps.wallet.util.useragent.UserAgentFormatter", com/google/android/apps/wallet/util/useragent/UserAgentModule, getClass().getClassLoader());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final String get()
    {
        UserAgentModule useragentmodule = module;
        return UserAgentModule.getUserAgent((UserAgentFormatter)userAgentFormatter.get());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(userAgentFormatter);
    }

    public (UserAgentModule useragentmodule)
    {
        super("@com.google.android.apps.wallet.http.BindingAnnotations$UserAgent()/java.lang.String", true, "com.google.android.apps.wallet.util.useragent.UserAgentModule", "getUserAgent");
        module = useragentmodule;
        setLibrary(true);
    }
}
