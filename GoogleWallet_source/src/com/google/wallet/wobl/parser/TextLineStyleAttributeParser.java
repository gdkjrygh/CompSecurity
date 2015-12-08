// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.intermediaterepresentation.TextIr;
import com.google.wallet.wobl.parser.reporter.ReportLevel;
import com.google.wallet.wobl.parser.reporter.Reporter;
import com.google.wallet.wobl.parser.xml.XmlAttribute;
import com.google.wallet.wobl.parser.xml.XmlElement;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractAttributeParser, WoblParser, Attributes

class TextLineStyleAttributeParser extends AbstractAttributeParser
{

    public TextLineStyleAttributeParser(WoblParser woblparser)
    {
        super(woblparser);
    }

    public volatile void applyAttributesToIr(IntermediateRepresentation intermediaterepresentation, XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        applyAttributesToIr((TextIr)intermediaterepresentation, xmlelement);
    }

    public void applyAttributesToIr(TextIr textir, XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        WoblParserMetadata woblparsermetadata = getWoblParser().getMetadata();
        XmlAttribute xmlattribute = Attributes.resolve("line-height", xmlelement, woblparsermetadata);
        xmlelement = Attributes.resolve("max-lines", xmlelement, woblparsermetadata);
        if (xmlattribute != null)
        {
            try
            {
                textir.setLineHeight(com.google.wallet.wobl.intermediaterepresentation.TextIr.LineHeight.of(xmlattribute.getString()));
            }
            catch (WoblMalformedDocException woblmalformeddocexception)
            {
                Reporter.report(ReportLevel.WARN, woblmalformeddocexception);
            }
        }
        if (xmlelement == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        textir.setMaxLines(xmlelement.getPositiveInteger());
        return;
        textir;
        Reporter.report(ReportLevel.WARN, textir);
        return;
    }
}
