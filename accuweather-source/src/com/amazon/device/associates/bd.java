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
//            bk, i

public class bd extends bk
{

    private static final String b = null;
    private i a;

    public bd()
    {
        a = new i();
    }

    private void b(XmlPullParser xmlpullparser)
        throws IOException, XmlPullParserException
    {
        xmlpullparser.require(2, b, "templateList");
        do
        {
            if (xmlpullparser.next() == 3)
            {
                break;
            }
            if (xmlpullparser.getEventType() == 2)
            {
                if (xmlpullparser.getName().equals("member"))
                {
                    c(xmlpullparser);
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
        String s1 = null;
        xmlpullparser.require(2, b, "member");
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
                if (s2.equals("templateURL"))
                {
                    s = a(xmlpullparser, s2);
                } else
                if (s2.equals("templateName"))
                {
                    s1 = a(xmlpullparser, s2);
                } else
                {
                    a(xmlpullparser);
                }
            }
        } while (true);
        a.a(s1, s);
    }

    private void d(XmlPullParser xmlpullparser)
        throws XmlPullParserException, IOException
    {
        xmlpullparser.require(2, b, "URLTemplatesOutput");
        do
        {
            if (xmlpullparser.next() == 3)
            {
                break;
            }
            if (xmlpullparser.getEventType() == 2)
            {
                if (xmlpullparser.getName().equals("templateList"))
                {
                    b(xmlpullparser);
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

    public i a(InputStream inputstream)
        throws XmlPullParserException, IOException
    {
        Object obj;
        obj = Xml.newPullParser();
        ((XmlPullParser) (obj)).setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        ((XmlPullParser) (obj)).setInput(inputstream, null);
        ((XmlPullParser) (obj)).nextTag();
        d(((XmlPullParser) (obj)));
        obj = a;
        inputstream.close();
        return ((i) (obj));
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
