// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class lun extends lqd
{

    private static final String b;
    private static final String c;
    private static final String d;
    private final luo e;

    public lun(luo luo1)
    {
        super(b, new String[] {
            c
        });
        e = luo1;
    }

    public final ksp a(Map map)
    {
        String s = ltw.a((ksp)map.get(c));
        HashMap hashmap = new HashMap();
        map = (ksp)map.get(d);
        if (map != null)
        {
            map = ((Map) (ltw.e(map)));
            if (!(map instanceof Map))
            {
                lqh.b("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return ltw.f();
            }
            java.util.Map.Entry entry;
            for (map = ((Map)map).entrySet().iterator(); map.hasNext(); hashmap.put(entry.getKey().toString(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
        try
        {
            map = ltw.a(e.a(s, hashmap));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            lqh.b((new StringBuilder("Custom macro/tag ")).append(s).append(" threw exception ").append(map.getMessage()).toString());
            return ltw.f();
        }
        return map;
    }

    public final boolean b()
    {
        return false;
    }

    static 
    {
        b = kse.k.toString();
        c = ksf.q.toString();
        d = ksf.b.toString();
    }
}
