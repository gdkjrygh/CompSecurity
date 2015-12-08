// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Build;
import java.util.Locale;

// Referenced classes of package com.paypal.android.sdk:
//            c

public class av
{

    private static final String a = com/paypal/android/sdk/av.getSimpleName();
    private static String b = null;

    public av()
    {
    }

    public static String a(c c1)
    {
        if (b == null)
        {
            String s = Locale.getDefault().toString().replace("_", "-");
            b = (new StringBuilder("Mozilla/5.0 (Linux; U; Android ")).append(android.os.Build.VERSION.RELEASE).append("; ").append(s).append("; ").append(Build.MODEL).append(" ").append(Build.DISPLAY).append(") mpl/").append(c1.a()).toString();
            (new StringBuilder("UserAgent: ")).append(b);
        }
        return b;
    }

}
