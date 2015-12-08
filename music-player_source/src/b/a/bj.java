// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gw, bi, gn, gk, 
//            gq, go, fm

final class bj extends gw
{

    private bj()
    {
    }

    bj(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (bi)fm;
        fm.g();
        bi.h();
        gn1.a();
        if (((bi) (fm)).a != null)
        {
            gn1.a(bi.i());
            gn1.a(((bi) (fm)).a);
        }
        if (((bi) (fm)).b != null && fm.b())
        {
            gn1.a(bi.j());
            gn1.a(((bi) (fm)).b);
        }
        if (((bi) (fm)).c != null)
        {
            gn1.a(bi.k());
            gn1.a(((bi) (fm)).c);
        }
        gn1.a(bi.l());
        gn1.a(((bi) (fm)).d);
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (bi)fm;
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
                        bi.a();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 2: // '\002'
                    if (gk1.b == 11)
                    {
                        fm.b = gn1.p();
                        bi.c();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 3: // '\003'
                    if (gk1.b == 11)
                    {
                        fm.c = gn1.p();
                        bi.d();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 4: // '\004'
                    if (gk1.b == 10)
                    {
                        fm.d = gn1.n();
                        fm.f();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;
                }
                continue;
            }
            gn1.e();
            if (!fm.e())
            {
                throw new go((new StringBuilder("Required field 'ts' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            fm.g();
            break;
        } while (true);
    }
}
