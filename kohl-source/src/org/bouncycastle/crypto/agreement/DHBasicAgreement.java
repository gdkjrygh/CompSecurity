// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;

public class DHBasicAgreement
    implements BasicAgreement
{

    private DHParameters dhParams;
    private DHPrivateKeyParameters key;

    public DHBasicAgreement()
    {
    }

    public BigInteger calculateAgreement(CipherParameters cipherparameters)
    {
        cipherparameters = (DHPublicKeyParameters)cipherparameters;
        if (!cipherparameters.getParameters().equals(dhParams))
        {
            throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
        } else
        {
            return cipherparameters.getY().modPow(key.getX(), dhParams.getP());
        }
    }

    public void init(CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (AsymmetricKeyParameter)((ParametersWithRandom)cipherparameters).getParameters();
        } else
        {
            cipherparameters = (AsymmetricKeyParameter)cipherparameters;
        }
        if (!(cipherparameters instanceof DHPrivateKeyParameters))
        {
            throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
        } else
        {
            key = (DHPrivateKeyParameters)cipherparameters;
            dhParams = key.getParameters();
            return;
        }
    }
}
