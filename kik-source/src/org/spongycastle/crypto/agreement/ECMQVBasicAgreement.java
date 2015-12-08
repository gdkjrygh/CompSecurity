// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.agreement;

import java.math.BigInteger;
import org.spongycastle.crypto.BasicAgreement;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.MQVPrivateParameters;
import org.spongycastle.crypto.params.MQVPublicParameters;
import org.spongycastle.math.ec.ECAlgorithms;
import org.spongycastle.math.ec.ECConstants;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.ec.ECPoint;

public class ECMQVBasicAgreement
    implements BasicAgreement
{

    MQVPrivateParameters a;

    public ECMQVBasicAgreement()
    {
    }

    public final void a(CipherParameters cipherparameters)
    {
        a = (MQVPrivateParameters)cipherparameters;
    }

    public final BigInteger b(CipherParameters cipherparameters)
    {
        Object obj = (MQVPublicParameters)cipherparameters;
        Object obj1 = a.a();
        ECDomainParameters ecdomainparameters = ((ECPrivateKeyParameters) (obj1)).b();
        ECPrivateKeyParameters ecprivatekeyparameters = a.b();
        cipherparameters = a.c();
        ECPublicKeyParameters ecpublickeyparameters = ((MQVPublicParameters) (obj)).a();
        obj = ((MQVPublicParameters) (obj)).b();
        BigInteger biginteger = ecdomainparameters.c();
        int i = (biginteger.bitLength() + 1) / 2;
        BigInteger biginteger1 = ECConstants.g.shiftLeft(i);
        if (cipherparameters == null)
        {
            cipherparameters = ecdomainparameters.b().a(ecprivatekeyparameters.c());
        } else
        {
            cipherparameters = cipherparameters.c();
        }
        cipherparameters = cipherparameters.b().a().mod(biginteger1).setBit(i);
        cipherparameters = ((ECPrivateKeyParameters) (obj1)).c().multiply(cipherparameters).mod(biginteger).add(ecprivatekeyparameters.c()).mod(biginteger);
        obj1 = ((ECPublicKeyParameters) (obj)).c().b().a().mod(biginteger1).setBit(i);
        cipherparameters = ecdomainparameters.d().multiply(cipherparameters).mod(biginteger);
        cipherparameters = ECAlgorithms.a(ecpublickeyparameters.c(), ((BigInteger) (obj1)).multiply(cipherparameters).mod(biginteger), ((ECPublicKeyParameters) (obj)).c(), cipherparameters);
        if (cipherparameters.d())
        {
            throw new IllegalStateException("Infinity is not a valid agreement value for MQV");
        } else
        {
            return cipherparameters.b().a();
        }
    }
}
