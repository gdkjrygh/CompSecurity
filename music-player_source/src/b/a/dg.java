// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gw, df, gn, k, 
//            gk, gq, fm

final class dg extends gw
{

    private dg()
    {
    }

    dg(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (df)fm;
        df.u();
        df.v();
        gn1.a();
        if (fm.a())
        {
            gn1.a(df.w());
            gn1.a(((df) (fm)).a);
        }
        if (((df) (fm)).b != null && fm.c())
        {
            gn1.a(df.x());
            gn1.a(((df) (fm)).b);
        }
        if (((df) (fm)).c != null && fm.e())
        {
            gn1.a(df.y());
            gn1.a(((df) (fm)).c);
        }
        if (fm.g())
        {
            gn1.a(df.z());
            gn1.a(((df) (fm)).d);
        }
        if (fm.i())
        {
            gn1.a(df.A());
            gn1.a(((df) (fm)).e);
        }
        if (((df) (fm)).f != null && fm.k())
        {
            gn1.a(df.B());
            gn1.a(((df) (fm)).f);
        }
        if (fm.m())
        {
            gn1.a(df.C());
            gn1.a(((df) (fm)).g);
        }
        if (((df) (fm)).h != null && fm.o())
        {
            gn1.a(df.D());
            gn1.a(((df) (fm)).h);
        }
        if (((df) (fm)).i != null && fm.q())
        {
            gn1.a(df.E());
            gn1.a(((df) (fm)).i.a());
        }
        if (((df) (fm)).j != null && fm.s())
        {
            gn1.a(df.F());
            gn1.a(((df) (fm)).j);
        }
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (df)fm;
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
                    if (gk1.b == 8)
                    {
                        fm.a = gn1.m();
                        fm.b();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 2: // '\002'
                    if (gk1.b == 11)
                    {
                        fm.b = gn1.p();
                        df.d();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 3: // '\003'
                    if (gk1.b == 11)
                    {
                        fm.c = gn1.p();
                        df.f();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 4: // '\004'
                    if (gk1.b == 4)
                    {
                        fm.d = gn1.o();
                        fm.h();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 5: // '\005'
                    if (gk1.b == 4)
                    {
                        fm.e = gn1.o();
                        fm.j();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 6: // '\006'
                    if (gk1.b == 11)
                    {
                        fm.f = gn1.p();
                        df.l();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 7: // '\007'
                    if (gk1.b == 8)
                    {
                        fm.g = gn1.m();
                        fm.n();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 8: // '\b'
                    if (gk1.b == 11)
                    {
                        fm.h = gn1.p();
                        df.p();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 9: // '\t'
                    if (gk1.b == 8)
                    {
                        fm.i = k.a(gn1.m());
                        df.r();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 10: // '\n'
                    if (gk1.b == 11)
                    {
                        fm.j = gn1.p();
                        df.t();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;
                }
            } else
            {
                gn1.e();
                df.u();
                return;
            }
        } while (true);
    }
}
