// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;

public class o
{

    public static final String a = "1";
    private static final String b = "/oauth/access_token";
    private static final String c = "/oauth/authorize";
    private static final String d = "/oauth/request_token";
    private final String e = "/sync.json";
    private final String f;
    private final String g;
    private final String h;
    private final String i = (new StringBuilder()).append(n()).append("/user/").append("-").append("/sync.json").toString();
    private final String j;
    private final String k = "-";
    private final String l;
    private final String m;
    private final String n;
    private final String o = "https://api.createsend.com/api/v3/subscribers/8759df491a741b29cbc6b1bab4421aca.json";
    private final String p = "46cfcbb6e484a925dab578479c5327a3";
    private final String q = "magic";
    private final String r = "http://directsearch.fitbit.com/solr";
    private final String s;
    private String t;

    public o(String s1, String s2, String s3, String s4)
    {
        m = s3;
        n = s4;
        t = s1;
        j = s2;
        h = (new StringBuilder()).append(s1).append("/oauth/request_token").toString();
        f = (new StringBuilder()).append(s1).append("/oauth/access_token").toString();
        g = (new StringBuilder()).append(s1).append("/oauth/authorize").toString();
        l = (new StringBuilder()).append(s1).append("/").append("1").toString();
        if (!s1.startsWith("https"))
        {
            s1 = s1.replace("http", "https");
        }
        s = String.format("%s/%s/%s", new Object[] {
            s1, "1", "account/register.json"
        });
    }

    public long a()
    {
        long l1 = TrackerSyncPreferencesSavedState.v();
        double d1 = 0x493e0L;
        double d2 = Math.random();
        return (long)(int)(d1 + (double)(l1 * 60000L) * d2);
    }

    public String a(String s1)
    {
        return (new StringBuilder()).append(t).append("/").append(s1).toString();
    }

    public String b()
    {
        return s;
    }

    public String c()
    {
        return t;
    }

    public String d()
    {
        return j;
    }

    public String e()
    {
        return f;
    }

    public String f()
    {
        return g;
    }

    public String g()
    {
        return h;
    }

    public String h()
    {
        return m;
    }

    public String i()
    {
        return n;
    }

    public String j()
    {
        return i;
    }

    public String k()
    {
        return "https://api.createsend.com/api/v3/subscribers/8759df491a741b29cbc6b1bab4421aca.json";
    }

    public String l()
    {
        return "46cfcbb6e484a925dab578479c5327a3";
    }

    public String m()
    {
        return "magic";
    }

    public String n()
    {
        return l;
    }

    public String o()
    {
        return "http://directsearch.fitbit.com/solr";
    }
}
