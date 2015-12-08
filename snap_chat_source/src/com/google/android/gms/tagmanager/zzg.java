// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaj, zzde, zzbf

class zzg extends zzaj
{

    private static final String ID;
    private final Context mContext;

    public zzg(Context context)
    {
        super(ID, new String[0]);
        mContext = context;
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        try
        {
            map = mContext.getPackageManager();
            map = zzde.zzx(map.getApplicationLabel(map.getApplicationInfo(mContext.getPackageName(), 0)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            zzbf.zzb("App name is not found.", map);
            return zzde.zzuf();
        }
        return map;
    }

    public boolean zzsD()
    {
        return true;
    }

    static 
    {
        ID = zza.zzx.toString();
    }
}
