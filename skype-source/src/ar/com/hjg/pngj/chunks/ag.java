// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;


// Referenced classes of package ar.com.hjg.pngj.chunks:
//            f, e, u, ac

public final class ag
{

    private final e a;
    private final boolean b;

    public ag(e e1)
    {
        a = e1;
        if (e1 instanceof f)
        {
            b = false;
            return;
        } else
        {
            b = true;
            return;
        }
    }

    public final u a()
    {
        return (u)a.a("PLTE");
    }

    public final ac b()
    {
        return (ac)a.a("tRNS");
    }
}
