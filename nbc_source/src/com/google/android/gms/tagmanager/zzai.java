// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzcp, zzdf

class zzai extends zzak
{

    private static final String ID;
    private final zzcp zzaKA;

    public zzai(zzcp zzcp1)
    {
        super(ID, new String[0]);
        zzaKA = zzcp1;
    }

    public com.google.android.gms.internal.zzag.zza zzE(Map map)
    {
        map = zzaKA.zzzp();
        if (map == null)
        {
            return zzdf.zzzQ();
        } else
        {
            return zzdf.zzI(map);
        }
    }

    public boolean zzyh()
    {
        return false;
    }

    static 
    {
        ID = zzad.zzbs.toString();
    }
}
