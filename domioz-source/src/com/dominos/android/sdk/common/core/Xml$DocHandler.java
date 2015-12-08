// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.core;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

// Referenced classes of package com.dominos.android.sdk.common.core:
//            Xml

class <init> extends DefaultHandler
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

    public void characters(char ac[], int i, int j)
    {
        if (name != null)
        {
            if (text == null)
            {
                ac = Xml.decode(new String(ac, i, j));
            } else
            {
                ac = (new StringBuilder()).append(text).append(Xml.decode(new String(ac, i, j))).toString();
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
            int i = 0;
            while (i < attributes1.getLength()) 
            {
                s = cleanName("", attributes1.getQName(i));
                attributes.put((new StringBuilder("@")).append(s).toString(), attributes1.getValue(i));
                i++;
            }
        }
    }

    private ()
    {
        keepAttibutesOnTextElement = false;
        stack = new LinkedList();
        top = new LinkedHashMap();
    }

    top(top top1)
    {
        this();
    }
}
