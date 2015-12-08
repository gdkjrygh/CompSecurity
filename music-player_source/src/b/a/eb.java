// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gw, ea, gn, cb, 
//            gk, gq, go, fm

final class eb extends gw
{

    private eb()
    {
    }

    eb(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (ea)fm;
        fm.i();
        ea.j();
        gn1.a();
        gn1.a(ea.k());
        gn1.a(((ea) (fm)).a);
        if (((ea) (fm)).b != null && fm.d())
        {
            gn1.a(ea.l());
            gn1.a(((ea) (fm)).b);
        }
        if (((ea) (fm)).c != null && fm.g())
        {
            gn1.a(ea.m());
            ((ea) (fm)).c.b(gn1);
        }
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (ea)fm;
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
                        ea.e();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 3: // '\003'
                    if (gk1.b == 12)
                    {
                        fm.c = new cb();
                        ((ea) (fm)).c.a(gn1);
                        ea.h();
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
                throw new go((new StringBuilder("Required field 'resp_code' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            fm.i();
            break;
        } while (true);
    }
}
