// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            j, zza, zzdf

class aw extends j
{

    private static final String a;
    private final com.google.android.gms.tagmanager.zza b;

    public aw(Context context)
    {
        this(zza.a(context));
    }

    aw(com.google.android.gms.tagmanager.zza zza1)
    {
        super(a, new String[0]);
        b = zza1;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        boolean flag;
        if (!b.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return zzdf.zzE(Boolean.valueOf(flag));
    }

    public boolean zzwn()
    {
        return false;
    }

    static 
    {
        a = zza.zzv.toString();
    }
}
