// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class ade
    implements acu
{

    static final Map a;
    private final ok b;
    private final afb c;

    public ade(ok ok1, afb afb1)
    {
        b = ok1;
        c = afb1;
    }

    public final void a(akk akk, Map map)
    {
        String s = (String)map.get("a");
        int i = ((Integer)a.get(s)).intValue();
        if (i != 5 && b != null && !b.b())
        {
            b.a(null);
            return;
        }
        switch (i)
        {
        case 2: // '\002'
        default:
            of.c("Unknown MRAID command called.");
            return;

        case 1: // '\001'
            c.a(map);
            return;

        case 4: // '\004'
            (new afa(akk, map)).a();
            return;

        case 3: // '\003'
            (new afd(akk, map)).a();
            return;

        case 5: // '\005'
            (new afc(akk, map)).a();
            return;

        case 6: // '\006'
            c.a(true);
            break;
        }
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put("resize", Integer.valueOf(1));
        a.put("playVideo", Integer.valueOf(2));
        a.put("storePicture", Integer.valueOf(3));
        a.put("createCalendarEvent", Integer.valueOf(4));
        a.put("setOrientationProperties", Integer.valueOf(5));
        a.put("closeResizedAd", Integer.valueOf(6));
    }
}
