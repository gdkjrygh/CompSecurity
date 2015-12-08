// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509.qualified;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509.qualified:
//            ETSIQCObjectIdentifiers, RFC3739QCObjectIdentifiers

public class QCStatement extends ASN1Object
    implements ETSIQCObjectIdentifiers, RFC3739QCObjectIdentifiers
{

    ASN1ObjectIdentifier qcStatementId;
    ASN1Encodable qcStatementInfo;

    public QCStatement(ASN1ObjectIdentifier asn1objectidentifier)
    {
        qcStatementId = asn1objectidentifier;
        qcStatementInfo = null;
    }

    public QCStatement(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        qcStatementId = asn1objectidentifier;
        qcStatementInfo = asn1encodable;
    }

    private QCStatement(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        qcStatementId = ASN1ObjectIdentifier.getInstance(asn1sequence.nextElement());
        if (asn1sequence.hasMoreElements())
        {
            qcStatementInfo = (ASN1Encodable)asn1sequence.nextElement();
        }
    }

    public static QCStatement getInstance(Object obj)
    {
        if (obj instanceof QCStatement)
        {
            return (QCStatement)obj;
        }
        if (obj != null)
        {
            return new QCStatement(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1ObjectIdentifier getStatementId()
    {
        return qcStatementId;
    }

    public ASN1Encodable getStatementInfo()
    {
        return qcStatementInfo;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(qcStatementId);
        if (qcStatementInfo != null)
        {
            asn1encodablevector.add(qcStatementInfo);
        }
        return new DERSequence(asn1encodablevector);
    }
}
