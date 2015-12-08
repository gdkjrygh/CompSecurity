// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

final class bpc
    implements bqa
{

    bqu a;
    final bpa b;
    private long c;

    public bpc(bpa bpa)
    {
        b = bpa;
        super();
        c = 0L;
    }

    public final long a()
    {
        long l = c + 1L;
        c = l;
        return l;
    }

    public final void a(String s, String s1, long l)
    {
        if (a == null)
        {
            throw new IOException("No GoogleApiClient available");
        } else
        {
            boh.b.a(a, s, s1).a(new bpd(this, l));
            return;
        }
    }
}
