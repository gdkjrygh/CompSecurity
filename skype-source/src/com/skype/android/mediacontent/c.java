// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import android.content.Context;
import com.skype.MediaDocumentImpl;
import com.skype.SkyLib;
import com.skype.android.util.ImageCache;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// Referenced classes of package com.skype.android.mediacontent:
//            b, EmoticonContent

final class c extends DefaultHandler
{

    private SkyLib a;
    private String b;
    private StringBuilder c;
    private boolean d;
    private List e;
    private List f;
    private Context g;
    private ImageCache h;
    private boolean i;
    private int j;
    private int k;
    private int l;

    c(SkyLib skylib, Context context, ImageCache imagecache)
    {
        a = skylib;
        g = context;
        h = imagecache;
        e = new ArrayList();
        c = new StringBuilder();
        f = new ArrayList();
    }

    final List a()
    {
        return f;
    }

    public final void characters(char ac[], int i1, int j1)
        throws SAXException
    {
        c.append(ac, i1, j1);
    }

    public final void endElement(String s, String s1, String s2)
        throws SAXException
    {
        s2 = null;
        if ("Emoticon".equals(s1))
        {
            s1 = new b();
            s1.a(b);
            s1.b(l);
            s1.a(j);
            s1.c(k);
            if (e.size() > 0)
            {
                s = (String)e.get(0);
            } else
            {
                s = null;
            }
            s1.b(s);
            s = s2;
            if (e.size() > 0)
            {
                s = e;
            }
            s1.a(s);
            s1.b(i);
            s1.a(d);
            s = new MediaDocumentImpl();
            a.createEmoticonMediaDocument(b, s);
            s = new EmoticonContent(g, h, s1, s);
            f.add(s);
            b = "";
            d = false;
            e = new ArrayList();
        } else
        {
            if ("Shortcut".equals(s1))
            {
                e.add(c.toString());
                return;
            }
            if ("Visible".equals(s1))
            {
                d = Boolean.valueOf(c.toString()).booleanValue();
                return;
            }
            if ("FramesCount".equals(s1))
            {
                j = Integer.parseInt(c.toString());
                return;
            }
            if ("UseInSMS".equals(s1))
            {
                i = Boolean.valueOf(c.toString()).booleanValue();
                return;
            }
            if ("FirstFrame".equals(s1))
            {
                l = Integer.parseInt(c.toString());
                return;
            }
            if ("AnimationRate".equals(s1))
            {
                k = Integer.parseInt(c.toString());
                return;
            }
        }
    }

    public final void startElement(String s, String s1, String s2, Attributes attributes)
        throws SAXException
    {
        if (!"Emoticon".equals(s1)) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L7:
        if (i1 >= attributes.getLength()) goto _L2; else goto _L3
_L3:
        if (!"id".equals(attributes.getLocalName(i1))) goto _L5; else goto _L4
_L4:
        b = attributes.getValue(i1);
_L2:
        c.setLength(0);
        return;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
