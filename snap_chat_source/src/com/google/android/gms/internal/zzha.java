// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class zzha
{

    private int zzvR;
    private final List zzxQ;
    private final List zzxR;
    private final String zzxS;
    private final String zzxT;
    private final String zzxU;
    private final String zzxV;
    private final boolean zzxW;
    private String zzxX;
    private final String zzxv;

    public zzha(int i, Map map)
    {
        zzxX = (String)map.get("url");
        zzxT = (String)map.get("base_uri");
        zzxU = (String)map.get("post_parameters");
        zzxW = parseBoolean((String)map.get("drt_include"));
        zzxS = (String)map.get("activation_overlay_url");
        zzxR = zzQ((String)map.get("check_packages"));
        zzxv = (String)map.get("request_id");
        zzxV = (String)map.get("type");
        zzxQ = zzQ((String)map.get("errors"));
        zzvR = i;
    }

    private static boolean parseBoolean(String s)
    {
        return s != null && (s.equals("1") || s.equals("true"));
    }

    private List zzQ(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return Arrays.asList(s.split(","));
        }
    }

    public int getErrorCode()
    {
        return zzvR;
    }

    public String getRequestId()
    {
        return zzxv;
    }

    public String getType()
    {
        return zzxV;
    }

    public String getUrl()
    {
        return zzxX;
    }

    public void setUrl(String s)
    {
        zzxX = s;
    }

    public List zzdU()
    {
        return zzxQ;
    }

    public String zzdV()
    {
        return zzxU;
    }

    public boolean zzdW()
    {
        return zzxW;
    }
}
