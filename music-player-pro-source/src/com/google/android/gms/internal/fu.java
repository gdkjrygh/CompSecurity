// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class fu
{

    private int tq;
    private final List uX;
    private final List uY;
    private final String uZ;
    private final String va;
    private final String vb;
    private final String vc;
    private final boolean vd;
    private final int ve;
    private String vf;

    public fu(int i, Map map)
    {
        vf = (String)map.get("url");
        va = (String)map.get("base_uri");
        vb = (String)map.get("post_parameters");
        vd = parseBoolean((String)map.get("drt_include"));
        uZ = (String)map.get("activation_overlay_url");
        uY = J((String)map.get("check_packages"));
        ve = parseInt((String)map.get("request_id"));
        vc = (String)map.get("type");
        uX = J((String)map.get("errors"));
        tq = i;
    }

    private List J(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return Arrays.asList(s.split(","));
        }
    }

    private static boolean parseBoolean(String s)
    {
        return s != null && (s.equals("1") || s.equals("true"));
    }

    private int parseInt(String s)
    {
        if (s == null)
        {
            return 0;
        } else
        {
            return Integer.parseInt(s);
        }
    }

    public List cT()
    {
        return uX;
    }

    public String cU()
    {
        return vb;
    }

    public boolean cV()
    {
        return vd;
    }

    public int getErrorCode()
    {
        return tq;
    }

    public String getType()
    {
        return vc;
    }

    public String getUrl()
    {
        return vf;
    }

    public void setUrl(String s)
    {
        vf = s;
    }
}
