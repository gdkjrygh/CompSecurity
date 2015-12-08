// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.b;

import java.util.Map;

// Referenced classes of package com.samsung.multiscreen.b:
//            a

public final class c
{

    static String a = "id";
    static String b = "isHost";
    static String c = "connectTime";
    static String d = "attributes";
    private a e;
    private Map f;

    protected c(a a1, Map map)
    {
        e = a1;
        f = map;
    }

    public final String a()
    {
        return (String)f.get(a);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[ChannelClient] id: ").append(a()).append(", isHost: ").append(((Boolean)f.get(b)).booleanValue()).append(", connectTime: ").append(((Long)f.get(c)).longValue()).append(", attributes: ").append((Map)f.get(d));
        return stringbuilder.toString();
    }

}
