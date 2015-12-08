// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.Mac;

public class MacInputStream extends FilterInputStream
{

    protected Mac mac;

    public MacInputStream(InputStream inputstream, Mac mac1)
    {
        super(inputstream);
        mac = mac1;
    }

    public Mac getMac()
    {
        return mac;
    }

    public int read()
        throws IOException
    {
        int i = in.read();
        if (i >= 0)
        {
            mac.update((byte)i);
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        j = in.read(abyte0, i, j);
        if (j >= 0)
        {
            mac.update(abyte0, i, j);
        }
        return j;
    }
}
