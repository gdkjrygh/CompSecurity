// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

// Referenced classes of package com.amazon.device.associates:
//            p

class bk
{

    private static final String a = null;

    bk()
    {
    }

    private String b(XmlPullParser xmlpullparser)
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

    public long a(String s)
    {
        s = (new bk()).a("cacheRefreshRate", s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        long l;
        p.c("XMLParser", (new StringBuilder()).append("CacheRefreshRate returned by service:").append(s).append("secs").toString());
        l = Long.parseLong(s);
        return l * 1000L;
        s;
        p.a("XMLParser", "CacheRefreshRate parsing seems to be failed. Ex=", new Object[] {
            s
        });
        p.a("XMLParser", "CacheRefreshRate parsing seems to be failed. Hence returning -1");
        return -1L;
    }

    public String a(String s, String s1)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = obj1;
        if (s == null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (s1 == null) goto _L2; else goto _L3
_L3:
        obj = obj1;
        if ("".equals(s)) goto _L2; else goto _L4
_L4:
        if (!"".equals(s1)) goto _L6; else goto _L5
_L5:
        obj = obj1;
_L2:
        return ((String) (obj));
_L6:
        s1 = new ByteArrayInputStream(s1.getBytes("UTF-8"));
        int i;
        obj = XmlPullParserFactory.newInstance();
        ((XmlPullParserFactory) (obj)).setNamespaceAware(true);
        obj = ((XmlPullParserFactory) (obj)).newPullParser();
        ((XmlPullParser) (obj)).setInput(s1, null);
        i = ((XmlPullParser) (obj)).getEventType();
_L8:
        if (i == 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i != 2)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        if (!s.equals(((XmlPullParser) (obj)).getName()))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        ((XmlPullParser) (obj)).next();
        s = ((XmlPullParser) (obj)).getText();
        obj = s;
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return s;
            }
            return s;
        }
        continue; /* Loop/switch isn't completed */
        i = ((XmlPullParser) (obj)).next();
        if (true) goto _L8; else goto _L7
_L7:
        obj = obj1;
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return null;
        }
        if (true) goto _L2; else goto _L9
_L9:
        s;
        s1 = null;
_L13:
        obj = obj1;
        if (s1 == null) goto _L2; else goto _L10
_L10:
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return null;
        s;
        s1 = null;
_L12:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw s;
        s;
        if (true) goto _L12; else goto _L11
_L11:
        s;
          goto _L13
    }

    protected String a(XmlPullParser xmlpullparser, String s)
        throws IOException, XmlPullParserException
    {
        xmlpullparser.require(2, a, s);
        String s1 = b(xmlpullparser);
        xmlpullparser.require(3, a, s);
        return s1;
    }

    protected void a(XmlPullParser xmlpullparser)
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

    public String b(String s)
    {
        try
        {
            s = (new bk()).a("message", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "Unknown Service Response";
        }
        return s;
    }

    public int c(String s)
    {
        s = (new bk()).a("statusCode", s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        int i = Integer.parseInt(s);
        return i;
        s;
        p.a("XMLParser", "StatusCode parsing seems to be failed. Ex=", new Object[] {
            s
        });
        return -1;
    }

}
