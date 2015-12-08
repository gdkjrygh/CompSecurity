// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicReference;

public final class buj
    implements nfp
{

    private final String a;
    private AtomicReference b;

    public buj(String s)
    {
        a = (String)b.a(s, "nullDescription", null);
        b = new AtomicReference();
    }

    public final void a(nfn nfn1)
    {
        nfp nfp1 = (nfp)b.get();
        if (nfp1 == null)
        {
            nfn1.a(a);
            return;
        } else
        {
            nfp1.a(nfn1);
            return;
        }
    }

    public final void a(nfp nfp1)
    {
        b.set(nfp1);
    }
}
