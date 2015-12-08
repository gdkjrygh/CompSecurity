// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            cg, cn, ci

public final class cl extends cg
{

    private final String hM;
    private final String hN;
    private final Context mContext;

    public cl(Context context, String s, String s1)
    {
        mContext = context;
        hM = s;
        hN = s1;
    }

    public void ac()
    {
        HttpURLConnection httpurlconnection;
        cn.p((new StringBuilder()).append("Pinging URL: ").append(hN).toString());
        httpurlconnection = (HttpURLConnection)(new URL(hN)).openConnection();
        int i;
        ci.a(mContext, hM, true, httpurlconnection);
        i = httpurlconnection.getResponseCode();
        if (i >= 200 && i < 300)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        cn.q((new StringBuilder()).append("Received non-success response code ").append(i).append(" from pinging URL: ").append(hN).toString());
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IOException ioexception)
        {
            cn.q((new StringBuilder()).append("Error while pinging URL: ").append(hN).append(". ").append(ioexception.getMessage()).toString());
        }
        break MISSING_BLOCK_LABEL_159;
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }

    public void onStop()
    {
    }
}
