// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.ui;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Iterator;

public class p
{

    private final ObjectMapper a;
    private final JsonFactory b;

    public p(ObjectMapper objectmapper, JsonFactory jsonfactory)
    {
        a = objectmapper;
        b = jsonfactory;
    }

    public es a(JsonNode jsonnode)
    {
        et et1 = new et();
        for (jsonnode = jsonnode.elements(); jsonnode.hasNext(); et1.b(((JsonNode)jsonnode.next()).asText())) { }
        return et1.b();
    }

    public es a(String s)
    {
        return a((JsonNode)b.createJsonParser(s).readValueAsTree());
    }

    public String a(es es)
    {
        return a.writeValueAsString(es);
    }
}
