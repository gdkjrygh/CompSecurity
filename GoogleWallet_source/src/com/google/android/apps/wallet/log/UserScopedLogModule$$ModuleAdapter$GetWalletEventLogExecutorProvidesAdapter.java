// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import dagger.internal.ProvidesBinding;
import java.util.concurrent.Executor;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.log:
//            UserScopedLogModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final UserScopedLogModule module;

    public final volatile Object get()
    {
        return get();
    }

    public final Executor get()
    {
        UserScopedLogModule userscopedlogmodule = module;
        return UserScopedLogModule.getWalletEventLogExecutor();
    }

    public (UserScopedLogModule userscopedlogmodule)
    {
        super("@com.google.android.apps.wallet.log.api.BindingAnnotations$WalletEventLogExecutor()/java.util.concurrent.Executor", false, "com.google.android.apps.wallet.log.UserScopedLogModule", "getWalletEventLogExecutor");
        module = userscopedlogmodule;
        setLibrary(true);
    }
}
