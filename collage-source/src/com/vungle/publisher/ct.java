// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import android.text.TextUtils;
import com.vungle.log.Logger;
import com.vungle.publisher.async.ScheduledPriorityExecutor;
import com.vungle.publisher.net.http.HttpResponse;
import com.vungle.publisher.net.http.HttpTransaction;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;

public abstract class ct
{

    private static final Pattern a = Pattern.compile("\\bcharset=([\\w\\-]+)\\b");
    public ScheduledPriorityExecutor f;
    public com.vungle.publisher.db.model.LoggedException.Factory g;

    public ct()
    {
    }

    public static boolean a(int i)
    {
        return i == 200;
    }

    public final String a(HttpURLConnection httpurlconnection)
        throws IOException
    {
        Object obj2;
        int i;
        obj2 = null;
        i = 1;
        Object obj;
        int j;
        j = httpurlconnection.getResponseCode();
        obj = httpurlconnection.getContentType();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        obj = a.matcher(((CharSequence) (obj)));
        if (!((Matcher) (obj)).find())
        {
            break MISSING_BLOCK_LABEL_294;
        }
        obj = ((Matcher) (obj)).group(1);
_L8:
        Logger.v("VungleNetwork", (new StringBuilder("response character set: ")).append(((String) (obj))).toString());
        Object obj1;
        String s;
        char ac[];
        if (j / 100 > 3)
        {
            i = 0;
        }
        if (i == 0) goto _L2; else goto _L1
_L1:
        obj1 = httpurlconnection.getInputStream();
_L6:
        s = ((String) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            s = "ISO-8859-1";
        }
        obj1 = new InputStreamReader(((java.io.InputStream) (obj1)), s);
        obj = new StringBuilder();
        ac = new char[8192];
_L5:
        i = ((Reader) (obj1)).read(ac);
        if (i <= 0) goto _L4; else goto _L3
_L3:
        ((StringBuilder) (obj)).append(ac, 0, i);
          goto _L5
        obj;
_L7:
        if (obj1 != null)
        {
            try
            {
                ((Reader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                g.b("VungleNetwork", (new StringBuilder("error closing input stream ")).append(httpurlconnection.getURL()).toString(), ((Throwable) (obj1)));
            }
        }
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        throw obj;
_L2:
        obj1 = httpurlconnection.getErrorStream();
          goto _L6
_L4:
        obj = ((StringBuilder) (obj)).toString();
        Logger.d("VungleNetwork", (new StringBuilder("response body: ")).append(((String) (obj))).toString());
        try
        {
            ((Reader) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            g.b("VungleNetwork", (new StringBuilder("error closing input stream ")).append(httpurlconnection.getURL()).toString(), ((Throwable) (obj1)));
        }
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        return ((String) (obj));
        obj;
        obj1 = obj2;
          goto _L7
        obj = null;
          goto _L8
    }

    public void a(HttpTransaction httptransaction, HttpResponse httpresponse)
        throws IOException, JSONException
    {
    }

    public void a(HttpTransaction httptransaction, HttpResponse httpresponse, Exception exception)
    {
        g.a("VungleNetwork", (new StringBuilder("error while handling response: ")).append(httpresponse).toString(), exception);
        b(httptransaction, httpresponse);
    }

    public void b(HttpTransaction httptransaction, HttpResponse httpresponse)
    {
        Logger.w("VungleNetwork", (new StringBuilder()).append(httptransaction.a).append(" failed permanently with response code ").append(httpresponse.b).toString());
    }

    public void c(HttpTransaction httptransaction, HttpResponse httpresponse)
    {
        SocketTimeoutException sockettimeoutexception;
        boolean flag;
        try
        {
            flag = a(httpresponse.b);
        }
        catch (Exception exception)
        {
            a(httptransaction, httpresponse, exception);
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        a(httptransaction, httpresponse);
        return;
        sockettimeoutexception;
        Logger.d("VungleNetwork", sockettimeoutexception);
        httpresponse.b = 603;
_L1:
        d(httptransaction, httpresponse);
        return;
        Object obj;
        obj;
        g.b("VungleNetwork", (new StringBuilder("IOException while handling response: ")).append(httpresponse).toString(), ((Throwable) (obj)));
        httpresponse.b = 600;
          goto _L1
        obj;
        g.b("VungleNetwork", (new StringBuilder("JSONException while handling response: ")).append(httpresponse).toString(), ((Throwable) (obj)));
        httpresponse.b = 604;
          goto _L1
    }

    public void d(HttpTransaction httptransaction, HttpResponse httpresponse)
    {
        b(httptransaction, httpresponse);
    }

}
