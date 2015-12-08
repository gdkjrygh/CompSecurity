// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.extensions.android.http;

import com.google.api.client.extensions.android.AndroidUtils;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.apache.ApacheHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

public class AndroidHttp
{

    private AndroidHttp()
    {
    }

    public static HttpTransport newCompatibleTransport()
    {
        if (AndroidUtils.isMinimumSdkLevel(9))
        {
            return new NetHttpTransport();
        } else
        {
            return new ApacheHttpTransport();
        }
    }
}
