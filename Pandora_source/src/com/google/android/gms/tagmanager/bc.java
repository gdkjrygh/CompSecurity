// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            j, zzdf

class bc extends j
{

    private static final String a;
    private final Context b;

    public bc(Context context)
    {
        super(a, new String[0]);
        b = context;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        map = new DisplayMetrics();
        ((WindowManager)b.getSystemService("window")).getDefaultDisplay().getMetrics(map);
        int i = ((DisplayMetrics) (map)).widthPixels;
        int k = ((DisplayMetrics) (map)).heightPixels;
        return zzdf.zzE((new StringBuilder()).append(i).append("x").append(k).toString());
    }

    public boolean zzwn()
    {
        return true;
    }

    static 
    {
        a = zza.zzS.toString();
    }
}
