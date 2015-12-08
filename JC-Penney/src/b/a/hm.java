// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gl, go, nj, no, 
//            gn

public abstract class hm extends gl
{

    public hm(no no, nj nj1)
    {
        super(go.a, no, nj1);
    }

    public final gl a(gn gn)
    {
        throw new RuntimeException("unsupported");
    }

    public final gl c(int i)
    {
        return a(super.f.c(i));
    }
}
