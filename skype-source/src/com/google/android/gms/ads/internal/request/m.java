// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.internal.ab;
import com.google.android.gms.internal.ae;
import com.google.android.gms.internal.ar;
import com.google.android.gms.internal.ax;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.cf;
import com.google.android.gms.internal.cg;
import com.google.android.gms.internal.ck;
import com.google.android.gms.internal.cu;
import com.google.android.gms.internal.fo;
import com.google.android.gms.internal.ft;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.hi;
import com.google.android.gms.internal.io;
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
//            AdResponseParcel, AdRequestInfoParcel

public final class m extends gi
{
    public static final class a
        implements com.google.android.gms.internal.cu.b
    {

        public final void a(Object obj)
        {
            com.google.android.gms.ads.internal.request.m.b((ab)obj);
        }

        public a()
        {
        }
    }

    public static final class b
        implements com.google.android.gms.internal.cu.b
    {

        public final void a(Object obj)
        {
            com.google.android.gms.ads.internal.request.m.a((ab)obj);
        }

        public b()
        {
        }
    }

    public static final class c
        implements cf
    {

        public final void a(hi hi, Map map)
        {
            hi = (String)map.get("request_id");
            map = (String)map.get("errors");
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Invalid request: ")).append(map).toString());
            com.google.android.gms.ads.internal.request.m.c().b(hi);
        }

        public c()
        {
        }
    }


    static final long a;
    private static final Object b = new Object();
    private static boolean c = false;
    private static cu d = null;
    private static cg e = null;
    private static ck f = null;
    private static cf g = null;
    private final a.a h;
    private final AdRequestInfoParcel.a i;
    private final Object j;
    private final Context k;
    private com.google.android.gms.internal.cu.d l;

    public m(Context context, AdRequestInfoParcel.a a1, a.a a2)
    {
        j = new Object();
        h = a2;
        k = context;
        i = a1;
        synchronized (b)
        {
            if (!c)
            {
                f = new ck();
                e = new cg(context.getApplicationContext(), a1.j);
                g = new c();
                context = k.getApplicationContext();
                a1 = i.j;
                com.google.android.gms.internal.au au = ay.b;
                d = new cu(context, a1, (String)p.n().a(au), new b(), new a());
                c = true;
            }
        }
        return;
        context;
        a2;
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
        long l1 = p.i().b();
        Future future = f.a(((String) (obj)));
        com.google.android.gms.ads.internal.util.client.a.a.post(new Runnable(jsonobject, ((String) (obj))) {

            final JSONObject a;
            final String b;
            final m c;

            public final void run()
            {
                com.google.android.gms.ads.internal.request.m.a(c, com.google.android.gms.ads.internal.request.m.d().b());
                com.google.android.gms.ads.internal.request.m.b(c).a(new com.google.android.gms.internal.hc.c(this) {

                    final _cls2 a;

                    public final void a(Object obj)
                    {
                        obj = (ae)obj;
                        try
                        {
                            ((ae) (obj)).a("AFMA_getAdapterLessMediationAd", a.a);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            com.google.android.gms.ads.internal.util.client.b.a("Error requesting an ad url", ((Throwable) (obj)));
                        }
                        com.google.android.gms.ads.internal.request.m.c().b(a.b);
                    }

            
            {
                a = _pcls2;
                super();
            }
                }, new com.google.android.gms.internal.hc.a(this) {

                    final _cls2 a;

                    public final void a()
                    {
                        com.google.android.gms.ads.internal.request.m.c().b(a.b);
                    }

            
            {
                a = _pcls2;
                super();
            }
                });
            }

            
            {
                c = m.this;
                a = jsonobject;
                b = s;
                super();
            }
        });
        long l2 = a;
        long l3 = p.i().b();
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
        obj = fo.a(k, adrequestinfoparcel, ((JSONObject) (obj)).toString());
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

    static a.a a(m m1)
    {
        return m1.h;
    }

    static com.google.android.gms.internal.cu.d a(m m1, com.google.android.gms.internal.cu.d d1)
    {
        m1.l = d1;
        return d1;
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
        obj = k;
        com.google.android.gms.internal.fs fs = p.k().a(k);
        com.google.android.gms.internal.au au = ay.b;
        obj = fo.a(((Context) (obj)), adrequestinfoparcel, fs, new ar((String)p.n().a(au)), null, new ArrayList());
        if (obj == null) goto _L1; else goto _L3
_L3:
        adrequestinfoparcel = com.google.android.gms.ads.a.a.a(k);
_L4:
        HashMap hashmap = new HashMap();
        hashmap.put("request_id", s);
        hashmap.put("network_id", s1);
        hashmap.put("request_param", obj);
        hashmap.put("data", bundle);
        if (adrequestinfoparcel != null)
        {
            hashmap.put("adid", adrequestinfoparcel.a());
            int i1;
            if (adrequestinfoparcel.b())
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
            adrequestinfoparcel = p.e().a(hashmap);
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            return null;
        }
        return adrequestinfoparcel;
        adrequestinfoparcel;
_L5:
        com.google.android.gms.ads.internal.util.client.b.b("Cannot get advertising id info", adrequestinfoparcel);
        adrequestinfoparcel = null;
          goto _L4
        adrequestinfoparcel;
          goto _L5
        adrequestinfoparcel;
          goto _L5
        adrequestinfoparcel;
          goto _L5
    }

    protected static void a(ab ab1)
    {
        ab1.a("/loadAd", f);
        ab1.a("/fetchHttpRequest", e);
        ab1.a("/invalidRequest", g);
    }

    static com.google.android.gms.internal.cu.d b(m m1)
    {
        return m1.l;
    }

    protected static void b(ab ab1)
    {
        ab1.b("/loadAd", f);
        ab1.b("/fetchHttpRequest", e);
        ab1.b("/invalidRequest", g);
    }

    static ck c()
    {
        return f;
    }

    static cu d()
    {
        return d;
    }

    public final void a()
    {
        com.google.android.gms.ads.internal.util.client.b.a(3);
        Object obj = new AdRequestInfoParcel(i, null, null, -1L);
        AdResponseParcel adresponseparcel = a(((AdRequestInfoParcel) (obj)));
        long l1 = p.i().b();
        obj = new com.google.android.gms.internal.gb.a(((AdRequestInfoParcel) (obj)), adresponseparcel, null, null, adresponseparcel.e, l1, adresponseparcel.n, null);
        com.google.android.gms.ads.internal.util.client.a.a.post(new Runnable(((com.google.android.gms.internal.gb.a) (obj))) {

            final com.google.android.gms.internal.gb.a a;
            final m b;

            public final void run()
            {
                com.google.android.gms.ads.internal.request.m.a(b).a(a);
                if (com.google.android.gms.ads.internal.request.m.b(b) != null)
                {
                    com.google.android.gms.ads.internal.request.m.b(b).a();
                    com.google.android.gms.ads.internal.request.m.a(b, null);
                }
            }

            
            {
                b = m.this;
                a = a1;
                super();
            }
        });
    }

    public final void b()
    {
        synchronized (j)
        {
            com.google.android.gms.ads.internal.util.client.a.a.post(new Runnable() {

                final m a;

                public final void run()
                {
                    if (com.google.android.gms.ads.internal.request.m.b(a) != null)
                    {
                        com.google.android.gms.ads.internal.request.m.b(a).a();
                        com.google.android.gms.ads.internal.request.m.a(a, null);
                    }
                }

            
            {
                a = m.this;
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
