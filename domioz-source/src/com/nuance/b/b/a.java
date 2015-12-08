// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import org.json.JSONObject;

public abstract class a
{

    final String a;

    public a(String s)
    {
        if (s == null || s.length() == 0)
        {
            if (s == null)
            {
                s = "null";
            } else
            {
                s = "empty";
            }
            throw new IllegalArgumentException(String.format("AgentCommand: %s target not allowed", new Object[] {
                s
            }));
        } else
        {
            a = s;
            return;
        }
    }

    abstract JSONObject a();
}
