// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.x509:
//            GeneralName

public class GeneralNames extends ASN1Object
{

    private final GeneralName a[];

    private GeneralNames(ASN1Sequence asn1sequence)
    {
        a = new GeneralName[asn1sequence.e()];
        for (int i = 0; i != asn1sequence.e(); i++)
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
        if (obj instanceof GeneralNames)
        {
            return (GeneralNames)obj;
        }
        if (obj != null)
        {
            return new GeneralNames(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public static GeneralNames a(ASN1TaggedObject asn1taggedobject)
    {
        return a(ASN1Sequence.a(asn1taggedobject, false));
    }

    public final ASN1Primitive a()
    {
        return new DERSequence(a);
    }

    public final GeneralName[] c()
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
