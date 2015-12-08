// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCEBlockCipher

private static interface 
{

    public abstract int a(int i);

    public abstract int a(byte abyte0[], int i);

    public abstract int a(byte abyte0[], int i, int j, byte abyte1[], int k);

    public abstract void a(boolean flag, CipherParameters cipherparameters);

    public abstract boolean a();

    public abstract int b(int i);

    public abstract BlockCipher b();
}
