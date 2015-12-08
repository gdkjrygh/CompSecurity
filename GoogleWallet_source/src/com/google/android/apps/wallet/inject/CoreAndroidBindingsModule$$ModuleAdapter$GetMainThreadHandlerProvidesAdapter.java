// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.inject;

import android.os.Handler;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.inject:
//            CoreAndroidBindingsModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final CoreAndroidBindingsModule module;

    public final Handler get()
    {
        CoreAndroidBindingsModule coreandroidbindingsmodule = module;
        return CoreAndroidBindingsModule.getMainThreadHandler();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (CoreAndroidBindingsModule coreandroidbindingsmodule)
    {
        super("@com.google.android.apps.wallet.inject.BindingAnnotations$MainThreadHandler()/android.os.Handler", false, "com.google.android.apps.wallet.inject.CoreAndroidBindingsModule", "getMainThreadHandler");
        module = coreandroidbindingsmodule;
        setLibrary(true);
    }
}
