// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
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

public final class cif extends bjf
{

    private static final Object a = new Object();
    private static cif b;
    private final Context c;
    private final cie d;
    private final cau e;
    private final ced f;

    private cif(Context context, cau cau1, cie cie1)
    {
        c = context;
        d = cie1;
        e = cau1;
        if (context.getApplicationContext() != null)
        {
            context = context.getApplicationContext();
        }
        f = new ced(context, new VersionInfoParcel(), cau1.a, new cef() {

            public final void a(Object obj)
            {
                ((caa)obj).a("/log", cdh.g);
            }

        }, new ceg());
    }

    public static cif a(Context context, cau cau1, cie cie1)
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
        b = new cif(context1, cau1, cie1);
        context = b;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static cky a(String s, cbk cbk1, cbi cbi)
    {
        return new cky(cbk1, cbi, s) {

            private cbk a;
            private cbi b;
            private String c;

            public final void a(ckw ckw1, boolean flag)
            {
                a.a(b, new String[] {
                    "jsf"
                });
                a.b();
                ckw1.a("AFMA_buildAdURL", c);
            }

            
            {
                a = cbk1;
                b = cbi;
                c = s;
                super();
            }
        };
    }

    private static AdResponseParcel a(Context context, ced ced1, cau cau1, cie cie1, AdRequestInfoParcel adrequestinfoparcel)
    {
        bka.a("Starting ad request from service.");
        cbb.a(context);
        Object obj = cbb.u;
        cbk cbk1 = new cbk(((Boolean)bkv.n().a(((cax) (obj)))).booleanValue(), "load_ad", adrequestinfoparcel.d.b);
        if (adrequestinfoparcel.a > 10 && adrequestinfoparcel.B != -1L)
        {
            cbk1.a(cbk1.a(adrequestinfoparcel.B), new String[] {
                "cts"
            });
        }
        cbi cbi = cbk1.a();
        Object obj1 = bkv.k().a(context);
        if (((cik) (obj1)).m == -1)
        {
            bka.a("Device is offline.");
            return new AdResponseParcel(2);
        }
        cih cih1;
        if (adrequestinfoparcel.a >= 7)
        {
            obj = adrequestinfoparcel.w;
        } else
        {
            obj = UUID.randomUUID().toString();
        }
        cih1 = new cih(((String) (obj)), adrequestinfoparcel.f.packageName);
        if (adrequestinfoparcel.c.c != null)
        {
            String s = adrequestinfoparcel.c.c.getString("_ad");
            if (s != null)
            {
                return cig.a(context, adrequestinfoparcel, s);
            }
        }
        Object obj2 = adrequestinfoparcel.g.packageName;
        obj2 = cie1.a.a(adrequestinfoparcel);
        obj1 = cig.a(adrequestinfoparcel, ((cik) (obj1)), cau1, cie1.b.a(adrequestinfoparcel.h), ((List) (obj2)));
        if (adrequestinfoparcel.a < 7)
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
        cbk1.a(cbi, new String[] {
            "arc"
        });
        obj1 = cbk1.a();
        obj2 = cbb.b;
        if (((Boolean)bkv.n().a(((cax) (obj2)))).booleanValue())
        {
            cjj.a.post(new Runnable(ced1, cih1, cbk1, ((cbi) (obj1)), ((String) (obj))) {

                final cih a;
                final cbk b;
                final String c;
                private ced d;
                private cbi e;

                public final void run()
                {
                    ceh ceh1 = d.b();
                    a.f = ceh1;
                    b.a(e, new String[] {
                        "rwc"
                    });
                    ceh1.a(new ckp(this, b.a()) {

                        private cbi a;
                        private _cls1 b;

                        public final void a(Object obj)
                        {
                            obj = (cae)obj;
                            b.b.a(a, new String[] {
                                "jsf"
                            });
                            b.b.b();
                            ((cae) (obj)).a("/invalidRequest", b.a.g);
                            ((cae) (obj)).a("/loadAdURL", b.a.h);
                            try
                            {
                                ((cae) (obj)).a("AFMA_buildAdURL", b.c);
                                return;
                            }
                            // Misplaced declaration of an exception variable
                            catch (Object obj)
                            {
                                bka.b("Error requesting an ad url", ((Throwable) (obj)));
                            }
                        }

            
            {
                b = _pcls1;
                a = cbi;
                super();
            }
                    }, new ckn() {

                        public final void a()
                        {
                        }

                    });
                }

            
            {
                d = ced1;
                a = cih1;
                b = cbk1;
                e = cbi;
                c = s;
                super();
            }
            });
        } else
        {
            cjj.a.post(new Runnable(context, adrequestinfoparcel, cih1, cbk1, ((cbi) (obj1)), ((String) (obj)), cau1) {

                private Context a;
                private AdRequestInfoParcel b;
                private cih c;
                private cbk d;
                private cbi e;
                private String f;
                private cau g;

                public final void run()
                {
                    bkv.f();
                    ckw ckw1 = clc.a(a, new AdSizeParcel(), false, false, null, b.k);
                    if (bkv.h().h())
                    {
                        ckw1.clearCache(true);
                    }
                    ckw1.a().setWillNotDraw(true);
                    c.e = ckw1;
                    d.a(e, new String[] {
                        "rwc"
                    });
                    Object obj3 = d.a();
                    obj3 = cif.a(f, d, ((cbi) (obj3)));
                    ckx ckx1 = ckw1.k();
                    ckx1.a("/invalidRequest", c.g);
                    ckx1.a("/loadAdURL", c.h);
                    ckx1.a("/log", cdh.g);
                    ckx1.d = ((cky) (obj3));
                    bka.a("Loading the JS library.");
                    ckw1.loadUrl(g.a);
                }

            
            {
                a = context;
                b = adrequestinfoparcel;
                c = cih1;
                d = cbk1;
                e = cbi;
                f = s;
                g = cau1;
                super();
            }
            });
        }
        ced1 = (cij)cih1.d.get(10L, TimeUnit.SECONDS);
        if (ced1 != null)
        {
            break MISSING_BLOCK_LABEL_489;
        }
        context = new AdResponseParcel(0);
        cjj.a.post(new Runnable(cih1) {

            private cih a;

            public final void run()
            {
                cih cih2 = a;
                if (cih2.e != null)
                {
                    cih2.e.destroy();
                    cih2.e = null;
                }
                if (a.f != null)
                {
                    a.f.a();
                }
            }

            
            {
                a = cih1;
                super();
            }
        });
        return context;
        context;
        context = new AdResponseParcel(0);
        cjj.a.post(new _cls3(cih1));
        return context;
        if (((cij) (ced1)).g == -2)
        {
            break MISSING_BLOCK_LABEL_528;
        }
        context = new AdResponseParcel(((cij) (ced1)).g);
        cjj.a.post(new _cls3(cih1));
        return context;
        if (cbk1.e() != null)
        {
            cbk1.a(cbk1.e(), new String[] {
                "rur"
            });
        }
        if (((cij) (ced1)).d)
        {
            cau1 = adrequestinfoparcel.g.packageName;
        }
        context = a(adrequestinfoparcel, context, adrequestinfoparcel.k.b, ((cij) (ced1)).f, ((cij) (ced1)), cbk1, cie1);
        if (((AdResponseParcel) (context)).x == 1)
        {
            ced1 = adrequestinfoparcel.g.packageName;
        }
        cbk1.a(cbi, new String[] {
            "tts"
        });
        context.z = cbk1.c();
        cjj.a.post(new _cls3(cih1));
        return context;
        context;
        cjj.a.post(new _cls3(cih1));
        throw context;
    }

    public static AdResponseParcel a(AdRequestInfoParcel adrequestinfoparcel, Context context, String s, String s1, cij cij1, cbk cbk1, cie cie1)
    {
        cbi cbi;
        HttpURLConnection httpurlconnection;
        cii cii1;
        byte abyte0[];
        int i;
        int j;
        long l;
        if (cbk1 != null)
        {
            cbi = cbk1.a();
        } else
        {
            cbi = null;
        }
        cii1 = new cii(adrequestinfoparcel);
        bka.a((new StringBuilder("AdRequestServiceImpl: Sending request: ")).append(s1).toString());
        adrequestinfoparcel = new URL(s1);
        l = bkv.i().b();
        i = 0;
_L3:
        httpurlconnection = (HttpURLConnection)adrequestinfoparcel.openConnection();
        bkv.e().a(context, s, false, httpurlconnection);
        if (!TextUtils.isEmpty(null))
        {
            httpurlconnection.addRequestProperty("x-afma-drt-cookie", null);
        }
        if (!TextUtils.isEmpty(null))
        {
            httpurlconnection.addRequestProperty("Authorization", (new StringBuilder("Bearer ")).append(null).toString());
        }
        if (cij1 == null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        if (TextUtils.isEmpty(cij1.b))
        {
            break MISSING_BLOCK_LABEL_195;
        }
        httpurlconnection.setDoOutput(true);
        abyte0 = cij1.b.getBytes();
        httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
        s1 = new BufferedOutputStream(httpurlconnection.getOutputStream());
        s1.write(abyte0);
        cnt.a(s1);
        j = httpurlconnection.getResponseCode();
        s1 = httpurlconnection.getHeaderFields();
        if (j < 200 || j >= 300) goto _L2; else goto _L1
_L1:
        adrequestinfoparcel = adrequestinfoparcel.toString();
        context = new InputStreamReader(httpurlconnection.getInputStream());
        bkv.e();
        s = cjj.a(context);
        cnt.a(context);
        a(((String) (adrequestinfoparcel)), ((Map) (s1)), s, j);
        cii1.b = adrequestinfoparcel;
        cii1.c = s;
        cii1.a(s1);
        if (cbk1 == null)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        cbk1.a(cbi, new String[] {
            "ufe"
        });
        adrequestinfoparcel = new AdResponseParcel(cii1.t, cii1.b, cii1.c, cii1.d, cii1.g, cii1.h, cii1.i, cii1.j, cii1.k, cii1.l, cii1.a, l, cii1.e, cii1.f, cii1.m, cii1.n, cii1.o, cii1.p, cii1.q, cii1.r, cii1.s);
        httpurlconnection.disconnect();
        return adrequestinfoparcel;
        adrequestinfoparcel;
        context = null;
_L5:
        cnt.a(context);
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
            bka.e((new StringBuilder("Error while connecting to ad server: ")).append(adrequestinfoparcel.getMessage()).toString());
        }
        return new AdResponseParcel(2);
        adrequestinfoparcel;
        context = null;
_L4:
        cnt.a(context);
        throw adrequestinfoparcel;
_L2:
        a(adrequestinfoparcel.toString(), ((Map) (s1)), null, j);
        if (j < 300 || j >= 400)
        {
            break MISSING_BLOCK_LABEL_594;
        }
        adrequestinfoparcel = httpurlconnection.getHeaderField("Location");
        if (!TextUtils.isEmpty(adrequestinfoparcel))
        {
            break MISSING_BLOCK_LABEL_551;
        }
        bka.e("No location header to follow redirect.");
        adrequestinfoparcel = new AdResponseParcel(0);
        httpurlconnection.disconnect();
        return adrequestinfoparcel;
        adrequestinfoparcel = new URL(adrequestinfoparcel);
        i++;
        if (i <= 5)
        {
            break MISSING_BLOCK_LABEL_631;
        }
        bka.e("Too many redirects.");
        adrequestinfoparcel = new AdResponseParcel(0);
        httpurlconnection.disconnect();
        return adrequestinfoparcel;
        bka.e((new StringBuilder("Received error HTTP response code: ")).append(j).toString());
        adrequestinfoparcel = new AdResponseParcel(0);
        httpurlconnection.disconnect();
        return adrequestinfoparcel;
        cii1.a(s1);
        httpurlconnection.disconnect();
        if (cie1 == null);
          goto _L3
        adrequestinfoparcel;
          goto _L4
        adrequestinfoparcel;
        context = s1;
          goto _L5
    }

    private static void a(String s, Map map, String s1, int i)
    {
        if (bka.a(2))
        {
            bka.d((new StringBuilder("Http Response: {\n  URL:\n    ")).append(s).append("\n  Headers:").toString());
            if (map != null)
            {
                for (s = map.keySet().iterator(); s.hasNext();)
                {
                    Object obj = (String)s.next();
                    bka.d((new StringBuilder("    ")).append(((String) (obj))).append(":").toString());
                    obj = ((List)map.get(obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s2 = (String)((Iterator) (obj)).next();
                        bka.d((new StringBuilder("      ")).append(s2).toString());
                    }
                }

            }
            bka.d("  Body:");
            if (s1 != null)
            {
                for (int j = 0; j < Math.min(s1.length(), 0x186a0); j += 1000)
                {
                    bka.d(s1.substring(j, Math.min(s1.length(), j + 1000)));
                }

            } else
            {
                bka.d("    null");
            }
            bka.d((new StringBuilder("  Response Code:\n    ")).append(i).append("\n}").toString());
        }
    }

    public final AdResponseParcel a(AdRequestInfoParcel adrequestinfoparcel)
    {
        return a(c, f, e, d, adrequestinfoparcel);
    }

    public final void a(AdRequestInfoParcel adrequestinfoparcel, bjh bjh)
    {
        bkv.h().a(c, adrequestinfoparcel.k);
        cjj.b(new Runnable(adrequestinfoparcel, bjh) {

            private AdRequestInfoParcel a;
            private bjh b;
            private cif c;

            public final void run()
            {
                AdResponseParcel adresponseparcel;
                AdResponseParcel adresponseparcel1;
                try
                {
                    adresponseparcel = c.a(a);
                }
                catch (Exception exception)
                {
                    bkv.h().a(exception, true);
                    bka.c("Could not fetch ad response due to an Exception.", exception);
                    exception = null;
                }
                adresponseparcel1 = adresponseparcel;
                if (adresponseparcel == null)
                {
                    adresponseparcel1 = new AdResponseParcel(0);
                }
                try
                {
                    b.a(adresponseparcel1);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    bka.c("Fail to forward ad response.", remoteexception);
                }
            }

            
            {
                c = cif.this;
                a = adrequestinfoparcel;
                b = bjh1;
                super();
            }
        });
    }

}
