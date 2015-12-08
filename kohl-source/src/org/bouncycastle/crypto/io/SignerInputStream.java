// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.Signer;

public class SignerInputStream extends FilterInputStream
{

    protected Signer signer;

    public SignerInputStream(InputStream inputstream, Signer signer1)
    {
        super(inputstream);
        signer = signer1;
    }

    public Signer getSigner()
    {
        return signer;
    }

    public int read()
        throws IOException
    {
        int i = in.read();
        if (i >= 0)
        {
            signer.update((byte)i);
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        j = in.read(abyte0, i, j);
        if (j > 0)
        {
            signer.update(abyte0, i, j);
        }
        return j;
    }
}
