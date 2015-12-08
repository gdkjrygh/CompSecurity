// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce;

import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves;
import org.bouncycastle.asn1.x9.X962NamedCurves;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;

public class ECNamedCurveTable
{

    public ECNamedCurveTable()
    {
    }

    private static void addEnumeration(Vector vector, Enumeration enumeration)
    {
        for (; enumeration.hasMoreElements(); vector.addElement(enumeration.nextElement())) { }
    }

    public static Enumeration getNames()
    {
        Vector vector = new Vector();
        addEnumeration(vector, X962NamedCurves.getNames());
        addEnumeration(vector, SECNamedCurves.getNames());
        addEnumeration(vector, NISTNamedCurves.getNames());
        addEnumeration(vector, TeleTrusTNamedCurves.getNames());
        return vector.elements();
    }

    public static ECNamedCurveParameterSpec getParameterSpec(String s)
    {
        Object obj = X962NamedCurves.getByName(s);
        Object obj1 = obj;
        if (obj == null)
        {
            try
            {
                obj1 = X962NamedCurves.getByOID(new ASN1ObjectIdentifier(s));
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
            obj1 = SECNamedCurves.getByName(s);
            obj = obj1;
            if (obj1 == null)
            {
                try
                {
                    obj = SECNamedCurves.getByOID(new ASN1ObjectIdentifier(s));
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
            obj = TeleTrusTNamedCurves.getByName(s);
            obj1 = obj;
            if (obj == null)
            {
                try
                {
                    obj1 = TeleTrusTNamedCurves.getByOID(new ASN1ObjectIdentifier(s));
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
            obj = NISTNamedCurves.getByName(s);
        } else
        {
            obj = obj1;
        }
        if (obj == null)
        {
            return null;
        } else
        {
            return new ECNamedCurveParameterSpec(s, ((X9ECParameters) (obj)).getCurve(), ((X9ECParameters) (obj)).getG(), ((X9ECParameters) (obj)).getN(), ((X9ECParameters) (obj)).getH(), ((X9ECParameters) (obj)).getSeed());
        }
    }
}
