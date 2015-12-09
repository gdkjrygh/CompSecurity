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
//            dw, bi, bo

public final class bj
{

    public final List nc;
    public final long nd;
    public final List ne;
    public final List nf;
    public final List ng;
    public final String nh;
    public final long ni;
    public int nj;
    public int nk;

    public bj(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        if (dw.n(2))
        {
            dw.y((new StringBuilder()).append("Mediation Response JSON: ").append(s.toString(2)).toString());
        }
        JSONArray jsonarray = s.getJSONArray("ad_networks");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        int j = -1;
        for (int i = 0; i < jsonarray.length();)
        {
            bi bi1 = new bi(jsonarray.getJSONObject(i));
            arraylist.add(bi1);
            int k = j;
            if (j < 0)
            {
                k = j;
                if (a(bi1))
                {
                    k = i;
                }
            }
            i++;
            j = k;
        }

        nj = j;
        nk = jsonarray.length();
        nc = Collections.unmodifiableList(arraylist);
        nh = s.getString("qdata");
        s = s.optJSONObject("settings");
        if (s != null)
        {
            nd = s.optLong("ad_network_timeout_millis", -1L);
            ne = bo.a(s, "click_urls");
            nf = bo.a(s, "imp_urls");
            ng = bo.a(s, "nofill_urls");
            long l = s.optLong("refresh", -1L);
            if (l > 0L)
            {
                l *= 1000L;
            } else
            {
                l = -1L;
            }
            ni = l;
            return;
        } else
        {
            nd = -1L;
            ne = null;
            nf = null;
            ng = null;
            ni = -1L;
            return;
        }
    }

    private boolean a(bi bi1)
    {
        for (bi1 = bi1.mY.iterator(); bi1.hasNext();)
        {
            if (((String)bi1.next()).equals("com.google.ads.mediation.admob.AdMobAdapter"))
            {
                return true;
            }
        }

        return false;
    }
}
