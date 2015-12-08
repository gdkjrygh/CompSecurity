// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            SubjectPublicKeyInfo

public class SubjectKeyIdentifier extends ASN1Encodable
{

    private byte a[];

    public SubjectKeyIdentifier(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        SHA1Digest sha1digest = new SHA1Digest();
        byte abyte0[] = new byte[sha1digest.getDigestSize()];
        subjectpublickeyinfo = subjectpublickeyinfo.g().e();
        sha1digest.update(subjectpublickeyinfo, 0, subjectpublickeyinfo.length);
        sha1digest.doFinal(abyte0, 0);
        a = abyte0;
    }

    public final DERObject d()
    {
        return new DEROctetString(a);
    }

    public final byte[] e()
    {
        return a;
    }
}
