// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            zzfh, zzfl

public final class zzfp extends zzfh
{

    private final Context mContext;
    private final String zzAX;
    private String zzBW;
    private final String zzoc;

    public zzfp(Context context, String s, String s1)
    {
        zzBW = null;
        mContext = context;
        zzoc = s;
        zzAX = s1;
    }

    public zzfp(Context context, String s, String s1, String s2)
    {
        zzBW = null;
        mContext = context;
        zzoc = s;
        zzAX = s1;
        zzBW = s2;
    }

    public void onStop()
    {
    }

    public void zzcX()
    {
        HttpURLConnection httpurlconnection;
        zzb.zzam((new StringBuilder()).append("Pinging URL: ").append(zzAX).toString());
        httpurlconnection = (HttpURLConnection)(new URL(zzAX)).openConnection();
        if (!TextUtils.isEmpty(zzBW))
        {
            break MISSING_BLOCK_LABEL_127;
        }
        zzh.zzaQ().zza(mContext, zzoc, true, httpurlconnection);
_L1:
        int i = httpurlconnection.getResponseCode();
        if (i >= 200 && i < 300)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        zzb.zzan((new StringBuilder()).append("Received non-success response code ").append(i).append(" from pinging URL: ").append(zzAX).toString());
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            zzb.zzan((new StringBuilder()).append("Error while parsing ping URL: ").append(zzAX).append(". ").append(indexoutofboundsexception.getMessage()).toString());
            return;
        }
        catch (IOException ioexception)
        {
            zzb.zzan((new StringBuilder()).append("Error while pinging URL: ").append(zzAX).append(". ").append(ioexception.getMessage()).toString());
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            zzb.zzan((new StringBuilder()).append("Error while pinging URL: ").append(zzAX).append(". ").append(runtimeexception.getMessage()).toString());
        }
        break MISSING_BLOCK_LABEL_273;
        zzh.zzaQ().zza(mContext, zzoc, true, httpurlconnection, zzBW);
          goto _L1
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }
}
