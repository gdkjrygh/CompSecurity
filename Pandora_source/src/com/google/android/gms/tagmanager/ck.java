// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            j

class ck extends j
{

    private static final String a;
    private static final String b;

    public ck()
    {
        super(a, new String[] {
            b
        });
    }

    public static String a()
    {
        return a;
    }

    public static String b()
    {
        return b;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        return (com.google.android.gms.internal.zzd.zza)map.get(b);
    }

    public boolean zzwn()
    {
        return true;
    }

    static 
    {
        a = zza.zzA.toString();
        b = zzb.zzfU.toString();
    }
}
