// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.c.b:
//            bu, f, bd, bg, 
//            by

private static final class <init>
{

    boolean a;
    boolean b;

    private void a(int i, int j, List list, t t)
    {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            list = ((List) (iterator.next()));
            t.a(String.valueOf(i));
            t.a(": ");
            bu.a(j, list, t);
            if (a)
            {
                list = " ";
            } else
            {
                list = "\n";
            }
            t.a(list);
        }
    }

    private void a(ect ect, Object obj, ect ect1)
    {
        if (ect.s())
        {
            ect1.a("[");
            if (ect.t().e().() && ect.h() == b.k && ect.n() && ect.v() == ect.w())
            {
                ect1.a(ect.w().c());
            } else
            {
                ect1.a(ect.c());
            }
            ect1.a("]");
        } else
        if (ect.h() == b.j)
        {
            ect1.a(ect.w().b());
        } else
        {
            ect1.a(ect.b());
        }
        if (ect.f() == a.i)
        {
            if (a)
            {
                ect1.a(" { ");
            } else
            {
                ect1.a(" {\n");
                ect1.a();
            }
        } else
        {
            ect1.a(": ");
        }
        a[ect.h().ordinal()];
        JVM INSTR tableswitch 1 18: default 192
    //                   1 284
    //                   2 284
    //                   3 284
    //                   4 298
    //                   5 298
    //                   6 298
    //                   7 312
    //                   8 326
    //                   9 340
    //                   10 354
    //                   11 354
    //                   12 371
    //                   13 371
    //                   14 388
    //                   15 441
    //                   16 488
    //                   17 502
    //                   18 502;
           goto _L1 _L2 _L2 _L2 _L3 _L3 _L3 _L4 _L5 _L6 _L7 _L7 _L8 _L8 _L9 _L10 _L11 _L12 _L12
_L1:
        break; /* Loop/switch isn't completed */
_L12:
        break MISSING_BLOCK_LABEL_502;
_L13:
        if (ect.f() == a.i)
        {
            if (a)
            {
                ect1.a("} ");
                return;
            } else
            {
                ect1.b();
                ect1.a("}\n");
                return;
            }
        }
        break MISSING_BLOCK_LABEL_525;
_L2:
        ect1.a(((Integer)obj).toString());
          goto _L13
_L3:
        ect1.a(((Long)obj).toString());
          goto _L13
_L4:
        ect1.a(((Boolean)obj).toString());
          goto _L13
_L5:
        ect1.a(((Float)obj).toString());
          goto _L13
_L6:
        ect1.a(((Double)obj).toString());
          goto _L13
_L7:
        ect1.a(bu.a(((Integer)obj).intValue()));
          goto _L13
_L8:
        ect1.a(bu.a(((Long)obj).longValue()));
          goto _L13
_L9:
        ect1.a("\"");
        if (b)
        {
            obj = bu.a((String)obj);
        } else
        {
            obj = bu.b((String)obj).replace("\n", "\\n");
        }
        ect1.a(((CharSequence) (obj)));
        ect1.a("\"");
          goto _L13
_L10:
        ect1.a("\"");
        if (obj instanceof f)
        {
            ect1.a(bu.a((f)obj));
        } else
        {
            ect1.a(bu.a((byte[])obj));
        }
        ect1.a("\"");
          goto _L13
_L11:
        ect1.a(((rSequence)obj).b());
          goto _L13
        a(((bg) ((bd)obj)), ect1);
          goto _L13
        if (a)
        {
            ect1.a(" ");
            return;
        } else
        {
            ect1.a("\n");
            return;
        }
    }

    private void a(bg bg1, rSequence rsequence)
    {
        for (Iterator iterator = bg1.d_().entrySet().iterator(); iterator.hasNext();)
        {
            Object obj = (java.util.ntry)iterator.next();
            y y = (rator.next)((java.util.ntry) (obj)).getKey();
            obj = ((java.util.ntry) (obj)).getValue();
            if (y.o())
            {
                obj = ((List)obj).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    a(y, ((Iterator) (obj)).next(), rsequence);
                }
            } else
            {
                a(y, obj, rsequence);
            }
        }

        a(bg1.f(), rsequence);
    }

    static void a(a a1, bg bg1, a a2)
    {
        a1.a(bg1, a2);
    }

    static void a(a a1, by by1, a a2)
    {
        a1.a(by1, a2);
    }

    private void a(by by1, a a1)
    {
        for (by1 = by1.f().entrySet().iterator(); by1.hasNext();)
        {
            java.util.ntry ntry = (java.util.ntry)by1.next();
            int i = ((Integer)ntry.getKey()).intValue();
            Object obj = (eger.intValue)ntry.getValue();
            a(i, 0, ((t) (obj)).b(), a1);
            a(i, 5, ((t) (obj)).c(), a1);
            a(i, 1, ((t) (obj)).d(), a1);
            a(i, 2, ((t) (obj)).e(), a1);
            obj = ((e) (obj)).f().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                by by2 = (by)((Iterator) (obj)).next();
                a1.a(((Integer)ntry.getKey()).toString());
                if (a)
                {
                    a1.a(" { ");
                } else
                {
                    a1.a(" {\n");
                    a1.a();
                }
                a(by2, a1);
                if (a)
                {
                    a1.a("} ");
                } else
                {
                    a1.b();
                    a1.a("}\n");
                }
            }
        }

    }

    private ect()
    {
        a = false;
        b = true;
    }

    b(byte byte0)
    {
        this();
    }
}
