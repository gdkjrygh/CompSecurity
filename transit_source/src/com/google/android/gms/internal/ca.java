// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            bu, x, co, cn, 
//            ci, cd, v

public final class ca
{

    private static final SimpleDateFormat gS = new SimpleDateFormat("yyyyMMdd");

    public static String a(bu bu1, cd cd1, Location location)
    {
        try
        {
            HashMap hashmap = new HashMap();
            if (bu1.gA != null)
            {
                hashmap.put("ad_pos", bu1.gA);
            }
            a(hashmap, bu1.gB);
            hashmap.put("format", bu1.ed.ew);
            if (bu1.ed.width == -1)
            {
                hashmap.put("smart_w", "full");
            }
            if (bu1.ed.height == -2)
            {
                hashmap.put("smart_h", "auto");
            }
            hashmap.put("slotname", bu1.adUnitId);
            hashmap.put("pn", bu1.applicationInfo.packageName);
            if (bu1.gC != null)
            {
                hashmap.put("vc", Integer.valueOf(bu1.gC.versionCode));
            }
            hashmap.put("ms", bu1.gD);
            hashmap.put("seq_num", bu1.gE);
            hashmap.put("session_id", bu1.gF);
            hashmap.put("js", bu1.eg.hP);
            a(hashmap, cd1);
            a(hashmap, location);
            if (cn.k(2))
            {
                bu1 = ci.l(hashmap).toString(2);
                cn.p((new StringBuilder()).append("Ad Request JSON: ").append(bu1).toString());
            }
            bu1 = ci.l(hashmap).toString();
        }
        // Misplaced declaration of an exception variable
        catch (bu bu1)
        {
            cn.q((new StringBuilder()).append("Problem serializing ad request to JSON: ").append(bu1.getMessage()).toString());
            return null;
        }
        return bu1;
    }

    private static void a(HashMap hashmap, Location location)
    {
        if (location == null)
        {
            return;
        } else
        {
            HashMap hashmap1 = new HashMap();
            float f = location.getAccuracy();
            long l = location.getTime();
            long l1 = (long)(location.getLatitude() * 10000000D);
            long l2 = (long)(location.getLongitude() * 10000000D);
            hashmap1.put("radius", Float.valueOf(f * 1000F));
            hashmap1.put("lat", Long.valueOf(l1));
            hashmap1.put("long", Long.valueOf(l2));
            hashmap1.put("time", Long.valueOf(l * 1000L));
            hashmap.put("loc", hashmap1);
            return;
        }
    }

    private static void a(HashMap hashmap, cd cd1)
    {
        hashmap.put("am", Integer.valueOf(cd1.hh));
        hashmap.put("cog", g(cd1.hi));
        hashmap.put("coh", g(cd1.hj));
        if (!TextUtils.isEmpty(cd1.hk))
        {
            hashmap.put("carrier", cd1.hk);
        }
        hashmap.put("gl", cd1.hl);
        if (cd1.hm)
        {
            hashmap.put("simulator", Integer.valueOf(1));
        }
        hashmap.put("ma", g(cd1.hn));
        hashmap.put("sp", g(cd1.ho));
        hashmap.put("hl", cd1.hp);
        if (!TextUtils.isEmpty(cd1.hq))
        {
            hashmap.put("mv", cd1.hq);
        }
        hashmap.put("muv", Integer.valueOf(cd1.hr));
        if (cd1.hs != -2)
        {
            hashmap.put("cnt", Integer.valueOf(cd1.hs));
        }
        hashmap.put("gnt", Integer.valueOf(cd1.ht));
        hashmap.put("pt", Integer.valueOf(cd1.hu));
        hashmap.put("rm", Integer.valueOf(cd1.hv));
        hashmap.put("riv", Integer.valueOf(cd1.hw));
        hashmap.put("u_sd", Float.valueOf(cd1.hx));
        hashmap.put("sh", Integer.valueOf(cd1.hz));
        hashmap.put("sw", Integer.valueOf(cd1.hy));
    }

    private static void a(HashMap hashmap, v v1)
    {
        if (v1.es != -1L)
        {
            hashmap.put("cust_age", gS.format(new Date(v1.es)));
        }
        if (v1.extras != null)
        {
            hashmap.put("extras", v1.extras);
        }
        if (v1.et != -1)
        {
            hashmap.put("cust_gender", Integer.valueOf(v1.et));
        }
        if (v1.eu != null)
        {
            hashmap.put("kw", v1.eu);
        }
        if (v1.tagForChildDirectedTreatment != -1)
        {
            hashmap.put("tag_for_child_directed_treatment", Integer.valueOf(v1.tagForChildDirectedTreatment));
        }
        if (v1.ev)
        {
            hashmap.put("adtest", "on");
        }
    }

    private static Integer g(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return Integer.valueOf(i);
    }

}
