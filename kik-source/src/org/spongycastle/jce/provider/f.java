// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import org.spongycastle.asn1.x509.ReasonFlags;

final class f
{

    static final f a = new f(33023);
    private int b;

    f()
    {
        this(0);
    }

    private f(int i)
    {
        b = i;
    }

    f(ReasonFlags reasonflags)
    {
        b = reasonflags.e();
    }

    final void a(f f1)
    {
        b = b | f1.b;
    }

    final boolean a()
    {
        return b == a.b;
    }

    final f b(f f1)
    {
        f f2 = new f();
        f2.a(new f(b & f1.b));
        return f2;
    }

    final boolean c(f f1)
    {
        return (b | f1.b ^ b) != 0;
    }

}
