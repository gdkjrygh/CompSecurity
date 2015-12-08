// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import ald;
import java.util.Map;

public final class SessionEvent
{

    public final ald a;
    public final long b;
    public final Type c;
    public final Map d;
    public final Map e;
    public final Map f;
    private String g;

    private SessionEvent(ald ald, long l, Type type, Map map, Map map1, Map map2)
    {
        a = ald;
        b = l;
        c = type;
        d = map;
        e = map1;
        f = map2;
    }

    public SessionEvent(ald ald, long l, Type type, Map map, Map map1, Map map2, 
            byte byte0)
    {
        this(ald, l, type, map, map1, map2);
    }

    public final String toString()
    {
        if (g == null)
        {
            g = (new StringBuilder("[")).append(getClass().getSimpleName()).append(": timestamp=").append(b).append(", type=").append(c).append(", details=").append(d.toString()).append(", customType=").append(null).append(", customAttributes=").append(e.toString()).append(", predefinedType=").append(null).append(", predefinedAttributes=").append(f.toString()).append(", metadata=[").append(a).append("]]").toString();
        }
        return g;
    }
}
