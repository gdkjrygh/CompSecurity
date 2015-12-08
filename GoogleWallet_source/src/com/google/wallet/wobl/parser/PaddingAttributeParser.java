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
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractAttributeParser, WoblParser, Attributes

class PaddingAttributeParser extends AbstractAttributeParser
{
    static class Padding
    {

        DisplayUnit bottom;
        DisplayUnit left;
        DisplayUnit right;
        DisplayUnit top;

        private Padding()
        {
            top = DisplayUnit.ZERO;
            right = DisplayUnit.ZERO;
            bottom = DisplayUnit.ZERO;
            left = DisplayUnit.ZERO;
        }

    }


    public PaddingAttributeParser(WoblParser woblparser)
    {
        super(woblparser);
    }

    private void addHigherPrecedencePadding(Padding padding, XmlAttribute xmlattribute, XmlAttribute xmlattribute1, XmlAttribute xmlattribute2, XmlAttribute xmlattribute3, XmlAttribute xmlattribute4)
        throws WoblMalformedDocException
    {
        if (xmlattribute != null)
        {
            List list = xmlattribute.getValueWithDisplayUnitList();
            for (int i = 0; i < list.size(); i++)
            {
                if (((DisplayUnit)list.get(i)).getUnitType() == com.google.wallet.wobl.common.DisplayUnit.Unit.WEIGHT)
                {
                    Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "Padding values should not contain weight: %s", new Object[] {
                        xmlattribute.getString()
                    });
                    list.set(i, DisplayUnit.ZERO);
                }
            }

            if (list.size() > 4)
            {
                Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "More than 4 values in padding attribute: %s", new Object[] {
                    xmlattribute.getString()
                });
            }
            if (list.size() >= 4)
            {
                padding.top = (DisplayUnit)list.get(0);
                padding.right = (DisplayUnit)list.get(1);
                padding.bottom = (DisplayUnit)list.get(2);
                padding.left = (DisplayUnit)list.get(3);
            } else
            {
                Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "Less than 4 values in padding attribute: %s", new Object[] {
                    xmlattribute.getString()
                });
            }
        }
        padding.top = getDisplayUnit(xmlattribute1, padding.top);
        padding.right = getDisplayUnit(xmlattribute2, padding.right);
        padding.bottom = getDisplayUnit(xmlattribute3, padding.bottom);
        padding.left = getDisplayUnit(xmlattribute4, padding.left);
    }

    private static DisplayUnit getDisplayUnit(XmlAttribute xmlattribute, DisplayUnit displayunit)
    {
        if (xmlattribute == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        com.google.wallet.wobl.common.DisplayUnit.Unit unit;
        com.google.wallet.wobl.common.DisplayUnit.Unit unit1;
        xmlattribute = xmlattribute.getValueWithDisplayUnit();
        unit = xmlattribute.getUnitType();
        unit1 = com.google.wallet.wobl.common.DisplayUnit.Unit.WEIGHT;
        if (unit != unit1)
        {
            return xmlattribute;
        }
        break MISSING_BLOCK_LABEL_26;
        xmlattribute;
        return displayunit;
    }

    private void setHorizontalAlignment(IntermediateRepresentation intermediaterepresentation, XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        WoblParserMetadata woblparsermetadata = getWoblParser().getMetadata();
        String s = "start";
        if (Attributes.resolve("horizontal-align", xmlelement, woblparsermetadata) != null)
        {
            s = Attributes.resolve("horizontal-align", xmlelement, woblparsermetadata).getString();
        }
        if (s.equals("start"))
        {
            if (getWoblParser().isRtlLanguage())
            {
                xmlelement = "right";
            } else
            {
                xmlelement = "left";
            }
        } else
        {
            xmlelement = s;
            if (s.equals("end"))
            {
                if (getWoblParser().isRtlLanguage())
                {
                    xmlelement = "left";
                } else
                {
                    xmlelement = "right";
                }
            }
        }
        try
        {
            intermediaterepresentation.setHorizontalAlign(com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.HorizontalAlign.of(xmlelement));
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "Invalid horizontal-align: %s", new Object[] {
                xmlelement
            });
        }
        intermediaterepresentation.setHorizontalAlign(com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.HorizontalAlign.LEFT);
    }

    private void setPadding(IntermediateRepresentation intermediaterepresentation, XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        WoblParserMetadata woblparsermetadata = getWoblParser().getMetadata();
        Padding padding = new Padding();
        String s;
        for (Iterator iterator = Attributes.getClassAttribute(xmlelement).iterator(); iterator.hasNext(); addHigherPrecedencePadding(padding, Attributes.getFromStylesheet("padding", s, woblparsermetadata), Attributes.getFromStylesheet("padding-top", s, woblparsermetadata), Attributes.getFromStylesheet("padding-right", s, woblparsermetadata), Attributes.getFromStylesheet("padding-bottom", s, woblparsermetadata), Attributes.getFromStylesheet("padding-left", s, woblparsermetadata)))
        {
            s = (String)iterator.next();
        }

        addHigherPrecedencePadding(padding, xmlelement.getAttribute("padding"), xmlelement.getAttribute("padding-top"), xmlelement.getAttribute("padding-right"), xmlelement.getAttribute("padding-bottom"), xmlelement.getAttribute("padding-left"));
        intermediaterepresentation.setPaddings(padding.top, padding.right, padding.bottom, padding.left);
    }

    private void setVerticalAlignment(IntermediateRepresentation intermediaterepresentation, XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        Object obj = getWoblParser().getMetadata();
        com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.VerticalAlign verticalalign = com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.VerticalAlign.TOP;
        obj = Attributes.resolve("vertical-align", xmlelement, ((WoblParserMetadata) (obj)));
        xmlelement = verticalalign;
        if (obj != null)
        {
            try
            {
                xmlelement = com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.VerticalAlign.of(((XmlAttribute) (obj)).getString());
            }
            // Misplaced declaration of an exception variable
            catch (XmlElement xmlelement)
            {
                Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "Invalid vertical-align: %s", new Object[] {
                    ((XmlAttribute) (obj)).getString()
                });
                xmlelement = verticalalign;
            }
        }
        intermediaterepresentation.setVerticalAlign(xmlelement);
    }

    public void applyAttributesToIr(IntermediateRepresentation intermediaterepresentation, XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        setPadding(intermediaterepresentation, xmlelement);
        setVerticalAlignment(intermediaterepresentation, xmlelement);
        setHorizontalAlignment(intermediaterepresentation, xmlelement);
    }
}
