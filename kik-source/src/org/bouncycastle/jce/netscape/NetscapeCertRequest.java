// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.netscape;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class NetscapeCertRequest extends ASN1Encodable
{

    AlgorithmIdentifier a;
    byte b[];
    String c;
    PublicKey d;

    private DERObject e()
    {
        Object obj = new ByteArrayOutputStream();
        try
        {
            ((ByteArrayOutputStream) (obj)).write(d.getEncoded());
            ((ByteArrayOutputStream) (obj)).close();
            obj = (new ASN1InputStream(new ByteArrayInputStream(((ByteArrayOutputStream) (obj)).toByteArray()))).a();
        }
        catch (IOException ioexception)
        {
            throw new InvalidKeySpecException(ioexception.getMessage());
        }
        return ((DERObject) (obj));
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
        try
        {
            asn1encodablevector1.a(e());
        }
        catch (Exception exception) { }
        asn1encodablevector1.a(new DERIA5String(c));
        asn1encodablevector.a(new DERSequence(asn1encodablevector1));
        asn1encodablevector.a(a);
        asn1encodablevector.a(new DERBitString(b));
        return new DERSequence(asn1encodablevector);
    }
}
