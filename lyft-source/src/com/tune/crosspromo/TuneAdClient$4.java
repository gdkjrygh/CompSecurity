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
        android.net.lient._cls4 _lcls4;
        if (TuneAdClient.a())
        {
            _lcls4 = Uri.parse((new StringBuilder()).append("http://").append(TuneAdClient.b()).append("/api/v1/ads/click").toString()).buildUpon();
        } else
        {
            _lcls4 = Uri.parse((new StringBuilder()).append("https://").append(TuneAdClient.c()).append(".click.").append(TuneAdClient.b()).append("/click").toString()).buildUpon();
        }
        _lcls4.endQueryParameter("action", "click").endQueryParameter("requestId", a.c);
        TuneAdClient.b(_lcls4.ld().toString(), b);
    }

    (TuneAdView tuneadview, JSONObject jsonobject)
    {
        a = tuneadview;
        b = jsonobject;
        super();
    }
}
