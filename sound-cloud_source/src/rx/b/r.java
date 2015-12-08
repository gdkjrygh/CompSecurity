// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.b;


// Referenced classes of package rx.b:
//            o, g

final class r
    implements o
{

    final g a;

    r(g g1)
    {
        a = g1;
        super();
    }

    public final transient Object a(Object aobj[])
    {
        if (aobj.length != 2)
        {
            throw new RuntimeException("Func2 expecting 2 arguments.");
        } else
        {
            return a.call(aobj[0], aobj[1]);
        }
    }
}
