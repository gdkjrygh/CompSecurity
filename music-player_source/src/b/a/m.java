// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gw, l, gn, gk, 
//            gq, go, fm

final class m extends gw
{

    private m()
    {
    }

    m(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (l)fm;
        l.c();
        l.d();
        gn1.a();
        gn1.a(l.e());
        gn1.a(((l) (fm)).a);
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (l)fm;
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
                }
                continue;
            }
            gn1.e();
            if (!fm.a())
            {
                throw new go((new StringBuilder("Required field 'ts' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            l.c();
            break;
        } while (true);
    }
}
