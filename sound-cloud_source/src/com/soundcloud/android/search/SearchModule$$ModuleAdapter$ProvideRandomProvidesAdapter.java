// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import dagger.a.t;
import java.util.Random;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.search:
//            SearchModule

public static final class setLibrary extends t
    implements Provider
{

    private final SearchModule module;

    public final volatile Object get()
    {
        return get();
    }

    public final Random get()
    {
        return module.provideRandom();
    }

    public (SearchModule searchmodule)
    {
        super("java.util.Random", false, "com.soundcloud.android.search.SearchModule", "provideRandom");
        module = searchmodule;
        setLibrary(false);
    }
}
