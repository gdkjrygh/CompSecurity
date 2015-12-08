// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            kg, oo, pm, jv, 
//            ow, pf, oy, ji

public final class km extends kg
{

    private final oo a;

    public km(oo oo1)
    {
        super(1, pm.a(oo1.k()) + oo1.j() + 1);
        a = oo1;
    }

    protected final int a(kg kg1)
    {
        kg1 = (km)kg1;
        return a.a(((km) (kg1)).a);
    }

    public final jv a()
    {
        return jv.n;
    }

    public final void a(ji ji)
    {
    }

    public final void a_(ji ji, ow ow1)
    {
        ji = a.i();
        int i = a.k();
        if (ow1.a())
        {
            ow1.a(pm.a(i), (new StringBuilder("utf16_size: ")).append(pf.a(i)).toString());
            ow1.a(((oy) (ji)).c + 1, a.f());
        }
        ow1.e(i);
        ow1.a(ji);
        ow1.b(0);
    }
}
