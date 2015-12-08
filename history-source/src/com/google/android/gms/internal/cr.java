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
//            gr, cq, cw

public final class cr
{

    public final long qA;
    public int qB;
    public int qC;
    public final List qu;
    public final long qv;
    public final List qw;
    public final List qx;
    public final List qy;
    public final String qz;

    public cr(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        if (gr.v(2))
        {
            gr.V((new StringBuilder()).append("Mediation Response JSON: ").append(s.toString(2)).toString());
        }
        JSONArray jsonarray = s.getJSONArray("ad_networks");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        int j = -1;
        for (int i = 0; i < jsonarray.length();)
        {
            cq cq1 = new cq(jsonarray.getJSONObject(i));
            arraylist.add(cq1);
            int k = j;
            if (j < 0)
            {
                k = j;
                if (a(cq1))
                {
                    k = i;
                }
            }
            i++;
            j = k;
        }

        qB = j;
        qC = jsonarray.length();
        qu = Collections.unmodifiableList(arraylist);
        qz = s.getString("qdata");
        s = s.optJSONObject("settings");
        if (s != null)
        {
            qv = s.optLong("ad_network_timeout_millis", -1L);
            qw = cw.a(s, "click_urls");
            qx = cw.a(s, "imp_urls");
            qy = cw.a(s, "nofill_urls");
            long l = s.optLong("refresh", -1L);
            if (l > 0L)
            {
                l *= 1000L;
            } else
            {
                l = -1L;
            }
            qA = l;
            return;
        } else
        {
            qv = -1L;
            qw = null;
            qx = null;
            qy = null;
            qA = -1L;
            return;
        }
    }

    private boolean a(cq cq1)
    {
        for (cq1 = cq1.qp.iterator(); cq1.hasNext();)
        {
            if (((String)cq1.next()).equals("com.google.ads.mediation.admob.AdMobAdapter"))
            {
                return true;
            }
        }

        return false;
    }
}
