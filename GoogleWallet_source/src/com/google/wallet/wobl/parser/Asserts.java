// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.parser.xml.XmlElement;

// Referenced classes of package com.google.wallet.wobl.parser:
//            Attributes, WoblParserMetadata

public class Asserts
{

    public Asserts()
    {
    }

    static transient void requireAttributes(XmlElement xmlelement, WoblParserMetadata woblparsermetadata, String as[])
        throws WoblMalformedDocException
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            if (Attributes.resolve(s, xmlelement, woblparsermetadata) == null)
            {
                xmlelement = String.valueOf(s);
                if (xmlelement.length() != 0)
                {
                    xmlelement = "Missing required attribute: ".concat(xmlelement);
                } else
                {
                    xmlelement = new String("Missing required attribute: ");
                }
                throw new WoblMalformedDocException(xmlelement);
            }
        }

    }

    static transient void requireAttributes(XmlElement xmlelement, String as[])
        throws WoblMalformedDocException
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            if (!xmlelement.hasAttribute(s))
            {
                xmlelement = String.valueOf(s);
                if (xmlelement.length() != 0)
                {
                    xmlelement = "Missing required attribute: ".concat(xmlelement);
                } else
                {
                    xmlelement = new String("Missing required attribute: ");
                }
                throw new WoblMalformedDocException(xmlelement);
            }
        }

    }
}
