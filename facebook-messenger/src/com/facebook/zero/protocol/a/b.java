// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.protocol.a;

import com.facebook.common.w.e;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.zero.protocol.CarrierAndSimMccMnc;
import com.facebook.zero.server.FetchZeroTokenParams;
import com.facebook.zero.server.FetchZeroTokenResult;
import com.facebook.zero.server.c;
import com.facebook.zero.ui.p;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class b
    implements f
{

    private static final Class a = com/facebook/zero/protocol/a/b;
    private final p b;
    private final com.facebook.zero.rewrite.e c;

    public b(p p1, com.facebook.zero.rewrite.e e1)
    {
        b = p1;
        c = e1;
    }

    public n a(FetchZeroTokenParams fetchzerotokenparams)
    {
        CarrierAndSimMccMnc carrierandsimmccmnc = fetchzerotokenparams.a();
        fetchzerotokenparams = fetchzerotokenparams.b();
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("carrier_mcc", carrierandsimmccmnc.a().a()));
        arraylist.add(new BasicNameValuePair("carrier_mnc", carrierandsimmccmnc.a().b()));
        arraylist.add(new BasicNameValuePair("sim_mcc", carrierandsimmccmnc.b().a()));
        arraylist.add(new BasicNameValuePair("sim_mnc", carrierandsimmccmnc.b().b()));
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("interface", fetchzerotokenparams.a()));
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Requesting zero rating token with params: ").append(arraylist.toString()).toString());
        return new n("fetchZeroToken", "GET", "method/mobile.zeroCampaign", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((FetchZeroTokenParams)obj);
    }

    public FetchZeroTokenResult a(FetchZeroTokenParams fetchzerotokenparams, r r1)
    {
        r1 = r1.c();
        if (r1 == null)
        {
            throw new Exception("Expected response to be a struct");
        }
        String s = e.a(r1.get("id"), "");
        String s1 = e.a(r1.get("status"), "unknown");
        if (r1.get("enabled_ui_features") != null)
        {
            fetchzerotokenparams = b.a(r1.get("enabled_ui_features"));
        } else
        {
            fetchzerotokenparams = es.d();
        }
        r1 = r1.get("rewrite_rules");
        if (r1 != null)
        {
            r1 = c.a(r1);
        } else
        {
            r1 = es.d();
        }
        fetchzerotokenparams = new FetchZeroTokenResult(s, s1, fetchzerotokenparams, r1);
        com.facebook.debug.log.b.b(a, "FetchZeroTokenResult: %s", new Object[] {
            fetchzerotokenparams
        });
        return fetchzerotokenparams;
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((FetchZeroTokenParams)obj, r1);
    }

}
