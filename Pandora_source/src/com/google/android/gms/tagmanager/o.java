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
//            j, zzdf, ci, zzbg

class o extends j
{

    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;

    public o()
    {
        super(a, new String[] {
            b
        });
    }

    private byte[] a(String s, byte abyte0[])
        throws NoSuchAlgorithmException
    {
        s = MessageDigest.getInstance(s);
        s.update(abyte0);
        return s.digest();
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzd.zza)map.get(b);
        if (obj == null || obj == zzdf.zzxW())
        {
            return zzdf.zzxW();
        }
        String s = zzdf.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        obj = (com.google.android.gms.internal.zzd.zza)map.get(c);
        if (obj == null)
        {
            obj = "MD5";
        } else
        {
            obj = zzdf.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        }
        map = (com.google.android.gms.internal.zzd.zza)map.get(d);
        if (map == null)
        {
            map = "text";
        } else
        {
            map = zzdf.zzg(map);
        }
        if ("text".equals(map))
        {
            map = s.getBytes();
        } else
        if ("base16".equals(map))
        {
            map = ci.a(s);
        } else
        {
            zzbg.zzak((new StringBuilder()).append("Hash: unknown input format: ").append(map).toString());
            return zzdf.zzxW();
        }
        try
        {
            map = zzdf.zzE(ci.a(a(((String) (obj)), map)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            zzbg.zzak((new StringBuilder()).append("Hash: unknown algorithm: ").append(((String) (obj))).toString());
            return zzdf.zzxW();
        }
        return map;
    }

    public boolean zzwn()
    {
        return true;
    }

    static 
    {
        a = zza.zzac.toString();
        b = zzb.zzbO.toString();
        c = zzb.zzbF.toString();
        d = zzb.zzdI.toString();
    }
}
