// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.network;

import com.cardinalblue.android.b.k;
import com.google.b.c.a;
import java.lang.reflect.Type;
import java.util.List;
import org.json.JSONException;

public class d
{

    public d()
    {
    }

    public static List a(String s)
        throws JSONException
    {
        return a(s, (new a() {

        }).getType());
    }

    private static List a(String s, Type type)
        throws JSONException
    {
        s = (com.cardinalblue.android.piccollage.model.b.a)k.b(s, type);
        if (s == null)
        {
            throw new JSONException("Empty response");
        }
        s = s.a();
        if (s == null)
        {
            throw new JSONException("FbApiresponse.list is empty");
        } else
        {
            return s;
        }
    }

    public static List b(String s)
        throws JSONException
    {
        return a(s, (new a() {

        }).getType());
    }
}
