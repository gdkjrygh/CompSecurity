// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class aeb
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

    public aeb(String s)
    {
        s = new JSONObject(s);
        if (of.a(2))
        {
            of.d((new StringBuilder("Mediation Response JSON: ")).append(s.toString(2)).toString());
        }
        JSONArray jsonarray = s.getJSONArray("ad_networks");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        int k = -1;
        for (int j = 0; j < jsonarray.length();)
        {
            aea aea1 = new aea(jsonarray.getJSONObject(j));
            arraylist.add(aea1);
            int l = k;
            if (k < 0)
            {
                l = k;
                if (a(aea1))
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
            ot.o();
            c = aeh.a(s, "click_urls");
            ot.o();
            d = aeh.a(s, "imp_urls");
            ot.o();
            e = aeh.a(s, "nofill_urls");
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

    private static boolean a(aea aea1)
    {
        for (aea1 = aea1.c.iterator(); aea1.hasNext();)
        {
            if (((String)aea1.next()).equals("com.google.ads.mediation.admob.AdMobAdapter"))
            {
                return true;
            }
        }

        return false;
    }
}
