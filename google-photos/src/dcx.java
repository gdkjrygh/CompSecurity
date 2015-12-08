// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dcx
    implements def
{

    private final def a;
    private final dcw b;

    public dcx(def def1, dcw dcw1)
    {
        a = (def)b.a(def1, "serializer", null);
        b = (dcw)b.a(dcw1, "extractor", null);
    }

    public final int a(qlw qlw)
    {
        return b.a(qlw, null, a);
    }

    public final void a(qlw qlw, qlo qlo1)
    {
        for (; !qlo1.n(); a.a(qlw, qlo1))
        {
            if (Thread.currentThread().isInterrupted())
            {
                throw new InterruptedException();
            }
        }

    }

    public final void a(qlw qlw, qlp qlp)
    {
        b.a(qlw, qlp, a);
    }
}
