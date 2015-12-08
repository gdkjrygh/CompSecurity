// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.e;
import com.google.android.gms.internal.f;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, cp, ak, cl

final class ac extends o
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/ac$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("NONE", 0);
            b = new a("URL", 1);
            c = new a("BACKSLASH", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;

    public ac()
    {
        super(a, new String[] {
            b
        });
    }

    private static String a(String s, a a1, Set set)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[a1.ordinal()])
        {
        default:
            return s;

        case 1: // '\001'
            try
            {
                a1 = cp.a(s);
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                ak.a("Joiner: unsupported encoding", a1);
                return s;
            }
            return a1;

        case 2: // '\002'
            s = s.replace("\\", "\\\\");
            a1 = set.iterator();
            break;
        }
        while (a1.hasNext()) 
        {
            set = ((Character)a1.next()).toString();
            s = s.replace(set, (new StringBuilder("\\")).append(set).toString());
        }
        return s;
    }

    private static void a(StringBuilder stringbuilder, String s, a a1, Set set)
    {
        stringbuilder.append(a(s, a1, set));
    }

    private static void a(Set set, String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            set.add(Character.valueOf(s.charAt(i)));
        }

    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        com.google.android.gms.internal.h.a a1 = (com.google.android.gms.internal.h.a)map.get(b);
        if (a1 == null)
        {
            return com.google.android.gms.tagmanager.cl.f();
        }
        Object obj = (com.google.android.gms.internal.h.a)map.get(c);
        String s;
        Object obj1;
        StringBuilder stringbuilder;
        if (obj != null)
        {
            s = cl.a(((com.google.android.gms.internal.h.a) (obj)));
        } else
        {
            s = "";
        }
        obj = (com.google.android.gms.internal.h.a)map.get(d);
        if (obj != null)
        {
            obj1 = cl.a(((com.google.android.gms.internal.h.a) (obj)));
        } else
        {
            obj1 = "=";
        }
        obj = a.a;
        map = (com.google.android.gms.internal.h.a)map.get(e);
        String s1;
        String s2;
        int i;
        boolean flag;
        int j;
        if (map != null)
        {
            map = cl.a(map);
            if ("url".equals(map))
            {
                obj = a.b;
                map = null;
            } else
            if ("backslash".equals(map))
            {
                obj = a.c;
                map = new HashSet();
                a(((Set) (map)), s);
                a(((Set) (map)), ((String) (obj1)));
                map.remove(Character.valueOf('\\'));
            } else
            {
                ak.a((new StringBuilder("Joiner: unsupported escape type: ")).append(map).toString());
                return com.google.android.gms.tagmanager.cl.f();
            }
        } else
        {
            map = null;
        }
        stringbuilder = new StringBuilder();
        a1.a;
        JVM INSTR tableswitch 2 3: default 144
    //                   2 248
    //                   3 316;
           goto _L1 _L2 _L3
_L1:
        a(stringbuilder, cl.a(a1), ((a) (obj)), ((Set) (map)));
_L5:
        return cl.a(stringbuilder.toString());
_L2:
        flag = true;
        obj1 = a1.c;
        j = obj1.length;
        i = 0;
        while (i < j) 
        {
            a1 = obj1[i];
            if (!flag)
            {
                stringbuilder.append(s);
            }
            a(stringbuilder, cl.a(a1), ((a) (obj)), ((Set) (map)));
            i++;
            flag = false;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        i = 0;
        while (i < a1.d.length) 
        {
            if (i > 0)
            {
                stringbuilder.append(s);
            }
            s1 = cl.a(a1.d[i]);
            s2 = cl.a(a1.e[i]);
            a(stringbuilder, s1, ((a) (obj)), ((Set) (map)));
            stringbuilder.append(((String) (obj1)));
            a(stringbuilder, s2, ((a) (obj)), ((Set) (map)));
            i++;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final boolean a()
    {
        return true;
    }

    static 
    {
        a = e.K.toString();
        b = f.p.toString();
        c = f.bn.toString();
        d = f.br.toString();
        e = f.aK.toString();
    }
}
