// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto;


// Referenced classes of package org.spongycastle.crypto:
//            CipherParameters

public interface Mac
{

    public abstract int a();

    public abstract int a(byte abyte0[], int i);

    public abstract void a(byte byte0);

    public abstract void a(CipherParameters cipherparameters);

    public abstract void a(byte abyte0[], int i, int j);

    public abstract void b();
}
