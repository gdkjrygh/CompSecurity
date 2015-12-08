// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class jsw extends jrj
{

    private boolean a;

    public jsw(jrk jrk)
    {
        super(jrk);
    }

    public abstract void a();

    public final boolean q()
    {
        return a;
    }

    protected final void r()
    {
        if (!q())
        {
            throw new IllegalStateException("Not initialized");
        } else
        {
            return;
        }
    }

    public final void s()
    {
        a();
        a = true;
    }
}
