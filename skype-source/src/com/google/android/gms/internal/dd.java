// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.b.d;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            da, cy, di, dh, 
//            dc, gm, de

public final class dd
    implements de.a
{

    private final String a;
    private final dh b;
    private final long c;
    private final cy d;
    private final AdRequestParcel e;
    private final AdSizeParcel f;
    private final Context g;
    private final Object h = new Object();
    private final VersionInfoParcel i;
    private final boolean j;
    private final NativeAdOptionsParcel k;
    private final List l;
    private di m;
    private int n;

    public dd(Context context, String s, dh dh1, da da1, cy cy1, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, 
            VersionInfoParcel versioninfoparcel, boolean flag, NativeAdOptionsParcel nativeadoptionsparcel, List list)
    {
        n = -2;
        g = context;
        b = dh1;
        d = cy1;
        long l1;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(s))
        {
            a = b();
        } else
        {
            a = s;
        }
        if (da1.b != -1L)
        {
            l1 = da1.b;
        } else
        {
            l1 = 10000L;
        }
        c = l1;
        e = adrequestparcel;
        f = adsizeparcel;
        i = versioninfoparcel;
        j = flag;
        k = nativeadoptionsparcel;
        l = list;
    }

    static di a(dd dd1, di di1)
    {
        dd1.m = di1;
        return di1;
    }

    static Object a(dd dd1)
    {
        return dd1.h;
    }

    static void a(dd dd1, dc dc1)
    {
        if ("com.google.ads.mediation.AdUrlAdapter".equals(dd1.a))
        {
            Bundle bundle1 = dd1.e.m.getBundle(dd1.a);
            Bundle bundle = bundle1;
            if (bundle1 == null)
            {
                bundle = new Bundle();
            }
            bundle.putString("sdk_less_network_id", dd1.d.b);
            dd1.e.m.putBundle(dd1.a, bundle);
        }
        if (dd1.i.d >= 0x3e8fa0)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        if (dd1.f.e)
        {
            dd1.m.a(com.google.android.gms.b.d.a(dd1.g), dd1.e, dd1.d.h, dc1);
            return;
        }
        try
        {
            dd1.m.a(com.google.android.gms.b.d.a(dd1.g), dd1.f, dd1.e, dd1.d.h, dc1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (dc dc1)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not request ad from mediation adapter.", dc1);
        }
        dd1.a(5);
        return;
        if (dd1.j)
        {
            dd1.m.a(com.google.android.gms.b.d.a(dd1.g), dd1.e, dd1.d.h, dd1.d.a, dc1, dd1.k, dd1.l);
            return;
        }
        if (dd1.f.e)
        {
            dd1.m.a(com.google.android.gms.b.d.a(dd1.g), dd1.e, dd1.d.h, dd1.d.a, dc1);
            return;
        }
        dd1.m.a(com.google.android.gms.b.d.a(dd1.g), dd1.f, dd1.e, dd1.d.h, dd1.d.a, dc1);
        return;
    }

    static int b(dd dd1)
    {
        return dd1.n;
    }

    private String b()
    {
        if (!TextUtils.isEmpty(d.e))
        {
            if (b.b(d.e))
            {
                return "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
            } else
            {
                return "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        }
        break MISSING_BLOCK_LABEL_44;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.ads.internal.util.client.b.c("Fail to determine the custom event's version, assuming the old one.");
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private di c()
    {
        com.google.android.gms.ads.internal.util.client.b.b((new StringBuilder("Instantiating mediation adapter: ")).append(a).toString());
        di di1;
        try
        {
            di1 = b.a(a);
        }
        catch (RemoteException remoteexception)
        {
            (new StringBuilder("Could not instantiate mediation adapter: ")).append(a);
            com.google.android.gms.ads.internal.util.client.b.a(3);
            return null;
        }
        return di1;
    }

    static di c(dd dd1)
    {
        return dd1.c();
    }

    static di d(dd dd1)
    {
        return dd1.m;
    }

    public final de a(long l1)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        long l2;
        long l3;
        l2 = SystemClock.elapsedRealtime();
        obj1 = new dc();
        gm.a.post(new Runnable(((dc) (obj1))) {

            final dc a;
            final dd b;

            public final void run()
            {
label0:
                {
                    synchronized (dd.a(b))
                    {
                        if (com.google.android.gms.internal.dd.b(b) == -2)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                dd.a(b, dd.c(b));
                if (com.google.android.gms.internal.dd.d(b) != null)
                {
                    break MISSING_BLOCK_LABEL_66;
                }
                b.a(4);
                obj2;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj2;
                JVM INSTR monitorexit ;
                throw exception;
                a.a(b);
                dd.a(b, a);
                obj2;
                JVM INSTR monitorexit ;
            }

            
            {
                b = dd.this;
                a = dc1;
                super();
            }
        });
        l3 = c;
_L1:
        long l5;
        if (n != -2)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        l5 = SystemClock.elapsedRealtime();
        long l4;
        l4 = l3 - (l5 - l2);
        l5 = 60000L - (l5 - l1);
        if (l4 > 0L && l5 > 0L)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        com.google.android.gms.ads.internal.util.client.b.b("Timed out waiting for adapter.");
        n = 3;
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        h.wait(Math.min(l4, l5));
          goto _L1
        InterruptedException interruptedexception;
        interruptedexception;
        n = -1;
          goto _L1
        obj1 = new de(d, m, a, ((dc) (obj1)), n);
        obj;
        JVM INSTR monitorexit ;
        return ((de) (obj1));
    }

    public final void a()
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (m != null)
        {
            m.c();
        }
_L1:
        n = -1;
        h.notify();
        return;
        Object obj1;
        obj1;
        com.google.android.gms.ads.internal.util.client.b.b("Could not destroy mediation adapter.", ((Throwable) (obj1)));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public final void a(int i1)
    {
        synchronized (h)
        {
            n = i1;
            h.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
