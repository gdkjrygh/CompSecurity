// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ceo
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

    public ceo(String s)
    {
        s = new JSONObject(s);
        if (bka.a(2))
        {
            bka.d((new StringBuilder("Mediation Response JSON: ")).append(s.toString(2)).toString());
        }
        JSONArray jsonarray = s.getJSONArray("ad_networks");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        int k = -1;
        for (int j = 0; j < jsonarray.length();)
        {
            cen cen1 = new cen(jsonarray.getJSONObject(j));
            arraylist.add(cen1);
            int l = k;
            if (k < 0)
            {
                l = k;
                if (a(cen1))
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
            bkv.q();
            c = ceu.a(s, "click_urls");
            bkv.q();
            d = ceu.a(s, "imp_urls");
            bkv.q();
            e = ceu.a(s, "nofill_urls");
            long l1 = s.optLong("refresh", -1L);
            if (l1 > 0L)
            {
                l1 *= 1000L;
            } else
            {
                l1 = -1L;
            }
            g = l1;
            s = s.optJSONArray("rewards");
            if (s == null || s.length() == 0)
            {
                return;
            } else
            {
                s.getJSONObject(0).optString("rb_type");
                s.getJSONObject(0).optInt("rb_amount");
                return;
            }
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

    private static boolean a(cen cen1)
    {
        for (cen1 = cen1.c.iterator(); cen1.hasNext();)
        {
            if (((String)cen1.next()).equals("com.google.ads.mediation.admob.AdMobAdapter"))
            {
                return true;
            }
        }

        return false;
    }
}
