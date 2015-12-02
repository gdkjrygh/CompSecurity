// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push;

import com.facebook.orca.notify.ai;
import com.facebook.orca.notify.aj;
import com.facebook.push.g;
import com.fasterxml.jackson.databind.JsonNode;

public class a extends ai
{

    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final g f;
    private boolean g;

    public a(String s, String s1, String s2, String s3, g g1)
    {
        super(aj.FRIEND_INSTALL);
        b = s;
        c = s1;
        d = s2;
        e = s3;
        f = g1;
    }

    public static a a(String s, String s1, JsonNode jsonnode)
    {
        if (jsonnode.has("i_id"))
        {
            if ((jsonnode = jsonnode.get("i_id").asText()) != null)
            {
                return new a(jsonnode, s1, s, s, g.C2DM);
            }
        }
        return null;
    }

    public String a()
    {
        return b;
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public String d()
    {
        return e;
    }

    public g e()
    {
        return f;
    }
}
