// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzo;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzbw, zzby, zzkf

public abstract class zzbv
    implements zzbs
{

    private final String zztw;
    private final Object zztx;

    private zzbv(String s, Object obj)
    {
        zztw = s;
        zztx = obj;
        zzo.zzbD().zza(this);
    }


    public static zzbv zzO(String s)
    {
        s = zzc(s, (String)null);
        zzo.zzbD().zza(s);
        return s;
    }

    public static zzbv zzP(String s)
    {
        s = zzc(s, (String)null);
        zzo.zzbD().zzb(s);
        return s;
    }

    public static zzbv zza(String s, int i)
    {
        return new zzbv(s, Integer.valueOf(i)) {

            public Object zza(SharedPreferences sharedpreferences)
            {
                return zzc(sharedpreferences);
            }

            public Integer zzc(SharedPreferences sharedpreferences)
            {
                return Integer.valueOf(sharedpreferences.getInt(getKey(), ((Integer)zzcY()).intValue()));
            }

            public zzkf zzcZ()
            {
                return zzkf.zza(getKey(), (Integer)zzcY());
            }

        };
    }

    public static zzbv zza(String s, Boolean boolean1)
    {
        return new zzbv(s, boolean1) {

            public Object zza(SharedPreferences sharedpreferences)
            {
                return zzb(sharedpreferences);
            }

            public Boolean zzb(SharedPreferences sharedpreferences)
            {
                return Boolean.valueOf(sharedpreferences.getBoolean(getKey(), ((Boolean)zzcY()).booleanValue()));
            }

            public zzkf zzcZ()
            {
                return zzkf.zzg(getKey(), ((Boolean)zzcY()).booleanValue());
            }

        };
    }

    public static zzbv zzb(String s, long l)
    {
        return new zzbv(s, Long.valueOf(l)) {

            public Object zza(SharedPreferences sharedpreferences)
            {
                return zzd(sharedpreferences);
            }

            public zzkf zzcZ()
            {
                return zzkf.zza(getKey(), (Long)zzcY());
            }

            public Long zzd(SharedPreferences sharedpreferences)
            {
                return Long.valueOf(sharedpreferences.getLong(getKey(), ((Long)zzcY()).longValue()));
            }

        };
    }

    public static zzbv zzc(String s, String s1)
    {
        return new zzbv(s, s1) {

            public Object zza(SharedPreferences sharedpreferences)
            {
                return zze(sharedpreferences);
            }

            public zzkf zzcZ()
            {
                return zzkf.zzs(getKey(), (String)zzcY());
            }

            public String zze(SharedPreferences sharedpreferences)
            {
                return sharedpreferences.getString(getKey(), (String)zzcY());
            }

        };
    }

    public Object get()
    {
        return zzo.zzbE().zzc(this);
    }

    public String getKey()
    {
        return zztw;
    }

    protected abstract Object zza(SharedPreferences sharedpreferences);

    public Object zzcY()
    {
        return zztx;
    }

    public abstract zzkf zzcZ();
}
