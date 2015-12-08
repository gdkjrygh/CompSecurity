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
//            aj, dm, bh, di

class az extends aj
{
    private static final class a extends Enum
    {

        public static final a arN;
        public static final a arO;
        public static final a arP;
        private static final a arQ[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/az$a, s);
        }

        public static a[] values()
        {
            return (a[])arQ.clone();
        }

        static 
        {
            arN = new a("NONE", 0);
            arO = new a("URL", 1);
            arP = new a("BACKSLASH", 2);
            arQ = (new a[] {
                arN, arO, arP
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String ID;
    private static final String arJ;
    private static final String arK;
    private static final String arL;
    private static final String arp;

    public az()
    {
        super(ID, new String[] {
            arp
        });
    }

    private String a(String s, a a1, Set set)
    {
        static class _cls1
        {

            static final int arM[];

            static 
            {
                arM = new int[a.values().length];
                try
                {
                    arM[a.arO.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    arM[a.arP.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    arM[a.arN.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.arM[a1.ordinal()])
        {
        default:
            return s;

        case 1: // '\001'
            try
            {
                a1 = dm.dg(s);
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

    public com.google.android.gms.internal.d.a B(Map map)
    {
        com.google.android.gms.internal.d.a a1 = (com.google.android.gms.internal.d.a)map.get(arp);
        if (a1 == null)
        {
            return di.rb();
        }
        Object obj = (com.google.android.gms.internal.d.a)map.get(arJ);
        String s;
        Object obj1;
        StringBuilder stringbuilder;
        if (obj != null)
        {
            s = di.j(((com.google.android.gms.internal.d.a) (obj)));
        } else
        {
            s = "";
        }
        obj = (com.google.android.gms.internal.d.a)map.get(arK);
        if (obj != null)
        {
            obj1 = di.j(((com.google.android.gms.internal.d.a) (obj)));
        } else
        {
            obj1 = "=";
        }
        obj = a.arN;
        map = (com.google.android.gms.internal.d.a)map.get(arL);
        String s1;
        String s2;
        int i;
        boolean flag;
        int j;
        if (map != null)
        {
            map = di.j(map);
            if ("url".equals(map))
            {
                obj = a.arO;
                map = null;
            } else
            if ("backslash".equals(map))
            {
                obj = a.arP;
                map = new HashSet();
                a(map, s);
                a(map, ((String) (obj1)));
                map.remove(Character.valueOf('\\'));
            } else
            {
                bh.T((new StringBuilder()).append("Joiner: unsupported escape type: ").append(map).toString());
                return di.rb();
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
        a(stringbuilder, di.j(a1), ((a) (obj)), map);
_L5:
        return di.u(stringbuilder.toString());
_L2:
        flag = true;
        obj1 = a1.gw;
        j = obj1.length;
        i = 0;
        while (i < j) 
        {
            a1 = obj1[i];
            if (!flag)
            {
                stringbuilder.append(s);
            }
            a(stringbuilder, di.j(a1), ((a) (obj)), map);
            i++;
            flag = false;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        i = 0;
        while (i < a1.gx.length) 
        {
            if (i > 0)
            {
                stringbuilder.append(s);
            }
            s1 = di.j(a1.gx[i]);
            s2 = di.j(a1.gy[i]);
            a(stringbuilder, s1, ((a) (obj)), map);
            stringbuilder.append(((String) (obj1)));
            a(stringbuilder, s2, ((a) (obj)), map);
            i++;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean pe()
    {
        return true;
    }

    static 
    {
        ID = com.google.android.gms.internal.a.ae.toString();
        arp = b.bw.toString();
        arJ = b.di.toString();
        arK = b.dm.toString();
        arL = b.cH.toString();
    }
}
