// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.io;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.Signer;

public class SignerOutputStream extends OutputStream
{

    protected Signer signer;

    public SignerOutputStream(Signer signer1)
    {
        signer = signer1;
    }

    public Signer getSigner()
    {
        return signer;
    }

    public void write(int i)
        throws IOException
    {
        signer.update((byte)i);
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        signer.update(abyte0, i, j);
    }
}
