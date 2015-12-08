// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.parser.reporter.ReportLevel;
import com.google.wallet.wobl.parser.reporter.Reporter;
import com.google.wallet.wobl.parser.xml.XmlAttribute;
import com.google.wallet.wobl.parser.xml.XmlElement;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class WoblParserMetadata
{

    private String id;
    private String lang;
    private Map stylesheets;
    private String xmlns;

    WoblParserMetadata()
    {
        stylesheets = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    }

    public void clear()
    {
        id = null;
        lang = null;
        xmlns = null;
        stylesheets.clear();
    }

    public String getId()
    {
        return id;
    }

    public String getLang()
    {
        return lang;
    }

    public Map getStylesheets()
    {
        return Collections.unmodifiableMap(stylesheets);
    }

    public String getXmlns()
    {
        return xmlns;
    }

    public void parseStylesheet(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        if (xmlelement.isNameEqualTo("stylesheet"))
        {
            if (!stylesheets.isEmpty())
            {
                Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "More than one stylesheet element found - only the last one is effective.", new Object[0]);
                stylesheets.clear();
            }
            xmlelement = xmlelement.getAllChildren().iterator();
            while (xmlelement.hasNext()) 
            {
                XmlElement xmlelement1 = (XmlElement)xmlelement.next();
                if (!xmlelement1.isNameEqualTo("style"))
                {
                    Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "Expecting style tag in stylesheet, actual: %s.", new Object[] {
                        xmlelement1.toString()
                    });
                } else
                if (!xmlelement1.hasAttribute("class"))
                {
                    Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "Style tag must have class attribute, actual: %s.", new Object[] {
                        xmlelement1.toString()
                    });
                } else
                {
                    String s = xmlelement1.getAttribute("class").getString();
                    if (stylesheets.containsKey(s))
                    {
                        Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "Duplicate class name found: %s.", new Object[] {
                            s
                        });
                    }
                    TreeMap treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                    for (Iterator iterator = xmlelement1.getAllChildren().iterator(); iterator.hasNext();)
                    {
                        XmlElement xmlelement2 = (XmlElement)iterator.next();
                        if (!xmlelement2.isNameEqualTo("item") || !xmlelement2.hasText() || !xmlelement2.hasAttribute("name"))
                        {
                            Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "Ill-formed item tag in style class %s: %s.", new Object[] {
                                s, xmlelement2.toString()
                            });
                        } else
                        {
                            String s1 = xmlelement2.getAttribute("name").getString();
                            treemap.put(s1, new XmlAttribute(s1, xmlelement2.getText()));
                        }
                    }

                    stylesheets.put(xmlelement1.getAttribute("class").getString(), Collections.unmodifiableMap(treemap));
                }
            }
        }
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLang(String s)
    {
        lang = s;
    }

    public void setXmlns(String s)
    {
        xmlns = s;
    }
}
