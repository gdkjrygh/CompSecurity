// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class f
{

    public static HashMap a(String s)
        throws XmlPullParserException, IOException
    {
        Object obj = XmlPullParserFactory.newInstance();
        ((XmlPullParserFactory) (obj)).setNamespaceAware(true);
        obj = ((XmlPullParserFactory) (obj)).newPullParser();
        ((XmlPullParser) (obj)).setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        ((XmlPullParser) (obj)).setInput(new StringReader(s));
        ((XmlPullParser) (obj)).nextTag();
        ((XmlPullParser) (obj)).require(2, null, "methodResponse");
        return a(((XmlPullParser) (obj)));
    }

    private static HashMap a(XmlPullParser xmlpullparser)
        throws XmlPullParserException, IOException
    {
        HashMap hashmap = new HashMap();
        do
        {
            if (xmlpullparser.next() == 3 && !xmlpullparser.getName().equals("member"))
            {
                break;
            }
            if (xmlpullparser.getEventType() == 2)
            {
                String s = xmlpullparser.getName();
                if (!s.equals("methodResponse") && !s.equals("params") && !s.equals("param") && !s.equals("value") && !s.equals("struct"))
                {
                    if (s.equals("member"))
                    {
                        a(xmlpullparser, hashmap);
                    } else
                    {
                        c(xmlpullparser);
                    }
                }
            }
        } while (true);
        return hashmap;
    }

    private static void a(XmlPullParser xmlpullparser, HashMap hashmap)
        throws XmlPullParserException, IOException
    {
        String s1 = null;
        xmlpullparser.require(2, null, "member");
        String s = null;
        do
        {
            if (xmlpullparser.next() == 3)
            {
                break;
            }
            if (xmlpullparser.getEventType() == 2)
            {
                String s2 = xmlpullparser.getName();
                if (s2.equals("name"))
                {
                    s = b(xmlpullparser);
                } else
                if (s2.equals("value"))
                {
                    s1 = b(xmlpullparser, hashmap);
                } else
                {
                    c(xmlpullparser);
                }
            }
        } while (true);
        if (s != null)
        {
            hashmap.put(s, s1);
        }
    }

    private static String b(XmlPullParser xmlpullparser)
        throws IOException, XmlPullParserException
    {
        xmlpullparser.require(2, null, "name");
        String s = d(xmlpullparser);
        xmlpullparser.require(3, null, "name");
        return s;
    }

    private static String b(XmlPullParser xmlpullparser, HashMap hashmap)
        throws XmlPullParserException, IOException
    {
        Object obj = null;
        xmlpullparser.require(2, null, "value");
        do
        {
            String s;
label0:
            {
                s = obj;
                if (xmlpullparser.next() != 3)
                {
                    if (xmlpullparser.getEventType() != 2)
                    {
                        continue;
                    }
                    s = xmlpullparser.getName();
                    if (!s.equals("int"))
                    {
                        break label0;
                    }
                    s = d(xmlpullparser);
                }
                return s;
            }
            if (s.equals("string"))
            {
                return d(xmlpullparser);
            }
            if (s.equals("boolean"))
            {
                return d(xmlpullparser);
            }
            if (s.equals("struct"))
            {
                hashmap.putAll(a(xmlpullparser));
            } else
            {
                c(xmlpullparser);
            }
        } while (true);
    }

    private static void c(XmlPullParser xmlpullparser)
        throws XmlPullParserException, IOException
    {
        if (xmlpullparser.getEventType() != 2)
        {
            throw new IllegalStateException();
        }
        int i = 1;
        do
        {
            if (i == 0)
            {
                break;
            }
            switch (xmlpullparser.next())
            {
            case 2: // '\002'
                i++;
                break;

            case 3: // '\003'
                i--;
                break;
            }
        } while (true);
    }

    private static String d(XmlPullParser xmlpullparser)
        throws IOException, XmlPullParserException
    {
        String s = "";
        if (xmlpullparser.next() == 4)
        {
            s = xmlpullparser.getText();
            xmlpullparser.nextTag();
        }
        return s;
    }
}
