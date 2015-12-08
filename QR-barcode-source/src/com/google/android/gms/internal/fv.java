// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class fv
{

    private int tc;
    private final List uJ;
    private final List uK;
    private final String uL;
    private final String uM;
    private final String uN;
    private final String uO;
    private final boolean uP;
    private final int uQ;
    private String uR;

    public fv(int i, Map map)
    {
        uR = (String)map.get("url");
        uM = (String)map.get("base_uri");
        uN = (String)map.get("post_parameters");
        uP = parseBoolean((String)map.get("drt_include"));
        uL = (String)map.get("activation_overlay_url");
        uK = J((String)map.get("check_packages"));
        uQ = parseInt((String)map.get("request_id"));
        uO = (String)map.get("type");
        uJ = J((String)map.get("errors"));
        tc = i;
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

    public List cL()
    {
        return uJ;
    }

    public String cM()
    {
        return uN;
    }

    public boolean cN()
    {
        return uP;
    }

    public int getErrorCode()
    {
        return tc;
    }

    public String getType()
    {
        return uO;
    }

    public String getUrl()
    {
        return uR;
    }

    public void setUrl(String s)
    {
        uR = s;
    }
}
