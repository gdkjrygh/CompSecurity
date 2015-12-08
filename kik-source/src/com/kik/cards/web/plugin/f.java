// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.plugin;

import org.json.JSONObject;

public final class f
{

    private final String a;
    private final JSONObject b;

    public f(String s)
    {
        this(s, new JSONObject());
    }

    public f(String s, JSONObject jsonobject)
    {
        a = s;
        b = jsonobject;
    }

    public final JSONObject a()
    {
        return b;
    }

    public final String b()
    {
        return a;
    }
}
