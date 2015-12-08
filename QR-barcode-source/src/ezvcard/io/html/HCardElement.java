// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.html;

import ezvcard.util.HtmlUtils;
import ezvcard.util.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

public class HCardElement
{

    private final Element element;

    public HCardElement(Element element1)
    {
        element = element1;
    }

    private String value(Element element1)
    {
        StringBuilder stringbuilder;
        Elements elements;
        if ("abbr".equals(element1.tagName()))
        {
            String s = element1.attr("title");
            if (s.length() > 0)
            {
                return s;
            }
        }
        stringbuilder = new StringBuilder();
        elements = element1.getElementsByClass("value");
        if (!elements.isEmpty()) goto _L2; else goto _L1
_L1:
        visitForValue(element1, stringbuilder);
_L7:
        return stringbuilder.toString().trim();
_L2:
        element1 = elements.iterator();
_L5:
        Element element2;
        while (element1.hasNext()) 
        {
            element2 = (Element)element1.next();
            if (!HtmlUtils.isChildOf(element2, elements))
            {
label0:
                {
                    if (!"abbr".equals(element2.tagName()))
                    {
                        break label0;
                    }
                    String s1 = element2.attr("title");
                    if (s1.length() <= 0)
                    {
                        break label0;
                    }
                    stringbuilder.append(s1);
                }
            }
        }
          goto _L3
        visitForValue(element2, stringbuilder);
        if (true) goto _L5; else goto _L4
_L4:
_L3:
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void visitForValue(Element element1, StringBuilder stringbuilder)
    {
        element1 = element1.childNodes().iterator();
        do
        {
            if (!element1.hasNext())
            {
                break;
            }
            Object obj = (Node)element1.next();
            if (obj instanceof Element)
            {
                obj = (Element)obj;
                if (!((Element) (obj)).classNames().contains("type"))
                {
                    if ("br".equals(((Element) (obj)).tagName()))
                    {
                        stringbuilder.append(StringUtils.NEWLINE);
                    } else
                    if (!"del".equals(((Element) (obj)).tagName()))
                    {
                        visitForValue(((Element) (obj)), stringbuilder);
                    }
                }
            } else
            if (obj instanceof TextNode)
            {
                stringbuilder.append(((TextNode)obj).text());
            }
        } while (true);
    }

    public String absUrl(String s)
    {
        String s2 = element.absUrl(s);
        String s1 = s2;
        if (s2.length() == 0)
        {
            s1 = element.attr(s);
        }
        return s1;
    }

    public List allValues(String s)
    {
        Object obj = element.getElementsByClass(s);
        s = new ArrayList(((Elements) (obj)).size());
        for (obj = ((Elements) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.add(value((Element)((Iterator) (obj)).next()))) { }
        return s;
    }

    public void append(String s)
    {
        s = s.split("\\r\\n|\\n|\\r");
        if (s[0].length() > 0)
        {
            element.appendText(s[0]);
        }
        for (int i = 1; i < s.length; i++)
        {
            String s1 = s[i];
            element.appendElement("br");
            if (s1.length() > 0)
            {
                element.appendText(s1);
            }
        }

    }

    public String attr(String s)
    {
        return element.attr(s);
    }

    public Set classNames()
    {
        return element.classNames();
    }

    public String firstValue(String s)
    {
        s = element.getElementsByClass(s);
        if (s.isEmpty())
        {
            return null;
        } else
        {
            return value(s.first());
        }
    }

    public Element getElement()
    {
        return element;
    }

    public String tagName()
    {
        return element.tagName();
    }

    public List types()
    {
        List list = allValues("type");
        for (int i = 0; i < list.size(); i++)
        {
            list.set(i, ((String)list.get(i)).toLowerCase());
        }

        return list;
    }

    public String value()
    {
        return value(element);
    }
}
