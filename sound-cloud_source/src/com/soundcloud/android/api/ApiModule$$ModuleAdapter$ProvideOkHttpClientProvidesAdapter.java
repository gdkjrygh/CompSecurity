// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import dagger.a.t;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.api:
//            ApiModule

public static final class setLibrary extends t
    implements Provider
{

    private final ApiModule module;

    public final com.c.a.t get()
    {
        return module.provideOkHttpClient();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (ApiModule apimodule)
    {
        super("com.squareup.okhttp.OkHttpClient", false, "com.soundcloud.android.api.ApiModule", "provideOkHttpClient");
        module = apimodule;
        setLibrary(true);
    }
}
