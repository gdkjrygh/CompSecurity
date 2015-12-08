// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.c;

import com.b.a.b;
import com.b.a.k;
import com.b.a.o;
import com.b.a.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kik.n.a.c:
//            i

final class j
    implements u
{

    final HashMap a = new HashMap();

    j()
    {
        a.put("cardUrlHash", Integer.valueOf(1));
    }

    public final Object a()
    {
        return new i();
    }

    public final void a(k k1, Object obj)
    {
        int l;
        obj = (i)obj;
        l = k1.a(this);
_L2:
        switch (l)
        {
        default:
            k1.a(l, this);
            break;

        case 0: // '\0'
            break MISSING_BLOCK_LABEL_92;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */
        }
_L3:
        l = k1.a(this);
        if (true) goto _L2; else goto _L1
_L1:
        if (((i) (obj)).b == null)
        {
            obj.b = new ArrayList();
        }
        ((i) (obj)).b.add(k1.h());
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public final void a(o o1, Object obj)
    {
        obj = (i)obj;
        if (((i) (obj)).b != null)
        {
            obj = ((i) (obj)).b.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                b b1 = (b)((Iterator) (obj)).next();
                if (b1 != null)
                {
                    o1.a(1, b1, true);
                }
            } while (true);
        }
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
