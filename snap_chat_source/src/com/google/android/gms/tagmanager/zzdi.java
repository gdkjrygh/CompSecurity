// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbv, zzde, zzbf

class zzdi
{

    private static zzbv zza(zzbv zzbv1)
    {
        zzbv zzbv2;
        try
        {
            zzbv2 = new zzbv(zzde.zzx(zzdv(zzde.zzg((com.google.android.gms.internal.zzd.zza)zzbv1.getObject()))), zzbv1.zztu());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            zzbf.zzb("Escape URI: unsupported encoding", unsupportedencodingexception);
            return zzbv1;
        }
        return zzbv2;
    }

    private static zzbv zza(zzbv zzbv1, int i)
    {
        if (!zzn((com.google.android.gms.internal.zzd.zza)zzbv1.getObject()))
        {
            zzbf.zzZ("Escaping can only be applied to strings.");
            return zzbv1;
        }
        switch (i)
        {
        default:
            zzbf.zzZ((new StringBuilder("Unsupported Value Escaping: ")).append(i).toString());
            return zzbv1;

        case 12: // '\f'
            return zza(zzbv1);
        }
    }

    static transient zzbv zza(zzbv zzbv1, int ai[])
    {
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            zzbv1 = zza(zzbv1, ai[i]);
        }

        return zzbv1;
    }

    static String zzdv(String s)
    {
        return URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
    }

    private static boolean zzn(com.google.android.gms.internal.zzd.zza zza1)
    {
        return zzde.zzl(zza1) instanceof String;
    }
}
