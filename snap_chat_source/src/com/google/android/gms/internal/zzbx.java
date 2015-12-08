// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzbw, zzab, zzby, zzbz, 
//            zzki

public abstract class zzbx
    implements zzbw
{

    private final String zzqd;
    private final Object zzqe;

    private zzbx(String s, Object obj)
    {
        zzqd = s;
        zzqe = obj;
        zzab.zzaS().zza(this);
    }


    public static zzbx zzA(String s)
    {
        s = new zzbx(s, null) {

            public final Object zza(Bundle bundle)
            {
                return zzd(bundle);
            }

            public final zzki zzbZ()
            {
                return zzki.zzp(getKey(), (String)zzbY());
            }

            public final String zzd(Bundle bundle)
            {
                return zzbx.zzb(bundle, getKey(), (String)zzbY());
            }

        };
        zzab.zzaS().zza(s);
        return s;
    }

    public static zzbx zza(String s, int i)
    {
        return new zzbx(s, Integer.valueOf(i)) {

            public final Object zza(Bundle bundle)
            {
                return zzc(bundle);
            }

            public final zzki zzbZ()
            {
                return zzki.zza(getKey(), (Integer)zzbY());
            }

            public final Integer zzc(Bundle bundle)
            {
                return Integer.valueOf(bundle.getInt(getKey(), ((Integer)zzbY()).intValue()));
            }

        };
    }

    public static zzbx zza(String s, Boolean boolean1)
    {
        return new zzbx(s, boolean1) {

            public final Object zza(Bundle bundle)
            {
                return zzb(bundle);
            }

            public final Boolean zzb(Bundle bundle)
            {
                return Boolean.valueOf(bundle.getBoolean(getKey(), ((Boolean)zzbY()).booleanValue()));
            }

            public final zzki zzbZ()
            {
                return zzki.zzg(getKey(), ((Boolean)zzbY()).booleanValue());
            }

        };
    }

    private static String zza(Bundle bundle, String s, String s1)
    {
        bundle = bundle.getString(s);
        if (bundle == null)
        {
            return s1;
        } else
        {
            return bundle;
        }
    }

    static String zzb(Bundle bundle, String s, String s1)
    {
        return zza(bundle, s, s1);
    }

    public static zzbx zzd(String s, String s1)
    {
        return new zzbx(s, s1) {

            public final Object zza(Bundle bundle)
            {
                return zzd(bundle);
            }

            public final zzki zzbZ()
            {
                return zzki.zzp(getKey(), (String)zzbY());
            }

            public final String zzd(Bundle bundle)
            {
                return zzbx.zzb(bundle, getKey(), (String)zzbY());
            }

        };
    }

    public Object get()
    {
        Object obj;
        obj = zzab.zzaT().zzcc();
        if (!((Future) (obj)).isDone())
        {
            return zzqe;
        }
        obj = zza((Bundle)((Future) (obj)).get());
        return obj;
        Object obj1;
        obj1;
_L2:
        return zzqe;
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String getKey()
    {
        return zzqd;
    }

    protected abstract Object zza(Bundle bundle);

    public Object zzbY()
    {
        return zzqe;
    }

    public abstract zzki zzbZ();
}
