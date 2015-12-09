// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

class aqk
{

    private static String a = aqk.getSimpleName();
    private static volatile apt b;

    aqk()
    {
    }

    static InputStream a(Context context, HttpURLConnection httpurlconnection)
    {
        InputStream inputstream = null;
        if (httpurlconnection.getResponseCode() == 200)
        {
            URL url = httpurlconnection.getURL();
            InputStream inputstream1 = httpurlconnection.getInputStream();
            inputstream = inputstream1;
            try
            {
                if (a(url.toURI()))
                {
                    inputstream = b(context).a(url.toString(), new aql(inputstream1, httpurlconnection));
                }
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return inputstream1;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return inputstream1;
            }
        }
        return inputstream;
    }

    static InputStream a(URI uri, Context context)
    {
        Object obj = null;
        InputStream inputstream = obj;
        if (uri != null)
        {
            inputstream = obj;
            if (a(uri))
            {
                try
                {
                    inputstream = b(context).a(uri.toString(), null);
                }
                // Misplaced declaration of an exception variable
                catch (URI uri)
                {
                    context = LoggingBehavior.d;
                    uri.toString();
                    arb.c();
                    return null;
                }
            }
        }
        return inputstream;
    }

    static void a(Context context)
    {
        LoggingBehavior loggingbehavior;
        try
        {
            b(context).a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            loggingbehavior = LoggingBehavior.d;
        }
        (new StringBuilder("clearCache failed ")).append(context.getMessage());
        arb.c();
    }

    private static boolean a(URI uri)
    {
        if (uri != null)
        {
            for (uri = uri.getHost(); uri.endsWith("fbcdn.net") || uri.startsWith("fbcdn") && uri.endsWith("akamaihd.net");)
            {
                return true;
            }

        }
        return false;
    }

    private static apt b(Context context)
    {
        aqk;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new apt(context.getApplicationContext(), a, new apx());
        }
        context = b;
        aqk;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

}
