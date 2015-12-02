// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import com.facebook.http.a.a.a.a;
import com.facebook.http.a.a.a.a.b;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class q extends a
{

    private final String a;
    private final long b;

    public q(String s, b b1, long l)
    {
        this(s, b1, "fb_voice_message", l);
    }

    public q(String s, b b1, String s1, long l)
    {
        super(s, b1);
        a = s1;
        b = l;
    }

    public ObjectNode d()
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("type", a);
        objectnode.put("duration", b);
        return objectnode;
    }
}
