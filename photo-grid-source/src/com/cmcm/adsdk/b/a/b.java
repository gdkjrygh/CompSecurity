// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.b.a;

import org.json.JSONObject;

public final class b
{

    public String a;
    public String b;
    public int c;

    public b()
    {
    }

    public final Object a(JSONObject jsonobject)
    {
        try
        {
            a = jsonobject.getString("name");
            b = jsonobject.getString("parameter");
            c = jsonobject.getInt("weight");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            com.cmcm.adsdk.b.c.b.c("InfoBean", (new StringBuilder("parse json error...")).append(jsonobject.getMessage()).toString());
            return this;
        }
        return this;
    }

    public final String toString()
    {
        return String.format("(name %s :parameter %s :weight %d)", new Object[] {
            a, b, Integer.valueOf(c)
        });
    }
}
