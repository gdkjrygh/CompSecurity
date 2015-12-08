// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ek, ap, ay

public final class aq
{

    public final List a;
    public final long b;
    public final List c;
    public final List d;
    public final List e;
    public final String f;
    public final long g;
    public int h;
    public int i;

    public aq(String s)
    {
        s = new JSONObject(s);
        if (ek.a(2))
        {
            ek.c((new StringBuilder("Mediation Response JSON: ")).append(s.toString(2)).toString());
        }
        JSONArray jsonarray = s.getJSONArray("ad_networks");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        int k = -1;
        for (int j = 0; j < jsonarray.length();)
        {
            ap ap1 = new ap(jsonarray.getJSONObject(j));
            arraylist.add(ap1);
            int l = k;
            if (k < 0)
            {
                l = k;
                if (a(ap1))
                {
                    l = j;
                }
            }
            j++;
            k = l;
        }

        h = k;
        i = jsonarray.length();
        a = Collections.unmodifiableList(arraylist);
        f = s.getString("qdata");
        s = s.optJSONObject("settings");
        if (s != null)
        {
            b = s.optLong("ad_network_timeout_millis", -1L);
            c = ay.a(s, "click_urls");
            d = ay.a(s, "imp_urls");
            e = ay.a(s, "nofill_urls");
            long l1 = s.optLong("refresh", -1L);
            if (l1 > 0L)
            {
                l1 *= 1000L;
            } else
            {
                l1 = -1L;
            }
            g = l1;
            return;
        } else
        {
            b = -1L;
            c = null;
            d = null;
            e = null;
            g = -1L;
            return;
        }
    }

    private static boolean a(ap ap1)
    {
        for (ap1 = ap1.c.iterator(); ap1.hasNext();)
        {
            if (((String)ap1.next()).equals("com.google.ads.mediation.admob.AdMobAdapter"))
            {
                return true;
            }
        }

        return false;
    }
}
