// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class KeyParameter
    implements CipherParameters
{

    private byte a[];

    public KeyParameter(byte abyte0[])
    {
        this(abyte0, 0, abyte0.length);
    }

    public KeyParameter(byte abyte0[], int i, int j)
    {
        a = new byte[j];
        System.arraycopy(abyte0, i, a, 0, j);
    }

    public byte[] getKey()
    {
        return a;
    }
}
