// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERBoolean;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.x509:
//            X509Extension

public class BasicConstraints extends ASN1Object
{

    DERBoolean a;
    ASN1Integer b;

    private BasicConstraints(ASN1Sequence asn1sequence)
    {
        a = new DERBoolean(false);
        b = null;
        if (asn1sequence.e() == 0)
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
                b = ASN1Integer.a(asn1sequence.a(0));
            }
            if (asn1sequence.e() > 1)
            {
                if (a != null)
                {
                    b = ASN1Integer.a(asn1sequence.a(1));
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
            if (obj instanceof BasicConstraints)
            {
                return (BasicConstraints)obj;
            }
            if (!(obj instanceof X509Extension))
            {
                break;
            }
            obj = X509Extension.a((X509Extension)obj);
        } while (true);
        if (obj != null)
        {
            return new BasicConstraints(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
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

    public final boolean c()
    {
        return a != null && a.d();
    }

    public final BigInteger d()
    {
        if (b != null)
        {
            return b.c();
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
                return (new StringBuilder("BasicConstraints: isCa(")).append(c()).append(")").toString();
            }
        } else
        {
            return (new StringBuilder("BasicConstraints: isCa(")).append(c()).append("), pathLenConstraint = ").append(b.c()).toString();
        }
    }
}
