// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;

// Referenced classes of package org.spongycastle.crypto.engines:
//            a

public class RSAEngine
    implements AsymmetricBlockCipher
{

    private a a;

    public RSAEngine()
    {
    }

    public final int a()
    {
        return a.a();
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (a == null)
        {
            a = new a();
        }
        a.a(flag, cipherparameters);
    }

    public final byte[] a(byte abyte0[], int i, int j)
    {
        if (a == null)
        {
            throw new IllegalStateException("RSA engine not initialised");
        } else
        {
            return a.a(a.b(a.a(abyte0, i, j)));
        }
    }

    public final int b()
    {
        return a.b();
    }
}
