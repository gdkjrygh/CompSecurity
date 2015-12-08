// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.crypto.DerivationParameters;

public class KDFParameters
    implements DerivationParameters
{

    byte a[];
    byte b[];

    public KDFParameters(byte abyte0[], byte abyte1[])
    {
        b = abyte0;
        a = abyte1;
    }

    public final byte[] a()
    {
        return b;
    }

    public final byte[] b()
    {
        return a;
    }
}
