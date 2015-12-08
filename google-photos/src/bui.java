// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicReference;

class bui
    implements nfp
{

    public final String a;
    final AtomicReference b;

    public bui(String s)
    {
        a = (String)b.a(s, "nullDescription", null);
        b = new AtomicReference(a);
    }

    public final void a(nfn nfn1)
    {
        nfn1.a((String)b.get());
    }
}
