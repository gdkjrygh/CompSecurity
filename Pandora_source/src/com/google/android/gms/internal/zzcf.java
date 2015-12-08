// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal:
//            zzy, zzfr, zzaa, zzfx, 
//            zzfy, zzbs, zzgd

public class zzcf
{
    static class a
    {

        static int a = 60000;
        static int b = 10000;

    }


    private final Context mContext;
    private final Object zzoe;
    private final VersionInfoParcel zzoi;
    private final String zztY;
    private final WeakHashMap zztZ;
    private zzfx.zzd zzua;
    private zzfx.zzd zzub;
    private zzfx zzuc;
    private zzy zzud;
    private int zzue;

    public zzcf(Context context, VersionInfoParcel versioninfoparcel, String s)
    {
        zzoe = new Object();
        zzue = 1;
        zztY = s;
        mContext = context.getApplicationContext();
        zzoi = versioninfoparcel;
        zztZ = new WeakHashMap();
        zzua = new zzfx.zzc();
        zzub = new zzfx.zzc();
    }

    public zzcf(Context context, VersionInfoParcel versioninfoparcel, String s, zzfx.zzd zzd1, zzfx.zzd zzd2)
    {
        this(context, versioninfoparcel, s);
        zzua = zzd1;
        zzub = zzd2;
    }

    static int zza(zzcf zzcf1, int i)
    {
        zzcf1.zzue = i;
        return i;
    }

    static zzfx zza(zzcf zzcf1, zzfx zzfx1)
    {
        zzcf1.zzuc = zzfx1;
        return zzfx1;
    }

    static Object zza(zzcf zzcf1)
    {
        return zzcf1.zzoe;
    }

    private void zza(zzfx zzfx1)
    {
        zzue = 2;
        zzud = zza(mContext, zzoi);
        zzud.zza(new zzy.zza(zzfx1) {

            final zzfx a;
            final zzcf b;

            public void zzbq()
            {
                (new Timer()).schedule(new TimerTask(this) {

                    final _cls1 a;

                    public void run()
                    {
label0:
                        {
                            synchronized (zzcf.zza(a.b))
                            {
                                if (a.a.getStatus() != -1 && a.a.getStatus() != 1)
                                {
                                    break label0;
                                }
                            }
                            return;
                        }
                        zzcf.zza(a.b, 1);
                        a.a.reject();
                        obj;
                        JVM INSTR monitorexit ;
                        return;
                        exception;
                        obj;
                        JVM INSTR monitorexit ;
                        throw exception;
                    }

            
            {
                a = _pcls1;
                super();
            }
                }, a.b);
            }

            
            {
                b = zzcf.this;
                a = zzfx1;
                super();
            }
        });
        zzud.zza("/jsLoaded", new zzbs(zzfx1) {

            final zzfx a;
            final zzcf b;

            public void zza(zzgd zzgd, Map map)
            {
label0:
                {
                    synchronized (zzcf.zza(b))
                    {
                        if (a.getStatus() != -1 && a.getStatus() != 1)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                a.zzd(com.google.android.gms.internal.zzcf.zzb(b));
                a.zza(zzcf.zzc(b), new zzfx.zzb());
                zzcf.zza(b, 0);
                if (a != zzcf.zzd(b))
                {
                    b.zzd(zzcf.zzd(b));
                }
                zzcf.zza(b, a);
                b.zzc(zzcf.zzd(b));
                zzgd;
                JVM INSTR monitorexit ;
                return;
                map;
                zzgd;
                JVM INSTR monitorexit ;
                throw map;
            }

            
            {
                b = zzcf.this;
                a = zzfx1;
                super();
            }
        });
        zzfr zzfr1 = new zzfr();
        zzbs zzbs = new zzbs(zzfr1) {

            final zzfr a;
            final zzcf b;

            public void zza(zzgd zzgd, Map map)
            {
                synchronized (zzcf.zza(b))
                {
                    zzcf.zza(b, 1);
                    com.google.android.gms.ads.internal.util.client.zzb.zzal("Javascript is requesting an update");
                    com.google.android.gms.internal.zzcf.zzb(b).zzb("/requestReload", (zzbs)a.get());
                }
                return;
                map;
                zzgd;
                JVM INSTR monitorexit ;
                throw map;
            }

            
            {
                b = zzcf.this;
                a = zzfr1;
                super();
            }
        };
        zzfr1.set(zzbs);
        zzud.zza("/requestReload", zzbs);
        if (zztY.endsWith(".js"))
        {
            zzud.zzg(zztY);
        } else
        if (zztY.startsWith("<html>"))
        {
            zzud.zzi(zztY);
        } else
        {
            zzud.zzh(zztY);
        }
        (new Timer()).schedule(new TimerTask(zzfx1) {

            final zzfx a;
            final zzcf b;

            public void run()
            {
label0:
                {
                    synchronized (zzcf.zza(b))
                    {
                        if (a.getStatus() != -1 && a.getStatus() != 1)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                zzcf.zza(b, 1);
                a.reject();
                obj;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                b = zzcf.this;
                a = zzfx1;
                super();
            }
        }, a.a);
    }

    static zzy zzb(zzcf zzcf1)
    {
        return zzcf1.zzud;
    }

    static zzfx.zzd zzc(zzcf zzcf1)
    {
        return zzcf1.zzua;
    }

    static zzfx zzd(zzcf zzcf1)
    {
        return zzcf1.zzuc;
    }

    protected zzy zza(Context context, VersionInfoParcel versioninfoparcel)
    {
        return new zzaa(context, versioninfoparcel);
    }

    public void zzb(zzfx zzfx1)
    {
        synchronized (zzoe)
        {
            zzd(zzfx1);
        }
        return;
        zzfx1;
        obj;
        JVM INSTR monitorexit ;
        throw zzfx1;
    }

    protected void zzc(zzfx zzfx1)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        Integer integer1 = (Integer)zztZ.get(zzfx1);
        Integer integer;
        integer = integer1;
        if (integer1 != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        integer = Integer.valueOf(0);
        com.google.android.gms.ads.internal.util.client.zzb.zzam("Incremented use-counter for js engine.");
        int i = integer.intValue();
        zztZ.put(zzfx1, Integer.valueOf(i + 1));
        obj;
        JVM INSTR monitorexit ;
        return;
        zzfx1;
        obj;
        JVM INSTR monitorexit ;
        throw zzfx1;
    }

    protected void zzd(zzfx zzfx1)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        Integer integer = (Integer)zztZ.get(zzfx1);
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
        com.google.android.gms.ads.internal.util.client.zzb.zzam("Decremented use-counter for js engine.");
        zztZ.put(zzfx1, integer);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        zzfx1;
        obj;
        JVM INSTR monitorexit ;
        throw zzfx1;
        com.google.android.gms.ads.internal.util.client.zzb.zzam("Removing js engine.");
        zztZ.remove(zzfx1);
        zzfx1.zza(zzub, new zzfx.zzb());
        zzfx1.zza(new zzfx.zzd() {

            final zzcf a;

            public void a(zzy zzy1)
            {
                zzy1.destroy();
            }

            public void zza(Object obj1)
            {
                a((zzy)obj1);
            }

            
            {
                a = zzcf.this;
                super();
            }
        }, new zzfx.zzb());
          goto _L1
    }

    public zzfx zzda()
    {
label0:
        {
            zzfy zzfy1;
            synchronized (zzoe)
            {
                if (zzuc != null && zzuc.getStatus() != -1)
                {
                    break label0;
                }
                zzfy1 = new zzfy();
                zzuc = zzfy1;
                zza(zzfy1);
                zzc(zzfy1);
            }
            return zzfy1;
        }
        zzfx zzfx1;
        if (zzue != 0)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        zzc(zzuc);
        zzfx1 = zzuc;
        obj;
        JVM INSTR monitorexit ;
        return zzfx1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (zzue != 1)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        zza(new zzfy());
        zzc(zzuc);
        exception = zzuc;
        obj;
        JVM INSTR monitorexit ;
        return exception;
        if (zzue != 2)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        zzc(zzuc);
        exception = zzuc;
        obj;
        JVM INSTR monitorexit ;
        return exception;
        zzc(zzuc);
        exception = zzuc;
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }
}
