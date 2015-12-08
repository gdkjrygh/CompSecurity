// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            j, bl, zzdf

class h extends j
{

    private static final String a;
    private final bl b;

    public h(bl bl1)
    {
        super(a, new String[0]);
        b = bl1;
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
        a = zza.zzK.toString();
    }
}
