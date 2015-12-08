// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.userscope;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.userscope:
//            CurrentUserModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final CurrentUserModule module;

    public final volatile Object get()
    {
        return get();
    }

    public final String get()
    {
        return module.getUserId();
    }

    public (CurrentUserModule currentusermodule)
    {
        super("@com.google.android.apps.wallet.userscope.api.BindingAnnotations$AccountName()/java.lang.String", false, "com.google.android.apps.wallet.userscope.CurrentUserModule", "getUserId");
        module = currentusermodule;
        setLibrary(true);
    }
}
