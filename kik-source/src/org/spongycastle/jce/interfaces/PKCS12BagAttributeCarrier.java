// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.interfaces;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERObjectIdentifier;

public interface PKCS12BagAttributeCarrier
{

    public abstract Enumeration a();

    public abstract ASN1Encodable a(DERObjectIdentifier derobjectidentifier);

    public abstract void a(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable);
}
