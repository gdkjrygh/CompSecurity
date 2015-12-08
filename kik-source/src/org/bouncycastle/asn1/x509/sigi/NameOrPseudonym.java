// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509.sigi;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.DirectoryString;

public class NameOrPseudonym extends ASN1Encodable
    implements ASN1Choice
{

    private DirectoryString a;
    private DirectoryString b;
    private ASN1Sequence c;

    public final DERObject d()
    {
        if (a != null)
        {
            return a.d();
        } else
        {
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            asn1encodablevector.a(b);
            asn1encodablevector.a(c);
            return new DERSequence(asn1encodablevector);
        }
    }
}
