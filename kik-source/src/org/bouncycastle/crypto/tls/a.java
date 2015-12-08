// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;

final class a
    implements Digest
{

    private MD5Digest a;
    private SHA1Digest b;

    a()
    {
        a = new MD5Digest();
        b = new SHA1Digest();
    }

    a(a a1)
    {
        a = new MD5Digest(a1.a);
        b = new SHA1Digest(a1.b);
    }

    public final int doFinal(byte abyte0[], int i)
    {
        return a.doFinal(abyte0, i) + b.doFinal(abyte0, i + 16);
    }

    public final String getAlgorithmName()
    {
        return (new StringBuilder()).append(a.getAlgorithmName()).append(" and ").append(b.getAlgorithmName()).append(" for TLS 1.0").toString();
    }

    public final int getDigestSize()
    {
        return 36;
    }

    public final void reset()
    {
        a.reset();
        b.reset();
    }

    public final void update(byte byte0)
    {
        a.update(byte0);
        b.update(byte0);
    }

    public final void update(byte abyte0[], int i, int j)
    {
        a.update(abyte0, i, j);
        b.update(abyte0, i, j);
    }
}
