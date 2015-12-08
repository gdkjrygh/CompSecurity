// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zze, zzl, ApplicationStatus, DeviceStatus

private static class tLooper extends a
{

    private final AtomicReference a;
    private final Handler b;

    private void a(zze zze1, long l, int i)
    {
        synchronized (zze.zzh(zze1))
        {
            zze1 = (com.google.android.gms.common.api.b)zze.zzh(zze1).remove(Long.valueOf(l));
        }
        if (zze1 != null)
        {
            zze1.zzj(new Status(i));
        }
        return;
        zze1;
        map;
        JVM INSTR monitorexit ;
        throw zze1;
    }

    private boolean a(zze zze1, int i)
    {
        Object obj = zze.zzkj();
        obj;
        JVM INSTR monitorenter ;
        if (zze.zzi(zze1) == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        zze.zzi(zze1).zzj(new Status(i));
        zze.zzb(zze1, null);
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        zze1;
        obj;
        JVM INSTR monitorexit ;
        throw zze1;
    }

    public zze a()
    {
        zze zze1 = (zze)a.getAndSet(null);
        if (zze1 == null)
        {
            return null;
        } else
        {
            zze.zzc(zze1);
            return zze1;
        }
    }

    public boolean b()
    {
        return a.get() == null;
    }

    public void onApplicationDisconnected(int i)
    {
        zze zze1 = (zze)a.get();
        if (zze1 != null)
        {
            zze.zza(zze1, null);
            zze.zzb(zze1, null);
            a(zze1, i);
            if (zze.zze(zze1) != null)
            {
                b.post(new Runnable(zze1, i) {

                    final zze a;
                    final int b;
                    final zze.c c;

                    public void run()
                    {
                        if (zze.zze(a) != null)
                        {
                            zze.zze(a).onApplicationDisconnected(b);
                        }
                    }

            
            {
                c = zze.c.this;
                a = zze1;
                b = i;
                super();
            }
                });
                return;
            }
        }
    }

    public void zza(ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
    {
        zze zze1 = (zze)a.get();
        if (zze1 == null)
        {
            return;
        }
        zze.zza(zze1, applicationmetadata);
        zze.zza(zze1, applicationmetadata.getApplicationId());
        zze.zzb(zze1, s1);
        synchronized (zze.zzki())
        {
            if (zze.zzd(zze1) != null)
            {
                zze.zzd(zze1).zzj(new <init>(new Status(0), applicationmetadata, s, s1, flag));
                zze.zza(zze1, null);
            }
        }
        return;
        applicationmetadata;
        obj;
        JVM INSTR monitorexit ;
        throw applicationmetadata;
    }

    public void zza(String s, double d, boolean flag)
    {
        zze.zzkh().zzb("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    public void zza(String s, long l, int i)
    {
        s = (zze)a.get();
        if (s == null)
        {
            return;
        } else
        {
            a(s, l, i);
            return;
        }
    }

    public void zzam(int i)
    {
        zze zze1 = a();
        if (zze1 != null)
        {
            zze.zzkh().zzb("ICastDeviceControllerListener.onDisconnected: %d", new Object[] {
                Integer.valueOf(i)
            });
            if (i != 0)
            {
                zze1.zzaO(2);
                return;
            }
        }
    }

    public void zzan(int i)
    {
        zze zze1 = (zze)a.get();
        if (zze1 == null)
        {
            return;
        }
        synchronized (zze.zzki())
        {
            if (zze.zzd(zze1) != null)
            {
                zze.zzd(zze1).zzj(new <init>(new Status(i)));
                zze.zza(zze1, null);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzao(int i)
    {
        zze zze1 = (zze)a.get();
        if (zze1 == null)
        {
            return;
        } else
        {
            a(zze1, i);
            return;
        }
    }

    public void zzap(int i)
    {
        zze zze1 = (zze)a.get();
        if (zze1 == null)
        {
            return;
        } else
        {
            a(zze1, i);
            return;
        }
    }

    public void zzb(ApplicationStatus applicationstatus)
    {
        zze zze1 = (zze)a.get();
        if (zze1 == null)
        {
            return;
        } else
        {
            zze.zzkh().zzb("onApplicationStatusChanged", new Object[0]);
            b.post(new Runnable(zze1, applicationstatus) {

                final zze a;
                final ApplicationStatus b;
                final zze.c c;

                public void run()
                {
                    zze.zza(a, b);
                }

            
            {
                c = zze.c.this;
                a = zze1;
                b = applicationstatus;
                super();
            }
            });
            return;
        }
    }

    public void zzb(DeviceStatus devicestatus)
    {
        zze zze1 = (zze)a.get();
        if (zze1 == null)
        {
            return;
        } else
        {
            zze.zzkh().zzb("onDeviceStatusChanged", new Object[0]);
            b.post(new Runnable(zze1, devicestatus) {

                final zze a;
                final DeviceStatus b;
                final zze.c c;

                public void run()
                {
                    zze.zza(a, b);
                }

            
            {
                c = zze.c.this;
                a = zze1;
                b = devicestatus;
                super();
            }
            });
            return;
        }
    }

    public void zzb(String s, byte abyte0[])
    {
        if ((zze)a.get() == null)
        {
            return;
        } else
        {
            zze.zzkh().zzb("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[] {
                s, Integer.valueOf(abyte0.length)
            });
            return;
        }
    }

    public void zzc(String s, long l)
    {
        s = (zze)a.get();
        if (s == null)
        {
            return;
        } else
        {
            a(s, l, 0);
            return;
        }
    }

    public void zzp(String s, String s1)
    {
        zze zze1 = (zze)a.get();
        if (zze1 == null)
        {
            return;
        } else
        {
            zze.zzkh().zzb("Receive (type=text, ns=%s) %s", new Object[] {
                s, s1
            });
            b.post(new Runnable(zze1, s, s1) {

                final zze a;
                final String b;
                final String c;
                final zze.c d;

                public void run()
                {
                    com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback;
                    synchronized (zze.zzf(a))
                    {
                        messagereceivedcallback = (com.google.android.gms.cast.Cast.MessageReceivedCallback)zze.zzf(a).get(b);
                    }
                    if (messagereceivedcallback != null)
                    {
                        messagereceivedcallback.onMessageReceived(zze.zzg(a), b, c);
                        return;
                    } else
                    {
                        zze.zzkh().zzb("Discarded message for unknown namespace '%s'", new Object[] {
                            b
                        });
                        return;
                    }
                    exception;
                    map;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                d = zze.c.this;
                a = zze1;
                b = s;
                c = s1;
                super();
            }
            });
            return;
        }
    }

    public _cls4.c(zze zze1)
    {
        a = new AtomicReference(zze1);
        b = new Handler(zze1.getLooper());
    }
}
