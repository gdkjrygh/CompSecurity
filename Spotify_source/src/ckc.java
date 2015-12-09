// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class ckc extends cjc
{

    private final String a;
    private final Context b;
    private final String c;
    private String d;

    public ckc(Context context, String s, String s1)
    {
        d = null;
        b = context;
        a = s;
        c = s1;
    }

    public ckc(Context context, String s, String s1, String s2)
    {
        d = null;
        b = context;
        a = s;
        c = s1;
        d = s2;
    }

    public final void a()
    {
        HttpURLConnection httpurlconnection;
        bka.d((new StringBuilder("Pinging URL: ")).append(c).toString());
        httpurlconnection = (HttpURLConnection)(new URL(c)).openConnection();
        if (!TextUtils.isEmpty(d))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        bkv.e().a(b, a, true, httpurlconnection);
_L1:
        int i = httpurlconnection.getResponseCode();
        if (i >= 200 && i < 300)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        bka.e((new StringBuilder("Received non-success response code ")).append(i).append(" from pinging URL: ").append(c).toString());
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            bka.e((new StringBuilder("Error while parsing ping URL: ")).append(c).append(". ").append(indexoutofboundsexception.getMessage()).toString());
            return;
        }
        catch (IOException ioexception)
        {
            bka.e((new StringBuilder("Error while pinging URL: ")).append(c).append(". ").append(ioexception.getMessage()).toString());
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            bka.e((new StringBuilder("Error while pinging URL: ")).append(c).append(". ").append(runtimeexception.getMessage()).toString());
        }
        break MISSING_BLOCK_LABEL_250;
        bkv.e();
        cjj.a(httpurlconnection, d);
          goto _L1
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }

    public final void b()
    {
    }
}
