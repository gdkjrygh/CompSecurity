// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaj, zzde

class zzcq extends zzaj
{

    private static final String ID;

    public zzcq()
    {
        super(ID, new String[0]);
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        return zzde.zzx(Integer.valueOf(android.os.Build.VERSION.SDK_INT));
    }

    public boolean zzsD()
    {
        return true;
    }

    static 
    {
        ID = zza.zzU.toString();
    }
}
