// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import com.kik.m.e;
import kik.a.d.j;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            y

public final class al extends y
{

    private final j a;
    private final byte b[];
    private final int i;
    private final String j;

    public al(byte abyte0[], int k, String s, j j1)
    {
        super(null, "set");
        a = j1;
        b = abyte0;
        i = k;
        j = s;
    }

    protected final void a(n n1)
    {
        n1.a(null, "query");
        n1.b("xmlns", "kik:iq:scan");
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:iq:scan");
        o1.a("scan");
        if (a != null)
        {
            o1.a("jid", a.b());
        }
        if (j != null)
        {
            o1.a("data", j);
        }
        o1.a("bytes", e.a(b));
        o1.a("nonce", String.valueOf(i & 0xffff));
        o1.b("scan");
        o1.b("query");
    }

    public final boolean c()
    {
        return false;
    }
}
