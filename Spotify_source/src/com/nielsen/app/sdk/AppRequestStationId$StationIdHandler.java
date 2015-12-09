// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import org.json.JSONObject;

// Referenced classes of package com.nielsen.app.sdk:
//            AppRequestStationId, c, AppRequestManager

public class a extends a
{

    Boolean a;
    final AppRequestStationId b;

    public void onError(String s, long l, Exception exception)
    {
        AppRequestStationId.a(b).put(a);
        s = ((String) (new Object[0]));
_L2:
        c.a(exception, true, 12, 'E', "Error while responding request", s);
        return;
        s;
        c.a(exception, true, 12, 'E', "Error while responding request", new Object[0]);
        throw s;
        s;
        s = ((String) (new Object[0]));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onFinish(String s, long l, String s1)
    {
        c.a('I', "STATION ID response: %s", new Object[] {
            s1
        });
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        if (s1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_186;
        }
        s = new JSONObject(s1);
        if (!s.has("nol_stationId"))
        {
            break MISSING_BLOCK_LABEL_186;
        }
        b.a.clear();
        String s2;
        String s3;
        for (s1 = s.keys(); s1.hasNext(); b.a.put(s2, s3))
        {
            s2 = (String)s1.next();
            s3 = s.getString(s2);
        }

        try
        {
            s = s.getString("nol_stationId");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            onError((new StringBuilder("Failed recovering StationId value for assetId(")).append(AppRequestStationId.b(b)).append(")").toString(), l, s);
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        if (!s.isEmpty())
        {
            AppRequestStationId.a(b, s);
            a = Boolean.valueOf(true);
        }
        AppRequestStationId.a(b).put(a);
        return;
    }

    public void onIdle(String s, long l)
    {
    }

    public void onStart(String s, long l)
    {
    }

    public void onUpdate(String s, long l, long l1, long l2, 
            String s1)
    {
    }

    public (AppRequestStationId apprequeststationid, AppRequestManager apprequestmanager)
    {
        b = apprequeststationid;
        apprequestmanager.getClass();
        super(apprequestmanager, "StationIdHandler");
        a = Boolean.valueOf(false);
    }
}
