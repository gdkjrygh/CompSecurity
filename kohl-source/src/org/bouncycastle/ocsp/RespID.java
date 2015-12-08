// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import java.security.MessageDigest;
import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.ocsp.ResponderID;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

// Referenced classes of package org.bouncycastle.ocsp:
//            OCSPException, OCSPUtil

public class RespID
{

    ResponderID id;

    public RespID(PublicKey publickey)
        throws OCSPException
    {
        try
        {
            MessageDigest messagedigest = OCSPUtil.createDigestInstance("SHA1", null);
            messagedigest.update(SubjectPublicKeyInfo.getInstance((new ASN1InputStream(publickey.getEncoded())).readObject()).getPublicKeyData().getBytes());
            id = new ResponderID(new DEROctetString(messagedigest.digest()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw new OCSPException((new StringBuilder()).append("problem creating ID: ").append(publickey).toString(), publickey);
        }
    }

    public RespID(X500Principal x500principal)
    {
        id = new ResponderID(X500Name.getInstance(x500principal.getEncoded()));
    }

    public RespID(ResponderID responderid)
    {
        id = responderid;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof RespID))
        {
            return false;
        } else
        {
            obj = (RespID)obj;
            return id.equals(((RespID) (obj)).id);
        }
    }

    public int hashCode()
    {
        return id.hashCode();
    }

    public ResponderID toASN1Object()
    {
        return id;
    }
}
