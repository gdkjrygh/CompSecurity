// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zza;
import db;
import dc;
import java.util.Date;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            zzba, zzax

public final class zzdz
{

    public static db zzb(zzba zzba1)
    {
        int i = 0;
        db adb[] = new db[6];
        adb[0] = db.b;
        adb[1] = db.c;
        adb[2] = db.d;
        adb[3] = db.e;
        adb[4] = db.f;
        adb[5] = db.g;
        for (; i < 6; i++)
        {
            if (adb[i].a.getWidth() == zzba1.width && adb[i].a.getHeight() == zzba1.height)
            {
                return adb[i];
            }
        }

        return new db(zza.zza(zzba1.width, zzba1.height, zzba1.zzpa));
    }

    public static dc zzd(zzax zzax1)
    {
        if (zzax1.zzoN != null)
        {
            new HashSet(zzax1.zzoN);
        }
        new Date(zzax1.zzoL);
        zzn$14f54961(zzax1.zzoM);
        boolean flag = zzax1.zzoO;
        zzax1 = zzax1.zzoT;
        return new dc();
    }

    public static int zzn$14f54961(int i)
    {
        switch (i)
        {
        default:
            return 1;

        case 2: // '\002'
            return 3;

        case 1: // '\001'
            return 2;
        }
    }
}
