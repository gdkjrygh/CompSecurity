// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            Targets, Target

public class TargetInformation extends ASN1Object
{

    private ASN1Sequence targets;

    private TargetInformation(ASN1Sequence asn1sequence)
    {
        targets = asn1sequence;
    }

    public TargetInformation(Targets targets1)
    {
        targets = new DERSequence(targets1);
    }

    public TargetInformation(Target atarget[])
    {
        this(new Targets(atarget));
    }

    public static TargetInformation getInstance(Object obj)
    {
        if (obj instanceof TargetInformation)
        {
            return (TargetInformation)obj;
        }
        if (obj != null)
        {
            return new TargetInformation(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public Targets[] getTargetsObjects()
    {
        Targets atargets[] = new Targets[targets.size()];
        int i = 0;
        for (Enumeration enumeration = targets.getObjects(); enumeration.hasMoreElements();)
        {
            atargets[i] = Targets.getInstance(enumeration.nextElement());
            i++;
        }

        return atargets;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return targets;
    }
}
