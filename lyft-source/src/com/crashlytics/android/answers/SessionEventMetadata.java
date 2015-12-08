// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;


final class SessionEventMetadata
{

    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    private String l;

    public SessionEventMetadata(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, String s10)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        f = s5;
        g = s6;
        h = s7;
        i = s8;
        j = s9;
        k = s10;
    }

    public String toString()
    {
        if (l == null)
        {
            l = (new StringBuilder()).append("appBundleId=").append(a).append(", executionId=").append(b).append(", installationId=").append(c).append(", androidId=").append(d).append(", advertisingId=").append(e).append(", betaDeviceToken=").append(f).append(", buildId=").append(g).append(", osVersion=").append(h).append(", deviceModel=").append(i).append(", appVersionCode=").append(j).append(", appVersionName=").append(k).toString();
        }
        return l;
    }
}
