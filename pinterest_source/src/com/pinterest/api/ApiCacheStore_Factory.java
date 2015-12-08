// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import dagger.internal.Factory;

// Referenced classes of package com.pinterest.api:
//            ApiCacheStore

public final class ApiCacheStore_Factory extends Enum
    implements Factory
{

    public static final ApiCacheStore_Factory a;
    private static final ApiCacheStore_Factory b[];

    private ApiCacheStore_Factory(String s)
    {
        super(s, 0);
    }

    public static Factory a()
    {
        return a;
    }

    public static ApiCacheStore_Factory valueOf(String s)
    {
        return (ApiCacheStore_Factory)Enum.valueOf(com/pinterest/api/ApiCacheStore_Factory, s);
    }

    public static ApiCacheStore_Factory[] values()
    {
        return (ApiCacheStore_Factory[])b.clone();
    }

    public final Object get()
    {
        return new ApiCacheStore();
    }

    static 
    {
        a = new ApiCacheStore_Factory("INSTANCE");
        b = (new ApiCacheStore_Factory[] {
            a
        });
    }
}
