// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

public class PBKDF2Params extends ASN1Object
{

    private ASN1Integer iterationCount;
    private ASN1Integer keyLength;
    private ASN1OctetString octStr;

    private PBKDF2Params(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        octStr = (ASN1OctetString)asn1sequence.nextElement();
        iterationCount = (ASN1Integer)asn1sequence.nextElement();
        if (asn1sequence.hasMoreElements())
        {
            keyLength = (ASN1Integer)asn1sequence.nextElement();
            return;
        } else
        {
            keyLength = null;
            return;
        }
    }

    public PBKDF2Params(byte abyte0[], int i)
    {
        octStr = new DEROctetString(abyte0);
        iterationCount = new ASN1Integer(i);
    }

    public PBKDF2Params(byte abyte0[], int i, int j)
    {
        this(abyte0, i);
        keyLength = new ASN1Integer(j);
    }

    public static PBKDF2Params getInstance(Object obj)
    {
        if (obj instanceof PBKDF2Params)
        {
            return (PBKDF2Params)obj;
        }
        if (obj != null)
        {
            return new PBKDF2Params(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public BigInteger getIterationCount()
    {
        return iterationCount.getValue();
    }

    public BigInteger getKeyLength()
    {
        if (keyLength != null)
        {
            return keyLength.getValue();
        } else
        {
            return null;
        }
    }

    public byte[] getSalt()
    {
        return octStr.getOctets();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(octStr);
        asn1encodablevector.add(iterationCount);
        if (keyLength != null)
        {
            asn1encodablevector.add(keyLength);
        }
        return new DERSequence(asn1encodablevector);
    }
}
