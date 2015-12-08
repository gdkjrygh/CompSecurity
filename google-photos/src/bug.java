// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;

final class bug
    implements nfp
{

    private buf a;

    bug(buf buf1)
    {
        a = buf1;
        super();
    }

    public final void a(nfn nfn)
    {
        if (!buf.a(a).o())
        {
            return;
        }
        for (Iterator iterator = buf.b(a).iterator(); iterator.hasNext(); ((nfp)iterator.next()).a(nfn)) { }
        buf.c(a).a(nfn);
        buf.d(a).a(nfn);
        buf.e(a).a(nfn);
        buf.f(a).a(nfn);
    }
}
