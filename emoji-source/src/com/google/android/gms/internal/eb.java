// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class eb
{

    private final List qS;
    private final List qT;
    private final String qU;
    private final String qV;
    private final String qW;
    private final String qX;
    private final String qY;
    private final boolean qZ;
    private final int ra;

    public eb(Map map)
    {
        qY = (String)map.get("url");
        qV = (String)map.get("base_uri");
        qW = (String)map.get("post_parameters");
        qZ = parseBoolean((String)map.get("drt_include"));
        qU = (String)map.get("activation_overlay_url");
        qT = t((String)map.get("check_packages"));
        ra = parseInt((String)map.get("request_id"));
        qX = (String)map.get("type");
        qS = t((String)map.get("errors"));
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

    public boolean bA()
    {
        return qZ;
    }

    public List by()
    {
        return qS;
    }

    public String bz()
    {
        return qW;
    }

    public String getType()
    {
        return qX;
    }

    public String getUrl()
    {
        return qY;
    }
}
