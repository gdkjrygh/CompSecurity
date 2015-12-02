// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.Context;
import android.content.res.AssetManager;
import org.xmlpull.v1.XmlPullParser;

public class ah
{

    public static String a = null;
    public static String b = null;
    public static boolean c = false;
    public static String d = null;

    public static void a(Context context)
    {
        if (false)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        a(((XmlPullParser) (context.getAssets().openXmlResourceParser("res/xml/config.xml"))));
        return;
        context;
    }

    private static void a(XmlPullParser xmlpullparser)
    {
        int i = 0;
        String s;
        String s1;
        int j;
        int k;
        boolean flag;
        try
        {
            k = xmlpullparser.getEventType();
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            return;
        }
          goto _L1
_L17:
        s = xmlpullparser.getName();
        if (k != 2) goto _L3; else goto _L2
_L2:
        if (!"UpdateCheck".equals(s)) goto _L5; else goto _L4
_L4:
        j = 1;
_L7:
        k = xmlpullparser.next();
        i = j;
        continue; /* Loop/switch isn't completed */
_L5:
        j = i;
        if (i <= 0) goto _L7; else goto _L6
_L6:
        j = i;
        if (!"Item".equals(s)) goto _L7; else goto _L8
_L8:
        s = xmlpullparser.getAttributeValue(null, "key");
        s1 = xmlpullparser.getAttributeValue(null, "value");
        if ("server".equals(s))
        {
            a = s1;
        }
        if ("localinipath".equals(s))
        {
            b = s1;
        }
        if (!"uselocalini".equals(s)) goto _L10; else goto _L9
_L9:
        if (!"0".equals(s1)) goto _L12; else goto _L11
_L11:
        c = false;
_L10:
        j = i;
        if (!"product".equals(s)) goto _L7; else goto _L13
_L13:
        d = s1;
        j = i;
          goto _L7
_L12:
label0:
        {
            if (!"false".equalsIgnoreCase(s1))
            {
                break label0;
            }
            c = false;
        }
          goto _L10
        c = true;
          goto _L10
_L3:
        j = i;
        if (k != 3) goto _L7; else goto _L14
_L14:
        flag = "UpdateCheck".equals(s);
        j = i;
        if (!flag) goto _L7; else goto _L15
_L15:
        return;
_L1:
        if (k != 1) goto _L17; else goto _L16
_L16:
    }

}
