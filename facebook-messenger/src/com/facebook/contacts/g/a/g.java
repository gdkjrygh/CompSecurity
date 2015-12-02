// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g.a;

import com.facebook.common.w.e;
import com.facebook.contacts.server.FetchVoipInfoParams;
import com.facebook.contacts.server.FetchVoipInfoResult;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.io.IOException;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class g
    implements f
{

    public g()
    {
    }

    public FetchVoipInfoResult a(FetchVoipInfoParams fetchvoipinfoparams, r r1)
    {
        r1.f();
        fetchvoipinfoparams = r1.c();
        if (!fetchvoipinfoparams.has("voip_info"))
        {
            throw new IOException("Expected response body to contain a voip_info field.");
        }
        JsonNode jsonnode = fetchvoipinfoparams.get("voip_info");
        if (!jsonnode.has("is_callable"))
        {
            throw new IOException("Expected voip_info to contain is_callable field.");
        }
        boolean flag = e.g(jsonnode.get("is_callable"));
        r1 = null;
        fetchvoipinfoparams = r1;
        if (!flag)
        {
            fetchvoipinfoparams = r1;
            if (jsonnode.has("reason_description"))
            {
                fetchvoipinfoparams = e.b(jsonnode.get("reason_description"));
            }
        }
        return new FetchVoipInfoResult(flag, fetchvoipinfoparams, System.currentTimeMillis());
    }

    public n a(FetchVoipInfoParams fetchvoipinfoparams)
    {
        java.util.ArrayList arraylist = hq.a();
        fetchvoipinfoparams = Long.toString(fetchvoipinfoparams.a());
        arraylist.add(new BasicNameValuePair("fields", "voip_info"));
        return new n("lookupUserVoipInfo", "GET", fetchvoipinfoparams, arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((FetchVoipInfoParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((FetchVoipInfoParams)obj, r1);
    }
}
