// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.b;

import com.b.a.k;
import com.b.a.o;
import com.b.a.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kik.n.a.b:
//            c, i, a

final class d
    implements u
{

    final HashMap a = new HashMap();

    d()
    {
        a.put("hostport", Integer.valueOf(1));
        a.put("permissions", Integer.valueOf(2));
        a.put("anonymousKey", Integer.valueOf(3));
    }

    public final Object a()
    {
        return new c();
    }

    public final void a(k k1, Object obj)
    {
        int j;
        obj = (c)obj;
        j = k1.a(this);
_L7:
        j;
        JVM INSTR tableswitch 0 3: default 44
    //                   0 140
    //                   1 63
    //                   2 76
    //                   3 117;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_117;
_L2:
        break MISSING_BLOCK_LABEL_140;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        k1.a(j, this);
_L8:
        j = k1.a(this);
        if (true) goto _L7; else goto _L6
_L6:
        obj.b = k1.g();
          goto _L8
_L4:
        if (((c) (obj)).c == null)
        {
            obj.c = new ArrayList();
        }
        ((c) (obj)).c.add(k1.a(null, i.b()));
          goto _L8
        obj.d = (a)k1.a(((c) (obj)).d, com.kik.n.a.b.a.b());
          goto _L8
    }

    public final void a(o o1, Object obj)
    {
        obj = (c)obj;
        if (((c) (obj)).b != null)
        {
            o1.a(1, ((c) (obj)).b, false);
        }
        if (((c) (obj)).c != null)
        {
            Iterator iterator = ((c) (obj)).c.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                i j = (i)iterator.next();
                if (j != null)
                {
                    o1.a(2, j, i.b(), true);
                }
            } while (true);
        }
        if (((c) (obj)).d != null)
        {
            o1.a(3, ((c) (obj)).d, com.kik.n.a.b.a.b(), false);
        }
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
