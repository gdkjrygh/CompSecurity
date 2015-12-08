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
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;

public final class cer
    implements cet
{

    final String a;
    final cen b;
    final AdRequestParcel c;
    final AdSizeParcel d;
    final Context e;
    final Object f = new Object();
    final VersionInfoParcel g;
    final boolean h;
    final NativeAdOptionsParcel i;
    final List j;
    cfa k;
    int l;
    private final cex m;
    private final long n;

    public cer(Context context, String s, cex cex1, ceo ceo1, cen cen1, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, 
            VersionInfoParcel versioninfoparcel, boolean flag, NativeAdOptionsParcel nativeadoptionsparcel, List list)
    {
        l = -2;
        e = context;
        m = cex1;
        b = cen1;
        long l1;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(s))
        {
            a = c();
        } else
        {
            a = s;
        }
        if (ceo1.b != -1L)
        {
            l1 = ceo1.b;
        } else
        {
            l1 = 10000L;
        }
        n = l1;
        c = adrequestparcel;
        d = adsizeparcel;
        g = versioninfoparcel;
        h = flag;
        i = nativeadoptionsparcel;
        j = list;
    }

    private String c()
    {
        if (!TextUtils.isEmpty(b.e))
        {
            if (m.b(b.e))
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
        bka.e("Fail to determine the custom event's version, assuming the old one.");
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    public final ces a(long l1, long l2)
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        long l3;
        long l4;
        l3 = SystemClock.elapsedRealtime();
        obj1 = new ceq();
        cjj.a.post(new Runnable(((ceq) (obj1))) {

            private ceq a;
            private cer b;

            public final void run()
            {
label0:
                {
                    synchronized (b.f)
                    {
                        if (b.l == -2)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                b.k = b.b();
                if (b.k != null)
                {
                    break MISSING_BLOCK_LABEL_65;
                }
                b.a(4);
                obj4;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj4;
                JVM INSTR monitorexit ;
                throw exception;
                Object obj3;
                cer cer1;
                obj3 = a;
                cer1 = b;
                synchronized (((ceq) (obj3)).a)
                {
                    obj3.b = cer1;
                }
                ceq ceq1;
                cer1 = b;
                ceq1 = a;
                if (!"com.google.ads.mediation.AdUrlAdapter".equals(cer1.a))
                {
                    break MISSING_BLOCK_LABEL_178;
                }
                obj3 = cer1.c.m.getBundle(cer1.a);
                obj2 = obj3;
                if (obj3 != null)
                {
                    break MISSING_BLOCK_LABEL_147;
                }
                obj2 = new Bundle();
                ((Bundle) (obj2)).putString("sdk_less_network_id", cer1.b.b);
                cer1.c.m.putBundle(cer1.a, ((Bundle) (obj2)));
                if (cer1.g.d >= 0x3e8fa0) goto _L2; else goto _L1
_L1:
                if (!cer1.d.e) goto _L4; else goto _L3
_L3:
                cer1.k.a(bye.a(cer1.e), cer1.c, cer1.b.h, ceq1);
_L5:
                obj4;
                JVM INSTR monitorexit ;
                return;
                exception1;
                obj2;
                JVM INSTR monitorexit ;
                throw exception1;
_L4:
                cer1.k.a(bye.a(cer1.e), cer1.d, cer1.c, cer1.b.h, ceq1);
                  goto _L5
                RemoteException remoteexception;
                remoteexception;
                bka.c("Could not request ad from mediation adapter.", remoteexception);
                cer1.a(5);
                  goto _L5
_L2:
label1:
                {
                    if (!cer1.h)
                    {
                        break label1;
                    }
                    cer1.k.a(bye.a(cer1.e), cer1.c, cer1.b.h, cer1.b.a, ceq1, cer1.i, cer1.j);
                }
                  goto _L5
label2:
                {
                    if (!cer1.d.e)
                    {
                        break label2;
                    }
                    cer1.k.a(bye.a(cer1.e), cer1.c, cer1.b.h, cer1.b.a, ceq1);
                }
                  goto _L5
                cer1.k.a(bye.a(cer1.e), cer1.d, cer1.c, cer1.b.h, cer1.b.a, ceq1);
                  goto _L5
            }

            
            {
                b = cer.this;
                a = ceq1;
                super();
            }
        });
        l4 = n;
_L1:
        long l6;
        if (l != -2)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        l6 = SystemClock.elapsedRealtime();
        long l5;
        l5 = l4 - (l6 - l3);
        l6 = l2 - (l6 - l1);
        if (l5 > 0L && l6 > 0L)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        bka.c("Timed out waiting for adapter.");
        l = 3;
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        f.wait(Math.min(l5, l6));
          goto _L1
        InterruptedException interruptedexception;
        interruptedexception;
        l = -1;
          goto _L1
        obj1 = new ces(b, k, a, ((ceq) (obj1)), l);
        obj;
        JVM INSTR monitorexit ;
        return ((ces) (obj1));
    }

    public final void a()
    {
        synchronized (f)
        {
            l = 0;
            f.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i1)
    {
        synchronized (f)
        {
            l = i1;
            f.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final cfa b()
    {
        bka.c((new StringBuilder("Instantiating mediation adapter: ")).append(a).toString());
        Object obj = cbb.R;
        if (((Boolean)bkv.n().a(((cax) (obj)))).booleanValue())
        {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(a))
            {
                return new cfq(new ayk());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(a))
            {
                return new cfq(new aye());
            }
        }
        try
        {
            obj = m.a(a);
        }
        catch (RemoteException remoteexception)
        {
            bka.a((new StringBuilder("Could not instantiate mediation adapter: ")).append(a).toString(), remoteexception);
            return null;
        }
        return ((cfa) (obj));
    }
}
