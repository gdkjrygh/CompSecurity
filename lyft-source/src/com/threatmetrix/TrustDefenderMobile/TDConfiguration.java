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

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            StringUtils

class TDConfiguration
{

    private static final String f = StringUtils.a(com/threatmetrix/TrustDefenderMobile/TDConfiguration);
    public long a;
    public long b;
    public String c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();

    TDConfiguration()
    {
        a = 0L;
        b = 0L;
        c = "";
    }

    private void a(XmlPullParser xmlpullparser)
    {
        String s;
        int i;
        i = xmlpullparser.next();
        s = "";
_L8:
        if (i == 1) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 0 4: default 52
    //                   0 94
    //                   1 52
    //                   2 108
    //                   3 118
    //                   4 135;
           goto _L3 _L4 _L3 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_135;
_L3:
        String s1;
        Log.d(f, (new StringBuilder()).append("Found unexpected event type: ").append(i).toString());
        s1 = s;
_L9:
        i = xmlpullparser.next();
        s = s1;
          goto _L8
_L4:
        Log.d(f, "Found start document tag unexpectedly");
        s1 = s;
          goto _L9
_L5:
        s1 = xmlpullparser.getName();
          goto _L9
_L6:
        s1 = s;
        if (!xmlpullparser.getName().equals("PS")) goto _L9; else goto _L2
_L2:
        return;
        s1 = s;
        if (s != null)
        {
            if (s.equals("P"))
            {
                d.add(xmlpullparser.getText());
                s1 = s;
            } else
            {
                Log.d(f, (new StringBuilder()).append("Found tag content unexpectedly: ").append(s).toString());
                s1 = s;
            }
        }
          goto _L9
    }

    private void b(XmlPullParser xmlpullparser)
    {
        Object obj;
        int i;
        i = xmlpullparser.next();
        obj = "";
_L8:
        if (i == 1) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 0 4: default 52
    //                   0 94
    //                   1 52
    //                   2 108
    //                   3 118
    //                   4 135;
           goto _L3 _L4 _L3 _L5 _L6 _L7
_L3:
        Object obj1;
        Log.d(f, (new StringBuilder()).append("Found unexpected event type: ").append(i).toString());
        obj1 = obj;
_L9:
        i = xmlpullparser.next();
        obj = obj1;
          goto _L8
_L4:
        Log.d(f, "Found start document tag unexpectedly");
        obj1 = obj;
          goto _L9
_L5:
        obj1 = xmlpullparser.getName();
          goto _L9
_L6:
        obj1 = obj;
        if (!xmlpullparser.getName().equals("EX")) goto _L9; else goto _L2
_L2:
        return;
_L7:
        obj1 = obj;
        if (obj == null) goto _L9; else goto _L10
_L10:
        if (!((String) (obj)).equals("E"))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        e.add(new URI(xmlpullparser.getText()));
        obj1 = obj;
          goto _L9
        obj1;
        Log.e(f, "Failed to parse E into URI", ((Throwable) (obj1)));
        obj1 = obj;
          goto _L9
        Log.d(f, (new StringBuilder()).append("Found tag content unexpectedly: ").append(((String) (obj))).toString());
        obj1 = obj;
          goto _L9
    }

    public void a(InputStream inputstream)
    {
        XmlPullParser xmlpullparser;
        int i;
        xmlpullparser = XmlPullParserFactory.newInstance().newPullParser();
        xmlpullparser.setInput(new InputStreamReader(inputstream));
        i = xmlpullparser.getEventType();
        InputStream inputstream1 = null;
          goto _L1
_L14:
        i = xmlpullparser.next();
        inputstream1 = inputstream;
          goto _L1
_L12:
        if (!xmlpullparser.getName().equals("PS")) goto _L3; else goto _L2
_L2:
        a(xmlpullparser);
        inputstream = inputstream1;
        break; /* Loop/switch isn't completed */
_L5:
        return;
_L3:
        if (!xmlpullparser.getName().equals("EX"))
        {
            break MISSING_BLOCK_LABEL_119;
        }
        b(xmlpullparser);
        inputstream = inputstream1;
        break; /* Loop/switch isn't completed */
        try
        {
            inputstream = xmlpullparser.getName();
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.e(f, "IO Error", inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.e(f, "XML Parse Error", inputstream);
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
        inputstream = inputstream1;
        if (inputstream1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!inputstream1.equals("w"))
        {
            break MISSING_BLOCK_LABEL_159;
        }
        c = xmlpullparser.getText();
        inputstream = inputstream1;
        break; /* Loop/switch isn't completed */
        if (!inputstream1.equals("O"))
        {
            break MISSING_BLOCK_LABEL_189;
        }
        a = Long.valueOf(xmlpullparser.getText()).longValue();
        inputstream = inputstream1;
        break; /* Loop/switch isn't completed */
        inputstream = inputstream1;
        if (!inputstream1.equals("D"))
        {
            break; /* Loop/switch isn't completed */
        }
        b = Long.valueOf(xmlpullparser.getText()).longValue();
        inputstream = inputstream1;
        break; /* Loop/switch isn't completed */
_L1:
        if (i == 1) goto _L5; else goto _L6
_L6:
        inputstream = inputstream1;
        i;
        JVM INSTR tableswitch 0 4: default 264
    //                   0 34
    //                   1 34
    //                   2 47
    //                   3 269
    //                   4 129;
           goto _L7 _L8 _L8 _L9 _L10 _L4
_L8:
        break; /* Loop/switch isn't completed */
_L9:
        break; /* Loop/switch isn't completed */
_L7:
        inputstream = inputstream1;
        break; /* Loop/switch isn't completed */
_L10:
        inputstream = null;
        break; /* Loop/switch isn't completed */
        if (true) goto _L12; else goto _L11
_L11:
        if (true) goto _L14; else goto _L13
_L13:
    }

    public boolean a()
    {
        return c != null && !c.isEmpty();
    }

}
