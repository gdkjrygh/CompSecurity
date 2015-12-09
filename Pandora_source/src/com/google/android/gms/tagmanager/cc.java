// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            as, zzdf, zzbg

class cc
{

    private static as a(as as1)
    {
        as as2;
        try
        {
            as2 = new as(zzdf.zzE(a(zzdf.zzg((com.google.android.gms.internal.zzd.zza)as1.a()))), as1.b());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            zzbg.zzb("Escape URI: unsupported encoding", unsupportedencodingexception);
            return as1;
        }
        return as2;
    }

    private static as a(as as1, int i)
    {
        if (!a((com.google.android.gms.internal.zzd.zza)as1.a()))
        {
            zzbg.zzak("Escaping can only be applied to strings.");
            return as1;
        }
        switch (i)
        {
        default:
            zzbg.zzak((new StringBuilder()).append("Unsupported Value Escaping: ").append(i).toString());
            return as1;

        case 12: // '\f'
            return a(as1);
        }
    }

    static transient as a(as as1, int ai[])
    {
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            as1 = a(as1, ai[i]);
        }

        return as1;
    }

    static String a(String s)
        throws UnsupportedEncodingException
    {
        return URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
    }

    private static boolean a(com.google.android.gms.internal.zzd.zza zza)
    {
        return zzdf.zzl(zza) instanceof String;
    }
}
