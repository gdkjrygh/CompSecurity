// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.os.ConditionVariable;
import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            a, g

public final class c
    implements Runnable
{

    private List a;
    private URL b;
    private long c;
    private ConditionVariable d;
    private g e;
    private ConditionVariable f;
    private volatile boolean g;
    private final Object h;
    private int i;

    private long a()
    {
        long l1 = 0L;
        long l2 = i;
        long l3 = System.currentTimeMillis() - c;
        long l = l2;
        if (l3 > 0L)
        {
            l2 -= l3;
            l = l2;
            if (l2 < 0L)
            {
                l = l1;
            }
        }
        int j = i;
        return l;
    }

    private static boolean a(HttpURLConnection httpurlconnection, JSONObject jsonobject)
    {
        boolean flag = false;
        int j;
        try
        {
            httpurlconnection.getOutputStream().write(jsonobject.toString().getBytes("UTF8"));
            j = httpurlconnection.getResponseCode();
            httpurlconnection.disconnect();
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            return false;
        }
        if (j == 202)
        {
            flag = true;
        }
        return flag;
    }

    private HttpURLConnection b()
    {
        HttpURLConnection httpurlconnection = (HttpURLConnection)b.openConnection();
        httpurlconnection.setConnectTimeout(2500);
        httpurlconnection.setRequestProperty("User-Agent", "3.1.4");
        httpurlconnection.setRequestProperty("Content-Type", "application/json");
        httpurlconnection.setDoOutput(true);
        httpurlconnection.setRequestMethod("POST");
        return httpurlconnection;
        IOException ioexception;
        ioexception;
        httpurlconnection = null;
_L2:
        Log.e("Crittercism", (new StringBuilder("Failed to instantiate URLConnection to APM server: ")).append(ioexception.getMessage()).toString());
        return httpurlconnection;
        ioexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void run()
    {
_L2:
        boolean flag;
        if (g)
        {
            break; /* Loop/switch isn't completed */
        }
        f.block();
        d.block();
        flag = g;
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            if (a() > 0L)
            {
                Thread.sleep(a());
            }
        }
        catch (InterruptedException interruptedexception) { }
        c = System.currentTimeMillis();
        obj = b();
        if (obj == null)
        {
            List list;
            try
            {
                g = true;
                Log.e("Crittercism", "Disabling APM due to failure instantiating connection");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("Crittercism", (new StringBuilder("Exited APM send task due to: \n")).append(obj).toString());
            }
            break MISSING_BLOCK_LABEL_160;
        }
        synchronized (h)
        {
            list = a;
            a = new LinkedList();
            d.close();
        }
        obj1 = crittercism.android.a.a(e, list);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        g = true;
        Log.e("Crittercism", "Disabling APM due to failure building request");
        return;
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        a(((HttpURLConnection) (obj)), ((a) (obj1)).a);
        if (true) goto _L2; else goto _L1
_L1:
    }
}
