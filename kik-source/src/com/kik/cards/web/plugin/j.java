// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.plugin;

import org.json.JSONObject;

public final class j
{

    private final int a;
    private final JSONObject b;

    public j()
    {
        this(200, new JSONObject());
    }

    public j(int i)
    {
        this(i, new JSONObject());
    }

    public j(int i, JSONObject jsonobject)
    {
        a = i;
        b = jsonobject;
    }

    public j(JSONObject jsonobject)
    {
        this(200, jsonobject);
    }

    public final int a()
    {
        return a;
    }

    public final JSONObject b()
    {
        return b;
    }
}
