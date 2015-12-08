// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

// Referenced classes of package org.spongycastle.crypto.params:
//            ECPrivateKeyParameters, ECPublicKeyParameters

public class MQVPrivateParameters
    implements CipherParameters
{

    private ECPrivateKeyParameters a;
    private ECPrivateKeyParameters b;
    private ECPublicKeyParameters c;

    public MQVPrivateParameters(ECPrivateKeyParameters ecprivatekeyparameters, ECPrivateKeyParameters ecprivatekeyparameters1, ECPublicKeyParameters ecpublickeyparameters)
    {
        a = ecprivatekeyparameters;
        b = ecprivatekeyparameters1;
        c = ecpublickeyparameters;
    }

    public final ECPrivateKeyParameters a()
    {
        return a;
    }

    public final ECPrivateKeyParameters b()
    {
        return b;
    }

    public final ECPublicKeyParameters c()
    {
        return c;
    }
}
