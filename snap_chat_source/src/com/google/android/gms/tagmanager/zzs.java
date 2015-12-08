// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaj, zzde, zzbf

class zzs extends zzaj
{
    public static interface zza
    {

        public abstract Object zzc(String s, Map map);
    }


    private static final String ID;
    private static final String zzaxp;
    private static final String zzayb;
    private final zza zzayc;

    public zzs(zza zza1)
    {
        super(ID, new String[] {
            zzayb
        });
        zzayc = zza1;
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        String s = zzde.zzg((com.google.android.gms.internal.zzd.zza)map.get(zzayb));
        HashMap hashmap = new HashMap();
        map = (com.google.android.gms.internal.zzd.zza)map.get(zzaxp);
        if (map != null)
        {
            map = ((Map) (zzde.zzl(map)));
            if (!(map instanceof Map))
            {
                zzbf.zzac("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return zzde.zzuf();
            }
            java.util.Map.Entry entry;
            for (map = ((Map)map).entrySet().iterator(); map.hasNext(); hashmap.put(entry.getKey().toString(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
        try
        {
            map = zzde.zzx(zzayc.zzc(s, hashmap));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            zzbf.zzac((new StringBuilder("Custom macro/tag ")).append(s).append(" threw exception ").append(map.getMessage()).toString());
            return zzde.zzuf();
        }
        return map;
    }

    public boolean zzsD()
    {
        return false;
    }

    static 
    {
        ID = com.google.android.gms.internal.zza.zzL.toString();
        zzayb = zzb.zzcV.toString();
        zzaxp = zzb.zzbl.toString();
    }
}
