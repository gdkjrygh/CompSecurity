// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.tls;

import org.spongycastle.util.Arrays;

public class TlsUtils
{

    static final byte a[] = {
        67, 76, 78, 84
    };
    static final byte b[] = {
        83, 82, 86, 82
    };
    static final byte c[][];

    public TlsUtils()
    {
    }

    static 
    {
        byte abyte0[][] = new byte[10][];
        for (int i = 0; i < 10; i++)
        {
            byte abyte1[] = new byte[i + 1];
            Arrays.a(abyte1, (byte)(i + 65));
            abyte0[i] = abyte1;
        }

        c = abyte0;
    }
}
