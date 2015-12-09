// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            j, zzdf

public class zzbb extends j
{

    private static final String ID;

    public zzbb()
    {
        super(ID, new String[0]);
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        map = Locale.getDefault();
        if (map == null)
        {
            return zzdf.zzxW();
        }
        map = map.getLanguage();
        if (map == null)
        {
            return zzdf.zzxW();
        } else
        {
            return zzdf.zzE(map.toLowerCase());
        }
    }

    public volatile String zzwS()
    {
        return super.zzwS();
    }

    public volatile Set zzwT()
    {
        return super.zzwT();
    }

    public boolean zzwn()
    {
        return false;
    }

    static 
    {
        ID = zza.zzN.toString();
    }
}
