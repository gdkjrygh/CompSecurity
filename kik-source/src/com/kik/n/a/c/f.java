// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.c;

import com.b.a.k;
import com.b.a.o;
import com.b.a.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kik.n.a.c:
//            e, a, g, c

final class f
    implements u
{

    final HashMap a = new HashMap();

    f()
    {
        a.put("url", Integer.valueOf(1));
        a.put("title", Integer.valueOf(2));
        a.put("iconUrl", Integer.valueOf(3));
        a.put("mediaTrayIconUrl", Integer.valueOf(4));
        a.put("termsOfServiceLink", Integer.valueOf(5));
        a.put("privacyLink", Integer.valueOf(6));
        a.put("pushToken", Integer.valueOf(7));
        a.put("dateAdded", Integer.valueOf(8));
        a.put("lastAccessed", Integer.valueOf(9));
        a.put("anonymousKey", Integer.valueOf(10));
        a.put("permissions", Integer.valueOf(11));
        a.put("webPageURL", Integer.valueOf(12));
        a.put("backStackEntries", Integer.valueOf(13));
    }

    public final Object a()
    {
        return new e();
    }

    public final void a(k k1, Object obj)
    {
        int i;
        obj = (e)obj;
        i = k1.a(this);
_L17:
        i;
        JVM INSTR tableswitch 0 13: default 84
    //                   0 344
    //                   1 103
    //                   2 116
    //                   3 129
    //                   4 142
    //                   5 155
    //                   6 168
    //                   7 181
    //                   8 194
    //                   9 210
    //                   10 226
    //                   11 249
    //                   12 290
    //                   13 303;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L15:
        break MISSING_BLOCK_LABEL_303;
_L2:
        break MISSING_BLOCK_LABEL_344;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        k1.a(i, this);
_L18:
        i = k1.a(this);
        if (true) goto _L17; else goto _L16
_L16:
        obj.b = k1.g();
          goto _L18
_L4:
        obj.c = k1.g();
          goto _L18
_L5:
        obj.d = k1.g();
          goto _L18
_L6:
        obj.e = k1.g();
          goto _L18
_L7:
        obj.f = k1.g();
          goto _L18
_L8:
        obj.g = k1.g();
          goto _L18
_L9:
        obj.h = k1.g();
          goto _L18
_L10:
        obj.i = Long.valueOf(k1.b());
          goto _L18
_L11:
        obj.j = Long.valueOf(k1.b());
          goto _L18
_L12:
        obj.k = (a)k1.a(((e) (obj)).k, com.kik.n.a.c.a.b());
          goto _L18
_L13:
        if (((e) (obj)).l == null)
        {
            obj.l = new ArrayList();
        }
        ((e) (obj)).l.add(k1.a(null, g.b()));
          goto _L18
_L14:
        obj.m = k1.g();
          goto _L18
        if (((e) (obj)).n == null)
        {
            obj.n = new ArrayList();
        }
        ((e) (obj)).n.add(k1.a(null, c.b()));
          goto _L18
    }

    public final void a(o o1, Object obj)
    {
        obj = (e)obj;
        if (((e) (obj)).b != null)
        {
            o1.a(1, ((e) (obj)).b, false);
        }
        if (((e) (obj)).c != null)
        {
            o1.a(2, ((e) (obj)).c, false);
        }
        if (((e) (obj)).d != null)
        {
            o1.a(3, ((e) (obj)).d, false);
        }
        if (((e) (obj)).e != null)
        {
            o1.a(4, ((e) (obj)).e, false);
        }
        if (((e) (obj)).f != null)
        {
            o1.a(5, ((e) (obj)).f, false);
        }
        if (((e) (obj)).g != null)
        {
            o1.a(6, ((e) (obj)).g, false);
        }
        if (((e) (obj)).h != null)
        {
            o1.a(7, ((e) (obj)).h, false);
        }
        if (((e) (obj)).i != null)
        {
            o1.a(8, ((e) (obj)).i.longValue(), false);
        }
        if (((e) (obj)).j != null)
        {
            o1.a(9, ((e) (obj)).j.longValue(), false);
        }
        if (((e) (obj)).k != null)
        {
            o1.a(10, ((e) (obj)).k, com.kik.n.a.c.a.b(), false);
        }
        if (((e) (obj)).l != null)
        {
            Iterator iterator = ((e) (obj)).l.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                g g1 = (g)iterator.next();
                if (g1 != null)
                {
                    o1.a(11, g1, g.b(), true);
                }
            } while (true);
        }
        if (((e) (obj)).m != null)
        {
            o1.a(12, ((e) (obj)).m, false);
        }
        if (((e) (obj)).n != null)
        {
            obj = ((e) (obj)).n.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                c c1 = (c)((Iterator) (obj)).next();
                if (c1 != null)
                {
                    o1.a(13, c1, c.b(), true);
                }
            } while (true);
        }
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
