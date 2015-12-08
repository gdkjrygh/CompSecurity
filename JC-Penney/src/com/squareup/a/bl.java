// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.content.Context;
import android.net.http.HttpResponseCache;

// Referenced classes of package com.squareup.a:
//            bm

class bl
{

    static Object a(Context context)
    {
        java.io.File file = bm.b(context);
        HttpResponseCache httpresponsecache = HttpResponseCache.getInstalled();
        context = httpresponsecache;
        if (httpresponsecache == null)
        {
            context = HttpResponseCache.install(file, bm.a(file));
        }
        return context;
    }
}
