// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.f.a.a;

import com.b.a.k;
import com.b.a.o;
import com.b.a.u;
import com.b.a.x;
import java.util.HashMap;

// Referenced classes of package com.kik.f.a.a:
//            a

final class b
    implements u
{

    final HashMap a = new HashMap();

    b()
    {
        a.put("platform", Integer.valueOf(1));
        a.put("type", Integer.valueOf(2));
        a.put("byline", Integer.valueOf(3));
        a.put("url", Integer.valueOf(4));
        a.put("iconUrl", Integer.valueOf(5));
        a.put("appName", Integer.valueOf(6));
        a.put("contentFileType", Integer.valueOf(7));
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
_L11:
        i;
        JVM INSTR tableswitch 0 7: default 60
    //                   0 170
    //                   1 79
    //                   2 92
    //                   3 105
    //                   4 118
    //                   5 131
    //                   6 144
    //                   7 157;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_157;
_L2:
        break MISSING_BLOCK_LABEL_170;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        k1.a(i, this);
_L12:
        i = k1.a(this);
        if (true) goto _L11; else goto _L10
_L10:
        obj.b = k1.g();
          goto _L12
_L4:
        obj.c = k1.g();
          goto _L12
_L5:
        obj.d = k1.g();
          goto _L12
_L6:
        obj.e = k1.g();
          goto _L12
_L7:
        obj.f = k1.g();
          goto _L12
_L8:
        obj.g = k1.g();
          goto _L12
        obj.h = k1.g();
          goto _L12
    }

    public final void a(o o1, Object obj)
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
        if (((a) (obj)).e == null)
        {
            throw new x(((com.b.a.n) (obj)));
        }
        o1.a(4, ((a) (obj)).e, false);
        if (((a) (obj)).f != null)
        {
            o1.a(5, ((a) (obj)).f, false);
        }
        if (((a) (obj)).g == null)
        {
            throw new x(((com.b.a.n) (obj)));
        }
        o1.a(6, ((a) (obj)).g, false);
        if (((a) (obj)).h != null)
        {
            o1.a(7, ((a) (obj)).h, false);
        }
    }

    public final volatile boolean a(Object obj)
    {
        obj = (a)obj;
        return ((a) (obj)).e != null && ((a) (obj)).g != null;
    }
}
