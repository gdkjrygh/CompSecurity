// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce;

import java.io.IOException;
import java.security.Principal;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.X509Name;

public class X509Principal extends X509Name
    implements Principal
{

    public X509Principal(String s)
    {
        super(s);
    }

    public X509Principal(Hashtable hashtable)
    {
        super(hashtable);
    }

    public X509Principal(Vector vector, Hashtable hashtable)
    {
        super(vector, hashtable);
    }

    public X509Principal(Vector vector, Vector vector1)
    {
        super(vector, vector1);
    }

    public X509Principal(X500Name x500name)
    {
        super((ASN1Sequence)x500name.toASN1Primitive());
    }

    public X509Principal(X509Name x509name)
    {
        super((ASN1Sequence)x509name.toASN1Primitive());
    }

    public X509Principal(boolean flag, String s)
    {
        super(flag, s);
    }

    public X509Principal(boolean flag, Hashtable hashtable, String s)
    {
        super(flag, hashtable, s);
    }

    public X509Principal(byte abyte0[])
        throws IOException
    {
        super(readSequence(new ASN1InputStream(abyte0)));
    }

    private static ASN1Sequence readSequence(ASN1InputStream asn1inputstream)
        throws IOException
    {
        try
        {
            asn1inputstream = ASN1Sequence.getInstance(asn1inputstream.readObject());
        }
        // Misplaced declaration of an exception variable
        catch (ASN1InputStream asn1inputstream)
        {
            throw new IOException((new StringBuilder()).append("not an ASN.1 Sequence: ").append(asn1inputstream).toString());
        }
        return asn1inputstream;
    }

    public byte[] getEncoded()
    {
        byte abyte0[];
        try
        {
            abyte0 = getEncoded("DER");
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception.toString());
        }
        return abyte0;
    }

    public String getName()
    {
        return toString();
    }
}
