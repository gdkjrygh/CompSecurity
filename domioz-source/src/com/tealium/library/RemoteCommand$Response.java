// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import org.json.JSONObject;

public class f
{

    private final String a;
    private final String b;
    private final JSONObject c;
    private int d;
    private String e;
    private boolean f;

    public final String getBody()
    {
        return e;
    }

    public final String getCommandId()
    {
        return a;
    }

    public final String getId()
    {
        return b;
    }

    public final JSONObject getRequestPayload()
    {
        return c;
    }

    public final int getStatus()
    {
        return d;
    }

    public final boolean isSent()
    {
        return f;
    }

    public void send()
    {
        if (f)
        {
            throw f("send()");
        } else
        {
            f = true;
            return;
        }
    }

    public final f setBody(String s)
    {
        if (f)
        {
            throw f("setBody(String)");
        } else
        {
            e = s;
            return this;
        }
    }

    public final e setStatus(int i)
    {
        if (f)
        {
            throw f("setStatus(int)");
        } else
        {
            d = i;
            return this;
        }
    }

    public (String s, String s1, JSONObject jsonobject)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("commandId must not be null.");
        }
        a = s;
        b = s1;
        s = jsonobject;
        if (jsonobject == null)
        {
            s = new JSONObject();
        }
        c = s;
        d = 200;
        e = null;
        f = false;
    }
}
