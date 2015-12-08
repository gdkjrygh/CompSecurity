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
//            gs, cl, cr

public final class cm
{

    public final List qd;
    public final long qe;
    public final List qf;
    public final List qg;
    public final List qh;
    public final String qi;
    public final long qj;
    public int qk;
    public int ql;

    public cm(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        if (gs.u(2))
        {
            gs.V((new StringBuilder()).append("Mediation Response JSON: ").append(s.toString(2)).toString());
        }
        JSONArray jsonarray = s.getJSONArray("ad_networks");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        int j = -1;
        for (int i = 0; i < jsonarray.length();)
        {
            cl cl1 = new cl(jsonarray.getJSONObject(i));
            arraylist.add(cl1);
            int k = j;
            if (j < 0)
            {
                k = j;
                if (a(cl1))
                {
                    k = i;
                }
            }
            i++;
            j = k;
        }

        qk = j;
        ql = jsonarray.length();
        qd = Collections.unmodifiableList(arraylist);
        qi = s.getString("qdata");
        s = s.optJSONObject("settings");
        if (s != null)
        {
            qe = s.optLong("ad_network_timeout_millis", -1L);
            qf = cr.a(s, "click_urls");
            qg = cr.a(s, "imp_urls");
            qh = cr.a(s, "nofill_urls");
            long l = s.optLong("refresh", -1L);
            if (l > 0L)
            {
                l *= 1000L;
            } else
            {
                l = -1L;
            }
            qj = l;
            return;
        } else
        {
            qe = -1L;
            qf = null;
            qg = null;
            qh = null;
            qj = -1L;
            return;
        }
    }

    private boolean a(cl cl1)
    {
        for (cl1 = cl1.pY.iterator(); cl1.hasNext();)
        {
            if (((String)cl1.next()).equals("com.google.ads.mediation.admob.AdMobAdapter"))
            {
                return true;
            }
        }

        return false;
    }
}
