// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.Digest;

public class DigestInputStream extends FilterInputStream
{

    protected Digest digest;

    public DigestInputStream(InputStream inputstream, Digest digest1)
    {
        super(inputstream);
        digest = digest1;
    }

    public Digest getDigest()
    {
        return digest;
    }

    public int read()
        throws IOException
    {
        int i = in.read();
        if (i >= 0)
        {
            digest.update((byte)i);
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        j = in.read(abyte0, i, j);
        if (j > 0)
        {
            digest.update(abyte0, i, j);
        }
        return j;
    }
}
