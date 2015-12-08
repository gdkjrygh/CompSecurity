// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            GeneralName

public class GeneralNames extends ASN1Encodable
{

    private final GeneralName a[];

    public GeneralNames(ASN1Sequence asn1sequence)
    {
        a = new GeneralName[asn1sequence.f()];
        for (int i = 0; i != asn1sequence.f(); i++)
        {
            a[i] = GeneralName.a(asn1sequence.a(i));
        }

    }

    public GeneralNames(GeneralName generalname)
    {
        a = (new GeneralName[] {
            generalname
        });
    }

    public static GeneralNames a(Object obj)
    {
        if (obj == null || (obj instanceof GeneralNames))
        {
            return (GeneralNames)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new GeneralNames((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(obj.getClass().getName()).toString());
        }
    }

    public static GeneralNames a(ASN1TaggedObject asn1taggedobject)
    {
        return a(ASN1Sequence.a(asn1taggedobject, false));
    }

    public final DERObject d()
    {
        return new DERSequence(a);
    }

    public final GeneralName[] e()
    {
        GeneralName ageneralname[] = new GeneralName[a.length];
        System.arraycopy(a, 0, ageneralname, 0, a.length);
        return ageneralname;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = System.getProperty("line.separator");
        stringbuffer.append("GeneralNames:");
        stringbuffer.append(s);
        for (int i = 0; i != a.length; i++)
        {
            stringbuffer.append("    ");
            stringbuffer.append(a[i]);
            stringbuffer.append(s);
        }

        return stringbuffer.toString();
    }
}
