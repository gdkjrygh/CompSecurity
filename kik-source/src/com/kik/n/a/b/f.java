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
//            e, g

final class f
    implements u
{

    final HashMap a = new HashMap();

    f()
    {
        a.put("list", Integer.valueOf(1));
    }

    public final Object a()
    {
        return new e();
    }

    public final void a(k k1, Object obj)
    {
        int i;
        obj = (e)obj;
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
        if (((e) (obj)).b == null)
        {
            obj.b = new ArrayList();
        }
        ((e) (obj)).b.add(k1.a(null, g.b()));
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public final void a(o o1, Object obj)
    {
        obj = (e)obj;
        if (((e) (obj)).b != null)
        {
            obj = ((e) (obj)).b.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                g g1 = (g)((Iterator) (obj)).next();
                if (g1 != null)
                {
                    o1.a(1, g1, g.b(), true);
                }
            } while (true);
        }
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
