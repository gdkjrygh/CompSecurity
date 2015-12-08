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

    private ECPublicKeyParameters a;
    private ECPublicKeyParameters b;

    public MQVPublicParameters(ECPublicKeyParameters ecpublickeyparameters, ECPublicKeyParameters ecpublickeyparameters1)
    {
        a = ecpublickeyparameters;
        b = ecpublickeyparameters1;
    }

    public ECPublicKeyParameters getEphemeralPublicKey()
    {
        return b;
    }

    public ECPublicKeyParameters getStaticPublicKey()
    {
        return a;
    }
}
