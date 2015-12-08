// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.inject;

import android.app.Application;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.common.inject:
//            ApplicationModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final ApplicationModule module;

    public final Application get()
    {
        return module.provideApplication();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (ApplicationModule applicationmodule)
    {
        super("android.app.Application", false, "com.google.android.apps.common.inject.ApplicationModule", "provideApplication");
        module = applicationmodule;
        setLibrary(true);
    }
}
