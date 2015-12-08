// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzki

public final class zzku extends zzki
{

    public String zzadH;
    public boolean zzawL;

    public zzku()
    {
    }

    public String getDescription()
    {
        return zzadH;
    }

    public void setDescription(String s)
    {
        zzadH = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("description", zzadH);
        hashmap.put("fatal", Boolean.valueOf(zzawL));
        return zzu(hashmap);
    }

    public volatile void zza(zzki zzki1)
    {
        zza((zzku)zzki1);
    }

    public void zza(zzku zzku1)
    {
        if (!TextUtils.isEmpty(zzadH))
        {
            zzku1.setDescription(zzadH);
        }
        if (zzawL)
        {
            zzku1.zzab(zzawL);
        }
    }

    public void zzab(boolean flag)
    {
        zzawL = flag;
    }

    public boolean zzuJ()
    {
        return zzawL;
    }
}
