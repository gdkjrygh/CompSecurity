// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.telephony.TelephonyManager;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            NativeGatherer, InfoGatherer

public class NetworkInfo
{

    private String a;
    private String b;
    private String c;

    public NetworkInfo(Context context)
    {
        a = null;
        b = null;
        c = null;
        String as[] = NativeGatherer.a().i();
        if (as != null && as.length >= 2)
        {
            b(as[0]);
            a(as[1]);
            c("wifi");
        } else
        {
            String as1[] = InfoGatherer.a(context);
            if (as1 != null)
            {
                b(as1[0]);
                a(as1[1]);
                c("wifi");
                return;
            }
            int i = ((TelephonyManager)context.getSystemService("phone")).getDataState();
            if (i == 2 || i == 1 || i == 3)
            {
                c("cellular");
                return;
            }
        }
    }

    String a()
    {
        return a;
    }

    void a(String s)
    {
        a = s;
    }

    String b()
    {
        return b;
    }

    void b(String s)
    {
        b = s;
    }

    String c()
    {
        return c;
    }

    void c(String s)
    {
        c = s;
    }
}
