// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;


public class q
{

    private String a;
    private String b;
    private int c;
    private String d;
    private String e;
    private String f;

    public q(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public q(String s, String s1, int i, String s2, String s3, String s4)
    {
        a = s;
        b = s1;
        c = i;
        d = s2;
        e = s3;
        f = s4;
    }

    public String a()
    {
        return a;
    }

    public void a(int i)
    {
        c = i;
    }

    public String b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public String d()
    {
        return e;
    }

    public String e()
    {
        return f;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PartnerData{partnerId='").append(a).append('\'').append(", partnerAuthToken='").append(b).append('\'').append(", stationSkipLimit=").append(c).append(", autoCompleteUrl='").append(d).append('\'').append(", deviceCategory='").append(e).append('\'').append(", deviceType='").append(f).append('\'').append('}').toString();
    }
}
