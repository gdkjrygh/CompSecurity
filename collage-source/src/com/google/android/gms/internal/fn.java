// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
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
//            cw, ar, ay, bd, 
//            au, fm, cx, ft, 
//            fs, fp, fo, ej, 
//            at, gk, fu, gw, 
//            fr, gh, fq, ix, 
//            gn, bc

public final class fn extends com.google.android.gms.ads.internal.request.zzj.zza
{

    private static final Object a = new Object();
    private static fn b;
    private final Context c;
    private final fm d;
    private final ar e;
    private final cw f;

    fn(Context context, ar ar1, fm fm1)
    {
        c = context;
        d = fm1;
        e = ar1;
        if (context.getApplicationContext() != null)
        {
            context = context.getApplicationContext();
        }
        f = new cw(context, new VersionInfoParcel(0x7877d8, 0x7877d8, true), ar1.a(), new _cls2(), new cw.c());
    }

    private static AdResponseParcel a(Context context, cw cw1, ar ar1, fm fm1, AdRequestInfoParcel adrequestinfoparcel)
    {
        zzb.zzaC("Starting ad request from service.");
        ay.a(context);
        bd bd1 = new bd(((Boolean)ay.G.c()).booleanValue(), "load_ad", adrequestinfoparcel.zzqf.zzsG);
        if (adrequestinfoparcel.versionCode > 10 && adrequestinfoparcel.zzDT != -1L)
        {
            bd1.a(bd1.a(adrequestinfoparcel.zzDT), new String[] {
                "cts"
            });
        }
        bc bc = bd1.a();
        fm1.c.a();
        Object obj = zzp.zzbD().a(context);
        if (((fs) (obj)).m == -1)
        {
            zzb.zzaC("Device is offline.");
            return new AdResponseParcel(2);
        }
        String s;
        fp fp1;
        if (adrequestinfoparcel.versionCode >= 7)
        {
            s = adrequestinfoparcel.zzDQ;
        } else
        {
            s = UUID.randomUUID().toString();
        }
        fp1 = new fp(s, adrequestinfoparcel.applicationInfo.packageName);
        if (adrequestinfoparcel.zzDy.extras != null)
        {
            String s1 = adrequestinfoparcel.zzDy.extras.getString("_ad");
            if (s1 != null)
            {
                return fo.a(context, adrequestinfoparcel, s1);
            }
        }
        android.location.Location location = fm1.c.a(250L);
        String s2 = fm1.d.a(context, adrequestinfoparcel.zzDz.packageName);
        List list = fm1.b.a(adrequestinfoparcel);
        String s3 = fm1.e.a(adrequestinfoparcel.zzDA);
        obj = fo.a(context, adrequestinfoparcel, ((fs) (obj)), fm1.f.a(context), location, ar1, s2, s3, list);
        if (adrequestinfoparcel.versionCode < 7)
        {
            try
            {
                ((JSONObject) (obj)).put("request_id", s);
            }
            catch (JSONException jsonexception) { }
        }
        if (obj == null)
        {
            return new AdResponseParcel(0);
        }
        s = ((JSONObject) (obj)).toString();
        bd1.a(bc, new String[] {
            "arc"
        });
        obj = bd1.a();
        if (((Boolean)ay.c.c()).booleanValue())
        {
            gw.a.post(new zzgm._cls1(cw1, fp1, bd1, ((bc) (obj)), s));
        } else
        {
            gw.a.post(new zzgm._cls2(context, adrequestinfoparcel, fp1, bd1, ((bc) (obj)), s, ar1));
        }
        ar1 = (fr)fp1.b().get(10L, TimeUnit.SECONDS);
        if (ar1 != null)
        {
            break MISSING_BLOCK_LABEL_527;
        }
        context = new AdResponseParcel(0);
        gw.a.post(new zzgm._cls3(fp1));
        return context;
        context;
        context = new AdResponseParcel(0);
        gw.a.post(new zzgm._cls3(fp1));
        return context;
        if (ar1.a() == -2)
        {
            break MISSING_BLOCK_LABEL_566;
        }
        context = new AdResponseParcel(ar1.a());
        gw.a.post(new zzgm._cls3(fp1));
        return context;
        if (bd1.e() != null)
        {
            bd1.a(bd1.e(), new String[] {
                "rur"
            });
        }
        cw1 = null;
        if (ar1.f())
        {
            cw1 = fm1.a.a(adrequestinfoparcel.zzDz.packageName);
        }
        cw1 = a(adrequestinfoparcel, context, adrequestinfoparcel.zzqb.zzIz, ar1.d(), ((String) (cw1)), s2, ((fr) (ar1)), bd1);
        if (((AdResponseParcel) (cw1)).zzEj == 1)
        {
            fm1.d.b(context, adrequestinfoparcel.zzDz.packageName);
        }
        bd1.a(bc, new String[] {
            "tts"
        });
        cw1.zzEl = bd1.c();
        gw.a.post(new zzgm._cls3(fp1));
        return cw1;
        context;
        gw.a.post(new zzgm._cls3(fp1));
        throw context;
    }

    public static AdResponseParcel a(AdRequestInfoParcel adrequestinfoparcel, Context context, String s, String s1, String s2, String s3, fr fr1, bd bd1)
    {
        bc bc;
        fq fq1;
        byte abyte0[];
        Map map;
        BufferedOutputStream bufferedoutputstream;
        int i;
        int j;
        long l;
        if (bd1 != null)
        {
            bc = bd1.a();
        } else
        {
            bc = null;
        }
        try
        {
            fq1 = new fq(adrequestinfoparcel);
            zzb.zzaC((new StringBuilder()).append("AdRequestServiceImpl: Sending request: ").append(s1).toString());
            adrequestinfoparcel = new URL(s1);
            l = zzp.zzbB().b();
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            zzb.zzaE((new StringBuilder()).append("Error while connecting to ad server: ").append(adrequestinfoparcel.getMessage()).toString());
            return new AdResponseParcel(2);
        }
        i = 0;
        s1 = (HttpURLConnection)adrequestinfoparcel.openConnection();
        zzp.zzbx().a(context, s, false, s1);
        if (!TextUtils.isEmpty(s2))
        {
            s1.addRequestProperty("x-afma-drt-cookie", s2);
        }
        if (!TextUtils.isEmpty(s3))
        {
            s1.addRequestProperty("Authorization", (new StringBuilder()).append("Bearer ").append(s3).toString());
        }
        if (fr1 == null)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        if (!TextUtils.isEmpty(fr1.c()))
        {
            s1.setDoOutput(true);
            abyte0 = fr1.c().getBytes();
            s1.setFixedLengthStreamingMode(abyte0.length);
            bufferedoutputstream = new BufferedOutputStream(s1.getOutputStream());
            bufferedoutputstream.write(abyte0);
            bufferedoutputstream.close();
        }
        j = s1.getResponseCode();
        map = s1.getHeaderFields();
        if (j < 200 || j >= 300)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        adrequestinfoparcel = adrequestinfoparcel.toString();
        context = zzp.zzbx().a(new InputStreamReader(s1.getInputStream()));
        a(((String) (adrequestinfoparcel)), map, ((String) (context)), j);
        fq1.a(adrequestinfoparcel, map, context);
        if (bd1 == null)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        bd1.a(bc, new String[] {
            "ufe"
        });
        adrequestinfoparcel = fq1.a(l);
        s1.disconnect();
        return adrequestinfoparcel;
        a(adrequestinfoparcel.toString(), map, null, j);
        if (j < 300 || j >= 400)
        {
            break MISSING_BLOCK_LABEL_419;
        }
        adrequestinfoparcel = s1.getHeaderField("Location");
        if (!TextUtils.isEmpty(adrequestinfoparcel))
        {
            break MISSING_BLOCK_LABEL_377;
        }
        zzb.zzaE("No location header to follow redirect.");
        adrequestinfoparcel = new AdResponseParcel(0);
        s1.disconnect();
        return adrequestinfoparcel;
        adrequestinfoparcel = new URL(adrequestinfoparcel);
        i++;
        if (i <= 5)
        {
            break MISSING_BLOCK_LABEL_458;
        }
        zzb.zzaE("Too many redirects.");
        adrequestinfoparcel = new AdResponseParcel(0);
        s1.disconnect();
        return adrequestinfoparcel;
        zzb.zzaE((new StringBuilder()).append("Received error HTTP response code: ").append(j).toString());
        adrequestinfoparcel = new AdResponseParcel(0);
        s1.disconnect();
        return adrequestinfoparcel;
        fq1.a(map);
        s1.disconnect();
        break MISSING_BLOCK_LABEL_67;
        adrequestinfoparcel;
        s1.disconnect();
        throw adrequestinfoparcel;
    }

    public static fn a(Context context, ar ar1, fm fm1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        Context context1 = context;
        if (context.getApplicationContext() != null)
        {
            context1 = context.getApplicationContext();
        }
        b = new fn(context1, ar1, fm1);
        context = b;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static ht.a a(String s, bd bd1, bc bc)
    {
        return b(s, bd1, bc);
    }

    private static void a(String s, Map map, String s1, int i)
    {
        if (zzb.zzM(2))
        {
            zzb.v((new StringBuilder()).append("Http Response: {\n  URL:\n    ").append(s).append("\n  Headers:").toString());
            if (map != null)
            {
                for (s = map.keySet().iterator(); s.hasNext();)
                {
                    Object obj = (String)s.next();
                    zzb.v((new StringBuilder()).append("    ").append(((String) (obj))).append(":").toString());
                    obj = ((List)map.get(obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s2 = (String)((Iterator) (obj)).next();
                        zzb.v((new StringBuilder()).append("      ").append(s2).toString());
                    }
                }

            }
            zzb.v("  Body:");
            if (s1 != null)
            {
                for (int j = 0; j < Math.min(s1.length(), 0x186a0); j += 1000)
                {
                    zzb.v(s1.substring(j, Math.min(s1.length(), j + 1000)));
                }

            } else
            {
                zzb.v("    null");
            }
            zzb.v((new StringBuilder()).append("  Response Code:\n    ").append(i).append("\n}").toString());
        }
    }

    private static ht.a b(String s, bd bd1, bc bc)
    {
        return new _cls1(bd1, bc, s);
    }

    public void zza(AdRequestInfoParcel adrequestinfoparcel, zzk zzk)
    {
        zzp.zzbA().a(c, adrequestinfoparcel.zzqb);
        gw.b(new zzgm._cls6(this, adrequestinfoparcel, zzk));
    }

    public AdResponseParcel zze(AdRequestInfoParcel adrequestinfoparcel)
    {
        return a(c, f, e, d, adrequestinfoparcel);
    }


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
