// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.e;

import com.b.a.k;
import com.b.a.o;
import com.b.a.u;
import java.util.HashMap;

// Referenced classes of package com.kik.n.a.e:
//            a

final class b
    implements u
{

    final HashMap a = new HashMap();

    b()
    {
        a.put("keyId", Integer.valueOf(1));
        a.put("initializationVector", Integer.valueOf(2));
        a.put("payload", Integer.valueOf(3));
        a.put("mac", Integer.valueOf(4));
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
    //                   0 119
    //                   1 67
    //                   2 80
    //                   3 93
    //                   4 106;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_106;
_L2:
        break MISSING_BLOCK_LABEL_119;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        k1.a(i, this);
_L9:
        i = k1.a(this);
        if (true) goto _L8; else goto _L7
_L7:
        obj.b = k1.h();
          goto _L9
_L4:
        obj.c = k1.h();
          goto _L9
_L5:
        obj.d = k1.h();
          goto _L9
        obj.e = k1.h();
          goto _L9
    }

    public final volatile void a(o o1, Object obj)
    {
        obj = (a)obj;
        if (((a) (obj)).b != null)
        {
            o1.a(1, ((a) (obj)).b, false);
        }
        if (((a) (obj)).c != null)
        {
            o1.a(2, ((a) (obj)).c, false);
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
