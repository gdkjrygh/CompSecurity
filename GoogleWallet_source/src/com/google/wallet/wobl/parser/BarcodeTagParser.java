// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.BarcodeIr;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.parser.reporter.ReportLevel;
import com.google.wallet.wobl.parser.reporter.Reporter;
import com.google.wallet.wobl.parser.xml.XmlAttribute;
import com.google.wallet.wobl.parser.xml.XmlElement;
import java.util.EnumSet;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractTagParser, AttributeParserType, Asserts, WoblParser

class BarcodeTagParser extends AbstractTagParser
{

    private static final int MAXIMUM_LENGTH_OF_DATA_RENDERED_AS_READABLE_CODE = 20;

    public BarcodeTagParser(WoblParser woblparser)
    {
        super(woblparser, EnumSet.of(AttributeParserType.BOX_STYLED, AttributeParserType.PADDING, AttributeParserType.Z_DEPTH, AttributeParserType.ALPHA));
    }

    public BarcodeIr onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        Object obj;
        String s;
        Asserts.requireAttributes(xmlelement, new String[] {
            "code", "type"
        });
        s = xmlelement.getAttribute("code").getString();
        com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType barcodetype = null;
        try
        {
            obj = com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.of(xmlelement.getAttribute("type").getString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Reporter.report(ReportLevel.WARN, ((com.google.wallet.wobl.exception.WoblException) (obj)));
            continue; /* Loop/switch isn't completed */
        }
        barcodetype = ((com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType) (obj));
_L6:
        obj = new BarcodeIr();
        ((BarcodeIr) (obj)).setBarcodeType(barcodetype);
        ((BarcodeIr) (obj)).setData(s);
        if (!xmlelement.hasAttribute("readable-code")) goto _L2; else goto _L1
_L1:
        ((BarcodeIr) (obj)).setReadableCode(xmlelement.getAttribute("readable-code").getString());
_L4:
        return ((BarcodeIr) (obj));
_L2:
        if (s.length() > 20) goto _L4; else goto _L3
_L3:
        ((BarcodeIr) (obj)).setReadableCode(s);
        return ((BarcodeIr) (obj));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public volatile IntermediateRepresentation onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        return onParse(xmlelement);
    }
}
