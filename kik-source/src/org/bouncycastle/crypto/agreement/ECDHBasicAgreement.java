// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;

public class ECDHBasicAgreement
    implements BasicAgreement
{

    private ECPrivateKeyParameters a;

    public ECDHBasicAgreement()
    {
    }

    public BigInteger calculateAgreement(CipherParameters cipherparameters)
    {
        return ((ECPublicKeyParameters)cipherparameters).getQ().a(a.getD()).b().a();
    }

    public void init(CipherParameters cipherparameters)
    {
        a = (ECPrivateKeyParameters)cipherparameters;
    }
}
