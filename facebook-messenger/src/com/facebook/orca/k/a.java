// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.k;

import com.facebook.common.w.e;
import com.facebook.location.Coordinates;
import com.facebook.location.b;
import com.fasterxml.jackson.databind.JsonNode;

public class a
{

    public a()
    {
    }

    public Coordinates a(JsonNode jsonnode)
    {
        Object obj1 = null;
        b b1 = Coordinates.newBuilder().a(Double.valueOf(e.e(jsonnode.get("latitude")))).b(Double.valueOf(e.e(jsonnode.get("longitude"))));
        Object obj;
        if (jsonnode.has("altitude"))
        {
            obj = Double.valueOf(e.e(jsonnode.get("altitude")));
        } else
        {
            obj = null;
        }
        b1 = b1.c(((Double) (obj)));
        if (jsonnode.has("accuracy"))
        {
            obj = Float.valueOf((float)e.e(jsonnode.get("accuracy")));
        } else
        {
            obj = null;
        }
        b1 = b1.a(((Float) (obj)));
        if (jsonnode.has("altitudeAccuracy"))
        {
            obj = Float.valueOf((float)e.e(jsonnode.get("altitudeAccuracy")));
        } else
        {
            obj = null;
        }
        b1 = b1.b(((Float) (obj)));
        if (jsonnode.has("heading"))
        {
            obj = Float.valueOf((float)e.e(jsonnode.get("heading")));
        } else
        {
            obj = null;
        }
        b1 = b1.c(((Float) (obj)));
        obj = obj1;
        if (jsonnode.has("speed"))
        {
            obj = Float.valueOf((float)e.e(jsonnode.get("speed")));
        }
        return b1.d(((Float) (obj))).h();
    }
}
