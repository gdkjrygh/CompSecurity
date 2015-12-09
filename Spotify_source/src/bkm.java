// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class bkm extends bfz
{

    final Context a;
    final cex b;
    final String c;
    final VersionInfoParcel d;
    private final bfv e;
    private final ccn f;
    private final ccq g;
    private final cnm h;
    private final cnm i;
    private final NativeAdOptionsParcel j;
    private WeakReference k;
    private Object l;

    bkm(Context context, String s, cex cex, VersionInfoParcel versioninfoparcel, bfv bfv, ccn ccn, ccq ccq, 
            cnm cnm1, cnm cnm2, NativeAdOptionsParcel nativeadoptionsparcel)
    {
        l = new Object();
        a = context;
        c = s;
        b = cex;
        d = versioninfoparcel;
        e = bfv;
        g = ccq;
        f = ccn;
        h = cnm1;
        i = cnm2;
        j = nativeadoptionsparcel;
        c();
    }

    static Object a(bkm bkm1)
    {
        return bkm1.l;
    }

    static WeakReference a(bkm bkm1, WeakReference weakreference)
    {
        bkm1.k = weakreference;
        return weakreference;
    }

    static ccn b(bkm bkm1)
    {
        return bkm1.f;
    }

    static ccq c(bkm bkm1)
    {
        return bkm1.g;
    }

    private List c()
    {
        ArrayList arraylist = new ArrayList();
        if (g != null)
        {
            arraylist.add("1");
        }
        if (f != null)
        {
            arraylist.add("2");
        }
        if (h.size() > 0)
        {
            arraylist.add("3");
        }
        return arraylist;
    }

    static cnm d(bkm bkm1)
    {
        return bkm1.h;
    }

    static bfv e(bkm bkm1)
    {
        return bkm1.e;
    }

    static cnm f(bkm bkm1)
    {
        return bkm1.i;
    }

    static List g(bkm bkm1)
    {
        return bkm1.c();
    }

    static NativeAdOptionsParcel h(bkm bkm1)
    {
        return bkm1.j;
    }

    public final String a()
    {
        Object obj1 = l;
        obj1;
        JVM INSTR monitorenter ;
        if (k == null) goto _L2; else goto _L1
_L1:
        Object obj = (bks)k.get();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj = ((bks) (obj)).k();
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

            private AdRequestParcel a;
            private bkm b;

            public final void run()
            {
                synchronized (bkm.a(b))
                {
                    Object obj1 = b;
                    obj1 = new bks(((bkm) (obj1)).a, AdSizeParcel.a(), ((bkm) (obj1)).c, ((bkm) (obj1)).b, ((bkm) (obj1)).d);
                    bkm.a(b, new WeakReference(obj1));
                    ((bks) (obj1)).a(bkm.b(b));
                    ((bks) (obj1)).a(bkm.c(b));
                    ((bks) (obj1)).a(bkm.d(b));
                    ((bks) (obj1)).a(bkm.e(b));
                    ((bks) (obj1)).b(bkm.f(b));
                    ((bks) (obj1)).a(bkm.g(b));
                    ((bks) (obj1)).a(bkm.h(b));
                    ((bks) (obj1)).a(a);
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                b = bkm.this;
                a = adrequestparcel;
                super();
            }
        };
        cjj.a.post(adrequestparcel);
    }

    public final boolean b()
    {
        Object obj = l;
        obj;
        JVM INSTR monitorenter ;
        if (k == null) goto _L2; else goto _L1
_L1:
        bks bks1 = (bks)k.get();
        if (bks1 == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        boolean flag = bks1.l();
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
}
