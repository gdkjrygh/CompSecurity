// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;


// Referenced classes of package com.pinterest.api.remote:
//            ConfigurationApi, SendApi

public class ApiServices
{

    public final ConfigurationApi a;
    public final SendApi b;

    protected ApiServices(ConfigurationApi configurationapi, SendApi sendapi)
    {
        a = configurationapi;
        b = sendapi;
    }
}
