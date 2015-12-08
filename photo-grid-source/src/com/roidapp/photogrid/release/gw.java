// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;

// Referenced classes of package com.roidapp.photogrid.release:
//            gv

final class gw
    implements Runnable
{

    final gv a;

    gw(gv gv1)
    {
        a = gv1;
        super();
    }

    public final void run()
    {
        HttpURLConnection httpurlconnection;
        if (gv.b(a) == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        httpurlconnection = (HttpURLConnection)gv.b(a).get();
        if (httpurlconnection == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        httpurlconnection.disconnect();
        return;
        Exception exception;
        exception;
    }
}
