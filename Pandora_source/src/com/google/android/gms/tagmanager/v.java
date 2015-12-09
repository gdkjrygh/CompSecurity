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

class v extends j
{

    private static final String a;
    private static final String b;
    private final Context c;

    public v(Context context)
    {
        super(a, new String[0]);
        c = context;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        if ((com.google.android.gms.internal.zzd.zza)map.get(b) != null)
        {
            map = zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(b));
        } else
        {
            map = null;
        }
        map = w.a(c, map);
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
        a = zza.zzad.toString();
        b = zzb.zzcq.toString();
    }
}
