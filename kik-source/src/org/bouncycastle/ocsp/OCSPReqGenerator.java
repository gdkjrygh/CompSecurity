// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.X509Extensions;

public class OCSPReqGenerator
{

    private List a;
    private GeneralName b;
    private X509Extensions c;

    public OCSPReqGenerator()
    {
        a = new ArrayList();
        b = null;
        c = null;
    }
}
