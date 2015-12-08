// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gx, ft, go, fr, 
//            gn, fm

final class fw extends gx
{

    private fw()
    {
    }

    fw(byte byte0)
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
            gn1.a(((ft) (fm)).c.a());
            fm.d(gn1);
            return;
        }
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (ft)fm;
        fm.c = null;
        fm.b = null;
        short word0 = gn1.l();
        fm.b = fm.a(gn1, word0);
        if (((ft) (fm)).b != null)
        {
            fm.c = fm.a(word0);
        }
    }
}
