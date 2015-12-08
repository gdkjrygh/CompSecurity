// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ev, bm, bs

public final class bn
{

    public final List np;
    public final long nq;
    public final List nr;
    public final List ns;
    public final List nt;
    public final String nu;
    public final long nv;
    public int nw;
    public int nx;

    public bn(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        if (ev.p(2))
        {
            ev.C((new StringBuilder()).append("Mediation Response JSON: ").append(s.toString(2)).toString());
        }
        JSONArray jsonarray = s.getJSONArray("ad_networks");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        int j = -1;
        for (int i = 0; i < jsonarray.length();)
        {
            bm bm1 = new bm(jsonarray.getJSONObject(i));
            arraylist.add(bm1);
            int k = j;
            if (j < 0)
            {
                k = j;
                if (a(bm1))
                {
                    k = i;
                }
            }
            i++;
            j = k;
        }

        nw = j;
        nx = jsonarray.length();
        np = Collections.unmodifiableList(arraylist);
        nu = s.getString("qdata");
        s = s.optJSONObject("settings");
        if (s != null)
        {
            nq = s.optLong("ad_network_timeout_millis", -1L);
            nr = bs.a(s, "click_urls");
            ns = bs.a(s, "imp_urls");
            nt = bs.a(s, "nofill_urls");
            long l = s.optLong("refresh", -1L);
            if (l > 0L)
            {
                l *= 1000L;
            } else
            {
                l = -1L;
            }
            nv = l;
            return;
        } else
        {
            nq = -1L;
            nr = null;
            ns = null;
            nt = null;
            nv = -1L;
            return;
        }
    }

    private boolean a(bm bm1)
    {
        for (bm1 = bm1.nk.iterator(); bm1.hasNext();)
        {
            if (((String)bm1.next()).equals("com.google.ads.mediation.admob.AdMobAdapter"))
            {
                return true;
            }
        }

        return false;
    }
}
