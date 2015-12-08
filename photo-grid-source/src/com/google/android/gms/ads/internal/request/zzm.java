// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.internal.bg;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.cx;
import com.google.android.gms.internal.cy;
import com.google.android.gms.internal.fz;
import com.google.android.gms.internal.ga;
import com.google.android.gms.internal.gk;
import com.google.android.gms.internal.ha;
import com.google.android.gms.internal.ho;
import com.google.android.gms.internal.ns;
import com.google.android.gms.internal.oa;
import com.google.android.gms.internal.pb;
import com.google.android.gms.internal.pj;
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.wg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdResponseParcel, i, AdRequestInfoParcel, l, 
//            h

public class zzm extends pj
{

    static final long a;
    private static final Object b = new Object();
    private static boolean c = false;
    private static ha d = null;
    private static ga e = null;
    private static gk f = null;
    private static fz g = null;
    private final zza.zza h;
    private final AdRequestInfoParcel.zza i;
    private final Object j;
    private final Context k;
    private ho l;

    public zzm(Context context, AdRequestInfoParcel.zza zza1, zza.zza zza2)
    {
        super(true);
        j = new Object();
        h = zza2;
        k = context;
        i = zza1;
        synchronized (b)
        {
            if (!c)
            {
                f = new gk();
                e = new ga(context.getApplicationContext(), zza1.zzqj);
                g = new zzc();
                context = k.getApplicationContext();
                zza1 = i.zzqj;
                com.google.android.gms.internal.cq cq = cy.b;
                d = new ha(context, zza1, (String)zzp.zzbE().a(cq), new zzb(), new zza());
                c = true;
            }
        }
        return;
        context;
        zza2;
        JVM INSTR monitorexit ;
        throw context;
    }

    private AdResponseParcel a(AdRequestInfoParcel adrequestinfoparcel)
    {
        Object obj;
        JSONObject jsonobject;
        obj = UUID.randomUUID().toString();
        jsonobject = a(adrequestinfoparcel, ((String) (obj)));
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        adrequestinfoparcel = new AdResponseParcel(0);
_L4:
        return adrequestinfoparcel;
_L2:
        long l1 = zzp.zzbz().b();
        Future future = f.a(((String) (obj)));
        com.google.android.gms.ads.internal.util.client.zza.zzJt.post(new i(this, jsonobject, ((String) (obj))));
        long l2 = a;
        long l3 = zzp.zzbz().b();
        try
        {
            obj = (JSONObject)future.get(l2 - (l3 - l1), TimeUnit.MILLISECONDS);
            break MISSING_BLOCK_LABEL_102;
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel) { }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel) { }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            return new AdResponseParcel(2);
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            return new AdResponseParcel(0);
        }
        return new AdResponseParcel(-1);
        if (obj == null)
        {
            return new AdResponseParcel(-1);
        }
        obj = ns.a(k, adrequestinfoparcel, ((JSONObject) (obj)).toString());
        adrequestinfoparcel = ((AdRequestInfoParcel) (obj));
        if (((AdResponseParcel) (obj)).errorCode != -3)
        {
            adrequestinfoparcel = ((AdRequestInfoParcel) (obj));
            if (TextUtils.isEmpty(((AdResponseParcel) (obj)).body))
            {
                return new AdResponseParcel(3);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static zza.zza a(zzm zzm1)
    {
        return zzm1.h;
    }

    static gk a()
    {
        return f;
    }

    static ho a(zzm zzm1, ho ho)
    {
        zzm1.l = ho;
        return ho;
    }

    private JSONObject a(AdRequestInfoParcel adrequestinfoparcel, String s)
    {
        Bundle bundle;
        String s1;
        bundle = adrequestinfoparcel.zzEn.extras.getBundle("sdk_less_server_data");
        s1 = adrequestinfoparcel.zzEn.extras.getString("sdk_less_network_id");
        if (bundle != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Object obj;
        obj = k;
        com.google.android.gms.internal.ny ny = zzp.zzbB().a(k);
        com.google.android.gms.internal.cq cq = cy.b;
        obj = ns.a(((Context) (obj)), adrequestinfoparcel, ny, new cn((String)zzp.zzbE().a(cq)), null, new ArrayList());
        if (obj == null) goto _L1; else goto _L3
_L3:
        adrequestinfoparcel = AdvertisingIdClient.getAdvertisingIdInfo(k);
_L4:
        HashMap hashmap = new HashMap();
        hashmap.put("request_id", s);
        hashmap.put("network_id", s1);
        hashmap.put("request_param", obj);
        hashmap.put("data", bundle);
        if (adrequestinfoparcel != null)
        {
            hashmap.put("adid", adrequestinfoparcel.getId());
            int i1;
            if (adrequestinfoparcel.isLimitAdTrackingEnabled())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            hashmap.put("lat", Integer.valueOf(i1));
        }
        try
        {
            adrequestinfoparcel = zzp.zzbv().a(hashmap);
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            return null;
        }
        return adrequestinfoparcel;
        adrequestinfoparcel;
_L5:
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Cannot get advertising id info", adrequestinfoparcel);
        adrequestinfoparcel = null;
          goto _L4
        adrequestinfoparcel;
          goto _L5
        adrequestinfoparcel;
          goto _L5
        adrequestinfoparcel;
          goto _L5
    }

    protected static void a(bg bg1)
    {
        bg1.a("/loadAd", f);
        bg1.a("/fetchHttpRequest", e);
        bg1.a("/invalidRequest", g);
    }

    static ha b()
    {
        return d;
    }

    static ho b(zzm zzm1)
    {
        return zzm1.l;
    }

    protected static void b(bg bg1)
    {
        bg1.b("/loadAd", f);
        bg1.b("/fetchHttpRequest", e);
        bg1.b("/invalidRequest", g);
    }

    public void onStop()
    {
        synchronized (j)
        {
            com.google.android.gms.ads.internal.util.client.zza.zzJt.post(new l(this));
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzbn()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaF("SdkLessAdLoaderBackgroundTask started.");
        Object obj = new AdRequestInfoParcel(i, null, -1L);
        AdResponseParcel adresponseparcel = a(((AdRequestInfoParcel) (obj)));
        long l1 = zzp.zzbz().b();
        obj = new pb(((AdRequestInfoParcel) (obj)), adresponseparcel, null, null, adresponseparcel.errorCode, l1, adresponseparcel.zzEO, null);
        com.google.android.gms.ads.internal.util.client.zza.zzJt.post(new h(this, ((pb) (obj))));
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(10L);
    }

    private class zzc
        implements fz
    {

        public void zza(ry ry, Map map)
        {
            ry = (String)map.get("request_id");
            map = (String)map.get("errors");
            com.google.android.gms.ads.internal.util.client.zzb.zzaH((new StringBuilder("Invalid request: ")).append(map).toString());
            zzm.a().b(ry);
        }

        public zzc()
        {
        }
    }


    private class zzb
        implements hm
    {

        public void zza(bg bg1)
        {
            zzm.a(bg1);
        }

        public void zzc(Object obj)
        {
            zza((bg)obj);
        }

        public zzb()
        {
        }
    }


    private class zza
        implements hm
    {

        public void zza(bg bg1)
        {
            zzm.b(bg1);
        }

        public void zzc(Object obj)
        {
            zza((bg)obj);
        }

        public zza()
        {
        }
    }

}
