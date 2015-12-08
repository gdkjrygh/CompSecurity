// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA1Digest;

// Referenced classes of package org.spongycastle.asn1.x509:
//            SubjectPublicKeyInfo

public class SubjectKeyIdentifier extends ASN1Object
{

    private byte a[];

    public SubjectKeyIdentifier(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        SHA1Digest sha1digest = new SHA1Digest();
        byte abyte0[] = new byte[sha1digest.b()];
        subjectpublickeyinfo = subjectpublickeyinfo.f().c();
        sha1digest.a(subjectpublickeyinfo, 0, subjectpublickeyinfo.length);
        sha1digest.a(abyte0, 0);
        a = abyte0;
    }

    public final ASN1Primitive a()
    {
        return new DEROctetString(a);
    }

    public final byte[] c()
    {
        return a;
    }
}
