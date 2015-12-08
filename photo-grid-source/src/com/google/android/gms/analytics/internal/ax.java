// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            x, ay, aa, aw

abstract class ax extends x
{

    ay a;

    public ax(aa aa1, ay ay1)
    {
        super(aa1);
        a = ay1;
    }

    private aw a(XmlResourceParser xmlresourceparser)
    {
        int i;
        xmlresourceparser.next();
        i = xmlresourceparser.getEventType();
_L7:
        if (i == 1) goto _L2; else goto _L1
_L1:
        if (xmlresourceparser.getEventType() != 2) goto _L4; else goto _L3
_L3:
        String s = xmlresourceparser.getName().toLowerCase();
        if (!s.equals("screenname")) goto _L6; else goto _L5
_L5:
        s = xmlresourceparser.getAttributeValue(null, "name");
        String s1 = xmlresourceparser.nextText().trim();
        if (!TextUtils.isEmpty(s))
        {
            TextUtils.isEmpty(s1);
        }
_L4:
        i = xmlresourceparser.next();
          goto _L7
_L6:
        if (!s.equals("string")) goto _L9; else goto _L8
_L8:
        String s2;
        s = xmlresourceparser.getAttributeValue(null, "name");
        s2 = xmlresourceparser.nextText().trim();
        if (TextUtils.isEmpty(s) || s2 == null) goto _L4; else goto _L10
_L10:
        a.a(s, s2);
          goto _L4
        xmlresourceparser;
        e("Error parsing tracker configuration file", xmlresourceparser);
_L2:
        return a.a();
_L9:
        if (!s.equals("bool")) goto _L12; else goto _L11
_L11:
        s2 = xmlresourceparser.getAttributeValue(null, "name");
        s = xmlresourceparser.nextText().trim();
        if (TextUtils.isEmpty(s2)) goto _L4; else goto _L13
_L13:
        boolean flag = TextUtils.isEmpty(s);
        if (flag) goto _L4; else goto _L14
_L14:
        flag = Boolean.parseBoolean(s);
        a.a(s2, flag);
          goto _L4
        NumberFormatException numberformatexception;
        numberformatexception;
        c("Error parsing bool configuration value", s, numberformatexception);
          goto _L4
        xmlresourceparser;
        e("Error parsing tracker configuration file", xmlresourceparser);
          goto _L2
_L12:
        if (!s.equals("integer")) goto _L4; else goto _L15
_L15:
        numberformatexception = xmlresourceparser.getAttributeValue(null, "name");
        s = xmlresourceparser.nextText().trim();
        if (TextUtils.isEmpty(numberformatexception)) goto _L4; else goto _L16
_L16:
        flag = TextUtils.isEmpty(s);
        if (flag) goto _L4; else goto _L17
_L17:
        int j = Integer.parseInt(s);
        a.a(numberformatexception, j);
          goto _L4
        numberformatexception;
        c("Error parsing int configuration value", s, numberformatexception);
          goto _L4
    }

    public final aw a(int i)
    {
        aw aw;
        try
        {
            aw = a(j().b().getResources().getXml(i));
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            d("inflate() called with unknown resourceId", notfoundexception);
            return null;
        }
        return aw;
    }
}
