// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;


final class aa
{

    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    private String m;

    public aa(String s, String s1, String s2, String s3, String s4, Boolean boolean1, String s5, 
            String s6, String s7, String s8, String s9, String s10)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        f = boolean1;
        g = s5;
        h = s6;
        i = s7;
        j = s8;
        k = s9;
        l = s10;
    }

    public final String toString()
    {
        if (m == null)
        {
            m = (new StringBuilder("appBundleId=")).append(a).append(", executionId=").append(b).append(", installationId=").append(c).append(", androidId=").append(d).append(", advertisingId=").append(e).append(", limitAdTrackingEnabled=").append(f).append(", betaDeviceToken=").append(g).append(", buildId=").append(h).append(", osVersion=").append(i).append(", deviceModel=").append(j).append(", appVersionCode=").append(k).append(", appVersionName=").append(l).toString();
        }
        return m;
    }
}
