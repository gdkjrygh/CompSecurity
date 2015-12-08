// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.j;

import com.b.a.k;
import com.b.a.o;
import com.b.a.u;
import java.util.HashMap;

// Referenced classes of package com.kik.n.a.j:
//            c

final class d
    implements u
{

    final HashMap a = new HashMap();

    d()
    {
        a.put("categoryId", Integer.valueOf(1));
        a.put("id", Integer.valueOf(2));
        a.put("title", Integer.valueOf(3));
        a.put("text", Integer.valueOf(4));
        a.put("installDate", Integer.valueOf(5));
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
_L9:
        i;
        JVM INSTR tableswitch 0 5: default 52
    //                   0 139
    //                   1 71
    //                   2 84
    //                   3 97
    //                   4 110
    //                   5 123;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_123;
_L2:
        break MISSING_BLOCK_LABEL_139;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        k1.a(i, this);
_L10:
        i = k1.a(this);
        if (true) goto _L9; else goto _L8
_L8:
        obj.b = k1.g();
          goto _L10
_L4:
        obj.c = k1.g();
          goto _L10
_L5:
        obj.d = k1.g();
          goto _L10
_L6:
        obj.e = k1.g();
          goto _L10
        obj.f = Long.valueOf(k1.b());
          goto _L10
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
            o1.a(2, ((c) (obj)).c, false);
        }
        if (((c) (obj)).d != null)
        {
            o1.a(3, ((c) (obj)).d, false);
        }
        if (((c) (obj)).e != null)
        {
            o1.a(4, ((c) (obj)).e, false);
        }
        if (((c) (obj)).f != null)
        {
            o1.a(5, ((c) (obj)).f.longValue(), false);
        }
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
