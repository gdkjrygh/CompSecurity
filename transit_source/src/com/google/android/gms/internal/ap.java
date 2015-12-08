// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            cn, ao, au

public final class ap
{

    public final List eU;
    public final long eV;
    public final List eW;
    public final List eX;
    public final List eY;
    public final String eZ;
    public final long fa;

    public ap(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        if (cn.k(2))
        {
            cn.p((new StringBuilder()).append("Mediation Response JSON: ").append(s.toString(2)).toString());
        }
        JSONArray jsonarray = s.getJSONArray("ad_networks");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        for (int i = 0; i < jsonarray.length(); i++)
        {
            arraylist.add(new ao(jsonarray.getJSONObject(i)));
        }

        eU = Collections.unmodifiableList(arraylist);
        eZ = s.getString("qdata");
        s = s.optJSONObject("settings");
        if (s != null)
        {
            eV = s.optLong("ad_network_timeout_millis", -1L);
            eW = au.a(s, "click_urls");
            eX = au.a(s, "imp_urls");
            eY = au.a(s, "nofill_urls");
            long l = s.optLong("refresh", -1L);
            if (l > 0L)
            {
                l = 1000L * l;
            } else
            {
                l = -1L;
            }
            fa = l;
            return;
        } else
        {
            eV = -1L;
            eW = null;
            eX = null;
            eY = null;
            fa = -1L;
            return;
        }
    }
}
