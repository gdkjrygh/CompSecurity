// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import com.mopub.volley.NetworkResponse;
import com.mopub.volley.NoConnectionError;
import com.mopub.volley.VolleyError;

// Referenced classes of package com.mopub.network:
//            BackoffPolicy

public class ScribeBackoffPolicy extends BackoffPolicy
{

    public ScribeBackoffPolicy()
    {
        this((byte)0);
    }

    private ScribeBackoffPolicy(byte byte0)
    {
        c = 60000;
        e = 5;
        b = 2;
    }

    private void a()
    {
        a = (int)(Math.pow(b, d) * (double)c);
        d = d + 1;
    }

    public void backoff(VolleyError volleyerror)
    {
        if (!hasAttemptRemaining())
        {
            throw volleyerror;
        }
        if (volleyerror instanceof NoConnectionError)
        {
            a();
            return;
        }
        NetworkResponse networkresponse = volleyerror.networkResponse;
        if (networkresponse != null && (networkresponse.statusCode == 503 || networkresponse.statusCode == 504))
        {
            a();
            return;
        } else
        {
            throw volleyerror;
        }
    }
}
