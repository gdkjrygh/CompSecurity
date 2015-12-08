// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto;


// Referenced classes of package org.spongycastle.crypto:
//            CipherParameters

public interface BlockCipher
{

    public abstract int a(byte abyte0[], int i, byte abyte1[], int j);

    public abstract String a();

    public abstract void a(boolean flag, CipherParameters cipherparameters);

    public abstract int b();

    public abstract void c();
}
