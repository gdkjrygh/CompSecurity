// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Build;
import java.util.Locale;

// Referenced classes of package com.paypal.android.sdk:
//            gd, ef

public class al
{

    private static final String a = com/paypal/android/sdk/al.getSimpleName();
    private static String b = null;

    public al()
    {
    }

    public static String a(ef ef1)
    {
        if (b == null)
        {
            String s = Locale.getDefault().toString().replace("_", "-");
            StringBuilder stringbuilder = new StringBuilder("Mozilla/5.0 (Linux; U; ");
            new gd();
            b = stringbuilder.append((new StringBuilder("Android ")).append(android.os.Build.VERSION.RELEASE).toString()).append("; ").append(s).append("; ").append(Build.MODEL).append(" ").append(Build.DISPLAY).append(") mpl/").append(ef1.a()).toString();
            (new StringBuilder("UserAgent: ")).append(b);
        }
        return b;
    }

}
