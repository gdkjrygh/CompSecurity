// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.generators;

import java.security.SecureRandom;
import org.spongycastle.crypto.params.ElGamalParameters;

// Referenced classes of package org.spongycastle.crypto.generators:
//            b

public class ElGamalParametersGenerator
{

    private int a;
    private int b;
    private SecureRandom c;

    public ElGamalParametersGenerator()
    {
    }

    public final ElGamalParameters a()
    {
        java.math.BigInteger biginteger = org.spongycastle.crypto.generators.b.a(a, b, c)[0];
        return new ElGamalParameters(biginteger, org.spongycastle.crypto.generators.b.a(biginteger, c));
    }

    public final void a(int i, int j, SecureRandom securerandom)
    {
        a = i;
        b = j;
        c = securerandom;
    }
}
