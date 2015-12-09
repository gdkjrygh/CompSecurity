// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;

public abstract class zzhc
{
    private static interface a
    {

        public abstract Boolean a(String s, Boolean boolean1);

        public abstract Float a(String s, Float float1);

        public abstract Integer a(String s, Integer integer);

        public abstract Long a(String s, Long long1);

        public abstract String a(String s, String s1);
    }


    private static a zzRo = null;
    private static int zzRp = 0;
    private static final Object zznu = new Object();
    private Object zzHW;
    protected final String zzra;
    protected final Object zzrb;

    protected zzhc(String s, Object obj)
    {
        zzHW = null;
        zzra = s;
        zzrb = obj;
    }

    public static boolean isInitialized()
    {
        return zzRo != null;
    }

    public static zzhc zza(String s, Float float1)
    {
        return new zzhc(s, float1) {

            protected Float a(String s1)
            {
                return zzhc.zzll().a(zzra, (Float)zzrb);
            }

            protected Object zzbz(String s1)
            {
                return a(s1);
            }

        };
    }

    public static zzhc zza(String s, Integer integer)
    {
        return new zzhc(s, integer) {

            protected Integer a(String s1)
            {
                return zzhc.zzll().a(zzra, (Integer)zzrb);
            }

            protected Object zzbz(String s1)
            {
                return a(s1);
            }

        };
    }

    public static zzhc zza(String s, Long long1)
    {
        return new zzhc(s, long1) {

            protected Long a(String s1)
            {
                return zzhc.zzll().a(zzra, (Long)zzrb);
            }

            protected Object zzbz(String s1)
            {
                return a(s1);
            }

        };
    }

    public static zzhc zzg(String s, boolean flag)
    {
        return new zzhc(s, Boolean.valueOf(flag)) {

            protected Boolean a(String s1)
            {
                return zzhc.zzll().a(zzra, (Boolean)zzrb);
            }

            protected Object zzbz(String s1)
            {
                return a(s1);
            }

        };
    }

    public static int zzlj()
    {
        return zzRp;
    }

    static a zzll()
    {
        return zzRo;
    }

    public static zzhc zzr(String s, String s1)
    {
        return new zzhc(s, s1) {

            protected String a(String s2)
            {
                return zzhc.zzll().a(zzra, (String)zzrb);
            }

            protected Object zzbz(String s2)
            {
                return a(s2);
            }

        };
    }

    public final Object get()
    {
        if (zzHW != null)
        {
            return zzHW;
        } else
        {
            return zzbz(zzra);
        }
    }

    protected abstract Object zzbz(String s);

    public final Object zzlk()
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
