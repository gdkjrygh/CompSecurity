// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;

public interface AEADBlockCipher
{

    public abstract int a(int i);

    public abstract int a(byte abyte0[], int i);

    public abstract int a(byte abyte0[], int i, int j, byte abyte1[], int k);

    public abstract BlockCipher a();

    public abstract void a(boolean flag, CipherParameters cipherparameters);

    public abstract int b(int i);
}
