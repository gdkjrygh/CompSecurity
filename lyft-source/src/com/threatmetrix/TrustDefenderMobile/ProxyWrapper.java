// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.net.Proxy;
import java.lang.reflect.Method;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            WrapperHelper, StringUtils

class ProxyWrapper extends WrapperHelper
{

    private static final Method a = a(android/net/Proxy, "getDefaultHost", new Class[0]);
    private static final Method b = a(android/net/Proxy, "getDefaultPort", new Class[0]);
    private static final String c = StringUtils.a(com/threatmetrix/TrustDefenderMobile/ProxyWrapper);
    private String d;
    private int e;

    ProxyWrapper()
    {
        d = null;
        e = 0;
        String s = System.getProperty("http.proxyHost");
        if (s != null && !s.isEmpty())
        {
            d = s;
        }
        s = System.getProperty("http.proxyPort");
        if (s != null && !s.isEmpty())
        {
            try
            {
                e = Integer.parseInt(s);
            }
            catch (NumberFormatException numberformatexception) { }
        }
        if (d == null || e == 0)
        {
            Object obj = (Integer)a(null, b, new Object[0]);
            if (obj != null)
            {
                e = ((Integer) (obj)).intValue();
            }
            obj = (String)a(null, a, new Object[0]);
            if (obj != null)
            {
                d = ((String) (obj));
            }
        }
    }

    String a()
    {
        return d;
    }

    int b()
    {
        return e;
    }

}
