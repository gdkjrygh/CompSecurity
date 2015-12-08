// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;

public class PKCS12BagAttributeCarrierImpl
    implements PKCS12BagAttributeCarrier
{

    private Hashtable a;
    private Vector b;

    public PKCS12BagAttributeCarrierImpl()
    {
        this(new Hashtable(), new Vector());
    }

    private PKCS12BagAttributeCarrierImpl(Hashtable hashtable, Vector vector)
    {
        a = hashtable;
        b = vector;
    }

    public final Enumeration a()
    {
        return b.elements();
    }

    public final ASN1Encodable a(DERObjectIdentifier derobjectidentifier)
    {
        return (ASN1Encodable)a.get(derobjectidentifier);
    }

    public final void a(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        if (a.containsKey(asn1objectidentifier))
        {
            a.put(asn1objectidentifier, asn1encodable);
            return;
        } else
        {
            a.put(asn1objectidentifier, asn1encodable);
            b.addElement(asn1objectidentifier);
            return;
        }
    }
}
