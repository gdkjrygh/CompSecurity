// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class lux extends lqx
{

    private static final String b;
    private static final String c;
    private static final String d;
    private final lpu e;

    public lux(lpu lpu1)
    {
        super(b, new String[] {
            c
        });
        e = lpu1;
    }

    public final void b(Map map)
    {
        Object obj = (ksp)map.get(c);
        if (obj != null && obj != ltw.a())
        {
            if ((obj = ltw.e(((ksp) (obj)))) instanceof List)
            {
                obj = ((List)obj).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    Object obj1 = ((Iterator) (obj)).next();
                    if (obj1 instanceof Map)
                    {
                        obj1 = (Map)obj1;
                        e.a(((Map) (obj1)));
                    }
                }
            }
        }
        map = (ksp)map.get(d);
        if (map != null && map != ltw.a())
        {
            if ((map = ltw.a(map)) != ltw.e())
            {
                e.a(map);
                return;
            }
        }
    }

    static 
    {
        b = kse.C.toString();
        c = ksf.M.toString();
        d = ksf.h.toString();
    }
}
