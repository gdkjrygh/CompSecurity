// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.init:
//            InitModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final InitModule module;

    public final Long get()
    {
        InitModule initmodule = module;
        return InitModule.getLessImportantTaskSleepMillis();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (InitModule initmodule)
    {
        super("@com.google.android.apps.wallet.init.BindingAnnotations$LessImportantTaskSleepMillis()/java.lang.Long", false, "com.google.android.apps.wallet.init.InitModule", "getLessImportantTaskSleepMillis");
        module = initmodule;
        setLibrary(true);
    }
}
