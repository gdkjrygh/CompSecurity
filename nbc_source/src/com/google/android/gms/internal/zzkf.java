// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;

public abstract class zzkf
{
    private static interface zza
    {

        public abstract Long getLong(String s, Long long1);

        public abstract String getString(String s, String s1);

        public abstract Boolean zzb(String s, Boolean boolean1);

        public abstract Float zzb(String s, Float float1);

        public abstract Integer zzb(String s, Integer integer);
    }


    private static zza zzYj = null;
    private static int zzYk = 0;
    private static String zzYl = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    private static final Object zzoW = new Object();
    private Object zzLS;
    protected final String zztw;
    protected final Object zztx;

    protected zzkf(String s, Object obj)
    {
        zzLS = null;
        zztw = s;
        zztx = obj;
    }

    public static boolean isInitialized()
    {
        return zzYj != null;
    }

    public static zzkf zza(String s, Float float1)
    {
        return new zzkf(s, float1) {

            protected Object zzbP(String s1)
            {
                return zzbT(s1);
            }

            protected Float zzbT(String s1)
            {
                return zzkf.zzna().zzb(zztw, (Float)zztx);
            }

        };
    }

    public static zzkf zza(String s, Integer integer)
    {
        return new zzkf(s, integer) {

            protected Object zzbP(String s1)
            {
                return zzbS(s1);
            }

            protected Integer zzbS(String s1)
            {
                return zzkf.zzna().zzb(zztw, (Integer)zztx);
            }

        };
    }

    public static zzkf zza(String s, Long long1)
    {
        return new zzkf(s, long1) {

            protected Object zzbP(String s1)
            {
                return zzbR(s1);
            }

            protected Long zzbR(String s1)
            {
                return zzkf.zzna().getLong(zztw, (Long)zztx);
            }

        };
    }

    public static zzkf zzg(String s, boolean flag)
    {
        return new zzkf(s, Boolean.valueOf(flag)) {

            protected Object zzbP(String s1)
            {
                return zzbQ(s1);
            }

            protected Boolean zzbQ(String s1)
            {
                return zzkf.zzna().zzb(zztw, (Boolean)zztx);
            }

        };
    }

    public static int zzmY()
    {
        return zzYk;
    }

    static zza zzna()
    {
        return zzYj;
    }

    public static zzkf zzs(String s, String s1)
    {
        return new zzkf(s, s1) {

            protected Object zzbP(String s2)
            {
                return zzbU(s2);
            }

            protected String zzbU(String s2)
            {
                return zzkf.zzna().getString(zztw, (String)zztx);
            }

        };
    }

    public final Object get()
    {
        if (zzLS != null)
        {
            return zzLS;
        } else
        {
            return zzbP(zztw);
        }
    }

    protected abstract Object zzbP(String s);

    public final Object zzmZ()
    {
        long l = Binder.clearCallingIdentity();
        Object obj = get();
        Binder.restoreCallingIdentity(l);
        return obj;
        Exception exception;
        exception;
        Binder.restoreCallingIdentity(l);
        throw exception;
    }

}
