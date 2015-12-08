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
//            ha, cn, nq, hn, 
//            cy, dm, cx, oa, 
//            ny, nt, ns, ni, 
//            cp, oz, qa, nk, 
//            nx, no, nn, nw, 
//            wg, wk, np, pe, 
//            nr, dk, sb

public final class nj extends com.google.android.gms.ads.internal.request.zzj.zza
{

    private static final Object a = new Object();
    private static nj b;
    private final Context c;
    private final ni d;
    private final cn e;
    private final ha f;

    private nj(Context context, cn cn1, ni ni1)
    {
        c = context;
        d = ni1;
        e = cn1;
        if (context.getApplicationContext() != null)
        {
            context = context.getApplicationContext();
        }
        f = new ha(context, new VersionInfoParcel(0x7bd338, 0x7bd338, true), cn1.a(), new nq(this), new hn());
    }

    private static AdResponseParcel a(Context context, ha ha1, cn cn1, ni ni1, AdRequestInfoParcel adrequestinfoparcel)
    {
        zzb.zzaF("Starting ad request from service.");
        cy.a(context);
        Object obj = cy.G;
        dm dm1 = new dm(((Boolean)zzp.zzbE().a(((cq) (obj)))).booleanValue(), "load_ad", adrequestinfoparcel.zzqn.zzte);
        if (adrequestinfoparcel.versionCode > 10 && adrequestinfoparcel.zzEF != -1L)
        {
            dm1.a(dm1.a(adrequestinfoparcel.zzEF), new String[] {
                "cts"
            });
        }
        dk dk = dm1.a();
        Object obj1 = zzp.zzbB().a(context);
        if (((ny) (obj1)).m == -1)
        {
            zzb.zzaF("Device is offline.");
            return new AdResponseParcel(2);
        }
        nt nt1;
        if (adrequestinfoparcel.versionCode >= 7)
        {
            obj = adrequestinfoparcel.zzEC;
        } else
        {
            obj = UUID.randomUUID().toString();
        }
        nt1 = new nt(((String) (obj)), adrequestinfoparcel.applicationInfo.packageName);
        if (adrequestinfoparcel.zzEn.extras != null)
        {
            String s = adrequestinfoparcel.zzEn.extras.getString("_ad");
            if (s != null)
            {
                return ns.a(context, adrequestinfoparcel, s);
            }
        }
        Object obj2 = adrequestinfoparcel.zzEo.packageName;
        obj2 = ni1.b.a(adrequestinfoparcel);
        obj1 = ns.a(context, adrequestinfoparcel, ((ny) (obj1)), cn1, ni1.e.a(adrequestinfoparcel.zzEp), ((List) (obj2)));
        if (adrequestinfoparcel.versionCode < 7)
        {
            try
            {
                ((JSONObject) (obj1)).put("request_id", obj);
            }
            catch (JSONException jsonexception) { }
        }
        if (obj1 == null)
        {
            return new AdResponseParcel(0);
        }
        obj = ((JSONObject) (obj1)).toString();
        dm1.a(dk, new String[] {
            "arc"
        });
        obj1 = dm1.a();
        obj2 = cy.c;
        if (((Boolean)zzp.zzbE().a(((cq) (obj2)))).booleanValue())
        {
            qa.a.post(new nk(ha1, nt1, dm1, ((dk) (obj1)), ((String) (obj))));
        } else
        {
            qa.a.post(new nn(context, adrequestinfoparcel, nt1, dm1, ((dk) (obj1)), ((String) (obj)), cn1));
        }
        ha1 = (nx)nt1.a().get(10L, TimeUnit.SECONDS);
        if (ha1 != null)
        {
            break MISSING_BLOCK_LABEL_489;
        }
        context = new AdResponseParcel(0);
        qa.a.post(new no(nt1));
        return context;
        context;
        context = new AdResponseParcel(0);
        qa.a.post(new no(nt1));
        return context;
        if (ha1.a() == -2)
        {
            break MISSING_BLOCK_LABEL_528;
        }
        context = new AdResponseParcel(ha1.a());
        qa.a.post(new no(nt1));
        return context;
        if (dm1.e() != null)
        {
            dm1.a(dm1.e(), new String[] {
                "rur"
            });
        }
        if (ha1.f())
        {
            cn1 = adrequestinfoparcel.zzEo.packageName;
        }
        context = a(adrequestinfoparcel, context, adrequestinfoparcel.zzqj.zzJu, ha1.d(), ((nx) (ha1)), dm1, ni1);
        if (((AdResponseParcel) (context)).zzEW == 1)
        {
            ha1 = adrequestinfoparcel.zzEo.packageName;
        }
        dm1.a(dk, new String[] {
            "tts"
        });
        context.zzEY = dm1.c();
        qa.a.post(new no(nt1));
        return context;
        context;
        qa.a.post(new no(nt1));
        throw context;
    }

    public static AdResponseParcel a(AdRequestInfoParcel adrequestinfoparcel, Context context, String s, String s1, nx nx1, dm dm1, ni ni1)
    {
        dk dk;
        HttpURLConnection httpurlconnection;
        nw nw1;
        byte abyte0[];
        int i;
        int j;
        long l;
        if (dm1 != null)
        {
            dk = dm1.a();
        } else
        {
            dk = null;
        }
        nw1 = new nw(adrequestinfoparcel);
        zzb.zzaF((new StringBuilder("AdRequestServiceImpl: Sending request: ")).append(s1).toString());
        adrequestinfoparcel = new URL(s1);
        l = zzp.zzbz().b();
        i = 0;
_L3:
        httpurlconnection = (HttpURLConnection)adrequestinfoparcel.openConnection();
        zzp.zzbv().a(context, s, false, httpurlconnection);
        if (!TextUtils.isEmpty(null))
        {
            httpurlconnection.addRequestProperty("x-afma-drt-cookie", null);
        }
        if (!TextUtils.isEmpty(null))
        {
            httpurlconnection.addRequestProperty("Authorization", (new StringBuilder("Bearer ")).append(null).toString());
        }
        if (nx1 == null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        if (TextUtils.isEmpty(nx1.c()))
        {
            break MISSING_BLOCK_LABEL_195;
        }
        httpurlconnection.setDoOutput(true);
        abyte0 = nx1.c().getBytes();
        httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
        s1 = new BufferedOutputStream(httpurlconnection.getOutputStream());
        s1.write(abyte0);
        wk.a(s1);
        j = httpurlconnection.getResponseCode();
        s1 = httpurlconnection.getHeaderFields();
        if (j < 200 || j >= 300) goto _L2; else goto _L1
_L1:
        adrequestinfoparcel = adrequestinfoparcel.toString();
        context = new InputStreamReader(httpurlconnection.getInputStream());
        zzp.zzbv();
        s = qa.a(context);
        wk.a(context);
        a(((String) (adrequestinfoparcel)), ((Map) (s1)), s, j);
        nw1.a(adrequestinfoparcel, s1, s);
        if (dm1 == null)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        dm1.a(dk, new String[] {
            "ufe"
        });
        adrequestinfoparcel = nw1.a(l);
        httpurlconnection.disconnect();
        return adrequestinfoparcel;
        adrequestinfoparcel;
        context = null;
_L5:
        wk.a(context);
        throw adrequestinfoparcel;
        adrequestinfoparcel;
        try
        {
            httpurlconnection.disconnect();
            throw adrequestinfoparcel;
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            zzb.zzaH((new StringBuilder("Error while connecting to ad server: ")).append(adrequestinfoparcel.getMessage()).toString());
        }
        return new AdResponseParcel(2);
        adrequestinfoparcel;
        context = null;
_L4:
        wk.a(context);
        throw adrequestinfoparcel;
_L2:
        a(adrequestinfoparcel.toString(), ((Map) (s1)), null, j);
        if (j < 300 || j >= 400)
        {
            break MISSING_BLOCK_LABEL_482;
        }
        adrequestinfoparcel = httpurlconnection.getHeaderField("Location");
        if (!TextUtils.isEmpty(adrequestinfoparcel))
        {
            break MISSING_BLOCK_LABEL_439;
        }
        zzb.zzaH("No location header to follow redirect.");
        adrequestinfoparcel = new AdResponseParcel(0);
        httpurlconnection.disconnect();
        return adrequestinfoparcel;
        adrequestinfoparcel = new URL(adrequestinfoparcel);
        i++;
        if (i <= 5)
        {
            break MISSING_BLOCK_LABEL_519;
        }
        zzb.zzaH("Too many redirects.");
        adrequestinfoparcel = new AdResponseParcel(0);
        httpurlconnection.disconnect();
        return adrequestinfoparcel;
        zzb.zzaH((new StringBuilder("Received error HTTP response code: ")).append(j).toString());
        adrequestinfoparcel = new AdResponseParcel(0);
        httpurlconnection.disconnect();
        return adrequestinfoparcel;
        nw1.a(s1);
        httpurlconnection.disconnect();
        if (ni1 == null);
          goto _L3
        adrequestinfoparcel;
          goto _L4
        adrequestinfoparcel;
        context = s1;
          goto _L5
    }

    public static nj a(Context context, cn cn1, ni ni1)
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
        b = new nj(context1, cn1, ni1);
        context = b;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static sb a(String s, dm dm1, dk dk)
    {
        return new np(dm1, dk, s);
    }

    private static void a(String s, Map map, String s1, int i)
    {
        if (zzb.zzN(2))
        {
            zzb.v((new StringBuilder("Http Response: {\n  URL:\n    ")).append(s).append("\n  Headers:").toString());
            if (map != null)
            {
                for (s = map.keySet().iterator(); s.hasNext();)
                {
                    Object obj = (String)s.next();
                    zzb.v((new StringBuilder("    ")).append(((String) (obj))).append(":").toString());
                    obj = ((List)map.get(obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s2 = (String)((Iterator) (obj)).next();
                        zzb.v((new StringBuilder("      ")).append(s2).toString());
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
            zzb.v((new StringBuilder("  Response Code:\n    ")).append(i).append("\n}").toString());
        }
    }

    public final void zza(AdRequestInfoParcel adrequestinfoparcel, zzk zzk)
    {
        zzp.zzby().a(c, adrequestinfoparcel.zzqj);
        qa.b(new nr(this, adrequestinfoparcel, zzk));
    }

    public final AdResponseParcel zze(AdRequestInfoParcel adrequestinfoparcel)
    {
        return a(c, f, e, d, adrequestinfoparcel);
    }

}
