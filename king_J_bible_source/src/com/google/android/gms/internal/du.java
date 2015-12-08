// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            do, dw, dq

public final class du extends do
{

    private final String lh;
    private final Context mContext;
    private final String ro;

    public du(Context context, String s, String s1)
    {
        mContext = context;
        lh = s;
        ro = s1;
    }

    public void aY()
    {
        HttpURLConnection httpurlconnection;
        dw.y((new StringBuilder()).append("Pinging URL: ").append(ro).toString());
        httpurlconnection = (HttpURLConnection)(new URL(ro)).openConnection();
        int i;
        dq.a(mContext, lh, true, httpurlconnection);
        i = httpurlconnection.getResponseCode();
        if (i >= 200 && i < 300)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        dw.z((new StringBuilder()).append("Received non-success response code ").append(i).append(" from pinging URL: ").append(ro).toString());
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            dw.z((new StringBuilder()).append("Error while parsing ping URL: ").append(ro).append(". ").append(indexoutofboundsexception.getMessage()).toString());
            return;
        }
        catch (IOException ioexception)
        {
            dw.z((new StringBuilder()).append("Error while pinging URL: ").append(ro).append(". ").append(ioexception.getMessage()).toString());
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
