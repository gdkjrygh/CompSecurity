// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan;

import com.kik.g.p;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import kik.a.d.aa;
import kik.android.util.DeviceUtils;
import kik.android.util.bx;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package kik.android.scan:
//            d

final class i
    implements Runnable
{

    final aa a;
    final int b;
    final p c;
    final d d;

    i(d d1, aa aa, int j, p p1)
    {
        d = d1;
        a = aa;
        b = j;
        c = p1;
        super();
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        Object obj2;
        int j;
        obj2 = null;
        obj1 = null;
        JSONObject jsonobject = kik.android.scan.d.b(a, b);
        try
        {
            obj = new URL("https://remote-scancode.kik.com/api/v1/codes");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bx.a(((Throwable) (obj)));
            obj = null;
        }
        obj = (HttpURLConnection)((URL) (obj)).openConnection();
        ((HttpURLConnection) (obj)).setDoOutput(true);
        ((HttpURLConnection) (obj)).setRequestMethod("POST");
        ((HttpURLConnection) (obj)).setConnectTimeout(10000);
        ((HttpURLConnection) (obj)).setReadTimeout(10000);
        ((HttpURLConnection) (obj)).addRequestProperty("User-Agent", DeviceUtils.a("Content"));
        ((HttpURLConnection) (obj)).addRequestProperty("Content-Type", "application/json");
        obj1 = new OutputStreamWriter(((HttpURLConnection) (obj)).getOutputStream());
        ((OutputStreamWriter) (obj1)).write(jsonobject.toString());
        ((OutputStreamWriter) (obj1)).flush();
        obj1 = kik.android.scan.d.a(((HttpURLConnection) (obj)));
        j = ((HttpURLConnection) (obj)).getResponseCode();
        if (j != 200 && j != 201) goto _L2; else goto _L1
_L1:
        obj1 = (new JSONObject(EntityUtils.toString(((org.apache.http.HttpEntity) (obj1))))).getString("id");
        c.a(kik.a.h.i.a(((String) (obj1))));
_L3:
        if (!c.g())
        {
            c.a(new IOException("promise unresolved at connection termination"));
        }
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
_L5:
        return;
_L2:
        c.a(new IOException((new StringBuilder("Unexpected response code: ")).append(j).toString()));
          goto _L3
        obj2;
        obj1 = obj;
        obj = obj2;
_L8:
        obj2 = obj1;
        bx.f(((Throwable) (obj)));
        obj2 = obj1;
        c.a(((Throwable) (obj)));
        if (!c.g())
        {
            c.a(new IOException("promise unresolved at connection termination"));
        }
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        ((HttpURLConnection) (obj1)).disconnect();
        return;
        Exception exception;
        exception;
        obj = obj2;
_L7:
        if (!c.g())
        {
            c.a(new IOException("promise unresolved at connection termination"));
        }
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw exception;
        exception;
        if (true) goto _L7; else goto _L6
_L6:
        obj;
          goto _L8
        JSONException jsonexception;
        jsonexception;
        exception = ((Exception) (obj));
        obj = jsonexception;
          goto _L8
        obj;
          goto _L8
    }
}
