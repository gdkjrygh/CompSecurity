// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser.xml;

import com.google.common.base.MoreObjects;
import com.google.common.base.Strings;
import com.google.wallet.wobl.exception.WoblMalformedDocException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.wallet.wobl.parser.xml:
//            XmlAttribute

public class XmlTag
{

    private final Map attributes;
    private final boolean isStartTag;
    private final String tagName;

    public XmlTag(boolean flag, String s)
    {
        isStartTag = flag;
        tagName = s;
        attributes = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    }

    public Map getAllAttributes()
    {
        return Collections.unmodifiableMap(attributes);
    }

    public String getTagName()
    {
        return tagName;
    }

    public XmlAttribute getValue(String s)
    {
        return (XmlAttribute)attributes.get(s);
    }

    public XmlAttribute getValue(String s, Object obj)
    {
        XmlAttribute xmlattribute1 = getValue(s);
        XmlAttribute xmlattribute = xmlattribute1;
        if (xmlattribute1 == null)
        {
            xmlattribute = new XmlAttribute(s, obj.toString());
        }
        return xmlattribute;
    }

    public boolean hasAttribute(String s)
    {
        return attributes.containsKey(s);
    }

    public boolean isNameEqualTo(XmlTag xmltag)
    {
        return isNameEqualTo(xmltag.tagName);
    }

    public boolean isNameEqualTo(String s)
    {
        return tagName.equalsIgnoreCase(s);
    }

    public boolean isStartTag()
    {
        return isStartTag;
    }

    public void putAttribute(String s, String s1)
        throws WoblMalformedDocException
    {
        if (Strings.nullToEmpty(s1).trim().length() == 0)
        {
            return;
        }
        if (attributes.containsKey(s))
        {
            throw new WoblMalformedDocException((new StringBuilder(String.valueOf(s).length() + 48 + String.valueOf(s1).length())).append("Duplicate attribute key found - not allowed: [").append(s).append(":").append(s1).append("]").toString());
        } else
        {
            attributes.put(s, new XmlAttribute(s, s1));
            return;
        }
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(com/google/wallet/wobl/parser/xml/XmlTag).add("tagName", tagName).add("isStartTag", isStartTag()).add("attributes", attributes).toString();
    }
}
