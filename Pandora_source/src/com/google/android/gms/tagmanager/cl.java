// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            j, zzdf

class cl extends j
{

    private static final String a;
    private final String b;

    public cl(String s)
    {
        super(a, new String[0]);
        b = s;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        if (b == null)
        {
            return zzdf.zzxW();
        } else
        {
            return zzdf.zzE(b);
        }
    }

    public boolean zzwn()
    {
        return true;
    }

    static 
    {
        a = zza.zzD.toString();
    }
}
