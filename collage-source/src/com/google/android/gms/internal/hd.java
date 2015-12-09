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
//            gs, gw

public final class hd extends gs
{

    private final String a;
    private final Context b;
    private final String c;
    private String d;

    public hd(Context context, String s, String s1)
    {
        d = null;
        b = context;
        a = s;
        c = s1;
    }

    public hd(Context context, String s, String s1, String s2)
    {
        d = null;
        b = context;
        a = s;
        c = s1;
        d = s2;
    }

    public void onStop()
    {
    }

    public void zzdG()
    {
        HttpURLConnection httpurlconnection;
        zzb.v((new StringBuilder()).append("Pinging URL: ").append(c).toString());
        httpurlconnection = (HttpURLConnection)(new URL(c)).openConnection();
        if (!TextUtils.isEmpty(d))
        {
            break MISSING_BLOCK_LABEL_127;
        }
        zzp.zzbx().a(b, a, true, httpurlconnection);
_L1:
        int i = httpurlconnection.getResponseCode();
        if (i >= 200 && i < 300)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        zzb.zzaE((new StringBuilder()).append("Received non-success response code ").append(i).append(" from pinging URL: ").append(c).toString());
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            zzb.zzaE((new StringBuilder()).append("Error while parsing ping URL: ").append(c).append(". ").append(indexoutofboundsexception.getMessage()).toString());
            return;
        }
        catch (IOException ioexception)
        {
            zzb.zzaE((new StringBuilder()).append("Error while pinging URL: ").append(c).append(". ").append(ioexception.getMessage()).toString());
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            zzb.zzaE((new StringBuilder()).append("Error while pinging URL: ").append(c).append(". ").append(runtimeexception.getMessage()).toString());
        }
        break MISSING_BLOCK_LABEL_273;
        zzp.zzbx().a(b, a, true, httpurlconnection, d);
          goto _L1
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }
}
