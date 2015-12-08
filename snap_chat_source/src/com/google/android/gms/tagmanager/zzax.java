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
//            zzaj, zzdi, zzbf, zzde

class zzax extends zzaj
{
    static final class zza extends Enum
    {

        public static final zza zzayY;
        public static final zza zzayZ;
        public static final zza zzaza;
        private static final zza zzazb[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/tagmanager/zzax$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzazb.clone();
        }

        static 
        {
            zzayY = new zza("NONE", 0);
            zzayZ = new zza("URL", 1);
            zzaza = new zza("BACKSLASH", 2);
            zzazb = (new zza[] {
                zzayY, zzayZ, zzaza
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String ID;
    private static final String zzayC;
    private static final String zzayU;
    private static final String zzayV;
    private static final String zzayW;

    public zzax()
    {
        super(ID, new String[] {
            zzayC
        });
    }

    private String zza(String s, zza zza1, Set set)
    {
        static class _cls1
        {

            static final int zzayX[];

            static 
            {
                zzayX = new int[zza.values().length];
                try
                {
                    zzayX[zza.zzayZ.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    zzayX[zza.zzaza.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    zzayX[zza.zzayY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.zzayX[zza1.ordinal()])
        {
        default:
            return s;

        case 1: // '\001'
            try
            {
                zza1 = zzdi.zzdv(s);
            }
            // Misplaced declaration of an exception variable
            catch (zza zza1)
            {
                com.google.android.gms.tagmanager.zzbf.zzb("Joiner: unsupported encoding", zza1);
                return s;
            }
            return zza1;

        case 2: // '\002'
            s = s.replace("\\", "\\\\");
            zza1 = set.iterator();
            break;
        }
        while (zza1.hasNext()) 
        {
            set = ((Character)zza1.next()).toString();
            s = s.replace(set, (new StringBuilder("\\")).append(set).toString());
        }
        return s;
    }

    private void zza(StringBuilder stringbuilder, String s, zza zza1, Set set)
    {
        stringbuilder.append(zza(s, zza1, set));
    }

    private void zza(Set set, String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            set.add(Character.valueOf(s.charAt(i)));
        }

    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        com.google.android.gms.internal.zzd.zza zza1 = (com.google.android.gms.internal.zzd.zza)map.get(zzayC);
        if (zza1 == null)
        {
            return zzde.zzuf();
        }
        Object obj = (com.google.android.gms.internal.zzd.zza)map.get(zzayU);
        String s;
        Object obj1;
        StringBuilder stringbuilder;
        if (obj != null)
        {
            s = zzde.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        } else
        {
            s = "";
        }
        obj = (com.google.android.gms.internal.zzd.zza)map.get(zzayV);
        if (obj != null)
        {
            obj1 = zzde.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        } else
        {
            obj1 = "=";
        }
        obj = zza.zzayY;
        map = (com.google.android.gms.internal.zzd.zza)map.get(zzayW);
        String s1;
        String s2;
        int i;
        boolean flag;
        int j;
        if (map != null)
        {
            map = zzde.zzg(map);
            if ("url".equals(map))
            {
                obj = zza.zzayZ;
                map = null;
            } else
            if ("backslash".equals(map))
            {
                obj = zza.zzaza;
                map = new HashSet();
                zza(map, s);
                zza(map, ((String) (obj1)));
                map.remove(Character.valueOf('\\'));
            } else
            {
                zzbf.zzZ((new StringBuilder("Joiner: unsupported escape type: ")).append(map).toString());
                return zzde.zzuf();
            }
        } else
        {
            map = null;
        }
        stringbuilder = new StringBuilder();
        zza1.type;
        JVM INSTR tableswitch 2 3: default 144
    //                   2 251
    //                   3 320;
           goto _L1 _L2 _L3
_L1:
        zza(stringbuilder, zzde.zzg(zza1), ((zza) (obj)), map);
_L5:
        return zzde.zzx(stringbuilder.toString());
_L2:
        flag = true;
        obj1 = zza1.zzgw;
        j = obj1.length;
        i = 0;
        while (i < j) 
        {
            zza1 = obj1[i];
            if (!flag)
            {
                stringbuilder.append(s);
            }
            zza(stringbuilder, zzde.zzg(zza1), ((zza) (obj)), map);
            i++;
            flag = false;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        i = 0;
        while (i < zza1.zzgx.length) 
        {
            if (i > 0)
            {
                stringbuilder.append(s);
            }
            s1 = zzde.zzg(zza1.zzgx[i]);
            s2 = zzde.zzg(zza1.zzgy[i]);
            zza(stringbuilder, s1, ((zza) (obj)), map);
            stringbuilder.append(((String) (obj1)));
            zza(stringbuilder, s2, ((zza) (obj)), map);
            i++;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean zzsD()
    {
        return true;
    }

    static 
    {
        ID = com.google.android.gms.internal.zza.zzae.toString();
        zzayC = zzb.zzbw.toString();
        zzayU = zzb.zzdi.toString();
        zzayV = zzb.zzdm.toString();
        zzayW = zzb.zzcH.toString();
    }
}
