// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.bt;
import com.google.android.gms.internal.bu;
import com.google.android.gms.internal.dh;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.ij;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal:
//            n

public final class i extends com.google.android.gms.ads.internal.client.r.a
{

    private final Context a;
    private final q b;
    private final dh c;
    private final bt d;
    private final bu e;
    private final ij f;
    private final ij g;
    private final NativeAdOptionsParcel h;
    private final List i = d();
    private final String j;
    private final VersionInfoParcel k;
    private WeakReference l;
    private Object m;

    i(Context context, String s, dh dh, VersionInfoParcel versioninfoparcel, q q, bt bt, bu bu, 
            ij ij1, ij ij2, NativeAdOptionsParcel nativeadoptionsparcel)
    {
        m = new Object();
        a = context;
        j = s;
        c = dh;
        k = versioninfoparcel;
        b = q;
        e = bu;
        d = bt;
        f = ij1;
        g = ij2;
        h = nativeadoptionsparcel;
    }

    static Object a(i i1)
    {
        return i1.m;
    }

    static WeakReference a(i i1, WeakReference weakreference)
    {
        i1.l = weakreference;
        return weakreference;
    }

    static bt b(i i1)
    {
        return i1.d;
    }

    static bu c(i i1)
    {
        return i1.e;
    }

    static ij d(i i1)
    {
        return i1.f;
    }

    private List d()
    {
        ArrayList arraylist = new ArrayList();
        if (e != null)
        {
            arraylist.add("1");
        }
        if (d != null)
        {
            arraylist.add("2");
        }
        if (f.size() > 0)
        {
            arraylist.add("3");
        }
        return arraylist;
    }

    static q e(i i1)
    {
        return i1.b;
    }

    static ij f(i i1)
    {
        return i1.g;
    }

    static List g(i i1)
    {
        return i1.d();
    }

    static NativeAdOptionsParcel h(i i1)
    {
        return i1.h;
    }

    public final String a()
    {
        Object obj1 = m;
        obj1;
        JVM INSTR monitorenter ;
        if (l == null) goto _L2; else goto _L1
_L1:
        Object obj = (n)l.get();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj = ((n) (obj)).k();
_L3:
        obj1;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return null;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj = null;
          goto _L3
    }

    public final void a(AdRequestParcel adrequestparcel)
    {
        adrequestparcel = new Runnable(adrequestparcel) {

            final AdRequestParcel a;
            final i b;

            public final void run()
            {
                synchronized (i.a(b))
                {
                    n n1 = b.c();
                    i.a(b, new WeakReference(n1));
                    n1.a(i.b(b));
                    n1.a(i.c(b));
                    n1.a(i.d(b));
                    n1.a(i.e(b));
                    n1.b(i.f(b));
                    n1.a(i.g(b));
                    n1.a(i.h(b));
                    n1.a(a);
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                b = i.this;
                a = adrequestparcel;
                super();
            }
        };
        gm.a.post(adrequestparcel);
    }

    public final boolean b()
    {
        Object obj = m;
        obj;
        JVM INSTR monitorenter ;
        if (l == null) goto _L2; else goto _L1
_L1:
        n n1 = (n)l.get();
        if (n1 == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        boolean flag = n1.l();
_L3:
        obj;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        flag = false;
          goto _L3
    }

    protected final n c()
    {
        return new n(a, AdSizeParcel.a(), j, c, k);
    }
}
