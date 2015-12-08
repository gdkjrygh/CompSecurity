// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad.a;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// Referenced classes of package com.tremorvideo.sdk.android.videoad.a:
//            a, c, b

private class <init> extends DefaultHandler
{

    d a;
    boolean b;
    List c;
    String d;
    List e;
    d f;
    boolean g;
    String h;
    int i;
    StringBuilder j;
    final a k;

    private <init> a(String s)
    {
        try
        {
            s = valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return l;
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
        if (a(s1) != d) goto _L2; else goto _L1
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
                if (a == f)
                {
                    ((c)c.get(c.size() - 1)).b = s;
                } else
                if (a == g)
                {
                    d = s;
                } else
                if (a == h)
                {
                    c.add(new c("click", s));
                } else
                if (a == i)
                {
                    if (c(f.d) && b(s))
                    {
                        f.c = s;
                        e.add(f);
                    }
                    f = null;
                } else
                if (a == e)
                {
                    s = s.split(":");
                    i = 0;
                    i = i + Math.round(Float.parseFloat(s[0]) * 60F * 60F * 1000F);
                    i = i + Math.round(Float.parseFloat(s[1]) * 60F * 1000F);
                    int l = i;
                    i = Math.round(Float.parseFloat(s[2]) * 1000F) + l;
                }
            } else
            if (a == c)
            {
                c.add(new c("impression", s));
            } else
            if (a == k)
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
        if (a == a)
        {
            float f1 = Float.parseFloat(attributes.getValue("version").split("\\.")[0]);
            if ((double)f1 < 2D || (double)f1 >= 3D)
            {
                throw new SAXException((new StringBuilder()).append("Invalid VAST Version: ").append(attributes.getValue("version")).toString());
            }
        } else
        if (a == d)
        {
            b = true;
        } else
        {
            if (a == j)
            {
                g = true;
                return;
            }
            if (b)
            {
                if (a == f)
                {
                    c.add(new c(attributes.getValue("event")));
                    return;
                }
                if (a == i)
                {
                    f = new <init>(k);
                    f.a = Integer.parseInt(attributes.getValue("width"));
                    f.b = Integer.parseInt(attributes.getValue("height"));
                    f.e = Integer.parseInt(attributes.getValue("bitrate"));
                    f.d = attributes.getValue("type");
                    return;
                }
            }
        }
    }

    private (a a1)
    {
        k = a1;
        super();
        a = l;
        b = false;
        c = new ArrayList();
        e = new ArrayList();
        j = new StringBuilder();
    }

    j(a a1, b b1)
    {
        this(a1);
    }
}
