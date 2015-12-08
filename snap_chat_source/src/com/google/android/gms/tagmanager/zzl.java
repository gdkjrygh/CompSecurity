// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcv, zzaz, zzk

class zzl
{
    public static interface zza
    {

        public abstract int sizeOf(Object obj, Object obj1);
    }


    final zza zzaxu = new zza() {

        final zzl zzaxv;

        public int sizeOf(Object obj, Object obj1)
        {
            return 1;
        }

            
            {
                zzaxv = zzl.this;
                super();
            }
    };

    public zzl()
    {
    }

    public zzk zza(int i, zza zza1)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (zzsF() < 12)
        {
            return new zzcv(i, zza1);
        } else
        {
            return new zzaz(i, zza1);
        }
    }

    int zzsF()
    {
        return android.os.Build.VERSION.SDK_INT;
    }
}
