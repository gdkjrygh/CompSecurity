// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gw, r, gn, gk, 
//            gq, fm

final class s extends gw
{

    private s()
    {
    }

    s(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (r)fm;
        fm.c();
        r.d();
        gn1.a();
        if (((r) (fm)).a != null)
        {
            gn1.a(r.e());
            gn1.a(((r) (fm)).a);
        }
        if (((r) (fm)).b != null)
        {
            gn1.a(r.f());
            gn1.a(((r) (fm)).b);
        }
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (r)fm;
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
                        r.a();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 2: // '\002'
                    if (gk1.b == 11)
                    {
                        fm.b = gn1.p();
                        r.b();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;
                }
            } else
            {
                gn1.e();
                fm.c();
                return;
            }
        } while (true);
    }
}
