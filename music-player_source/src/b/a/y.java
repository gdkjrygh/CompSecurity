// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gw, x, gn, eg, 
//            gk, gq, fm

final class y extends gw
{

    private y()
    {
    }

    y(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (x)fm;
        fm.q();
        x.r();
        gn1.a();
        if (((x) (fm)).a != null)
        {
            gn1.a(x.s());
            gn1.a(((x) (fm)).a);
        }
        if (((x) (fm)).b != null && fm.b())
        {
            gn1.a(x.t());
            gn1.a(((x) (fm)).b);
        }
        if (fm.d())
        {
            gn1.a(x.u());
            gn1.a(((x) (fm)).c);
        }
        if (((x) (fm)).d != null && fm.f())
        {
            gn1.a(x.v());
            gn1.a(((x) (fm)).d);
        }
        if (((x) (fm)).e != null)
        {
            gn1.a(x.w());
            gn1.a(((x) (fm)).e.a());
        }
        if (((x) (fm)).f != null)
        {
            gn1.a(x.x());
            gn1.a(((x) (fm)).f);
        }
        if (((x) (fm)).g != null)
        {
            gn1.a(x.y());
            gn1.a(((x) (fm)).g);
        }
        if (((x) (fm)).h != null && fm.k())
        {
            gn1.a(x.z());
            gn1.a(((x) (fm)).h);
        }
        if (((x) (fm)).i != null && fm.m())
        {
            gn1.a(x.A());
            gn1.a(((x) (fm)).i);
        }
        if (fm.o())
        {
            gn1.a(x.B());
            gn1.a(((x) (fm)).j);
        }
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (x)fm;
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
                        x.a();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 2: // '\002'
                    if (gk1.b == 11)
                    {
                        fm.b = gn1.p();
                        x.c();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 3: // '\003'
                    if (gk1.b == 8)
                    {
                        fm.c = gn1.m();
                        fm.e();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 4: // '\004'
                    if (gk1.b == 11)
                    {
                        fm.d = gn1.p();
                        x.g();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 5: // '\005'
                    if (gk1.b == 8)
                    {
                        fm.e = eg.a(gn1.m());
                        x.h();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 6: // '\006'
                    if (gk1.b == 11)
                    {
                        fm.f = gn1.p();
                        x.i();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 7: // '\007'
                    if (gk1.b == 11)
                    {
                        fm.g = gn1.p();
                        x.j();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 8: // '\b'
                    if (gk1.b == 11)
                    {
                        fm.h = gn1.p();
                        x.l();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 9: // '\t'
                    if (gk1.b == 11)
                    {
                        fm.i = gn1.p();
                        x.n();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 10: // '\n'
                    if (gk1.b == 8)
                    {
                        fm.j = gn1.m();
                        fm.p();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;
                }
            } else
            {
                gn1.e();
                fm.q();
                return;
            }
        } while (true);
    }
}
