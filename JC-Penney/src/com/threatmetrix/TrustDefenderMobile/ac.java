// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

class ac
{

    private static final String e = com/threatmetrix/TrustDefenderMobile/ac.getName();
    public int a;
    public String b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    ac()
    {
        a = 0;
        b = "";
    }

    private boolean a(XmlPullParser xmlpullparser)
    {
        String s;
        int i;
        i = xmlpullparser.next();
        s = "";
_L7:
        if (i == 1)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        i;
        JVM INSTR tableswitch 0 4: default 52
    //                   0 86
    //                   1 52
    //                   2 95
    //                   3 105
    //                   4 123;
           goto _L1 _L2 _L1 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_123;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        String s1;
        s1 = e;
        (new StringBuilder("Found unexpected event type: ")).append(i);
        s1 = s;
_L8:
        i = xmlpullparser.next();
        s = s1;
        if (true) goto _L7; else goto _L6
_L6:
        s1 = e;
        s1 = s;
          goto _L8
_L3:
        s1 = xmlpullparser.getName();
          goto _L8
_L4:
        s1 = s;
        if (!xmlpullparser.getName().equals("PS")) goto _L8; else goto _L9
_L9:
        return true;
        s1 = s;
        if (s != null)
        {
            if (s.equals("P"))
            {
                c.add(xmlpullparser.getText());
                s1 = s;
            } else
            {
                s1 = e;
                (new StringBuilder("Found tag content unexpectedly: ")).append(s);
                s1 = s;
            }
        }
          goto _L8
        return false;
    }

    private boolean b(XmlPullParser xmlpullparser)
    {
        Object obj;
        int i;
        i = xmlpullparser.next();
        obj = "";
_L7:
        if (i == 1)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        i;
        JVM INSTR tableswitch 0 4: default 52
    //                   0 86
    //                   1 52
    //                   2 95
    //                   3 105
    //                   4 123;
           goto _L1 _L2 _L1 _L3 _L4 _L5
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        Object obj1;
        obj1 = e;
        (new StringBuilder("Found unexpected event type: ")).append(i);
        obj1 = obj;
_L8:
        i = xmlpullparser.next();
        obj = obj1;
        if (true) goto _L7; else goto _L6
_L6:
        obj1 = e;
        obj1 = obj;
          goto _L8
_L3:
        obj1 = xmlpullparser.getName();
          goto _L8
_L4:
        obj1 = obj;
        if (!xmlpullparser.getName().equals("EX")) goto _L8; else goto _L9
_L9:
        return true;
_L5:
        obj1 = obj;
        if (obj == null) goto _L8; else goto _L10
_L10:
        if (!((String) (obj)).equals("E"))
        {
            break MISSING_BLOCK_LABEL_180;
        }
        d.add(new URI(xmlpullparser.getText()));
        obj1 = obj;
          goto _L8
        obj1;
        Log.e(e, "Failed to parse E into URI", ((Throwable) (obj1)));
        obj1 = obj;
          goto _L8
        obj1 = e;
        (new StringBuilder("Found tag content unexpectedly: ")).append(((String) (obj)));
        obj1 = obj;
          goto _L8
        return false;
    }

    public final boolean a()
    {
        return b != null && !b.isEmpty();
    }

    public final boolean a(InputStream inputstream)
    {
        XmlPullParser xmlpullparser;
        int j;
        xmlpullparser = XmlPullParserFactory.newInstance().newPullParser();
        xmlpullparser.setInput(new InputStreamReader(inputstream));
        j = xmlpullparser.getEventType();
        boolean flag;
        inputstream = null;
        flag = false;
          goto _L1
_L14:
        int i = xmlpullparser.next();
        j = i;
          goto _L1
_L12:
        if (!xmlpullparser.getName().equals("PS")) goto _L3; else goto _L2
_L2:
        if (a(xmlpullparser))
        {
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
_L3:
        if (!xmlpullparser.getName().equals("EX")) goto _L6; else goto _L5
_L5:
        if (b(xmlpullparser))
        {
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
_L6:
        boolean flag1;
        try
        {
            inputstream = xmlpullparser.getName();
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.e(e, "IO Error", inputstream);
            flag1 = false;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.e(e, "XML Parse Error", inputstream);
            flag1 = false;
        }
          goto _L7
_L10:
        if (inputstream == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (inputstream.equals("w"))
        {
            b = xmlpullparser.getText();
            continue; /* Loop/switch isn't completed */
        }
        if (inputstream.equals("O"))
        {
            a = Integer.valueOf(xmlpullparser.getText()).intValue();
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
_L7:
        return !flag1;
_L1:
        flag1 = flag;
        if (j == 1) goto _L7; else goto _L8
_L8:
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        default:
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
            inputstream = null;
            continue; /* Loop/switch isn't completed */

        case 4: // '\004'
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        flag = true;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L10; else goto _L9
_L9:
        if (true) goto _L12; else goto _L11
_L11:
        if (true) goto _L14; else goto _L13
_L13:
    }

}
