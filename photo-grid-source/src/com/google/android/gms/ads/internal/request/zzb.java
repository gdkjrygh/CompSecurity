// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.ad;
import com.google.android.gms.internal.by;
import com.google.android.gms.internal.cx;
import com.google.android.gms.internal.cy;
import com.google.android.gms.internal.ie;
import com.google.android.gms.internal.pb;
import com.google.android.gms.internal.pe;
import com.google.android.gms.internal.pj;
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.w;
import com.google.android.gms.internal.wg;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdResponseParcel, c, AdRequestInfoParcel, b, 
//            zzc

public class zzb extends pj
    implements zzc.zza
{

    pj a;
    AdResponseParcel b;
    ie c;
    private final zza.zza d;
    private final AdRequestInfoParcel.zza e;
    private final Object f = new Object();
    private final Context g;
    private final ad h;
    private AdRequestInfoParcel i;
    private Runnable j;

    public zzb(Context context, AdRequestInfoParcel.zza zza, ad ad1, zza.zza zza1)
    {
        d = zza1;
        g = context;
        e = zza;
        h = ad1;
    }

    private AdSizeParcel a(AdRequestInfoParcel adrequestinfoparcel)
    {
        if (b.zzEN == null)
        {
            throw new c("The ad response must specify one of the supported ad sizes.", 0);
        }
        Object aobj[] = b.zzEN.split("x");
        if (aobj.length != 2)
        {
            throw new c((new StringBuilder("Invalid ad size format from the ad response: ")).append(b.zzEN).toString(), 0);
        }
        int j1;
        int k1;
        int l1;
        try
        {
            j1 = Integer.parseInt(aobj[0]);
            k1 = Integer.parseInt(aobj[1]);
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            throw new c((new StringBuilder("Invalid ad size number from the ad response: ")).append(b.zzEN).toString(), 0);
        }
        aobj = adrequestinfoparcel.zzqn.zztg;
        l1 = aobj.length;
        AdSizeParcel adsizeparcel;
        int l;
        int i1;
        for (int k = 0; k < l1; k++)
        {
            adsizeparcel = aobj[k];
            float f1 = g.getResources().getDisplayMetrics().density;
            if (adsizeparcel.width == -1)
            {
                l = (int)((float)adsizeparcel.widthPixels / f1);
            } else
            {
                l = adsizeparcel.width;
            }
            if (adsizeparcel.height == -2)
            {
                i1 = (int)((float)adsizeparcel.heightPixels / f1);
            } else
            {
                i1 = adsizeparcel.height;
            }
            if (j1 == l && k1 == i1)
            {
                return new AdSizeParcel(adsizeparcel, adrequestinfoparcel.zzqn.zztg);
            }
        }

        throw new c((new StringBuilder("The ad size from the ad response was not one of the requested sizes: ")).append(b.zzEN).toString(), 0);
    }

    static Object a(zzb zzb1)
    {
        return zzb1.f;
    }

    private void a(int k, String s)
    {
        if (k == 3 || k == -1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaG(s);
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaH(s);
        }
        if (b == null)
        {
            b = new AdResponseParcel(k);
        } else
        {
            b = new AdResponseParcel(k, b.zzzc);
        }
        s = new pb(i, b, c, null, k, -1L, b.zzEO, null);
        d.zza(s);
    }

    static void a(zzb zzb1, String s)
    {
        zzb1.a(2, s);
    }

    public void onStop()
    {
        synchronized (f)
        {
            if (a != null)
            {
                a.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzb(AdResponseParcel adresponseparcel)
    {
        long l;
        com.google.android.gms.ads.internal.util.client.zzb.zzaF("Received ad response.");
        b = adresponseparcel;
        l = zzp.zzbz().b();
        synchronized (f)
        {
            a = null;
        }
        try
        {
            if (b.errorCode != -2 && b.errorCode != -3)
            {
                throw new c((new StringBuilder("There was a problem getting an ad response. ErrorCode: ")).append(b.errorCode).toString(), b.errorCode);
            }
        }
        // Misplaced declaration of an exception variable
        catch (AdResponseParcel adresponseparcel)
        {
            a(adresponseparcel.a(), adresponseparcel.getMessage());
            qa.a.removeCallbacks(j);
            return;
        }
        break MISSING_BLOCK_LABEL_123;
        exception;
        adresponseparcel;
        JVM INSTR monitorexit ;
        throw exception;
        boolean flag;
        if (b.errorCode == -3)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        if (TextUtils.isEmpty(b.body))
        {
            throw new c("No fill from ad server.", 3);
        }
        zzp.zzby().a(g, b.zzEv);
        flag = b.zzEK;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        c = new ie(b.body);
        if (i.zzqn.zztg == null) goto _L2; else goto _L1
_L1:
        adresponseparcel = a(i);
_L7:
        boolean flag1 = b.zzEU;
        zzp.zzby().a(flag1);
        by by1 = zzp.zzby().a(g);
        if (by1 != null && !by1.isAlive())
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaF("start fetching content...");
            by1.a();
        }
        if (TextUtils.isEmpty(b.zzES)) goto _L4; else goto _L3
_L3:
        Object obj = new JSONObject(b.zzES);
_L5:
        adresponseparcel = new pb(i, b, c, adresponseparcel, -2, l, b.zzEO, ((JSONObject) (obj)));
        d.zza(adresponseparcel);
        qa.a.removeCallbacks(j);
        return;
        adresponseparcel;
        throw new c((new StringBuilder("Could not parse mediation config: ")).append(b.body).toString(), 0);
        obj;
        com.google.android.gms.ads.internal.util.client.zzb.zzb("Error parsing the JSON for Active View.", ((Throwable) (obj)));
_L4:
        obj = null;
        if (true) goto _L5; else goto _L2
_L2:
        adresponseparcel = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void zzbn()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaF("AdLoaderBackgroundTask started.");
        String s = h.a().a(g);
        j = new b(this);
        Handler handler = qa.a;
        Runnable runnable = j;
        com.google.android.gms.internal.cq cq = cy.al;
        handler.postDelayed(runnable, ((Long)zzp.zzbE().a(cq)).longValue());
        long l = zzp.zzbz().b();
        i = new AdRequestInfoParcel(e, s, l);
        synchronized (f)
        {
            AdRequestInfoParcel adrequestinfoparcel = i;
            a = zzc.zza(g, adrequestinfoparcel, this);
            if (a == null)
            {
                a(0, "Could not start the ad request service.");
                qa.a.removeCallbacks(j);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
