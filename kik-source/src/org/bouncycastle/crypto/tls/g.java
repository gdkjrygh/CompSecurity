// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.signers.DSASigner;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            f

final class g extends f
{

    g()
    {
    }

    protected final DSA createDSAImpl()
    {
        return new DSASigner();
    }

    public final boolean isValidPublicKey(AsymmetricKeyParameter asymmetrickeyparameter)
    {
        return asymmetrickeyparameter instanceof DSAPublicKeyParameters;
    }
}
