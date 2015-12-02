// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public final class aee
    implements aeg
{

    private final String a;
    private final aej b;
    private final long c;
    private final aea d;
    private final AdRequestParcel e;
    private final AdSizeParcel f;
    private final Context g;
    private final Object h = new Object();
    private final VersionInfoParcel i;
    private aem j;
    private int k;

    public aee(Context context, String s, aej aej1, aeb aeb1, aea aea1, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, 
            VersionInfoParcel versioninfoparcel)
    {
        k = -2;
        g = context;
        b = aej1;
        d = aea1;
        long l;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(s))
        {
            a = b();
        } else
        {
            a = s;
        }
        if (aeb1.b != -1L)
        {
            l = aeb1.b;
        } else
        {
            l = 10000L;
        }
        c = l;
        e = adrequestparcel;
        f = adsizeparcel;
        i = versioninfoparcel;
    }

    static aem a(aee aee1, aem aem1)
    {
        aee1.j = aem1;
        return aem1;
    }

    static Object a(aee aee1)
    {
        return aee1.h;
    }

    private void a(long l, long l1, long l2)
    {
        do
        {
            if (k != -2)
            {
                return;
            }
            b(l, l1, l2);
        } while (true);
    }

    private void a(aed aed1)
    {
        if (((Boolean)abn.R.c()).booleanValue() && a.equals("com.google.ads.mediation.AdUrlAdapter"))
        {
            Bundle bundle1 = e.m.getBundle(a);
            Bundle bundle = bundle1;
            if (bundle1 == null)
            {
                bundle = new Bundle();
            }
            bundle.putString("sdk_less_network_id", d.b);
            e.m.putBundle(a, bundle);
        }
        if (i.d >= 0x3e8fa0)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        if (f.e)
        {
            j.a(aai.a(g), e, d.h, aed1);
            return;
        }
        try
        {
            j.a(aai.a(g), f, e, d.h, aed1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aed aed1)
        {
            of.d("Could not request ad from mediation adapter.", aed1);
        }
        a(5);
        return;
        if (f.e)
        {
            j.a(aai.a(g), e, d.h, d.a, aed1);
            return;
        }
        j.a(aai.a(g), f, e, d.h, d.a, aed1);
        return;
    }

    static void a(aee aee1, aed aed1)
    {
        aee1.a(aed1);
    }

    static int b(aee aee1)
    {
        return aee1.k;
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
        of.e("Fail to determine the custom event's version, assuming the old one.");
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private void b(long l, long l1, long l2)
    {
        long l3 = SystemClock.elapsedRealtime();
        l = l1 - (l3 - l);
        l1 = 60000L - (l3 - l2);
        if (l <= 0L || l1 <= 0L)
        {
            of.c("Timed out waiting for adapter.");
            k = 3;
            return;
        }
        try
        {
            h.wait(Math.min(l, l1));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            k = -1;
        }
    }

    private aem c()
    {
        of.c((new StringBuilder("Instantiating mediation adapter: ")).append(a).toString());
        aem aem1;
        try
        {
            aem1 = b.a(a);
        }
        catch (RemoteException remoteexception)
        {
            of.a((new StringBuilder("Could not instantiate mediation adapter: ")).append(a).toString(), remoteexception);
            return null;
        }
        return aem1;
    }

    static aem c(aee aee1)
    {
        return aee1.c();
    }

    static aem d(aee aee1)
    {
        return aee1.j;
    }

    public final aef a(long l)
    {
        Object obj1;
        synchronized (h)
        {
            long l1 = SystemClock.elapsedRealtime();
            obj1 = new aed();
            ajc.a.post(new _cls1(((aed) (obj1))));
            a(l1, c, l);
            obj1 = new aef(d, j, a, ((aed) (obj1)), k);
        }
        return ((aef) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a()
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (j != null)
        {
            j.c();
        }
_L1:
        k = -1;
        h.notify();
        return;
        Object obj1;
        obj1;
        of.d("Could not destroy mediation adapter.", ((Throwable) (obj1)));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public final void a(int l)
    {
        synchronized (h)
        {
            k = l;
            h.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    /* member class not found */
    class _cls1 {}

}
