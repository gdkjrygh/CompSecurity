// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

public class IESParameters
    implements CipherParameters
{

    private byte a[];
    private byte b[];
    private int c;

    public IESParameters(byte abyte0[], byte abyte1[], int i)
    {
        a = abyte0;
        b = abyte1;
        c = i;
    }

    public final byte[] a()
    {
        return a;
    }

    public final byte[] b()
    {
        return b;
    }

    public final int c()
    {
        return c;
    }
}
