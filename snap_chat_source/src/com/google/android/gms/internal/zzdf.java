// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal:
//            zzah, zzhv, zzaj, zzhx, 
//            zzia, zzib, zzhy, zzcv, 
//            zzic

public class zzdf
{
    static class zza
    {

        static int zzsc = 60000;
        static int zzsd = 10000;

    }


    private final Context mContext;
    private final Object zznh;
    private final zzhy zznl;
    private final String zzrR;
    private final WeakHashMap zzrS;
    private zzia.zzd zzrT;
    private zzia.zzd zzrU;
    private zzia zzrV;
    private zzah zzrW;
    private int zzrX;

    public zzdf(Context context, zzhy zzhy, String s)
    {
        zznh = new Object();
        zzrX = 1;
        zzrR = s;
        mContext = context.getApplicationContext();
        zznl = zzhy;
        zzrS = new WeakHashMap();
        zzrT = new zzia.zzc();
        zzrU = new zzia.zzc();
    }

    public zzdf(Context context, zzhy zzhy, String s, zzia.zzd zzd1, zzia.zzd zzd2)
    {
        this(context, zzhy, s);
        zzrT = zzd1;
        zzrU = zzd2;
    }

    static int zza(zzdf zzdf1, int i)
    {
        zzdf1.zzrX = i;
        return i;
    }

    static zzia zza(zzdf zzdf1, zzia zzia1)
    {
        zzdf1.zzrV = zzia1;
        return zzia1;
    }

    static Object zza(zzdf zzdf1)
    {
        return zzdf1.zznh;
    }

    private void zza(zzia zzia1)
    {
        zzrX = 2;
        zzrW = zza(mContext, zznl);
        zzrW.zza(new zzah.zza(zzia1) {

            final zzia zzrY;
            final zzdf zzrZ;

            public void zzbk()
            {
                (new Timer()).schedule(new TimerTask(this) {

                    final _cls1 zzsa;

                    public void run()
                    {
label0:
                        {
                            synchronized (zzdf.zza(zzsa.zzrZ))
                            {
                                if (zzsa.zzrY.getStatus() != -1 && zzsa.zzrY.getStatus() != 1)
                                {
                                    break label0;
                                }
                            }
                            return;
                        }
                        zzdf.zza(zzsa.zzrZ, 1);
                        zzsa.zzrY.reject();
                        obj;
                        JVM INSTR monitorexit ;
                        return;
                        exception;
                        obj;
                        JVM INSTR monitorexit ;
                        throw exception;
                    }

            
            {
                zzsa = _pcls1;
                super();
            }
                }, zza.zzsd);
            }

            
            {
                zzrZ = zzdf.this;
                zzrY = zzia1;
                super();
            }
        });
        zzrW.zza("/jsLoaded", new zzcv(zzia1) {

            final zzia zzrY;
            final zzdf zzrZ;

            public void zza(zzic zzic, Map map)
            {
label0:
                {
                    synchronized (zzdf.zza(zzrZ))
                    {
                        if (zzrY.getStatus() != -1 && zzrY.getStatus() != 1)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                zzrY.zzc(zzdf.zzb(zzrZ));
                zzrY.zza(zzdf.zzc(zzrZ), new zzia.zzb());
                zzdf.zza(zzrZ, 0);
                if (zzrY != zzdf.zzd(zzrZ))
                {
                    zzrZ.zzd(zzdf.zzd(zzrZ));
                }
                zzdf.zza(zzrZ, zzrY);
                zzrZ.zzc(zzdf.zzd(zzrZ));
                zzic;
                JVM INSTR monitorexit ;
                return;
                map;
                zzic;
                JVM INSTR monitorexit ;
                throw map;
            }

            
            {
                zzrZ = zzdf.this;
                zzrY = zzia1;
                super();
            }
        });
        zzhv zzhv1 = new zzhv();
        zzcv zzcv = new zzcv(zzhv1) {

            final zzdf zzrZ;
            final zzhv zzsb;

            public void zza(zzic zzic, Map map)
            {
                synchronized (zzdf.zza(zzrZ))
                {
                    zzdf.zza(zzrZ, 1);
                    zzhx.zzaa("Javascript is requesting an update");
                    zzdf.zzb(zzrZ).zzb("/requestReload", (zzcv)zzsb.get());
                }
                return;
                map;
                zzic;
                JVM INSTR monitorexit ;
                throw map;
            }

            
            {
                zzrZ = zzdf.this;
                zzsb = zzhv1;
                super();
            }
        };
        zzhv1.set(zzcv);
        zzrW.zza("/requestReload", zzcv);
        if (zzrR.endsWith(".js"))
        {
            zzrW.zzf(zzrR);
        } else
        {
            zzrW.zzg(zzrR);
        }
        (new Timer()).schedule(new TimerTask(zzia1) {

            final zzia zzrY;
            final zzdf zzrZ;

            public void run()
            {
label0:
                {
                    synchronized (zzdf.zza(zzrZ))
                    {
                        if (zzrY.getStatus() != -1 && zzrY.getStatus() != 1)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                zzdf.zza(zzrZ, 1);
                zzrY.reject();
                obj;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                zzrZ = zzdf.this;
                zzrY = zzia1;
                super();
            }
        }, zza.zzsc);
    }

    static zzah zzb(zzdf zzdf1)
    {
        return zzdf1.zzrW;
    }

    static zzia.zzd zzc(zzdf zzdf1)
    {
        return zzdf1.zzrT;
    }

    static zzia zzd(zzdf zzdf1)
    {
        return zzdf1.zzrV;
    }

    protected zzah zza(Context context, zzhy zzhy)
    {
        return new zzaj(context, zzhy);
    }

    public void zzb(zzia zzia1)
    {
        synchronized (zznh)
        {
            zzd(zzia1);
        }
        return;
        zzia1;
        obj;
        JVM INSTR monitorexit ;
        throw zzia1;
    }

    protected void zzc(zzia zzia1)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        Integer integer1 = (Integer)zzrS.get(zzia1);
        Integer integer;
        integer = integer1;
        if (integer1 != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        integer = Integer.valueOf(0);
        zzhx.zzab("Incremented use-counter for js engine.");
        int i = integer.intValue();
        zzrS.put(zzia1, Integer.valueOf(i + 1));
        obj;
        JVM INSTR monitorexit ;
        return;
        zzia1;
        obj;
        JVM INSTR monitorexit ;
        throw zzia1;
    }

    public zzia zzcJ()
    {
label0:
        {
            zzib zzib1;
            synchronized (zznh)
            {
                if (zzrV != null && zzrV.getStatus() != -1)
                {
                    break label0;
                }
                zzib1 = new zzib();
                zzrV = zzib1;
                zza(zzib1);
                zzc(zzib1);
            }
            return zzib1;
        }
        zzia zzia1;
        if (zzrX != 0)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        zzc(zzrV);
        zzia1 = zzrV;
        obj;
        JVM INSTR monitorexit ;
        return zzia1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (zzrX != 1)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        zza(new zzib());
        zzc(zzrV);
        exception = zzrV;
        obj;
        JVM INSTR monitorexit ;
        return exception;
        if (zzrX != 2)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        zzc(zzrV);
        exception = zzrV;
        obj;
        JVM INSTR monitorexit ;
        return exception;
        zzc(zzrV);
        exception = zzrV;
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }

    protected void zzd(zzia zzia1)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        Integer integer = (Integer)zzrS.get(zzia1);
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        if (integer.intValue() != 0)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        integer = Integer.valueOf(integer.intValue() - 1);
        if (integer.intValue() == 0)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        zzhx.zzab("Decremented use-counter for js engine.");
        zzrS.put(zzia1, integer);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        zzia1;
        obj;
        JVM INSTR monitorexit ;
        throw zzia1;
        zzhx.zzab("Removing js engine.");
        zzrS.remove(zzia1);
        zzia1.zza(zzrU, new zzia.zzb());
        zzia1.zza(new zzia.zzd() {

            final zzdf zzrZ;

            public void zza(Object obj1)
            {
                zzb((zzah)obj1);
            }

            public void zzb(zzah zzah1)
            {
                zzah1.destroy();
            }

            
            {
                zzrZ = zzdf.this;
                super();
            }
        }, new zzia.zzb());
          goto _L1
    }
}
