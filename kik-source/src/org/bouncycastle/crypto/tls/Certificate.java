// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.x509.X509CertificateStructure;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsUtils

public class Certificate
{

    public static final Certificate a = new Certificate(new X509CertificateStructure[0]);
    protected X509CertificateStructure b[];

    public Certificate(X509CertificateStructure ax509certificatestructure[])
    {
        if (ax509certificatestructure == null)
        {
            throw new IllegalArgumentException("'certs' cannot be null");
        } else
        {
            b = ax509certificatestructure;
            return;
        }
    }

    protected static Certificate parse(InputStream inputstream)
    {
        int i = TlsUtils.readUint24(inputstream);
        if (i == 0)
        {
            return a;
        }
        Vector vector = new Vector();
        while (i > 0) 
        {
            int k = TlsUtils.readUint24(inputstream);
            i -= k + 3;
            byte abyte0[] = new byte[k];
            TlsUtils.readFully(abyte0, inputstream);
            ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(abyte0);
            vector.addElement(X509CertificateStructure.a((new ASN1InputStream(bytearrayinputstream)).a()));
            if (bytearrayinputstream.available() > 0)
            {
                throw new IllegalArgumentException("Sorry, there is garbage data left after the certificate");
            }
        }
        inputstream = new X509CertificateStructure[vector.size()];
        for (int j = 0; j < vector.size(); j++)
        {
            inputstream[j] = (X509CertificateStructure)vector.elementAt(j);
        }

        return new Certificate(inputstream);
    }

    protected void encode(OutputStream outputstream)
    {
        boolean flag = false;
        Vector vector = new Vector();
        int i = 0;
        int k = 0;
        for (; i < b.length; i++)
        {
            byte abyte0[] = b[i].a("DER");
            vector.addElement(abyte0);
            k += abyte0.length + 3;
        }

        TlsUtils.writeUint24(k + 3, outputstream);
        TlsUtils.writeUint24(k, outputstream);
        for (int j = ((flag) ? 1 : 0); j < vector.size(); j++)
        {
            TlsUtils.writeOpaque24((byte[])vector.elementAt(j), outputstream);
        }

    }

    public X509CertificateStructure[] getCerts()
    {
        X509CertificateStructure ax509certificatestructure[] = new X509CertificateStructure[b.length];
        System.arraycopy(b, 0, ax509certificatestructure, 0, b.length);
        return ax509certificatestructure;
    }

    public boolean isEmpty()
    {
        return b.length == 0;
    }

}
