// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class Lc
    implements afw
{

    static final boolean $assertionsDisabled;
    private final KS module;

    private Lc(KS ks)
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
        return new Lc(ks);
    }

    public final Object get()
    {
        Fh fh = Fh.a();
        if (fh == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return fh;
        }
    }

    static 
    {
        boolean flag;
        if (!Lc.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
