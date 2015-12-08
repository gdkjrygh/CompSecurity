// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaj, zzde

class zzcd extends zzaj
{

    private static final String ID;
    private static final String zzazH;
    private static final String zzazI;
    private static final String zzazJ;
    private static final String zzazK;

    public zzcd()
    {
        super(ID, new String[] {
            zzazH, zzazI
        });
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzd.zza)map.get(zzazH);
        com.google.android.gms.internal.zzd.zza zza1 = (com.google.android.gms.internal.zzd.zza)map.get(zzazI);
        if (obj == null || obj == zzde.zzuf() || zza1 == null || zza1 == zzde.zzuf())
        {
            return zzde.zzuf();
        }
        byte byte0 = 64;
        if (zzde.zzk((com.google.android.gms.internal.zzd.zza)map.get(zzazJ)).booleanValue())
        {
            byte0 = 66;
        }
        map = (com.google.android.gms.internal.zzd.zza)map.get(zzazK);
        int i;
        if (map != null)
        {
            map = zzde.zzi(map);
            if (map == zzde.zzua())
            {
                return zzde.zzuf();
            }
            int j = map.intValue();
            i = j;
            if (j < 0)
            {
                return zzde.zzuf();
            }
        } else
        {
            i = 1;
        }
        try
        {
            map = zzde.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
            obj = zzde.zzg(zza1);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return zzde.zzuf();
        }
        zza1 = null;
        obj = Pattern.compile(((String) (obj)), byte0).matcher(map);
        map = zza1;
        if (!((Matcher) (obj)).find())
        {
            break MISSING_BLOCK_LABEL_186;
        }
        map = zza1;
        if (((Matcher) (obj)).groupCount() >= i)
        {
            map = ((Matcher) (obj)).group(i);
        }
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        return zzde.zzuf();
        map = zzde.zzx(map);
        return map;
    }

    public boolean zzsD()
    {
        return true;
    }

    static 
    {
        ID = zza.zzag.toString();
        zzazH = zzb.zzbw.toString();
        zzazI = zzb.zzbx.toString();
        zzazJ = zzb.zzdc.toString();
        zzazK = zzb.zzcW.toString();
    }
}
