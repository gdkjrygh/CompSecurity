// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.modes.AEADBlockCipher;

// Referenced classes of package org.spongycastle.jce.provider:
//            JCEBlockCipher

private static final class a
    implements a
{

    private AEADBlockCipher a;

    public final int a(int i)
    {
        return a.b(i);
    }

    public final int a(byte abyte0[], int i)
    {
        return a.a(abyte0, i);
    }

    public final int a(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        return a.a(abyte0, i, j, abyte1, k);
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        a.a(flag, cipherparameters);
    }

    public final boolean a()
    {
        return false;
    }

    public final int b(int i)
    {
        return a.a(i);
    }

    public final BlockCipher b()
    {
        return a.a();
    }

    (AEADBlockCipher aeadblockcipher)
    {
        a = aeadblockcipher;
    }
}
