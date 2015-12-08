// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            pj, qa

public final class rb extends pj
{

    private final String a;
    private final Context b;
    private final String c;
    private String d;

    public rb(Context context, String s, String s1)
    {
        d = null;
        b = context;
        a = s;
        c = s1;
    }

    public rb(Context context, String s, String s1, String s2)
    {
        d = null;
        b = context;
        a = s;
        c = s1;
        d = s2;
    }

    public final void onStop()
    {
    }

    public final void zzbn()
    {
        HttpURLConnection httpurlconnection;
        zzb.v((new StringBuilder("Pinging URL: ")).append(c).toString());
        httpurlconnection = (HttpURLConnection)(new URL(c)).openConnection();
        if (!TextUtils.isEmpty(d))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        zzp.zzbv().a(b, a, true, httpurlconnection);
_L1:
        int i = httpurlconnection.getResponseCode();
        if (i >= 200 && i < 300)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        zzb.zzaH((new StringBuilder("Received non-success response code ")).append(i).append(" from pinging URL: ").append(c).toString());
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            zzb.zzaH((new StringBuilder("Error while parsing ping URL: ")).append(c).append(". ").append(indexoutofboundsexception.getMessage()).toString());
            return;
        }
        catch (IOException ioexception)
        {
            zzb.zzaH((new StringBuilder("Error while pinging URL: ")).append(c).append(". ").append(ioexception.getMessage()).toString());
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            zzb.zzaH((new StringBuilder("Error while pinging URL: ")).append(c).append(". ").append(runtimeexception.getMessage()).toString());
        }
        break MISSING_BLOCK_LABEL_250;
        zzp.zzbv();
        qa.a(httpurlconnection, d);
          goto _L1
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }
}
