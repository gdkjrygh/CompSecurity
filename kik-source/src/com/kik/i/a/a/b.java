// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.i.a.a;

import com.b.a.k;
import com.b.a.o;
import com.b.a.u;
import java.util.HashMap;

// Referenced classes of package com.kik.i.a.a:
//            a

final class b
    implements u
{

    final HashMap a = new HashMap();

    b()
    {
        a.put("start", Integer.valueOf(1));
        a.put("end", Integer.valueOf(2));
        a.put("categoryId", Integer.valueOf(3));
        a.put("id", Integer.valueOf(4));
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
_L8:
        i;
        JVM INSTR tableswitch 0 4: default 48
    //                   0 125
    //                   1 67
    //                   2 83
    //                   3 99
    //                   4 112;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_112;
_L2:
        break MISSING_BLOCK_LABEL_125;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        k1.a(i, this);
_L9:
        i = k1.a(this);
        if (true) goto _L8; else goto _L7
_L7:
        obj.b = Integer.valueOf(k1.c());
          goto _L9
_L4:
        obj.c = Integer.valueOf(k1.c());
          goto _L9
_L5:
        obj.d = k1.g();
          goto _L9
        obj.e = k1.g();
          goto _L9
    }

    public final void a(o o1, Object obj)
    {
        obj = (a)obj;
        if (((a) (obj)).b != null)
        {
            o1.b(1, ((a) (obj)).b.intValue(), false);
        }
        if (((a) (obj)).c != null)
        {
            o1.b(2, ((a) (obj)).c.intValue(), false);
        }
        if (((a) (obj)).d != null)
        {
            o1.a(3, ((a) (obj)).d, false);
        }
        if (((a) (obj)).e != null)
        {
            o1.a(4, ((a) (obj)).e, false);
        }
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
