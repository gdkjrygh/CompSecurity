// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            j, cc, zzbg, zzdf

class x extends j
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/x$a, s);
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

    public x()
    {
        super(a, new String[] {
            b
        });
    }

    private String a(String s, a a1, Set set)
    {
        static class _cls1
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
                a1 = cc.a(s);
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                com.google.android.gms.tagmanager.zzbg.zzb("Joiner: unsupported encoding", a1);
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

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        com.google.android.gms.internal.zzd.zza zza1 = (com.google.android.gms.internal.zzd.zza)map.get(b);
        if (zza1 == null)
        {
            return zzdf.zzxW();
        }
        Object obj = (com.google.android.gms.internal.zzd.zza)map.get(c);
        String s;
        Object obj1;
        StringBuilder stringbuilder;
        if (obj != null)
        {
            s = zzdf.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        } else
        {
            s = "";
        }
        obj = (com.google.android.gms.internal.zzd.zza)map.get(d);
        if (obj != null)
        {
            obj1 = zzdf.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        } else
        {
            obj1 = "=";
        }
        obj = a.a;
        map = (com.google.android.gms.internal.zzd.zza)map.get(e);
        String s1;
        String s2;
        int i;
        boolean flag;
        int k;
        if (map != null)
        {
            map = zzdf.zzg(map);
            if ("url".equals(map))
            {
                obj = a.b;
                map = null;
            } else
            if ("backslash".equals(map))
            {
                obj = a.c;
                map = new HashSet();
                a(map, s);
                a(map, ((String) (obj1)));
                map.remove(Character.valueOf('\\'));
            } else
            {
                zzbg.zzak((new StringBuilder()).append("Joiner: unsupported escape type: ").append(map).toString());
                return zzdf.zzxW();
            }
        } else
        {
            map = null;
        }
        stringbuilder = new StringBuilder();
        zza1.type;
        JVM INSTR tableswitch 2 3: default 144
    //                   2 254
    //                   3 323;
           goto _L1 _L2 _L3
_L1:
        a(stringbuilder, zzdf.zzg(zza1), ((a) (obj)), map);
_L5:
        return zzdf.zzE(stringbuilder.toString());
_L2:
        flag = true;
        obj1 = zza1.zzhl;
        k = obj1.length;
        i = 0;
        while (i < k) 
        {
            zza1 = obj1[i];
            if (!flag)
            {
                stringbuilder.append(s);
            }
            a(stringbuilder, zzdf.zzg(zza1), ((a) (obj)), map);
            i++;
            flag = false;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        i = 0;
        while (i < zza1.zzhm.length) 
        {
            if (i > 0)
            {
                stringbuilder.append(s);
            }
            s1 = zzdf.zzg(zza1.zzhm[i]);
            s2 = zzdf.zzg(zza1.zzhn[i]);
            a(stringbuilder, s1, ((a) (obj)), map);
            stringbuilder.append(((String) (obj1)));
            a(stringbuilder, s2, ((a) (obj)), map);
            i++;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean zzwn()
    {
        return true;
    }

    static 
    {
        a = zza.zzae.toString();
        b = zzb.zzbO.toString();
        c = zzb.zzdM.toString();
        d = zzb.zzdQ.toString();
        e = zzb.zzdj.toString();
    }
}
