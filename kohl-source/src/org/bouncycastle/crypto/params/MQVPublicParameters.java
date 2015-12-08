// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

// Referenced classes of package org.bouncycastle.crypto.params:
//            ECPublicKeyParameters

public class MQVPublicParameters
    implements CipherParameters
{

    private ECPublicKeyParameters ephemeralPublicKey;
    private ECPublicKeyParameters staticPublicKey;

    public MQVPublicParameters(ECPublicKeyParameters ecpublickeyparameters, ECPublicKeyParameters ecpublickeyparameters1)
    {
        staticPublicKey = ecpublickeyparameters;
        ephemeralPublicKey = ecpublickeyparameters1;
    }

    public ECPublicKeyParameters getEphemeralPublicKey()
    {
        return ephemeralPublicKey;
    }

    public ECPublicKeyParameters getStaticPublicKey()
    {
        return staticPublicKey;
    }
}
