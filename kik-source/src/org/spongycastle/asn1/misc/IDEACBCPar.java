// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.misc;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;

public class IDEACBCPar extends ASN1Object
{

    ASN1OctetString a;

    public IDEACBCPar(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.e() == 1)
        {
            a = (ASN1OctetString)asn1sequence.a(0);
            return;
        } else
        {
            a = null;
            return;
        }
    }

    public IDEACBCPar(byte abyte0[])
    {
        a = new DEROctetString(abyte0);
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(a);
        }
        return new DERSequence(asn1encodablevector);
    }

    public final byte[] c()
    {
        if (a != null)
        {
            return a.d();
        } else
        {
            return null;
        }
    }
}
