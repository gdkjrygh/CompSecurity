// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package b.a:
//            gw, bc, gn, gm, 
//            dr, gk, gq, go, 
//            fm

final class bd extends gw
{

    private bd()
    {
    }

    bd(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (bc)fm;
        fm.i();
        bc.j();
        gn1.a();
        if (((bc) (fm)).a != null)
        {
            gn1.a(bc.k());
            gn1.a(((bc) (fm)).a);
        }
        if (((bc) (fm)).b != null)
        {
            gn1.a(bc.l());
            gn1.a(new gm((byte)11, (byte)12, ((bc) (fm)).b.size()));
            java.util.Map.Entry entry;
            for (Iterator iterator = ((bc) (fm)).b.entrySet().iterator(); iterator.hasNext(); ((dr)entry.getValue()).b(gn1))
            {
                entry = (java.util.Map.Entry)iterator.next();
                gn1.a((String)entry.getKey());
            }

        }
        if (fm.c())
        {
            gn1.a(bc.m());
            gn1.a(((bc) (fm)).c);
        }
        if (fm.e())
        {
            gn1.a(bc.n());
            gn1.a(((bc) (fm)).d);
        }
        gn1.a(bc.o());
        gn1.a(((bc) (fm)).e);
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (bc)fm;
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
                    if (((gk) (obj)).b == 11)
                    {
                        fm.a = gn1.p();
                        bc.a();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 2: // '\002'
                    if (((gk) (obj)).b == 13)
                    {
                        obj = gn1.g();
                        fm.b = new HashMap(((gm) (obj)).c * 2);
                        for (int i = 0; i < ((gm) (obj)).c; i++)
                        {
                            String s = gn1.p();
                            dr dr1 = new dr();
                            dr1.a(gn1);
                            ((bc) (fm)).b.put(s, dr1);
                        }

                        bc.b();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 3: // '\003'
                    if (((gk) (obj)).b == 10)
                    {
                        fm.c = gn1.n();
                        fm.d();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 4: // '\004'
                    if (((gk) (obj)).b == 8)
                    {
                        fm.d = gn1.m();
                        fm.f();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 5: // '\005'
                    if (((gk) (obj)).b == 10)
                    {
                        fm.e = gn1.n();
                        fm.h();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;
                }
                continue;
            }
            gn1.e();
            if (!fm.g())
            {
                throw new go((new StringBuilder("Required field 'ts' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            fm.i();
            break;
        } while (true);
    }
}
