// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import com.qihoo.security.engine.e.c;
import com.qihoo.security.services.d;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.qihoo.security.engine.b:
//            c, b

public class a
{

    final Context a;
    final com.qihoo.security.engine.b.c b;
    private XmlPullParser c;

    a(Context context, com.qihoo.security.engine.b.c c1)
    {
        c = null;
        a = context;
        b = c1;
    }

    private void a(String s)
    {
        if ("Item".equals(s))
        {
            s = c.getAttributeValue(null, "key");
            String s1 = c.getAttributeValue(null, "value");
            if (b.b(s) == null)
            {
                b.b(s, s1);
            }
        }
    }

    private void a(String s, int i)
    {
        if (!"Enabled".equals(s)) goto _L2; else goto _L1
_L1:
        if ("1".equals(c.getAttributeValue(null, "value")))
        {
            b.f.a(i, true);
        }
_L4:
        return;
_L2:
        String s2;
        int j;
        if ("Item".equals(s))
        {
            s = c.getAttributeValue(null, "key");
            String s1 = c.getAttributeValue(null, "value");
            try
            {
                b.e.e().a(i, s, s1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
        }
        if (!"Policy".equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = c.getAttributeValue(null, "key");
        s2 = c.getAttributeValue(null, "value");
        if (!"task".equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        j = 0;
        int k = Integer.parseInt(s2);
        j = k;
_L5:
        if (j > 0)
        {
            b.f.a(i, j);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        s;
          goto _L5
    }

    private void b()
    {
        int i;
        int k;
        String s;
        int j;
        boolean flag;
        try
        {
            k = c.getEventType();
        }
        catch (Exception exception)
        {
            return;
        }
        i = 0;
        j = -1;
          goto _L1
_L20:
        s = c.getName();
        if (k != 2) goto _L3; else goto _L2
_L2:
        i;
        JVM INSTR tableswitch 0 11: default 293
    //                   0 110
    //                   1 152
    //                   2 175
    //                   3 160
    //                   4 293
    //                   5 293
    //                   6 293
    //                   7 293
    //                   8 293
    //                   9 293
    //                   10 204
    //                   11 195;
           goto _L4 _L5 _L6 _L7 _L8 _L4 _L4 _L4 _L4 _L4 _L4 _L9 _L10
_L4:
        k = c.next();
        continue; /* Loop/switch isn't completed */
_L5:
        if (!"Global".equals(s))
        {
            break MISSING_BLOCK_LABEL_124;
        }
        i = 1;
          goto _L4
        if (!"Enumerators".equals(s)) goto _L12; else goto _L11
_L11:
        i = 3;
          goto _L4
_L12:
        if (!"EngineConfigs".equals(s)) goto _L4; else goto _L13
_L13:
        i = 2;
          goto _L4
_L6:
        a(s);
          goto _L4
_L8:
        if (!"File".equals(s)) goto _L4; else goto _L14
_L14:
        i = 10;
          goto _L4
_L7:
        k = c();
        if (k > 0)
        {
            i = 11;
            j = k;
        }
          goto _L4
_L10:
        a(s, j);
          goto _L4
_L9:
        b(s);
          goto _L4
_L22:
        if (!"Global".equals(s)) goto _L4; else goto _L15
_L15:
        i = 0;
          goto _L4
_L24:
        if (!"Enumerators".equals(s)) goto _L4; else goto _L16
_L16:
        i = 0;
          goto _L4
_L23:
        if (!"EngineConfigs".equals(s)) goto _L4; else goto _L17
_L17:
        i = 0;
          goto _L4
_L25:
        if (!"File".equals(s)) goto _L4; else goto _L18
_L18:
        i = 3;
          goto _L4
_L26:
        flag = "EngineConfig".equals(s);
        if (flag)
        {
            i = 2;
        }
          goto _L4
_L1:
        if (k != 1) goto _L20; else goto _L19
_L19:
        return;
_L3:
        if (k != 3) goto _L4; else goto _L21
_L21:
        i;
        JVM INSTR tableswitch 1 11: default 364
    //                   1 212
    //                   2 240
    //                   3 226
    //                   4 364
    //                   5 364
    //                   6 364
    //                   7 364
    //                   8 364
    //                   9 364
    //                   10 254
    //                   11 268;
           goto _L4 _L22 _L23 _L24 _L4 _L4 _L4 _L4 _L4 _L4 _L25 _L26
    }

    private void b(String s)
    {
        if ("Item".equals(s))
        {
            s = c.getAttributeValue(null, "key");
            String s1 = c.getAttributeValue(null, "value");
            b.j.a(4, s, s1);
        }
    }

    private int c()
    {
        return Integer.parseInt(c.getAttributeValue(null, "id"));
    }

    boolean a()
    {
        Object obj;
        Object obj3;
        Object obj1 = null;
        try
        {
            obj = a.getAssets().openXmlResourceParser("res/xml/config.xml");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (obj1 != null)
            {
                ((XmlResourceParser) (obj1)).close();
            }
            return false;
        }
        finally
        {
            obj3 = null;
        }
        obj1 = obj;
        c = ((XmlPullParser) (obj));
        obj1 = obj;
        b();
        if (obj != null)
        {
            ((XmlResourceParser) (obj)).close();
        }
        return true;
        Object obj2 = obj;
_L2:
        if (obj3 != null)
        {
            ((XmlResourceParser) (obj3)).close();
        }
        throw obj2;
        obj2;
        obj3 = obj;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
