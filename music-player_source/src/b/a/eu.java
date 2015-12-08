// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package b.a:
//            gw, et, gn, ad, 
//            x, ap, df, l, 
//            gl, cn, eh, cb, 
//            bu, r, aj, gk, 
//            gq, fm

final class eu extends gw
{

    private eu()
    {
    }

    eu(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (et)fm;
        fm.w();
        et.x();
        gn1.a();
        if (((et) (fm)).a != null)
        {
            gn1.a(et.y());
            ((et) (fm)).a.b(gn1);
        }
        if (((et) (fm)).b != null)
        {
            gn1.a(et.z());
            ((et) (fm)).b.b(gn1);
        }
        if (((et) (fm)).c != null)
        {
            gn1.a(et.A());
            ((et) (fm)).c.b(gn1);
        }
        if (((et) (fm)).d != null)
        {
            gn1.a(et.B());
            ((et) (fm)).d.b(gn1);
        }
        if (((et) (fm)).e != null && fm.e())
        {
            gn1.a(et.C());
            ((et) (fm)).e.b(gn1);
        }
        if (((et) (fm)).f != null && fm.j())
        {
            gn1.a(et.D());
            gn1.a(new gl((byte)12, ((et) (fm)).f.size()));
            for (Iterator iterator = ((et) (fm)).f.iterator(); iterator.hasNext(); ((cn)iterator.next()).b(gn1)) { }
        }
        if (((et) (fm)).g != null && fm.m())
        {
            gn1.a(et.E());
            gn1.a(new gl((byte)12, ((et) (fm)).g.size()));
            for (Iterator iterator1 = ((et) (fm)).g.iterator(); iterator1.hasNext(); ((eh)iterator1.next()).b(gn1)) { }
        }
        if (((et) (fm)).h != null && fm.o())
        {
            gn1.a(et.F());
            ((et) (fm)).h.b(gn1);
        }
        if (((et) (fm)).i != null && fm.q())
        {
            gn1.a(et.G());
            ((et) (fm)).i.b(gn1);
        }
        if (((et) (fm)).j != null && fm.s())
        {
            gn1.a(et.H());
            ((et) (fm)).j.b(gn1);
        }
        if (((et) (fm)).k != null && fm.u())
        {
            gn1.a(et.I());
            ((et) (fm)).k.b(gn1);
        }
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (et)fm;
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
                    if (((gk) (obj)).b == 12)
                    {
                        fm.a = new ad();
                        ((et) (fm)).a.a(gn1);
                        et.a();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 2: // '\002'
                    if (((gk) (obj)).b == 12)
                    {
                        fm.b = new x();
                        ((et) (fm)).b.a(gn1);
                        et.b();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 3: // '\003'
                    if (((gk) (obj)).b == 12)
                    {
                        fm.c = new ap();
                        ((et) (fm)).c.a(gn1);
                        et.c();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 4: // '\004'
                    if (((gk) (obj)).b == 12)
                    {
                        fm.d = new df();
                        ((et) (fm)).d.a(gn1);
                        et.d();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 5: // '\005'
                    if (((gk) (obj)).b == 12)
                    {
                        fm.e = new l();
                        ((et) (fm)).e.a(gn1);
                        et.f();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 6: // '\006'
                    if (((gk) (obj)).b == 15)
                    {
                        obj = gn1.h();
                        fm.f = new ArrayList(((gl) (obj)).b);
                        for (int i = 0; i < ((gl) (obj)).b; i++)
                        {
                            cn cn1 = new cn();
                            cn1.a(gn1);
                            ((et) (fm)).f.add(cn1);
                        }

                        et.k();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 7: // '\007'
                    if (((gk) (obj)).b == 15)
                    {
                        obj = gn1.h();
                        fm.g = new ArrayList(((gl) (obj)).b);
                        for (int j = 0; j < ((gl) (obj)).b; j++)
                        {
                            eh eh1 = new eh();
                            eh1.a(gn1);
                            ((et) (fm)).g.add(eh1);
                        }

                        et.n();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 8: // '\b'
                    if (((gk) (obj)).b == 12)
                    {
                        fm.h = new cb();
                        ((et) (fm)).h.a(gn1);
                        et.p();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 9: // '\t'
                    if (((gk) (obj)).b == 12)
                    {
                        fm.i = new bu();
                        ((et) (fm)).i.a(gn1);
                        et.r();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 10: // '\n'
                    if (((gk) (obj)).b == 12)
                    {
                        fm.j = new r();
                        ((et) (fm)).j.a(gn1);
                        et.t();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 11: // '\013'
                    if (((gk) (obj)).b == 12)
                    {
                        fm.k = new aj();
                        ((et) (fm)).k.a(gn1);
                        et.v();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;
                }
            } else
            {
                gn1.e();
                fm.w();
                return;
            }
        } while (true);
    }
}
