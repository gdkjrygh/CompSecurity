// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaj, zzco, zzde

class zzah extends zzaj
{

    private static final String ID;
    private final zzco zzaxy;

    public zzah(zzco zzco1)
    {
        super(ID, new String[0]);
        zzaxy = zzco1;
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        map = zzaxy.zztH();
        if (map == null)
        {
            return zzde.zzuf();
        } else
        {
            return zzde.zzx(map);
        }
    }

    public boolean zzsD()
    {
        return false;
    }

    static 
    {
        ID = zza.zzK.toString();
    }
}
