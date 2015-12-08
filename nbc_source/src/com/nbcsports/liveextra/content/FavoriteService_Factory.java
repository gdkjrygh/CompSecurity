// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content;

import dagger.internal.Factory;

// Referenced classes of package com.nbcsports.liveextra.content:
//            FavoriteService

public final class FavoriteService_Factory extends Enum
    implements Factory
{

    private static final FavoriteService_Factory $VALUES[];
    public static final FavoriteService_Factory INSTANCE;

    private FavoriteService_Factory(String s, int i)
    {
        super(s, i);
    }

    public static Factory create()
    {
        return INSTANCE;
    }

    public static FavoriteService_Factory valueOf(String s)
    {
        return (FavoriteService_Factory)Enum.valueOf(com/nbcsports/liveextra/content/FavoriteService_Factory, s);
    }

    public static FavoriteService_Factory[] values()
    {
        return (FavoriteService_Factory[])$VALUES.clone();
    }

    public FavoriteService get()
    {
        return new FavoriteService();
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        INSTANCE = new FavoriteService_Factory("INSTANCE", 0);
        $VALUES = (new FavoriteService_Factory[] {
            INSTANCE
        });
    }
}
