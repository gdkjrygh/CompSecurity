// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.io;

import java.io.FilterInputStream;
import java.io.InputStream;
import org.bouncycastle.crypto.Mac;

public class MacInputStream extends FilterInputStream
{

    protected Mac a;

    public MacInputStream(InputStream inputstream, Mac mac)
    {
        super(inputstream);
        a = mac;
    }

    public Mac getMac()
    {
        return a;
    }

    public int read()
    {
        int i = in.read();
        if (i >= 0)
        {
            a.update((byte)i);
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
    {
        j = in.read(abyte0, i, j);
        if (j >= 0)
        {
            a.update(abyte0, i, j);
        }
        return j;
    }
}
