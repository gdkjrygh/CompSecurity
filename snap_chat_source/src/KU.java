// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class KU
    implements afw
{

    static final boolean $assertionsDisabled;
    private final KS module;

    private KU(KS ks)
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
        return new KU(ks);
    }

    public final Object get()
    {
        return new WW();
    }

    static 
    {
        boolean flag;
        if (!KU.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
