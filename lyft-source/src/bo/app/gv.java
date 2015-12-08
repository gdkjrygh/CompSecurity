// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            ga, gl, gu, gc

final class gv extends ga
{

    final gl b;
    final gu c;

    gv(gu gu, gl gl1)
    {
        c = gu;
        b = gl1;
        super();
    }

    final gc c()
    {
        return c;
    }

    public final Object get(int i)
    {
        return ((java.util.Map.Entry)b.get(i)).getValue();
    }
}
