// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package b.a:
//            gw, cn, gn, gl, 
//            av, bc, gk, gq, 
//            fm

final class co extends gw
{

    private co()
    {
    }

    co(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (cn)fm;
        fm.i();
        cn.j();
        gn1.a();
        if (((cn) (fm)).a != null)
        {
            gn1.a(cn.k());
            gn1.a(((cn) (fm)).a);
        }
        if (((cn) (fm)).b != null && fm.c())
        {
            gn1.a(cn.l());
            gn1.a(new gl((byte)12, ((cn) (fm)).b.size()));
            for (Iterator iterator = ((cn) (fm)).b.iterator(); iterator.hasNext(); ((av)iterator.next()).b(gn1)) { }
        }
        if (((cn) (fm)).c != null && fm.e())
        {
            gn1.a(cn.m());
            gn1.a(new gl((byte)12, ((cn) (fm)).c.size()));
            for (Iterator iterator1 = ((cn) (fm)).c.iterator(); iterator1.hasNext(); ((bc)iterator1.next()).b(gn1)) { }
        }
        if (((cn) (fm)).d != null && fm.g())
        {
            gn1.a(cn.n());
            gn1.a(new gl((byte)12, ((cn) (fm)).d.size()));
            for (fm = ((cn) (fm)).d.iterator(); fm.hasNext(); ((bc)fm.next()).b(gn1)) { }
        }
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (cn)fm;
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
                        cn.b();
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
                        for (int i = 0; i < ((gl) (obj)).b; i++)
                        {
                            av av1 = new av();
                            av1.a(gn1);
                            ((cn) (fm)).b.add(av1);
                        }

                        cn.d();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 3: // '\003'
                    if (((gk) (obj)).b == 15)
                    {
                        obj = gn1.h();
                        fm.c = new ArrayList(((gl) (obj)).b);
                        for (int j = 0; j < ((gl) (obj)).b; j++)
                        {
                            bc bc1 = new bc();
                            bc1.a(gn1);
                            ((cn) (fm)).c.add(bc1);
                        }

                        cn.f();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 4: // '\004'
                    if (((gk) (obj)).b == 15)
                    {
                        obj = gn1.h();
                        fm.d = new ArrayList(((gl) (obj)).b);
                        for (int k = 0; k < ((gl) (obj)).b; k++)
                        {
                            bc bc2 = new bc();
                            bc2.a(gn1);
                            ((cn) (fm)).d.add(bc2);
                        }

                        cn.h();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;
                }
            } else
            {
                gn1.e();
                fm.i();
                return;
            }
        } while (true);
    }
}
