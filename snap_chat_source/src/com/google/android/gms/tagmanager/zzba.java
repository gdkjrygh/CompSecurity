// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaj, zzde

public class zzba extends zzaj
{

    private static final String ID;

    public zzba()
    {
        super(ID, new String[0]);
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        map = Locale.getDefault();
        if (map == null)
        {
            return zzde.zzuf();
        }
        map = map.getLanguage();
        if (map == null)
        {
            return zzde.zzuf();
        } else
        {
            return zzde.zzx(map.toLowerCase());
        }
    }

    public boolean zzsD()
    {
        return false;
    }

    public volatile String zzth()
    {
        return super.zzth();
    }

    public volatile Set zzti()
    {
        return super.zzti();
    }

    static 
    {
        ID = zza.zzN.toString();
    }
}
