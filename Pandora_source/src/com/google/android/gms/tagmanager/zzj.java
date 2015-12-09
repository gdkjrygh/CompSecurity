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
//            by, zzdf, zzbg, q, 
//            bq, cs

class zzj extends by
{
    public static interface zza
    {

        public abstract q zzwo();
    }


    static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private static final Set f = new HashSet();
    private final zza g;
    private final Context h;

    public zzj(Context context)
    {
        this(context, new zza(context) {

            final Context a;

            public q zzwo()
            {
                return cs.a(a);
            }

            
            {
                a = context;
                super();
            }
        });
    }

    zzj(Context context, zza zza1)
    {
        super(b, new String[] {
            c
        });
        g = zza1;
        h = context;
    }

    private boolean c(String s)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = b(s);
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (a(s))
        {
            f.add(s);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_44;
        s;
        throw s;
        flag = false;
        if (true) goto _L1; else goto _L3
_L3:
    }

    boolean a(String s)
    {
        return h.getSharedPreferences(a, 0).contains(s);
    }

    boolean b(String s)
    {
        return f.contains(s);
    }

    public void zzF(Map map)
    {
        String s;
        if (map.get(e) != null)
        {
            s = zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(e));
        } else
        {
            s = null;
        }
        if (s == null || !c(s)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.net.Uri.Builder builder = Uri.parse(zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(c))).buildUpon();
        map = (com.google.android.gms.internal.zzd.zza)map.get(d);
        if (map != null)
        {
            map = ((Map) (zzdf.zzl(map)));
            if (!(map instanceof List))
            {
                zzbg.zzak((new StringBuilder()).append("ArbitraryPixel: additional params not a list: not sending partial hit: ").append(builder.build().toString()).toString());
                return;
            }
            for (map = ((List)map).iterator(); map.hasNext();)
            {
                Object obj = map.next();
                if (!(obj instanceof Map))
                {
                    zzbg.zzak((new StringBuilder()).append("ArbitraryPixel: additional params contains non-map: not sending partial hit: ").append(builder.build().toString()).toString());
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
        g.zzwo().a(map);
        zzbg.zzam((new StringBuilder()).append("ArbitraryPixel: url = ").append(map).toString());
        if (s == null) goto _L1; else goto _L3
_L3:
        com/google/android/gms/tagmanager/zzj;
        JVM INSTR monitorenter ;
        f.add(s);
        bq.a(h, a, s, "true");
        com/google/android/gms/tagmanager/zzj;
        JVM INSTR monitorexit ;
        return;
        map;
        com/google/android/gms/tagmanager/zzj;
        JVM INSTR monitorexit ;
        throw map;
    }

    static 
    {
        b = com.google.android.gms.internal.zza.zzaD.toString();
        c = zzb.zzfM.toString();
        d = zzb.zzbC.toString();
        e = zzb.zzfL.toString();
        a = (new StringBuilder()).append("gtm_").append(b).append("_unrepeatable").toString();
    }
}
