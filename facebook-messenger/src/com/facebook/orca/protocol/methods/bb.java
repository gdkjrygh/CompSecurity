// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.common.w.e;
import com.fasterxml.jackson.databind.JsonNode;

public class bb
{

    public bb()
    {
    }

    public String a(JsonNode jsonnode)
    {
        for (int i = 0; i < jsonnode.size(); i++)
        {
            String s = e.b(jsonnode.get(i));
            if (s.equals("messenger"))
            {
                return s;
            }
            if (s.startsWith("source:"))
            {
                return s.substring("source:".length());
            }
        }

        return null;
    }
}
