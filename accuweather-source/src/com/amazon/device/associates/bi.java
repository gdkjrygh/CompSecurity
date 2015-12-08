// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.amazon.device.associates:
//            ac, bo, ax, bp, 
//            z, aq, s

class bi extends ac
{

    private static bi b = null;
    private static String c = "s.amazon-adsystem.com/api3";
    private static String d = "/update_dev_info";
    private static String e = "/generate_did";
    private static String f = "AmazonMobileAssociates";
    private static boolean g = false;
    private static String h = null;
    private static long i;
    private static Context j;
    private static String k;
    private static boolean l = true;

    bi()
    {
    }

    private static void a(long l1)
    {
        com/amazon/device/associates/bi;
        JVM INSTR monitorenter ;
        i = l1;
        android.content.SharedPreferences.Editor editor = j.getSharedPreferences(f, 0).edit();
        editor.putLong("amzn-ad-sis-last-checkin", l1);
        editor.commit();
        com/amazon/device/associates/bi;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private static void a(String s1)
    {
        if (!s1.equals(h))
        {
            if (h != null)
            {
                if (h == "");
            }
            android.content.SharedPreferences.Editor editor = j.getSharedPreferences(f, 0).edit();
            editor.putString("amzn-ad-id", s1);
            editor.commit();
            h = s1;
        }
    }

    public static final bi d()
        throws Exception
    {
        com/amazon/device/associates/bi;
        JVM INSTR monitorenter ;
        bi bi1;
        if (b == null)
        {
            b = new bi();
        }
        j = bo.a();
        h = h();
        k = bo.b();
        f();
        bi1 = b;
        com/amazon/device/associates/bi;
        JVM INSTR monitorexit ;
        return bi1;
        Exception exception;
        exception;
        throw exception;
    }

    protected static void f()
    {
        com/amazon/device/associates/bi;
        JVM INSTR monitorenter ;
        long l1;
        l1 = System.currentTimeMillis();
        if (h == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (l1 - g() <= 0x5265c00L) goto _L2; else goto _L1
_L1:
        a(l1);
        g = true;
_L3:
        com/amazon/device/associates/bi;
        JVM INSTR monitorexit ;
        return;
_L2:
        l = false;
          goto _L3
        Exception exception;
        exception;
        throw exception;
        a(l1);
        g = false;
          goto _L3
    }

    private static long g()
    {
        com/amazon/device/associates/bi;
        JVM INSTR monitorenter ;
        long l1;
        if (i == 0L)
        {
            i = j.getSharedPreferences(f, 0).getLong("amzn-ad-sis-last-checkin", 0L);
        }
        l1 = i;
        com/amazon/device/associates/bi;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    private static String h()
    {
        return j.getSharedPreferences(f, 0).getString("amzn-ad-id", null);
    }

    protected void a()
    {
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder()).append("http://").append(c).toString());
        Object obj;
        BasicNameValuePair basicnamevaluepair;
        if (g)
        {
            stringbuilder.append(d);
        } else
        {
            stringbuilder.append(e);
        }
        obj = ax.a(j);
        new ArrayList();
        obj = ((ax) (obj)).a();
        ((ArrayList) (obj)).add(new BasicNameValuePair("appId", k));
        basicnamevaluepair = bp.a(j).a();
        if (basicnamevaluepair != null)
        {
            ((ArrayList) (obj)).add(basicnamevaluepair);
        }
        basicnamevaluepair = z.a(j).a();
        if (basicnamevaluepair != null)
        {
            ((ArrayList) (obj)).add(basicnamevaluepair);
        }
        a = new aq(stringbuilder.toString());
        a.a(((ArrayList) (obj)));
    }

    protected void b()
        throws Exception
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = l;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj;
        Object obj1;
        int i1;
        a.a(s.a);
        obj1 = (JSONObject)(new JSONTokener(a.a())).nextValue();
        i1 = ((JSONObject) (obj1)).getInt("rcode");
        obj = ((JSONObject) (obj1)).getString("msg");
        obj1 = ((JSONObject) (obj1)).getString("adId");
        if (i1 != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        a(((String) (obj1)));
        if (true) goto _L1; else goto _L3
        obj;
        throw new Exception((new StringBuilder()).append("JSON error parsing return from SIS: ").append(((JSONException) (obj)).getMessage()).toString());
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L3:
        throw new Exception((new StringBuilder()).append("SIS failed registering device -- code: ").append(i1).append("--Message ").append(((String) (obj))).toString());
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        throw new Exception("Could not make a Service call. Could not encode input parameters");
    }

    protected String c()
    {
        return "SISCall";
    }

}
