// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.util.ByteArrayBuffer;

public class p
{

    public static String a(String s)
    {
        s = (HttpURLConnection)(new URL(s)).openConnection();
        s.setConnectTimeout(10000);
        s.connect();
        s = new BufferedInputStream(s.getInputStream());
        ByteArrayBuffer bytearraybuffer = new ByteArrayBuffer(1024);
        do
        {
            int i = s.read();
            if (i != -1)
            {
                bytearraybuffer.append((byte)i);
            } else
            {
                return (new String(bytearraybuffer.toByteArray())).trim();
            }
        } while (true);
    }

    public static boolean a(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null)
        {
            return false;
        }
        try
        {
            context = context.getNetworkInfo(1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        if (context == null)
        {
            return false;
        }
        context = context.getState();
        return context == android.net.NetworkInfo.State.CONNECTED || context == android.net.NetworkInfo.State.CONNECTING;
    }
}
