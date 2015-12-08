// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            ContentInfoParser

public class CompressedDataParser
{

    private AlgorithmIdentifier _compressionAlgorithm;
    private ContentInfoParser _encapContentInfo;
    private ASN1Integer _version;

    public CompressedDataParser(ASN1SequenceParser asn1sequenceparser)
        throws IOException
    {
        _version = (ASN1Integer)asn1sequenceparser.readObject();
        _compressionAlgorithm = AlgorithmIdentifier.getInstance(asn1sequenceparser.readObject().toASN1Primitive());
        _encapContentInfo = new ContentInfoParser((ASN1SequenceParser)asn1sequenceparser.readObject());
    }

    public AlgorithmIdentifier getCompressionAlgorithmIdentifier()
    {
        return _compressionAlgorithm;
    }

    public ContentInfoParser getEncapContentInfo()
    {
        return _encapContentInfo;
    }

    public ASN1Integer getVersion()
    {
        return _version;
    }
}
