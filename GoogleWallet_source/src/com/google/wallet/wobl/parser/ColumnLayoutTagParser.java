// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.wallet.wobl.common.DisplayUnit;
import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.ColumnLayoutIr;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.parser.reporter.ReportLevel;
import com.google.wallet.wobl.parser.reporter.Reporter;
import com.google.wallet.wobl.parser.xml.XmlAttribute;
import com.google.wallet.wobl.parser.xml.XmlElement;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractTagParser, AttributeParserType, WoblParser

class ColumnLayoutTagParser extends AbstractTagParser
{

    public ColumnLayoutTagParser(WoblParser woblparser)
    {
        super(woblparser, EnumSet.of(AttributeParserType.BOX_STYLED, AttributeParserType.TAP_TARGET, AttributeParserType.PADDING, AttributeParserType.Z_DEPTH));
    }

    private int sanitizeAtLowerBound(int i, int j, String s)
        throws WoblMalformedDocException
    {
        if (i < j)
        {
            Reporter.report(ReportLevel.WARN, new WoblMalformedDocException(s));
            return j;
        } else
        {
            return i;
        }
    }

    protected ColumnLayoutIr onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        ColumnLayoutIr columnlayoutir;
        columnlayoutir = new ColumnLayoutIr();
        boolean flag = xmlelement.hasAttribute("num-columns");
        boolean flag1 = xmlelement.hasAttribute("column-widths");
        if (!flag && !flag1)
        {
            throw new WoblMalformedDocException("Either numColumns or columnWidths must be specified.");
        }
        if (flag && flag1)
        {
            Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "Both num-columns and column-widths are specified. Ignoring num-columns value.", new Object[0]);
        }
        Object obj;
        Iterator iterator;
        XmlElement xmlelement1;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        if (flag)
        {
            int i = xmlelement.getAttribute("num-columns").getPositiveInteger();
            DisplayUnit adisplayunit[] = new DisplayUnit[i];
            Arrays.fill(adisplayunit, DisplayUnit.of(1.0F / (float)i, com.google.wallet.wobl.common.DisplayUnit.Unit.WEIGHT));
            obj = Arrays.asList(adisplayunit);
        } else
        {
            obj = xmlelement.getAttribute("column-widths").getValueWithDisplayUnitList();
        }
        columnlayoutir.setColumnWidths(((List) (obj)));
        k = ((List) (obj)).size() - 1;
        iterator = xmlelement.getAllChildren().iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        xmlelement1 = (XmlElement)iterator.next();
        xmlelement = null;
        obj = getWoblParser().parseElement(xmlelement1);
        xmlelement = ((XmlElement) (obj));
_L3:
        if (xmlelement != null)
        {
            i1 = xmlelement1.getAttribute("row", Integer.valueOf(0)).getInteger();
            j1 = xmlelement1.getAttribute("row-span", Integer.valueOf(1)).getInteger();
            l = xmlelement1.getAttribute("column", Integer.valueOf(0)).getInteger();
            j = l;
            if (l > k)
            {
                Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "column attribute of %s is larger than the maximum index of %d", new Object[] {
                    Integer.valueOf(l), Integer.valueOf(k)
                });
                j = k;
            }
            l = xmlelement1.getAttribute("column-span", Integer.valueOf(1)).getInteger();
            i1 = sanitizeAtLowerBound(i1, 0, "Row number must be non-negative");
            k1 = sanitizeAtLowerBound(j, 0, "Column number must be non-negative");
            j1 = sanitizeAtLowerBound(j1, 1, "Attribute row-span must be positive");
            l = sanitizeAtLowerBound(l, 1, "Attribute row-span must be positive");
            j = l;
            if ((k1 + l) - 1 > k)
            {
                Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "column-span attribute of %d for column %d extends past the maximum index column index of %d", new Object[] {
                    Integer.valueOf(l), Integer.valueOf(k1), Integer.valueOf(k)
                });
                j = (k - k1) + 1;
            }
            xmlelement.setRendererLayoutParams(new com.google.wallet.wobl.intermediaterepresentation.ColumnLayoutIr.ColumnLayoutRendererLayoutParams(k1, i1, j, j1));
            columnlayoutir.addChild(xmlelement);
        }
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        Reporter.report(ReportLevel.WARN, ((com.google.wallet.wobl.exception.WoblException) (obj1)));
        continue; /* Loop/switch isn't completed */
        obj1;
        Reporter.report(ReportLevel.WARN, new WoblMalformedDocException("Unhandled exception in column layout child", ((Throwable) (obj1))));
        if (true) goto _L3; else goto _L2
_L2:
        return columnlayoutir;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected volatile IntermediateRepresentation onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        return onParse(xmlelement);
    }
}
