// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gw, av, gn, bb, 
//            gk, gq, go, fm

final class aw extends gw
{

    private aw()
    {
    }

    aw(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (av)fm;
        fm.f();
        av.g();
        gn1.a();
        gn1.a(av.h());
        gn1.a(((av) (fm)).a);
        if (((av) (fm)).b != null)
        {
            gn1.a(av.i());
            gn1.a(((av) (fm)).b);
        }
        if (((av) (fm)).c != null && fm.d())
        {
            gn1.a(av.j());
            gn1.a(((av) (fm)).c.a());
        }
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (av)fm;
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
                    if (gk1.b == 10)
                    {
                        fm.a = gn1.n();
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
                        av.c();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 3: // '\003'
                    if (gk1.b == 8)
                    {
                        fm.c = bb.a(gn1.m());
                        av.e();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;
                }
                continue;
            }
            gn1.e();
            if (!fm.a())
            {
                throw new go((new StringBuilder("Required field 'ts' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            fm.f();
            break;
        } while (true);
    }
}
