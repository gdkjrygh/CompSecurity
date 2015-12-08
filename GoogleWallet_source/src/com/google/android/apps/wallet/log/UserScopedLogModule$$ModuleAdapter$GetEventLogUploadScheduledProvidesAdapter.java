// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import dagger.internal.ProvidesBinding;
import java.util.concurrent.atomic.AtomicBoolean;
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

    public final AtomicBoolean get()
    {
        UserScopedLogModule userscopedlogmodule = module;
        return UserScopedLogModule.getEventLogUploadScheduled();
    }

    public (UserScopedLogModule userscopedlogmodule)
    {
        super("@com.google.android.apps.wallet.log.api.BindingAnnotations$IsEventLogUploadPending()/java.util.concurrent.atomic.AtomicBoolean", true, "com.google.android.apps.wallet.log.UserScopedLogModule", "getEventLogUploadScheduled");
        module = userscopedlogmodule;
        setLibrary(true);
    }
}
