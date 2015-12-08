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
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.b.d;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ik, ie, id, is, 
//            ip, cy, cx, ji, 
//            ig, qa, ii, ij, 
//            iy

public final class ih
    implements ik
{

    private final String a;
    private final ip b;
    private final long c;
    private final id d;
    private final AdRequestParcel e;
    private final AdSizeParcel f;
    private final Context g;
    private final Object h = new Object();
    private final VersionInfoParcel i;
    private final boolean j;
    private final NativeAdOptionsParcel k;
    private final List l;
    private is m;
    private int n;
    private iy o;

    public ih(Context context, String s, ip ip1, ie ie1, id id1, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, 
            VersionInfoParcel versioninfoparcel, boolean flag, NativeAdOptionsParcel nativeadoptionsparcel, List list)
    {
        n = -2;
        g = context;
        b = ip1;
        d = id1;
        long l1;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(s))
        {
            a = b();
        } else
        {
            a = s;
        }
        if (ie1.b != -1L)
        {
            l1 = ie1.b;
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

    static is a(ih ih1, is is1)
    {
        ih1.m = is1;
        return is1;
    }

    static Object a(ih ih1)
    {
        return ih1.h;
    }

    static void a(ih ih1, ig ig1)
    {
        if ("com.google.ads.mediation.AdUrlAdapter".equals(ih1.a))
        {
            Bundle bundle1 = ih1.e.zzsL.getBundle(ih1.a);
            Bundle bundle = bundle1;
            if (bundle1 == null)
            {
                bundle = new Bundle();
            }
            bundle.putString("sdk_less_network_id", ih1.d.b);
            ih1.e.zzsL.putBundle(ih1.a, bundle);
        }
        if (ih1.i.zzJw >= 0x3e8fa0)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        if (ih1.f.zztf)
        {
            ih1.m.a(com.google.android.gms.b.d.a(ih1.g), ih1.e, ih1.d.h, ig1);
            return;
        }
        try
        {
            ih1.m.a(com.google.android.gms.b.d.a(ih1.g), ih1.f, ih1.e, ih1.d.h, ig1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ig ig1)
        {
            zzb.zzd("Could not request ad from mediation adapter.", ig1);
        }
        ih1.a(5);
        return;
        if (ih1.j)
        {
            ih1.m.a(com.google.android.gms.b.d.a(ih1.g), ih1.e, ih1.d.h, ih1.d.a, ig1, ih1.k, ih1.l);
            return;
        }
        if (ih1.f.zztf)
        {
            ih1.m.a(com.google.android.gms.b.d.a(ih1.g), ih1.e, ih1.d.h, ih1.d.a, ig1);
            return;
        }
        ih1.m.a(com.google.android.gms.b.d.a(ih1.g), ih1.f, ih1.e, ih1.d.h, ih1.d.a, ig1);
        return;
    }

    static int b(ih ih1)
    {
        return ih1.n;
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
        zzb.zzaH("Fail to determine the custom event's version, assuming the old one.");
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private is c()
    {
        zzb.zzaG((new StringBuilder("Instantiating mediation adapter: ")).append(a).toString());
        Object obj = cy.ak;
        if (((Boolean)zzp.zzbE().a(((cq) (obj)))).booleanValue())
        {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(a))
            {
                return new ji(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(a))
            {
                return new ji(new AdUrlAdapter());
            }
        }
        try
        {
            obj = b.a(a);
        }
        catch (RemoteException remoteexception)
        {
            zzb.zza((new StringBuilder("Could not instantiate mediation adapter: ")).append(a).toString(), remoteexception);
            return null;
        }
        return ((is) (obj));
    }

    static is c(ih ih1)
    {
        return ih1.c();
    }

    static is d(ih ih1)
    {
        return ih1.m;
    }

    public final ij a(long l1, long l2)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        long l3;
        long l4;
        l3 = SystemClock.elapsedRealtime();
        obj1 = new ig();
        qa.a.post(new ii(this, ((ig) (obj1))));
        l4 = c;
_L1:
        long l6;
        if (n != -2)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        l6 = SystemClock.elapsedRealtime();
        long l5;
        l5 = l4 - (l6 - l3);
        l6 = l2 - (l6 - l1);
        if (l5 > 0L && l6 > 0L)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        zzb.zzaG("Timed out waiting for adapter.");
        n = 3;
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        h.wait(Math.min(l5, l6));
          goto _L1
        InterruptedException interruptedexception;
        interruptedexception;
        n = -1;
          goto _L1
        obj1 = new ij(d, m, a, ((ig) (obj1)), n, o);
        obj;
        JVM INSTR monitorexit ;
        return ((ij) (obj1));
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
        zzb.zzd("Could not destroy mediation adapter.", ((Throwable) (obj1)));
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

    public final void a(iy iy)
    {
        synchronized (h)
        {
            n = 0;
            o = iy;
            h.notify();
        }
        return;
        iy;
        obj;
        JVM INSTR monitorexit ;
        throw iy;
    }
}
