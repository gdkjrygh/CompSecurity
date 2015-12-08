// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gw, cz, gn, gk, 
//            gq, go, fm

final class da extends gw
{

    private da()
    {
    }

    da(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (cz)fm;
        cz.g();
        cz.h();
        gn1.a();
        gn1.a(cz.i());
        gn1.a(((cz) (fm)).a);
        gn1.a(cz.j());
        gn1.a(((cz) (fm)).b);
        gn1.a(cz.k());
        gn1.a(((cz) (fm)).c);
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (cz)fm;
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
                    if (gk1.b == 4)
                    {
                        fm.a = gn1.o();
                        fm.b();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 2: // '\002'
                    if (gk1.b == 4)
                    {
                        fm.b = gn1.o();
                        fm.d();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 3: // '\003'
                    if (gk1.b == 10)
                    {
                        fm.c = gn1.n();
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
            if (!fm.a())
            {
                throw new go((new StringBuilder("Required field 'lat' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            if (!fm.c())
            {
                throw new go((new StringBuilder("Required field 'lng' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            if (!fm.e())
            {
                throw new go((new StringBuilder("Required field 'ts' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            cz.g();
            break;
        } while (true);
    }
}
