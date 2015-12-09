// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            kg, jv, ji, kc, 
//            iu, ow, pf

public final class iv extends kg
{

    iu a;

    public final jv a()
    {
        return jv.v;
    }

    public final void a(ji ji1)
    {
        a = (iu)ji1.b.b(a);
    }

    protected final void a_(ji ji1, ow ow1)
    {
        int i = a.d();
        if (ow1.a())
        {
            ow1.a(4, (new StringBuilder("  annotations_off: ")).append(pf.a(i)).toString());
        }
        ow1.d(i);
    }
}
