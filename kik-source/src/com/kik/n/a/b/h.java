// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.b;

import com.b.a.k;
import com.b.a.o;
import com.b.a.u;
import java.util.HashMap;

// Referenced classes of package com.kik.n.a.b:
//            g

final class h
    implements u
{

    final HashMap a = new HashMap();

    h()
    {
        a.put("url", Integer.valueOf(1));
        a.put("title", Integer.valueOf(2));
        a.put("faviconUrl", Integer.valueOf(3));
        a.put("timestamp", Integer.valueOf(4));
        a.put("uniqueId", Integer.valueOf(5));
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
_L9:
        i;
        JVM INSTR tableswitch 0 5: default 52
    //                   0 139
    //                   1 71
    //                   2 84
    //                   3 97
    //                   4 110
    //                   5 126;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_126;
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
        obj.e = Long.valueOf(k1.b());
          goto _L10
        obj.f = k1.g();
          goto _L10
    }

    public final void a(o o1, Object obj)
    {
        obj = (g)obj;
        if (((g) (obj)).b != null)
        {
            o1.a(1, ((g) (obj)).b, false);
        }
        if (((g) (obj)).c != null)
        {
            o1.a(2, ((g) (obj)).c, false);
        }
        if (((g) (obj)).d != null)
        {
            o1.a(3, ((g) (obj)).d, false);
        }
        if (((g) (obj)).e != null)
        {
            o1.a(4, ((g) (obj)).e.longValue(), false);
        }
        if (((g) (obj)).f != null)
        {
            o1.a(5, ((g) (obj)).f, false);
        }
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
