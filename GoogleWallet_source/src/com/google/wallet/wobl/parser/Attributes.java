// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.parser.reporter.ReportLevel;
import com.google.wallet.wobl.parser.reporter.Reporter;
import com.google.wallet.wobl.parser.xml.XmlAttribute;
import com.google.wallet.wobl.parser.xml.XmlElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.wallet.wobl.parser:
//            WoblParserMetadata

public class Attributes
{

    private static final String WHITESPACE_REGEX = "\\s+";

    public Attributes()
    {
    }

    static List getClassAttribute(XmlElement xmlelement)
    {
        if (!xmlelement.hasAttribute("class"))
        {
            return new ArrayList();
        } else
        {
            return Arrays.asList(xmlelement.getAttribute("class").getString().split("\\s+"));
        }
    }

    static XmlAttribute getFromStylesheet(String s, String s1, WoblParserMetadata woblparsermetadata)
        throws WoblMalformedDocException
    {
        if (!woblparsermetadata.getStylesheets().containsKey(s1))
        {
            Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "%s is referring to a non-existing style class: %s.", new Object[] {
                s, s1
            });
            return null;
        } else
        {
            return (XmlAttribute)((Map)woblparsermetadata.getStylesheets().get(s1)).get(s);
        }
    }

    static XmlAttribute resolve(String s, XmlElement xmlelement, WoblParserMetadata woblparsermetadata)
        throws WoblMalformedDocException
    {
        if (!xmlelement.hasAttribute(s)) goto _L2; else goto _L1
_L1:
        Object obj = xmlelement.getAttribute(s);
_L4:
        return ((XmlAttribute) (obj));
_L2:
        obj = getClassAttribute(xmlelement);
        xmlelement = null;
        Iterator iterator = ((List) (obj)).iterator();
        do
        {
            obj = xmlelement;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = getFromStylesheet(s, (String)iterator.next(), woblparsermetadata);
            if (obj != null)
            {
                xmlelement = ((XmlElement) (obj));
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
