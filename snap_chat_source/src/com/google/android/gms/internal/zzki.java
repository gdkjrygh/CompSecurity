// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public abstract class zzki
{
    static interface zza
    {

        public abstract Long getLong(String s, Long long1);

        public abstract String getString(String s, String s1);

        public abstract Boolean zzb(String s, Boolean boolean1);

        public abstract Integer zzb(String s, Integer integer);
    }


    private static zza zzNG = null;
    private static int zzNH = 0;
    private static final Object zzmz = new Object();
    private Object zzNI;
    protected final String zzqd;
    protected final Object zzqe;

    protected zzki(String s, Object obj)
    {
        zzNI = null;
        zzqd = s;
        zzqe = obj;
    }

    public static boolean isInitialized()
    {
        return zzNG != null;
    }

    public static zzki zza(String s, Integer integer)
    {
        return new zzki(s, integer) {

            protected final Object zzaV(String s1)
            {
                return zzaY(s1);
            }

            protected final Integer zzaY(String s1)
            {
                return zzki.zzit().zzb(zzqd, (Integer)zzqe);
            }

        };
    }

    public static zzki zza(String s, Long long1)
    {
        return new zzki(s, long1) {

            protected final Object zzaV(String s1)
            {
                return zzaX(s1);
            }

            protected final Long zzaX(String s1)
            {
                return zzki.zzit().getLong(zzqd, (Long)zzqe);
            }

        };
    }

    public static zzki zzg(String s, boolean flag)
    {
        return new zzki(s, Boolean.valueOf(flag)) {

            protected final Object zzaV(String s1)
            {
                return zzaW(s1);
            }

            protected final Boolean zzaW(String s1)
            {
                return zzki.zzit().zzb(zzqd, (Boolean)zzqe);
            }

        };
    }

    public static int zzis()
    {
        return zzNH;
    }

    static zza zzit()
    {
        return zzNG;
    }

    public static zzki zzp(String s, String s1)
    {
        return new zzki(s, s1) {

            protected final Object zzaV(String s2)
            {
                return zzaZ(s2);
            }

            protected final String zzaZ(String s2)
            {
                return zzki.zzit().getString(zzqd, (String)zzqe);
            }

        };
    }

    public final Object get()
    {
        if (zzNI != null)
        {
            return zzNI;
        } else
        {
            return zzaV(zzqd);
        }
    }

    protected abstract Object zzaV(String s);

}
