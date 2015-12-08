// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.b;

import com.b.a.k;
import com.b.a.o;
import com.b.a.u;
import java.util.HashMap;

// Referenced classes of package com.kik.n.a.b:
//            i

final class j
    implements u
{

    final HashMap a = new HashMap();

    j()
    {
        a.put("name", Integer.valueOf(1));
        a.put("value", Integer.valueOf(2));
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
            break MISSING_BLOCK_LABEL_91;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_75;
        }
_L3:
        l = k1.a(this);
        if (true) goto _L2; else goto _L1
_L1:
        obj.b = i.a.a(k1.f());
          goto _L3
        obj.c = i.b.a(k1.f());
          goto _L3
    }

    public final volatile void a(o o1, Object obj)
    {
        obj = (i)obj;
        if (((i) (obj)).b != null)
        {
            o1.a(1, ((i) (obj)).b.c, false);
        }
        if (((i) (obj)).c != null)
        {
            o1.a(2, ((i) (obj)).c.d, false);
        }
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
