// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.modules;

import com.pinterest.network.api.CommerceApiService;
import retrofit.RestAdapter;

public class ApiModule
{

    public ApiModule()
    {
    }

    static CommerceApiService a(RestAdapter restadapter)
    {
        return (CommerceApiService)restadapter.create(com/pinterest/network/api/CommerceApiService);
    }
}
