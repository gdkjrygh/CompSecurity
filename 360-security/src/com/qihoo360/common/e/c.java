// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.e;

import android.content.Context;
import android.net.Proxy;
import org.apache.http.HttpHost;

// Referenced classes of package com.qihoo360.common.e:
//            b

public class c
{

    public static HttpHost a()
    {
        String s = Proxy.getDefaultHost();
        int i = Proxy.getDefaultPort();
        if (s != null && s.length() > 0)
        {
            return new HttpHost(s, i);
        } else
        {
            return null;
        }
    }

    public static HttpHost a(Context context)
    {
        if (b.b(context))
        {
            return null;
        } else
        {
            return a();
        }
    }
}
