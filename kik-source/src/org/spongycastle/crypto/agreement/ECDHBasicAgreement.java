// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.agreement;

import java.math.BigInteger;
import org.spongycastle.crypto.BasicAgreement;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.ec.ECPoint;

public class ECDHBasicAgreement
    implements BasicAgreement
{

    private ECPrivateKeyParameters a;

    public ECDHBasicAgreement()
    {
    }

    public final void a(CipherParameters cipherparameters)
    {
        a = (ECPrivateKeyParameters)cipherparameters;
    }

    public final BigInteger b(CipherParameters cipherparameters)
    {
        return ((ECPublicKeyParameters)cipherparameters).c().a(a.c()).b().a();
    }
}
