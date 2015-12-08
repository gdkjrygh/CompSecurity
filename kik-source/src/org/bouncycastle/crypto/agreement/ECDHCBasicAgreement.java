// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;

public class ECDHCBasicAgreement
    implements BasicAgreement
{

    ECPrivateKeyParameters a;

    public ECDHCBasicAgreement()
    {
    }

    public BigInteger calculateAgreement(CipherParameters cipherparameters)
    {
        cipherparameters = (ECPublicKeyParameters)cipherparameters;
        ECDomainParameters ecdomainparameters = cipherparameters.getParameters();
        return cipherparameters.getQ().a(ecdomainparameters.getH().multiply(a.getD())).b().a();
    }

    public void init(CipherParameters cipherparameters)
    {
        a = (ECPrivateKeyParameters)cipherparameters;
    }
}
