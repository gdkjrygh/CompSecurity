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
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.zzal;
import com.google.android.gms.internal.zzap;
import com.google.android.gms.internal.zzat;
import com.google.android.gms.internal.zzbs;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzbx;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzer;
import com.google.android.gms.internal.zzev;
import com.google.android.gms.internal.zzfh;
import com.google.android.gms.internal.zzfl;
import com.google.android.gms.internal.zzfx;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzht;
import com.google.android.gms.internal.zzy;
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

public class zzl extends zzfh
{
    public static class zza
        implements com.google.android.gms.internal.zzfx.zzd
    {

        public void zza(Object obj)
        {
            zzc((zzy)obj);
        }

        public void zzc(zzy zzy1)
        {
            zzl.zzf(zzy1);
        }

        public zza()
        {
        }
    }

    public static class zzb
        implements com.google.android.gms.internal.zzfx.zzd
    {

        public void zza(Object obj)
        {
            zzc((zzy)obj);
        }

        public void zzc(zzy zzy1)
        {
            zzl.zze(zzy1);
        }

        public zzb()
        {
        }
    }

    public static class zzc
        implements zzbs
    {

        public void zza(zzgd zzgd, Map map)
        {
            zzgd = (String)map.get("request_id");
            map = (String)map.get("errors");
            com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Invalid request: ").append(map).toString());
            zzl.zzet().zzH(zzgd);
        }

        public zzc()
        {
        }
    }


    private static final Object zznu = new Object();
    static final long zzzO;
    private static boolean zzzP = false;
    private static zzcf zzzQ = null;
    private static zzbt zzzR = null;
    private static zzbx zzzS = null;
    private static zzbs zzzT = null;
    private final Context mContext;
    private final zza.zza zzyN;
    private final AdRequestInfoParcel.zza zzyO;
    private final Object zzyg;
    private zzfx zzzU;

    public zzl(Context context, AdRequestInfoParcel.zza zza1, zza.zza zza2)
    {
        zzyg = new Object();
        zzyN = zza2;
        mContext = context;
        zzyO = zza1;
        synchronized (zznu)
        {
            if (!zzzP)
            {
                zzzS = new zzbx();
                zzzR = new zzbt(context.getApplicationContext(), zza1.zzmJ);
                zzzT = new zzc();
                zzzQ = new zzcf(mContext.getApplicationContext(), zzyO.zzmJ, (String)zzat.zzrh.get(), new zzb(), new zza());
                zzzP = true;
            }
        }
        return;
        context;
        zza2;
        JVM INSTR monitorexit ;
        throw context;
    }

    static zza.zza zza(zzl zzl1)
    {
        return zzl1.zzyN;
    }

    static zzfx zza(zzl zzl1, zzfx zzfx)
    {
        zzl1.zzzU = zzfx;
        return zzfx;
    }

    private JSONObject zza(AdRequestInfoParcel adrequestinfoparcel, String s)
    {
        Bundle bundle;
        String s1;
        bundle = adrequestinfoparcel.zzyW.extras.getBundle("sdk_less_server_data");
        s1 = adrequestinfoparcel.zzyW.extras.getString("sdk_less_network_id");
        if (bundle != null) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject;
        return null;
_L2:
        if ((jsonobject = zzer.zza(adrequestinfoparcel, new zzev(mContext), null, new zzal((String)zzat.zzrh.get()), null, null, new ArrayList())) == null) goto _L1; else goto _L3
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
            adrequestinfoparcel = zzh.zzaQ().zzx(hashmap);
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

    static zzfx zzb(zzl zzl1)
    {
        return zzl1.zzzU;
    }

    protected static void zze(zzy zzy1)
    {
        zzy1.zza("/loadAd", zzzS);
        zzy1.zza("/fetchHttpRequest", zzzR);
        zzy1.zza("/invalidRequest", zzzT);
    }

    static zzbx zzet()
    {
        return zzzS;
    }

    static zzcf zzeu()
    {
        return zzzQ;
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
        long l = zzh.zzaU().elapsedRealtime();
        Future future = zzzS.zzG(((String) (obj)));
        com.google.android.gms.ads.internal.util.client.zza.zzCH.post(new Runnable(jsonobject, ((String) (obj))) {

            final JSONObject a;
            final String b;
            final zzl c;

            public void run()
            {
                com.google.android.gms.ads.internal.request.zzl.zza(c, zzl.zzeu().zzda());
                com.google.android.gms.ads.internal.request.zzl.zzb(c).zza(new com.google.android.gms.internal.zzfx.zzd(this) {

                    final _cls2 a;

                    public void a(zzy zzy1)
                    {
                        try
                        {
                            zzy1.zza("AFMA_getAdapterLessMediationAd", a.a);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (zzy zzy1)
                        {
                            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error requesting an ad url", zzy1);
                        }
                        zzl.zzet().zzH(a.b);
                    }

                    public void zza(Object obj)
                    {
                        a((zzy)obj);
                    }

            
            {
                a = _pcls2;
                super();
            }
                }, new com.google.android.gms.internal.zzfx.zza(this) {

                    final _cls2 a;

                    public void run()
                    {
                        zzl.zzet().zzH(a.b);
                    }

            
            {
                a = _pcls2;
                super();
            }
                });
            }

            
            {
                c = zzl.this;
                a = jsonobject;
                b = s;
                super();
            }
        });
        long l1 = zzzO;
        long l2 = zzh.zzaU().elapsedRealtime();
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
        obj = zzer.zza(mContext, adrequestinfoparcel, ((JSONObject) (obj)).toString());
        adrequestinfoparcel = ((AdRequestInfoParcel) (obj));
        if (((AdResponseParcel) (obj)).errorCode != -3)
        {
            adrequestinfoparcel = ((AdRequestInfoParcel) (obj));
            if (TextUtils.isEmpty(((AdResponseParcel) (obj)).zzzr))
            {
                return new AdResponseParcel(3);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected static void zzf(zzy zzy1)
    {
        zzy1.zzb("/loadAd", zzzS);
        zzy1.zzb("/fetchHttpRequest", zzzR);
        zzy1.zzb("/invalidRequest", zzzT);
    }

    public void onStop()
    {
        synchronized (zzyg)
        {
            com.google.android.gms.ads.internal.util.client.zza.zzCH.post(new Runnable() {

                final zzl a;

                public void run()
                {
                    if (com.google.android.gms.ads.internal.request.zzl.zzb(a) != null)
                    {
                        zzl.zzeu().zzb(com.google.android.gms.ads.internal.request.zzl.zzb(a));
                        com.google.android.gms.ads.internal.request.zzl.zza(a, null);
                    }
                }

            
            {
                a = zzl.this;
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

    public void zzcX()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaj("SdkLessAdLoaderBackgroundTask started.");
        Object obj = new AdRequestInfoParcel(zzyO, null, null);
        AdResponseParcel adresponseparcel = zzf(((AdRequestInfoParcel) (obj)));
        long l = zzh.zzaU().elapsedRealtime();
        obj = new com.google.android.gms.internal.zzfa.zza(((AdRequestInfoParcel) (obj)), adresponseparcel, null, null, adresponseparcel.errorCode, l, adresponseparcel.zzzx, null);
        com.google.android.gms.ads.internal.util.client.zza.zzCH.post(new Runnable(((com.google.android.gms.internal.zzfa.zza) (obj))) {

            final com.google.android.gms.internal.zzfa.zza a;
            final zzl b;

            public void run()
            {
                com.google.android.gms.ads.internal.request.zzl.zza(b).zza(a);
                if (com.google.android.gms.ads.internal.request.zzl.zzb(b) != null)
                {
                    zzl.zzeu().zzb(com.google.android.gms.ads.internal.request.zzl.zzb(b));
                    com.google.android.gms.ads.internal.request.zzl.zza(b, null);
                }
            }

            
            {
                b = zzl.this;
                a = zza1;
                super();
            }
        });
    }

    static 
    {
        zzzO = TimeUnit.SECONDS.toMillis(10L);
    }
}
