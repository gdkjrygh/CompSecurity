// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto;

import java.math.BigInteger;

// Referenced classes of package org.spongycastle.crypto:
//            CipherParameters

public interface BasicAgreement
{

    public abstract void a(CipherParameters cipherparameters);

    public abstract BigInteger b(CipherParameters cipherparameters);
}
