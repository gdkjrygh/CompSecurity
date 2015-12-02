// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.u;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.common.u:
//            d, f, e, i

public class c
{

    private static final Pattern b = Pattern.compile("\\{([#]?)([^ }]+)\\}");
    private static final Pattern c = Pattern.compile("\\{([#!]?)([^ }]+)(?: ([^}]+))?\\}");
    private static final Pattern d = Pattern.compile("&?([^=]+)=([^&]+)");
    private final List a = new ArrayList();

    public c()
    {
    }

    static Pattern a()
    {
        return b;
    }

    static Pattern b()
    {
        return c;
    }

    static String[] b(String s)
    {
        return e(s);
    }

    static Map c(String s)
    {
        return d(s);
    }

    private static Map d(String s)
    {
        HashMap hashmap = new HashMap();
        for (s = d.matcher(s); s.find(); hashmap.put(Uri.decode(s.group(1)), Uri.decode(s.group(2)))) { }
        return hashmap;
    }

    private static String[] e(String s)
    {
        int i;
        boolean flag1;
        i = 0;
        flag1 = false;
_L6:
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        s.charAt(i);
        JVM INSTR lookupswitch 3: default 52
    //                   63: 73
    //                   123: 63
    //                   125: 68;
           goto _L1 _L2 _L3 _L4
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        boolean flag = flag1;
_L7:
        i++;
        flag1 = flag;
        if (true) goto _L6; else goto _L5
_L5:
        flag = true;
          goto _L7
_L4:
        flag = false;
          goto _L7
_L2:
        flag = flag1;
        if (flag1) goto _L7; else goto _L8
_L8:
        return (new String[] {
            s.substring(0, i), s.substring(i + 1)
        });
        return (new String[] {
            s, ""
        });
    }

    public i a(String s)
    {
        if (s == null)
        {
            throw new d("Key may not be null");
        }
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            i i = ((f)iterator.next()).a(s);
            if (i != null)
            {
                return i;
            }
        }

        return null;
    }

    public void a(String s, Object obj)
    {
        if (s == null)
        {
            throw new e("Key template may not be null");
        } else
        {
            a.add(new f(this, s, obj));
            return;
        }
    }

}
