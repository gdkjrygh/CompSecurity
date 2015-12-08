// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            gf, gr, gi

public final class gp extends gf
{

    private final Context mContext;
    private final String mG;
    private final String vf;
    private String wl;

    public gp(Context context, String s, String s1)
    {
        wl = null;
        mContext = context;
        mG = s;
        vf = s1;
    }

    public gp(Context context, String s, String s1, String s2)
    {
        wl = null;
        mContext = context;
        mG = s;
        vf = s1;
        wl = s2;
    }

    public void cx()
    {
        HttpURLConnection httpurlconnection;
        gr.V((new StringBuilder()).append("Pinging URL: ").append(vf).toString());
        httpurlconnection = (HttpURLConnection)(new URL(vf)).openConnection();
        if (wl != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        gi.a(mContext, mG, true, httpurlconnection);
_L1:
        int i = httpurlconnection.getResponseCode();
        if (i >= 200 && i < 300)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        gr.W((new StringBuilder()).append("Received non-success response code ").append(i).append(" from pinging URL: ").append(vf).toString());
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            gr.W((new StringBuilder()).append("Error while parsing ping URL: ").append(vf).append(". ").append(indexoutofboundsexception.getMessage()).toString());
            return;
        }
        catch (IOException ioexception)
        {
            gr.W((new StringBuilder()).append("Error while pinging URL: ").append(vf).append(". ").append(ioexception.getMessage()).toString());
        }
        break MISSING_BLOCK_LABEL_225;
        gi.a(mContext, mG, true, httpurlconnection, wl);
          goto _L1
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }

    public void onStop()
    {
    }
}
