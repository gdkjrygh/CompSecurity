// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            j, zzdf

class b extends j
{

    private static final String a;

    public b()
    {
        super(a, new String[0]);
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        String s1 = Build.MANUFACTURER;
        String s = Build.MODEL;
        map = s;
        if (!s.startsWith(s1))
        {
            map = s;
            if (!s1.equals("unknown"))
            {
                map = (new StringBuilder()).append(s1).append(" ").append(s).toString();
            }
        }
        return zzdf.zzE(map);
    }

    public boolean zzwn()
    {
        return true;
    }

    static 
    {
        a = zza.zzF.toString();
    }
}
