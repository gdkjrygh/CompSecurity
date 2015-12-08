// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

final class e
    implements PKCS12BagAttributeCarrier
{

    private Hashtable a;
    private Vector b;

    public e()
    {
        this(new Hashtable(), new Vector());
    }

    private e(Hashtable hashtable, Vector vector)
    {
        a = hashtable;
        b = vector;
    }

    public final DEREncodable a(DERObjectIdentifier derobjectidentifier)
    {
        return (DEREncodable)a.get(derobjectidentifier);
    }

    public final void a(DERObjectIdentifier derobjectidentifier, DEREncodable derencodable)
    {
        if (a.containsKey(derobjectidentifier))
        {
            a.put(derobjectidentifier, derencodable);
            return;
        } else
        {
            a.put(derobjectidentifier, derencodable);
            b.addElement(derobjectidentifier);
            return;
        }
    }

    public final Enumeration c()
    {
        return b.elements();
    }
}
