// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebView;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzdf, zzhy, zzbv, zzhx, 
//            zzab, zzgo, zzhg, zzca, 
//            zzcf, zzdg, zzhb, zzgq, 
//            zzgy, zzax, zzgx, zzbx, 
//            zzhw, zzha, zzhc, zzhk, 
//            zzcc, zzgz, zzho, zzce, 
//            zzia, zzah, zzba, zzie, 
//            zzic, zzid, zzcu

public final class zzgw extends zzgs.zza
{

    private static final Object zzmz = new Object();
    private static zzgw zzxf;
    private final Context mContext;
    private final zzdf zznr;
    private final zzhc zzxg;
    private final zzdg zzxh;
    private final zzbv zzxi;

    zzgw(Context context, zzbv zzbv1, zzdg zzdg1, zzhc zzhc1)
    {
        mContext = context;
        zzxg = zzhc1;
        zzxh = zzdg1;
        zzxi = zzbv1;
        if (context.getApplicationContext() != null)
        {
            context = context.getApplicationContext();
        }
        zznr = new zzdf(context, new zzhy(0x6c42d8, 0x6c42d8, true), zzbv1.zzbV(), new zzia.zzd() {

            final zzgw zzxt;

            public void zza(Object obj)
            {
                zzb((zzah)obj);
            }

            public void zzb(zzah zzah1)
            {
                zzah1.zza("/log", zzcu.zzrG);
            }

            
            {
                zzxt = zzgw.this;
                super();
            }
        }, new zzia.zzc());
    }

    private static zzgq zza(Context context, zzdf zzdf1, zzbv zzbv1, zzdg zzdg1, zzhc zzhc1, zzgo zzgo1)
    {
        zzhx.zzY("Starting ad request from service.");
        zzab.zzaP().zzb(context, zzgo1.zzlP);
        zzca.zzl(context);
        zzcf zzcf1 = new zzcf("load_ad");
        zzce zzce = zzcf1.zzcq();
        zzdg1.init();
        zzhb zzhb1 = new zzhb(context);
        if (zzhb1.zzyj == -1)
        {
            zzhx.zzY("Device is offline.");
            return new zzgq(2);
        }
        Object obj;
        zzgy zzgy1;
        if (zzgo1.versionCode >= 7)
        {
            obj = zzgo1.zzwF;
        } else
        {
            obj = UUID.randomUUID().toString();
        }
        zzgy1 = new zzgy(((String) (obj)), zzgo1.applicationInfo.packageName);
        if (zzgo1.zzwn.extras != null)
        {
            String s = zzgo1.zzwn.extras.getString("_ad");
            if (s != null)
            {
                return zzgx.zza(context, zzgo1, s);
            }
        }
        zzdg1 = zzgx.zza(zzgo1, zzhb1, zzdg1.zzb(250L), zzbv1);
        if (zzgo1.versionCode < 7)
        {
            try
            {
                zzdg1.put("request_id", obj);
            }
            catch (JSONException jsonexception) { }
        }
        if (zzdg1 == null)
        {
            return new zzgq(0);
        }
        zzdg1 = zzdg1.toString();
        zzcf1.zza(zzce, new String[] {
            "arc"
        });
        obj = zzcf1.zzcq();
        if (((Boolean)zzca.zzqm.get()).booleanValue())
        {
            zzhw.zzzG.post(new Runnable(zzdf1, zzgy1, zzcf1, ((zzce) (obj)), zzdg1) {

                final zzdf zzxj;
                final zzgy zzxk;
                final zzcf zzxl;
                final zzce zzxm;
                final String zzxn;

                public final void run()
                {
                    zzia zzia1 = zzxj.zzcJ();
                    zzxk.zze(zzia1);
                    zzxl.zza(zzxm, new String[] {
                        "rwc"
                    });
                    zzia1.zza(new zzia.zzd(this, zzxl.zzcq()) {

                        final zzce zzxo;
                        final _cls1 zzxp;

                        public void zza(Object obj)
                        {
                            zzb((zzah)obj);
                        }

                        public void zzb(zzah zzah1)
                        {
                            zzxp.zzxl.zza(zzxo, new String[] {
                                "jsf"
                            });
                            zzah1.zza("/invalidRequest", zzxp.zzxk.zzxz);
                            zzah1.zza("/loadAdURL", zzxp.zzxk.zzxA);
                            try
                            {
                                zzah1.zzb("AFMA_buildAdURL", zzxp.zzxn);
                                return;
                            }
                            // Misplaced declaration of an exception variable
                            catch (zzah zzah1)
                            {
                                zzhx.zzb("Error requesting an ad url", zzah1);
                            }
                        }

            
            {
                zzxp = _pcls1;
                zzxo = zzce;
                super();
            }
                    }, new zzia.zza(this) {

                        final _cls1 zzxp;

                        public void run()
                        {
                        }

            
            {
                zzxp = _pcls1;
                super();
            }
                    });
                }

            
            {
                zzxj = zzdf1;
                zzxk = zzgy1;
                zzxl = zzcf1;
                zzxm = zzce;
                zzxn = s;
                super();
            }
            });
        } else
        {
            zzhw.zzzG.post(new Runnable(context, zzgo1, zzgy1, zzcf1, ((zzce) (obj)), zzdg1, zzbv1) {

                final Context zznK;
                final zzgy zzxk;
                final zzcf zzxl;
                final zzce zzxm;
                final String zzxn;
                final zzgo zzxq;
                final zzbv zzxr;

                public final void run()
                {
                    zzic zzic1 = zzab.zzaN().zza(zznK, new zzba(), false, false, null, zzxq.zzlP);
                    if (zzab.zzaP().zzem())
                    {
                        zzic1.getWebView().clearCache(true);
                    }
                    zzic1.setWillNotDraw(true);
                    zzxk.zza(zzic1);
                    zzxl.zza(zzxm, new String[] {
                        "rwc"
                    });
                    Object obj1 = zzxl.zzcq();
                    obj1 = zzgw.zzb(zzxn, zzxl, ((zzce) (obj1)));
                    zzid zzid1 = zzic1.zzeG();
                    zzid1.zza("/invalidRequest", zzxk.zzxz);
                    zzid1.zza("/loadAdURL", zzxk.zzxA);
                    zzid1.zza("/log", zzcu.zzrG);
                    zzid1.zza(((zzid.zza) (obj1)));
                    zzhx.zzY("Loading the JS library.");
                    zzic1.loadUrl(zzxr.zzbV());
                }

            
            {
                zznK = context;
                zzxq = zzgo1;
                zzxk = zzgy1;
                zzxl = zzcf1;
                zzxm = zzce;
                zzxn = s;
                zzxr = zzbv1;
                super();
            }
            });
        }
        zzdg1 = (zzha)zzgy1.zzdS().get(10L, TimeUnit.SECONDS);
        if (zzdg1 != null)
        {
            break MISSING_BLOCK_LABEL_390;
        }
        context = new zzgq(0);
        zzhw.zzzG.post(new Runnable(zzgy1, zzdf1) {

            final zzdf zzxj;
            final zzgy zzxk;

            public final void run()
            {
                zzxk.zzdT();
                if (zzxk.zzdR() != null)
                {
                    zzxk.zzdR().zza(new zzia.zzd(this) {

                        final _cls3 zzxs;

                        public void zza(Object obj)
                        {
                            zzb((zzah)obj);
                        }

                        public void zzb(zzah zzah1)
                        {
                            zzah1.zzb("/invalidRequest", zzxs.zzxk.zzxz);
                            zzah1.zzb("/loadAdURL", zzxs.zzxk.zzxA);
                        }

            
            {
                zzxs = _pcls3;
                super();
            }
                    }, new zzia.zzb());
                    zzxj.zzb(zzxk.zzdR());
                }
            }

            
            {
                zzxk = zzgy1;
                zzxj = zzdf1;
                super();
            }
        });
        return context;
        context;
        context = new zzgq(0);
        zzhw.zzzG.post(new _cls3(zzgy1, zzdf1));
        return context;
        if (zzdg1.getErrorCode() == -2)
        {
            break MISSING_BLOCK_LABEL_430;
        }
        context = new zzgq(zzdg1.getErrorCode());
        zzhw.zzzG.post(new _cls3(zzgy1, zzdf1));
        return context;
        if (zzcf1.zzcu() != null)
        {
            zzcf1.zza(zzcf1.zzcu(), new String[] {
                "rur"
            });
        }
        zzbv1 = null;
        if (zzdg1.zzdW())
        {
            zzbv1 = zzhc1.zzR(zzgo1.zzwo.packageName);
        }
        zzhc1 = zzcf1.zzcq();
        context = zza(context, zzgo1.zzlP.zzzH, zzdg1.getUrl(), ((String) (zzbv1)), ((zzha) (zzdg1)));
        zzcf1.zza(zzhc1, new String[] {
            "ufe"
        });
        zzcf1.zza(zzce, new String[] {
            "tts"
        });
        if (zzhk.zzeg() != null)
        {
            zzhk.zzeg().zza(zzcf1);
        }
        zzhw.zzzG.post(new _cls3(zzgy1, zzdf1));
        return context;
        context;
        zzhw.zzzG.post(new _cls3(zzgy1, zzdf1));
        throw context;
    }

    public static zzgq zza(Context context, String s, String s1, String s2, zzha zzha1)
    {
        HttpURLConnection httpurlconnection;
        zzgz zzgz1;
        byte abyte0[];
        Map map;
        BufferedOutputStream bufferedoutputstream;
        int i;
        int j;
        long l;
        try
        {
            zzgz1 = new zzgz();
            zzhx.zzY((new StringBuilder("AdRequestServiceImpl: Sending request: ")).append(s1).toString());
            s1 = new URL(s1);
            l = SystemClock.elapsedRealtime();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzhx.zzac((new StringBuilder("Error while connecting to ad server: ")).append(context.getMessage()).toString());
            return new zzgq(2);
        }
        i = 0;
        httpurlconnection = (HttpURLConnection)s1.openConnection();
        zzab.zzaM().zza(context, s, false, httpurlconnection);
        if (!TextUtils.isEmpty(s2))
        {
            httpurlconnection.addRequestProperty("x-afma-drt-cookie", s2);
        }
        if (zzha1 == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        if (!TextUtils.isEmpty(zzha1.zzdV()))
        {
            httpurlconnection.setDoOutput(true);
            abyte0 = zzha1.zzdV().getBytes();
            httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
            bufferedoutputstream = new BufferedOutputStream(httpurlconnection.getOutputStream());
            bufferedoutputstream.write(abyte0);
            bufferedoutputstream.close();
        }
        j = httpurlconnection.getResponseCode();
        map = httpurlconnection.getHeaderFields();
        if (j < 200 || j >= 300)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        context = s1.toString();
        s = zzab.zzaM().zza(new InputStreamReader(httpurlconnection.getInputStream()));
        zza(((String) (context)), map, s, j);
        zzgz1.zza(context, map, s);
        context = zzgz1.zzi(l);
        httpurlconnection.disconnect();
        return context;
        zza(s1.toString(), map, ((String) (null)), j);
        if (j < 300 || j >= 400)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        s1 = httpurlconnection.getHeaderField("Location");
        if (!TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_301;
        }
        zzhx.zzac("No location header to follow redirect.");
        context = new zzgq(0);
        httpurlconnection.disconnect();
        return context;
        s1 = new URL(s1);
        i++;
        if (i <= 5)
        {
            break MISSING_BLOCK_LABEL_381;
        }
        zzhx.zzac("Too many redirects.");
        context = new zzgq(0);
        httpurlconnection.disconnect();
        return context;
        zzhx.zzac((new StringBuilder("Received error HTTP response code: ")).append(j).toString());
        context = new zzgq(0);
        httpurlconnection.disconnect();
        return context;
        zzgz1.zzh(map);
        httpurlconnection.disconnect();
        break MISSING_BLOCK_LABEL_46;
        context;
        httpurlconnection.disconnect();
        throw context;
    }

    public static zzgw zza(Context context, zzbv zzbv1, zzdg zzdg1, zzhc zzhc1)
    {
        Object obj = zzmz;
        obj;
        JVM INSTR monitorenter ;
        if (zzxf != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        Context context1 = context;
        if (context.getApplicationContext() != null)
        {
            context1 = context.getApplicationContext();
        }
        zzxf = new zzgw(context1, zzbv1, zzdg1, zzhc1);
        context = zzxf;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static zzid.zza zza(String s, zzcf zzcf1, zzce zzce)
    {
        return new zzid.zza(zzcf1, zzce, s) {

            final zzcf zzxl;
            final String zzxn;
            final zzce zzxo;

            public final void zza(zzic zzic1, boolean flag)
            {
                zzxl.zza(zzxo, new String[] {
                    "jsf"
                });
                zzxl.zzcr();
                zzic1.zzb("AFMA_buildAdURL", zzxn);
            }

            
            {
                zzxl = zzcf1;
                zzxo = zzce;
                zzxn = s;
                super();
            }
        };
    }

    private static void zza(String s, Map map, String s1, int i)
    {
        if (zzhx.zzA(2))
        {
            zzhx.zzab((new StringBuilder("Http Response: {\n  URL:\n    ")).append(s).append("\n  Headers:").toString());
            if (map != null)
            {
                for (s = map.keySet().iterator(); s.hasNext();)
                {
                    Object obj = (String)s.next();
                    zzhx.zzab((new StringBuilder("    ")).append(((String) (obj))).append(":").toString());
                    obj = ((List)map.get(obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s2 = (String)((Iterator) (obj)).next();
                        zzhx.zzab((new StringBuilder("      ")).append(s2).toString());
                    }
                }

            }
            zzhx.zzab("  Body:");
            if (s1 != null)
            {
                for (int j = 0; j < Math.min(s1.length(), 0x186a0); j += 1000)
                {
                    zzhx.zzab(s1.substring(j, Math.min(s1.length(), j + 1000)));
                }

            } else
            {
                zzhx.zzab("    null");
            }
            zzhx.zzab((new StringBuilder("  Response Code:\n    ")).append(i).append("\n}").toString());
        }
    }

    static zzid.zza zzb(String s, zzcf zzcf1, zzce zzce)
    {
        return zza(s, zzcf1, zzce);
    }

    public final zzgq zzd(zzgo zzgo1)
    {
        zzhk.zzd(mContext, zzgo1.zzlP.zzzH);
        return zza(mContext, zznr, zzxi, zzxh, zzxg, zzgo1);
    }

}
