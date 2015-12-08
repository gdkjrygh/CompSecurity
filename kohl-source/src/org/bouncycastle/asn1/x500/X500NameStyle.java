// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

// Referenced classes of package org.bouncycastle.asn1.x500:
//            X500Name, RDN

public interface X500NameStyle
{

    public abstract boolean areEqual(X500Name x500name, X500Name x500name1);

    public abstract ASN1ObjectIdentifier attrNameToOID(String s);

    public abstract int calculateHashCode(X500Name x500name);

    public abstract RDN[] fromString(String s);

    public abstract ASN1Encodable stringToValue(ASN1ObjectIdentifier asn1objectidentifier, String s);

    public abstract String toString(X500Name x500name);
}
