// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Hashtable;
import org.spongycastle.asn1.ASN1Enumerated;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;

public class CRLReason extends ASN1Object
{

    private static final String a[] = {
        "unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", 
        "aACompromise"
    };
    private static final Hashtable b = new Hashtable();
    private ASN1Enumerated c;

    private CRLReason(int i)
    {
        c = new ASN1Enumerated(i);
    }

    public static CRLReason a(int i)
    {
        Integer integer = new Integer(i);
        if (!b.containsKey(integer))
        {
            b.put(integer, new CRLReason(i));
        }
        return (CRLReason)b.get(integer);
    }

    public static CRLReason a(Object obj)
    {
        if (obj instanceof CRLReason)
        {
            return (CRLReason)obj;
        }
        if (obj != null)
        {
            return a(ASN1Enumerated.a(obj).c().intValue());
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        return c;
    }

    public String toString()
    {
        int i = c.c().intValue();
        String s;
        if (i < 0 || i > 10)
        {
            s = "invalid";
        } else
        {
            s = a[i];
        }
        return (new StringBuilder("CRLReason: ")).append(s).toString();
    }

}
