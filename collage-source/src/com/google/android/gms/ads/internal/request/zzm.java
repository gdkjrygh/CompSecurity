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
import com.google.android.gms.internal.ac;
import com.google.android.gms.internal.af;
import com.google.android.gms.internal.ar;
import com.google.android.gms.internal.au;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.ci;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.cw;
import com.google.android.gms.internal.fo;
import com.google.android.gms.internal.ft;
import com.google.android.gms.internal.gs;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hs;
import com.google.android.gms.internal.ix;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdRequestInfoParcel, AdResponseParcel

public class zzm extends gs
{
    public static class zza
        implements com.google.android.gms.internal.cw.b
    {

        public void zza(ac ac1)
        {
            zzm.zzd(ac1);
        }

        public void zzc(Object obj)
        {
            zza((ac)obj);
        }

        public zza()
        {
        }
    }

    public static class zzb
        implements com.google.android.gms.internal.cw.b
    {

        public void zza(ac ac1)
        {
            zzm.zzc(ac1);
        }

        public void zzc(Object obj)
        {
            zza((ac)obj);
        }

        public zzb()
        {
        }
    }

    public static class zzc
        implements ch
    {

        public void zza(hs hs, Map map)
        {
            hs = (String)map.get("request_id");
            map = (String)map.get("errors");
            com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Invalid request: ").append(map).toString());
            zzm.zzfD().b(hs);
        }

        public zzc()
        {
        }
    }


    static final long zzEu;
    private static boolean zzEv = false;
    private static cw zzEw = null;
    private static ci zzEx = null;
    private static cm zzEy = null;
    private static ch zzEz = null;
    private static final Object zzpm = new Object();
    private final Context mContext;
    private final Object zzCE;
    private final zza.zza zzDp;
    private final AdRequestInfoParcel.zza zzDq;
    private com.google.android.gms.internal.cw.d zzEA;

    public zzm(Context context, AdRequestInfoParcel.zza zza1, zza.zza zza2)
    {
        zzCE = new Object();
        zzDp = zza2;
        mContext = context;
        zzDq = zza1;
        synchronized (zzpm)
        {
            if (!zzEv)
            {
                zzEy = new cm();
                zzEx = new ci(context.getApplicationContext(), zza1.zzqb);
                zzEz = new zzc();
                zzEw = new cw(mContext.getApplicationContext(), zzDq.zzqb, (String)ay.b.c(), new zzb(), new zza());
                zzEv = true;
            }
        }
        return;
        context;
        zza2;
        JVM INSTR monitorexit ;
        throw context;
    }

    static zza.zza zza(zzm zzm1)
    {
        return zzm1.zzDp;
    }

    static com.google.android.gms.internal.cw.d zza(zzm zzm1, com.google.android.gms.internal.cw.d d1)
    {
        zzm1.zzEA = d1;
        return d1;
    }

    private JSONObject zza(AdRequestInfoParcel adrequestinfoparcel, String s)
    {
        Bundle bundle;
        String s1;
        bundle = adrequestinfoparcel.zzDy.extras.getBundle("sdk_less_server_data");
        s1 = adrequestinfoparcel.zzDy.extras.getString("sdk_less_network_id");
        if (bundle != null) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject;
        return null;
_L2:
        if ((jsonobject = fo.a(mContext, adrequestinfoparcel, zzp.zzbD().a(mContext), null, null, new ar((String)ay.b.c()), null, null, new ArrayList())) == null) goto _L1; else goto _L3
_L3:
        adrequestinfoparcel = AdvertisingIdClient.getAdvertisingIdInfo(mContext);
_L4:
        HashMap hashmap = new HashMap();
        hashmap.put("request_id", s);
        hashmap.put("network_id", s1);
        hashmap.put("request_param", jsonobject);
        hashmap.put("data", bundle);
        if (adrequestinfoparcel != null)
        {
            hashmap.put("adid", adrequestinfoparcel.getId());
            int i;
            if (adrequestinfoparcel.isLimitAdTrackingEnabled())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            hashmap.put("lat", Integer.valueOf(i));
        }
        try
        {
            adrequestinfoparcel = zzp.zzbx().a(hashmap);
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

    static com.google.android.gms.internal.cw.d zzb(zzm zzm1)
    {
        return zzm1.zzEA;
    }

    protected static void zzc(ac ac1)
    {
        ac1.a("/loadAd", zzEy);
        ac1.a("/fetchHttpRequest", zzEx);
        ac1.a("/invalidRequest", zzEz);
    }

    protected static void zzd(ac ac1)
    {
        ac1.b("/loadAd", zzEy);
        ac1.b("/fetchHttpRequest", zzEx);
        ac1.b("/invalidRequest", zzEz);
    }

    private AdResponseParcel zzf(AdRequestInfoParcel adrequestinfoparcel)
    {
        Object obj;
        JSONObject jsonobject;
        obj = UUID.randomUUID().toString();
        jsonobject = zza(adrequestinfoparcel, ((String) (obj)));
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        adrequestinfoparcel = new AdResponseParcel(0);
_L4:
        return adrequestinfoparcel;
_L2:
        long l = zzp.zzbB().b();
        Future future = zzEy.a(((String) (obj)));
        com.google.android.gms.ads.internal.util.client.zza.zzIy.post(new Runnable(jsonobject, ((String) (obj))) {

            final zzm zzEB;
            final JSONObject zzEC;
            final String zzED;

            public void run()
            {
                com.google.android.gms.ads.internal.request.zzm.zza(zzEB, zzm.zzfE().b());
                com.google.android.gms.ads.internal.request.zzm.zzb(zzEB).a(new com.google.android.gms.internal.hm.c(this) {

                    final _cls2 zzEE;

                    public void zzb(af af1)
                    {
                        try
                        {
                            af1.a("AFMA_getAdapterLessMediationAd", zzEE.zzEC);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (af af1)
                        {
                            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error requesting an ad url", af1);
                        }
                        zzm.zzfD().b(zzEE.zzED);
                    }

                    public void zzc(Object obj)
                    {
                        zzb((af)obj);
                    }

            
            {
                zzEE = _pcls2;
                super();
            }
                }, new com.google.android.gms.internal.hm.a(this) {

                    final _cls2 zzEE;

                    public void run()
                    {
                        zzm.zzfD().b(zzEE.zzED);
                    }

            
            {
                zzEE = _pcls2;
                super();
            }
                });
            }

            
            {
                zzEB = zzm.this;
                zzEC = jsonobject;
                zzED = s;
                super();
            }
        });
        long l1 = zzEu;
        long l2 = zzp.zzbB().b();
        try
        {
            obj = (JSONObject)future.get(l1 - (l2 - l), TimeUnit.MILLISECONDS);
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
        obj = fo.a(mContext, adrequestinfoparcel, ((JSONObject) (obj)).toString());
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

    static cm zzfD()
    {
        return zzEy;
    }

    static cw zzfE()
    {
        return zzEw;
    }

    public void onStop()
    {
        synchronized (zzCE)
        {
            com.google.android.gms.ads.internal.util.client.zza.zzIy.post(new Runnable() {

                final zzm zzEB;

                public void run()
                {
                    if (com.google.android.gms.ads.internal.request.zzm.zzb(zzEB) != null)
                    {
                        com.google.android.gms.ads.internal.request.zzm.zzb(zzEB).a();
                        com.google.android.gms.ads.internal.request.zzm.zza(zzEB, null);
                    }
                }

            
            {
                zzEB = zzm.this;
                super();
            }
            });
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzdG()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("SdkLessAdLoaderBackgroundTask started.");
        Object obj = new AdRequestInfoParcel(zzDq, null, null, -1L);
        AdResponseParcel adresponseparcel = zzf(((AdRequestInfoParcel) (obj)));
        long l = zzp.zzbB().b();
        obj = new com.google.android.gms.internal.gl.a(((AdRequestInfoParcel) (obj)), adresponseparcel, null, null, adresponseparcel.errorCode, l, adresponseparcel.zzEb, null);
        com.google.android.gms.ads.internal.util.client.zza.zzIy.post(new Runnable(((com.google.android.gms.internal.gl.a) (obj))) {

            final zzm zzEB;
            final com.google.android.gms.internal.gl.a zzoA;

            public void run()
            {
                com.google.android.gms.ads.internal.request.zzm.zza(zzEB).zza(zzoA);
                if (com.google.android.gms.ads.internal.request.zzm.zzb(zzEB) != null)
                {
                    com.google.android.gms.ads.internal.request.zzm.zzb(zzEB).a();
                    com.google.android.gms.ads.internal.request.zzm.zza(zzEB, null);
                }
            }

            
            {
                zzEB = zzm.this;
                zzoA = a;
                super();
            }
        });
    }

    static 
    {
        zzEu = TimeUnit.SECONDS.toMillis(10L);
    }
}
