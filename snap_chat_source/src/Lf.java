// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class Lf
    implements afw
{

    static final boolean $assertionsDisabled;
    private final KS module;

    private Lf(KS ks)
    {
        if (!$assertionsDisabled && ks == null)
        {
            throw new AssertionError();
        } else
        {
            module = ks;
            return;
        }
    }

    public static afw a(KS ks)
    {
        return new Lf(ks);
    }

    public final Object get()
    {
        Ei ei = Ei.a();
        if (ei == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return ei;
        }
    }

    static 
    {
        boolean flag;
        if (!Lf.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
