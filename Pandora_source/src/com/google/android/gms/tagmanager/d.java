// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            j, zzdf, ci, zzbg

class d extends j
{

    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;

    public d()
    {
        super(a, new String[] {
            b
        });
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzd.zza)map.get(b);
        if (obj == null || obj == zzdf.zzxW())
        {
            return zzdf.zzxW();
        }
        String s1 = zzdf.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        obj = (com.google.android.gms.internal.zzd.zza)map.get(d);
        String s;
        byte byte0;
        if (obj == null)
        {
            s = "text";
        } else
        {
            s = zzdf.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        }
        obj = (com.google.android.gms.internal.zzd.zza)map.get(e);
        if (obj == null)
        {
            obj = "base16";
        } else
        {
            obj = zzdf.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        }
        map = (com.google.android.gms.internal.zzd.zza)map.get(c);
        if (map != null && zzdf.zzk(map).booleanValue())
        {
            byte0 = 3;
        } else
        {
            byte0 = 2;
        }
        if (!"text".equals(s)) goto _L2; else goto _L1
_L1:
        map = s1.getBytes();
_L8:
        if (!"base16".equals(obj)) goto _L4; else goto _L3
_L3:
        map = ci.a(map);
_L6:
        return zzdf.zzE(map);
_L2:
        if ("base16".equals(s))
        {
            map = ci.a(s1);
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
                zzbg.zzak((new StringBuilder()).append("Encode: unknown input format: ").append(s).toString());
                map = zzdf.zzxW();
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                zzbg.zzak("Encode: invalid input:");
                return zzdf.zzxW();
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
        zzbg.zzak((new StringBuilder()).append("Encode: unknown output format: ").append(((String) (obj))).toString());
        return zzdf.zzxW();
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean zzwn()
    {
        return true;
    }

    static 
    {
        a = zza.zzaa.toString();
        b = zzb.zzbO.toString();
        c = zzb.zzem.toString();
        d = zzb.zzdI.toString();
        e = zzb.zzeu.toString();
    }
}
