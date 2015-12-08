// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

// Referenced classes of package org.spongycastle.crypto.params:
//            RSAKeyParameters

public class RSABlindingParameters
    implements CipherParameters
{

    private RSAKeyParameters a;
    private BigInteger b;

    public final RSAKeyParameters a()
    {
        return a;
    }

    public final BigInteger b()
    {
        return b;
    }
}
