// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.u;

import android.os.Bundle;
import com.facebook.common.w.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.common.u:
//            c, e, h, g, 
//            i

class f
{

    List a;
    final c b;
    private final Map c;
    private final Pattern d;
    private final Object e;

    f(c c1, String s1, Object obj)
    {
        HashSet hashset;
        b = c1;
        super();
        c = new HashMap();
        a = new ArrayList();
        e = obj;
        s1 = com.facebook.common.u.c.b(s1);
        obj = s1[0];
        String s2 = s1[1];
        Matcher matcher = com.facebook.common.u.c.a().matcher(((CharSequence) (obj)));
        s1 = ((String) (obj));
        if (((String) (obj)).endsWith("/"))
        {
            s1 = ((String) (obj)).substring(0, ((String) (obj)).length() - 1);
        }
        hashset = new HashSet();
        while (matcher.find()) 
        {
            String s3 = matcher.group(0);
            boolean flag = matcher.group(1).equals("#");
            String s5;
            if (flag)
            {
                obj = java/lang/Long;
            } else
            {
                obj = java/lang/String;
            }
            s5 = matcher.group(2);
            a.add(new s(obj, s5));
            if (!hashset.add(s5))
            {
                throw new e("Duplicate template key");
            }
            if (flag)
            {
                obj = "(-?[0-9]+)";
            } else
            {
                obj = "([^/]+)";
            }
            s1 = s1.replace(s3, ((CharSequence) (obj)));
        }
        d = Pattern.compile((new StringBuilder()).append(s1).append("[/]?").toString());
        obj = com.facebook.common.u.c.c(s2).entrySet().iterator();
_L7:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
        obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
        obj2 = com.facebook.common.u.c.b().matcher((CharSequence)((java.util.Map.Entry) (obj1)).getValue());
        if (!((Matcher) (obj2)).matches())
        {
            throw new e("Query parameter does not match templating syntax");
        }
        s1 = h.STRING;
        if (!"#".equals(((Matcher) (obj2)).group(1))) goto _L4; else goto _L3
_L3:
        s1 = h.LONG;
_L6:
        String s4;
        s4 = ((Matcher) (obj2)).group(2);
        obj2 = ((Matcher) (obj2)).group(3);
        obj1 = (String)((java.util.Map.Entry) (obj1)).getKey();
        if (!hashset.add(obj1))
        {
            throw new e("Duplicate template key");
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if ("!".equals(((Matcher) (obj2)).group(1)))
        {
            s1 = h.BOOLEAN;
        }
        if (true) goto _L6; else goto _L5
_L5:
        c.put(obj1, new g(c1, s4, s1, ((String) (obj2))));
          goto _L7
_L2:
    }

    i a(String s1)
    {
        s1 = com.facebook.common.u.c.b(s1);
        Object obj = s1[0];
        s1 = s1[1];
        Object obj1 = d.matcher(((CharSequence) (obj)));
        if (!((Matcher) (obj1)).matches())
        {
            return null;
        }
        obj = new Bundle();
        int j = 0;
        while (j < a.size()) 
        {
            s s2 = (s)a.get(j);
            if (s2.a == java/lang/Long)
            {
                ((Bundle) (obj)).putLong((String)s2.b, Long.parseLong(((Matcher) (obj1)).group(j + 1)));
            } else
            {
                ((Bundle) (obj)).putString((String)s2.b, ((Matcher) (obj1)).group(j + 1));
            }
            j++;
        }
        obj1 = com.facebook.common.u.c.c(s1);
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext();)
        {
            Object obj2 = (java.util.Map.Entry)iterator.next();
            s1 = (String)((java.util.Map.Entry) (obj2)).getKey();
            obj2 = (g)((java.util.Map.Entry) (obj2)).getValue();
            String s3 = ((g) (obj2)).c;
            if (((g) (obj2)).a && !((Map) (obj1)).containsKey(s1))
            {
                return null;
            }
            if (((Map) (obj1)).containsKey(s1))
            {
                s1 = (String)((Map) (obj1)).get(s1);
            } else
            {
                s1 = ((g) (obj2)).b;
            }
            if (((g) (obj2)).d == h.LONG)
            {
                ((Bundle) (obj)).putLong(s3, Long.parseLong(s1));
            } else
            if (((g) (obj2)).d == h.BOOLEAN)
            {
                ((Bundle) (obj)).putBoolean(s3, Boolean.valueOf(s1).booleanValue());
            } else
            {
                ((Bundle) (obj)).putString(s3, s1);
            }
        }

        return new i(e, ((Bundle) (obj)));
    }
}
