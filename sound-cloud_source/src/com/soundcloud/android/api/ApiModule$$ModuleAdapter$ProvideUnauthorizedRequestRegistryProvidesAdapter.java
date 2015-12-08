// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import android.content.Context;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.api:
//            ApiModule, UnauthorisedRequestRegistry

public static final class setLibrary extends t
    implements Provider
{

    private b context;
    private final ApiModule module;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/api/ApiModule, getClass().getClassLoader());
    }

    public final UnauthorisedRequestRegistry get()
    {
        return module.provideUnauthorizedRequestRegistry((Context)context.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
    }

    public (ApiModule apimodule)
    {
        super("com.soundcloud.android.api.UnauthorisedRequestRegistry", true, "com.soundcloud.android.api.ApiModule", "provideUnauthorizedRequestRegistry");
        module = apimodule;
        setLibrary(true);
    }
}
