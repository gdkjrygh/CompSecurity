// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.interfaces;

import java.util.Enumeration;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObjectIdentifier;

public interface PKCS12BagAttributeCarrier
{

    public abstract DEREncodable a(DERObjectIdentifier derobjectidentifier);

    public abstract void a(DERObjectIdentifier derobjectidentifier, DEREncodable derencodable);

    public abstract Enumeration c();
}
