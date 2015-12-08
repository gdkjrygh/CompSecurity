// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.core;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.a.a.a.i;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

// Referenced classes of package com.dominos.android.sdk.common.core:
//            DpzIOException

public class Xml
{

    private Xml()
    {
    }

    public static String decode(String s)
    {
        return s.replace("&quot;", "\"").replace("&gt;", ">").replace("&lt;", "<").replace("&amp;", "&");
    }

    public static String encode(Object obj)
    {
        return i.a(obj, "").replace("\"", "&quot;").replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
    }

    public static Map parse(String s)
    {
        return parse(s, true);
    }

    public static Map parse(String s, boolean flag)
    {
        DocHandler dochandler = new DocHandler(null);
        dochandler.keepAttibutesOnTextElement = flag;
        SAXParserFactory.newInstance().newSAXParser().parse(new InputSource(new StringReader(s)), dochandler);
        s = dochandler.top;
        return s;
        s;
_L2:
        throw new RuntimeException(s);
        s;
        throw new DpzIOException(s);
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String toString(Object obj)
    {
        return (new XmlBuilder(null)).appendHeader().append(obj).toString();
    }

    private class DocHandler extends DefaultHandler
    {

        public Map attributes;
        public boolean keepAttibutesOnTextElement;
        public String name;
        public LinkedList stack;
        public String text;
        public Map top;

        private static String cleanName(String s, String s1)
        {
            if (s.length() == 0)
            {
                if (s1.startsWith("xmlns:"))
                {
                    return s1;
                } else
                {
                    return s1.substring(s1.indexOf(':') + 1);
                }
            } else
            {
                return s;
            }
        }

        private void put(String s, Object obj)
        {
            if (!top.containsKey(s))
            {
                top.put(s, obj);
                return;
            }
            if (top.get(s) instanceof List)
            {
                ((List)top.get(s)).add(obj);
                return;
            } else
            {
                LinkedList linkedlist = new LinkedList();
                linkedlist.add(top.get(s));
                linkedlist.add(obj);
                top.put(s, linkedlist);
                return;
            }
        }

        public void characters(char ac[], int j, int k)
        {
            if (name != null)
            {
                if (text == null)
                {
                    ac = Xml.decode(new String(ac, j, k));
                } else
                {
                    ac = (new StringBuilder()).append(text).append(Xml.decode(new String(ac, j, k))).toString();
                }
                text = ac;
            }
        }

        public void endElement(String s, String s1, String s2)
        {
            if (name == null)
            {
                top = (Map)stack.removeFirst();
                return;
            }
            s1 = text;
            s = s1;
            if (attributes != null)
            {
                s = s1;
                if (keepAttibutesOnTextElement)
                {
                    attributes.put("_text", text);
                    s = attributes;
                }
            }
            put(name, s);
            text = null;
            name = null;
            attributes = null;
        }

        public void startElement(String s, String s1, String s2, Attributes attributes1)
        {
            if (name != null)
            {
                if (attributes != null)
                {
                    s = attributes;
                } else
                {
                    s = new LinkedHashMap();
                }
                put(name, s);
                stack.addFirst(top);
                top = s;
            }
            name = cleanName(s1, s2);
            text = null;
            if (attributes1 == null || attributes1.getLength() == 0)
            {
                attributes = null;
            } else
            {
                attributes = new LinkedHashMap();
                int j = 0;
                while (j < attributes1.getLength()) 
                {
                    s = cleanName("", attributes1.getQName(j));
                    attributes.put((new StringBuilder("@")).append(s).toString(), attributes1.getValue(j));
                    j++;
                }
            }
        }

        private DocHandler()
        {
            keepAttibutesOnTextElement = false;
            stack = new LinkedList();
            top = new LinkedHashMap();
        }

        DocHandler(_cls1 _pcls1)
        {
            this();
        }
    }


    private class XmlBuilder
    {

        private a builder;

        private void appendListElement(String s, List list)
        {
            for (list = list.iterator(); list.hasNext(); appendElement(s, list.next())) { }
        }

        private void appendMapElement(String s, Map map)
        {
            builder.a("<").a(s);
            Iterator iterator = map.entrySet().iterator();
            String s1 = null;
            boolean flag = false;
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                String s2 = (String)entry.getKey();
                if (s2.startsWith("@"))
                {
                    builder.a(" ").a(s2.substring(1)).a("=\"").a(Xml.encode(entry.getValue())).a("\"");
                } else
                if ("_text".equals(s2))
                {
                    s1 = Xml.encode(entry.getValue());
                } else
                {
                    flag = true;
                }
            }
            if (flag)
            {
                builder.a(">");
                appendChildElements(map);
                builder.a("</").a(s).a(">");
                return;
            }
            if (StringHelper.isEmpty(s1))
            {
                builder.a("/>");
                return;
            } else
            {
                builder.a(">").a(s1).a("</").a(s).a(">");
                return;
            }
        }

        public XmlBuilder append(Object obj)
        {
            if (obj instanceof Map)
            {
                appendChildElements((Map)obj);
                return this;
            } else
            {
                builder.a(Xml.encode(obj));
                return this;
            }
        }

        public XmlBuilder appendChildElements(Map map)
        {
            map = map.entrySet().iterator();
            do
            {
                if (!map.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                if (!((String)entry.getKey()).startsWith("@"))
                {
                    appendElement((String)entry.getKey(), entry.getValue());
                }
            } while (true);
            return this;
        }

        public XmlBuilder appendElement(String s, Object obj)
        {
            if (obj instanceof Map)
            {
                appendMapElement(s, (Map)obj);
                return this;
            }
            if (obj instanceof List)
            {
                appendListElement(s, (List)obj);
                return this;
            }
            if (StringHelper.isEmpty(i.a(obj)))
            {
                builder.a("<").a(s).a("/>");
                return this;
            } else
            {
                builder.a("<").a(s).a(">").a(Xml.encode(obj)).a("</").a(s).a(">");
                return this;
            }
        }

        public XmlBuilder appendHeader()
        {
            builder.a("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            return this;
        }

        public String toString()
        {
            return builder.toString();
        }

        private XmlBuilder()
        {
            builder = new a();
        }

        XmlBuilder(_cls1 _pcls1)
        {
            this();
        }
    }

}
