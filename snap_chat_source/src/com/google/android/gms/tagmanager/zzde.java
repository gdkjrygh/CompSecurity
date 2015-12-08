// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzdd, zzbf

public class zzde
{

    private static final Object zzaBl = null;
    private static Long zzaBm = new Long(0L);
    private static Double zzaBn = new Double(0.0D);
    private static zzdd zzaBo = zzdd.zzI(0L);
    private static String zzaBp;
    private static Boolean zzaBq = new Boolean(false);
    private static List zzaBr = new ArrayList(0);
    private static Map zzaBs = new HashMap();
    private static com.google.android.gms.internal.zzd.zza zzaBt;

    private static double getDouble(Object obj)
    {
        if (obj instanceof Number)
        {
            return ((Number)obj).doubleValue();
        } else
        {
            zzbf.zzZ("getDouble received non-Number");
            return 0.0D;
        }
    }

    private static long zzA(Object obj)
    {
        if (obj instanceof Number)
        {
            return ((Number)obj).longValue();
        } else
        {
            zzbf.zzZ("getInt64 received non-Number");
            return 0L;
        }
    }

    private static zzdd zzdp(String s)
    {
        zzdd zzdd1;
        try
        {
            zzdd1 = zzdd.zzdn(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            zzbf.zzZ((new StringBuilder("Failed to convert '")).append(s).append("' to a number.").toString());
            return zzaBo;
        }
        return zzdd1;
    }

    private static Long zzdq(String s)
    {
        s = zzdp(s);
        if (s == zzaBo)
        {
            return zzaBm;
        } else
        {
            return Long.valueOf(s.longValue());
        }
    }

    private static Boolean zzds(String s)
    {
        if ("true".equalsIgnoreCase(s))
        {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(s))
        {
            return Boolean.FALSE;
        } else
        {
            return zzaBq;
        }
    }

    public static String zzg(com.google.android.gms.internal.zzd.zza zza)
    {
        return zzs(zzl(zza));
    }

    public static zzdd zzh(com.google.android.gms.internal.zzd.zza zza)
    {
        return zzt(zzl(zza));
    }

    public static Long zzi(com.google.android.gms.internal.zzd.zza zza)
    {
        return zzu(zzl(zza));
    }

    public static Boolean zzk(com.google.android.gms.internal.zzd.zza zza)
    {
        return zzw(zzl(zza));
    }

    public static Object zzl(com.google.android.gms.internal.zzd.zza zza)
    {
        boolean flag = false;
        int l = 0;
        int i = 0;
        if (zza == null)
        {
            return zzaBl;
        }
        switch (zza.type)
        {
        default:
            zzbf.zzZ((new StringBuilder("Failed to convert a value of type: ")).append(zza.type).toString());
            return zzaBl;

        case 1: // '\001'
            return zza.zzgv;

        case 2: // '\002'
            ArrayList arraylist = new ArrayList(zza.zzgw.length);
            zza = zza.zzgw;
            for (l = zza.length; i < l; i++)
            {
                Object obj = zzl(zza[i]);
                if (obj == zzaBl)
                {
                    return zzaBl;
                }
                arraylist.add(obj);
            }

            return arraylist;

        case 3: // '\003'
            if (zza.zzgx.length != zza.zzgy.length)
            {
                zzbf.zzZ((new StringBuilder("Converting an invalid value to object: ")).append(zza.toString()).toString());
                return zzaBl;
            }
            HashMap hashmap = new HashMap(zza.zzgy.length);
            for (int j = ((flag) ? 1 : 0); j < zza.zzgx.length; j++)
            {
                Object obj1 = zzl(zza.zzgx[j]);
                Object obj2 = zzl(zza.zzgy[j]);
                if (obj1 == zzaBl || obj2 == zzaBl)
                {
                    return zzaBl;
                }
                hashmap.put(obj1, obj2);
            }

            return hashmap;

        case 4: // '\004'
            zzbf.zzZ("Trying to convert a macro reference to object");
            return zzaBl;

        case 5: // '\005'
            zzbf.zzZ("Trying to convert a function id to object");
            return zzaBl;

        case 6: // '\006'
            return Long.valueOf(zza.zzgB);

        case 7: // '\007'
            StringBuffer stringbuffer = new StringBuffer();
            zza = zza.zzgD;
            int i1 = zza.length;
            for (int k = l; k < i1; k++)
            {
                String s = zzg(zza[k]);
                if (s == zzaBp)
                {
                    return zzaBl;
                }
                stringbuffer.append(s);
            }

            return stringbuffer.toString();

        case 8: // '\b'
            return Boolean.valueOf(zza.zzgC);
        }
    }

    public static String zzs(Object obj)
    {
        if (obj == null)
        {
            return zzaBp;
        } else
        {
            return obj.toString();
        }
    }

    public static zzdd zzt(Object obj)
    {
        if (obj instanceof zzdd)
        {
            return (zzdd)obj;
        }
        if (zzz(obj))
        {
            return zzdd.zzI(zzA(obj));
        }
        if (zzy(obj))
        {
            return zzdd.zza(Double.valueOf(getDouble(obj)));
        } else
        {
            return zzdp(zzs(obj));
        }
    }

    public static Object zztZ()
    {
        return zzaBl;
    }

    public static Long zzu(Object obj)
    {
        if (zzz(obj))
        {
            return Long.valueOf(zzA(obj));
        } else
        {
            return zzdq(zzs(obj));
        }
    }

    public static Long zzua()
    {
        return zzaBm;
    }

    public static Boolean zzuc()
    {
        return zzaBq;
    }

    public static zzdd zzud()
    {
        return zzaBo;
    }

    public static String zzue()
    {
        return zzaBp;
    }

    public static com.google.android.gms.internal.zzd.zza zzuf()
    {
        return zzaBt;
    }

    public static Boolean zzw(Object obj)
    {
        if (obj instanceof Boolean)
        {
            return (Boolean)obj;
        } else
        {
            return zzds(zzs(obj));
        }
    }

    public static com.google.android.gms.internal.zzd.zza zzx(Object obj)
    {
        com.google.android.gms.internal.zzd.zza zza;
        boolean flag;
        flag = false;
        zza = new com.google.android.gms.internal.zzd.zza();
        if (obj instanceof com.google.android.gms.internal.zzd.zza)
        {
            return (com.google.android.gms.internal.zzd.zza)obj;
        }
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        zza.type = 1;
        zza.zzgv = (String)obj;
_L4:
        zza.zzgF = flag;
        return zza;
_L2:
        if (obj instanceof List)
        {
            zza.type = 2;
            Object obj1 = (List)obj;
            obj = new ArrayList(((List) (obj1)).size());
            obj1 = ((List) (obj1)).iterator();
            flag = false;
            while (((Iterator) (obj1)).hasNext()) 
            {
                com.google.android.gms.internal.zzd.zza zza1 = zzx(((Iterator) (obj1)).next());
                if (zza1 == zzaBt)
                {
                    return zzaBt;
                }
                if (flag || zza1.zzgF)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(zza1);
            }
            zza.zzgw = (com.google.android.gms.internal.zzd.zza[])((List) (obj)).toArray(new com.google.android.gms.internal.zzd.zza[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Map)
        {
            zza.type = 3;
            Object obj2 = ((Map)obj).entrySet();
            obj = new ArrayList(((Set) (obj2)).size());
            ArrayList arraylist = new ArrayList(((Set) (obj2)).size());
            obj2 = ((Set) (obj2)).iterator();
            flag = false;
            while (((Iterator) (obj2)).hasNext()) 
            {
                Object obj3 = (java.util.Map.Entry)((Iterator) (obj2)).next();
                com.google.android.gms.internal.zzd.zza zza2 = zzx(((java.util.Map.Entry) (obj3)).getKey());
                obj3 = zzx(((java.util.Map.Entry) (obj3)).getValue());
                if (zza2 == zzaBt || obj3 == zzaBt)
                {
                    return zzaBt;
                }
                if (flag || zza2.zzgF || ((com.google.android.gms.internal.zzd.zza) (obj3)).zzgF)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(zza2);
                arraylist.add(obj3);
            }
            zza.zzgx = (com.google.android.gms.internal.zzd.zza[])((List) (obj)).toArray(new com.google.android.gms.internal.zzd.zza[0]);
            zza.zzgy = (com.google.android.gms.internal.zzd.zza[])arraylist.toArray(new com.google.android.gms.internal.zzd.zza[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (zzy(obj))
        {
            zza.type = 1;
            zza.zzgv = obj.toString();
            continue; /* Loop/switch isn't completed */
        }
        if (zzz(obj))
        {
            zza.type = 6;
            zza.zzgB = zzA(obj);
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof Boolean))
        {
            break; /* Loop/switch isn't completed */
        }
        zza.type = 8;
        zza.zzgC = ((Boolean)obj).booleanValue();
        if (true) goto _L4; else goto _L3
_L3:
        StringBuilder stringbuilder = new StringBuilder("Converting to Value from unknown object type: ");
        if (obj == null)
        {
            obj = "null";
        } else
        {
            obj = obj.getClass().toString();
        }
        zzbf.zzZ(stringbuilder.append(((String) (obj))).toString());
        return zzaBt;
    }

    private static boolean zzy(Object obj)
    {
        return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof zzdd) && ((zzdd)obj).zztU();
    }

    private static boolean zzz(Object obj)
    {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof zzdd) && ((zzdd)obj).zztV();
    }

    static 
    {
        zzaBp = new String("");
        zzaBt = zzx(zzaBp);
    }
}
