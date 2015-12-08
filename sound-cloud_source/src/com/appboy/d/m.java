// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d;

import bo.app.eo;
import com.appboy.b.c;
import org.json.JSONObject;

public final class m
{

    public final c a;
    public final String b;

    public m(c c1, String s)
    {
        a = c1;
        b = s;
    }

    public m(JSONObject jsonobject)
    {
        a = (c)eo.a(jsonobject, "type", com/appboy/b/c);
        b = jsonobject.getString("message");
    }
}
