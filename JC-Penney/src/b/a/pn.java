// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            po

public class pn
{

    public boolean L;

    public pn()
    {
        L = true;
    }

    public pn(boolean flag)
    {
        L = flag;
    }

    public final boolean e()
    {
        return !L;
    }

    public final void f()
    {
        if (!L)
        {
            throw new po("immutable instance");
        } else
        {
            return;
        }
    }

    public final void g()
    {
        if (L)
        {
            throw new po("mutable instance");
        } else
        {
            return;
        }
    }
}
