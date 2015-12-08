// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.yume.android.sdk:
//            M, q, O

final class N
{

    public static boolean a = true;
    private static List b = null;
    private static List c = null;
    private static Map d = null;
    private static Map e = null;
    private static List f = null;
    private static List g = null;

    N()
    {
    }

    static String a(String s)
    {
        if (!a)
        {
            return s;
        } else
        {
            return q.d(a(a(s, true), false));
        }
    }

    private static String a(String s, boolean flag)
    {
        Map map;
        List list;
        int i;
        String s1;
        int k;
        if (flag)
        {
            list = b;
            map = d;
        } else
        {
            list = c;
            map = e;
        }
        s1 = s;
        if (list == null) goto _L2; else goto _L1
_L1:
        s1 = s;
        if (map == null) goto _L2; else goto _L3
_L3:
        k = list.size();
        i = 0;
_L11:
        if (i < k) goto _L5; else goto _L4
_L4:
        s1 = s;
_L2:
        return s1;
_L5:
        Object obj = (String)list.get(i);
        if (!flag) goto _L7; else goto _L6
_L6:
        String s2 = s;
        if (q.a(c, ((String) (obj)))) goto _L8; else goto _L7
_L7:
        s2 = s;
        if (!s.contains(((CharSequence) (obj)))) goto _L8; else goto _L9
_L9:
        obj = (List)map.get(obj);
        s2 = s;
        if (obj == null) goto _L8; else goto _L10
_L10:
        int j;
        int l;
        l = ((List) (obj)).size();
        j = 0;
_L12:
        if (j < l)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        s2 = s;
_L8:
        i++;
        s = s2;
          goto _L11
        O o = (O)((List) (obj)).get(j);
        if (o != null)
        {
            String s3 = o.a;
            if (flag && o.b.equals(""))
            {
                s = s.replace(s3, Long.toString((new Date()).getTime()));
            } else
            {
                s = s.replace(s3, o.b);
            }
        }
        j++;
          goto _L12
    }

    static void a()
    {
        boolean flag = false;
        if (d != null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        ArrayList arraylist = new ArrayList();
        b = arraylist;
        Collections.addAll(arraylist, new String[] {
            "timestamp", "time_stamp", "rand", "randnum", "RANDOM", "REALRAND", "RANDOM_NUMBER", "cachebuster", "cache_buster", "time"
        });
        arraylist = new ArrayList();
        f = arraylist;
        Collections.addAll(arraylist, new String[] {
            "[", "${", "$!{", "%%", "%"
        });
        arraylist = new ArrayList();
        g = arraylist;
        Collections.addAll(arraylist, new String[] {
            "]", "}", "}", "%%", "%"
        });
        j = f.size();
        i = 0;
_L7:
        if (i < j) goto _L4; else goto _L3
_L3:
        i = 0;
_L8:
        if (i < j) goto _L6; else goto _L5
_L5:
        j = b.size();
        i = ((flag) ? 1 : 0);
_L9:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_278;
        }
_L2:
        return;
_L4:
        f.add(q.d((String)f.get(i)));
        i++;
          goto _L7
_L6:
        g.add(q.d((String)g.get(i)));
        i++;
          goto _L8
        b((String)b.get(i), "");
        i++;
          goto _L9
    }

    static void a(String s, String s1)
    {
        while (s == null || s1 == null || c != null && q.a(c, s)) 
        {
            return;
        }
        if (c == null)
        {
            c = new ArrayList();
        }
        c.add(s);
        ArrayList arraylist = null;
        int j = f.size();
        int i = 0;
        do
        {
            if (i >= j)
            {
                if (e == null)
                {
                    e = new HashMap();
                }
                e.put(s, arraylist);
                return;
            }
            O o = new O();
            o.a = (new StringBuilder(String.valueOf((String)f.get(i)))).append(s).append((String)g.get(i)).toString();
            o.b = s1;
            if (arraylist == null)
            {
                arraylist = new ArrayList();
            }
            arraylist.add(o);
            i++;
        } while (true);
    }

    static void b()
    {
        if (c != null)
        {
            c.clear();
        }
        if (e != null)
        {
            e.clear();
        }
    }

    private static void b(String s, String s1)
    {
        ArrayList arraylist = null;
        int j = f.size();
        int i = 0;
        do
        {
            if (i >= j)
            {
                if (d == null)
                {
                    d = new HashMap();
                }
                d.put(s, arraylist);
                return;
            }
            O o = new O();
            o.a = (new StringBuilder(String.valueOf((String)f.get(i)))).append(s).append((String)g.get(i)).toString();
            o.b = s1;
            if (arraylist == null)
            {
                arraylist = new ArrayList();
            }
            arraylist.add(o);
            i++;
        } while (true);
    }

    static 
    {
        M.a();
    }
}
