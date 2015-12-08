// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nokia.push;


public final class a
{

    static String a = "com.nokia.pushnotifications.service";
    static String b = "com.nokia.push.helper";
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    private static String h;

    static 
    {
        h = "com.nokia.pushnotifications";
        c = (new StringBuilder()).append(h).append(".intent.REGISTER").toString();
        d = (new StringBuilder()).append(h).append(".intent.UNREGISTER").toString();
        e = (new StringBuilder()).append(h).append(".intent.REGISTRATION").toString();
        f = (new StringBuilder()).append(h).append(".intent.RECEIVE").toString();
        g = (new StringBuilder()).append(h).append(".permission.SEND").toString();
    }
}
