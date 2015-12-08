// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class Lk
    implements afw
{

    static final boolean $assertionsDisabled;
    private final KS module;

    private Lk(KS ks)
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
        return new Lk(ks);
    }

    public final Object get()
    {
        java.util.concurrent.ExecutorService executorservice = IO.MISCELLANEOUS_EXECUTOR;
        if (executorservice == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return executorservice;
        }
    }

    static 
    {
        boolean flag;
        if (!Lk.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
