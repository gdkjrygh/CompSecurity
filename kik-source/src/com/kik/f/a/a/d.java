// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.f.a.a;

import com.b.a.k;
import com.b.a.o;
import com.b.a.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kik.f.a.a:
//            c, a

final class d
    implements u
{

    final HashMap a = new HashMap();

    d()
    {
        a.put("contentlink", Integer.valueOf(1));
    }

    public final Object a()
    {
        return new c();
    }

    public final void a(k k1, Object obj)
    {
        int i;
        obj = (c)obj;
        i = k1.a(this);
_L2:
        switch (i)
        {
        default:
            k1.a(i, this);
            break;

        case 0: // '\0'
            break MISSING_BLOCK_LABEL_96;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */
        }
_L3:
        i = k1.a(this);
        if (true) goto _L2; else goto _L1
_L1:
        if (((c) (obj)).b == null)
        {
            obj.b = new ArrayList();
        }
        ((c) (obj)).b.add(k1.a(null, com.kik.f.a.a.a.b()));
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public final void a(o o1, Object obj)
    {
        obj = (c)obj;
        if (((c) (obj)).b != null)
        {
            obj = ((c) (obj)).b.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                a a1 = (a)((Iterator) (obj)).next();
                if (a1 != null)
                {
                    o1.a(1, a1, com.kik.f.a.a.a.b(), true);
                }
            } while (true);
        }
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
