// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;

public class ShortenedDigest
    implements ExtendedDigest
{

    private ExtendedDigest baseDigest;
    private int length;

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
            baseDigest = extendeddigest;
            length = i;
            return;
        }
    }

    public int doFinal(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[baseDigest.getDigestSize()];
        baseDigest.doFinal(abyte1, 0);
        System.arraycopy(abyte1, 0, abyte0, i, length);
        return length;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(baseDigest.getAlgorithmName()).append("(").append(length * 8).append(")").toString();
    }

    public int getByteLength()
    {
        return baseDigest.getByteLength();
    }

    public int getDigestSize()
    {
        return length;
    }

    public void reset()
    {
        baseDigest.reset();
    }

    public void update(byte byte0)
    {
        baseDigest.update(byte0);
    }

    public void update(byte abyte0[], int i, int j)
    {
        baseDigest.update(abyte0, i, j);
    }
}
