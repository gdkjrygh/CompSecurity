// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;


// Referenced classes of package bolts:
//            i, j

final class o
    implements i
{

    final i a;
    final j b;

    o(j j1, i k)
    {
        b = j1;
        a = k;
        super();
    }

    public final Object then(j j1)
    {
        if (j1.c())
        {
            return j.a(j1.e());
        }
        if (j1.b())
        {
            return j.f();
        } else
        {
            return j1.a(a);
        }
    }
}
