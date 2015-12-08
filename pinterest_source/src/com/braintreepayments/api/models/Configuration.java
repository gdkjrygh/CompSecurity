// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.text.TextUtils;
import com.google.gson.Gson;

// Referenced classes of package com.braintreepayments.api.models:
//            AndroidPayConfiguration, AnalyticsConfiguration, PayPalConfiguration

public class Configuration
{

    private String a;
    private String b[];
    private boolean c;
    private PayPalConfiguration d;
    private AndroidPayConfiguration e;
    private String f;
    private String g;
    private AnalyticsConfiguration h;

    public Configuration()
    {
    }

    public static Configuration a(String s)
    {
        return (Configuration)(new Gson()).fromJson(s, com/braintreepayments/api/models/Configuration);
    }

    private boolean b(String s)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (b == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (b.length <= 0) goto _L2; else goto _L3
_L3:
        String as[];
        int k;
        int l;
        as = b;
        l = as.length;
        k = 0;
_L8:
        flag = flag1;
        if (k >= l) goto _L2; else goto _L4
_L4:
        if (!as[k].equals(s)) goto _L6; else goto _L5
_L5:
        flag = true;
_L2:
        return flag;
_L6:
        k++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final String a()
    {
        return a;
    }

    public final boolean b()
    {
        return b("cvv");
    }

    public final boolean c()
    {
        return b("postal_code");
    }

    public final boolean d()
    {
        return c && d != null;
    }

    public final PayPalConfiguration e()
    {
        return d;
    }

    public final AndroidPayConfiguration f()
    {
        if (e == null)
        {
            return new AndroidPayConfiguration();
        } else
        {
            return e;
        }
    }

    public final String g()
    {
        if (f == null)
        {
            return "off";
        } else
        {
            return f;
        }
    }

    public final String h()
    {
        return g;
    }

    public final boolean i()
    {
        return h != null && !TextUtils.isEmpty(h.a());
    }

    public final AnalyticsConfiguration j()
    {
        return h;
    }
}
