// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.google.android.gms.analytics:
//            ac, m, y

abstract class n
{
    public static class a
    {

        private final y Bg = new y();

        public void c(String s, int i)
        {
            if ("ga_dispatchPeriod".equals(s))
            {
                Bg.Bi = i;
                return;
            } else
            {
                ac.w((new StringBuilder("int configuration name not recognized:  ")).append(s).toString());
                return;
            }
        }

        public void e(String s, boolean flag)
        {
            if ("ga_dryRun".equals(s))
            {
                s = Bg;
                int i;
                if (flag)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                s.Bj = i;
                return;
            } else
            {
                ac.w((new StringBuilder("bool configuration name not recognized:  ")).append(s).toString());
                return;
            }
        }

        public y eI()
        {
            return Bg;
        }

        public m en()
        {
            return eI();
        }

        public void g(String s, String s1)
        {
            if ("ga_appName".equals(s))
            {
                Bg.xZ = s1;
                return;
            }
            if ("ga_appVersion".equals(s))
            {
                Bg.ya = s1;
                return;
            }
            if ("ga_logLevel".equals(s))
            {
                Bg.Bh = s1;
                return;
            } else
            {
                ac.w((new StringBuilder("string configuration name not recognized:  ")).append(s).toString());
                return;
            }
        }

        public a()
        {
        }
    }


    Context mContext;
    a yK;

    public n(Context context, a a1)
    {
        mContext = context;
        yK = a1;
    }

    private m a(XmlResourceParser xmlresourceparser)
    {
        int i;
        xmlresourceparser.next();
        i = xmlresourceparser.getEventType();
_L7:
        if (i == 1) goto _L2; else goto _L1
_L1:
        if (xmlresourceparser.getEventType() != 2) goto _L4; else goto _L3
_L3:
        Object obj = xmlresourceparser.getName().toLowerCase();
        if (!((String) (obj)).equals("screenname")) goto _L6; else goto _L5
_L5:
        obj = xmlresourceparser.getAttributeValue(null, "name");
        String s = xmlresourceparser.nextText().trim();
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && !TextUtils.isEmpty(s))
        {
            obj = yK;
        }
_L4:
        i = xmlresourceparser.next();
          goto _L7
_L6:
        if (!((String) (obj)).equals("string")) goto _L9; else goto _L8
_L8:
        String s1;
        obj = xmlresourceparser.getAttributeValue(null, "name");
        s1 = xmlresourceparser.nextText().trim();
        if (TextUtils.isEmpty(((CharSequence) (obj))) || s1 == null) goto _L4; else goto _L10
_L10:
        yK.g(((String) (obj)), s1);
          goto _L4
        xmlresourceparser;
        ac.e((new StringBuilder("Error parsing tracker configuration file: ")).append(xmlresourceparser).toString());
_L2:
        return yK.en();
_L9:
        if (!((String) (obj)).equals("bool")) goto _L12; else goto _L11
_L11:
        s1 = xmlresourceparser.getAttributeValue(null, "name");
        obj = xmlresourceparser.nextText().trim();
        if (TextUtils.isEmpty(s1)) goto _L4; else goto _L13
_L13:
        boolean flag = TextUtils.isEmpty(((CharSequence) (obj)));
        if (flag) goto _L4; else goto _L14
_L14:
        flag = Boolean.parseBoolean(((String) (obj)));
        yK.e(s1, flag);
          goto _L4
        NumberFormatException numberformatexception;
        numberformatexception;
        ac.e((new StringBuilder("Error parsing bool configuration value: ")).append(((String) (obj))).toString());
          goto _L4
        xmlresourceparser;
        ac.e((new StringBuilder("Error parsing tracker configuration file: ")).append(xmlresourceparser).toString());
          goto _L2
_L12:
        if (!((String) (obj)).equals("integer")) goto _L4; else goto _L15
_L15:
        numberformatexception = xmlresourceparser.getAttributeValue(null, "name");
        obj = xmlresourceparser.nextText().trim();
        if (TextUtils.isEmpty(numberformatexception)) goto _L4; else goto _L16
_L16:
        flag = TextUtils.isEmpty(((CharSequence) (obj)));
        if (flag) goto _L4; else goto _L17
_L17:
        int j = Integer.parseInt(((String) (obj)));
        yK.c(numberformatexception, j);
          goto _L4
        numberformatexception;
        ac.e((new StringBuilder("Error parsing int configuration value: ")).append(((String) (obj))).toString());
          goto _L4
    }

    public final m x(int i)
    {
        m m;
        try
        {
            m = a(mContext.getResources().getXml(i));
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            ac.w((new StringBuilder("inflate() called with unknown resourceId: ")).append(notfoundexception).toString());
            return null;
        }
        return m;
    }
}
