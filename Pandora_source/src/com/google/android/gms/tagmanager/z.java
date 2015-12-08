// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            j, zza, zzdf

class z extends j
{

    private static final String a;
    private final com.google.android.gms.tagmanager.zza b;

    public z(Context context)
    {
        this(zza.a(context));
    }

    z(com.google.android.gms.tagmanager.zza zza1)
    {
        super(a, new String[0]);
        b = zza1;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        map = b.a();
        if (map == null)
        {
            return zzdf.zzxW();
        } else
        {
            return zzdf.zzE(map);
        }
    }

    public boolean zzwn()
    {
        return false;
    }

    static 
    {
        a = zza.zzu.toString();
    }
}
