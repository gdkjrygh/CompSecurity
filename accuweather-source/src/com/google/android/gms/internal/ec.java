// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class ec
{

    private final List qP;
    private final List qQ;
    private final String qR;
    private final String qS;
    private final String qT;
    private final String qU;
    private final String qV;
    private final boolean qW;
    private final int qX;

    public ec(Map map)
    {
        qV = (String)map.get("url");
        qS = (String)map.get("base_uri");
        qT = (String)map.get("post_parameters");
        qW = parseBoolean((String)map.get("drt_include"));
        qR = (String)map.get("activation_overlay_url");
        qQ = t((String)map.get("check_packages"));
        qX = parseInt((String)map.get("request_id"));
        qU = (String)map.get("type");
        qP = t((String)map.get("errors"));
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

    private List t(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return Arrays.asList(s.split(","));
        }
    }

    public List bt()
    {
        return qP;
    }

    public String bu()
    {
        return qT;
    }

    public boolean bv()
    {
        return qW;
    }

    public String getType()
    {
        return qU;
    }

    public String getUrl()
    {
        return qV;
    }
}
