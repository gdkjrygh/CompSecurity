// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzo;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ip;
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.wb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzn, h

public class zzi extends com.google.android.gms.ads.internal.client.zzp.zza
{

    private final Context a;
    private final zzo b;
    private final ip c;
    private final es d;
    private final ev e;
    private final wb f;
    private final wb g;
    private final NativeAdOptionsParcel h;
    private final List i = b();
    private final String j;
    private final VersionInfoParcel k;
    private WeakReference l;
    private Object m;

    zzi(Context context, String s, ip ip, VersionInfoParcel versioninfoparcel, zzo zzo, es es, ev ev, 
            wb wb1, wb wb2, NativeAdOptionsParcel nativeadoptionsparcel)
    {
        m = new Object();
        a = context;
        j = s;
        c = ip;
        k = versioninfoparcel;
        b = zzo;
        e = ev;
        d = es;
        f = wb1;
        g = wb2;
        h = nativeadoptionsparcel;
    }

    static Object a(zzi zzi1)
    {
        return zzi1.m;
    }

    static WeakReference a(zzi zzi1, WeakReference weakreference)
    {
        zzi1.l = weakreference;
        return weakreference;
    }

    static es b(zzi zzi1)
    {
        return zzi1.d;
    }

    private List b()
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

    static ev c(zzi zzi1)
    {
        return zzi1.e;
    }

    static wb d(zzi zzi1)
    {
        return zzi1.f;
    }

    static zzo e(zzi zzi1)
    {
        return zzi1.b;
    }

    static wb f(zzi zzi1)
    {
        return zzi1.g;
    }

    static List g(zzi zzi1)
    {
        return zzi1.b();
    }

    static NativeAdOptionsParcel h(zzi zzi1)
    {
        return zzi1.h;
    }

    protected final zzn a()
    {
        return new zzn(a, AdSizeParcel.zzs(a), j, c, k);
    }

    public String getMediationAdapterClassName()
    {
        Object obj1 = m;
        obj1;
        JVM INSTR monitorenter ;
        if (l == null) goto _L2; else goto _L1
_L1:
        Object obj = (zzn)l.get();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj = ((zzn) (obj)).getMediationAdapterClassName();
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

    public boolean isLoading()
    {
        Object obj = m;
        obj;
        JVM INSTR monitorenter ;
        if (l == null) goto _L2; else goto _L1
_L1:
        zzn zzn1 = (zzn)l.get();
        if (zzn1 == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        boolean flag = zzn1.isLoading();
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

    public void zzf(AdRequestParcel adrequestparcel)
    {
        adrequestparcel = new h(this, adrequestparcel);
        qa.a.post(adrequestparcel);
    }
}
