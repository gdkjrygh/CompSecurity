// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import android.content.Context;
import android.os.Handler;
import com.nuance.a.a.a.c.a.b.f;
import com.nuance.dragon.toolkit.c.a.a;
import com.nuance.dragon.toolkit.c.b;
import com.nuance.dragon.toolkit.d.b.c;
import com.nuance.dragon.toolkit.d.e;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            aj, c, n, h, 
//            t, g, f, x, 
//            e

final class d extends aj
    implements a
{

    private int a;
    private String b;
    private com.nuance.a.a.a.c.a.b.e c;
    private com.nuance.a.a.a.c.a.b.c d;
    private com.nuance.dragon.toolkit.a.c e;
    private boolean f;
    private Handler g;
    private b h;
    private boolean i;

    public d(Context context, n n1)
    {
        i = true;
        com.nuance.dragon.toolkit.d.b.c.a("appContext", context);
        com.nuance.dragon.toolkit.d.b.c.a("config", n1);
        e = new com.nuance.dragon.toolkit.a.c(context.getApplicationContext(), n1.a, n1.b, n1.c, n1.d, n1.e, n1.f, n1.g, n1.h, n1.i);
        g = new Handler();
        d = new h(this);
        a = com.nuance.dragon.toolkit.a.t.b;
        c = c();
        if (c == null)
        {
            f = false;
            e = null;
        } else
        {
            f = true;
            if (!i)
            {
                a(this);
                return;
            }
        }
    }

    static int a(d d1, int j)
    {
        d1.a = j;
        return j;
    }

    static Handler a(d d1)
    {
        return d1.g;
    }

    static String a(d d1, String s)
    {
        d1.b = s;
        return s;
    }

    static b b(d d1)
    {
        return d1.h;
    }

    private com.nuance.a.a.a.c.a.b.e c()
    {
        Object obj;
        Vector vector;
        Iterator iterator;
        Enumeration enumeration;
        String s;
        Object obj1;
        try
        {
            obj = e.i();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.nuance.dragon.toolkit.d.e.a(this, "Unable to create NMSP manager", ((Throwable) (obj)));
            return null;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        vector = new Vector();
        iterator = ((List) (obj)).iterator();
_L6:
        obj = vector;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (g)iterator.next();
        enumeration = ((g) (obj)).a();
_L4:
        if (!enumeration.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)enumeration.nextElement();
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((g) (obj)).a(s);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        vector.add(new com.nuance.a.a.a.c.c.c(s, obj1, com.nuance.a.a.a.c.c.d.a));
        if (s.equals("Calllog_Disable") && (new String((byte[])((g) (obj)).a(s))).equals("FALSE"))
        {
            i = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L2:
        obj = null;
_L5:
        obj = com.nuance.a.a.a.c.a.b.f.a(e.d(), e.e(), e.b(), e.c(), e.h(), e.j(), e.k(), ((Vector) (obj)), d);
        return ((com.nuance.a.a.a.c.a.b.e) (obj));
    }

    protected final com.nuance.dragon.toolkit.a.e a(x x)
    {
        if (f)
        {
            return new com.nuance.dragon.toolkit.a.f(c, e, x);
        } else
        {
            return null;
        }
    }

    public final void a()
    {
        super.a();
        if (f)
        {
            c.c();
            f = false;
            e = null;
        }
    }

    protected final boolean b()
    {
        return f;
    }
}
