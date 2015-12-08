// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import com.soundcloud.android.api.json.JsonTransformer;
import dagger.a.t;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.api:
//            ApiModule

public static final class setLibrary extends t
    implements Provider
{

    private final ApiModule module;

    public final JsonTransformer get()
    {
        return module.provideJsonTransformer();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (ApiModule apimodule)
    {
        super("com.soundcloud.android.api.json.JsonTransformer", true, "com.soundcloud.android.api.ApiModule", "provideJsonTransformer");
        module = apimodule;
        setLibrary(true);
    }
}
