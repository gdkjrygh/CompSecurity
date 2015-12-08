// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class kxq extends kwr
{

    private final String a;
    private final Context b;
    private final String e;
    private String f;

    public kxq(Context context, String s, String s1)
    {
        f = null;
        b = context;
        a = s;
        e = s1;
    }

    public kxq(Context context, String s, String s1, String s2)
    {
        f = null;
        b = context;
        a = s;
        e = s1;
        f = s2;
    }

    public final void a()
    {
        HttpURLConnection httpurlconnection;
        (new StringBuilder("Pinging URL: ")).append(e).toString();
        b.p(2);
        httpurlconnection = (HttpURLConnection)(new URL(e)).openConnection();
        if (!TextUtils.isEmpty(f))
        {
            break MISSING_BLOCK_LABEL_124;
        }
        jqc.c().a(b, a, true, httpurlconnection);
_L1:
        int i = httpurlconnection.getResponseCode();
        if (i >= 200 && i < 300)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        b.m((new StringBuilder("Received non-success response code ")).append(i).append(" from pinging URL: ").append(e).toString());
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            b.m((new StringBuilder("Error while parsing ping URL: ")).append(e).append(". ").append(indexoutofboundsexception.getMessage()).toString());
            return;
        }
        catch (IOException ioexception)
        {
            b.m((new StringBuilder("Error while pinging URL: ")).append(e).append(". ").append(ioexception.getMessage()).toString());
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            b.m((new StringBuilder("Error while pinging URL: ")).append(e).append(". ").append(runtimeexception.getMessage()).toString());
        }
        break MISSING_BLOCK_LABEL_254;
        jqc.c();
        kwz.a(true, httpurlconnection, f);
          goto _L1
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }
}
