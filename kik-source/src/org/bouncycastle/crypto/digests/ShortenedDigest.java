// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;

public class ShortenedDigest
    implements ExtendedDigest
{

    private ExtendedDigest a;
    private int b;

    public ShortenedDigest(ExtendedDigest extendeddigest, int i)
    {
        if (extendeddigest == null)
        {
            throw new IllegalArgumentException("baseDigest must not be null");
        }
        if (i > extendeddigest.getDigestSize())
        {
            throw new IllegalArgumentException("baseDigest output not large enough to support length");
        } else
        {
            a = extendeddigest;
            b = i;
            return;
        }
    }

    public int doFinal(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[a.getDigestSize()];
        a.doFinal(abyte1, 0);
        System.arraycopy(abyte1, 0, abyte0, i, b);
        return b;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(a.getAlgorithmName()).append("(").append(b * 8).append(")").toString();
    }

    public int getByteLength()
    {
        return a.getByteLength();
    }

    public int getDigestSize()
    {
        return b;
    }

    public void reset()
    {
        a.reset();
    }

    public void update(byte byte0)
    {
        a.update(byte0);
    }

    public void update(byte abyte0[], int i, int j)
    {
        a.update(abyte0, i, j);
    }
}
