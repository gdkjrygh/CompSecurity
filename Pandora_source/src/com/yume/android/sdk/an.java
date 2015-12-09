// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.yume.android.sdk:
//            ao, M, C, aF, 
//            aq, q

final class an
{

    private ao a;
    private M b;
    private C c;
    private XmlPullParser d;

    public an()
    {
        a = ao.a;
        b = M.a();
        c = null;
    }

    public final void a(XmlPullParser xmlpullparser, aq aq1)
        throws XmlPullParserException, IOException, Exception
    {
        if (aq1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        d = xmlpullparser;
        flag = false;
_L7:
        if (flag) goto _L1; else goto _L3
_L3:
        int i = xmlpullparser.next();
        if (i != 2) goto _L5; else goto _L4
_L4:
        if (xmlpullparser.isEmptyElementTag() || !xmlpullparser.getName().equals("element")) goto _L7; else goto _L6
_L6:
        c = new C();
        if (c == null) goto _L7; else goto _L8
_L8:
        C c1 = c;
        i = aF.f + 1;
        aF.f = i;
        c1.a = i;
        i = 0;
_L13:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        aq1.a(c.a, c);
          goto _L7
        int j = d.next();
        if (j != 2) goto _L10; else goto _L9
_L9:
        if (!d.isEmptyElementTag()) goto _L12; else goto _L11
_L11:
        j = d.getAttributeCount();
        if (j <= 0) goto _L13; else goto _L12
_L12:
        Object obj = d.getName();
        if (obj == null) goto _L13; else goto _L14
_L14:
        if (!((String) (obj)).equals("name"))
        {
            break MISSING_BLOCK_LABEL_256;
        }
        a = ao.b;
          goto _L13
        obj;
        ((Exception) (obj)).printStackTrace();
          goto _L13
        xmlpullparser;
        try
        {
            b.c("XmlPullParserException while parsing Element Info.");
            xmlpullparser.printStackTrace();
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            b.c("XmlPullParserException while parsing SlateElements Info.");
            xmlpullparser.printStackTrace();
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            b.c("IOException while parsing SlateElements Info.");
            xmlpullparser.printStackTrace();
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            xmlpullparser.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_296;
        if (!((String) (obj)).equals("type"))
        {
            break MISSING_BLOCK_LABEL_298;
        }
        a = ao.c;
          goto _L13
        xmlpullparser;
        b.c("IOException while parsing Element Info.");
        xmlpullparser.printStackTrace();
        throw xmlpullparser;
        throw xmlpullparser;
        if (!((String) (obj)).equals("region")) goto _L16; else goto _L15
_L15:
        int k;
        a = ao.d;
        k = d.getAttributeCount();
        j = 0;
_L35:
        if (j >= k) goto _L13; else goto _L17
_L17:
        obj = d.getAttributeName(j);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1305;
        }
        if (((String) (obj)).equals("position"))
        {
            c.a(q.c(d.getAttributeValue(j)));
        }
        break MISSING_BLOCK_LABEL_1305;
_L16:
        if (!((String) (obj)).equals("creative"))
        {
            break MISSING_BLOCK_LABEL_515;
        }
        k = d.getAttributeCount();
        String s;
        boolean flag1;
        for (j = 0; j < k; j++)
        {
            break MISSING_BLOCK_LABEL_424;
        }

        a = ao.e;
          goto _L13
        obj = d.getAttributeName(j);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1314;
        }
        if (((String) (obj)).equals("type"))
        {
            c.i(d.getAttributeValue(j));
            break MISSING_BLOCK_LABEL_1314;
        }
        if (!((String) (obj)).equals("size"))
        {
            break MISSING_BLOCK_LABEL_1314;
        }
        obj = d.getAttributeValue(j);
        if (obj == null || obj == "")
        {
            break MISSING_BLOCK_LABEL_1314;
        }
        c.b(q.c(((String) (obj))));
        break MISSING_BLOCK_LABEL_1314;
        if (!((String) (obj)).equals("click_action"))
        {
            break MISSING_BLOCK_LABEL_652;
        }
        k = d.getAttributeCount();
        for (j = 0; j < k; j++)
        {
            break MISSING_BLOCK_LABEL_555;
        }

        a = ao.f;
          goto _L13
        obj = d.getAttributeName(j);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1323;
        }
        s = d.getAttributeValue(j);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_1323;
        }
        if (((String) (obj)).equals("slate_id"))
        {
            c.d(s);
            break MISSING_BLOCK_LABEL_1323;
        }
        if (((String) (obj)).equals("phone_number"))
        {
            c.e(s);
            break MISSING_BLOCK_LABEL_1323;
        }
        if (((String) (obj)).equals("transition_effect"))
        {
            c.g(s);
        }
        break MISSING_BLOCK_LABEL_1323;
label0:
        {
            if (!((String) (obj)).equals("clicktag"))
            {
                break label0;
            }
            a = ao.g;
        }
          goto _L13
label1:
        {
            if (!((String) (obj)).equals("click_target"))
            {
                break label1;
            }
            a = ao.h;
        }
          goto _L13
label2:
        {
            if (!((String) (obj)).equals("start_time"))
            {
                break label2;
            }
            a = ao.i;
        }
          goto _L13
label3:
        {
            if (!((String) (obj)).equals("duration"))
            {
                break label3;
            }
            a = ao.j;
        }
          goto _L13
label4:
        {
            if (!((String) (obj)).equals("x_dimension"))
            {
                break label4;
            }
            a = ao.k;
        }
          goto _L13
label5:
        {
            if (!((String) (obj)).equals("y_dimension"))
            {
                break label5;
            }
            a = ao.l;
        }
          goto _L13
label6:
        {
            if (!((String) (obj)).equals("z_index"))
            {
                break label6;
            }
            a = ao.m;
        }
          goto _L13
        if (!((String) (obj)).equals("height")) goto _L19; else goto _L18
_L18:
        a = ao.n;
          goto _L13
_L19:
        if (!((String) (obj)).equals("width")) goto _L13; else goto _L20
_L20:
        a = ao.o;
          goto _L13
_L10:
        if (j != 4) goto _L22; else goto _L21
_L21:
        obj = d.getText();
        if (obj == null) goto _L24; else goto _L23
_L23:
        obj = ((String) (obj)).trim();
        if (a != ao.b) goto _L26; else goto _L25
_L25:
        c.a(((String) (obj)));
_L24:
        a = ao.a;
          goto _L13
        xmlpullparser;
        xmlpullparser.printStackTrace();
        throw xmlpullparser;
_L26:
label7:
        {
            if (a != ao.c)
            {
                break MISSING_BLOCK_LABEL_925;
            }
            if (!((String) (obj)).equals(""))
            {
                break label7;
            }
            c.b("custom overlay banner");
        }
          goto _L24
        c.b(((String) (obj)));
          goto _L24
label8:
        {
            if (a != ao.d)
            {
                break label8;
            }
            c.f(((String) (obj)));
        }
          goto _L24
label9:
        {
            if (a != ao.e)
            {
                break label9;
            }
            c.j(((String) (obj)));
        }
          goto _L24
label10:
        {
            if (a != ao.f)
            {
                break label10;
            }
            c.c(((String) (obj)));
        }
          goto _L24
        if (a != ao.g) goto _L28; else goto _L27
_L27:
        c.k(((String) (obj)));
          goto _L24
_L28:
        if (a == ao.h) goto _L24; else goto _L29
_L29:
        if (a != ao.i)
        {
            break MISSING_BLOCK_LABEL_1050;
        }
        if (((String) (obj)).length() > 0)
        {
            c.c(q.c(((String) (obj))));
        }
          goto _L24
label11:
        {
            if (a != ao.j)
            {
                break label11;
            }
            if (((String) (obj)).length() > 0)
            {
                c.d(q.c(((String) (obj))));
            }
        }
          goto _L24
label12:
        {
            if (a != ao.k)
            {
                break label12;
            }
            if (((String) (obj)).length() > 0)
            {
                c.f(q.c(((String) (obj))));
            }
        }
          goto _L24
label13:
        {
            if (a != ao.l)
            {
                break label13;
            }
            if (((String) (obj)).length() > 0)
            {
                c.g(q.c(((String) (obj))));
            }
        }
          goto _L24
label14:
        {
            if (a != ao.m)
            {
                break label14;
            }
            if (((String) (obj)).length() > 0)
            {
                c.h(q.c(((String) (obj))));
            }
        }
          goto _L24
        if (a != ao.n) goto _L31; else goto _L30
_L30:
        if (((String) (obj)).length() > 0)
        {
            c.i(q.c(((String) (obj))));
        }
          goto _L24
_L31:
        if (a != ao.o || ((String) (obj)).length() <= 0) goto _L24; else goto _L32
_L32:
        c.j(q.c(((String) (obj))));
          goto _L24
_L22:
        if (j != 3) goto _L13; else goto _L33
_L33:
        flag1 = d.getName().equals("element");
        if (flag1)
        {
            i = 1;
        }
          goto _L13
_L5:
        if (i == 4 || i != 3) goto _L7; else goto _L34
_L34:
        flag1 = xmlpullparser.getName().equals("slate_elements");
        if (flag1)
        {
            flag = true;
        }
          goto _L7
        j++;
          goto _L35
    }
}
