// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.a;

import com.google.b.a.b.a;
import com.google.b.c;
import com.google.b.e;
import com.google.b.h;
import com.google.b.m;
import com.google.b.o;
import com.google.b.q;
import com.google.b.r;
import com.google.b.t;
import java.util.Map;

// Referenced classes of package com.google.b.a:
//            a

public final class b
    implements o
{

    public b()
    {
    }

    public q a(c c1, Map map)
    {
        Object obj2;
        a a1;
        obj2 = null;
        a1 = new a(c1.c());
        Object obj;
        obj = a1.a(false);
        c1 = ((com.google.b.a.a) (obj)).e();
        com.google.b.b.e e1 = (new com.google.b.a.a.a()).a(((com.google.b.a.a) (obj)));
        Object obj1;
        obj1 = null;
        obj = c1;
        c1 = e1;
        break MISSING_BLOCK_LABEL_49;
        obj1;
        obj = null;
_L3:
        c1 = null;
          goto _L1
        obj1;
        obj = null;
_L2:
        Object obj3 = null;
        c1 = null;
        obj2 = obj1;
        obj1 = obj3;
_L1:
        if (c1 != null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        int i;
        int j;
        try
        {
            c1 = a1.a(true);
            obj = c1.e();
            c1 = (new com.google.b.a.a.a()).a(c1);
            break MISSING_BLOCK_LABEL_77;
        }
        // Misplaced declaration of an exception variable
        catch (c c1) { }
        // Misplaced declaration of an exception variable
        catch (c c1) { }
        if (obj1 != null)
        {
            throw obj1;
        }
        if (obj2 != null)
        {
            throw obj2;
        } else
        {
            throw c1;
        }
        if (map != null)
        {
            map = (t)map.get(e.j);
            if (map != null)
            {
                j = obj.length;
                for (i = 0; i < j; i++)
                {
                    map.a(obj[i]);
                }

            }
        }
        map = new q(c1.b(), c1.a(), ((com.google.b.s []) (obj)), com.google.b.a.a);
        obj = c1.c();
        if (obj != null)
        {
            map.a(r.c, obj);
        }
        c1 = c1.d();
        if (c1 != null)
        {
            map.a(r.d, c1);
        }
        return map;
        obj1;
        obj = c1;
          goto _L2
        obj1;
        obj = c1;
          goto _L3
    }

    public void a()
    {
    }
}
