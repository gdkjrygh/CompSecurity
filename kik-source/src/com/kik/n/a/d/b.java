// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.d;

import com.b.a.k;
import com.b.a.o;
import com.b.a.u;
import java.util.HashMap;

// Referenced classes of package com.kik.n.a.d:
//            a

final class b
    implements u
{

    final HashMap a = new HashMap();

    b()
    {
        a.put("anonymousId", Integer.valueOf(1));
    }

    public final Object a()
    {
        return new a();
    }

    public final void a(k k1, Object obj)
    {
        int i;
        obj = (a)obj;
        i = k1.a(this);
_L2:
        switch (i)
        {
        default:
            k1.a(i, this);
            break;

        case 0: // '\0'
            break MISSING_BLOCK_LABEL_68;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */
        }
_L3:
        i = k1.a(this);
        if (true) goto _L2; else goto _L1
_L1:
        obj.b = k1.g();
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public final volatile void a(o o1, Object obj)
    {
        obj = (a)obj;
        if (((a) (obj)).b != null)
        {
            o1.a(1, ((a) (obj)).b, false);
        }
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
