// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nux.status;

import com.facebook.common.time.a;
import com.facebook.debug.log.b;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.a.es;
import com.google.common.a.hy;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.nux.status:
//            d, FetchNuxStatusesResult, NuxStatusResult

public class j
{

    private static final Class a = com/facebook/nux/status/j;
    private final d b;
    private final ObjectMapper c;
    private final a d;
    private final ConcurrentMap e;

    public j(d d1, ObjectMapper objectmapper, a a1)
    {
        b = d1;
        c = objectmapper;
        d = a1;
        e = (new hy()).b(600L, TimeUnit.SECONDS).b(10).n();
    }

    private String a(NuxStatusResult nuxstatusresult)
    {
        try
        {
            nuxstatusresult = c.writeValueAsString(nuxstatusresult);
        }
        // Misplaced declaration of an exception variable
        catch (NuxStatusResult nuxstatusresult)
        {
            com.facebook.debug.log.b.d(a, "Error serializing NuxStatusResult.");
            return null;
        }
        return nuxstatusresult;
    }

    public void a(FetchNuxStatusesResult fetchnuxstatusesresult)
    {
        if (fetchnuxstatusesresult == null)
        {
            return;
        }
        e e1 = b.b();
        e1.a(com.facebook.nux.status.d.d, d.a());
        NuxStatusResult nuxstatusresult;
        for (fetchnuxstatusesresult = fetchnuxstatusesresult.a().iterator(); fetchnuxstatusesresult.hasNext(); e.put(nuxstatusresult.getNuxId(), nuxstatusresult))
        {
            nuxstatusresult = (NuxStatusResult)fetchnuxstatusesresult.next();
            com.facebook.prefs.shared.ae ae = com.facebook.nux.status.d.a(nuxstatusresult.getNuxId());
            String s = a(nuxstatusresult);
            if (s != null)
            {
                e1.a(ae, s);
            }
        }

        e1.a();
    }

}
