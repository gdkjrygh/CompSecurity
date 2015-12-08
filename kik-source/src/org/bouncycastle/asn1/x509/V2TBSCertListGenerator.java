// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Vector;
import org.bouncycastle.asn1.DERInteger;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            Time, X509Extensions

public class V2TBSCertListGenerator
{

    DERInteger a;
    Time b;
    X509Extensions c;
    private Vector d;

    public V2TBSCertListGenerator()
    {
        a = new DERInteger(1);
        b = null;
        c = null;
        d = null;
    }
}
