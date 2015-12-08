// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;

import android.net.Uri;
import org.json.JSONObject;

// Referenced classes of package com.tune.crosspromo:
//            TuneAdClient, TuneAdView

final class b
    implements Runnable
{

    final TuneAdView a;
    final JSONObject b;

    public void run()
    {
        android.net.lient._cls5 _lcls5;
        if (TuneAdClient.a())
        {
            _lcls5 = Uri.parse((new StringBuilder()).append("http://").append(TuneAdClient.b()).append("/api/v1/ads/event").toString()).buildUpon();
        } else
        {
            _lcls5 = Uri.parse((new StringBuilder()).append("https://").append(TuneAdClient.c()).append(".event.").append(TuneAdClient.b()).append("/event").toString()).buildUpon();
        }
        _lcls5.endQueryParameter("action", "close").endQueryParameter("requestId", a.c);
        TuneAdClient.b(_lcls5.ld().toString(), b);
    }

    (TuneAdView tuneadview, JSONObject jsonobject)
    {
        a = tuneadview;
        b = jsonobject;
        super();
    }
}
