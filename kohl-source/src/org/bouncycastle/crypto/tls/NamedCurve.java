// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;

public class NamedCurve
{

    public static final int arbitrary_explicit_char2_curves = 65282;
    public static final int arbitrary_explicit_prime_curves = 65281;
    private static final String curveNames[] = {
        "sect163k1", "sect163r1", "sect163r2", "sect193r1", "sect193r2", "sect233k1", "sect233r1", "sect239k1", "sect283k1", "sect283r1", 
        "sect409k1", "sect409r1", "sect571k1", "sect571r1", "secp160k1", "secp160r1", "secp160r2", "secp192k1", "secp192r1", "secp224k1", 
        "secp224r1", "secp256k1", "secp256r1", "secp384r1", "secp521r1"
    };
    public static final int secp160k1 = 15;
    public static final int secp160r1 = 16;
    public static final int secp160r2 = 17;
    public static final int secp192k1 = 18;
    public static final int secp192r1 = 19;
    public static final int secp224k1 = 20;
    public static final int secp224r1 = 21;
    public static final int secp256k1 = 22;
    public static final int secp256r1 = 23;
    public static final int secp384r1 = 24;
    public static final int secp521r1 = 25;
    public static final int sect163k1 = 1;
    public static final int sect163r1 = 2;
    public static final int sect163r2 = 3;
    public static final int sect193r1 = 4;
    public static final int sect193r2 = 5;
    public static final int sect233k1 = 6;
    public static final int sect233r1 = 7;
    public static final int sect239k1 = 8;
    public static final int sect283k1 = 9;
    public static final int sect283r1 = 10;
    public static final int sect409k1 = 11;
    public static final int sect409r1 = 12;
    public static final int sect571k1 = 13;
    public static final int sect571r1 = 14;

    public NamedCurve()
    {
    }

    static ECDomainParameters getECParameters(int i)
    {
        i--;
        X9ECParameters x9ecparameters;
        if (i >= 0 && i < curveNames.length)
        {
            if ((x9ecparameters = SECNamedCurves.getByName(curveNames[i])) != null)
            {
                return new ECDomainParameters(x9ecparameters.getCurve(), x9ecparameters.getG(), x9ecparameters.getN(), x9ecparameters.getH(), x9ecparameters.getSeed());
            }
        }
        return null;
    }

}
