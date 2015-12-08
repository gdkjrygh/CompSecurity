// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509.sigi;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x500.DirectoryString;

public class NameOrPseudonym extends ASN1Object
    implements ASN1Choice
{

    private DirectoryString a;
    private DirectoryString b;
    private ASN1Sequence c;

    public final ASN1Primitive a()
    {
        if (a != null)
        {
            return a.a();
        } else
        {
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            asn1encodablevector.a(b);
            asn1encodablevector.a(c);
            return new DERSequence(asn1encodablevector);
        }
    }
}
