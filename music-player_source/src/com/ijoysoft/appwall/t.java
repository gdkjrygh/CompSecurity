// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

// Referenced classes of package com.ijoysoft.appwall:
//            o, GiftActivity, s

final class t extends DefaultHandler
{

    public ArrayList a;
    final s b;
    private o c;
    private String d;

    private t(s s)
    {
        b = s;
        super();
    }

    t(s s, byte byte0)
    {
        this(s);
    }

    public final ArrayList a()
    {
        return a;
    }

    public final void characters(char ac[], int i, int j)
    {
        ac = new String(ac, i, j);
        if ("title".equals(d))
        {
            c.c(ac);
        } else
        {
            if ("detailed".equals(d))
            {
                c.d(ac);
                return;
            }
            if ("icon_imagePath".equals(d))
            {
                c.e((new StringBuilder(String.valueOf(GiftActivity.a))).append(ac).toString());
                return;
            }
            if ("icon_name".equals(d))
            {
                c.a(ac);
                return;
            }
            if ("packageName".equals(d))
            {
                c.b(ac);
                return;
            }
            if ("marketUrl".equals(d))
            {
                c.f(ac);
                return;
            }
        }
    }

    public final void endElement(String s, String s1, String s2)
    {
        if ("gift".equals(s1))
        {
            a.add(c);
        }
        d = null;
    }

    public final void startDocument()
    {
        a = new ArrayList();
    }

    public final void startElement(String s, String s1, String s2, Attributes attributes)
    {
        if ("gift".equals(s1))
        {
            c = new o();
            c.a(Integer.parseInt(attributes.getValue("id")));
        }
        d = s1;
    }
}
