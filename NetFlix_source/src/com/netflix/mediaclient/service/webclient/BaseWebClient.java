// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient;

import com.netflix.mediaclient.Log;
import java.util.Locale;

public abstract class BaseWebClient
{

    private static String TAG = "BaseWebClient";

    public BaseWebClient()
    {
    }

    public static int getFBConnectStatusCode(String s)
    {
        if (!s.contains("202") && !s.contains("200"))
        {
            if (s.contains("400"))
            {
                return -50;
            }
            if (s.contains("401"))
            {
                return -51;
            }
            if (s.contains("403") || s.contains("405"))
            {
                return -52;
            }
            if (s.contains("406"))
            {
                return -53;
            }
            if (s.contains("500"))
            {
                return -54;
            }
            if (s.contains("503"))
            {
                return -55;
            }
        }
        return 0;
    }

    public static int getStatusCodeFromError(Throwable throwable)
    {
        byte byte0;
        byte0 = -60;
        Log.w(TAG, "Received Error", throwable);
        throwable = throwable.getMessage();
        if (throwable == null)
        {
            return -60;
        }
        throwable = throwable.toLowerCase(Locale.US);
        Log.d(TAG, (new StringBuilder()).append(".next call failed with error =").append(throwable).toString());
        if (!throwable.contains("map error")) goto _L2; else goto _L1
_L1:
        byte0 = -65;
_L4:
        return byte0;
_L2:
        if (throwable.contains("not authorized"))
        {
            byte0 = -61;
        } else
        if (throwable.contains("path error"))
        {
            byte0 = -60;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
