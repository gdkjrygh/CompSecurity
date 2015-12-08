// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gw, ft, go, gn, 
//            gk, fm

final class fu extends gw
{

    private fu()
    {
    }

    fu(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (ft)fm;
        if (fm.b() == null || fm.c() == null)
        {
            throw new go("Cannot write a TUnion with no set value!");
        } else
        {
            fm.a();
            gn1.a();
            gn1.a(fm.a(((ft) (fm)).c));
            fm.c(gn1);
            gn1.c();
            gn1.b();
            return;
        }
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (ft)fm;
        fm.c = null;
        fm.b = null;
        gn1.d();
        gk gk1 = gn1.f();
        fm.b = fm.a(gn1, gk1);
        if (((ft) (fm)).b != null)
        {
            fm.c = fm.a(gk1.c);
        }
        gn1.f();
        gn1.e();
    }
}
