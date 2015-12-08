// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;

import com.google.gson.Gson;
import dagger.internal.Factory;

// Referenced classes of package com.nbcsports.liveextra.library.core:
//            DataModule

public final class DataModule_AnvatoGsonFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final DataModule module;

    public DataModule_AnvatoGsonFactory(DataModule datamodule)
    {
        if (!$assertionsDisabled && datamodule == null)
        {
            throw new AssertionError();
        } else
        {
            module = datamodule;
            return;
        }
    }

    public static Factory create(DataModule datamodule)
    {
        return new DataModule_AnvatoGsonFactory(datamodule);
    }

    public Gson get()
    {
        Gson gson = module.anvatoGson();
        if (gson == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return gson;
        }
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/core/DataModule_AnvatoGsonFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
