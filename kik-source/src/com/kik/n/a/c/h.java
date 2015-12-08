// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.c;

import com.b.a.k;
import com.b.a.o;
import com.b.a.u;
import java.util.HashMap;

// Referenced classes of package com.kik.n.a.c:
//            g

final class h
    implements u
{

    final HashMap a = new HashMap();

    h()
    {
        a.put("name", Integer.valueOf(1));
        a.put("value", Integer.valueOf(2));
    }

    public final Object a()
    {
        return new g();
    }

    public final void a(k k1, Object obj)
    {
        int i;
        obj = (g)obj;
        i = k1.a(this);
_L2:
        switch (i)
        {
        default:
            k1.a(i, this);
            break;

        case 0: // '\0'
            break MISSING_BLOCK_LABEL_91;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_75;
        }
_L3:
        i = k1.a(this);
        if (true) goto _L2; else goto _L1
_L1:
        obj.b = g.a.a(k1.f());
          goto _L3
        obj.c = g.b.a(k1.f());
          goto _L3
    }

    public final volatile void a(o o1, Object obj)
    {
        obj = (g)obj;
        if (((g) (obj)).b != null)
        {
            o1.a(1, ((g) (obj)).b.c, false);
        }
        if (((g) (obj)).c != null)
        {
            o1.a(2, ((g) (obj)).c.d, false);
        }
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
