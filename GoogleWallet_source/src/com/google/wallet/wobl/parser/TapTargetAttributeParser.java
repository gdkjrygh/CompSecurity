// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.parser.reporter.ReportLevel;
import com.google.wallet.wobl.parser.reporter.Reporter;
import com.google.wallet.wobl.parser.xml.XmlAttribute;
import com.google.wallet.wobl.parser.xml.XmlElement;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractAttributeParser, WoblParser

class TapTargetAttributeParser extends AbstractAttributeParser
{

    public TapTargetAttributeParser(WoblParser woblparser)
    {
        super(woblparser);
    }

    public void applyAttributesToIr(IntermediateRepresentation intermediaterepresentation, XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        if (!xmlelement.hasAttribute("tap-uri"))
        {
            break MISSING_BLOCK_LABEL_24;
        }
        xmlelement = xmlelement.getAttribute("tap-uri");
        intermediaterepresentation.setTapUris(xmlelement.getUriList());
        return;
        intermediaterepresentation;
        Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "Malformed action URI detected: %s", new Object[] {
            xmlelement.getString()
        });
        return;
    }
}
