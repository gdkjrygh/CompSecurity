// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.c.a.A;
import com.c.a.B;
import com.c.a.e;
import com.c.a.r;
import com.c.a.t;
import com.c.a.w;
import com.c.a.x;
import com.soundcloud.android.utils.DeviceHelper;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.java.strings.Charsets;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.soundcloud.android.analytics:
//            TrackingApi, TrackingRecord, EventTracker

public class BatchTrackingApi
    implements TrackingApi
{

    static final String CONTENT_TYPE = "application/json";
    private final int batchSize;
    private final String batchUrl;
    private final DeviceHelper deviceHelper;
    private final t httpClient;

    BatchTrackingApi(t t1, DeviceHelper devicehelper, String s, int i)
    {
        httpClient = t1;
        deviceHelper = devicehelper;
        batchUrl = s;
        batchSize = i;
    }

    private w buildRequest(List list)
        throws IOException, JSONException
    {
        com.c.a.w.a a = new com.c.a.w.a();
        a.a(batchUrl);
        a.b("User-Agent", deviceHelper.getUserAgent());
        a.a("POST", createBody(list));
        return a.a();
    }

    private x createBody(List list)
        throws IOException, JSONException
    {
        list = (new JSONArray(getEventJsonObjects(list))).toString();
        return x.create(r.a("application/json"), list.getBytes(Charsets.UTF_8.name()));
    }

    private List getEventJsonObjects(List list)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(new JSONObject(((TrackingRecord)list.next()).getData()))) { }
        return arraylist;
    }

    private boolean isSuccessCodeOrIgnored(int i)
    {
        return i >= 200 && i < 500;
    }

    private void sendBatch(List list, List list1)
        throws IOException, JSONException
    {
        Object obj;
        obj = buildRequest(list);
        obj = httpClient.a(((w) (obj))).a();
        int i;
        i = ((A) (obj)).c;
        String s = EventTracker.TAG;
        (new StringBuilder("Tracking event response: ")).append(((A) (obj)).toString());
        if (!isSuccessCodeOrIgnored(i)) goto _L2; else goto _L1
_L1:
        list1.addAll(list);
_L4:
        ((A) (obj)).g.close();
        return;
_L2:
        ErrorUtils.handleSilentException(EventTracker.TAG, new Exception((new StringBuilder("Tracking request failed with unexpected status code: ")).append(((A) (obj)).toString()).append("; recordCount = ").append(list.size()).toString()));
        if (true) goto _L4; else goto _L3
_L3:
        list;
        ((A) (obj)).g.close();
        throw list;
    }

    public List pushToRemote(List list)
    {
        ArrayList arraylist;
        int i;
        arraylist = new ArrayList(list.size());
        i = 0;
_L1:
        int k;
        int l;
        int i1;
        try
        {
            int j = batchSize * i;
            sendBatch(list.subList(j, Math.min(list.size(), batchSize + j)), arraylist);
        }
        catch (IOException ioexception)
        {
            String s = EventTracker.TAG;
            (new StringBuilder("Failed with IOException pushing event count: ")).append(list.size());
            return arraylist;
        }
        catch (JSONException jsonexception)
        {
            ErrorUtils.handleSilentException(jsonexception);
            String s1 = EventTracker.TAG;
            (new StringBuilder("Failed with JSONException, pushing event count: ")).append(list.size());
            return arraylist;
        }
        k = i + 1;
        l = batchSize;
        i1 = list.size();
        i = k;
        if (l * k >= i1)
        {
            return arraylist;
        }
          goto _L1
    }
}
