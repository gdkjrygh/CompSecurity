// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;

// Referenced classes of package com.facebook.http.b:
//            d, e

public class a
{

    public a()
    {
    }

    public static HttpRequestInterceptor a()
    {
        return new d(null);
    }

    public static HttpResponseInterceptor b()
    {
        return new e(null);
    }
}
