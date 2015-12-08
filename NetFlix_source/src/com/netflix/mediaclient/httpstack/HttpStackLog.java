// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.httpstack;

import com.netflix.mediaclient.Log;
import org.apache.http.HttpResponse;

public class HttpStackLog
{

    private static final boolean ENABLE_LOGGING = false;
    private static String TAG = "HttpStack";

    public HttpStackLog()
    {
    }

    public static void dumpCookies(HttpResponse httpresponse)
    {
        if (!Log.isLoggable(TAG, 3));
    }

}
