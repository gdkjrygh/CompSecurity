// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

public class RC2Parameters
    implements CipherParameters
{

    private byte a[];
    private int b;

    public RC2Parameters(byte abyte0[], int i)
    {
        a = new byte[abyte0.length];
        b = i;
        System.arraycopy(abyte0, 0, a, 0, abyte0.length);
    }

    public final byte[] a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }
}
