// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzfh

public final class zzfj
{
    private static abstract class a extends zzfh
    {

        public void onStop()
        {
        }

        private a()
        {
        }

    }

    public static interface zzb
    {

        public abstract void zzc(Bundle bundle);
    }


    public static Future zza(Context context, int i)
    {
        return (new a(context, i) {

            final Context a;
            final int b;

            public void zzcX()
            {
                android.content.SharedPreferences.Editor editor = zzfj.zzu(a).edit();
                editor.putInt("webview_cache_version", b);
                editor.commit();
            }

            
            {
                a = context;
                b = i;
                super();
            }
        }).zzeW();
    }

    public static Future zza(Context context, zzb zzb1)
    {
        return (new a(context, zzb1) {

            final Context a;
            final zzb b;

            public void zzcX()
            {
                SharedPreferences sharedpreferences = zzfj.zzu(a);
                Bundle bundle = new Bundle();
                bundle.putBoolean("use_https", sharedpreferences.getBoolean("use_https", true));
                if (b != null)
                {
                    b.zzc(bundle);
                }
            }

            
            {
                a = context;
                b = zzb1;
                super();
            }
        }).zzeW();
    }

    public static Future zza(Context context, boolean flag)
    {
        return (new a(context, flag) {

            final Context a;
            final boolean b;

            public void zzcX()
            {
                android.content.SharedPreferences.Editor editor = zzfj.zzu(a).edit();
                editor.putBoolean("use_https", b);
                editor.commit();
            }

            
            {
                a = context;
                b = flag;
                super();
            }
        }).zzeW();
    }

    public static Future zzb(Context context, zzb zzb1)
    {
        return (new a(context, zzb1) {

            final Context a;
            final zzb b;

            public void zzcX()
            {
                SharedPreferences sharedpreferences = zzfj.zzu(a);
                Bundle bundle = new Bundle();
                bundle.putInt("webview_cache_version", sharedpreferences.getInt("webview_cache_version", 0));
                if (b != null)
                {
                    b.zzc(bundle);
                }
            }

            
            {
                a = context;
                b = zzb1;
                super();
            }
        }).zzeW();
    }

    private static SharedPreferences zzn(Context context)
    {
        return context.getSharedPreferences("admob", 0);
    }

    static SharedPreferences zzu(Context context)
    {
        return zzn(context);
    }
}
