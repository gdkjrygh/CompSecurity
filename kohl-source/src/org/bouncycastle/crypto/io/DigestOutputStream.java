// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.io;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.Digest;

public class DigestOutputStream extends OutputStream
{

    protected Digest digest;

    public DigestOutputStream(Digest digest1)
    {
        digest = digest1;
    }

    public byte[] getDigest()
    {
        byte abyte0[] = new byte[digest.getDigestSize()];
        digest.doFinal(abyte0, 0);
        return abyte0;
    }

    public void write(int i)
        throws IOException
    {
        digest.update((byte)i);
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        digest.update(abyte0, i, j);
    }
}
