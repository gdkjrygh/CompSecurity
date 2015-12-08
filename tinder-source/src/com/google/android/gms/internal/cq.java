// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.util.client.b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            ch, cl

public final class cq extends ch
{

    private final String a;
    private final Context b;
    private final String d;
    private String e;

    public cq(Context context, String s, String s1)
    {
        e = null;
        b = context;
        a = s;
        d = s1;
    }

    public cq(Context context, String s, String s1, String s2)
    {
        e = null;
        b = context;
        a = s;
        d = s1;
        e = s2;
    }

    public final void a()
    {
        HttpURLConnection httpurlconnection;
        com.google.android.gms.ads.internal.util.client.b.d((new StringBuilder("Pinging URL: ")).append(d).toString());
        httpurlconnection = (HttpURLConnection)(new URL(d)).openConnection();
        if (!TextUtils.isEmpty(e))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        com.google.android.gms.ads.internal.d.c().a(b, a, true, httpurlconnection);
_L1:
        int i = httpurlconnection.getResponseCode();
        if (i >= 200 && i < 300)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        com.google.android.gms.ads.internal.util.client.b.e((new StringBuilder("Received non-success response code ")).append(i).append(" from pinging URL: ").append(d).toString());
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            com.google.android.gms.ads.internal.util.client.b.e((new StringBuilder("Error while parsing ping URL: ")).append(d).append(". ").append(indexoutofboundsexception.getMessage()).toString());
            return;
        }
        catch (IOException ioexception)
        {
            com.google.android.gms.ads.internal.util.client.b.e((new StringBuilder("Error while pinging URL: ")).append(d).append(". ").append(ioexception.getMessage()).toString());
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            com.google.android.gms.ads.internal.util.client.b.e((new StringBuilder("Error while pinging URL: ")).append(d).append(". ").append(runtimeexception.getMessage()).toString());
        }
        break MISSING_BLOCK_LABEL_250;
        com.google.android.gms.ads.internal.d.c();
        cl.a(httpurlconnection, e);
          goto _L1
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }
}
