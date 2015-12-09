// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws;

import java.util.EnumMap;
import java.util.Map;

public final class RequestClientOptions
{

    private final Map a = new EnumMap(com/amazonaws/RequestClientOptions$Marker);

    public RequestClientOptions()
    {
    }

    private String a(String s, String s1)
    {
        if (s.contains(s1))
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(s).append(" ").append(s1).toString();
        }
    }

    public String a()
    {
    /* block-local class not found */
    class Marker {}

        return a(Marker.a);
    }

    public String a(Marker marker)
    {
        return (String)a.get(marker);
    }

    public void a(Marker marker, String s)
    {
        a.put(marker, s);
    }

    public void a(String s)
    {
        b(s);
    }

    public void b(String s)
    {
        String s2 = (String)a.get(Marker.a);
        String s1 = s2;
        if (s2 == null)
        {
            s1 = "";
        }
        s = a(s1, s);
        a(Marker.a, s);
    }
}
