// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            X509Extension

public class BasicConstraints extends ASN1Encodable
{

    DERBoolean a;
    DERInteger b;

    public BasicConstraints(ASN1Sequence asn1sequence)
    {
        a = new DERBoolean(false);
        b = null;
        if (asn1sequence.f() == 0)
        {
            a = null;
            b = null;
        } else
        {
            if (asn1sequence.a(0) instanceof DERBoolean)
            {
                a = DERBoolean.a(asn1sequence.a(0));
            } else
            {
                a = null;
                b = DERInteger.a(asn1sequence.a(0));
            }
            if (asn1sequence.f() > 1)
            {
                if (a != null)
                {
                    b = DERInteger.a(asn1sequence.a(1));
                    return;
                } else
                {
                    throw new IllegalArgumentException("wrong sequence in constructor");
                }
            }
        }
    }

    public static BasicConstraints a(Object obj)
    {
        do
        {
            if (obj == null || (obj instanceof BasicConstraints))
            {
                return (BasicConstraints)obj;
            }
            if (obj instanceof ASN1Sequence)
            {
                return new BasicConstraints((ASN1Sequence)obj);
            }
            if (obj instanceof X509Extension)
            {
                obj = X509Extension.a((X509Extension)obj);
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass().getName()).toString());
            }
        } while (true);
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(a);
        }
        if (b != null)
        {
            asn1encodablevector.a(b);
        }
        return new DERSequence(asn1encodablevector);
    }

    public final boolean e()
    {
        return a != null && a.e();
    }

    public final BigInteger f()
    {
        if (b != null)
        {
            return b.e();
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        if (b == null)
        {
            if (a == null)
            {
                return "BasicConstraints: isCa(false)";
            } else
            {
                return (new StringBuilder("BasicConstraints: isCa(")).append(e()).append(")").toString();
            }
        } else
        {
            return (new StringBuilder("BasicConstraints: isCa(")).append(e()).append("), pathLenConstraint = ").append(b.e()).toString();
        }
    }
}
