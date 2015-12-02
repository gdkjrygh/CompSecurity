// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nux.status;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.nux.status:
//            n, UpdateNuxStatusParams

public class l
    implements f
{

    public l()
    {
    }

    private String a(com.facebook.nux.status.n n1)
    {
        if (n1 == n.COMPLETE)
        {
            return "COMPLETE";
        } else
        {
            return "SKIPPED";
        }
    }

    public n a(UpdateNuxStatusParams updatenuxstatusparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "JSON"));
        arraylist.add(new BasicNameValuePair("nux_id", updatenuxstatusparams.a().toUpperCase()));
        arraylist.add(new BasicNameValuePair("step", updatenuxstatusparams.b()));
        arraylist.add(new BasicNameValuePair("status", a(updatenuxstatusparams.c())));
        return new n("updateNuxStatus", "GET", "method/user.updateNuxStatus", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((UpdateNuxStatusParams)obj);
    }

    public Boolean a(UpdateNuxStatusParams updatenuxstatusparams, r r1)
    {
        return Boolean.valueOf(r1.c().asBoolean(false));
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((UpdateNuxStatusParams)obj, r1);
    }
}
