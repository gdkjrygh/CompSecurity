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
//            AbstractAttributeParser, WoblParser, Attributes, AlphaAttributeParser

class TextStyleAttributeParser extends AbstractAttributeParser
{

    public TextStyleAttributeParser(WoblParser woblparser)
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
        XmlAttribute xmlattribute6 = Attributes.resolve("text-overflow", xmlelement, woblparsermetadata);
        XmlAttribute xmlattribute5 = Attributes.resolve("font-color", xmlelement, woblparsermetadata);
        XmlAttribute xmlattribute4 = Attributes.resolve("font-alpha", xmlelement, woblparsermetadata);
        XmlAttribute xmlattribute3 = Attributes.resolve("font-style", xmlelement, woblparsermetadata);
        XmlAttribute xmlattribute2 = Attributes.resolve("font-weight", xmlelement, woblparsermetadata);
        XmlAttribute xmlattribute1 = Attributes.resolve("font-family", xmlelement, woblparsermetadata);
        XmlAttribute xmlattribute = Attributes.resolve("font-size", xmlelement, woblparsermetadata);
        xmlelement = Attributes.resolve("text-transform", xmlelement, woblparsermetadata);
        if (xmlattribute6 != null)
        {
            try
            {
                textir.setTextOverflow(com.google.wallet.wobl.intermediaterepresentation.TextIr.TextOverflow.of(xmlattribute6.getString()));
            }
            catch (WoblMalformedDocException woblmalformeddocexception6)
            {
                Reporter.report(ReportLevel.WARN, woblmalformeddocexception6);
            }
        }
        if (xmlattribute5 != null)
        {
            try
            {
                textir.setTextColor(xmlattribute5.getColor());
            }
            catch (WoblMalformedDocException woblmalformeddocexception5)
            {
                Reporter.report(ReportLevel.WARN, woblmalformeddocexception5);
            }
        }
        if (xmlattribute4 != null)
        {
            try
            {
                textir.setTextColorAlpha(AlphaAttributeParser.parse(xmlattribute4.getString()));
            }
            catch (WoblMalformedDocException woblmalformeddocexception4)
            {
                Reporter.report(ReportLevel.WARN, woblmalformeddocexception4);
            }
        }
        if (xmlattribute3 != null)
        {
            try
            {
                textir.setFontStyle(com.google.wallet.wobl.intermediaterepresentation.TextIr.FontStyle.of(xmlattribute3.getString()));
            }
            catch (WoblMalformedDocException woblmalformeddocexception3)
            {
                Reporter.report(ReportLevel.WARN, woblmalformeddocexception3);
            }
        }
        if (xmlattribute2 != null)
        {
            try
            {
                textir.setFontWeight(com.google.wallet.wobl.intermediaterepresentation.TextIr.FontWeight.of(xmlattribute2.getString()));
            }
            catch (WoblMalformedDocException woblmalformeddocexception2)
            {
                Reporter.report(ReportLevel.WARN, woblmalformeddocexception2);
            }
        }
        if (xmlattribute1 != null)
        {
            try
            {
                textir.setFontFamily(com.google.wallet.wobl.intermediaterepresentation.TextIr.FontFamily.of(xmlattribute1.getString()));
            }
            catch (WoblMalformedDocException woblmalformeddocexception1)
            {
                Reporter.report(ReportLevel.WARN, woblmalformeddocexception1);
            }
        }
        if (xmlattribute != null)
        {
            try
            {
                textir.setFontSize(xmlattribute.getValueWithDisplayUnit());
            }
            catch (WoblMalformedDocException woblmalformeddocexception)
            {
                Reporter.report(ReportLevel.WARN, woblmalformeddocexception);
            }
        }
        if (xmlelement == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        textir.setTextTransform(com.google.wallet.wobl.intermediaterepresentation.TextIr.TextTransform.of(xmlelement.getString()));
        return;
        textir;
        Reporter.report(ReportLevel.WARN, textir);
        return;
    }

    String capitalize(String s)
    {
        if (s == null || s.length() == 0)
        {
            return s;
        }
        int j = s.length();
        StringBuffer stringbuffer = new StringBuffer(j);
        boolean flag = true;
        int i = 0;
        while (i < j) 
        {
            char c = s.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '_')
            {
                stringbuffer.append(c);
                flag = true;
            } else
            if (flag)
            {
                stringbuffer.append(Character.toTitleCase(c));
                flag = false;
            } else
            {
                stringbuffer.append(c);
            }
            i++;
        }
        return stringbuffer.toString();
    }
}
