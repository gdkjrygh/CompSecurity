// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;


final class h
{

    static final h a = new h(33023);
    private int b;

    h()
    {
        this(0);
    }

    h(int i)
    {
        b = i;
    }

    final void a(h h1)
    {
        b = b | h1.b;
    }

    final boolean a()
    {
        return b == a.b;
    }

    final h b(h h1)
    {
        h h2 = new h();
        h2.a(new h(b & h1.b));
        return h2;
    }

    final boolean c(h h1)
    {
        return (b | h1.b ^ b) != 0;
    }

}
