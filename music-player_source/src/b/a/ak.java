// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gw, aj, gn, ct, 
//            gk, gq, fm

final class ak extends gw
{

    private ak()
    {
    }

    ak(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (aj)fm;
        fm.c();
        aj.d();
        gn1.a();
        if (((aj) (fm)).a != null && fm.a())
        {
            gn1.a(aj.e());
            ((aj) (fm)).a.b(gn1);
        }
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (aj)fm;
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
                    if (gk1.b == 12)
                    {
                        fm.a = new ct();
                        ((aj) (fm)).a.a(gn1);
                        aj.b();
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
