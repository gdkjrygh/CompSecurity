// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            fu, gf, go, fw

final class gp extends fu
{

    final gf b;
    final go c;

    gp(go go, gf gf1)
    {
        c = go;
        b = gf1;
        super();
    }

    final fw c()
    {
        return c;
    }

    public final Object get(int i)
    {
        return ((java.util.Map.Entry)b.get(i)).getValue();
    }
}
