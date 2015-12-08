// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;


public class Constants
{

    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    private static String m;

    Constants()
    {
    }

    static 
    {
        String s = com/snapchat/android/analytics/framework/Constants.getPackage().getName();
        m = s;
        a = s;
        b = m;
        c = (new StringBuilder()).append(m).append(".startSessionRelativeTs").toString();
        d = (new StringBuilder()).append(m).append(".endSessionRelativeTs").toString();
        e = (new StringBuilder()).append(m).append(".endSessionAbsoluteTs").toString();
        f = (new StringBuilder()).append(m).append(".sessionIsBeingClosed").toString();
        g = (new StringBuilder()).append(m).append(".timeActive").toString();
        h = (new StringBuilder()).append(m).append(".seqNum").toString();
        i = (new StringBuilder()).append(m).append(".sessionId").toString();
        j = (new StringBuilder()).append(m).append(".rejectedEventCount").toString();
        k = (new StringBuilder()).append(m).append(".overflowedEventCount").toString();
        l = (new StringBuilder()).append(m).append(".firstFailureTs").toString();
    }
}
