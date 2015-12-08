// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public interface zzia
{
    public static interface zza
    {

        public abstract void run();
    }

    public static class zzb
        implements zza
    {

        public void run()
        {
        }

        public zzb()
        {
        }
    }

    public static class zzc
        implements zzd
    {

        public void zza(Object obj)
        {
        }

        public zzc()
        {
        }
    }

    public static interface zzd
    {

        public abstract void zza(Object obj);
    }


    public abstract int getStatus();

    public abstract void reject();

    public abstract void zza(zzd zzd1, zza zza1);

    public abstract void zzc(Object obj);
}
