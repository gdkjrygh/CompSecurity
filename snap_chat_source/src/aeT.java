// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class aeT
{

    public boolean L;

    public aeT()
    {
        L = true;
    }

    public aeT(boolean flag)
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
            throw new aeV("immutable instance");
        } else
        {
            return;
        }
    }

    public final void g()
    {
        if (L)
        {
            throw new aeV("mutable instance");
        } else
        {
            return;
        }
    }
}
