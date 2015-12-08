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
//            eu, bl, br

public final class bm
{

    public final List nr;
    public final long ns;
    public final List nt;
    public final List nu;
    public final List nv;
    public final String nw;
    public final long nx;
    public int ny;
    public int nz;

    public bm(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        if (eu.p(2))
        {
            eu.C((new StringBuilder()).append("Mediation Response JSON: ").append(s.toString(2)).toString());
        }
        JSONArray jsonarray = s.getJSONArray("ad_networks");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        int j = -1;
        for (int i = 0; i < jsonarray.length();)
        {
            bl bl1 = new bl(jsonarray.getJSONObject(i));
            arraylist.add(bl1);
            int k = j;
            if (j < 0)
            {
                k = j;
                if (a(bl1))
                {
                    k = i;
                }
            }
            i++;
            j = k;
        }

        ny = j;
        nz = jsonarray.length();
        nr = Collections.unmodifiableList(arraylist);
        nw = s.getString("qdata");
        s = s.optJSONObject("settings");
        if (s != null)
        {
            ns = s.optLong("ad_network_timeout_millis", -1L);
            nt = br.a(s, "click_urls");
            nu = br.a(s, "imp_urls");
            nv = br.a(s, "nofill_urls");
            long l = s.optLong("refresh", -1L);
            if (l > 0L)
            {
                l *= 1000L;
            } else
            {
                l = -1L;
            }
            nx = l;
            return;
        } else
        {
            ns = -1L;
            nt = null;
            nu = null;
            nv = null;
            nx = -1L;
            return;
        }
    }

    private boolean a(bl bl1)
    {
        for (bl1 = bl1.nm.iterator(); bl1.hasNext();)
        {
            if (((String)bl1.next()).equals("com.google.ads.mediation.admob.AdMobAdapter"))
            {
                return true;
            }
        }

        return false;
    }
}
