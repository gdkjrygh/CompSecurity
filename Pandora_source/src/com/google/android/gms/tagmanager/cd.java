// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            j, zzdf, w

class cd extends j
{

    private static final String a;
    private static final String b;
    private static final String c;
    private final Context d;

    public cd(Context context)
    {
        super(a, new String[] {
            c
        });
        d = context;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzd.zza)map.get(c);
        if (obj == null)
        {
            return zzdf.zzxW();
        }
        obj = zzdf.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        map = (com.google.android.gms.internal.zzd.zza)map.get(b);
        if (map != null)
        {
            map = zzdf.zzg(map);
        } else
        {
            map = null;
        }
        map = w.a(d, ((String) (obj)), map);
        if (map != null)
        {
            return zzdf.zzE(map);
        } else
        {
            return zzdf.zzxW();
        }
    }

    public boolean zzwn()
    {
        return true;
    }

    static 
    {
        a = zza.zzY.toString();
        b = zzb.zzcq.toString();
        c = zzb.zzct.toString();
    }
}
