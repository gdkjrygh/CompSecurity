// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaj, zzde, zzj, zzbf

class zzac extends zzaj
{

    private static final String ID;
    private static final String zzayC;
    private static final String zzayD;
    private static final String zzayE;
    private static final String zzayF;

    public zzac()
    {
        super(ID, new String[] {
            zzayC
        });
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        Object obj;
        String s;
        String s1;
        byte byte0;
        obj = (com.google.android.gms.internal.zzd.zza)map.get(zzayC);
        if (obj == null || obj == zzde.zzuf())
        {
            return zzde.zzuf();
        }
        s1 = zzde.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        obj = (com.google.android.gms.internal.zzd.zza)map.get(zzayE);
        byte byte1;
        if (obj == null)
        {
            s = "text";
        } else
        {
            s = zzde.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        }
        obj = (com.google.android.gms.internal.zzd.zza)map.get(zzayF);
        if (obj == null)
        {
            obj = "base16";
        } else
        {
            obj = zzde.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        }
        byte1 = 2;
        map = (com.google.android.gms.internal.zzd.zza)map.get(zzayD);
        byte0 = byte1;
        if (map != null)
        {
            byte0 = byte1;
            if (zzde.zzk(map).booleanValue())
            {
                byte0 = 3;
            }
        }
        if (!"text".equals(s)) goto _L2; else goto _L1
_L1:
        map = s1.getBytes();
_L8:
        if (!"base16".equals(obj)) goto _L4; else goto _L3
_L3:
        map = zzj.zze(map);
_L6:
        return zzde.zzx(map);
_L2:
        if ("base16".equals(s))
        {
            map = zzj.zzcL(s1);
            continue; /* Loop/switch isn't completed */
        }
        if ("base64".equals(s))
        {
            map = Base64.decode(s1, byte0);
            continue; /* Loop/switch isn't completed */
        }
        if ("base64url".equals(s))
        {
            map = Base64.decode(s1, byte0 | 8);
            continue; /* Loop/switch isn't completed */
        } else
        {
            try
            {
                zzbf.zzZ((new StringBuilder("Encode: unknown input format: ")).append(s).toString());
                map = zzde.zzuf();
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                zzbf.zzZ("Encode: invalid input:");
                return zzde.zzuf();
            }
            return map;
        }
_L4:
        if ("base64".equals(obj))
        {
            map = Base64.encodeToString(map, byte0);
            continue; /* Loop/switch isn't completed */
        }
        if (!"base64url".equals(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        map = Base64.encodeToString(map, byte0 | 8);
        if (true) goto _L6; else goto _L5
_L5:
        zzbf.zzZ((new StringBuilder("Encode: unknown output format: ")).append(((String) (obj))).toString());
        return zzde.zzuf();
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean zzsD()
    {
        return true;
    }

    static 
    {
        ID = zza.zzaa.toString();
        zzayC = zzb.zzbw.toString();
        zzayD = zzb.zzdH.toString();
        zzayE = zzb.zzde.toString();
        zzayF = zzb.zzdP.toString();
    }
}
