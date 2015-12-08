// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import com.squareup.okhttp.OkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class ConfigureProxyJob
    implements Job
{

    private String ip;
    ILyftPreferences lyftPreferences;
    OkHttpClient okHttpClient;

    public ConfigureProxyJob(String s)
    {
        ip = s;
    }

    public void execute()
    {
        if (Strings.isNullOrEmpty(ip))
        {
            okHttpClient.setProxy(Proxy.NO_PROXY);
            lyftPreferences.setProxyEnabled(Boolean.valueOf(false));
            return;
        } else
        {
            okHttpClient.setProxy(new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(ip, 8888)));
            lyftPreferences.setProxyEnabled(Boolean.valueOf(true));
            lyftPreferences.setProxyIpAddress(ip);
            return;
        }
    }
}
