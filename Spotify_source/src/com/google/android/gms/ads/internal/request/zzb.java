// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import bfq;
import biq;
import bis;
import biu;
import biv;
import bix;
import biy;
import bjz;
import bka;
import bkv;
import bzh;
import bzm;
import cak;
import cba;
import cbb;
import ceo;
import ciu;
import cix;
import cjc;
import cjj;
import cnp;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdResponseParcel, AdRequestInfoParcel

public final class zzb extends cjc
    implements biu
{

    final Object a = new Object();
    cjc b;
    private final bis c;
    private final biq d;
    private final Context e;
    private final bzm f;
    private AdRequestInfoParcel h;
    private Runnable i;
    private AdResponseParcel j;
    private ceo k;

    public zzb(Context context, biq biq, bzm bzm1, bis bis1)
    {
        c = bis1;
        e = context;
        d = biq;
        f = bzm1;
    }

    private AdSizeParcel a(AdRequestInfoParcel adrequestinfoparcel)
    {
        if (j.m == null)
        {
            throw new zza("The ad response must specify one of the supported ad sizes.", 0);
        }
        Object aobj[] = j.m.split("x");
        if (aobj.length != 2)
        {
            throw new zza((new StringBuilder("Invalid ad size format from the ad response: ")).append(j.m).toString(), 0);
        }
        int k1;
        int l1;
        int i2;
        try
        {
            k1 = Integer.parseInt(aobj[0]);
            l1 = Integer.parseInt(aobj[1]);
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            throw new zza((new StringBuilder("Invalid ad size number from the ad response: ")).append(j.m).toString(), 0);
        }
        aobj = adrequestinfoparcel.d.h;
        i2 = aobj.length;
        AdSizeParcel adsizeparcel;
        int i1;
        int j1;
        for (int l = 0; l < i2; l++)
        {
            adsizeparcel = aobj[l];
            float f1 = e.getResources().getDisplayMetrics().density;
            if (adsizeparcel.f == -1)
            {
                i1 = (int)((float)adsizeparcel.g / f1);
            } else
            {
                i1 = adsizeparcel.f;
            }
            if (adsizeparcel.c == -2)
            {
                j1 = (int)((float)adsizeparcel.d / f1);
            } else
            {
                j1 = adsizeparcel.c;
            }
            if (k1 == i1 && l1 == j1)
            {
                return new AdSizeParcel(adsizeparcel, adrequestinfoparcel.d.h);
            }
        }

        throw new zza((new StringBuilder("The ad size from the ad response was not one of the requested sizes: ")).append(j.m).toString(), 0);
    }

    public final void a()
    {
        bka.a("AdLoaderBackgroundTask started.");
        String s = f.b.a(e);
        i = new Runnable() {

            private zzb a;

            public final void run()
            {
label0:
                {
                    synchronized (a.a)
                    {
                        if (a.b != null)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                a.b();
                a.a(2, "Timed out waiting for ad response.");
                obj2;
                JVM INSTR monitorexit ;
                return;
                exception1;
                obj2;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                a = zzb.this;
                super();
            }
        };
        Handler handler = cjj.a;
        Runnable runnable = i;
        cax cax = cbb.S;
        handler.postDelayed(runnable, ((Long)bkv.n().a(cax)).longValue());
        long l = bkv.i().b();
        h = new AdRequestInfoParcel(d, s, l);
        Object obj1 = a;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        Context context;
        obj = h;
        context = e;
        if (!(new bit._cls1(context)).a(((AdRequestInfoParcel) (obj)))) goto _L2; else goto _L1
_L1:
        bka.a("Fetching ad response from local ad request service.");
        obj = new bix(context, ((AdRequestInfoParcel) (obj)), this);
        ((bix) (obj)).e();
_L3:
        b = ((cjc) (obj));
        if (b == null)
        {
            a(0, "Could not start the ad request service.");
            cjj.a.removeCallbacks(i);
        }
        return;
_L2:
        bka.a("Fetching ad response from remote ad request service.");
        bfq.a();
        if (bjz.b(context))
        {
            break MISSING_BLOCK_LABEL_209;
        }
        bka.e("Failed to connect to remote ad request service.");
        obj = null;
          goto _L3
        obj = new biy(context, ((AdRequestInfoParcel) (obj)), this);
          goto _L3
        Exception exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void a(int l, String s)
    {
        if (l == 3 || l == -1)
        {
            bka.c(s);
        } else
        {
            bka.e(s);
        }
        if (j == null)
        {
            j = new AdResponseParcel(l);
        } else
        {
            j = new AdResponseParcel(l, j.k);
        }
        s = new ciu(h, j, k, null, l, -1L, j.n, null);
        c.a(s);
    }

    public final void a(AdResponseParcel adresponseparcel)
    {
        long l;
        bka.a("Received ad response.");
        j = adresponseparcel;
        l = bkv.i().b();
        synchronized (a)
        {
            b = null;
        }
        try
        {
            if (j.e != -2 && j.e != -3)
            {
                throw new zza((new StringBuilder("There was a problem getting an ad response. ErrorCode: ")).append(j.e).toString(), j.e);
            }
        }
        // Misplaced declaration of an exception variable
        catch (AdResponseParcel adresponseparcel)
        {
            a(((zza) (adresponseparcel)).zzDv, adresponseparcel.getMessage());
            cjj.a.removeCallbacks(i);
            return;
        }
        break MISSING_BLOCK_LABEL_126;
        exception;
        adresponseparcel;
        JVM INSTR monitorexit ;
        throw exception;
        boolean flag;
        if (j.e == -3)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        if (TextUtils.isEmpty(j.c))
        {
            throw new zza("No fill from ad server.", 3);
        }
        bkv.h().a(e, j.u);
        flag = j.h;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        k = new ceo(j.c);
        if (h.d.h == null) goto _L2; else goto _L1
_L1:
        adresponseparcel = a(h);
_L7:
        boolean flag1 = j.v;
        cix cix1 = bkv.h();
        synchronized (cix1.a)
        {
            cix1.f = flag1;
        }
        obj = bkv.h().a(e);
        if (obj != null && !((cak) (obj)).isAlive())
        {
            bka.a("start fetching content...");
            ((cak) (obj)).a();
        }
        if (TextUtils.isEmpty(j.r)) goto _L4; else goto _L3
_L3:
        obj = new JSONObject(j.r);
_L5:
        adresponseparcel = new ciu(h, j, k, adresponseparcel, -2, l, j.n, ((JSONObject) (obj)));
        c.a(adresponseparcel);
        cjj.a.removeCallbacks(i);
        return;
        adresponseparcel;
        throw new zza((new StringBuilder("Could not parse mediation config: ")).append(j.c).toString(), 0);
        adresponseparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adresponseparcel;
        obj;
        bka.b("Error parsing the JSON for Active View.", ((Throwable) (obj)));
_L4:
        obj = null;
        if (true) goto _L5; else goto _L2
_L2:
        adresponseparcel = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void b()
    {
        synchronized (a)
        {
            if (b != null)
            {
                b.c();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private class zza extends Exception
    {

        final int zzDv;

        public zza(String s, int l)
        {
            super(s);
            zzDv = l;
        }
    }

}
