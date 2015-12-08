// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.signers;

import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.SignerWithRecovery;

public class ISO9796d2PSSSigner
    implements SignerWithRecovery
{

    private Digest a;
    private byte b[];
    private int c;

    public final void a(byte byte0)
    {
        if (c < b.length)
        {
            byte abyte0[] = b;
            int i = c;
            c = i + 1;
            abyte0[i] = byte0;
            return;
        } else
        {
            a.a(byte0);
            return;
        }
    }

    public final void a(byte abyte0[], int i, int j)
    {
        for (; j > 0 && c < b.length; j--)
        {
            a(abyte0[i]);
            i++;
        }

        if (j > 0)
        {
            a.a(abyte0, i, j);
        }
    }
}
