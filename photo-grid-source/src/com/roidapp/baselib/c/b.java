// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import android.content.Context;
import com.flurry.android.FlurryAgent;
import java.util.HashMap;

public final class b
{

    public static boolean a = false;

    public static void a(Context context)
    {
        FlurryAgent.setLogEnabled(false);
        FlurryAgent.setCaptureUncaughtExceptions(false);
        FlurryAgent.setLogEvents(true);
        FlurryAgent.init(context, "9NT2CYXJ568CRK5HVQ9M");
    }

    public static void a(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("Entry", s);
        FlurryAgent.logEvent("OpenPG", hashmap);
    }

    public static void a(String s, int i)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(s, String.valueOf(i));
        FlurryAgent.logEvent("AvgTime_2", hashmap);
    }

    public static void a(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("PageView/SNS", s);
        hashmap.put("PageView/SNS/TopicName", s1);
        FlurryAgent.logEvent("PageView", hashmap);
    }

    public static void a(String s, String s1, int i)
    {
        HashMap hashmap = new HashMap();
        hashmap.put((new StringBuilder()).append(s).append("/").append(s1).toString(), String.valueOf(i));
        FlurryAgent.logEvent("AvgTime_2_Topic", hashmap);
    }

    public static void a(String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(s1, s2);
        FlurryAgent.logEvent(s, hashmap);
    }

    public static void a(boolean flag)
    {
        a = flag;
    }

    public static void b(Context context)
    {
        FlurryAgent.onStartSession(context);
    }

    public static void b(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("PageView/SNS", s);
        FlurryAgent.logEvent("PageView", hashmap);
    }

    public static void b(String s, int i)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(s, String.valueOf(i));
        FlurryAgent.logEvent("UpGlideNumber", hashmap);
    }

    public static void b(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(s, s1);
        FlurryAgent.logEvent("Cloud/GCM", hashmap);
    }

    public static void b(String s, String s1, int i)
    {
        HashMap hashmap = new HashMap();
        hashmap.put((new StringBuilder()).append(s).append("/").append(s1).toString(), String.valueOf(i));
        FlurryAgent.logEvent("UpGlideNumber_Topic", hashmap);
    }

    public static void c(Context context)
    {
        FlurryAgent.onEndSession(context);
    }

    public static void c(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("PageView/Cloud", s);
        FlurryAgent.logEvent("PageView", hashmap);
    }

    public static void c(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("PageName", s);
        hashmap.put("TopicName", s1);
        FlurryAgent.logEvent("Bounce", hashmap);
    }

    public static void d(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("PageView/Main", s);
        FlurryAgent.logEvent("PageView", hashmap);
    }

    public static void d(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(s, s1);
        FlurryAgent.logEvent("Function", hashmap);
    }

    public static void e(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("PageName", s);
        FlurryAgent.logEvent("Bounce", hashmap);
    }

    public static void e(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(s, (new StringBuilder()).append(s1).append("/true").toString());
        FlurryAgent.logEvent("Cloud/Share", hashmap);
    }

    public static void f(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("EventName", s);
        FlurryAgent.logEvent("CommonEvent", hashmap);
    }

    public static void f(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        if (a)
        {
            hashmap.put((new StringBuilder("LoggedIn/")).append(s).toString(), s1);
        } else
        {
            hashmap.put(s, s1);
        }
        FlurryAgent.logEvent("Cloud/Template", hashmap);
    }

    public static void g(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(s, s1);
        FlurryAgent.logEvent("Sticker", hashmap);
    }

}
