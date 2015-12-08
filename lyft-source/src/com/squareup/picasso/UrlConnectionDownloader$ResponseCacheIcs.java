// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.net.http.HttpResponseCache;
import java.io.IOException;

// Referenced classes of package com.squareup.picasso:
//            Utils

class 
{

    static void close(Object obj)
    {
        try
        {
            ((HttpResponseCache)obj).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
    }

    static Object install(Context context)
    {
        java.io.File file = Utils.createDefaultCacheDir(context);
        HttpResponseCache httpresponsecache = HttpResponseCache.getInstalled();
        context = httpresponsecache;
        if (httpresponsecache == null)
        {
            context = HttpResponseCache.install(file, Utils.calculateDiskCacheSize(file));
        }
        return context;
    }

    private ()
    {
    }
}
