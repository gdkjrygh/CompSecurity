// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.io;

import java.io.FilterInputStream;
import java.io.InputStream;
import org.spongycastle.crypto.Digest;

public class DigestInputStream extends FilterInputStream
{

    protected Digest a;

    public DigestInputStream(InputStream inputstream, Digest digest)
    {
        super(inputstream);
        a = digest;
    }

    public int read()
    {
        int i = in.read();
        if (i >= 0)
        {
            a.a((byte)i);
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
    {
        j = in.read(abyte0, i, j);
        if (j > 0)
        {
            a.a(abyte0, i, j);
        }
        return j;
    }
}
