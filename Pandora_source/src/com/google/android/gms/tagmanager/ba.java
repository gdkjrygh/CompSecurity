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
//            j, zzdf

class ba extends j
{

    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;

    public ba()
    {
        super(a, new String[] {
            b, c
        });
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzd.zza)map.get(b);
        com.google.android.gms.internal.zzd.zza zza1 = (com.google.android.gms.internal.zzd.zza)map.get(c);
        if (obj == null || obj == zzdf.zzxW() || zza1 == null || zza1 == zzdf.zzxW())
        {
            return zzdf.zzxW();
        }
        byte byte0 = 64;
        if (zzdf.zzk((com.google.android.gms.internal.zzd.zza)map.get(d)).booleanValue())
        {
            byte0 = 66;
        }
        map = (com.google.android.gms.internal.zzd.zza)map.get(e);
        int i;
        if (map != null)
        {
            map = zzdf.zzi(map);
            if (map == zzdf.zzxR())
            {
                return zzdf.zzxW();
            }
            int k = map.intValue();
            i = k;
            if (k < 0)
            {
                return zzdf.zzxW();
            }
        } else
        {
            i = 1;
        }
        try
        {
            map = zzdf.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
            obj = zzdf.zzg(zza1);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return zzdf.zzxW();
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
        return zzdf.zzxW();
        map = zzdf.zzE(map);
        return map;
    }

    public boolean zzwn()
    {
        return true;
    }

    static 
    {
        a = zza.zzag.toString();
        b = zzb.zzbO.toString();
        c = zzb.zzbP.toString();
        d = zzb.zzdG.toString();
        e = zzb.zzdA.toString();
    }
}
