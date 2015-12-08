// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaj, zzde, zzj, zzbf

class zzao extends zzaj
{

    private static final String ID;
    private static final String zzayC;
    private static final String zzayE;
    private static final String zzayI;

    public zzao()
    {
        super(ID, new String[] {
            zzayC
        });
    }

    private byte[] zze(String s, byte abyte0[])
    {
        s = MessageDigest.getInstance(s);
        s.update(abyte0);
        return s.digest();
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzd.zza)map.get(zzayC);
        if (obj == null || obj == zzde.zzuf())
        {
            return zzde.zzuf();
        }
        String s = zzde.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        obj = (com.google.android.gms.internal.zzd.zza)map.get(zzayI);
        if (obj == null)
        {
            obj = "MD5";
        } else
        {
            obj = zzde.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        }
        map = (com.google.android.gms.internal.zzd.zza)map.get(zzayE);
        if (map == null)
        {
            map = "text";
        } else
        {
            map = zzde.zzg(map);
        }
        if ("text".equals(map))
        {
            map = s.getBytes();
        } else
        if ("base16".equals(map))
        {
            map = zzj.zzcL(s);
        } else
        {
            zzbf.zzZ((new StringBuilder("Hash: unknown input format: ")).append(map).toString());
            return zzde.zzuf();
        }
        try
        {
            map = zzde.zzx(zzj.zze(zze(((String) (obj)), map)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            zzbf.zzZ((new StringBuilder("Hash: unknown algorithm: ")).append(((String) (obj))).toString());
            return zzde.zzuf();
        }
        return map;
    }

    public boolean zzsD()
    {
        return true;
    }

    static 
    {
        ID = zza.zzac.toString();
        zzayC = zzb.zzbw.toString();
        zzayI = zzb.zzbn.toString();
        zzayE = zzb.zzde.toString();
    }
}
