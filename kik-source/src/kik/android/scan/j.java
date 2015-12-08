// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan;

import com.kik.g.p;
import com.kik.scan.RemoteKikCode;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import kik.a.h.i;
import kik.android.util.DeviceUtils;
import kik.android.util.bx;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package kik.android.scan:
//            d

final class j
    implements Runnable
{

    final RemoteKikCode a;
    final p b;
    final d c;

    j(d d1, RemoteKikCode remotekikcode, p p1)
    {
        c = d1;
        a = remotekikcode;
        b = p1;
        super();
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        Object obj2;
        int k;
        obj2 = null;
        obj1 = null;
        obj = (new StringBuilder("https://remote-scancode.kik.com/api/v1/codes/")).append(i.a(a.getPayloadId())).toString();
        try
        {
            obj = new URL(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((MalformedURLException) (obj)).printStackTrace();
            obj = null;
        }
        obj = (HttpURLConnection)((URL) (obj)).openConnection();
        ((HttpURLConnection) (obj)).setConnectTimeout(10000);
        ((HttpURLConnection) (obj)).setReadTimeout(10000);
        ((HttpURLConnection) (obj)).addRequestProperty("User-Agent", DeviceUtils.a("Content"));
        ((HttpURLConnection) (obj)).addRequestProperty("Content-Type", "application/json");
        obj1 = d.a(((HttpURLConnection) (obj)));
        k = ((HttpURLConnection) (obj)).getResponseCode();
        if (k != 200 && k != 201) goto _L2; else goto _L1
_L1:
        obj1 = new JSONObject(EntityUtils.toString(((org.apache.http.HttpEntity) (obj1))));
        b.a(d.a(a, ((JSONObject) (obj1))));
_L3:
        if (!b.g())
        {
            b.a(new IOException("promise unresolved at connection termination"));
        }
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
_L5:
        return;
_L2:
        b.a(new IOException((new StringBuilder("Unexpected response code: ")).append(k).toString()));
          goto _L3
        obj2;
        obj1 = obj;
        obj = obj2;
_L8:
        obj2 = obj1;
        bx.f(((Throwable) (obj)));
        obj2 = obj1;
        b.a(((Throwable) (obj)));
        if (!b.g())
        {
            b.a(new IOException("promise unresolved at connection termination"));
        }
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        ((HttpURLConnection) (obj1)).disconnect();
        return;
        Exception exception;
        exception;
        obj = obj2;
_L7:
        if (!b.g())
        {
            b.a(new IOException("promise unresolved at connection termination"));
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
