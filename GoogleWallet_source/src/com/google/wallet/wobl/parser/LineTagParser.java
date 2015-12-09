// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.common.base.Optional;
import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.intermediaterepresentation.LineIr;
import com.google.wallet.wobl.parser.reporter.ReportLevel;
import com.google.wallet.wobl.parser.reporter.Reporter;
import com.google.wallet.wobl.parser.xml.XmlAttribute;
import com.google.wallet.wobl.parser.xml.XmlElement;
import java.util.EnumSet;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractTagParser, AttributeParserType, WoblParser, Asserts, 
//            Attributes

class LineTagParser extends AbstractTagParser
{

    public LineTagParser(WoblParser woblparser)
    {
        super(woblparser, EnumSet.of(AttributeParserType.BOX_STYLED, AttributeParserType.PADDING, AttributeParserType.Z_DEPTH, AttributeParserType.ALPHA));
    }

    private static Optional getOptionalDisplayUnit(XmlAttribute xmlattribute)
        throws WoblMalformedDocException
    {
        if (xmlattribute != null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        return Optional.absent();
        xmlattribute = Optional.of(xmlattribute.getValueWithDisplayUnit());
        return xmlattribute;
        xmlattribute;
        Reporter.report(ReportLevel.WARN, xmlattribute);
        return Optional.absent();
    }

    protected volatile IntermediateRepresentation onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        return onParse(xmlelement);
    }

    protected LineIr onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        LineIr lineir = new LineIr();
        WoblParserMetadata woblparsermetadata = getWoblParser().getMetadata();
        Asserts.requireAttributes(xmlelement, woblparsermetadata, new String[] {
            "color", "orientation"
        });
        lineir.setOrientation(com.google.wallet.wobl.intermediaterepresentation.LineIr.Orientation.of(Attributes.resolve("orientation", xmlelement, woblparsermetadata).getString()));
        lineir.setColor(Attributes.resolve("color", xmlelement, woblparsermetadata).getColor());
        lineir.setThickness(getOptionalDisplayUnit(Attributes.resolve("thickness", xmlelement, woblparsermetadata)));
        lineir.setLength(getOptionalDisplayUnit(xmlelement.getAttribute("length")));
        return lineir;
    }
}
