// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.b;


// Referenced classes of package rx.b:
//            o, h

final class s
    implements o
{

    final h a;

    s(h h1)
    {
        a = h1;
        super();
    }

    public final transient Object a(Object aobj[])
    {
        if (aobj.length != 3)
        {
            throw new RuntimeException("Func3 expecting 3 arguments.");
        } else
        {
            return a.call(aobj[0], aobj[1], aobj[2]);
        }
    }
}
