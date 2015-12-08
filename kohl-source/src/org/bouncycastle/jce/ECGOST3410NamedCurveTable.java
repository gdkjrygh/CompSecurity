// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;

public class ECGOST3410NamedCurveTable
{

    public ECGOST3410NamedCurveTable()
    {
    }

    public static Enumeration getNames()
    {
        return ECGOST3410NamedCurves.getNames();
    }

    public static ECNamedCurveParameterSpec getParameterSpec(String s)
    {
        ECDomainParameters ecdomainparameters1 = ECGOST3410NamedCurves.getByName(s);
        ECDomainParameters ecdomainparameters = ecdomainparameters1;
        if (ecdomainparameters1 == null)
        {
            try
            {
                ecdomainparameters = ECGOST3410NamedCurves.getByOID(new ASN1ObjectIdentifier(s));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
        }
        if (ecdomainparameters == null)
        {
            return null;
        } else
        {
            return new ECNamedCurveParameterSpec(s, ecdomainparameters.getCurve(), ecdomainparameters.getG(), ecdomainparameters.getN(), ecdomainparameters.getH(), ecdomainparameters.getSeed());
        }
    }
}
