// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package b.a:
//            gw, bu, gn, gm, 
//            bo, gl, bi, gk, 
//            gq, fm

final class bv extends gw
{

    private bv()
    {
    }

    bv(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (bu)fm;
        fm.g();
        bu.h();
        gn1.a();
        if (((bu) (fm)).a != null)
        {
            gn1.a(bu.i());
            gn1.a(new gm((byte)11, (byte)12, ((bu) (fm)).a.size()));
            java.util.Map.Entry entry;
            for (Iterator iterator = ((bu) (fm)).a.entrySet().iterator(); iterator.hasNext(); ((bo)entry.getValue()).b(gn1))
            {
                entry = (java.util.Map.Entry)iterator.next();
                gn1.a((String)entry.getKey());
            }

        }
        if (((bu) (fm)).b != null && fm.d())
        {
            gn1.a(bu.j());
            gn1.a(new gl((byte)12, ((bu) (fm)).b.size()));
            for (Iterator iterator1 = ((bu) (fm)).b.iterator(); iterator1.hasNext(); ((bi)iterator1.next()).b(gn1)) { }
        }
        if (((bu) (fm)).c != null && fm.e())
        {
            gn1.a(bu.k());
            gn1.a(((bu) (fm)).c);
        }
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (bu)fm;
        gn1.d();
        do
        {
            Object obj = gn1.f();
            if (((gk) (obj)).b != 0)
            {
                switch (((gk) (obj)).c)
                {
                default:
                    gq.a(gn1, ((gk) (obj)).b);
                    break;

                case 1: // '\001'
                    if (((gk) (obj)).b == 13)
                    {
                        obj = gn1.g();
                        fm.a = new HashMap(((gm) (obj)).c * 2);
                        for (int i = 0; i < ((gm) (obj)).c; i++)
                        {
                            String s = gn1.p();
                            bo bo1 = new bo();
                            bo1.a(gn1);
                            ((bu) (fm)).a.put(s, bo1);
                        }

                        bu.b();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 2: // '\002'
                    if (((gk) (obj)).b == 15)
                    {
                        obj = gn1.h();
                        fm.b = new ArrayList(((gl) (obj)).b);
                        for (int j = 0; j < ((gl) (obj)).b; j++)
                        {
                            bi bi1 = new bi();
                            bi1.a(gn1);
                            ((bu) (fm)).b.add(bi1);
                        }

                        fm.a(true);
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 3: // '\003'
                    if (((gk) (obj)).b == 11)
                    {
                        fm.c = gn1.p();
                        bu.f();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;
                }
            } else
            {
                gn1.e();
                fm.g();
                return;
            }
        } while (true);
    }
}
