// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.sysclear.model;

import java.io.Serializable;
import java.util.List;

public class Data
    implements Serializable
{

    private List a;
    private List b;
    private List c;
    private List d;
    private List e;

    public Data()
    {
    }

    public List getPackage_()
    {
        return e;
    }

    public List getProcess_()
    {
        return b;
    }

    public List getSharedUserId_()
    {
        return c;
    }

    public List getSuper_()
    {
        return d;
    }

    public List getSystem_()
    {
        return a;
    }

    public void setPackage_(List list)
    {
        e = list;
    }

    public void setProcess_(List list)
    {
        b = list;
    }

    public void setSharedUserId_(List list)
    {
        c = list;
    }

    public void setSuper_(List list)
    {
        d = list;
    }

    public void setSystem_(List list)
    {
        a = list;
    }

    public String toString()
    {
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
        if (a == null)
        {
            s = "";
        } else
        {
            s = a.toString();
        }
        if (b == null)
        {
            s1 = "";
        } else
        {
            s1 = b.toString();
        }
        if (c == null)
        {
            s2 = "";
        } else
        {
            s2 = c.toString();
        }
        if (d == null)
        {
            s3 = "";
        } else
        {
            s3 = d.toString();
        }
        if (e == null)
        {
            s4 = "";
        } else
        {
            s4 = e.toString();
        }
        return (new StringBuilder("system:")).append(s).append("\nprocess:").append(s1).append("\nsharedUserId:").append(s2).append("\nsuperStr:").append(s3).append("\npackageStr:").append(s4).toString();
    }
}
