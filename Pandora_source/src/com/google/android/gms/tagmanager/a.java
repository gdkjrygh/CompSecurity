// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            j, zzdf

class a extends j
{

    private static final String a;
    private final Context b;

    public a(Context context)
    {
        super(a, new String[0]);
        b = context;
    }

    protected String a(Context context)
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        map = a(b);
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
        return true;
    }

    static 
    {
        a = zza.zzZ.toString();
    }
}
