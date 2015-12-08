// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            fv, gg, gn, fx

final class go extends fv
{

    final gg b;
    final gn c;

    go(gn gn, gg gg1)
    {
        c = gn;
        b = gg1;
        super();
    }

    final fx c()
    {
        return c;
    }

    public final Object get(int i)
    {
        return ((java.util.Map.Entry)b.get(i)).getKey();
    }
}
