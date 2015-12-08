// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            HitBuilders, u, aa, ak, 
//            o

protected static class vl
{

    private Map vl;

    public Map build()
    {
        return vl;
    }

    protected String get(String s)
    {
        return (String)vl.get(s);
    }

    public final vl set(String s, String s1)
    {
        u.cy().a(vl);
        if (s != null)
        {
            vl.put(s, s1);
            return this;
        } else
        {
            aa.z(" HitBuilder.set() called with a null paramName.");
            return this;
        }
    }

    public final vl setAll(Map map)
    {
        u.cy().a(vl);
        if (map == null)
        {
            return this;
        } else
        {
            vl.putAll(new HashMap(map));
            return this;
        }
    }

    public vl setCampaignParamsFromUrl(String s)
    {
        u.cy().a(vl);
        s = ak.O(s);
        if (TextUtils.isEmpty(s))
        {
            return this;
        } else
        {
            s = ak.N(s);
            set("&cc", (String)s.get("utm_content"));
            set("&cm", (String)s.get("utm_medium"));
            set("&cn", (String)s.get("utm_campaign"));
            set("&cs", (String)s.get("utm_source"));
            set("&ck", (String)s.get("utm_term"));
            set("&ci", (String)s.get("utm_id"));
            set("&gclid", (String)s.get("gclid"));
            set("&dclid", (String)s.get("dclid"));
            set("&gmob_t", (String)s.get("gmob_t"));
            return this;
        }
    }

    public set setCustomDimension(int i, String s)
    {
        set(o.q(i), s);
        return this;
    }

    public set setCustomMetric(int i, float f)
    {
        set(o.r(i), Float.toString(f));
        return this;
    }

    protected set setHitType(String s)
    {
        set("&t", s);
        return this;
    }

    public set setNewSession()
    {
        set("&sc", "start");
        return this;
    }

    public set setNonInteraction(boolean flag)
    {
        set("&ni", ak.u(flag));
        return this;
    }

    protected ()
    {
        vl = new HashMap();
    }
}
