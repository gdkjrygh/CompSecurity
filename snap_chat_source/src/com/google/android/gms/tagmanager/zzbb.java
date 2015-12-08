// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbu, zzdd

class zzbb extends zzbu
{

    private static final String ID;

    public zzbb()
    {
        super(ID);
    }

    protected boolean zza(zzdd zzdd1, zzdd zzdd2, Map map)
    {
        return zzdd1.zza(zzdd2) <= 0;
    }

    static 
    {
        ID = zza.zzav.toString();
    }
}
