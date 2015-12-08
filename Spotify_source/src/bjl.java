// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
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

public final class bjl extends cjc
{

    private static long a;
    private static final Object b = new Object();
    private static boolean c = false;
    private static ced d = null;
    private static cdj e = null;
    private static cdr f = null;
    private static cdi h = null;
    private final bis i;
    private final biq j;
    private final Object k;
    private final Context l;
    private ceh m;

    public bjl(Context context, biq biq1, bis bis)
    {
        super((byte)0);
        k = new Object();
        i = bis;
        l = context;
        j = biq1;
        synchronized (b)
        {
            if (!c)
            {
                f = new cdr();
                e = new cdj(context.getApplicationContext(), biq1.j);
                h = new bjo();
                context = l.getApplicationContext();
                biq1 = j.j;
                cax cax = cbb.a;
                d = new ced(context, biq1, (String)bkv.n().a(cax), new bjn(), new bjm());
                c = true;
            }
        }
        return;
        context;
        bis;
        JVM INSTR monitorexit ;
        throw context;
    }

    static bis a(bjl bjl1)
    {
        return bjl1.i;
    }

    static ceh a(bjl bjl1, ceh ceh)
    {
        bjl1.m = ceh;
        return ceh;
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
        long l1 = bkv.i().b();
        cdr cdr1 = f;
        ckg ckg1 = new ckg();
        cdr1.a.put(obj, ckg1);
        bjz.a.post(new Runnable(jsonobject, ((String) (obj))) {

            final JSONObject a;
            final String b;
            private bjl c;

            public final void run()
            {
                bjl.a(c, bjl.d().b());
                bjl.b(c).a(new ckp(this) {

                    private _cls2 a;

                    public final void a(Object obj)
                    {
                        obj = (cae)obj;
                        try
                        {
                            ((cae) (obj)).a("AFMA_getAdapterLessMediationAd", a.a);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            bka.b("Error requesting an ad url", ((Throwable) (obj)));
                        }
                        bjl.h_().a(a.b);
                    }

            
            {
                a = _pcls2;
                super();
            }
                }, new ckn(this) {

                    private _cls2 a;

                    public final void a()
                    {
                        bjl.h_().a(a.b);
                    }

            
            {
                a = _pcls2;
                super();
            }
                });
            }

            
            {
                c = bjl.this;
                a = jsonobject;
                b = s;
                super();
            }
        });
        long l2 = a;
        long l3 = bkv.i().b();
        try
        {
            obj = (JSONObject)ckg1.get(l2 - (l3 - l1), TimeUnit.MILLISECONDS);
            break MISSING_BLOCK_LABEL_119;
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
        obj = cig.a(l, adrequestinfoparcel, ((JSONObject) (obj)).toString());
        adrequestinfoparcel = ((AdRequestInfoParcel) (obj));
        if (((AdResponseParcel) (obj)).e != -3)
        {
            adrequestinfoparcel = ((AdRequestInfoParcel) (obj));
            if (TextUtils.isEmpty(((AdResponseParcel) (obj)).c))
            {
                return new AdResponseParcel(3);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private JSONObject a(AdRequestInfoParcel adrequestinfoparcel, String s)
    {
        Bundle bundle;
        String s1;
        bundle = adrequestinfoparcel.c.c.getBundle("sdk_less_server_data");
        s1 = adrequestinfoparcel.c.c.getString("sdk_less_network_id");
        if (bundle != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Object obj;
        obj = bkv.k().a(l);
        cax cax = cbb.a;
        obj = cig.a(adrequestinfoparcel, ((cik) (obj)), new cau((String)bkv.n().a(cax)), null, new ArrayList());
        if (obj == null) goto _L1; else goto _L3
_L3:
        adrequestinfoparcel = AdvertisingIdClient.getAdvertisingIdInfo(l);
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
            adrequestinfoparcel = bkv.e().a(hashmap);
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            return null;
        }
        return adrequestinfoparcel;
        adrequestinfoparcel;
_L5:
        bka.c("Cannot get advertising id info", adrequestinfoparcel);
        adrequestinfoparcel = null;
          goto _L4
        adrequestinfoparcel;
          goto _L5
        adrequestinfoparcel;
          goto _L5
        adrequestinfoparcel;
          goto _L5
    }

    protected static void a(caa caa1)
    {
        caa1.a("/loadAd", f);
        caa1.a("/fetchHttpRequest", e);
        caa1.a("/invalidRequest", h);
    }

    static ceh b(bjl bjl1)
    {
        return bjl1.m;
    }

    protected static void b(caa caa1)
    {
        caa1.b("/loadAd", f);
        caa1.b("/fetchHttpRequest", e);
        caa1.b("/invalidRequest", h);
    }

    static ced d()
    {
        return d;
    }

    static cdr h_()
    {
        return f;
    }

    public final void a()
    {
        bka.a("SdkLessAdLoaderBackgroundTask started.");
        Object obj = new AdRequestInfoParcel(j, null, -1L);
        AdResponseParcel adresponseparcel = a(((AdRequestInfoParcel) (obj)));
        long l1 = bkv.i().b();
        obj = new ciu(((AdRequestInfoParcel) (obj)), adresponseparcel, null, null, adresponseparcel.e, l1, adresponseparcel.n, null);
        bjz.a.post(new Runnable(((ciu) (obj))) {

            private ciu a;
            private bjl b;

            public final void run()
            {
                bjl.a(b).a(a);
                if (bjl.b(b) != null)
                {
                    bjl.b(b).a();
                    bjl.a(b, null);
                }
            }

            
            {
                b = bjl.this;
                a = ciu1;
                super();
            }
        });
    }

    public final void b()
    {
        synchronized (k)
        {
            bjz.a.post(new Runnable() {

                private bjl a;

                public final void run()
                {
                    if (bjl.b(a) != null)
                    {
                        bjl.b(a).a();
                        bjl.a(a, null);
                    }
                }

            
            {
                a = bjl.this;
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

    static 
    {
        a = TimeUnit.SECONDS.toMillis(10L);
    }
}
