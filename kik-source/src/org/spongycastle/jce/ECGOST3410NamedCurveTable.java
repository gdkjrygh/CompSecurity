// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce;

import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.jce.spec.ECNamedCurveParameterSpec;

public class ECGOST3410NamedCurveTable
{

    public ECGOST3410NamedCurveTable()
    {
    }

    public static ECNamedCurveParameterSpec a(String s)
    {
        ECDomainParameters ecdomainparameters1 = ECGOST3410NamedCurves.a(s);
        ECDomainParameters ecdomainparameters = ecdomainparameters1;
        if (ecdomainparameters1 == null)
        {
            try
            {
                ecdomainparameters = ECGOST3410NamedCurves.a(new ASN1ObjectIdentifier(s));
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
            return new ECNamedCurveParameterSpec(s, ecdomainparameters.a(), ecdomainparameters.b(), ecdomainparameters.c(), ecdomainparameters.d(), ecdomainparameters.e());
        }
    }
}
