// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbv, zzde

class zzan extends zzbv
{

    private static final String ID;

    public zzan()
    {
        super(ID);
    }

    protected boolean zza(zzde zzde1, zzde zzde2, Map map)
    {
        return zzde1.zza(zzde2) > 0;
    }

    static 
    {
        ID = zzad.zzci.toString();
    }
}
