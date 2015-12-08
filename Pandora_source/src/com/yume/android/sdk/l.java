// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.yume.android.sdk:
//            M, m, k, ax, 
//            q

final class l
{

    private M a;
    private m b;
    private XmlPullParser c;
    private ax d;
    private k e;

    l()
    {
        a = M.a();
        b = m.a;
        d = null;
        e = null;
    }

    public final k a(XmlPullParser xmlpullparser)
        throws XmlPullParserException, IOException, Exception
    {
        boolean flag;
        e = new k();
        if (e == null)
        {
            return null;
        }
        c = xmlpullparser;
        flag = false;
_L5:
        Object obj;
        int i;
        int j;
        if (flag)
        {
            return e;
        }
        try
        {
            i = xmlpullparser.next();
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            a.c("XmlPullParserException while parsing Urls Info.");
            xmlpullparser.printStackTrace();
            e = null;
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            a.c("IOException while parsing Urls Info.");
            xmlpullparser.printStackTrace();
            e = null;
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            xmlpullparser.printStackTrace();
            e = null;
            throw xmlpullparser;
        }
        if (i != 2) goto _L2; else goto _L1
_L1:
        if (!xmlpullparser.isEmptyElementTag()) goto _L4; else goto _L3
_L3:
        i = xmlpullparser.getAttributeCount();
        if (i <= 0) goto _L5; else goto _L4
_L4:
        obj = c.getName();
        if (obj == null) goto _L5; else goto _L6
_L6:
        if (!((String) (obj)).equals("mp4_streaming_url")) goto _L8; else goto _L7
_L7:
        b = m.b;
        d = new ax();
        if (d == null) goto _L5; else goto _L9
_L9:
        j = c.getAttributeCount();
        if (j <= 0) goto _L11; else goto _L10
_L10:
        i = 0;
          goto _L12
_L11:
        if (d.a() == null)
        {
            d.a("video/mp4");
        }
        e.a(d);
          goto _L5
        obj;
        d = null;
        ((Exception) (obj)).printStackTrace();
          goto _L5
_L56:
        obj = c.getAttributeName(i);
        if (obj == null) goto _L14; else goto _L13
_L13:
        if (!((String) (obj)).equals("type")) goto _L16; else goto _L15
_L15:
        d.a(c.getAttributeValue(i));
          goto _L14
_L16:
        if (!((String) (obj)).equals("bitrate")) goto _L18; else goto _L17
_L17:
        obj = c.getAttributeValue(i);
        if (obj == null || obj == "") goto _L14; else goto _L19
_L19:
        d.a(q.c(((String) (obj))));
          goto _L14
_L18:
        if (!((String) (obj)).equals("size")) goto _L14; else goto _L20
_L20:
        obj = c.getAttributeValue(i);
        if (obj == null || obj == "") goto _L14; else goto _L21
_L21:
        d.b(q.c(((String) (obj))));
          goto _L14
_L8:
        if (!((String) (obj)).equals("threegpp_streaming_url")) goto _L23; else goto _L22
_L22:
        b = m.c;
        d = new ax();
        if (d == null) goto _L5; else goto _L24
_L24:
        j = c.getAttributeCount();
        if (j <= 0) goto _L26; else goto _L25
_L25:
        i = 0;
          goto _L27
_L26:
        if (d.a() == null)
        {
            d.a("video/3gpp");
        }
        e.a(d);
          goto _L5
_L57:
        obj = c.getAttributeName(i);
        if (obj == null) goto _L29; else goto _L28
_L28:
        if (!((String) (obj)).equals("type")) goto _L31; else goto _L30
_L30:
        d.a(c.getAttributeValue(i));
          goto _L29
_L31:
        if (!((String) (obj)).equals("size")) goto _L29; else goto _L32
_L32:
        obj = c.getAttributeValue(i);
        if (obj == null || obj == "") goto _L29; else goto _L33
_L33:
        d.b(q.c(((String) (obj))));
          goto _L29
_L23:
        if (!((String) (obj)).equals("logo_url")) goto _L5; else goto _L34
_L34:
        b = m.d;
        d = new ax();
        if (d == null) goto _L5; else goto _L35
_L35:
        j = c.getAttributeCount();
        if (j <= 0) goto _L37; else goto _L36
_L36:
        i = 0;
          goto _L38
_L37:
        if (d.a() == null)
        {
            d.a("image");
        }
        e.a(d);
          goto _L5
_L58:
        obj = c.getAttributeName(i);
        if (obj == null) goto _L40; else goto _L39
_L39:
        if (!((String) (obj)).equals("type")) goto _L42; else goto _L41
_L41:
        d.a(c.getAttributeValue(i));
          goto _L40
_L42:
        if (!((String) (obj)).equals("size")) goto _L40; else goto _L43
_L43:
        obj = c.getAttributeValue(i);
        if (obj == null || obj == "") goto _L40; else goto _L44
_L44:
        d.b(q.c(((String) (obj))));
          goto _L40
_L2:
        if (i != 4) goto _L46; else goto _L45
_L45:
        obj = c.getText();
        if (obj == null) goto _L48; else goto _L47
_L47:
        obj = ((String) (obj)).trim();
        if (b != m.b) goto _L50; else goto _L49
_L49:
        d.b(((String) (obj)));
_L48:
        b = m.a;
          goto _L5
_L50:
        if (b != m.c) goto _L52; else goto _L51
_L51:
        d.b(((String) (obj)));
          goto _L48
_L52:
        if (b != m.d) goto _L48; else goto _L53
_L53:
        d.b(((String) (obj)));
          goto _L48
_L46:
        if (i != 3) goto _L5; else goto _L54
_L54:
        if (!xmlpullparser.getName().equals("urls")) goto _L5; else goto _L55
_L55:
        b = m.a;
        flag = true;
          goto _L5
_L12:
        if (i < j) goto _L56; else goto _L11
_L14:
        i++;
          goto _L12
_L27:
        if (i < j) goto _L57; else goto _L26
_L29:
        i++;
          goto _L27
_L38:
        if (i < j) goto _L58; else goto _L37
_L40:
        i++;
          goto _L38
    }
}
