// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

final class au
{

    private static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static JSONObject a(String s)
    {
        return (JSONObject)a.get(s);
    }

    public static void a(String s, JSONObject jsonobject)
    {
        a.put(s, jsonobject);
    }

}
