// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gw, en, gn, gk, 
//            gq, go, fm

final class eo extends gw
{

    private eo()
    {
    }

    eo(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (en)fm;
        en.e();
        en.f();
        gn1.a();
        gn1.a(en.g());
        gn1.a(((en) (fm)).a);
        gn1.a(en.h());
        gn1.a(((en) (fm)).b);
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (en)fm;
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
                }
                continue;
            }
            gn1.e();
            if (!fm.a())
            {
                throw new go((new StringBuilder("Required field 'upload_traffic' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            if (!fm.c())
            {
                throw new go((new StringBuilder("Required field 'download_traffic' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            en.e();
            break;
        } while (true);
    }
}
