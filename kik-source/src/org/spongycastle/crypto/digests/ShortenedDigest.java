// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.ExtendedDigest;

public class ShortenedDigest
    implements ExtendedDigest
{

    private ExtendedDigest a;
    private int b;

    public final int a(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[a.b()];
        a.a(abyte1, 0);
        System.arraycopy(abyte1, 0, abyte0, i, b);
        return b;
    }

    public final String a()
    {
        return (new StringBuilder()).append(a.a()).append("(").append(b * 8).append(")").toString();
    }

    public final void a(byte byte0)
    {
        a.a(byte0);
    }

    public final void a(byte abyte0[], int i, int j)
    {
        a.a(abyte0, i, j);
    }

    public final int b()
    {
        return b;
    }

    public final void c()
    {
        a.c();
    }

    public final int d()
    {
        return a.d();
    }
}
