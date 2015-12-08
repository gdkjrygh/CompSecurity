// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import org.json.JSONObject;

// Referenced classes of package com.nielsen.app.sdk:
//            AppRequestTimeShiftValue, c, AppRequestManager

public class a extends a
{

    boolean a;
    final AppRequestTimeShiftValue b;

    public void onError(String s, long l, Exception exception)
    {
        AppRequestTimeShiftValue.a(b).put(Boolean.valueOf(a));
        s = ((String) (new Object[0]));
_L2:
        c.a(exception, true, 9, 'E', "Error while responding request", s);
        return;
        s;
        c.a(exception, true, 9, 'E', "Error while responding request", new Object[0]);
        throw s;
        s;
        s = ((String) (new Object[0]));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onFinish(String s, long l, String s1)
    {
        c.a('I', "TSV response: %s", new Object[] {
            s1
        });
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        if (s1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_225;
        }
        s = new JSONObject(s1);
        if (!s.has("nol_tsvFlag"))
        {
            break MISSING_BLOCK_LABEL_225;
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
            s1 = s.getString("nol_tsvFlag");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            onError(String.format("Failed recovering TSV value for CID(%s)", new Object[] {
                AppRequestTimeShiftValue.b(b)
            }), l, s);
            return;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        if (!s1.isEmpty())
        {
            AppRequestTimeShiftValue.a(b, s1);
            if (s.has("nol_pcTimeCode"))
            {
                AppRequestTimeShiftValue.a(b, s.getLong("nol_pcTimeCode"));
            }
            if (s.has("nol_fdTimeCode"))
            {
                AppRequestTimeShiftValue.b(b, s.getLong("nol_fdTimeCode"));
            }
            a = true;
        }
        AppRequestTimeShiftValue.a(b).put(Boolean.valueOf(a));
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

    public (AppRequestTimeShiftValue apprequesttimeshiftvalue, AppRequestManager apprequestmanager)
    {
        b = apprequesttimeshiftvalue;
        apprequestmanager.getClass();
        super(apprequestmanager, "TimeShiftValueHandler");
        a = false;
    }
}
