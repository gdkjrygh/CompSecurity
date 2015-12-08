// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gw, ez, gn, gk, 
//            gq, go, fm

final class fa extends gw
{

    private fa()
    {
    }

    fa(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (ez)fm;
        fm.o();
        ez.p();
        gn1.a();
        if (((ez) (fm)).a != null)
        {
            gn1.a(ez.q());
            gn1.a(((ez) (fm)).a);
        }
        if (((ez) (fm)).b != null)
        {
            gn1.a(ez.r());
            gn1.a(((ez) (fm)).b);
        }
        if (((ez) (fm)).c != null)
        {
            gn1.a(ez.s());
            gn1.a(((ez) (fm)).c);
        }
        gn1.a(ez.t());
        gn1.a(((ez) (fm)).d);
        gn1.a(ez.u());
        gn1.a(((ez) (fm)).e);
        gn1.a(ez.v());
        gn1.a(((ez) (fm)).f);
        if (((ez) (fm)).g != null)
        {
            gn1.a(ez.w());
            gn1.a(((ez) (fm)).g);
        }
        if (((ez) (fm)).h != null)
        {
            gn1.a(ez.x());
            gn1.a(((ez) (fm)).h);
        }
        if (((ez) (fm)).i != null)
        {
            gn1.a(ez.y());
            gn1.a(((ez) (fm)).i);
        }
        if (fm.m())
        {
            gn1.a(ez.z());
            gn1.a(((ez) (fm)).j);
        }
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (ez)fm;
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
                        ez.a();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 2: // '\002'
                    if (gk1.b == 11)
                    {
                        fm.b = gn1.p();
                        ez.b();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 3: // '\003'
                    if (gk1.b == 11)
                    {
                        fm.c = gn1.p();
                        ez.c();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 4: // '\004'
                    if (gk1.b == 8)
                    {
                        fm.d = gn1.m();
                        fm.e();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 5: // '\005'
                    if (gk1.b == 8)
                    {
                        fm.e = gn1.m();
                        fm.g();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 6: // '\006'
                    if (gk1.b == 8)
                    {
                        fm.f = gn1.m();
                        fm.i();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 7: // '\007'
                    if (gk1.b == 11)
                    {
                        fm.g = gn1.q();
                        ez.j();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 8: // '\b'
                    if (gk1.b == 11)
                    {
                        fm.h = gn1.p();
                        ez.k();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 9: // '\t'
                    if (gk1.b == 11)
                    {
                        fm.i = gn1.p();
                        ez.l();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 10: // '\n'
                    if (gk1.b == 8)
                    {
                        fm.j = gn1.m();
                        fm.n();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;
                }
                continue;
            }
            gn1.e();
            if (!fm.d())
            {
                throw new go((new StringBuilder("Required field 'serial_num' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            if (!fm.f())
            {
                throw new go((new StringBuilder("Required field 'ts_secs' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            if (!fm.h())
            {
                throw new go((new StringBuilder("Required field 'length' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            fm.o();
            break;
        } while (true);
    }
}
