// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.google.android.gms.internal.zzae;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf, zzk, zzbg

class zzad extends zzak
{

    private static final String ID;
    private static final String zzaLE;
    private static final String zzaLF;
    private static final String zzaLG;
    private static final String zzaLH;

    public zzad()
    {
        super(ID, new String[] {
            zzaLE
        });
    }

    public com.google.android.gms.internal.zzag.zza zzE(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzag.zza)map.get(zzaLE);
        if (obj == null || obj == zzdf.zzzQ())
        {
            return zzdf.zzzQ();
        }
        String s1 = zzdf.zzg(((com.google.android.gms.internal.zzag.zza) (obj)));
        obj = (com.google.android.gms.internal.zzag.zza)map.get(zzaLG);
        String s;
        byte byte0;
        if (obj == null)
        {
            s = "text";
        } else
        {
            s = zzdf.zzg(((com.google.android.gms.internal.zzag.zza) (obj)));
        }
        obj = (com.google.android.gms.internal.zzag.zza)map.get(zzaLH);
        if (obj == null)
        {
            obj = "base16";
        } else
        {
            obj = zzdf.zzg(((com.google.android.gms.internal.zzag.zza) (obj)));
        }
        map = (com.google.android.gms.internal.zzag.zza)map.get(zzaLF);
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
        map = zzk.zzi(map);
_L6:
        return zzdf.zzI(map);
_L2:
        if ("base16".equals(s))
        {
            map = zzk.zzee(s1);
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
                zzbg.zzaz((new StringBuilder()).append("Encode: unknown input format: ").append(s).toString());
                map = zzdf.zzzQ();
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                zzbg.zzaz("Encode: invalid input:");
                return zzdf.zzzQ();
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
        zzbg.zzaz((new StringBuilder()).append("Encode: unknown output format: ").append(((String) (obj))).toString());
        return zzdf.zzzQ();
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean zzyh()
    {
        return true;
    }

    static 
    {
        ID = com.google.android.gms.internal.zzad.zzbI.toString();
        zzaLE = zzae.zzdw.toString();
        zzaLF = zzae.zzfU.toString();
        zzaLG = zzae.zzfq.toString();
        zzaLH = zzae.zzgc.toString();
    }
}
