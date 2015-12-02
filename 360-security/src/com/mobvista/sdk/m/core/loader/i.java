// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.loader;

import android.util.Log;
import android.webkit.URLUtil;
import com.mobvista.sdk.m.a.f.b;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;

// Referenced classes of package com.mobvista.sdk.m.core.loader:
//            j

public class i
{

    private static final String a = com/mobvista/sdk/m/core/loader/i.getSimpleName();

    public i()
    {
    }

    private static String a(InputStream inputstream, boolean flag)
    {
        Object obj;
        Object obj1;
        Object obj3;
        Object obj4;
        StringBuilder stringbuilder;
        obj4 = null;
        obj3 = null;
        stringbuilder = new StringBuilder();
        obj1 = inputstream;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        obj = obj4;
        obj1 = new GZIPInputStream(inputstream);
        obj = obj4;
        inputstream = new BufferedReader(new InputStreamReader(((InputStream) (obj1))));
_L3:
        obj = inputstream.readLine();
        if (obj == null) goto _L2; else goto _L1
_L1:
        stringbuilder.append(((String) (obj)));
          goto _L3
        Object obj2;
        obj2;
_L7:
        obj = inputstream;
        Log.e(a, Log.getStackTraceString(((Throwable) (obj2))));
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                Log.e(a, Log.getStackTraceString(inputstream));
            }
        }
        Log.i(a, (new StringBuilder("\u7F51\u9875\u5185\u5BB9\uFF1A...\n")).append(stringbuilder.toString()).toString());
        return stringbuilder.toString();
_L2:
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.e(a, Log.getStackTraceString(inputstream));
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        inputstream;
_L5:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e(a, Log.getStackTraceString(((Throwable) (obj))));
            }
        }
        throw inputstream;
        obj2;
        obj = inputstream;
        inputstream = ((InputStream) (obj2));
        if (true) goto _L5; else goto _L4
_L4:
        obj2;
        inputstream = obj3;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final j a(String s)
    {
        Object obj;
        char c;
        c = '\310';
        obj = null;
        if (!URLUtil.isNetworkUrl(s))
        {
            return null;
        }
        s = s.replace(" ", "%20");
        j j1;
        int k;
        boolean flag;
        if (URLUtil.isHttpsUrl(s))
        {
            Log.e(a, s);
        } else
        {
            Log.d(a, s);
        }
        j1 = new j();
        s = (HttpURLConnection)(new URL(s)).openConnection();
        s.setRequestMethod("GET");
        s.setRequestProperty("User-Agent", b.d());
        s.setRequestProperty("Accept-Encoding", "gzip");
        s.setConnectTimeout(15000);
        s.setReadTimeout(15000);
        s.setInstanceFollowRedirects(false);
        Log.i(a, (new StringBuilder("request header:\n")).append(s.getRequestProperties()).toString());
        s.connect();
        j1.a = s.getHeaderField("Location");
        j1.d = s.getHeaderField("Referer");
        j1.f = s.getResponseCode();
        j1.b = s.getContentType();
        j1.e = s.getContentLength();
        j1.c = s.getContentEncoding();
        Log.e(a, j1.toString());
        flag = "gzip".equalsIgnoreCase(j1.c);
        if (j1.f != 200 || j1.e <= 0)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        k = j1.e;
        if (!flag)
        {
            c = '\u012C';
        }
        if (k >= c)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        j1.g = a(s.getInputStream(), flag).trim();
        if (s != null)
        {
            s.disconnect();
        }
        return j1;
        obj;
        s = null;
_L4:
        Log.e(a, Log.getStackTraceString(((Throwable) (obj))));
        if (s != null)
        {
            s.disconnect();
        }
        return null;
        s;
_L2:
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw s;
        Exception exception;
        exception;
        obj = s;
        s = exception;
        continue; /* Loop/switch isn't completed */
        exception;
        obj = s;
        s = exception;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

}
