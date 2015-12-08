// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.analytics;

import android.os.AsyncTask;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.media.HttpService;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.brightcove.player.analytics:
//            Analytics

class i extends AsyncTask
{

    HttpService a;
    final Analytics b;

    public i(Analytics analytics)
    {
        b = analytics;
        super();
        a = new HttpService(60000, 60000);
    }

    protected final transient Void a(Map amap[])
    {
        Object obj = amap[0];
        amap = new HashMap();
        java.util.Map.Entry entry;
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); amap.put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        try
        {
            amap = HttpService.buildURIWithQueryParameters("https://metrics.brightcove.com/tracker", amap);
            a.doGetRequest(amap);
        }
        // Misplaced declaration of an exception variable
        catch (Map amap[])
        {
            Analytics.f(b).emit("error", Collections.singletonMap("error", amap));
        }
        // Misplaced declaration of an exception variable
        catch (Map amap[])
        {
            Analytics.g(b).emit("error", Collections.singletonMap("error", amap));
        }
        // Misplaced declaration of an exception variable
        catch (Map amap[])
        {
            Analytics.h(b).emit("error", Collections.singletonMap("error", amap));
        }
        // Misplaced declaration of an exception variable
        catch (Map amap[])
        {
            Analytics.i(b).emit("error", Collections.singletonMap("error", amap));
        }
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Map[])aobj);
    }
}
