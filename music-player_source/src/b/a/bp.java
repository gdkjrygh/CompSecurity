// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gw, bo, gn, gk, 
//            gq, go, fm

final class bp extends gw
{

    private bp()
    {
    }

    bp(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (bo)fm;
        fm.i();
        bo.j();
        gn1.a();
        if (((bo) (fm)).a != null)
        {
            gn1.a(bo.k());
            gn1.a(((bo) (fm)).a);
        }
        gn1.a(bo.l());
        gn1.a(((bo) (fm)).b);
        gn1.a(bo.m());
        gn1.a(((bo) (fm)).c);
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (bo)fm;
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
                        bo.b();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 2: // '\002'
                    if (gk1.b == 10)
                    {
                        fm.b = gn1.n();
                        fm.e();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 3: // '\003'
                    if (gk1.b == 8)
                    {
                        fm.c = gn1.m();
                        fm.h();
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
                throw new go((new StringBuilder("Required field 'ts' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            if (!fm.g())
            {
                throw new go((new StringBuilder("Required field 'version' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            fm.i();
            break;
        } while (true);
    }
}
