// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.spongycastle.asn1.pkcs:
//            PKCSObjectIdentifiers

public class PBES2Algorithms extends AlgorithmIdentifier
    implements PKCSObjectIdentifiers
{

    private ASN1ObjectIdentifier bz;

    public final ASN1ObjectIdentifier c()
    {
        return bz;
    }
}
