// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.agreement;

import java.math.BigInteger;
import org.spongycastle.crypto.BasicAgreement;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.DHPrivateKeyParameters;
import org.spongycastle.crypto.params.DHPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;

public class DHBasicAgreement
    implements BasicAgreement
{

    private DHPrivateKeyParameters a;
    private DHParameters b;

    public DHBasicAgreement()
    {
    }

    public final void a(CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (AsymmetricKeyParameter)((ParametersWithRandom)cipherparameters).b();
        } else
        {
            cipherparameters = (AsymmetricKeyParameter)cipherparameters;
        }
        if (!(cipherparameters instanceof DHPrivateKeyParameters))
        {
            throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
        } else
        {
            a = (DHPrivateKeyParameters)cipherparameters;
            b = a.b();
            return;
        }
    }

    public final BigInteger b(CipherParameters cipherparameters)
    {
        cipherparameters = (DHPublicKeyParameters)cipherparameters;
        if (!cipherparameters.b().equals(b))
        {
            throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
        } else
        {
            return cipherparameters.c().modPow(a.c(), b.a());
        }
    }
}
