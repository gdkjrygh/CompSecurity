// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.e;

import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;

// Referenced classes of package com.roidapp.baselib.e:
//            g

final class h extends Thread
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public final void run()
    {
        HttpURLConnection httpurlconnection;
        if (a.a == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        httpurlconnection = (HttpURLConnection)a.a.get();
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
