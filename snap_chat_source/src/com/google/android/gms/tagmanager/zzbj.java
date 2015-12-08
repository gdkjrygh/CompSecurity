// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaj, zzde

class zzbj extends zzaj
{

    private static final String ID;
    private final Context mContext;

    public zzbj(Context context)
    {
        super(ID, new String[0]);
        mContext = context;
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        map = zzal(mContext);
        if (map == null)
        {
            return zzde.zzuf();
        } else
        {
            return zzde.zzx(map);
        }
    }

    protected String zzal(Context context)
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public boolean zzsD()
    {
        return true;
    }

    static 
    {
        ID = zza.zzaf.toString();
    }
}
