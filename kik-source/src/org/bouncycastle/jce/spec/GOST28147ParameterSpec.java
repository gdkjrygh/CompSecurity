// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.security.spec.AlgorithmParameterSpec;

public class GOST28147ParameterSpec
    implements AlgorithmParameterSpec
{

    private byte a[];
    private byte b[];

    public final byte[] a()
    {
        return b;
    }

    public final byte[] b()
    {
        if (a == null)
        {
            return null;
        } else
        {
            byte abyte0[] = new byte[a.length];
            System.arraycopy(a, 0, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }
}
