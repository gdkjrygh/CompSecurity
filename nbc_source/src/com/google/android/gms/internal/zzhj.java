// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzhh

public final class zzhj
{
    private static abstract class zza extends zzhh
    {

        public void onStop()
        {
        }

        private zza()
        {
        }

    }

    public static interface zzb
    {

        public abstract void zzc(Bundle bundle);
    }


    static SharedPreferences zzF(Context context)
    {
        return zzv(context);
    }

    public static Future zza(Context context, int i)
    {
        return (new zza(context, i) {

            final int zzGd;
            final Context zzqV;

            public void zzdP()
            {
                android.content.SharedPreferences.Editor editor = zzhj.zzF(zzqV).edit();
                editor.putInt("webview_cache_version", zzGd);
                editor.commit();
            }

            
            {
                zzqV = context;
                zzGd = i;
                super();
            }
        }).zzgi();
    }

    public static Future zza(Context context, zzb zzb1)
    {
        return (new zza(context, zzb1) {

            final zzb zzGc;
            final Context zzqV;

            public void zzdP()
            {
                SharedPreferences sharedpreferences = zzhj.zzF(zzqV);
                Bundle bundle = new Bundle();
                bundle.putBoolean("use_https", sharedpreferences.getBoolean("use_https", true));
                if (zzGc != null)
                {
                    zzGc.zzc(bundle);
                }
            }

            
            {
                zzqV = context;
                zzGc = zzb1;
                super();
            }
        }).zzgi();
    }

    public static Future zza(Context context, boolean flag)
    {
        return (new zza(context, flag) {

            final boolean zzGb;
            final Context zzqV;

            public void zzdP()
            {
                android.content.SharedPreferences.Editor editor = zzhj.zzF(zzqV).edit();
                editor.putBoolean("use_https", zzGb);
                editor.commit();
            }

            
            {
                zzqV = context;
                zzGb = flag;
                super();
            }
        }).zzgi();
    }

    public static Future zzb(Context context, zzb zzb1)
    {
        return (new zza(context, zzb1) {

            final zzb zzGc;
            final Context zzqV;

            public void zzdP()
            {
                SharedPreferences sharedpreferences = zzhj.zzF(zzqV);
                Bundle bundle = new Bundle();
                bundle.putInt("webview_cache_version", sharedpreferences.getInt("webview_cache_version", 0));
                if (zzGc != null)
                {
                    zzGc.zzc(bundle);
                }
            }

            
            {
                zzqV = context;
                zzGc = zzb1;
                super();
            }
        }).zzgi();
    }

    private static SharedPreferences zzv(Context context)
    {
        return context.getSharedPreferences("admob", 0);
    }
}
