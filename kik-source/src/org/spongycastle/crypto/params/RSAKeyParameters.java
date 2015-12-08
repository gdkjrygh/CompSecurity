// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.spongycastle.crypto.params:
//            AsymmetricKeyParameter

public class RSAKeyParameters extends AsymmetricKeyParameter
{

    private BigInteger b;
    private BigInteger c;

    public RSAKeyParameters(boolean flag, BigInteger biginteger, BigInteger biginteger1)
    {
        super(flag);
        b = biginteger;
        c = biginteger1;
    }

    public final BigInteger b()
    {
        return b;
    }

    public final BigInteger c()
    {
        return c;
    }
}
