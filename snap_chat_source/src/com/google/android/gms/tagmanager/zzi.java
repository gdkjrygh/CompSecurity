// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzdc, zzde, zzbf, zzaq, 
//            zzcu, zzy

class zzi extends zzdc
{
    public static interface zza
    {

        public abstract zzaq zzsE();
    }


    private static final String ID;
    private static final String URL;
    private static final String zzaxp;
    private static final String zzaxq;
    static final String zzaxr;
    private static final Set zzaxs = new HashSet();
    private final Context mContext;
    private final zza zzaxt;

    public zzi(Context context)
    {
        this(context, new zza(context) {

            final Context zznK;

            public zzaq zzsE()
            {
                return zzy.zzak(zznK);
            }

            
            {
                zznK = context;
                super();
            }
        });
    }

    zzi(Context context, zza zza1)
    {
        super(ID, new String[] {
            URL
        });
        zzaxt = zza1;
        mContext = context;
    }

    private boolean zzcI(String s)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = zzcK(s);
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (zzcJ(s))
        {
            zzaxs.add(s);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_44;
        s;
        throw s;
        flag = false;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void zzJ(Map map)
    {
        String s;
        if (map.get(zzaxq) != null)
        {
            s = zzde.zzg((com.google.android.gms.internal.zzd.zza)map.get(zzaxq));
        } else
        {
            s = null;
        }
        if (s == null || !zzcI(s)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.net.Uri.Builder builder = Uri.parse(zzde.zzg((com.google.android.gms.internal.zzd.zza)map.get(URL))).buildUpon();
        map = (com.google.android.gms.internal.zzd.zza)map.get(zzaxp);
        if (map != null)
        {
            map = ((Map) (zzde.zzl(map)));
            if (!(map instanceof List))
            {
                zzbf.zzZ((new StringBuilder("ArbitraryPixel: additional params not a list: not sending partial hit: ")).append(builder.build().toString()).toString());
                return;
            }
            for (map = ((List)map).iterator(); map.hasNext();)
            {
                Object obj = map.next();
                if (!(obj instanceof Map))
                {
                    zzbf.zzZ((new StringBuilder("ArbitraryPixel: additional params contains non-map: not sending partial hit: ")).append(builder.build().toString()).toString());
                    return;
                }
                obj = ((Map)obj).entrySet().iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                    builder.appendQueryParameter(entry.getKey().toString(), entry.getValue().toString());
                }
            }

        }
        map = builder.build().toString();
        zzaxt.zzsE().zzcY(map);
        zzbf.zzab((new StringBuilder("ArbitraryPixel: url = ")).append(map).toString());
        if (s == null) goto _L1; else goto _L3
_L3:
        com/google/android/gms/tagmanager/zzi;
        JVM INSTR monitorenter ;
        zzaxs.add(s);
        com.google.android.gms.tagmanager.zzcu.zza(mContext, zzaxr, s, "true");
        com/google/android/gms/tagmanager/zzi;
        JVM INSTR monitorexit ;
        return;
        map;
        com/google/android/gms/tagmanager/zzi;
        JVM INSTR monitorexit ;
        throw map;
    }

    boolean zzcJ(String s)
    {
        return mContext.getSharedPreferences(zzaxr, 0).contains(s);
    }

    boolean zzcK(String s)
    {
        return zzaxs.contains(s);
    }

    static 
    {
        ID = com.google.android.gms.internal.zza.zzay.toString();
        URL = zzb.zzeX.toString();
        zzaxp = zzb.zzbl.toString();
        zzaxq = zzb.zzeW.toString();
        zzaxr = (new StringBuilder("gtm_")).append(ID).append("_unrepeatable").toString();
    }
}
