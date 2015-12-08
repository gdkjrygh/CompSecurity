// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

// Referenced classes of package org.spongycastle.crypto.params:
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

    public final ECPublicKeyParameters a()
    {
        return a;
    }

    public final ECPublicKeyParameters b()
    {
        return b;
    }
}
