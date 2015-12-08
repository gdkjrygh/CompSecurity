// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.util.Xml;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.amazon.device.associates:
//            bk, bx

public class as extends bk
{

    private static final String b = null;
    private bx a;

    public as()
    {
        a = new bx();
    }

    private void b(XmlPullParser xmlpullparser)
        throws IOException, XmlPullParserException
    {
        xmlpullparser.require(2, b, "sortParamterMap");
        do
        {
            if (xmlpullparser.next() == 3)
            {
                break;
            }
            if (xmlpullparser.getEventType() == 2)
            {
                if (xmlpullparser.getName().equals("entry"))
                {
                    d(xmlpullparser);
                } else
                {
                    a(xmlpullparser);
                }
            }
        } while (true);
    }

    private void c(XmlPullParser xmlpullparser)
        throws IOException, XmlPullParserException
    {
        xmlpullparser.require(2, b, "searchAliasMap");
        do
        {
            if (xmlpullparser.next() == 3)
            {
                break;
            }
            if (xmlpullparser.getEventType() == 2)
            {
                if (xmlpullparser.getName().equals("entry"))
                {
                    e(xmlpullparser);
                } else
                {
                    a(xmlpullparser);
                }
            }
        } while (true);
    }

    private void d(XmlPullParser xmlpullparser)
        throws IOException, XmlPullParserException
    {
        String s1 = null;
        xmlpullparser.require(2, b, "entry");
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
                if (s2.equals("key"))
                {
                    s = a(xmlpullparser, s2);
                } else
                if (s2.equals("value"))
                {
                    s1 = a(xmlpullparser, s2);
                } else
                {
                    a(xmlpullparser);
                }
            }
        } while (true);
        a.a(s, s1);
    }

    private void e(XmlPullParser xmlpullparser)
        throws IOException, XmlPullParserException
    {
        String s1 = null;
        xmlpullparser.require(2, b, "entry");
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
                if (s2.equals("key"))
                {
                    s = a(xmlpullparser, s2);
                } else
                if (s2.equals("value"))
                {
                    s1 = a(xmlpullparser, s2);
                } else
                {
                    a(xmlpullparser);
                }
            }
        } while (true);
        a.b(s, s1);
    }

    private void f(XmlPullParser xmlpullparser)
        throws XmlPullParserException, IOException
    {
        xmlpullparser.require(2, b, "GetCategorySearchDetailsOutput");
        do
        {
            if (xmlpullparser.next() == 3)
            {
                break;
            }
            if (xmlpullparser.getEventType() == 2)
            {
                String s = xmlpullparser.getName();
                if (s.equals("sortParamterMap"))
                {
                    b(xmlpullparser);
                } else
                if (s.equals("searchAliasMap"))
                {
                    c(xmlpullparser);
                } else
                {
                    a(xmlpullparser);
                }
            }
        } while (true);
    }

    public volatile long a(String s)
    {
        return super.a(s);
    }

    public bx a(InputStream inputstream)
        throws XmlPullParserException, IOException
    {
        Object obj;
        obj = Xml.newPullParser();
        ((XmlPullParser) (obj)).setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        ((XmlPullParser) (obj)).setInput(inputstream, null);
        ((XmlPullParser) (obj)).nextTag();
        f(((XmlPullParser) (obj)));
        obj = a;
        inputstream.close();
        return ((bx) (obj));
        Exception exception;
        exception;
        inputstream.close();
        throw exception;
    }

    public volatile String a(String s, String s1)
    {
        return super.a(s, s1);
    }

    public volatile String b(String s)
    {
        return super.b(s);
    }

    public volatile int c(String s)
    {
        return super.c(s);
    }

}
