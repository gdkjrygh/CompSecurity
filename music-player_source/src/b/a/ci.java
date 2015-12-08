// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gw, ch, gn, gk, 
//            gq, go, fm

final class ci extends gw
{

    private ci()
    {
    }

    ci(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (ch)fm;
        fm.i();
        ch.j();
        gn1.a();
        if (((ch) (fm)).a != null && fm.b())
        {
            gn1.a(ch.k());
            gn1.a(((ch) (fm)).a);
        }
        gn1.a(ch.l());
        gn1.a(((ch) (fm)).b);
        if (((ch) (fm)).c != null)
        {
            gn1.a(ch.m());
            gn1.a(((ch) (fm)).c);
        }
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (ch)fm;
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
                        ch.c();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 2: // '\002'
                    if (gk1.b == 10)
                    {
                        fm.b = gn1.n();
                        fm.f();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 3: // '\003'
                    if (gk1.b == 11)
                    {
                        fm.c = gn1.p();
                        ch.h();
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
            fm.i();
            break;
        } while (true);
    }
}
