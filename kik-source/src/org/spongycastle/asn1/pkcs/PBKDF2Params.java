// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;

public class PBKDF2Params extends ASN1Object
{

    private ASN1OctetString a;
    private ASN1Integer b;
    private ASN1Integer c;

    private PBKDF2Params(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.d();
        a = (ASN1OctetString)asn1sequence.nextElement();
        b = (ASN1Integer)asn1sequence.nextElement();
        if (asn1sequence.hasMoreElements())
        {
            c = (ASN1Integer)asn1sequence.nextElement();
            return;
        } else
        {
            c = null;
            return;
        }
    }

    public PBKDF2Params(byte abyte0[], int i)
    {
        a = new DEROctetString(abyte0);
        b = new ASN1Integer(i);
    }

    public static PBKDF2Params a(Object obj)
    {
        if (obj instanceof PBKDF2Params)
        {
            return (PBKDF2Params)obj;
        }
        if (obj != null)
        {
            return new PBKDF2Params(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        if (c != null)
        {
            asn1encodablevector.a(c);
        }
        return new DERSequence(asn1encodablevector);
    }

    public final byte[] c()
    {
        return a.d();
    }

    public final BigInteger d()
    {
        return b.c();
    }
}
