// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.dto;

import com.facebook.ads.internal.server.AdPlacementType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class d
{

    private static final AdPlacementType k;
    protected AdPlacementType a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected boolean h;
    public int i;
    public int j;

    private d(Map map)
    {
        a = k;
        b = 1;
        d = 0;
        e = 20;
        f = 0;
        g = 1000;
        h = false;
        i = -1;
        j = -1;
        map = map.entrySet().iterator();
_L24:
        java.util.Map.Entry entry;
        String s;
        if (!map.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        entry = (java.util.Map.Entry)map.next();
        s = (String)entry.getKey();
        s.hashCode();
        JVM INSTR lookupswitch 10: default 188
    //                   -1561601017: 330
    //                   -856794442: 408
    //                   -553208868: 345
    //                   3575610: 270
    //                   664421755: 300
    //                   700812481: 285
    //                   1085444827: 315
    //                   1183549815: 392
    //                   1503616961: 376
    //                   2002133996: 360;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        byte byte0 = -1;
_L13:
        switch (byte0)
        {
        case 0: // '\0'
            a = AdPlacementType.fromString((String)entry.getValue());
            break;

        case 1: // '\001'
            b = Integer.parseInt((String)entry.getValue());
            break;

        case 2: // '\002'
            c = Integer.parseInt((String)entry.getValue());
            break;

        case 3: // '\003'
            d = Integer.parseInt((String)entry.getValue());
            break;

        case 4: // '\004'
            e = Integer.parseInt((String)entry.getValue());
            break;

        case 5: // '\005'
            h = Boolean.valueOf((String)entry.getValue()).booleanValue();
            break;

        case 6: // '\006'
            i = Integer.parseInt((String)entry.getValue());
            break;

        case 7: // '\007'
            j = Integer.parseInt((String)entry.getValue());
            break;

        case 8: // '\b'
            f = Integer.parseInt((String)entry.getValue());
            break;

        case 9: // '\t'
            g = Integer.parseInt((String)entry.getValue());
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (!s.equals("type")) goto _L1; else goto _L12
_L12:
        byte0 = 0;
          goto _L13
_L7:
        if (!s.equals("min_viewability_percentage")) goto _L1; else goto _L14
_L14:
        byte0 = 1;
          goto _L13
_L6:
        if (!s.equals("min_viewability_duration")) goto _L1; else goto _L15
_L15:
        byte0 = 2;
          goto _L13
_L8:
        if (!s.equals("refresh")) goto _L1; else goto _L16
_L16:
        byte0 = 3;
          goto _L13
_L2:
        if (!s.equals("refresh_threshold")) goto _L1; else goto _L17
_L17:
        byte0 = 4;
          goto _L13
_L4:
        if (!s.equals("cacheable")) goto _L1; else goto _L18
_L18:
        byte0 = 5;
          goto _L13
_L11:
        if (!s.equals("placement_width")) goto _L1; else goto _L19
_L19:
        byte0 = 6;
          goto _L13
_L10:
        if (!s.equals("placement_height")) goto _L1; else goto _L20
_L20:
        byte0 = 7;
          goto _L13
_L9:
        if (!s.equals("viewability_check_initial_delay")) goto _L1; else goto _L21
_L21:
        byte0 = 8;
          goto _L13
_L3:
        if (!s.equals("viewability_check_interval")) goto _L1; else goto _L22
_L22:
        byte0 = 9;
          goto _L13
        if (true) goto _L24; else goto _L23
_L23:
    }

    public static d a(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return null;
        }
        Iterator iterator = jsonobject.keys();
        HashMap hashmap = new HashMap();
        String s;
        for (; iterator.hasNext(); hashmap.put(s, String.valueOf(jsonobject.opt(s))))
        {
            s = (String)iterator.next();
        }

        return new d(hashmap);
    }

    public AdPlacementType a()
    {
        return a;
    }

    public long b()
    {
        return (long)(d * 1000);
    }

    public long c()
    {
        return (long)(e * 1000);
    }

    public boolean d()
    {
        return h;
    }

    public int e()
    {
        return b;
    }

    public int f()
    {
        return f;
    }

    public int g()
    {
        return g;
    }

    static 
    {
        k = AdPlacementType.UNKNOWN;
    }
}
