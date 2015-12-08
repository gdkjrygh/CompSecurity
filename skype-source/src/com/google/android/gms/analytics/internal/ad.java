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
//            p, s, ac

abstract class ad extends p
{
    public static interface a
    {

        public abstract ac a();

        public abstract void a(String s1, int i);

        public abstract void a(String s1, String s2);

        public abstract void a(String s1, boolean flag);
    }


    a a;

    public ad(s s1, a a1)
    {
        super(s1);
        a = a1;
    }

    private ac a(XmlResourceParser xmlresourceparser)
    {
        int i;
        xmlresourceparser.next();
        i = xmlresourceparser.getEventType();
_L7:
        if (i == 1) goto _L2; else goto _L1
_L1:
        if (xmlresourceparser.getEventType() != 2) goto _L4; else goto _L3
_L3:
        String s1 = xmlresourceparser.getName().toLowerCase();
        if (!s1.equals("screenname")) goto _L6; else goto _L5
_L5:
        s1 = xmlresourceparser.getAttributeValue(null, "name");
        String s2 = xmlresourceparser.nextText().trim();
        if (!TextUtils.isEmpty(s1))
        {
            TextUtils.isEmpty(s2);
        }
_L4:
        i = xmlresourceparser.next();
          goto _L7
_L6:
        if (!s1.equals("string")) goto _L9; else goto _L8
_L8:
        String s3;
        s1 = xmlresourceparser.getAttributeValue(null, "name");
        s3 = xmlresourceparser.nextText().trim();
        if (TextUtils.isEmpty(s1) || s3 == null) goto _L4; else goto _L10
_L10:
        a.a(s1, s3);
          goto _L4
        xmlresourceparser;
        e("Error parsing tracker configuration file", xmlresourceparser);
_L2:
        return a.a();
_L9:
        if (!s1.equals("bool")) goto _L12; else goto _L11
_L11:
        s3 = xmlresourceparser.getAttributeValue(null, "name");
        s1 = xmlresourceparser.nextText().trim();
        if (TextUtils.isEmpty(s3)) goto _L4; else goto _L13
_L13:
        boolean flag = TextUtils.isEmpty(s1);
        if (flag) goto _L4; else goto _L14
_L14:
        flag = Boolean.parseBoolean(s1);
        a.a(s3, flag);
          goto _L4
        NumberFormatException numberformatexception;
        numberformatexception;
        c("Error parsing bool configuration value", s1, numberformatexception);
          goto _L4
        xmlresourceparser;
        e("Error parsing tracker configuration file", xmlresourceparser);
          goto _L2
_L12:
        if (!s1.equals("integer")) goto _L4; else goto _L15
_L15:
        numberformatexception = xmlresourceparser.getAttributeValue(null, "name");
        s1 = xmlresourceparser.nextText().trim();
        if (TextUtils.isEmpty(numberformatexception)) goto _L4; else goto _L16
_L16:
        flag = TextUtils.isEmpty(s1);
        if (flag) goto _L4; else goto _L17
_L17:
        int j = Integer.parseInt(s1);
        a.a(numberformatexception, j);
          goto _L4
        numberformatexception;
        c("Error parsing int configuration value", s1, numberformatexception);
          goto _L4
    }

    public final ac a(int i)
    {
        ac ac;
        try
        {
            ac = a(j().b().getResources().getXml(i));
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            d("inflate() called with unknown resourceId", notfoundexception);
            return null;
        }
        return ac;
    }
}
