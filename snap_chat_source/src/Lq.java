// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class Lq
    implements afw
{

    static final boolean $assertionsDisabled;
    private final Ln module;

    private Lq(Ln ln)
    {
        if (!$assertionsDisabled && ln == null)
        {
            throw new AssertionError();
        } else
        {
            module = ln;
            return;
        }
    }

    public static afw a(Ln ln)
    {
        return new Lq(ln);
    }

    public final Object get()
    {
        vJ vj = vJ.a();
        if (vj == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return vj;
        }
    }

    static 
    {
        boolean flag;
        if (!Lq.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
