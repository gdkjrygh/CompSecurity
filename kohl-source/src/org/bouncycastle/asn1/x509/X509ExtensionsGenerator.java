// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            X509Extension, X509Extensions

public class X509ExtensionsGenerator
{

    private Vector extOrdering;
    private Hashtable extensions;

    public X509ExtensionsGenerator()
    {
        extensions = new Hashtable();
        extOrdering = new Vector();
    }

    public void addExtension(ASN1ObjectIdentifier asn1objectidentifier, boolean flag, ASN1Encodable asn1encodable)
    {
        try
        {
            addExtension(asn1objectidentifier, flag, asn1encodable.toASN1Primitive().getEncoded("DER"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ASN1ObjectIdentifier asn1objectidentifier)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("error encoding value: ").append(asn1objectidentifier).toString());
        }
    }

    public void addExtension(ASN1ObjectIdentifier asn1objectidentifier, boolean flag, byte abyte0[])
    {
        if (extensions.containsKey(asn1objectidentifier))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("extension ").append(asn1objectidentifier).append(" already added").toString());
        } else
        {
            extOrdering.addElement(asn1objectidentifier);
            extensions.put(asn1objectidentifier, new X509Extension(flag, new DEROctetString(abyte0)));
            return;
        }
    }

    public void addExtension(DERObjectIdentifier derobjectidentifier, boolean flag, ASN1Encodable asn1encodable)
    {
        addExtension(new ASN1ObjectIdentifier(derobjectidentifier.getId()), flag, asn1encodable);
    }

    public void addExtension(DERObjectIdentifier derobjectidentifier, boolean flag, byte abyte0[])
    {
        addExtension(new ASN1ObjectIdentifier(derobjectidentifier.getId()), flag, abyte0);
    }

    public X509Extensions generate()
    {
        return new X509Extensions(extOrdering, extensions);
    }

    public boolean isEmpty()
    {
        return extOrdering.isEmpty();
    }

    public void reset()
    {
        extensions = new Hashtable();
        extOrdering = new Vector();
    }
}
