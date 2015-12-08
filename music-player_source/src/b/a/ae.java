// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gw, ad, gn, gk, 
//            gq, go, fm

final class ae extends gw
{

    private ae()
    {
    }

    ae(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (ad)fm;
        ad.g();
        ad.h();
        gn1.a();
        gn1.a(ad.i());
        gn1.a(((ad) (fm)).a);
        gn1.a(ad.j());
        gn1.a(((ad) (fm)).b);
        if (fm.e())
        {
            gn1.a(ad.k());
            gn1.a(((ad) (fm)).c);
        }
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (ad)fm;
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
                    if (gk1.b == 8)
                    {
                        fm.b = gn1.m();
                        fm.d();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 3: // '\003'
                    if (gk1.b == 8)
                    {
                        fm.c = gn1.m();
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
                throw new go((new StringBuilder("Required field 'successful_requests' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            if (!fm.c())
            {
                throw new go((new StringBuilder("Required field 'failed_requests' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            ad.g();
            break;
        } while (true);
    }
}
