// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.content.Context;
import android.os.Handler;
import com.mopub.common.logging.MoPubLog;
import com.mopub.network.Networking;
import com.mopub.volley.RequestQueue;

// Referenced classes of package com.mopub.nativeads:
//            PositioningSource, at, au, av, 
//            PositioningRequest, ar

final class as
    implements PositioningSource
{

    static int a = 0x493e0;
    private final Context b;
    private final Handler c = new Handler();
    private final Runnable d = new at(this);
    private final com.mopub.volley.Response.Listener e = new au(this);
    private final com.mopub.volley.Response.ErrorListener f = new av(this);
    private PositioningSource.PositioningListener g;
    private int h;
    private String i;
    private PositioningRequest j;

    as(Context context)
    {
        b = context.getApplicationContext();
    }

    private void a()
    {
        MoPubLog.d((new StringBuilder("Loading positioning from: ")).append(i).toString());
        j = new PositioningRequest(i, e, f);
        Networking.getRequestQueue(b).add(j);
    }

    static void a(as as1)
    {
        as1.a();
    }

    static void a(as as1, MoPubNativeAdPositioning.MoPubClientPositioning mopubclientpositioning)
    {
        if (as1.g != null)
        {
            as1.g.onLoad(mopubclientpositioning);
        }
        as1.g = null;
        as1.h = 0;
    }

    static Context b(as as1)
    {
        return as1.b;
    }

    static void c(as as1)
    {
        int k = (int)(Math.pow(2D, as1.h + 1) * 1000D);
        if (k >= a)
        {
            MoPubLog.d("Error downloading positioning information");
            if (as1.g != null)
            {
                as1.g.onFailed();
            }
            as1.g = null;
            return;
        } else
        {
            as1.h = as1.h + 1;
            as1.c.postDelayed(as1.d, k);
            return;
        }
    }

    public final void loadPositions(String s, PositioningSource.PositioningListener positioninglistener)
    {
        if (j != null)
        {
            j.cancel();
            j = null;
        }
        if (h > 0)
        {
            c.removeCallbacks(d);
            h = 0;
        }
        g = positioninglistener;
        i = (new ar(b)).withAdUnitId(s).generateUrlString("ads.mopub.com");
        a();
    }

}
