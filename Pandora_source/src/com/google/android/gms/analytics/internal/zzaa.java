// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzal, zzc, Command

public class zzaa
{

    private final List zzId;
    private final long zzIe;
    private final long zzIf;
    private final int zzIg;
    private final boolean zzIh;
    private final String zzIi;
    private final Map zzvi;

    public zzaa(zzc zzc1, Map map, long l, boolean flag)
    {
        this(zzc1, map, l, flag, 0L, 0, null);
    }

    public zzaa(zzc zzc1, Map map, long l, boolean flag, long l1, 
            int i)
    {
        this(zzc1, map, l, flag, l1, i, null);
    }

    public zzaa(zzc zzc1, Map map, long l, boolean flag, long l1, 
            int i, List list)
    {
        zzv.zzr(zzc1);
        zzv.zzr(map);
        zzIf = l;
        zzIh = flag;
        zzIe = l1;
        zzIg = i;
        Object obj;
        if (list != null)
        {
            obj = list;
        } else
        {
            obj = Collections.EMPTY_LIST;
        }
        zzId = ((List) (obj));
        zzIi = zzf(list);
        list = new HashMap();
        obj = map.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            if (zzg(entry1.getKey()))
            {
                String s1 = zza(zzc1, entry1.getKey());
                if (s1 != null)
                {
                    list.put(s1, zzb(zzc1, entry1.getValue()));
                }
            }
        } while (true);
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (!zzg(entry.getKey()))
            {
                String s = zza(zzc1, entry.getKey());
                if (s != null)
                {
                    list.put(s, zzb(zzc1, entry.getValue()));
                }
            }
        } while (true);
        if (!TextUtils.isEmpty(zzIi))
        {
            zzal.zzb(list, "_v", zzIi);
            if (zzIi.equals("ma4.0.0") || zzIi.equals("ma4.0.1"))
            {
                list.remove("adid");
            }
        }
        zzvi = Collections.unmodifiableMap(list);
    }

    public static zzaa zza(zzc zzc1, zzaa zzaa1, Map map)
    {
        return new zzaa(zzc1, map, zzaa1.zziP(), zzaa1.zziR(), zzaa1.zziO(), zzaa1.zziN(), zzaa1.zziQ());
    }

    private static String zza(zzc zzc1, Object obj)
    {
        if (obj == null)
        {
            zzc1 = null;
        } else
        {
            Object obj1 = obj.toString();
            obj = obj1;
            if (((String) (obj1)).startsWith("&"))
            {
                obj = ((String) (obj1)).substring(1);
            }
            int i = ((String) (obj)).length();
            obj1 = obj;
            if (i > 256)
            {
                obj1 = ((String) (obj)).substring(0, 256);
                zzc1.zzc("Hit param name is too long and will be trimmed", Integer.valueOf(i), obj1);
            }
            zzc1 = ((zzc) (obj1));
            if (TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                return null;
            }
        }
        return zzc1;
    }

    private static String zzb(zzc zzc1, Object obj)
    {
        Object obj1;
        int i;
        if (obj == null)
        {
            obj = "";
        } else
        {
            obj = obj.toString();
        }
        i = ((String) (obj)).length();
        obj1 = obj;
        if (i > 8192)
        {
            obj1 = ((String) (obj)).substring(0, 8192);
            zzc1.zzc("Hit param value is too long and will be trimmed", Integer.valueOf(i), obj1);
        }
        return ((String) (obj1));
    }

    private static String zzf(List list)
    {
        if (list == null) goto _L2; else goto _L1
_L1:
        list = list.iterator();
_L5:
        if (!list.hasNext()) goto _L2; else goto _L3
_L3:
        Command command = (Command)list.next();
        if (!"appendVersion".equals(command.getId())) goto _L5; else goto _L4
_L4:
        list = command.getValue();
_L7:
        if (TextUtils.isEmpty(list))
        {
            return null;
        } else
        {
            return list;
        }
_L2:
        list = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static boolean zzg(Object obj)
    {
        if (obj == null)
        {
            return false;
        } else
        {
            return obj.toString().startsWith("&");
        }
    }

    private String zzm(String s, String s1)
    {
        zzv.zzbS(s);
        boolean flag;
        if (!s.startsWith("&"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zzb(flag, "Short param name required");
        s = (String)zzvi.get(s);
        if (s != null)
        {
            return s;
        } else
        {
            return s1;
        }
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("ht=").append(zzIf);
        if (zzIe != 0L)
        {
            stringbuffer.append(", dbId=").append(zzIe);
        }
        if ((long)zzIg != 0L)
        {
            stringbuffer.append(", appUID=").append(zzIg);
        }
        Object obj = new ArrayList(zzvi.keySet());
        Collections.sort(((List) (obj)));
        String s;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); stringbuffer.append((String)zzvi.get(s)))
        {
            s = (String)((Iterator) (obj)).next();
            stringbuffer.append(", ");
            stringbuffer.append(s);
            stringbuffer.append("=");
        }

        return stringbuffer.toString();
    }

    public Map zzhe()
    {
        return zzvi;
    }

    public int zziN()
    {
        return zzIg;
    }

    public long zziO()
    {
        return zzIe;
    }

    public long zziP()
    {
        return zzIf;
    }

    public List zziQ()
    {
        return zzId;
    }

    public boolean zziR()
    {
        return zzIh;
    }

    public long zziS()
    {
        return zzal.zzaV(zzm("_s", "0"));
    }

    public String zziT()
    {
        return zzm("_m", "");
    }
}
