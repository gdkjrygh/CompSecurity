// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class bnd extends bnc
{

    private boolean a;

    public bnd(bnf bnf)
    {
        super(bnf);
    }

    public abstract void a();

    public final boolean l()
    {
        return a;
    }

    protected final void m()
    {
        if (!l())
        {
            throw new IllegalStateException("Not initialized");
        } else
        {
            return;
        }
    }

    public final void n()
    {
        a();
        a = true;
    }
}
