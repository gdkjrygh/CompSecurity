// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.modules;

import com.pinterest.api.ApiHttpClient;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.pinterest.di.modules:
//            ApiBaseModule

class a
    implements Interceptor
{

    final ApiBaseModule a;

    public Response intercept(com.squareup.okhttp.n n)
    {
        com.squareup.okhttp.n n1 = n.request().g();
        Map map = ApiHttpClient.getHeaders();
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); n1.a(s, (String)map.get(s)))
        {
            s = (String)iterator.next();
        }

        return n.proceed(n1.a());
    }

    (ApiBaseModule apibasemodule)
    {
        a = apibasemodule;
        super();
    }
}
