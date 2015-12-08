// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import com.mopub.common.logging.MoPubLog;
import com.mopub.volley.VolleyError;

// Referenced classes of package com.mopub.network:
//            ScribeRequestManager, BackoffPolicy

final class h
    implements Runnable
{

    final VolleyError a;
    final ScribeRequestManager b;

    h(ScribeRequestManager scriberequestmanager, VolleyError volleyerror)
    {
        b = scriberequestmanager;
        a = volleyerror;
        super();
    }

    public final void run()
    {
        try
        {
            b.c.backoff(a);
            b.b();
            return;
        }
        catch (VolleyError volleyerror)
        {
            MoPubLog.d((new StringBuilder("Failed to Scribe events: ")).append(a).toString());
        }
        b.c();
    }
}
