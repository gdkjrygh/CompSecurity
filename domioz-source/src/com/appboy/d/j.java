// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d;

import a.a.dl;
import com.appboy.b.c;
import org.json.JSONObject;

public final class j
{

    private final c a;
    private final String b;

    public j(c c1, String s)
    {
        a = c1;
        b = s;
    }

    public j(JSONObject jsonobject)
    {
        a = (c)dl.a(jsonobject, "type", com/appboy/b/c);
        b = jsonobject.getString("message");
    }

    public final c a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }
}
