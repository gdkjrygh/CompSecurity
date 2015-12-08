// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.b;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

public abstract class g
{

    public g()
    {
    }

    public boolean S_()
    {
        return true;
    }

    public final Object a(HttpURLConnection httpurlconnection)
        throws Throwable, ServerCommunicationException
    {
        String s = httpurlconnection.getContentType();
        if (httpurlconnection.getResponseCode() < 400) goto _L2; else goto _L1
_L1:
        httpurlconnection = httpurlconnection.getErrorStream();
_L4:
        return b(httpurlconnection, s);
_L2:
        try
        {
            httpurlconnection = httpurlconnection.getInputStream();
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            throw new ServerCommunicationException("Connection Error", httpurlconnection);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public abstract Object b(InputStream inputstream, String s)
        throws Throwable, ServerCommunicationException;
}
