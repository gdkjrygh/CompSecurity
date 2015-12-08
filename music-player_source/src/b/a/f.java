// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package b.a:
//            bc, hs, dr, et, 
//            cn

public final class f extends bc
    implements hs
{

    public f(String s, Map map)
    {
        super.a = s;
        super.e = System.currentTimeMillis();
        h();
        if (map.size() <= 0) goto _L2; else goto _L1
_L1:
        int i;
        s = map.entrySet().iterator();
        map = new HashMap();
        i = 0;
_L9:
        if (i >= 10 || !s.hasNext()) goto _L4; else goto _L3
_L3:
        java.util.Map.Entry entry;
        dr dr1;
        Object obj;
        entry = (java.util.Map.Entry)s.next();
        dr1 = new dr();
        obj = entry.getValue();
        if (!(obj instanceof String)) goto _L6; else goto _L5
_L5:
        dr1.a((String)obj);
_L7:
        if (dr1.d())
        {
            map.put(entry.getKey(), dr1);
            i++;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (obj instanceof Long)
        {
            dr1.a(((Long)obj).longValue());
        } else
        if (obj instanceof Integer)
        {
            dr1.a(((Integer)obj).longValue());
        } else
        if (obj instanceof Float)
        {
            dr1.a(((Float)obj).longValue());
        } else
        if (obj instanceof Double)
        {
            dr1.a(((Double)obj).longValue());
        }
        if (true) goto _L7; else goto _L4
_L4:
        super.b = map;
_L2:
        super.d = 1;
        f();
        if (-1L > 0L)
        {
            super.c = -1L;
            d();
        }
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void a(et et1, String s)
    {
        if (et1.g() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator = et1.h().iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        cn cn1 = (cn)iterator.next();
        if (!s.equals(cn1.a())) goto _L5; else goto _L4
_L4:
        cn cn2 = cn1;
        if (cn1 == null)
        {
            cn2 = new cn();
            cn2.a(s);
            et1.a(cn2);
        }
        cn2.a(this);
        return;
_L2:
        cn1 = null;
        if (true) goto _L4; else goto _L6
_L6:
    }
}
