// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.c.a.A;
import com.c.a.B;
import com.c.a.e;
import com.c.a.t;
import com.c.a.w;
import com.soundcloud.android.utils.DeviceHelper;
import com.soundcloud.android.utils.ErrorUtils;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.analytics:
//            TrackingApi, TrackingRecord, EventTracker

class SimpleTrackingApi
    implements TrackingApi
{

    private final DeviceHelper deviceHelper;
    private final t httpClient;

    SimpleTrackingApi(t t1, DeviceHelper devicehelper)
    {
        httpClient = t1;
        deviceHelper = devicehelper;
    }

    private w buildRequest(TrackingRecord trackingrecord)
        throws MalformedURLException
    {
        com.c.a.w.a a;
        a = new com.c.a.w.a();
        a.a(new URL(trackingrecord.getData()));
        a.b("User-Agent", deviceHelper.getUserAgent());
        if (!"play_counts".equals(trackingrecord.getBackend())) goto _L2; else goto _L1
_L1:
        a.a("POST", null);
        a.b("Content-Length", "0");
_L4:
        return a.a();
_L2:
        if ("promoted".equals(trackingrecord.getBackend()))
        {
            a.a("GET", null);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean isSuccessCodeOrIgnored(int i)
    {
        return i >= 200 && i < 500;
    }

    public List pushToRemote(List list)
    {
        Object obj;
        obj = EventTracker.TAG;
        (new StringBuilder("Pushing ")).append(list.size()).append(" new tracking events");
        obj = new ArrayList(list.size());
        list = list.iterator();
_L3:
        TrackingRecord trackingrecord;
        if (!list.hasNext())
        {
            break MISSING_BLOCK_LABEL_261;
        }
        trackingrecord = (TrackingRecord)list.next();
        Object obj1;
        obj1 = buildRequest(trackingrecord);
        obj1 = httpClient.a(((w) (obj1))).a();
        int i;
        i = ((A) (obj1)).c;
        String s1 = EventTracker.TAG;
        (new StringBuilder("Tracking event response: ")).append(((A) (obj1)).toString());
        if (!isSuccessCodeOrIgnored(i)) goto _L2; else goto _L1
_L1:
        ((List) (obj)).add(trackingrecord);
_L4:
        Exception exception;
        try
        {
            ((A) (obj1)).g.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ErrorUtils.handleSilentException(EventTracker.TAG, new Exception(trackingrecord.toString(), ((Throwable) (obj1))));
            ((List) (obj)).add(trackingrecord);
        }
        catch (IOException ioexception)
        {
            String s = EventTracker.TAG;
            (new StringBuilder("Failed with IOException pushing event: ")).append(trackingrecord);
        }
        if (true) goto _L3; else goto _L2
_L2:
        ErrorUtils.handleSilentException(EventTracker.TAG, new Exception((new StringBuilder("Tracking request failed with unexpected status code: ")).append(((A) (obj1)).toString()).append("; record = ").append(trackingrecord).toString()));
          goto _L4
        exception;
        ((A) (obj1)).g.close();
        throw exception;
        return ((List) (obj));
    }
}
