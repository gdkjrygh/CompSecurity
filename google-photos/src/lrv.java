// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class lrv extends lqd
{

    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private static final String f;

    public lrv()
    {
        super(b, new String[] {
            c
        });
    }

    private static String a(String s, int i, Set set)
    {
        switch (lrw.a[i - 1])
        {
        default:
            return s;

        case 1: // '\001'
            try
            {
                set = b.x(s);
            }
            // Misplaced declaration of an exception variable
            catch (Set set)
            {
                lqh.a("Joiner: unsupported encoding", set);
                return s;
            }
            return set;

        case 2: // '\002'
            s = s.replace("\\", "\\\\");
            set = set.iterator();
            break;
        }
        while (set.hasNext()) 
        {
            String s1 = ((Character)set.next()).toString();
            s = s.replace(s1, (new StringBuilder("\\")).append(s1).toString());
        }
        return s;
    }

    private void a(StringBuilder stringbuilder, String s, int i, Set set)
    {
        stringbuilder.append(a(s, i, set));
    }

    private static void a(Set set, String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            set.add(Character.valueOf(s.charAt(i)));
        }

    }

    public final ksp a(Map map)
    {
        ksp ksp1 = (ksp)map.get(c);
        if (ksp1 == null)
        {
            return ltw.f();
        }
        Object obj = (ksp)map.get(d);
        Object obj1;
        StringBuilder stringbuilder;
        int i;
        if (obj != null)
        {
            obj = ltw.a(((ksp) (obj)));
        } else
        {
            obj = "";
        }
        obj1 = (ksp)map.get(e);
        if (obj1 != null)
        {
            obj1 = ltw.a(((ksp) (obj1)));
        } else
        {
            obj1 = "=";
        }
        i = lrx.a;
        map = (ksp)map.get(f);
        String s;
        String s1;
        int j;
        boolean flag;
        int k;
        if (map != null)
        {
            map = ltw.a(map);
            if ("url".equals(map))
            {
                i = lrx.b;
                map = null;
            } else
            if ("backslash".equals(map))
            {
                i = lrx.c;
                map = new HashSet();
                a(((Set) (map)), ((String) (obj)));
                a(((Set) (map)), ((String) (obj1)));
                map.remove(Character.valueOf('\\'));
            } else
            {
                lqh.a((new StringBuilder("Joiner: unsupported escape type: ")).append(map).toString());
                return ltw.f();
            }
        } else
        {
            map = null;
        }
        stringbuilder = new StringBuilder();
        ksp1.c;
        JVM INSTR tableswitch 2 3: default 148
    //                   2 253
    //                   3 320;
           goto _L1 _L2 _L3
_L1:
        a(stringbuilder, ltw.a(ksp1), i, ((Set) (map)));
_L5:
        return ltw.a(stringbuilder.toString());
_L2:
        flag = true;
        obj1 = ksp1.e;
        k = obj1.length;
        j = 0;
        while (j < k) 
        {
            ksp1 = obj1[j];
            if (!flag)
            {
                stringbuilder.append(((String) (obj)));
            }
            a(stringbuilder, ltw.a(ksp1), i, ((Set) (map)));
            j++;
            flag = false;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        j = 0;
        while (j < ksp1.f.length) 
        {
            if (j > 0)
            {
                stringbuilder.append(((String) (obj)));
            }
            s = ltw.a(ksp1.f[j]);
            s1 = ltw.a(ksp1.g[j]);
            a(stringbuilder, s, i, ((Set) (map)));
            stringbuilder.append(((String) (obj1)));
            a(stringbuilder, s1, i, ((Set) (map)));
            j++;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final boolean b()
    {
        return true;
    }

    static 
    {
        b = kse.z.toString();
        c = ksf.f.toString();
        d = ksf.w.toString();
        e = ksf.x.toString();
        f = ksf.o.toString();
    }
}
