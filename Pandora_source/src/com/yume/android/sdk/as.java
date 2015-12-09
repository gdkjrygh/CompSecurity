// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.yume.android.sdk:
//            at, M, l, i, 
//            an, h, aq, aF, 
//            q

final class as
{

    private at a;
    private M b;
    private aq c;
    private h d;
    private XmlPullParser e;
    private l f;
    private an g;
    private i h;

    public as()
    {
        a = at.a;
        b = M.a();
        c = null;
        d = null;
        f = null;
        g = null;
        h = null;
        f = new l();
        h = new i();
        g = new an();
    }

    public final h a(XmlPullParser xmlpullparser)
        throws XmlPullParserException, IOException, Exception
    {
        boolean flag;
        d = new h();
        if (d == null)
        {
            return null;
        }
        e = xmlpullparser;
        flag = false;
_L26:
        if (flag)
        {
            return d;
        }
        int j = xmlpullparser.next();
        if (j != 2)
        {
            break MISSING_BLOCK_LABEL_928;
        }
        int k;
        boolean flag1;
        flag1 = xmlpullparser.isEmptyElementTag();
        k = xmlpullparser.getAttributeCount();
        if (flag1 && k <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!xmlpullparser.getName().equals("slate"))
        {
            continue; /* Loop/switch isn't completed */
        }
        c = new aq();
        if (c == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = 0;
_L10:
        if (j < k) goto _L2; else goto _L1
_L1:
        Object obj = c;
        j = aF.e + 1;
        aF.e = j;
        obj.a = j;
        obj = c.a();
        d.a(((String) (obj)));
        d.a(c, ((String) (obj)));
        j = 0;
_L6:
        if (j != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = e.next();
        if (k != 2) goto _L4; else goto _L3
_L3:
        flag1 = e.isEmptyElementTag();
        if (flag1) goto _L6; else goto _L5
_L5:
        String s = e.getName();
        if (!s.equals("duration")) goto _L8; else goto _L7
_L7:
        a = at.b;
          goto _L6
        xmlpullparser;
        b.c("XmlPullParserException while parsing slate Info.");
        xmlpullparser.printStackTrace();
        throw xmlpullparser;
        xmlpullparser;
          goto _L9
_L2:
        s = xmlpullparser.getAttributeName(j);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_360;
        }
        if (s.equals("id"))
        {
            c.a(xmlpullparser.getAttributeValue(j));
        }
        if (s.equals("next"))
        {
            c.b(xmlpullparser.getAttributeValue(j));
        }
        j++;
          goto _L10
_L8:
        if (!s.equals("cb_active_time"))
        {
            break MISSING_BLOCK_LABEL_446;
        }
        a = at.c;
          goto _L6
        xmlpullparser;
        b.c("IOException while parsing slate Info.");
        xmlpullparser.printStackTrace();
        throw xmlpullparser;
        xmlpullparser;
        b.c("IOException while parsing Slate Info.");
        xmlpullparser.printStackTrace();
        throw xmlpullparser;
        if (!s.equals("user_action"))
        {
            break MISSING_BLOCK_LABEL_496;
        }
        a = at.d;
          goto _L6
        xmlpullparser;
        xmlpullparser.printStackTrace();
        throw xmlpullparser;
        xmlpullparser;
        xmlpullparser.printStackTrace();
        throw xmlpullparser;
_L9:
        try
        {
            b.c("XmlPullParserException while parsing Slate Info.");
            xmlpullparser.printStackTrace();
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            b.c("XmlPullParserException while parsing Slates Info.");
            xmlpullparser.printStackTrace();
            d = null;
            c = null;
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            b.c("IOException while parsing Slates Info.");
            xmlpullparser.printStackTrace();
            d = null;
            c = null;
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            xmlpullparser.printStackTrace();
        }
        d = null;
        c = null;
        throw xmlpullparser;
        int i1;
        if (!s.equals("click_action"))
        {
            break MISSING_BLOCK_LABEL_608;
        }
        i1 = e.getAttributeCount();
        String s1;
        boolean flag2;
        for (k = 0; k < i1; k++)
        {
            break MISSING_BLOCK_LABEL_536;
        }

        a = at.e;
          goto _L6
        s = e.getAttributeName(k);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_964;
        }
        s1 = e.getAttributeValue(k);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_964;
        }
        if (s.equals("slate_id"))
        {
            c.e(s1);
            break MISSING_BLOCK_LABEL_964;
        }
        if (s.equals("transition_effect"))
        {
            c.d(s1);
        }
        break MISSING_BLOCK_LABEL_964;
label0:
        {
            if (!s.equals("urls"))
            {
                break MISSING_BLOCK_LABEL_664;
            }
            a = at.f;
            if (f == null)
            {
                break label0;
            }
            c.c = f.a(e);
        }
          goto _L6
        b.c("Ad URL Info Parser is NULL.");
          goto _L6
        if (!s.equals("slate_elements")) goto _L12; else goto _L11
_L11:
        a = at.g;
        if (g != null)
        {
            g.a(e, c);
        }
          goto _L6
_L12:
        if (!s.equals("tracking")) goto _L6; else goto _L13
_L13:
        a = at.h;
        if (h == null)
        {
            break MISSING_BLOCK_LABEL_749;
        }
        c.b = h.a(e);
          goto _L6
        b.c("Ad Tracking Info Parser is NULL.");
          goto _L6
_L4:
        if (k != 4) goto _L15; else goto _L14
_L14:
        s = e.getText();
        if (s == null) goto _L17; else goto _L16
_L16:
        s = s.trim();
        if (!a.equals(at.b)) goto _L19; else goto _L18
_L18:
        if (s.length() > 0)
        {
            c.a(q.c(s));
        }
_L17:
        a = at.a;
          goto _L6
_L19:
        if (!a.equals(at.c)) goto _L21; else goto _L20
_L20:
        if (s.length() > 0)
        {
            c.b(q.c(s));
        }
          goto _L17
_L21:
        if (!a.equals(at.d) || s.length() <= 0) goto _L17; else goto _L22
_L22:
        c.c(s);
          goto _L17
_L15:
        if (k != 3) goto _L6; else goto _L23
_L23:
        if (!e.getName().equals("slate")) goto _L6; else goto _L24
_L24:
        a = at.a;
        j = 1;
          goto _L6
        if (j == 4 || j != 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag2 = xmlpullparser.getName().equals("slates");
        if (flag2)
        {
            flag = true;
        }
        if (true) goto _L26; else goto _L25
_L25:
    }
}
