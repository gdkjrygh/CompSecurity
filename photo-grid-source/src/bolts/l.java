// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;


// Referenced classes of package bolts:
//            i, j, k, q

final class l
    implements i
{

    final k a;

    l(k k1)
    {
        a = k1;
        super();
    }

    public final Object then(j j1)
    {
        if (j1.b())
        {
            a.c.b();
        } else
        if (j1.c())
        {
            a.c.a(j1.e());
        } else
        {
            a.c.a(j1.d());
        }
        return null;
    }
}
