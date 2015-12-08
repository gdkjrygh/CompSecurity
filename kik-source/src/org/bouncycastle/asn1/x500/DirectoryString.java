// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;

public class DirectoryString extends ASN1Encodable
    implements ASN1Choice, ASN1String
{

    private ASN1String a;

    public final DERObject d()
    {
        return ((DEREncodable)a).c();
    }

    public final String n_()
    {
        return a.n_();
    }

    public String toString()
    {
        return a.n_();
    }
}
