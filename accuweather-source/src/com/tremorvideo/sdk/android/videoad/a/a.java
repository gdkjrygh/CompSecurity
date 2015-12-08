// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad.a;

import com.tremorvideo.sdk.android.videoad.ct;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

// Referenced classes of package com.tremorvideo.sdk.android.videoad.a:
//            b, c

public class com.tremorvideo.sdk.android.videoad.a.a
{
    private class a extends DefaultHandler
    {

        b a;
        boolean b;
        List c;
        String d;
        List e;
        c f;
        boolean g;
        String h;
        int i;
        StringBuilder j;
        final com.tremorvideo.sdk.android.videoad.a.a k;

        private b a(String s)
        {
            try
            {
                s = b.valueOf(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return b.l;
            }
            return s;
        }

        private boolean b(String s)
        {
            return !s.toLowerCase().endsWith(".flv");
        }

        private boolean c(String s)
        {
            while (s.equalsIgnoreCase("video/3gp") || s.equalsIgnoreCase("video/3gpp") || s.equalsIgnoreCase("video/mp4")) 
            {
                return true;
            }
            return false;
        }

        public void characters(char ac[], int l, int i1)
            throws SAXException
        {
            j.append(ac, l, i1);
        }

        public void endElement(String s, String s1, String s2)
            throws SAXException
        {
            if (a(s1) != b.d) goto _L2; else goto _L1
_L1:
            b = false;
_L4:
            j.setLength(0);
            return;
_L2:
            s = j.toString().trim();
            if (s.length() > 0)
            {
                if (b)
                {
                    if (a == b.f)
                    {
                        ((com.tremorvideo.sdk.android.videoad.a.c)c.get(c.size() - 1)).b = s;
                    } else
                    if (a == b.g)
                    {
                        d = s;
                    } else
                    if (a == b.h)
                    {
                        c.add(new com.tremorvideo.sdk.android.videoad.a.c("click", s));
                    } else
                    if (a == b.i)
                    {
                        if (c(f.d) && b(s))
                        {
                            f.c = s;
                            e.add(f);
                        }
                        f = null;
                    } else
                    if (a == b.e)
                    {
                        s = s.split(":");
                        i = 0;
                        i = i + Math.round(Float.parseFloat(s[0]) * 60F * 60F * 1000F);
                        i = i + Math.round(Float.parseFloat(s[1]) * 60F * 1000F);
                        int l = i;
                        i = Math.round(Float.parseFloat(s[2]) * 1000F) + l;
                    }
                } else
                if (a == b.c)
                {
                    c.add(new com.tremorvideo.sdk.android.videoad.a.c("impression", s));
                } else
                if (a == b.k)
                {
                    h = s;
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void startElement(String s, String s1, String s2, Attributes attributes)
            throws SAXException
        {
            a = a(s1);
            if (a == b.a)
            {
                float f1 = Float.parseFloat(attributes.getValue("version").split("\\.")[0]);
                if ((double)f1 < 2D || (double)f1 >= 3D)
                {
                    throw new SAXException((new StringBuilder()).append("Invalid VAST Version: ").append(attributes.getValue("version")).toString());
                }
            } else
            if (a == b.d)
            {
                b = true;
            } else
            {
                if (a == b.j)
                {
                    g = true;
                    return;
                }
                if (b)
                {
                    if (a == b.f)
                    {
                        c.add(new com.tremorvideo.sdk.android.videoad.a.c(attributes.getValue("event")));
                        return;
                    }
                    if (a == b.i)
                    {
                        f = k. new c();
                        f.a = Integer.parseInt(attributes.getValue("width"));
                        f.b = Integer.parseInt(attributes.getValue("height"));
                        f.e = Integer.parseInt(attributes.getValue("bitrate"));
                        f.d = attributes.getValue("type");
                        return;
                    }
                }
            }
        }

        private a()
        {
            k = com.tremorvideo.sdk.android.videoad.a.a.this;
            super();
            a = b.l;
            b = false;
            c = new ArrayList();
            e = new ArrayList();
            j = new StringBuilder();
        }

        a(com.tremorvideo.sdk.android.videoad.a.b b1)
        {
            this();
        }
    }

    private static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b g;
        public static final b h;
        public static final b i;
        public static final b j;
        public static final b k;
        public static final b l;
        private static final b m[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/tremorvideo/sdk/android/videoad/a/a$b, s);
        }

        public static b[] values()
        {
            return (b[])m.clone();
        }

        static 
        {
            a = new b("VAST", 0);
            b = new b("InLine", 1);
            c = new b("Impression", 2);
            d = new b("Linear", 3);
            e = new b("Duration", 4);
            f = new b("Tracking", 5);
            g = new b("ClickThrough", 6);
            h = new b("ClickTracking", 7);
            i = new b("MediaFile", 8);
            j = new b("Wrapper", 9);
            k = new b("VASTAdTagURI", 10);
            l = new b("Invalid", 11);
            m = (new b[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l
            });
        }

        private b(String s, int i1)
        {
            super(s, i1);
        }
    }

    class c
    {

        int a;
        int b;
        String c;
        String d;
        int e;
        final com.tremorvideo.sdk.android.videoad.a.a f;

        c()
        {
            f = com.tremorvideo.sdk.android.videoad.a.a.this;
            super();
        }
    }


    a a;
    c b;

    public com.tremorvideo.sdk.android.videoad.a.a(String s)
        throws Exception
    {
        XMLReader xmlreader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
        xmlreader.setContentHandler(new a(null));
        xmlreader.parse(new InputSource(new StringReader(s)));
        a = (a)xmlreader.getContentHandler();
        if (!a.g)
        {
            b = a(a.e);
            if (b == null)
            {
                throw new Exception("No valid media file found.");
            }
            if (b.a <= 0)
            {
                throw new Exception((new StringBuilder()).append("Invalid width: ").append(b.a).toString());
            }
            if (b.b <= 0)
            {
                throw new Exception((new StringBuilder()).append("Invalid height: ").append(b.b).toString());
            }
        }
    }

    public c a(List list)
    {
        Collections.sort(list, new com.tremorvideo.sdk.android.videoad.a.b(this, Math.max(ct.k(), ct.l()), Math.min(ct.k(), ct.l())));
        if (list.size() > 0)
        {
            return (c)list.get(0);
        } else
        {
            return null;
        }
    }

    public List a()
    {
        return a.c;
    }

    public boolean b()
    {
        return a.g;
    }

    public String c()
    {
        return b.c;
    }

    public String d()
    {
        return a.h;
    }

    public int e()
    {
        return b.a;
    }

    public int f()
    {
        return b.b;
    }

    public String g()
    {
        return a.d;
    }

    public int h()
    {
        return a.i;
    }
}
