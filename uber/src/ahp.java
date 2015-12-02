// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
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

public final class ahp extends nt
{

    private static final Object a = new Object();
    private static ahp b;
    private final Context c;
    private final aho d;
    private final abf e;
    private final adv f;

    private ahp(Context context, abf abf1, aho aho1)
    {
        c = context;
        d = aho1;
        e = abf1;
        if (context.getApplicationContext() != null)
        {
            context = context.getApplicationContext();
        }
        f = new adv(context, new VersionInfoParcel(), abf1.a(), new _cls5(), new akb());
    }

    public static ahp a(Context context, abf abf1, aho aho1)
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
        b = new ahp(context1, abf1, aho1);
        context = b;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static akm a(String s, abs abs1, abr abr)
    {
        return b(s, abs1, abr);
    }

    private static AdResponseParcel a(Context context, adv adv1, abf abf1, aho aho1, AdRequestInfoParcel adrequestinfoparcel)
    {
        of.a("Starting ad request from service.");
        abn.a(context);
        abs abs1 = new abs("load_ad");
        abr abr = abs.a();
        ahu ahu1 = new ahu(context);
        if (ahu1.l == -1)
        {
            of.a("Device is offline.");
            return new AdResponseParcel(2);
        }
        Object obj;
        ahr ahr1;
        if (adrequestinfoparcel.a >= 7)
        {
            obj = adrequestinfoparcel.z;
        } else
        {
            obj = UUID.randomUUID().toString();
        }
        ahr1 = new ahr(((String) (obj)), adrequestinfoparcel.f.packageName);
        if (adrequestinfoparcel.c.c != null)
        {
            String s = adrequestinfoparcel.c.c.getString("_ad");
            if (s != null)
            {
                return ahq.a(context, adrequestinfoparcel, s);
            }
        }
        Object obj1 = adrequestinfoparcel.g.packageName;
        obj1 = aho1.b.a(adrequestinfoparcel);
        aho1 = ahq.a(adrequestinfoparcel, ahu1, abf1, aho1.e.a(adrequestinfoparcel.h), ((List) (obj1)));
        if (adrequestinfoparcel.a < 7)
        {
            try
            {
                aho1.put("request_id", obj);
            }
            catch (JSONException jsonexception) { }
        }
        if (aho1 == null)
        {
            return new AdResponseParcel(0);
        }
        aho1 = aho1.toString();
        abs1.a(abr, new String[] {
            "arc"
        });
        obj = abs.a();
        if (((Boolean)abn.c.c()).booleanValue())
        {
            ajc.a.post(new _cls1(adv1, ahr1, abs1, ((abr) (obj)), aho1));
        } else
        {
            ajc.a.post(new _cls2(context, adrequestinfoparcel, ahr1, abs1, ((abr) (obj)), aho1, abf1));
        }
        aho1 = (aht)ahr1.b().get(10L, TimeUnit.SECONDS);
        if (aho1 != null)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        context = new AdResponseParcel(0);
        ajc.a.post(new _cls3(ahr1, adv1));
        return context;
        context;
        context = new AdResponseParcel(0);
        ajc.a.post(new _cls3(ahr1, adv1));
        return context;
        if (aho1.a() == -2)
        {
            break MISSING_BLOCK_LABEL_438;
        }
        context = new AdResponseParcel(aho1.a());
        ajc.a.post(new _cls3(ahr1, adv1));
        return context;
        if (abs1.d() != null)
        {
            abs1.a(abs1.d(), new String[] {
                "rur"
            });
        }
        if (aho1.f())
        {
            abf1 = adrequestinfoparcel.g.packageName;
        }
        abf1 = abs.a();
        context = a(adrequestinfoparcel, context, adrequestinfoparcel.k.b, aho1.d(), ((aht) (aho1)));
        if (((AdResponseParcel) (context)).x == 1)
        {
            aho1 = adrequestinfoparcel.g.packageName;
        }
        abs1.a(abf1, new String[] {
            "ufe"
        });
        abs1.a(abr, new String[] {
            "tts"
        });
        if (aiv.b() != null)
        {
            aiv.b().a(abs1);
        }
        ajc.a.post(new _cls3(ahr1, adv1));
        return context;
        context;
        ajc.a.post(new _cls3(ahr1, adv1));
        throw context;
    }

    public static AdResponseParcel a(AdRequestInfoParcel adrequestinfoparcel, Context context, String s, String s1, aht aht1)
    {
        ahs ahs1;
        byte abyte0[];
        Map map;
        BufferedOutputStream bufferedoutputstream;
        int i;
        int j;
        long l;
        try
        {
            ahs1 = new ahs(adrequestinfoparcel);
            of.a((new StringBuilder("AdRequestServiceImpl: Sending request: ")).append(s1).toString());
            adrequestinfoparcel = new URL(s1);
            l = SystemClock.elapsedRealtime();
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            of.e((new StringBuilder("Error while connecting to ad server: ")).append(adrequestinfoparcel.getMessage()).toString());
            return new AdResponseParcel(2);
        }
        i = 0;
        s1 = (HttpURLConnection)adrequestinfoparcel.openConnection();
        ot.e().a(context, s, false, s1);
        if (!TextUtils.isEmpty(null))
        {
            s1.addRequestProperty("x-afma-drt-cookie", null);
        }
        if (!TextUtils.isEmpty(null))
        {
            s1.addRequestProperty("Authorization", (new StringBuilder("Bearer ")).append(null).toString());
        }
        if (aht1 == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        if (!TextUtils.isEmpty(aht1.c()))
        {
            s1.setDoOutput(true);
            abyte0 = aht1.c().getBytes();
            s1.setFixedLengthStreamingMode(abyte0.length);
            bufferedoutputstream = new BufferedOutputStream(s1.getOutputStream());
            bufferedoutputstream.write(abyte0);
            bufferedoutputstream.close();
        }
        j = s1.getResponseCode();
        map = s1.getHeaderFields();
        if (j < 200 || j >= 300)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        adrequestinfoparcel = adrequestinfoparcel.toString();
        ot.e();
        context = ajc.a(new InputStreamReader(s1.getInputStream()));
        a(((String) (adrequestinfoparcel)), map, ((String) (context)), j);
        ahs1.a(adrequestinfoparcel, map, context);
        adrequestinfoparcel = ahs1.a(l);
        s1.disconnect();
        return adrequestinfoparcel;
        a(adrequestinfoparcel.toString(), map, null, j);
        if (j < 300 || j >= 400)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        adrequestinfoparcel = s1.getHeaderField("Location");
        if (!TextUtils.isEmpty(adrequestinfoparcel))
        {
            break MISSING_BLOCK_LABEL_322;
        }
        of.e("No location header to follow redirect.");
        adrequestinfoparcel = new AdResponseParcel(0);
        s1.disconnect();
        return adrequestinfoparcel;
        adrequestinfoparcel = new URL(adrequestinfoparcel);
        i++;
        if (i <= 5)
        {
            break MISSING_BLOCK_LABEL_400;
        }
        of.e("Too many redirects.");
        adrequestinfoparcel = new AdResponseParcel(0);
        s1.disconnect();
        return adrequestinfoparcel;
        of.e((new StringBuilder("Received error HTTP response code: ")).append(j).toString());
        adrequestinfoparcel = new AdResponseParcel(0);
        s1.disconnect();
        return adrequestinfoparcel;
        ahs1.a(map);
        s1.disconnect();
        break MISSING_BLOCK_LABEL_47;
        adrequestinfoparcel;
        s1.disconnect();
        throw adrequestinfoparcel;
    }

    private static void a(String s, Map map, String s1, int i)
    {
        if (of.a(2))
        {
            of.d((new StringBuilder("Http Response: {\n  URL:\n    ")).append(s).append("\n  Headers:").toString());
            if (map != null)
            {
                for (s = map.keySet().iterator(); s.hasNext();)
                {
                    Object obj = (String)s.next();
                    of.d((new StringBuilder("    ")).append(((String) (obj))).append(":").toString());
                    obj = ((List)map.get(obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s2 = (String)((Iterator) (obj)).next();
                        of.d((new StringBuilder("      ")).append(s2).toString());
                    }
                }

            }
            of.d("  Body:");
            if (s1 != null)
            {
                for (int j = 0; j < Math.min(s1.length(), 0x186a0); j += 1000)
                {
                    of.d(s1.substring(j, Math.min(s1.length(), j + 1000)));
                }

            } else
            {
                of.d("    null");
            }
            of.d((new StringBuilder("  Response Code:\n    ")).append(i).append("\n}").toString());
        }
    }

    private static akm b(String s, abs abs1, abr abr)
    {
        return new _cls4(abs1, abr, s);
    }

    public final AdResponseParcel a(AdRequestInfoParcel adrequestinfoparcel)
    {
        aiv.a(c, adrequestinfoparcel.k.b);
        return a(c, f, e, d, adrequestinfoparcel);
    }

    public final void a(AdRequestInfoParcel adrequestinfoparcel, nv nv)
    {
        ot.h().a(c, adrequestinfoparcel.k);
        (new _cls6(adrequestinfoparcel, nv)).e();
    }


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls6 {}

}
