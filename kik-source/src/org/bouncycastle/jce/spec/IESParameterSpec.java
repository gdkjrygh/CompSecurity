// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.security.spec.AlgorithmParameterSpec;

public class IESParameterSpec
    implements AlgorithmParameterSpec
{

    private byte a[];
    private byte b[];
    private int c;

    public IESParameterSpec(byte abyte0[], byte abyte1[], int i)
    {
        a = new byte[abyte0.length];
        System.arraycopy(abyte0, 0, a, 0, abyte0.length);
        b = new byte[abyte1.length];
        System.arraycopy(abyte1, 0, b, 0, abyte1.length);
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
