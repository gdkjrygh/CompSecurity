// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            gg, gs, gj

public final class gq extends gg
{

    private final Context mContext;
    private final String mv;
    private final String uR;
    private String vW;

    public gq(Context context, String s, String s1)
    {
        vW = null;
        mContext = context;
        mv = s;
        uR = s1;
    }

    public gq(Context context, String s, String s1, String s2)
    {
        vW = null;
        mContext = context;
        mv = s;
        uR = s1;
        vW = s2;
    }

    public void co()
    {
        HttpURLConnection httpurlconnection;
        gs.V((new StringBuilder()).append("Pinging URL: ").append(uR).toString());
        httpurlconnection = (HttpURLConnection)(new URL(uR)).openConnection();
        if (vW != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        gj.a(mContext, mv, true, httpurlconnection);
_L1:
        int i = httpurlconnection.getResponseCode();
        if (i >= 200 && i < 300)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        gs.W((new StringBuilder()).append("Received non-success response code ").append(i).append(" from pinging URL: ").append(uR).toString());
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            gs.W((new StringBuilder()).append("Error while parsing ping URL: ").append(uR).append(". ").append(indexoutofboundsexception.getMessage()).toString());
            return;
        }
        catch (IOException ioexception)
        {
            gs.W((new StringBuilder()).append("Error while pinging URL: ").append(uR).append(". ").append(ioexception.getMessage()).toString());
        }
        break MISSING_BLOCK_LABEL_225;
        gj.a(mContext, mv, true, httpurlconnection, vW);
          goto _L1
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }

    public void onStop()
    {
    }
}
