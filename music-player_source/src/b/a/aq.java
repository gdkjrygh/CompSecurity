// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gw, ap, gn, du, 
//            gk, gq, fm

final class aq extends gw
{

    private aq()
    {
    }

    aq(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (ap)fm;
        fm.I();
        ap.J();
        gn1.a();
        if (((ap) (fm)).a != null && fm.a())
        {
            gn1.a(ap.K());
            gn1.a(((ap) (fm)).a);
        }
        if (((ap) (fm)).b != null && fm.c())
        {
            gn1.a(ap.L());
            gn1.a(((ap) (fm)).b);
        }
        if (((ap) (fm)).c != null && fm.e())
        {
            gn1.a(ap.M());
            gn1.a(((ap) (fm)).c);
        }
        if (((ap) (fm)).d != null && fm.g())
        {
            gn1.a(ap.N());
            gn1.a(((ap) (fm)).d);
        }
        if (((ap) (fm)).e != null && fm.i())
        {
            gn1.a(ap.O());
            gn1.a(((ap) (fm)).e);
        }
        if (((ap) (fm)).f != null && fm.k())
        {
            gn1.a(ap.P());
            gn1.a(((ap) (fm)).f);
        }
        if (((ap) (fm)).g != null && fm.m())
        {
            gn1.a(ap.Q());
            gn1.a(((ap) (fm)).g);
        }
        if (((ap) (fm)).h != null && fm.o())
        {
            gn1.a(ap.R());
            gn1.a(((ap) (fm)).h);
        }
        if (((ap) (fm)).i != null && fm.q())
        {
            gn1.a(ap.S());
            ((ap) (fm)).i.b(gn1);
        }
        if (fm.s())
        {
            gn1.a(ap.T());
            gn1.a(((ap) (fm)).j);
        }
        if (fm.u())
        {
            gn1.a(ap.U());
            gn1.a(((ap) (fm)).k);
        }
        if (((ap) (fm)).l != null && fm.w())
        {
            gn1.a(ap.V());
            gn1.a(((ap) (fm)).l);
        }
        if (((ap) (fm)).m != null && fm.y())
        {
            gn1.a(ap.W());
            gn1.a(((ap) (fm)).m);
        }
        if (fm.A())
        {
            gn1.a(ap.X());
            gn1.a(((ap) (fm)).n);
        }
        if (((ap) (fm)).o != null && fm.C())
        {
            gn1.a(ap.Y());
            gn1.a(((ap) (fm)).o);
        }
        if (((ap) (fm)).p != null && fm.E())
        {
            gn1.a(ap.Z());
            gn1.a(((ap) (fm)).p);
        }
        if (((ap) (fm)).q != null && fm.G())
        {
            gn1.a(ap.aa());
            gn1.a(((ap) (fm)).q);
        }
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (ap)fm;
        gn1.d();
        do
        {
            gk gk1 = gn1.f();
            if (gk1.b != 0)
            {
                switch (gk1.c)
                {
                default:
                    gq.a(gn1, gk1.b);
                    break;

                case 1: // '\001'
                    if (gk1.b == 11)
                    {
                        fm.a = gn1.p();
                        ap.b();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 2: // '\002'
                    if (gk1.b == 11)
                    {
                        fm.b = gn1.p();
                        ap.d();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 3: // '\003'
                    if (gk1.b == 11)
                    {
                        fm.c = gn1.p();
                        ap.f();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 4: // '\004'
                    if (gk1.b == 11)
                    {
                        fm.d = gn1.p();
                        ap.h();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 5: // '\005'
                    if (gk1.b == 11)
                    {
                        fm.e = gn1.p();
                        ap.j();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 6: // '\006'
                    if (gk1.b == 11)
                    {
                        fm.f = gn1.p();
                        ap.l();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 7: // '\007'
                    if (gk1.b == 11)
                    {
                        fm.g = gn1.p();
                        ap.n();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 8: // '\b'
                    if (gk1.b == 11)
                    {
                        fm.h = gn1.p();
                        ap.p();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 9: // '\t'
                    if (gk1.b == 12)
                    {
                        fm.i = new du();
                        ((ap) (fm)).i.a(gn1);
                        ap.r();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 10: // '\n'
                    if (gk1.b == 2)
                    {
                        fm.j = gn1.j();
                        fm.t();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 11: // '\013'
                    if (gk1.b == 2)
                    {
                        fm.k = gn1.j();
                        fm.v();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 12: // '\f'
                    if (gk1.b == 11)
                    {
                        fm.l = gn1.p();
                        ap.x();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 13: // '\r'
                    if (gk1.b == 11)
                    {
                        fm.m = gn1.p();
                        ap.z();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 14: // '\016'
                    if (gk1.b == 10)
                    {
                        fm.n = gn1.n();
                        fm.B();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 15: // '\017'
                    if (gk1.b == 11)
                    {
                        fm.o = gn1.p();
                        ap.D();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 16: // '\020'
                    if (gk1.b == 11)
                    {
                        fm.p = gn1.p();
                        ap.F();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 17: // '\021'
                    if (gk1.b == 11)
                    {
                        fm.q = gn1.p();
                        ap.H();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;
                }
            } else
            {
                gn1.e();
                fm.I();
                return;
            }
        } while (true);
    }
}
