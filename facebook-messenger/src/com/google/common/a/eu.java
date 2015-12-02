// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            ex, hp, dn, iw, 
//            ev, es, ew, em

public class eu extends ex
    implements hp
{

    eu(ev ev1, int i)
    {
        super(ev1, i);
    }

    public static eu a()
    {
        return dn.a;
    }

    public static eu a(iw iw1)
    {
        if (!iw1.e()) goto _L2; else goto _L1
_L1:
        eu eu1 = a();
_L4:
        return eu1;
_L2:
        eu eu2;
        if (!(iw1 instanceof eu))
        {
            break; /* Loop/switch isn't completed */
        }
        eu2 = (eu)iw1;
        eu1 = eu2;
        if (!eu2.k()) goto _L4; else goto _L3
_L3:
        ew ew1 = ev.k();
        iw1 = iw1.b().entrySet().iterator();
        int i = 0;
        do
        {
            if (!iw1.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iw1.next();
            es es1 = es.a((Collection)entry.getValue());
            if (!es1.isEmpty())
            {
                ew1.b(entry.getKey(), es1);
                i = es1.size() + i;
            }
        } while (true);
        return new eu(ew1.b(), i);
    }

    public es a(Object obj)
    {
        es es1 = (es)b.get(obj);
        obj = es1;
        if (es1 == null)
        {
            obj = es.d();
        }
        return ((es) (obj));
    }

    public es b(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public Collection c(Object obj)
    {
        return a(obj);
    }

    public Collection d(Object obj)
    {
        return b(obj);
    }

    public em e(Object obj)
    {
        return a(obj);
    }

    public em g(Object obj)
    {
        return b(obj);
    }
}
