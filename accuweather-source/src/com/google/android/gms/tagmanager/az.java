// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, dk, bh, dh

class az extends aj
{
    private static final class a extends Enum
    {

        public static final a afV;
        public static final a afW;
        public static final a afX;
        private static final a afY[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/az$a, s);
        }

        public static a[] values()
        {
            return (a[])afY.clone();
        }

        static 
        {
            afV = new a("NONE", 0);
            afW = new a("URL", 1);
            afX = new a("BACKSLASH", 2);
            afY = (new a[] {
                afV, afW, afX
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String ID;
    private static final String afR;
    private static final String afS;
    private static final String afT;
    private static final String afv;

    public az()
    {
        super(ID, new String[] {
            afv
        });
    }

    private String a(String s, a a1, Set set)
    {
        static class _cls1
        {

            static final int afU[];

            static 
            {
                afU = new int[a.values().length];
                try
                {
                    afU[a.afW.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    afU[a.afX.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    afU[a.afV.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.afU[a1.ordinal()])
        {
        default:
            return s;

        case 1: // '\001'
            try
            {
                a1 = dk.cv(s);
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                com.google.android.gms.tagmanager.bh.b("Joiner: unsupported encoding", a1);
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
            s = s.replace(set, (new StringBuilder()).append("\\").append(set).toString());
        }
        return s;
    }

    private void a(StringBuilder stringbuilder, String s, a a1, Set set)
    {
        stringbuilder.append(a(s, a1, set));
    }

    private void a(Set set, String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            set.add(Character.valueOf(s.charAt(i)));
        }

    }

    public boolean lc()
    {
        return true;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        com.google.android.gms.internal.d.a a1 = (com.google.android.gms.internal.d.a)map.get(afv);
        if (a1 == null)
        {
            return dh.mY();
        }
        Object obj = (com.google.android.gms.internal.d.a)map.get(afR);
        String s;
        Object obj1;
        StringBuilder stringbuilder;
        if (obj != null)
        {
            s = dh.j(((com.google.android.gms.internal.d.a) (obj)));
        } else
        {
            s = "";
        }
        obj = (com.google.android.gms.internal.d.a)map.get(afS);
        if (obj != null)
        {
            obj1 = dh.j(((com.google.android.gms.internal.d.a) (obj)));
        } else
        {
            obj1 = "=";
        }
        obj = a.afV;
        map = (com.google.android.gms.internal.d.a)map.get(afT);
        String s1;
        String s2;
        int i;
        boolean flag;
        int j;
        if (map != null)
        {
            map = dh.j(map);
            if ("url".equals(map))
            {
                obj = a.afW;
                map = null;
            } else
            if ("backslash".equals(map))
            {
                obj = a.afX;
                map = new HashSet();
                a(map, s);
                a(map, ((String) (obj1)));
                map.remove(Character.valueOf('\\'));
            } else
            {
                bh.A((new StringBuilder()).append("Joiner: unsupported escape type: ").append(map).toString());
                return dh.mY();
            }
        } else
        {
            map = null;
        }
        stringbuilder = new StringBuilder();
        a1.type;
        JVM INSTR tableswitch 2 3: default 144
    //                   2 254
    //                   3 323;
           goto _L1 _L2 _L3
_L1:
        a(stringbuilder, dh.j(a1), ((a) (obj)), map);
_L5:
        return dh.r(stringbuilder.toString());
_L2:
        flag = true;
        obj1 = a1.fO;
        j = obj1.length;
        i = 0;
        while (i < j) 
        {
            a1 = obj1[i];
            if (!flag)
            {
                stringbuilder.append(s);
            }
            a(stringbuilder, dh.j(a1), ((a) (obj)), map);
            i++;
            flag = false;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        i = 0;
        while (i < a1.fP.length) 
        {
            if (i > 0)
            {
                stringbuilder.append(s);
            }
            s1 = dh.j(a1.fP[i]);
            s2 = dh.j(a1.fQ[i]);
            a(stringbuilder, s1, ((a) (obj)), map);
            stringbuilder.append(((String) (obj1)));
            a(stringbuilder, s2, ((a) (obj)), map);
            i++;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    static 
    {
        ID = com.google.android.gms.internal.a.ac.toString();
        afv = b.bi.toString();
        afR = b.cL.toString();
        afS = b.cO.toString();
        afT = b.co.toString();
    }
}
