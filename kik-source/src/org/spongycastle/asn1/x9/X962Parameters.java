// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Null;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;

// Referenced classes of package org.spongycastle.asn1.x9:
//            X9ECParameters

public class X962Parameters extends ASN1Object
    implements ASN1Choice
{

    private ASN1Primitive a;

    public X962Parameters(ASN1ObjectIdentifier asn1objectidentifier)
    {
        a = null;
        a = asn1objectidentifier;
    }

    public X962Parameters(ASN1Primitive asn1primitive)
    {
        a = null;
        a = asn1primitive;
    }

    public X962Parameters(X9ECParameters x9ecparameters)
    {
        a = null;
        a = x9ecparameters.a();
    }

    public static X962Parameters a(Object obj)
    {
        if (obj == null || (obj instanceof X962Parameters))
        {
            return (X962Parameters)obj;
        }
        if (obj instanceof ASN1Primitive)
        {
            return new X962Parameters((ASN1Primitive)obj);
        } else
        {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
    }

    public final ASN1Primitive a()
    {
        return a;
    }

    public final boolean c()
    {
        return a instanceof ASN1ObjectIdentifier;
    }

    public final boolean d()
    {
        return a instanceof ASN1Null;
    }

    public final ASN1Primitive e()
    {
        return a;
    }
}
