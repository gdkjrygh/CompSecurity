// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.io;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.Mac;

public class MacOutputStream extends FilterOutputStream
{

    protected Mac a;

    public MacOutputStream(OutputStream outputstream, Mac mac)
    {
        super(outputstream);
        a = mac;
    }

    public Mac getMac()
    {
        return a;
    }

    public void write(int i)
    {
        a.update((byte)i);
        out.write(i);
    }

    public void write(byte abyte0[], int i, int j)
    {
        a.update(abyte0, i, j);
        out.write(abyte0, i, j);
    }
}
