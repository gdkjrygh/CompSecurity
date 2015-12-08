// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.yume.android.sdk:
//            M, j, av, au

final class i
{

    private M a;
    private j b;
    private XmlPullParser c;
    private av d;

    i()
    {
        a = M.a();
        b = j.a;
        d = null;
    }

    public final av a(XmlPullParser xmlpullparser)
        throws XmlPullParserException, IOException, Exception
    {
        boolean flag;
        d = new av();
        if (d == null)
        {
            return null;
        }
        c = xmlpullparser;
        flag = false;
_L4:
        String s;
        int k;
        if (flag)
        {
            return d;
        }
        String s1;
        String s2;
        int l;
        try
        {
            k = xmlpullparser.next();
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            a.c("XmlPullParserException while parsing Tracking Info.");
            xmlpullparser.printStackTrace();
            d = null;
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            a.c("IOException while parsing Tracking Info.");
            xmlpullparser.printStackTrace();
            d = null;
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            xmlpullparser.printStackTrace();
            d = null;
            throw xmlpullparser;
        }
        if (k != 2) goto _L2; else goto _L1
_L1:
        if (xmlpullparser.isEmptyElementTag() && xmlpullparser.getAttributeCount() <= 0) goto _L4; else goto _L3
_L3:
        s = c.getName();
        if (s == null) goto _L4; else goto _L5
_L5:
        if (!s.equals("impressiontracker") && !s.equals("tracking_url")) goto _L7; else goto _L6
_L6:
        l = c.getAttributeCount();
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        b = j.b;
          goto _L4
        k = 0;
_L24:
        if (k >= l) goto _L4; else goto _L8
_L8:
        s2 = c.getAttributeName(k);
        s1 = "";
        s = s1;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        s = s1;
        if (s2.equals("begin"))
        {
            s = c.getAttributeValue(k);
        }
        if (s.equals("0%"))
        {
            b = j.b;
            break MISSING_BLOCK_LABEL_606;
        }
        if (s.equals("25%"))
        {
            b = j.c;
            break MISSING_BLOCK_LABEL_606;
        }
        if (s.equals("50%"))
        {
            b = j.d;
            break MISSING_BLOCK_LABEL_606;
        }
        if (s.equals("75%"))
        {
            b = j.e;
            break MISSING_BLOCK_LABEL_606;
        }
        if (s.equals("100%"))
        {
            b = j.f;
        }
        break MISSING_BLOCK_LABEL_606;
_L7:
        if (!s.equals("clicktag")) goto _L10; else goto _L9
_L9:
        b = j.g;
          goto _L4
_L10:
        if (!s.equals("click_target")) goto _L4; else goto _L11
_L11:
        b = j.h;
          goto _L4
_L2:
        if (k != 4) goto _L13; else goto _L12
_L12:
        s = c.getText();
        if (s == null) goto _L15; else goto _L14
_L14:
        s = s.trim();
        if (s.length() <= 0) goto _L15; else goto _L16
_L16:
        if (b != j.b) goto _L18; else goto _L17
_L17:
        d.a(au.i, s);
_L15:
        b = j.a;
          goto _L4
_L18:
label0:
        {
            if (b != j.c)
            {
                break label0;
            }
            d.a(au.j, s);
        }
          goto _L15
label1:
        {
            if (b != j.d)
            {
                break label1;
            }
            d.a(au.k, s);
        }
          goto _L15
label2:
        {
            if (b != j.e)
            {
                break label2;
            }
            d.a(au.l, s);
        }
          goto _L15
label3:
        {
            if (b != j.f)
            {
                break label3;
            }
            d.a(au.m, s);
        }
          goto _L15
        if (b != j.g) goto _L20; else goto _L19
_L19:
        d.a(s);
          goto _L15
_L20:
        if (b != j.h) goto _L15; else goto _L21
_L21:
        d.b(s);
          goto _L15
_L13:
        if (k != 3) goto _L4; else goto _L22
_L22:
        if (!xmlpullparser.getName().equals("tracking")) goto _L4; else goto _L23
_L23:
        b = j.a;
        flag = true;
          goto _L4
        k++;
          goto _L24
    }
}
