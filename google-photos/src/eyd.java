// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class eyd
    implements exy
{

    private final Iterable a;
    private final eyc b;

    public eyd(Iterable iterable, eyc eyc1)
    {
        a = iterable;
        b = eyc1;
    }

    public final Map a(Set set)
    {
        Object obj;
        obj = new ArrayList(set.size());
        for (set = set.iterator(); set.hasNext(); ((List) (obj)).add(new eye((eyz)set.next()))) { }
        set = a.iterator();
_L2:
        Object obj1;
        Iterator iterator;
        long l;
        if (!set.hasNext())
        {
            break MISSING_BLOCK_LABEL_504;
        }
        obj1 = set.next();
        l = b.b(obj1);
        iterator = ((List) (obj)).iterator();
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        eye eye2;
        eyz eyz1;
        Calendar calendar1;
        eye2 = (eye)iterator.next();
        eye2.f.setTimeInMillis(l);
        eyz1 = eye2.b;
        calendar1 = eye2.f;
        eza.a[eyz1.ordinal()];
        JVM INSTR tableswitch 1 4: default 188
    //                   1 231
    //                   2 470
    //                   3 470
    //                   4 478;
           goto _L3 _L4 _L5 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_478;
_L3:
        set = String.valueOf(eyz1);
        throw new IllegalStateException((new StringBuilder(String.valueOf(set).length() + 31)).append("Unrecognized date header type: ").append(set).toString());
_L4:
        eyr.a(calendar1);
_L8:
        Calendar calendar;
        boolean flag;
        boolean flag1;
        if (eye2.c == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (eye2.f.getTimeInMillis() + eyr.a == 0L && eye2.e.getTimeInMillis() + eyr.a != 0L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || flag1 || eye2.e.get(1) != eye2.f.get(1) || eye2.e.get(2) != eye2.f.get(2) || eye2.b == eyz.a && eye2.e.get(5) != eye2.f.get(5))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            eye2.a.put(Integer.valueOf(eye2.c + eye2.d), Long.valueOf(eye2.f.getTimeInMillis()));
            eye2.d = eye2.d + 1;
        }
        eye2.c = eye2.c + b.a(obj1);
        calendar = eye2.e;
        eye2.e = eye2.f;
        eye2.f = calendar;
          goto _L7
_L5:
        eyr.b(calendar1);
          goto _L8
        eyr.c(calendar1);
          goto _L8
        set = new HashMap(((List) (obj)).size());
        eye eye1;
        dtz dtz1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); set.put(eye1.b, eyn.a(dtz1)))
        {
            eye1 = (eye)((Iterator) (obj)).next();
            dtz1 = new dtz(eye1.a.size());
            java.util.Map.Entry entry;
            for (Iterator iterator1 = eye1.a.entrySet().iterator(); iterator1.hasNext(); dtz1.a(((Integer)entry.getKey()).intValue(), ((Long)entry.getValue()).longValue()))
            {
                entry = (java.util.Map.Entry)iterator1.next();
            }

        }

        return set;
    }
}
