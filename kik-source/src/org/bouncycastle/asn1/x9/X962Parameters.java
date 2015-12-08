// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            X9ECParameters

public class X962Parameters extends ASN1Encodable
    implements ASN1Choice
{

    private DERObject a;

    public X962Parameters(DERObject derobject)
    {
        a = null;
        a = derobject;
    }

    public X962Parameters(DERObjectIdentifier derobjectidentifier)
    {
        a = null;
        a = derobjectidentifier;
    }

    public X962Parameters(X9ECParameters x9ecparameters)
    {
        a = null;
        a = x9ecparameters.c();
    }

    public final DERObject d()
    {
        return a;
    }

    public final boolean e()
    {
        return a instanceof DERObjectIdentifier;
    }

    public final boolean f()
    {
        return a instanceof ASN1Null;
    }

    public final DERObject g()
    {
        return a;
    }
}
