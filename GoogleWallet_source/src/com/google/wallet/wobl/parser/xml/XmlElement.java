// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser.xml;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.wallet.wobl.exception.WoblMalformedDocException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.wallet.wobl.parser.xml:
//            XmlTag, XmlAttribute

public class XmlElement
{

    private static final String INTERNAL_WRAP_TEXT_TAG_NAME = "woblInternalText";
    private final List children = new ArrayList();
    private XmlTag endTag;
    private final XmlTag startTag;
    private String text;

    public XmlElement(XmlTag xmltag)
    {
        startTag = xmltag;
    }

    public static XmlElement newInternalTextElement(String s)
    {
        XmlElement xmlelement = new XmlElement(new XmlTag(true, "woblInternalText"));
        xmlelement.text = s;
        xmlelement.endTag = new XmlTag(false, "woblInternalText");
        return xmlelement;
    }

    public void addChild(XmlElement xmlelement)
    {
        boolean flag;
        if (endTag == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        children.add(xmlelement);
    }

    public Map getAllAttributes()
    {
        return startTag.getAllAttributes();
    }

    public List getAllChildren()
    {
        return Collections.unmodifiableList(children);
    }

    public XmlAttribute getAttribute(String s)
    {
        return startTag.getValue(s);
    }

    public XmlAttribute getAttribute(String s, Object obj)
    {
        return startTag.getValue(s, obj);
    }

    public int getChildrenCount()
    {
        return children.size();
    }

    public XmlTag getEndTag()
    {
        return endTag;
    }

    public XmlTag getStartTag()
    {
        return startTag;
    }

    public String getTagName()
    {
        return startTag.getTagName();
    }

    public String getText()
    {
        if (isInternalTextElement())
        {
            return text;
        }
        if (children.size() == 1 && ((XmlElement)children.get(0)).isInternalTextElement())
        {
            return ((XmlElement)children.get(0)).getText();
        } else
        {
            return null;
        }
    }

    public boolean hasAttribute(String s)
    {
        return startTag.hasAttribute(s);
    }

    public boolean hasEndTag()
    {
        return endTag != null;
    }

    public boolean hasText()
    {
        if (isInternalTextElement())
        {
            return !Strings.isNullOrEmpty(text);
        }
        if (children.size() == 1 && ((XmlElement)children.get(0)).isInternalTextElement())
        {
            return ((XmlElement)children.get(0)).hasText();
        } else
        {
            return false;
        }
    }

    public boolean isInternalTextElement()
    {
        return startTag.getTagName().equals("woblInternalText");
    }

    public boolean isNameEqualTo(XmlTag xmltag)
    {
        return startTag.isNameEqualTo(xmltag);
    }

    public boolean isNameEqualTo(String s)
    {
        return startTag.isNameEqualTo(s);
    }

    public void setEndTag(XmlTag xmltag)
        throws WoblMalformedDocException
    {
        if (!startTag.getTagName().equals(xmltag.getTagName()))
        {
            xmltag = xmltag.getTagName();
            String s = startTag.getTagName();
            throw new WoblMalformedDocException((new StringBuilder(String.valueOf(xmltag).length() + 44 + String.valueOf(s).length())).append("unexpected end tag name ").append(xmltag).append(", start tag name is ").append(s).toString());
        } else
        {
            endTag = xmltag;
            return;
        }
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(com/google/wallet/wobl/parser/xml/XmlElement).add("startTag", startTag).add("children", children).add("text", getText()).add("endTag", endTag).toString();
    }
}
