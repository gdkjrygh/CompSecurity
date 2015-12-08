// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.f;

import com.b.a.k;
import com.b.a.o;
import com.b.a.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kik.n.a.f:
//            c, a

final class d
    implements u
{

    final HashMap a = new HashMap();

    d()
    {
        a.put("title", Integer.valueOf(1));
        a.put("icon", Integer.valueOf(2));
        a.put("storeLink", Integer.valueOf(3));
        a.put("sticker", Integer.valueOf(4));
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
_L8:
        i;
        JVM INSTR tableswitch 0 4: default 48
    //                   0 147
    //                   1 67
    //                   2 80
    //                   3 93
    //                   4 106;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_106;
_L2:
        break MISSING_BLOCK_LABEL_147;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        k1.a(i, this);
_L9:
        i = k1.a(this);
        if (true) goto _L8; else goto _L7
_L7:
        obj.b = k1.g();
          goto _L9
_L4:
        obj.c = k1.g();
          goto _L9
_L5:
        obj.d = k1.g();
          goto _L9
        if (((c) (obj)).e == null)
        {
            obj.e = new ArrayList();
        }
        ((c) (obj)).e.add(k1.a(null, com.kik.n.a.f.a.b()));
          goto _L9
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
            obj = ((c) (obj)).e.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                a a1 = (a)((Iterator) (obj)).next();
                if (a1 != null)
                {
                    o1.a(4, a1, com.kik.n.a.f.a.b(), true);
                }
            } while (true);
        }
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
