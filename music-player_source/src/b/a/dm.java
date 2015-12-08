// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gw, dl, gn, gk, 
//            gq, go, fm

final class dm extends gw
{

    private dm()
    {
    }

    dm(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (dl)fm;
        fm.d();
        dl.e();
        gn1.a();
        if (((dl) (fm)).a != null)
        {
            gn1.a(dl.f());
            gn1.a(((dl) (fm)).a);
        }
        gn1.a(dl.g());
        gn1.a(((dl) (fm)).b);
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (dl)fm;
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
                        dl.a();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;

                case 2: // '\002'
                    if (gk1.b == 10)
                    {
                        fm.b = gn1.n();
                        fm.c();
                    } else
                    {
                        gq.a(gn1, gk1.b);
                    }
                    break;
                }
                continue;
            }
            gn1.e();
            if (!fm.b())
            {
                throw new go((new StringBuilder("Required field 'duration' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            fm.d();
            break;
        } while (true);
    }
}
