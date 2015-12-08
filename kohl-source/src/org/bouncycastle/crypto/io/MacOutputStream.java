// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.io;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.Mac;

public class MacOutputStream extends OutputStream
{

    protected Mac mac;

    public MacOutputStream(Mac mac1)
    {
        mac = mac1;
    }

    public byte[] getMac()
    {
        byte abyte0[] = new byte[mac.getMacSize()];
        mac.doFinal(abyte0, 0);
        return abyte0;
    }

    public void write(int i)
        throws IOException
    {
        mac.update((byte)i);
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        mac.update(abyte0, i, j);
    }
}
