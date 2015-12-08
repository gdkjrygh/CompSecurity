// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

// Referenced classes of package org.bouncycastle.crypto.params:
//            ECPrivateKeyParameters, ECPublicKeyParameters

public class MQVPrivateParameters
    implements CipherParameters
{

    private ECPrivateKeyParameters a;
    private ECPrivateKeyParameters b;
    private ECPublicKeyParameters c;

    public MQVPrivateParameters(ECPrivateKeyParameters ecprivatekeyparameters, ECPrivateKeyParameters ecprivatekeyparameters1)
    {
        this(ecprivatekeyparameters, ecprivatekeyparameters1, null);
    }

    public MQVPrivateParameters(ECPrivateKeyParameters ecprivatekeyparameters, ECPrivateKeyParameters ecprivatekeyparameters1, ECPublicKeyParameters ecpublickeyparameters)
    {
        a = ecprivatekeyparameters;
        b = ecprivatekeyparameters1;
        c = ecpublickeyparameters;
    }

    public ECPrivateKeyParameters getEphemeralPrivateKey()
    {
        return b;
    }

    public ECPublicKeyParameters getEphemeralPublicKey()
    {
        return c;
    }

    public ECPrivateKeyParameters getStaticPrivateKey()
    {
        return a;
    }
}
