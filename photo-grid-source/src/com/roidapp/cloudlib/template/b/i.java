// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template.b;

import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;

// Referenced classes of package com.roidapp.cloudlib.template.b:
//            h

final class i extends Thread
{

    final WeakReference a;
    final h b;

    i(h h, WeakReference weakreference)
    {
        b = h;
        a = weakreference;
        super();
    }

    public final void run()
    {
        HttpURLConnection httpurlconnection;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        httpurlconnection = (HttpURLConnection)a.get();
        if (httpurlconnection == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        httpurlconnection.disconnect();
        return;
        Exception exception;
        exception;
    }
}
