// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzac, zzl, zzhv, zzk, 
//            zzi, zzx, zzm, zzr, 
//            zzhs, zzab, zza

public class zzho
{
    public static interface zza
    {

        public abstract Object zzft();

        public abstract Object zzh(InputStream inputstream);
    }

    private static class zzb extends zzk
    {

        private final zza zzGz;
        private final zzm.zzb zzaH;

        protected zzm zza(zzi zzi1)
        {
            return zzm.zza(new ByteArrayInputStream(zzi1.data), zzx.zzb(zzi1));
        }

        protected void zza(Object obj)
        {
            zzj((InputStream)obj);
        }

        protected void zzj(InputStream inputstream)
        {
            zzaH.zzb(zzGz.zzh(inputstream));
        }

        public zzb(String s, zza zza1, zzm.zzb zzb1)
        {
            super(0, s, new _cls1(zzb1, zza1));
            zzGz = zza1;
            zzaH = zzb1;
        }
    }

    private class zzc extends zzhs
        implements zzm.zzb
    {

        final zzho zzGx;

        public void zzb(Object obj)
        {
            super.zzf(obj);
        }

        private zzc()
        {
            zzGx = zzho.this;
            super();
        }

    }


    private static zzl zzGu;
    public static final zza zzGv = new zza() {

        public Object zzft()
        {
            return zzgu();
        }

        public Void zzgu()
        {
            return null;
        }

        public Object zzh(InputStream inputstream)
        {
            return zzi(inputstream);
        }

        public Void zzi(InputStream inputstream)
        {
            return null;
        }

    };
    private static final Object zzoW = new Object();

    public zzho(Context context)
    {
        zzGu = zzN(context);
    }

    private static zzl zzN(Context context)
    {
        synchronized (zzoW)
        {
            if (zzGu == null)
            {
                zzGu = zzac.zza(context.getApplicationContext());
            }
            context = zzGu;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public zzhv zza(String s, zza zza1)
    {
        zzc zzc1 = new zzc();
        zzGu.zze(new zzb(s, zza1, zzc1));
        return zzc1;
    }

    public zzhv zzb(String s, Map map)
    {
        zzc zzc1 = new zzc();
        s = new zzab(s, zzc1, new zzm.zza(s, zzc1) {

            final zzc zzGw;
            final zzho zzGx;
            final String zzwJ;

            public void zze(zzr zzr1)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Failed to load URL: ").append(zzwJ).append("\n").append(zzr1.toString()).toString());
                zzGw.zzb(null);
            }

            
            {
                zzGx = zzho.this;
                zzwJ = s;
                zzGw = zzc1;
                super();
            }
        }, map) {

            final zzho zzGx;
            final Map zzGy;

            public Map getHeaders()
                throws com.google.android.gms.internal.zza
            {
                if (zzGy == null)
                {
                    return super.getHeaders();
                } else
                {
                    return zzGy;
                }
            }

            
            {
                zzGx = zzho.this;
                zzGy = map;
                super(s, zzb1, zza1);
            }
        };
        zzGu.zze(s);
        return zzc1;
    }


    // Unreferenced inner class com/google/android/gms/internal/zzho$zzb$1

/* anonymous class */
    class zzb._cls1
        implements zzm.zza
    {

        final zzm.zzb zzGA;
        final zza zzGB;

        public void zze(zzr zzr)
        {
            zzGA.zzb(zzGB.zzft());
        }

            
            {
                zzGA = zzb1;
                zzGB = zza1;
                super();
            }
    }

}
