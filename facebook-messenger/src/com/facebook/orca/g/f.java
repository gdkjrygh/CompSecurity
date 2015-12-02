// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import com.facebook.common.w.e;
import com.facebook.common.w.n;
import com.facebook.location.Coordinates;
import com.facebook.location.b;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class f
{

    private final ObjectMapper a;

    public f(ObjectMapper objectmapper)
    {
        a = objectmapper;
    }

    Coordinates a(String s)
    {
        Object obj = null;
        if (n.a(s))
        {
            return null;
        }
        JsonNode jsonnode = a.readTree(s);
        b b1 = Coordinates.newBuilder().a(Double.valueOf(e.e(jsonnode.get("latitude")))).b(Double.valueOf(e.e(jsonnode.get("longitude"))));
        if (jsonnode.has("accuracy"))
        {
            s = Float.valueOf((float)e.e(jsonnode.get("accuracy")));
        } else
        {
            s = null;
        }
        b1 = b1.a(s);
        if (jsonnode.has("altitude"))
        {
            s = Double.valueOf(e.e(jsonnode.get("altitude")));
        } else
        {
            s = null;
        }
        b1 = b1.c(s);
        if (jsonnode.has("altitudeAccuracy"))
        {
            s = Float.valueOf((float)e.e(jsonnode.get("altitudeAccuracy")));
        } else
        {
            s = null;
        }
        b1 = b1.b(s);
        if (jsonnode.has("heading"))
        {
            s = Float.valueOf((float)e.e(jsonnode.get("heading")));
        } else
        {
            s = null;
        }
        b1 = b1.c(s);
        s = obj;
        if (jsonnode.has("speed"))
        {
            s = Float.valueOf((float)e.e(jsonnode.get("speed")));
        }
        return b1.d(s).h();
    }

    String a(Coordinates coordinates)
    {
        if (coordinates == null)
        {
            return null;
        }
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("latitude", coordinates.b());
        objectnode.put("longitude", coordinates.c());
        if (coordinates.g())
        {
            objectnode.put("accuracy", coordinates.f());
        }
        if (coordinates.e())
        {
            objectnode.put("altitude", coordinates.d());
        }
        if (coordinates.i())
        {
            objectnode.put("altitudeAccuracy", coordinates.h());
        }
        if (coordinates.k())
        {
            objectnode.put("heading", coordinates.j());
        }
        if (coordinates.m())
        {
            objectnode.put("speed", coordinates.l());
        }
        return objectnode.toString();
    }
}
