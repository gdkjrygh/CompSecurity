// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import org.json.JSONObject;

public abstract class s
{

    protected static String a = "POST";
    protected static String b = "GET";
    protected String c;

    public s(String s1)
    {
        c = s1;
    }

    public abstract JSONObject a();

    public void a(String s1)
    {
        c = s1;
    }

    public abstract String b();

    protected String c()
    {
        return a;
    }

    public String d()
    {
        return c;
    }

}
