// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            en, ev, ep

public final class et extends en
{

    private final String lp;
    private final Context mContext;
    private final String qV;

    public et(Context context, String s, String s1)
    {
        mContext = context;
        lp = s;
        qV = s1;
    }

    public void bc()
    {
        HttpURLConnection httpurlconnection;
        ev.C((new StringBuilder()).append("Pinging URL: ").append(qV).toString());
        httpurlconnection = (HttpURLConnection)(new URL(qV)).openConnection();
        int i;
        ep.a(mContext, lp, true, httpurlconnection);
        i = httpurlconnection.getResponseCode();
        if (i >= 200 && i < 300)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        ev.D((new StringBuilder()).append("Received non-success response code ").append(i).append(" from pinging URL: ").append(qV).toString());
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            ev.D((new StringBuilder()).append("Error while parsing ping URL: ").append(qV).append(". ").append(indexoutofboundsexception.getMessage()).toString());
            return;
        }
        catch (IOException ioexception)
        {
            ev.D((new StringBuilder()).append("Error while pinging URL: ").append(qV).append(". ").append(ioexception.getMessage()).toString());
        }
        break MISSING_BLOCK_LABEL_198;
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }

    public void onStop()
    {
    }
}
