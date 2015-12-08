// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

public abstract class X509NameEntryConverter
{

    public X509NameEntryConverter()
    {
    }

    public abstract DERObject a(DERObjectIdentifier derobjectidentifier, String s);
}
