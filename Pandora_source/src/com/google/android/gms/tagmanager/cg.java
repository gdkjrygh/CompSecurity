// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            j, zzdf, zzbg

class cg extends j
{

    private static final String a;
    private final Context b;

    public cg(Context context)
    {
        super(a, new String[0]);
        b = context;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        try
        {
            map = zzdf.zzE(Integer.valueOf(b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionCode));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            zzbg.zzak((new StringBuilder()).append("Package name ").append(b.getPackageName()).append(" not found. ").append(map.getMessage()).toString());
            return zzdf.zzxW();
        }
        return map;
    }

    public boolean zzwn()
    {
        return true;
    }

    static 
    {
        a = zza.zzy.toString();
    }
}
