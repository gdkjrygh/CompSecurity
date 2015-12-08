// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.wallet.wobl.common.DisplayUnit;
import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.parser.reporter.ReportLevel;
import com.google.wallet.wobl.parser.reporter.Reporter;
import com.google.wallet.wobl.parser.xml.XmlAttribute;
import com.google.wallet.wobl.parser.xml.XmlElement;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractAttributeParser, WoblParser

class ZDepthAttributeParser extends AbstractAttributeParser
{

    public ZDepthAttributeParser(WoblParser woblparser)
    {
        super(woblparser);
    }

    public void applyAttributesToIr(IntermediateRepresentation intermediaterepresentation, XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        xmlelement = xmlelement.getAttribute("z-depth");
        if (xmlelement == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        DisplayUnit displayunit = xmlelement.getValueWithDisplayUnit();
        if (displayunit == DisplayUnit.ZERO || displayunit.getUnitType() == com.google.wallet.wobl.common.DisplayUnit.Unit.DP)
        {
            intermediaterepresentation.setZDepth(displayunit);
            return;
        }
        try
        {
            Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "z-depth value should only be in dps", new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IntermediateRepresentation intermediaterepresentation)
        {
            Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "invalid z-depth value: %s", new Object[] {
                xmlelement.getString()
            });
        }
    }
}
