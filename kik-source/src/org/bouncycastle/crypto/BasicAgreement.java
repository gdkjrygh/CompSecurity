// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.crypto:
//            CipherParameters

public interface BasicAgreement
{

    public abstract BigInteger calculateAgreement(CipherParameters cipherparameters);

    public abstract void init(CipherParameters cipherparameters);
}
