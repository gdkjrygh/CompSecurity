// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce;

import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.nist.NISTNamedCurves;
import org.spongycastle.asn1.sec.SECNamedCurves;
import org.spongycastle.asn1.teletrust.TeleTrusTNamedCurves;
import org.spongycastle.asn1.x9.X962NamedCurves;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.jce.spec.ECNamedCurveParameterSpec;

public class ECNamedCurveTable
{

    public ECNamedCurveTable()
    {
    }

    public static ECNamedCurveParameterSpec a(String s)
    {
        Object obj = X962NamedCurves.a(s);
        Object obj1 = obj;
        if (obj == null)
        {
            try
            {
                obj1 = X962NamedCurves.a(new ASN1ObjectIdentifier(s));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                obj1 = obj;
            }
        }
        obj = obj1;
        if (obj1 == null)
        {
            obj1 = SECNamedCurves.a(s);
            obj = obj1;
            if (obj1 == null)
            {
                try
                {
                    obj = SECNamedCurves.a(new ASN1ObjectIdentifier(s));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    obj = obj1;
                }
            }
        }
        obj1 = obj;
        if (obj == null)
        {
            obj = TeleTrusTNamedCurves.a(s);
            obj1 = obj;
            if (obj == null)
            {
                try
                {
                    obj1 = TeleTrusTNamedCurves.a(new ASN1ObjectIdentifier(s));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    obj1 = obj;
                }
            }
        }
        if (obj1 == null)
        {
            obj = NISTNamedCurves.a(s);
        } else
        {
            obj = obj1;
        }
        if (obj == null)
        {
            return null;
        } else
        {
            return new ECNamedCurveParameterSpec(s, ((X9ECParameters) (obj)).c(), ((X9ECParameters) (obj)).d(), ((X9ECParameters) (obj)).e(), ((X9ECParameters) (obj)).f(), ((X9ECParameters) (obj)).g());
        }
    }
}
