// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.b;

import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.google.common.a.ev;
import com.google.common.a.ew;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;

// Referenced classes of package com.facebook.analytics.b:
//            a

public class b
{

    private final d a;
    private final a b;

    public b(d d1, a a1)
    {
        a = d1;
        b = a1;
    }

    public ev a()
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        ew ew3;
        e e1;
        Iterator iterator;
        ew3 = ev.k();
        e1 = a.b();
        iterator = a.e(a.a).entrySet().iterator();
        ew ew1 = null;
_L2:
        java.util.Map.Entry entry;
        ae ae1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_200;
        }
        entry = (java.util.Map.Entry)iterator.next();
        ae1 = (ae)entry.getKey();
        ew ew2;
        String s;
        s = ((String) (obj));
        ew2 = ew1;
        String as[];
        if (!b.b(ae1))
        {
            break MISSING_BLOCK_LABEL_241;
        }
        as = b.a(ae1);
        s = ((String) (obj));
        ew2 = ew1;
        if (as.length <= 2)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        String s1;
        String s2;
        s1 = as[0];
        s2 = as[1];
        s = ((String) (obj));
        ew2 = ew1;
        if (s1.equals(obj))
        {
            break MISSING_BLOCK_LABEL_173;
        }
        if (obj == null || ew1 == null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        ew3.b(obj, ew1.b());
        ew2 = ev.k();
        s = s1;
        ew2.b(s2, entry.getValue());
        e1.a(ae1);
        break MISSING_BLOCK_LABEL_241;
        if (obj == null || ew1 == null)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        ew3.b(obj, ew1.b());
        e1.a();
        obj = ew3.b();
        this;
        JVM INSTR monitorexit ;
        return ((ev) (obj));
        obj;
        throw obj;
        obj = s;
        ew1 = ew2;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
