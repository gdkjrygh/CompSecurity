// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.zzi;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zzl, ApplicationStatus, zzf, DeviceStatus, 
//            zzi

public final class zze extends zzi
{
    private static final class a
        implements com.google.android.gms.cast.Cast.ApplicationConnectionResult
    {

        private final Status a;
        private final ApplicationMetadata b;
        private final String c;
        private final String d;
        private final boolean e;

        public ApplicationMetadata getApplicationMetadata()
        {
            return b;
        }

        public String getApplicationStatus()
        {
            return c;
        }

        public String getSessionId()
        {
            return d;
        }

        public Status getStatus()
        {
            return a;
        }

        public boolean getWasLaunched()
        {
            return e;
        }

        public a(Status status)
        {
            this(status, null, null, null, false);
        }

        public a(Status status, ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
        {
            a = status;
            b = applicationmetadata;
            c = s;
            d = s1;
            e = flag;
        }
    }

    private class b
        implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        final zze a;

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            zze.zzb(a);
        }

        private b()
        {
            a = zze.this;
            super();
        }

    }

    private static class c extends zzj.zza
    {

        private final AtomicReference a;
        private final Handler b;

        private void a(zze zze1, long l, int i)
        {
            synchronized (zze.zzh(zze1))
            {
                zze1 = (com.google.android.gms.common.api.zza.zzb)zze.zzh(zze1).remove(Long.valueOf(l));
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
            if (com.google.android.gms.cast.internal.zze.zzi(zze1) == null)
            {
                break MISSING_BLOCK_LABEL_40;
            }
            com.google.android.gms.cast.internal.zze.zzi(zze1).zzj(new Status(i));
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
                    b.post(new Runnable(this, zze1, i) {

                        final zze a;
                        final int b;
                        final c c;

                        public void run()
                        {
                            if (zze.zze(a) != null)
                            {
                                zze.zze(a).onApplicationDisconnected(b);
                            }
                        }

            
            {
                c = c1;
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
                    zze.zzd(zze1).zzj(new a(new Status(0), applicationmetadata, s, s1, flag));
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
                    zze.zzd(zze1).zzj(new a(new Status(i)));
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
                b.post(new Runnable(this, zze1, applicationstatus) {

                    final zze a;
                    final ApplicationStatus b;
                    final c c;

                    public void run()
                    {
                        zze.zza(a, b);
                    }

            
            {
                c = c1;
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
                b.post(new Runnable(this, zze1, devicestatus) {

                    final zze a;
                    final DeviceStatus b;
                    final c c;

                    public void run()
                    {
                        zze.zza(a, b);
                    }

            
            {
                c = c1;
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
                b.post(new Runnable(this, zze1, s, s1) {

                    final zze a;
                    final String b;
                    final String c;
                    final c d;

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
                d = c1;
                a = zze1;
                b = s;
                c = s1;
                super();
            }
                });
                return;
            }
        }

        public c(zze zze1)
        {
            a = new AtomicReference(zze1);
            b = new Handler(zze1.getLooper());
        }
    }


    private static final Object zzNS = new Object();
    private static final Object zzNT = new Object();
    private static final zzl zzNy = new zzl("CastClientImpl");
    private final com.google.android.gms.cast.Cast.Listener zzLS;
    private double zzMD;
    private boolean zzME;
    private final CastDevice zzNA;
    private final Map zzNB = new HashMap();
    private final long zzNC;
    private c zzND;
    private String zzNE;
    private boolean zzNF;
    private boolean zzNG;
    private boolean zzNH;
    private int zzNI;
    private int zzNJ;
    private final AtomicLong zzNK = new AtomicLong(0L);
    private String zzNL;
    private String zzNM;
    private Bundle zzNN;
    private final Map zzNO = new HashMap();
    private final b zzNP = new b();
    private com.google.android.gms.common.api.zza.zzb zzNQ;
    private com.google.android.gms.common.api.zza.zzb zzNR;
    private ApplicationMetadata zzNz;

    public zze(Context context, Looper looper, CastDevice castdevice, long l, com.google.android.gms.cast.Cast.Listener listener, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, 
            com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 10, connectioncallbacks, onconnectionfailedlistener);
        zzNA = castdevice;
        zzLS = listener;
        zzNC = l;
        zzjY();
        registerConnectionFailedListener(zzNP);
    }

    static ApplicationMetadata zza(zze zze1, ApplicationMetadata applicationmetadata)
    {
        zze1.zzNz = applicationmetadata;
        return applicationmetadata;
    }

    static com.google.android.gms.common.api.zza.zzb zza(zze zze1, com.google.android.gms.common.api.zza.zzb zzb1)
    {
        zze1.zzNQ = zzb1;
        return zzb1;
    }

    static String zza(zze zze1, String s)
    {
        zze1.zzNL = s;
        return s;
    }

    private void zza(ApplicationStatus applicationstatus)
    {
        applicationstatus = applicationstatus.zzjV();
        boolean flag;
        if (!com.google.android.gms.cast.internal.zzf.zza(applicationstatus, zzNE))
        {
            zzNE = applicationstatus;
            flag = true;
        } else
        {
            flag = false;
        }
        zzNy.zzb("hasChanged=%b, mFirstApplicationStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(zzNF)
        });
        if (zzLS != null && (flag || zzNF))
        {
            zzLS.onApplicationStatusChanged();
        }
        zzNF = false;
    }

    private void zza(DeviceStatus devicestatus)
    {
        ApplicationMetadata applicationmetadata = devicestatus.getApplicationMetadata();
        if (!com.google.android.gms.cast.internal.zzf.zza(applicationmetadata, zzNz))
        {
            zzNz = applicationmetadata;
            zzLS.onApplicationMetadataChanged(zzNz);
        }
        double d = devicestatus.zzkc();
        int i;
        boolean flag;
        boolean flag1;
        if (d != (0.0D / 0.0D) && Math.abs(d - zzMD) > 9.9999999999999995E-08D)
        {
            zzMD = d;
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = devicestatus.zzkm();
        if (flag1 != zzME)
        {
            zzME = flag1;
            flag = true;
        }
        zzNy.zzb("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(zzNG)
        });
        if (zzLS != null && (flag || zzNG))
        {
            zzLS.onVolumeChanged();
        }
        i = devicestatus.zzkd();
        if (i != zzNI)
        {
            zzNI = i;
            flag = true;
        } else
        {
            flag = false;
        }
        zzNy.zzb("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(zzNG)
        });
        if (zzLS != null && (flag || zzNG))
        {
            zzLS.onActiveInputStateChanged(zzNI);
        }
        i = devicestatus.zzke();
        if (i != zzNJ)
        {
            zzNJ = i;
            flag = true;
        } else
        {
            flag = false;
        }
        zzNy.zzb("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(zzNG)
        });
        if (zzLS != null && (flag || zzNG))
        {
            zzLS.onStandbyStateChanged(zzNJ);
        }
        zzNG = false;
    }

    static void zza(zze zze1, ApplicationStatus applicationstatus)
    {
        zze1.zza(applicationstatus);
    }

    static void zza(zze zze1, DeviceStatus devicestatus)
    {
        zze1.zza(devicestatus);
    }

    static com.google.android.gms.common.api.zza.zzb zzb(zze zze1, com.google.android.gms.common.api.zza.zzb zzb1)
    {
        zze1.zzNR = zzb1;
        return zzb1;
    }

    static String zzb(zze zze1, String s)
    {
        zze1.zzNM = s;
        return s;
    }

    static void zzb(zze zze1)
    {
        zze1.zzkf();
    }

    static void zzc(zze zze1)
    {
        zze1.zzjY();
    }

    private void zzc(com.google.android.gms.common.api.zza.zzb zzb1)
    {
        synchronized (zzNS)
        {
            if (zzNQ != null)
            {
                zzNQ.zzj(new a(new Status(2002)));
            }
            zzNQ = zzb1;
        }
        return;
        zzb1;
        obj;
        JVM INSTR monitorexit ;
        throw zzb1;
    }

    static com.google.android.gms.common.api.zza.zzb zzd(zze zze1)
    {
        return zze1.zzNQ;
    }

    static com.google.android.gms.cast.Cast.Listener zze(zze zze1)
    {
        return zze1.zzLS;
    }

    private void zze(com.google.android.gms.common.api.zza.zzb zzb1)
    {
label0:
        {
            synchronized (zzNT)
            {
                if (zzNR == null)
                {
                    break label0;
                }
                zzb1.zzj(new Status(2001));
            }
            return;
        }
        zzNR = zzb1;
        obj;
        JVM INSTR monitorexit ;
        return;
        zzb1;
        obj;
        JVM INSTR monitorexit ;
        throw zzb1;
    }

    static Map zzf(zze zze1)
    {
        return zze1.zzNB;
    }

    static CastDevice zzg(zze zze1)
    {
        return zze1.zzNA;
    }

    static Map zzh(zze zze1)
    {
        return zze1.zzNO;
    }

    static com.google.android.gms.common.api.zza.zzb zzi(zze zze1)
    {
        return zze1.zzNR;
    }

    private void zzjY()
    {
        zzNH = false;
        zzNI = -1;
        zzNJ = -1;
        zzNz = null;
        zzNE = null;
        zzMD = 0.0D;
        zzME = false;
    }

    private void zzkf()
    {
        zzNy.zzb("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (zzNB)
        {
            zzNB.clear();
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void zzkg()
        throws IllegalStateException
    {
        if (!zzNH || zzND == null || zzND.b())
        {
            throw new IllegalStateException("Not connected to a device");
        } else
        {
            return;
        }
    }

    static zzl zzkh()
    {
        return zzNy;
    }

    static Object zzki()
    {
        return zzNS;
    }

    static Object zzkj()
    {
        return zzNT;
    }

    public void disconnect()
    {
        zzNy.zzb("disconnect(); ServiceListener=%s, isConnected=%b", new Object[] {
            zzND, Boolean.valueOf(isConnected())
        });
        c c1 = zzND;
        zzND = null;
        if (c1 == null || c1.a() == null)
        {
            zzNy.zzb("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        zzkf();
        if (isConnected() || isConnecting())
        {
            ((com.google.android.gms.cast.internal.zzi)zzlX()).disconnect();
        }
        super.disconnect();
        return;
        Object obj;
        obj;
        zzNy.zza(((Throwable) (obj)), "Error while disconnecting the controller interface: %s", new Object[] {
            ((RemoteException) (obj)).getMessage()
        });
        super.disconnect();
        return;
        obj;
        super.disconnect();
        throw obj;
    }

    public ApplicationMetadata getApplicationMetadata()
        throws IllegalStateException
    {
        zzkg();
        return zzNz;
    }

    public String getApplicationStatus()
        throws IllegalStateException
    {
        zzkg();
        return zzNE;
    }

    public boolean isMute()
        throws IllegalStateException
    {
        zzkg();
        return zzME;
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzN(ibinder);
    }

    protected com.google.android.gms.cast.internal.zzi zzN(IBinder ibinder)
    {
        return com.google.android.gms.cast.internal.zzi.zza.zzO(ibinder);
    }

    public void zzN(boolean flag)
        throws IllegalStateException, RemoteException
    {
        ((com.google.android.gms.cast.internal.zzi)zzlX()).zza(flag, zzMD, zzME);
    }

    protected void zza(int i, IBinder ibinder, Bundle bundle)
    {
        zzNy.zzb("in onPostInitHandler; statusCode=%d", new Object[] {
            Integer.valueOf(i)
        });
        int j;
        if (i == 0 || i == 1001)
        {
            zzNH = true;
            zzNF = true;
            zzNG = true;
        } else
        {
            zzNH = false;
        }
        j = i;
        if (i == 1001)
        {
            zzNN = new Bundle();
            zzNN.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            j = 0;
        }
        super.zza(j, ibinder, bundle);
    }

    public void zza(String s, com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        com.google.android.gms.cast.internal.zzf.zzbo(s);
        zzbn(s);
        if (messagereceivedcallback != null)
        {
            synchronized (zzNB)
            {
                zzNB.put(s, messagereceivedcallback);
            }
            ((com.google.android.gms.cast.internal.zzi)zzlX()).zzbr(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void zza(String s, LaunchOptions launchoptions, com.google.android.gms.common.api.zza.zzb zzb1)
        throws IllegalStateException, RemoteException
    {
        zzc(zzb1);
        ((com.google.android.gms.cast.internal.zzi)zzlX()).zza(s, launchoptions);
    }

    public void zza(String s, com.google.android.gms.common.api.zza.zzb zzb1)
        throws IllegalStateException, RemoteException
    {
        zze(zzb1);
        ((com.google.android.gms.cast.internal.zzi)zzlX()).zzbq(s);
    }

    public void zza(String s, String s1, com.google.android.gms.common.api.zza.zzb zzb1)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (s1.length() > 0x10000)
        {
            throw new IllegalArgumentException("Message exceeds maximum size");
        }
        com.google.android.gms.cast.internal.zzf.zzbo(s);
        zzkg();
        long l = zzNK.incrementAndGet();
        try
        {
            zzNO.put(Long.valueOf(l), zzb1);
            ((com.google.android.gms.cast.internal.zzi)zzlX()).zza(s, s1, l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzNO.remove(Long.valueOf(l));
        }
        throw s;
    }

    public void zza(String s, boolean flag, com.google.android.gms.common.api.zza.zzb zzb1)
        throws IllegalStateException, RemoteException
    {
        zzc(zzb1);
        ((com.google.android.gms.cast.internal.zzi)zzlX()).zzf(s, flag);
    }

    public void zzb(double d)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        if (Double.isInfinite(d) || Double.isNaN(d))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Volume cannot be ").append(d).toString());
        } else
        {
            ((com.google.android.gms.cast.internal.zzi)zzlX()).zza(d, zzMD, zzME);
            return;
        }
    }

    public void zzb(String s, String s1, com.google.android.gms.common.api.zza.zzb zzb1)
        throws IllegalStateException, RemoteException
    {
        zzc(zzb1);
        ((com.google.android.gms.cast.internal.zzi)zzlX()).zzq(s, s1);
    }

    public void zzbn(String s)
        throws IllegalArgumentException, RemoteException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback;
        synchronized (zzNB)
        {
            messagereceivedcallback = (com.google.android.gms.cast.Cast.MessageReceivedCallback)zzNB.remove(s);
        }
        if (messagereceivedcallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ((com.google.android.gms.cast.internal.zzi)zzlX()).zzbs(s);
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        zzNy.zza(illegalstateexception, "Error unregistering namespace (%s): %s", new Object[] {
            s, illegalstateexception.getMessage()
        });
        return;
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1)
        throws IllegalStateException, RemoteException
    {
        zze(zzb1);
        ((com.google.android.gms.cast.internal.zzi)zzlX()).zzkn();
    }

    protected String zzeq()
    {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    protected String zzer()
    {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    public Bundle zzjZ()
    {
        if (zzNN != null)
        {
            Bundle bundle = zzNN;
            zzNN = null;
            return bundle;
        } else
        {
            return super.zzjZ();
        }
    }

    protected Bundle zzka()
    {
        Bundle bundle = new Bundle();
        zzNy.zzb("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", new Object[] {
            zzNL, zzNM
        });
        zzNA.putInBundle(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", zzNC);
        zzND = new c(this);
        bundle.putParcelable("listener", new BinderWrapper(zzND.asBinder()));
        if (zzNL != null)
        {
            bundle.putString("last_application_id", zzNL);
            if (zzNM != null)
            {
                bundle.putString("last_session_id", zzNM);
            }
        }
        return bundle;
    }

    public void zzkb()
        throws IllegalStateException, RemoteException
    {
        ((com.google.android.gms.cast.internal.zzi)zzlX()).zzkb();
    }

    public double zzkc()
        throws IllegalStateException
    {
        zzkg();
        return zzMD;
    }

    public int zzkd()
        throws IllegalStateException
    {
        zzkg();
        return zzNI;
    }

    public int zzke()
        throws IllegalStateException
    {
        zzkg();
        return zzNJ;
    }

}
