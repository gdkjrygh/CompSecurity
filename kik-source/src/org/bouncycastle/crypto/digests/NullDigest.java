// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.Digest;

public class NullDigest
    implements Digest
{

    private ByteArrayOutputStream a;

    public NullDigest()
    {
        a = new ByteArrayOutputStream();
    }

    public int doFinal(byte abyte0[], int i)
    {
        byte abyte1[] = a.toByteArray();
        System.arraycopy(abyte1, 0, abyte0, i, abyte1.length);
        reset();
        return abyte1.length;
    }

    public String getAlgorithmName()
    {
        return "NULL";
    }

    public int getDigestSize()
    {
        return a.size();
    }

    public void reset()
    {
        a.reset();
    }

    public void update(byte byte0)
    {
        a.write(byte0);
    }

    public void update(byte abyte0[], int i, int j)
    {
        a.write(abyte0, i, j);
    }
}
