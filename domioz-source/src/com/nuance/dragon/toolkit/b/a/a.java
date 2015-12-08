// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.b.a;

import com.nuance.a.a.a.c.a.c.d;
import com.nuance.dragon.toolkit.b.b;
import com.nuance.dragon.toolkit.b.c;
import com.nuance.dragon.toolkit.b.e;
import com.nuance.dragon.toolkit.b.f;
import com.nuance.dragon.toolkit.b.g;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a
{

    public static com.nuance.a.a.a.c.b.b.a a(e e1, d d1)
    {
        com.nuance.a.a.a.c.b.b.a a1 = d1.b();
        e1 = e1.b().iterator();
        do
        {
            if (e1.hasNext())
            {
                Object obj = (java.util.Map.Entry)e1.next();
                String s = (String)((java.util.Map.Entry) (obj)).getKey();
                obj = (com.nuance.dragon.toolkit.b.a)((java.util.Map.Entry) (obj)).getValue();
                switch (((com.nuance.dragon.toolkit.b.a) (obj)).a())
                {
                case 4: // '\004'
                    a1.a(s, ((f)obj).a);
                    break;

                case 224: 
                    a1.a(s, a((e)obj, d1));
                    break;

                case 16: // '\020'
                    a1.a(s, a((com.nuance.dragon.toolkit.b.d)obj, d1));
                    break;

                case 192: 
                    a1.b(s, ((c)obj).a);
                    break;

                case 193: 
                    a1.b(s, ((b)obj).a);
                    break;

                case 22: // '\026'
                    a1.a(s, ((b)obj).a);
                    break;
                }
            } else
            {
                return a1;
            }
        } while (true);
    }

    private static com.nuance.a.a.a.c.b.b.b a(com.nuance.dragon.toolkit.b.d d1, d d2)
    {
        com.nuance.a.a.a.c.b.b.b b1 = d2.c();
        d1 = d1.b().iterator();
        do
        {
            if (d1.hasNext())
            {
                com.nuance.dragon.toolkit.b.a a1 = (com.nuance.dragon.toolkit.b.a)d1.next();
                switch (a1.a())
                {
                case 4: // '\004'
                    b1.a(((f)a1).a);
                    break;

                case 224: 
                    b1.a(a((e)a1, d2));
                    break;

                case 16: // '\020'
                    b1.a(a((com.nuance.dragon.toolkit.b.d)a1, d2));
                    break;

                case 192: 
                    b1.h(((c)a1).a);
                    break;

                case 193: 
                    b1.b(((b)a1).a);
                    break;

                case 22: // '\026'
                    b1.a(((b)a1).a);
                    break;
                }
            } else
            {
                return b1;
            }
        } while (true);
    }

    private static com.nuance.dragon.toolkit.b.d a(com.nuance.a.a.a.c.b.b.b b1)
    {
        com.nuance.dragon.toolkit.b.d d1;
        int i;
        d1 = new com.nuance.dragon.toolkit.b.d();
        i = 0;
_L10:
        if (i >= b1.a())
        {
            break MISSING_BLOCK_LABEL_238;
        }
        b1.a(i);
        JVM INSTR lookupswitch 7: default 92
    //                   4: 203
    //                   5: 224
    //                   16: 123
    //                   22: 182
    //                   192: 140
    //                   193: 161
    //                   224: 106;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        break MISSING_BLOCK_LABEL_224;
_L8:
        break; /* Loop/switch isn't completed */
_L1:
        com.nuance.dragon.toolkit.d.e.c("PdxValue", "Unsupported PDX type found in sequence, skipping");
_L11:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
        d1.b(a(b1.f(i)));
          goto _L11
_L4:
        d1.b(a(b1.g(i)));
          goto _L11
_L6:
        d1.b(new c(b1.b(i)));
          goto _L11
_L7:
        d1.b(new b(b1.d(i)));
          goto _L11
_L5:
        d1.b(new b(b1.e(i)));
          goto _L11
_L2:
        d1.b(new f(b1.c(i)));
          goto _L11
        d1.b(new g());
          goto _L11
        return d1;
    }

    public static e a(com.nuance.a.a.a.c.b.b.a a1)
    {
        e e1 = new e();
        Enumeration enumeration = a1.h();
        do
        {
            if (enumeration.hasMoreElements())
            {
                String s = (String)enumeration.nextElement();
                switch (a1.c(s))
                {
                default:
                    com.nuance.dragon.toolkit.d.e.c("Data", "Unsupported PDX type found in dictionary, skipping");
                    break;

                case 224: 
                    e1.a(s, a(a1.j(s)));
                    break;

                case 16: // '\020'
                    e1.a(s, a(a1.k(s)));
                    break;

                case 192: 
                    e1.a(s, new c(a1.f(s)));
                    break;

                case 193: 
                    e1.a(s, new b(a1.h(s)));
                    break;

                case 22: // '\026'
                    e1.a(s, new b(a1.i(s)));
                    break;

                case 4: // '\004'
                    e1.a(s, new f(a1.g(s)));
                    break;

                case 5: // '\005'
                    e1.a(s, new g());
                    break;
                }
            } else
            {
                return e1;
            }
        } while (true);
    }
}
