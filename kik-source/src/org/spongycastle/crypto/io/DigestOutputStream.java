// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.io;

import java.io.OutputStream;
import org.spongycastle.crypto.Digest;

public class DigestOutputStream extends OutputStream
{

    protected Digest a;

    public DigestOutputStream(Digest digest)
    {
        a = digest;
    }

    public final byte[] a()
    {
        byte abyte0[] = new byte[a.b()];
        a.a(abyte0, 0);
        return abyte0;
    }

    public void write(int i)
    {
        a.a((byte)i);
    }

    public void write(byte abyte0[], int i, int j)
    {
        a.a(abyte0, i, j);
    }
}
