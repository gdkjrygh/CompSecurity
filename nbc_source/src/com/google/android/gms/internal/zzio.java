// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzio extends zznq
{

    private final Map zzyn = new HashMap();

    public zzio()
    {
    }

    private String zzaM(String s)
    {
        zzu.zzcj(s);
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (s.startsWith("&"))
            {
                s1 = s.substring(1);
            }
        }
        zzu.zzh(s1, "Name can not be empty or \"&\"");
        return s1;
    }

    public void set(String s, String s1)
    {
        s = zzaM(s);
        zzyn.put(s, s1);
    }

    public String toString()
    {
        return zzy(zzyn);
    }

    public void zza(zzio zzio1)
    {
        zzu.zzu(zzio1);
        zzio1.zzyn.putAll(zzyn);
    }

    public volatile void zza(zznq zznq1)
    {
        zza((zzio)zznq1);
    }

    public Map zzhv()
    {
        return Collections.unmodifiableMap(zzyn);
    }
}
